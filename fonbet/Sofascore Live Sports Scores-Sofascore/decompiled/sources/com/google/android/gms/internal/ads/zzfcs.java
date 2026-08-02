package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ddb;
import defpackage.q7o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfcs implements zzfdi {
    public final zzcer a;
    public final zzhdi b;
    public final Context c;

    public zzfcs(zzcer zzcerVar, zzhdi zzhdiVar, Context context) {
        this.a = zzcerVar;
        this.b = zzhdiVar;
        this.c = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        return this.b.submit(new q7o(this, 1));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 34;
    }
}
