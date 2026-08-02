package com.google.android.gms.internal.ads;

import defpackage.ddb;
import defpackage.lrn;
import defpackage.slo;
import defpackage.spn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfhw implements zzfiu {
    public zzdcx a;

    @Override // com.google.android.gms.internal.ads.zzfiu
    public final /* bridge */ /* synthetic */ ddb a(zzfiv zzfivVar, zzfit zzfitVar) {
        return b(zzfivVar, zzfitVar, null);
    }

    public final ddb b(zzfiv zzfivVar, zzfit zzfitVar, zzdcx zzdcxVar) {
        zzdcw h = zzfitVar.h(zzfivVar.b);
        h.a(new zzfiy());
        zzdcx zzdcxVar2 = (zzdcx) h.zzh();
        this.a = zzdcxVar2;
        zzczp zza = zzdcxVar2.zza();
        zzfnu zzfnuVar = new zzfnu();
        zzhcq r = zzhcq.r(zza.b());
        spn spnVar = new spn(12, zzfnuVar, zza);
        slo sloVar = slo.a;
        return zzhcy.i(zzhcy.h(r, spnVar, sloVar), new lrn(zzfnuVar, 7), sloVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfiu
    public final /* synthetic */ Object zzd() {
        return this.a;
    }
}
