package io.ably.lib.transport;

import io.ably.lib.realtime.Presence;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.Param;
import io.ably.lib.types.ProtocolMessage;
import io.ably.lib.types.RecoveryKeyContext;
import io.ably.lib.util.AgentHeaderCreator;
import io.ably.lib.util.Log;
import io.ably.lib.util.PlatformAgentProvider;
import io.ably.lib.util.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes9.dex */
public interface ITransport {
    public static final String TAG = "io.ably.lib.transport.ITransport";

    public interface ConnectListener {
        void onTransportAvailable(ITransport iTransport);

        void onTransportUnavailable(ITransport iTransport, ErrorInfo errorInfo);
    }

    public interface Factory {
        ITransport getTransport(TransportParams transportParams, ConnectionManager connectionManager);
    }

    public enum Mode {
        clean,
        resume,
        recover
    }

    void close();

    void connect(ConnectListener connectListener);

    String getHost();

    String getURL();

    void receive(ProtocolMessage protocolMessage) throws AblyException;

    void send(ProtocolMessage protocolMessage) throws AblyException;

    public static class TransportParams {
        protected String connectionKey;
        protected boolean heartbeats = true;
        protected String host;
        protected Mode mode;
        protected ClientOptions options;
        private final PlatformAgentProvider platformAgentProvider;
        protected int port;

        public TransportParams(ClientOptions clientOptions, PlatformAgentProvider platformAgentProvider) {
            this.options = clientOptions;
            this.platformAgentProvider = platformAgentProvider;
        }

        public String getHost() {
            return this.host;
        }

        public int getPort() {
            return this.port;
        }

        public ClientOptions getClientOptions() {
            return this.options;
        }

        public Param[] getConnectParams(Param[] paramArr) {
            ArrayList arrayList = new ArrayList(Arrays.asList(paramArr));
            arrayList.add(new Param("v", Defaults.ABLY_PROTOCOL_VERSION));
            arrayList.add(new Param("format", this.options.useBinaryProtocol ? "msgpack" : "json"));
            if (!this.options.echoMessages) {
                arrayList.add(new Param("echo", "false"));
            }
            if (!StringUtils.isNullOrEmpty(this.connectionKey)) {
                this.mode = Mode.resume;
                arrayList.add(new Param("resume", this.connectionKey));
            } else if (!StringUtils.isNullOrEmpty(this.options.recover)) {
                this.mode = Mode.recover;
                RecoveryKeyContext decode = RecoveryKeyContext.decode(this.options.recover);
                if (decode != null) {
                    arrayList.add(new Param("recover", decode.getConnectionKey()));
                }
            }
            if (this.options.clientId != null) {
                arrayList.add(new Param(Presence.GET_CLIENTID, this.options.clientId));
            }
            if (!this.heartbeats) {
                arrayList.add(new Param("heartbeats", "false"));
            }
            if (this.options.transportParams != null) {
                arrayList.addAll(Arrays.asList(this.options.transportParams));
            }
            arrayList.add(new Param(Defaults.ABLY_AGENT_PARAM, AgentHeaderCreator.create(this.options.agents, this.platformAgentProvider)));
            Log.d(ITransport.TAG, "getConnectParams: params = " + arrayList);
            return (Param[]) arrayList.toArray(new Param[arrayList.size()]);
        }
    }
}
