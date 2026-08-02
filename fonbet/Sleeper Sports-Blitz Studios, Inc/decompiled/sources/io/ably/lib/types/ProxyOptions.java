package io.ably.lib.types;

import io.ably.lib.http.HttpAuth;

/* loaded from: classes9.dex */
public class ProxyOptions {
    public String host;
    public String[] nonProxyHosts;
    public String password;
    public int port;
    public HttpAuth.Type prefAuthType = HttpAuth.Type.BASIC;
    public String username;
}
