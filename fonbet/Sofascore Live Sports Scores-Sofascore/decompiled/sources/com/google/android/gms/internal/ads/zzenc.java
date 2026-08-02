package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzenc implements zzinw {
    public final zzinx a;
    public final zzinv b;
    public final zziof c;
    public final zzinv d;
    public final zzddg e;
    public final zziof f;
    public final zziof g;
    public final zzinv h;
    public final zziof i;

    public zzenc(zzcpa zzcpaVar, zzddg zzddgVar, zzinv zzinvVar, zzinv zzinvVar2, zzinv zzinvVar3, zzinv zzinvVar4, zzinv zzinvVar5, zzinv zzinvVar6, zzinx zzinxVar) {
        this.a = zzinxVar;
        this.b = zzinvVar;
        this.c = zzinvVar2;
        this.d = zzinvVar3;
        this.e = zzddgVar;
        this.f = zzcpaVar;
        this.g = zzinvVar4;
        this.h = zzinvVar5;
        this.i = zzinvVar6;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzcvr zzcvrVar = (zzcvr) this.a.a;
        return new zzenb(zzcvrVar, (Executor) this.c.zzb(), (zzdxg) this.d.zzb(), this.e.a(), ((zzcpa) this.f).a(), new zzbqk(), (zzelp) this.g.zzb(), (zzeae) this.h.zzb(), (zzeaj) this.i.zzb());
    }
}
