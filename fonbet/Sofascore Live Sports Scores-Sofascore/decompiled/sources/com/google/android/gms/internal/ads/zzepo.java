package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.nc3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzepo extends zzepq {
    public final zzcob a;
    public final zzdov b;
    public final zzdcy c;
    public final zzdjp d;
    public final zzeqb e;
    public final zzemv f;

    public zzepo(zzcob zzcobVar, zzdov zzdovVar, zzdcy zzdcyVar, zzdjp zzdjpVar, zzeqb zzeqbVar, zzemv zzemvVar) {
        this.a = zzcobVar;
        this.b = zzdovVar;
        this.c = zzdcyVar;
        this.d = zzdjpVar;
        this.e = zzeqbVar;
        this.f = zzemvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepq
    public final zzfpp c(zzflw zzflwVar, Bundle bundle, zzfld zzfldVar, zzflo zzfloVar) {
        zzdcy zzdcyVar = this.c;
        zzdcyVar.b = zzflwVar;
        zzdcyVar.c = bundle;
        zzdcyVar.e = new zzdcs(zzfloVar, zzfldVar, this.e);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.E4)).booleanValue()) {
            zzdcyVar.f = this.f;
        }
        nc3 k = this.a.k();
        k.e = new zzdcz(zzdcyVar);
        k.d = this.d;
        k.f = this.b;
        k.g = new zzcwa(null);
        zzczp a = k.zzh().a();
        return a.c(a.b());
    }
}
