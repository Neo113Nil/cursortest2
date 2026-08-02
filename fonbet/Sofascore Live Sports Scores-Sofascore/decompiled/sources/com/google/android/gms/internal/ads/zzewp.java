package com.google.android.gms.internal.ads;

import defpackage.ahn;
import defpackage.ddb;
import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzewp implements zzfdi {
    public final hsn a;
    public final zzcfv b;

    public zzewp(hsn hsnVar, zzcfv zzcfvVar) {
        this.a = hsnVar;
        this.b = zzcfvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.V3)).booleanValue() ? zzhcy.a(new zzewq(null)) : zzhcy.i(this.b.h(), ahn.l, this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 10;
    }
}
