package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.wun;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzepr extends zzepq {
    public final zzcob a;
    public final zzdcy b;
    public final zzdjp c;
    public final zzeqb d;
    public final zzemv e;

    public zzepr(zzcob zzcobVar, zzdcy zzdcyVar, zzdjp zzdjpVar, zzeqb zzeqbVar, zzemv zzemvVar) {
        this.a = zzcobVar;
        this.b = zzdcyVar;
        this.c = zzdjpVar;
        this.d = zzeqbVar;
        this.e = zzemvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepq
    public final zzfpp c(zzflw zzflwVar, Bundle bundle, zzfld zzfldVar, zzflo zzfloVar) {
        zzdcy zzdcyVar = this.b;
        zzdcyVar.b = zzflwVar;
        zzdcyVar.c = bundle;
        zzdcyVar.e = new zzdcs(zzfloVar, zzfldVar, this.d);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.E4)).booleanValue()) {
            zzdcyVar.f = this.e;
        }
        wun h = this.a.h();
        h.e = new zzdcz(zzdcyVar);
        h.d = this.c;
        zzczp zza = h.zzh().zza();
        return zza.c(zza.b());
    }
}
