package com.moloco.sdk.internal.services;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c {
    public final Context a;
    public final s b;

    public c(Context context, s sVar) {
        sVar.getClass();
        this.a = context;
        this.b = sVar;
    }

    public final f1 a() {
        NetworkCapabilities networkCapabilities;
        b bVar = b.a;
        Object systemService = this.a.getSystemService("connectivity");
        systemService.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        return (connectivityManager.getActiveNetwork() == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) == null) ? bVar : networkCapabilities.hasTransport(1) ? b.b : networkCapabilities.hasTransport(0) ? new a(this.b.a().g) : bVar;
    }
}
