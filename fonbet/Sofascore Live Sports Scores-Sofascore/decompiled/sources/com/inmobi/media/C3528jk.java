package com.inmobi.media;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.jk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3528jk extends ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        network.getClass();
        ConcurrentHashMap concurrentHashMap = AbstractC3554kk.a;
        super.onAvailable(network);
        ((Kc) AbstractC3424fj.e.getValue()).b(new N2(10, 4, "available"));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        ConcurrentHashMap concurrentHashMap = AbstractC3554kk.a;
        super.onLost(network);
        ((Kc) AbstractC3424fj.e.getValue()).b(new N2(10, 4, "lost"));
    }
}
