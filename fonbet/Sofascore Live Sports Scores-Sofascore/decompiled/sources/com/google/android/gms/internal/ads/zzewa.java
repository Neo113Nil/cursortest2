package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.b0a;
import defpackage.ddb;
import defpackage.inn;
import defpackage.v35;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzewa implements zzfdi {
    public final zzhdi a;
    public final zzdya b;
    public final zzecu c;
    public final zzewc d;

    public zzewa(zzhdi zzhdiVar, zzdya zzdyaVar, zzecu zzecuVar, zzewc zzewcVar) {
        this.a = zzhdiVar;
        this.b = zzdyaVar;
        this.c = zzecuVar;
        this.d = zzewcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        zzewb zzewbVar;
        inn innVar = zzbjg.od;
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue();
        zzewc zzewcVar = this.d;
        if (booleanValue && (zzewbVar = zzewcVar.b) != null) {
            return zzhcy.a(zzewbVar);
        }
        if (b0a.U((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.h2)) || (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue() && (zzewcVar.a.get() || !this.c.b))) {
            return zzhcy.a(new zzewb(new Bundle()));
        }
        zzewcVar.a.set(true);
        return this.a.submit(new v35(this, 16));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 1;
    }
}
