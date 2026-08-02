package io.ably.lib.realtime;

import io.ably.lib.objects.LiveObjectsPlugin;
import io.ably.lib.objects.ObjectsHelper;
import io.ably.lib.rest.AblyRest;
import io.ably.lib.rest.Auth;
import io.ably.lib.transport.ConnectionManager;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ChannelOptions;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.ProtocolMessage;
import io.ably.lib.types.ReadOnlyMap;
import io.ably.lib.types.RecoveryKeyContext;
import io.ably.lib.util.InternalMap;
import io.ably.lib.util.Log;
import io.ably.lib.util.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class AblyRealtime extends AblyRest {
    private static final String TAG = "io.ably.lib.realtime.AblyRealtime";
    public final Channels channels;
    public final Connection connection;
    private final LiveObjectsPlugin liveObjectsPlugin;

    public interface Channels extends ReadOnlyMap<String, Channel> {
        Channel get(String str);

        Channel get(String str, ChannelOptions channelOptions) throws AblyException;

        void release(String str);
    }

    public AblyRealtime(String str) throws AblyException {
        this(new ClientOptions(str));
    }

    public AblyRealtime(ClientOptions clientOptions) throws AblyException {
        super(clientOptions);
        RecoveryKeyContext decode;
        InternalChannels internalChannels = new InternalChannels();
        this.channels = internalChannels;
        LiveObjectsPlugin tryInitializeObjectsPlugin = ObjectsHelper.tryInitializeObjectsPlugin(this);
        this.liveObjectsPlugin = tryInitializeObjectsPlugin;
        Connection connection = new Connection(this, internalChannels, this.platformAgentProvider, tryInitializeObjectsPlugin);
        this.connection = connection;
        if (!StringUtils.isNullOrEmpty(clientOptions.recover) && (decode = RecoveryKeyContext.decode(clientOptions.recover)) != null) {
            setChannelSerialsFromRecoverOption(decode.getChannelSerials());
            connection.connectionManager.msgSerial = decode.getMsgSerial();
        }
        if (clientOptions.autoConnect) {
            connection.connect();
        }
    }

    @Override // io.ably.lib.rest.AblyBase
    public void connect() {
        super.connect();
        this.connection.connect();
    }

    @Override // io.ably.lib.rest.AblyBase, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (Exception e) {
            Log.e(TAG, "There was an exception releasing client instance base resources.", e);
        }
        this.connection.close();
        LiveObjectsPlugin liveObjectsPlugin = this.liveObjectsPlugin;
        if (liveObjectsPlugin != null) {
            liveObjectsPlugin.dispose();
        }
    }

    @Override // io.ably.lib.rest.AblyBase
    protected void onAuthUpdated(String str, boolean z) throws AblyException {
        this.connection.connectionManager.onAuthUpdated(str, z);
    }

    @Override // io.ably.lib.rest.AblyBase
    protected void onAuthUpdatedAsync(String str, Auth.AuthUpdateResult authUpdateResult) {
        this.connection.connectionManager.onAuthUpdatedAsync(str, authUpdateResult);
    }

    @Override // io.ably.lib.rest.AblyBase
    protected void onAuthError(ErrorInfo errorInfo) {
        this.connection.connectionManager.onAuthError(errorInfo);
    }

    private class InternalChannels extends InternalMap<String, Channel> implements Channels, ConnectionManager.Channels {
        private InternalChannels() {
        }

        @Override // io.ably.lib.realtime.AblyRealtime.Channels
        public Channel get(String str) {
            try {
                return get(str, null);
            } catch (AblyException unused) {
                return null;
            }
        }

        @Override // io.ably.lib.realtime.AblyRealtime.Channels
        public Channel get(String str, ChannelOptions channelOptions) throws AblyException {
            AblyRealtime ablyRealtime = AblyRealtime.this;
            Channel channel = new Channel(ablyRealtime, str, channelOptions, ablyRealtime.liveObjectsPlugin);
            Channel channel2 = (Channel) this.map.putIfAbsent(str, channel);
            if (channel2 == null) {
                return channel;
            }
            if (channelOptions == null) {
                return channel2;
            }
            if (channel2.shouldReattachToSetOptions(channelOptions)) {
                throw AblyException.fromErrorInfo(new ErrorInfo("Channels.get() cannot be used to set channel options that would cause the channel to reattach. Please, use Channel.setOptions() instead.", 40000, 400));
            }
            channel2.setOptions(channelOptions);
            return channel2;
        }

        @Override // io.ably.lib.realtime.AblyRealtime.Channels
        public void release(String str) {
            Channel channel = (Channel) this.map.remove(str);
            if (channel != null) {
                channel.markAsReleased();
                try {
                    channel.detach();
                } catch (AblyException e) {
                    Log.e(AblyRealtime.TAG, "Unexpected exception detaching channel; channelName = " + str, e);
                }
            }
            if (AblyRealtime.this.liveObjectsPlugin != null) {
                AblyRealtime.this.liveObjectsPlugin.dispose(str);
            }
        }

        @Override // io.ably.lib.transport.ConnectionManager.Channels
        public void onMessage(ProtocolMessage protocolMessage) {
            Channel channel;
            String str = protocolMessage.channel;
            synchronized (this) {
                channel = AblyRealtime.this.channels.containsKey(str) ? AblyRealtime.this.channels.get(str) : null;
            }
            if (channel == null) {
                Log.e(AblyRealtime.TAG, "Received channel message for non-existent channel");
            } else {
                channel.onChannelMessage(protocolMessage);
            }
        }

        @Override // io.ably.lib.transport.ConnectionManager.Channels
        public void suspendAll(ErrorInfo errorInfo, boolean z) {
            Iterator it = this.map.values().iterator();
            while (it.hasNext()) {
                ((Channel) it.next()).setSuspended(errorInfo, z);
            }
        }

        @Override // io.ably.lib.transport.ConnectionManager.Channels
        public void transferToChannelQueue(List<ConnectionManager.QueuedMessage> list) {
            HashMap hashMap = new HashMap();
            for (ConnectionManager.QueuedMessage queuedMessage : list) {
                String str = queuedMessage.msg.channel;
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, new ArrayList());
                }
                ((List) hashMap.get(str)).add(queuedMessage);
            }
            for (Channel channel : this.map.values()) {
                if (channel.state.isReattachable()) {
                    Log.d(AblyRealtime.TAG, "reAttach(); channel = " + channel.name);
                    channel.transferQueuedPresenceMessages((List) hashMap.get(channel.name));
                }
            }
        }

        private void clear() {
            this.map.clear();
        }
    }

    protected void setChannelSerialsFromRecoverOption(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Channel channel = this.channels.get(key);
            if (channel != null) {
                channel.properties.channelSerial = value;
            }
        }
    }

    protected Map<String, String> getChannelSerials() {
        HashMap hashMap = new HashMap();
        for (Channel channel : this.channels.values()) {
            if (channel.state == ChannelState.attached) {
                hashMap.put(channel.name, channel.properties.channelSerial);
            }
        }
        return hashMap;
    }
}
