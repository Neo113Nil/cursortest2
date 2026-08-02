package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import defpackage.c40;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzept extends zzepq {
    public final zzcob a;
    public final zzdcy b;
    public final zzesg c;
    public final zzdjp d;
    public final zzdov e;
    public final zzdgq f;
    public final ViewGroup g;
    public final zzdiv h;
    public final zzeqb i;
    public final zzemv j;

    public zzept(zzcob zzcobVar, zzdcy zzdcyVar, zzesg zzesgVar, zzdjp zzdjpVar, zzdov zzdovVar, zzdgq zzdgqVar, ViewGroup viewGroup, zzdiv zzdivVar, zzeqb zzeqbVar, zzemv zzemvVar) {
        this.a = zzcobVar;
        this.b = zzdcyVar;
        this.c = zzesgVar;
        this.d = zzdjpVar;
        this.e = zzdovVar;
        this.f = zzdgqVar;
        this.g = viewGroup;
        this.h = zzdivVar;
        this.i = zzeqbVar;
        this.j = zzemvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepq
    public final zzfpp c(zzflw zzflwVar, Bundle bundle, zzfld zzfldVar, zzflo zzfloVar) {
        zzdcy zzdcyVar = this.b;
        zzdcyVar.b = zzflwVar;
        zzdcyVar.c = bundle;
        zzdcyVar.e = new zzdcs(zzfloVar, zzfldVar, this.i);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.E4)).booleanValue()) {
            zzdcyVar.f = this.j;
        }
        c40 g = this.a.g();
        g.f = new zzdcz(zzdcyVar);
        g.e = this.d;
        g.g = this.c;
        g.k = this.e;
        g.h = new zzcyd(this.f, this.h);
        g.j = new zzcwa(this.g);
        zzczp b = g.zzh().b();
        return b.c(b.b());
    }
}
