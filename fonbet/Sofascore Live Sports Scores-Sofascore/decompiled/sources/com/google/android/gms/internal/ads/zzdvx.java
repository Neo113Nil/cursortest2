package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdvx implements zzinw {
    public final zzcok a;
    public final zzinv b;
    public final zzinv c;
    public final zzcpa d;
    public final zzinv e;
    public final zzinv f;
    public final zzinv g;
    public final zzinv h;
    public final zzinv i;
    public final zziof j;

    public zzdvx(zzcok zzcokVar, zzinv zzinvVar, zzinv zzinvVar2, zzcpa zzcpaVar, zzcqy zzcqyVar, zzinv zzinvVar3, zzinv zzinvVar4, zzinv zzinvVar5, zzinv zzinvVar6, zzinv zzinvVar7, zziof zziofVar) {
        this.a = zzcokVar;
        this.b = zzinvVar;
        this.c = zzinvVar2;
        this.d = zzcpaVar;
        this.e = zzinvVar3;
        this.f = zzinvVar4;
        this.g = zzinvVar5;
        this.h = zzinvVar6;
        this.i = zzinvVar7;
        this.j = zziofVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Context a = this.a.a();
        Executor executor = (Executor) this.b.zzb();
        zzbbd zzbbdVar = (zzbbd) this.c.zzb();
        VersionInfoParcel a2 = this.d.a();
        com.google.android.gms.ads.internal.zza a3 = zzcqy.a();
        new zzcmc();
        return new zzdvt(a, executor, zzbbdVar, a2, a3, (zzele) this.e.zzb(), (zzfte) this.f.zzb(), (zzeaj) this.g.zzb(), (zzelp) this.h.zzb(), (zzfma) this.i.zzb(), (zzdcg) this.j.zzb());
    }
}
