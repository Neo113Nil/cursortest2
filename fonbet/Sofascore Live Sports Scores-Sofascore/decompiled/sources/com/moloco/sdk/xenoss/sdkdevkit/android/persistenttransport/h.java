package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import defpackage.ad2;
import defpackage.anc;
import defpackage.mj5;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.up3;
import defpackage.vh9;
import defpackage.xw3;
import defpackage.z45;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class h implements e {
    public final vh9 a;
    public final ad2 b;

    public h(vh9 vh9Var) {
        vh9Var.getClass();
        this.a = vh9Var;
        this.b = s9a.c(z45.a);
    }

    public static boolean b(Context context) {
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && (networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e
    public final void a(String str, byte[] bArr, up3 up3Var, String str2) {
        str.getClass();
        bArr.getClass();
        up3Var.getClass();
        xw3.L(this.b, null, null, new mj5(this, str, bArr, up3Var, (rq3) null), 3);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e
    public final void a(String str) {
        xw3.L(this.b, null, null, new anc(this, str, (rq3) null), 3);
    }
}
