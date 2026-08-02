package com.google.android.gms.internal.ads;

import defpackage.ddb;
import defpackage.v35;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfax implements zzfdi {
    public final zzhdi a;
    public final zzedp b;

    public zzfax(zzhdi zzhdiVar, zzedp zzedpVar) {
        this.a = zzhdiVar;
        this.b = zzedpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        return this.a.submit(new v35(this, 27));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 23;
    }
}
