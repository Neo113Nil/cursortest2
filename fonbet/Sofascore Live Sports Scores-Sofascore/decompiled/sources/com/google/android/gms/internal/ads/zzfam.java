package com.google.android.gms.internal.ads;

import defpackage.ddb;
import defpackage.v35;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfam implements zzfdi {
    public final zzhdi a;
    public final zzflw b;

    public zzfam(zzhdi zzhdiVar, zzflw zzflwVar) {
        this.a = zzhdiVar;
        this.b = zzflwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        return this.a.submit(new v35(this, 25));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 21;
    }
}
