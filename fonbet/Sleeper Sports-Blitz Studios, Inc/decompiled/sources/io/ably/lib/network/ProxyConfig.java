package io.ably.lib.network;

import java.util.List;

/* loaded from: classes9.dex */
public class ProxyConfig {
    private ProxyAuthType authType;
    private String host;
    private List<String> nonProxyHosts;
    private String password;
    private int port;
    private String username;

    protected boolean canEqual(Object obj) {
        return obj instanceof ProxyConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProxyConfig)) {
            return false;
        }
        ProxyConfig proxyConfig = (ProxyConfig) obj;
        if (!proxyConfig.canEqual(this) || getPort() != proxyConfig.getPort()) {
            return false;
        }
        String host = getHost();
        String host2 = proxyConfig.getHost();
        if (host != null ? !host.equals(host2) : host2 != null) {
            return false;
        }
        String username = getUsername();
        String username2 = proxyConfig.getUsername();
        if (username != null ? !username.equals(username2) : username2 != null) {
            return false;
        }
        String password = getPassword();
        String password2 = proxyConfig.getPassword();
        if (password != null ? !password.equals(password2) : password2 != null) {
            return false;
        }
        List<String> nonProxyHosts = getNonProxyHosts();
        List<String> nonProxyHosts2 = proxyConfig.getNonProxyHosts();
        if (nonProxyHosts != null ? !nonProxyHosts.equals(nonProxyHosts2) : nonProxyHosts2 != null) {
            return false;
        }
        ProxyAuthType authType = getAuthType();
        ProxyAuthType authType2 = proxyConfig.getAuthType();
        return authType != null ? authType.equals(authType2) : authType2 == null;
    }

    public int hashCode() {
        int port = getPort() + 59;
        String host = getHost();
        int hashCode = (port * 59) + (host == null ? 43 : host.hashCode());
        String username = getUsername();
        int hashCode2 = (hashCode * 59) + (username == null ? 43 : username.hashCode());
        String password = getPassword();
        int hashCode3 = (hashCode2 * 59) + (password == null ? 43 : password.hashCode());
        List<String> nonProxyHosts = getNonProxyHosts();
        int hashCode4 = (hashCode3 * 59) + (nonProxyHosts == null ? 43 : nonProxyHosts.hashCode());
        ProxyAuthType authType = getAuthType();
        return (hashCode4 * 59) + (authType != null ? authType.hashCode() : 43);
    }

    public String toString() {
        return "ProxyConfig(host=" + getHost() + ", port=" + getPort() + ", username=" + getUsername() + ", password=" + getPassword() + ", nonProxyHosts=" + getNonProxyHosts() + ", authType=" + getAuthType() + ")";
    }

    public static class ProxyConfigBuilder {
        private ProxyAuthType authType;
        private String host;
        private List<String> nonProxyHosts;
        private String password;
        private int port;
        private String username;

        ProxyConfigBuilder() {
        }

        public ProxyConfigBuilder authType(ProxyAuthType proxyAuthType) {
            this.authType = proxyAuthType;
            return this;
        }

        public ProxyConfig build() {
            return new ProxyConfig(this.host, this.port, this.username, this.password, this.nonProxyHosts, this.authType);
        }

        public ProxyConfigBuilder host(String str) {
            this.host = str;
            return this;
        }

        public ProxyConfigBuilder nonProxyHosts(List<String> list) {
            this.nonProxyHosts = list;
            return this;
        }

        public ProxyConfigBuilder password(String str) {
            this.password = str;
            return this;
        }

        public ProxyConfigBuilder port(int i) {
            this.port = i;
            return this;
        }

        public String toString() {
            return "ProxyConfig.ProxyConfigBuilder(host=" + this.host + ", port=" + this.port + ", username=" + this.username + ", password=" + this.password + ", nonProxyHosts=" + this.nonProxyHosts + ", authType=" + this.authType + ")";
        }

        public ProxyConfigBuilder username(String str) {
            this.username = str;
            return this;
        }
    }

    public static ProxyConfigBuilder builder() {
        return new ProxyConfigBuilder();
    }

    public ProxyConfig(String str, int i, String str2, String str3, List<String> list, ProxyAuthType proxyAuthType) {
        this.host = str;
        this.port = i;
        this.username = str2;
        this.password = str3;
        this.nonProxyHosts = list;
        this.authType = proxyAuthType;
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        return this.port;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public List<String> getNonProxyHosts() {
        return this.nonProxyHosts;
    }

    public ProxyAuthType getAuthType() {
        return this.authType;
    }
}
