package io.ably.lib.network;

import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes9.dex */
public class WebSocketEngineConfig {
    private final String host;
    private final ProxyConfig proxy;
    private final SSLSocketFactory sslSocketFactory;
    private final boolean tls;

    protected boolean canEqual(Object obj) {
        return obj instanceof WebSocketEngineConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WebSocketEngineConfig)) {
            return false;
        }
        WebSocketEngineConfig webSocketEngineConfig = (WebSocketEngineConfig) obj;
        if (!webSocketEngineConfig.canEqual(this) || isTls() != webSocketEngineConfig.isTls()) {
            return false;
        }
        ProxyConfig proxy = getProxy();
        ProxyConfig proxy2 = webSocketEngineConfig.getProxy();
        if (proxy != null ? !proxy.equals(proxy2) : proxy2 != null) {
            return false;
        }
        String host = getHost();
        String host2 = webSocketEngineConfig.getHost();
        if (host != null ? !host.equals(host2) : host2 != null) {
            return false;
        }
        SSLSocketFactory sslSocketFactory = getSslSocketFactory();
        SSLSocketFactory sslSocketFactory2 = webSocketEngineConfig.getSslSocketFactory();
        return sslSocketFactory != null ? sslSocketFactory.equals(sslSocketFactory2) : sslSocketFactory2 == null;
    }

    public int hashCode() {
        int i = isTls() ? 79 : 97;
        ProxyConfig proxy = getProxy();
        int hashCode = ((i + 59) * 59) + (proxy == null ? 43 : proxy.hashCode());
        String host = getHost();
        int hashCode2 = (hashCode * 59) + (host == null ? 43 : host.hashCode());
        SSLSocketFactory sslSocketFactory = getSslSocketFactory();
        return (hashCode2 * 59) + (sslSocketFactory != null ? sslSocketFactory.hashCode() : 43);
    }

    public String toString() {
        return "WebSocketEngineConfig(proxy=" + getProxy() + ", tls=" + isTls() + ", host=" + getHost() + ", sslSocketFactory=" + getSslSocketFactory() + ")";
    }

    public static class WebSocketEngineConfigBuilder {
        private String host;
        private ProxyConfig proxy;
        private SSLSocketFactory sslSocketFactory;
        private boolean tls;

        WebSocketEngineConfigBuilder() {
        }

        public WebSocketEngineConfig build() {
            return new WebSocketEngineConfig(this.proxy, this.tls, this.host, this.sslSocketFactory);
        }

        public WebSocketEngineConfigBuilder host(String str) {
            this.host = str;
            return this;
        }

        public WebSocketEngineConfigBuilder proxy(ProxyConfig proxyConfig) {
            this.proxy = proxyConfig;
            return this;
        }

        public WebSocketEngineConfigBuilder sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactory = sSLSocketFactory;
            return this;
        }

        public WebSocketEngineConfigBuilder tls(boolean z) {
            this.tls = z;
            return this;
        }

        public String toString() {
            return "WebSocketEngineConfig.WebSocketEngineConfigBuilder(proxy=" + this.proxy + ", tls=" + this.tls + ", host=" + this.host + ", sslSocketFactory=" + this.sslSocketFactory + ")";
        }
    }

    public static WebSocketEngineConfigBuilder builder() {
        return new WebSocketEngineConfigBuilder();
    }

    public WebSocketEngineConfig(ProxyConfig proxyConfig, boolean z, String str, SSLSocketFactory sSLSocketFactory) {
        this.proxy = proxyConfig;
        this.tls = z;
        this.host = str;
        this.sslSocketFactory = sSLSocketFactory;
    }

    public ProxyConfig getProxy() {
        return this.proxy;
    }

    public boolean isTls() {
        return this.tls;
    }

    public String getHost() {
        return this.host;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }
}
