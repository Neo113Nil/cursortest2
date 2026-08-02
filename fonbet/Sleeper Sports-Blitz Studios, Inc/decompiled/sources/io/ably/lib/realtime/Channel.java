package io.ably.lib.realtime;

import io.ably.lib.objects.LiveObjectsPlugin;
import io.ably.lib.push.PushChannel;
import io.ably.lib.realtime.ChannelBase;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ChannelOptions;

/* loaded from: classes9.dex */
public class Channel extends ChannelBase {
    public final PushChannel push;

    public interface MessageListener extends ChannelBase.MessageListener {
    }

    Channel(AblyRealtime ablyRealtime, String str, ChannelOptions channelOptions, LiveObjectsPlugin liveObjectsPlugin) throws AblyException {
        super(ablyRealtime, str, channelOptions, liveObjectsPlugin);
        this.push = ablyRealtime.channels.get(str, channelOptions).push;
    }
}
