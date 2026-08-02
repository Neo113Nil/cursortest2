package com.google.android.gms.internal.ads;

import defpackage.ddb;
import defpackage.q7o;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzffh implements zzfdi {
    public final zzhdi a;
    public final List b;

    public zzffh(zzhdi zzhdiVar, List list) {
        this.a = zzhdiVar;
        this.b = list;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        return this.a.submit(new q7o(this, 8));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 48;
    }
}
