package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ddb;
import defpackage.v35;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfab implements zzfdi {
    public final Context a;
    public final zzhdi b;

    public zzfab(Context context, zzhdi zzhdiVar) {
        this.a = context;
        this.b = zzhdiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        return this.b.submit(new v35(this, 23));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 18;
    }
}
