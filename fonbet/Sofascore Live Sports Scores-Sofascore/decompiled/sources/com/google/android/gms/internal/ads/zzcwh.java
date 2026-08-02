package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import defpackage.bxn;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcwh implements zzinw {
    public final zzdas a;
    public final zziof b;
    public final zzcwn c;
    public final zzcwm d;
    public final zzcxb e;
    public final zzcwo f;
    public final zziof g;
    public final zzinv h;
    public final zzinu i;
    public final zziof j;

    public zzcwh(zzdas zzdasVar, zzinv zzinvVar, zzcwn zzcwnVar, zzcwm zzcwmVar, zzcxb zzcxbVar, zzcwo zzcwoVar, zzdoy zzdoyVar, zzinv zzinvVar2, zzinu zzinuVar, zzinv zzinvVar3) {
        this.a = zzdasVar;
        this.b = zzinvVar;
        this.c = zzcwnVar;
        this.d = zzcwmVar;
        this.e = zzcxbVar;
        this.f = zzcwoVar;
        this.g = zzdoyVar;
        this.h = zzinvVar2;
        this.i = zzinuVar;
        this.j = zzinvVar3;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bxn zzb() {
        zzcyk zzb = this.a.zzb();
        Context context = (Context) this.b.zzb();
        zzfle zzfleVar = this.c.a.c;
        zzioe.a(zzfleVar);
        View view = this.d.a.b;
        zzioe.a(view);
        zzclm zzclmVar = this.e.a.d;
        zzcyj zzcyjVar = this.f.a.a;
        zzdrb zzdrbVar = ((zzdoy) this.g).a.a;
        zzioe.a(zzdrbVar);
        return new bxn(zzb, context, zzfleVar, view, zzclmVar, zzcyjVar, zzdrbVar, (zzdly) this.h.zzb(), zzinv.b(this.i), (Executor) this.j.zzb());
    }
}
