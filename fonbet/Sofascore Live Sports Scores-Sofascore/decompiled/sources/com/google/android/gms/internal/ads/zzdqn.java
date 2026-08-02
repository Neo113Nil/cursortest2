package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdqn implements zzinw {
    public final zzdas a;
    public final zziof b;
    public final zzdrj c;
    public final zzinw d;
    public final zzdrr e;
    public final zziof f;
    public final zziof g;
    public final zzinv h;
    public final zzinv i;
    public final zzinv j;
    public final zzinv k;
    public final zzinv l;
    public final zzdrh m;
    public final zziof n;
    public final zziof o;
    public final zziof p;
    public final zzinv q;
    public final zzinv r;
    public final zziof s;

    public zzdqn(zzdas zzdasVar, zzinv zzinvVar, zzdrj zzdrjVar, zzinw zzinwVar, zzdrr zzdrrVar, zziof zziofVar, zzdoy zzdoyVar, zzinv zzinvVar2, zzinv zzinvVar3, zzinv zzinvVar4, zzinv zzinvVar5, zzinv zzinvVar6, zzdrh zzdrhVar, zzinv zzinvVar7, zzcpa zzcpaVar, zzcok zzcokVar, zzinv zzinvVar8, zzinv zzinvVar9, zzinv zzinvVar10) {
        this.a = zzdasVar;
        this.b = zzinvVar;
        this.c = zzdrjVar;
        this.d = zzinwVar;
        this.e = zzdrrVar;
        this.f = zziofVar;
        this.g = zzdoyVar;
        this.h = zzinvVar2;
        this.i = zzinvVar3;
        this.j = zzinvVar4;
        this.k = zzinvVar5;
        this.l = zzinvVar6;
        this.m = zzdrhVar;
        this.n = zzinvVar7;
        this.o = zzcpaVar;
        this.p = zzcokVar;
        this.q = zzinvVar8;
        this.r = zzinvVar9;
        this.s = zzinvVar10;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzcyk zzb = this.a.zzb();
        Executor executor = (Executor) this.b.zzb();
        zzdqr a = this.c.a();
        zzdqz zzdqzVar = (zzdqz) this.d.zzb();
        zzdrq zzb2 = this.e.zzb();
        zzdqw zzdqwVar = (zzdqw) this.f.zzb();
        zzdrb zzdrbVar = ((zzdoy) this.g).a.a;
        zzioe.a(zzdrbVar);
        zzinq b = zzinv.b(this.h);
        zzinq b2 = zzinv.b(this.i);
        zzinq b3 = zzinv.b(this.j);
        zzinq b4 = zzinv.b(this.k);
        zzinq b5 = zzinv.b(this.l);
        zzdrh zzdrhVar = this.m;
        zzceo zzceoVar = new zzceo(((zzcok) zzdrhVar.a).a(), ((zzddg) zzdrhVar.b).a().g);
        zzbbd zzbbdVar = (zzbbd) this.n.zzb();
        VersionInfoParcel a2 = ((zzcpa) this.o).a();
        Context a3 = ((zzcok) this.p).a();
        zzdqo zzdqoVar = (zzdqo) this.q.zzb();
        zzeud zzeudVar = (zzeud) this.r.zzb();
        return new zzdqm(zzb, executor, a, zzdqzVar, zzb2, zzdqwVar, zzdrbVar, b, b2, b3, b4, b5, zzceoVar, zzbbdVar, a2, a3, zzdqoVar, zzeudVar);
    }
}
