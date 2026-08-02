package com.google.android.gms.internal.ads;

import defpackage.ahn;
import defpackage.cpn;
import defpackage.ddb;
import defpackage.hsn;
import defpackage.xlo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfen implements zzfdi {
    public final hsn a;
    public final String b;

    public zzfen(hsn hsnVar, String str) {
        this.a = hsnVar;
        this.b = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        xlo a = zzhcy.a(this.b);
        ahn ahnVar = ahn.n;
        hsn hsnVar = this.a;
        return zzhcy.f(zzhcy.i(a, ahnVar, hsnVar), Throwable.class, new cpn(this, 10), hsnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 41;
    }
}
