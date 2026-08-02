package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.ox9;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzebw {
    public final zzbri a;

    public zzebw(zzbri zzbriVar) {
        this.a = zzbriVar;
    }

    public final void a(long j) {
        ox9 ox9Var = new ox9("creation");
        ox9Var.b = Long.valueOf(j);
        ox9Var.d = "nativeObjectNotCreated";
        b(ox9Var);
    }

    public final void b(ox9 ox9Var) {
        String u = ox9Var.u();
        String concat = "Dispatching AFMA event on publisher webview: ".concat(u);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzh(concat);
        this.a.zza(u);
    }
}
