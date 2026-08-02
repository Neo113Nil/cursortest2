package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.ivn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzepx extends zzepq {
    public final zzcob a;
    public final zzdcy b;
    public final zzdjp c;
    public final zzeqb d;
    public final zzflp e;
    public final zzemv f;

    public zzepx(zzcob zzcobVar, zzdcy zzdcyVar, zzdjp zzdjpVar, zzflp zzflpVar, zzeqb zzeqbVar, zzemv zzemvVar) {
        this.a = zzcobVar;
        this.b = zzdcyVar;
        this.c = zzdjpVar;
        this.e = zzflpVar;
        this.d = zzeqbVar;
        this.f = zzemvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepq
    public final zzfpp c(zzflw zzflwVar, Bundle bundle, zzfld zzfldVar, zzflo zzfloVar) {
        zzflp zzflpVar;
        zzdcy zzdcyVar = this.b;
        zzdcyVar.b = zzflwVar;
        zzdcyVar.c = bundle;
        zzdcyVar.e = new zzdcs(zzfloVar, zzfldVar, this.d);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.D4)).booleanValue() && (zzflpVar = this.e) != null) {
            zzdcyVar.d = zzflpVar;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.E4)).booleanValue()) {
            zzdcyVar.f = this.f;
        }
        ivn l = this.a.l();
        l.e = new zzdcz(zzdcyVar);
        l.d = this.c;
        zzczp zza = l.zzh().zza();
        return zza.c(zza.b());
    }
}
