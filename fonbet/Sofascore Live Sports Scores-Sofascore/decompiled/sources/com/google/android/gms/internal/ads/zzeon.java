package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeon implements zzinw {
    public final zzinv a;
    public final zziof b;
    public final zzddg c;
    public final zziof d;
    public final zzinx e;
    public final zzinv f;
    public final zziof g;
    public final zzinv h;
    public final zziof i;

    public zzeon(zzcpa zzcpaVar, zzddg zzddgVar, zzinv zzinvVar, zzinv zzinvVar2, zzinv zzinvVar3, zzinv zzinvVar4, zzinv zzinvVar5, zzinv zzinvVar6, zzinx zzinxVar) {
        this.a = zzinvVar;
        this.b = zzcpaVar;
        this.c = zzddgVar;
        this.d = zzinvVar2;
        this.e = zzinxVar;
        this.f = zzinvVar3;
        this.g = zzinvVar4;
        this.h = zzinvVar5;
        this.i = zzinvVar6;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        return new zzeom((Context) this.a.zzb(), ((zzcpa) this.b).a(), this.c.a(), (Executor) this.d.zzb(), (zzdoe) this.e.a, (zzdxg) this.f.zzb(), new zzbqk(), (zzelp) this.g.zzb(), (zzeae) this.h.zzb(), (zzeaj) this.i.zzb());
    }
}
