package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.vng;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzepv extends zzepq {
    public final zzcob a;
    public final zzdcy b;
    public final zzesg c;
    public final zzdjp d;
    public final zzeqb e;
    public final zzemv f;

    public zzepv(zzcob zzcobVar, zzdcy zzdcyVar, zzesg zzesgVar, zzdjp zzdjpVar, zzeqb zzeqbVar, zzemv zzemvVar) {
        this.a = zzcobVar;
        this.b = zzdcyVar;
        this.c = zzesgVar;
        this.d = zzdjpVar;
        this.e = zzeqbVar;
        this.f = zzemvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepq
    public final zzfpp c(zzflw zzflwVar, Bundle bundle, zzfld zzfldVar, zzflo zzfloVar) {
        zzdcy zzdcyVar = this.b;
        zzdcyVar.b = zzflwVar;
        zzdcyVar.c = bundle;
        zzdcyVar.e = new zzdcs(zzfloVar, zzfldVar, this.e);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.E4)).booleanValue()) {
            zzdcyVar.f = this.f;
        }
        vng i = this.a.i();
        i.e = new zzdcz(zzdcyVar);
        i.d = this.d;
        i.f = this.c;
        zzczp b = i.zzh().b();
        return b.c(b.b());
    }
}
