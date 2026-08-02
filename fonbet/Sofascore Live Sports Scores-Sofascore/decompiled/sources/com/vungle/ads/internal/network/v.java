package com.vungle.ads.internal.network;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class v extends ProxySelector {
    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        try {
            ProxySelector.getDefault().connectFailed(uri, socketAddress, iOException);
        } catch (Exception unused) {
        }
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        try {
            List<Proxy> select = ProxySelector.getDefault().select(uri);
            select.getClass();
            return select;
        } catch (Exception unused) {
            return kotlin.collections.a.c(Proxy.NO_PROXY);
        }
    }
}
