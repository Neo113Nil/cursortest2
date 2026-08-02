package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.c40;
import defpackage.inn;
import defpackage.nkn;
import defpackage.qpn;
import defpackage.vlo;
import defpackage.x3o;
import defpackage.zun;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfhq implements zzeuq {
    public final Context a;
    public final Executor b;
    public final zzcob c;
    public final zzeua d;
    public final zzeue e;
    public final FrameLayout f;
    public zzbkb g;
    public final zzdgq h;
    public final zzfrj i;
    public final zzdiv j;
    public final zzflv k;
    public zzfpp l;
    public boolean m;
    public com.google.android.gms.ads.internal.client.zze n;
    public zzeup o;

    public zzfhq(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzr zzrVar, zzcob zzcobVar, zzeua zzeuaVar, zzeue zzeueVar, zzflv zzflvVar, zzdiv zzdivVar) {
        this.a = context;
        this.b = executor;
        this.c = zzcobVar;
        this.d = zzeuaVar;
        this.e = zzeueVar;
        this.k = zzflvVar;
        this.h = zzcobVar.f();
        this.i = zzcobVar.r();
        this.f = new FrameLayout(context);
        this.j = zzdivVar;
        zzflvVar.b = zzrVar;
        this.m = true;
        this.n = null;
        this.o = null;
    }

    public final boolean a(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzeuo zzeuoVar, zzeup zzeupVar) {
        boolean z;
        zun zzh;
        Executor executor = this.b;
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("Ad unit ID should not be null for banner ad.");
            executor.execute(new x3o(this, 9));
            return false;
        }
        boolean b = b();
        zzflv zzflvVar = this.k;
        if (!b) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n3)).booleanValue()) {
                com.google.android.gms.ads.internal.client.zzay.zzc();
            }
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.va)).booleanValue();
            zzcob zzcobVar = this.c;
            if (booleanValue && zzmVar.zzf) {
                zzcobVar.q().b(true);
            }
            Bundle a = zzdzu.a(new Pair("api-call", Long.valueOf(zzmVar.zzz)), new Pair("dynamite-enter", Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().a())));
            zzflvVar.c = str;
            zzflvVar.a = zzmVar;
            zzflvVar.t = a;
            zzflw a2 = zzflvVar.a();
            int b2 = zzfrf.b(a2);
            Context context = this.a;
            zzfqw c = zzfqw.c(context, b2, 3, zzmVar);
            boolean booleanValue2 = ((Boolean) zzbln.f.c()).booleanValue();
            zzeua zzeuaVar = this.d;
            zzfrg zzfrgVar = null;
            if (!booleanValue2 || !zzflvVar.b.zzk) {
                boolean booleanValue3 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.A9)).booleanValue();
                FrameLayout frameLayout = this.f;
                zzdiv zzdivVar = this.j;
                zzdgq zzdgqVar = this.h;
                if (booleanValue3) {
                    c40 g = zzcobVar.g();
                    zzdcy zzdcyVar = new zzdcy();
                    zzdcyVar.a = context;
                    zzdcyVar.b = a2;
                    g.f = new zzdcz(zzdcyVar);
                    zzdjo zzdjoVar = new zzdjo();
                    zzdjoVar.d(zzeuaVar, executor);
                    zzdjoVar.b(zzeuaVar, executor);
                    g.e = new zzdjp(zzdjoVar);
                    g.g = new zzesg(this.g);
                    g.k = new zzdov(zzdrb.h, null);
                    g.h = new zzcyd(zzdgqVar, zzdivVar);
                    g.j = new zzcwa(frameLayout);
                    zzh = g.zzh();
                    z = true;
                } else {
                    c40 g2 = zzcobVar.g();
                    zzdcy zzdcyVar2 = new zzdcy();
                    zzdcyVar2.a = context;
                    zzdcyVar2.b = a2;
                    g2.f = new zzdcz(zzdcyVar2);
                    zzdjo zzdjoVar2 = new zzdjo();
                    zzdjoVar2.d(zzeuaVar, executor);
                    zzdlo zzdloVar = new zzdlo(zzeuaVar, executor);
                    HashSet hashSet = zzdjoVar2.c;
                    hashSet.add(zzdloVar);
                    z = true;
                    hashSet.add(new zzdlo(this.e, executor));
                    zzdjoVar2.c(zzeuaVar, executor);
                    zzdjoVar2.f.add(new zzdlo(zzeuaVar, executor));
                    zzdjoVar2.e.add(new zzdlo(zzeuaVar, executor));
                    zzdjoVar2.h.add(new zzdlo(zzeuaVar, executor));
                    zzdjoVar2.a(zzeuaVar, executor);
                    zzdjoVar2.b(zzeuaVar, executor);
                    zzdjoVar2.m.add(new zzdlo(zzeuaVar, executor));
                    g2.e = new zzdjp(zzdjoVar2);
                    g2.g = new zzesg(this.g);
                    g2.k = new zzdov(zzdrb.h, null);
                    g2.h = new zzcyd(zzdgqVar, zzdivVar);
                    g2.j = new zzcwa(frameLayout);
                    zzh = g2.zzh();
                }
                zun zunVar = zzh;
                if (((Boolean) zzbla.c.c()).booleanValue()) {
                    zzfrgVar = zunVar.c();
                    zzfrgVar.i(3);
                    zzfrgVar.c(zzmVar.zzp);
                    zzfrgVar.d(zzmVar.zzm);
                }
                this.o = zzeupVar;
                zzczp b3 = zunVar.b();
                zzfpp c2 = b3.c(b3.b());
                this.l = c2;
                c2.addListener(new vlo(0, c2, new qpn(this, zzfrgVar, c, zunVar, 6)), executor);
                return z;
            }
            if (zzeuaVar != null) {
                zzeuaVar.i0(zzfmy.d(7, null, null));
            }
        } else if (!zzflvVar.p) {
            this.m = true;
            return false;
        }
        return false;
    }

    public final boolean b() {
        zzfpp zzfppVar = this.l;
        return (zzfppVar == null || zzfppVar.c.isDone()) ? false : true;
    }

    public final void c() {
        synchronized (this) {
            try {
                zzfpp zzfppVar = this.l;
                if (zzfppVar != null && zzfppVar.c.isDone()) {
                    try {
                        zzcwd zzcwdVar = (zzcwd) this.l.c.get();
                        this.l = null;
                        FrameLayout frameLayout = this.f;
                        frameLayout.removeAllViews();
                        zzcwdVar.getClass();
                        ViewParent parent = zzcwdVar.c().getParent();
                        if (parent instanceof ViewGroup) {
                            String str = zzcwdVar.f.a;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
                            sb.append("Banner view provided from ");
                            sb.append(str);
                            sb.append(" already has a parent view. Removing its old parent.");
                            String sb2 = sb.toString();
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            zzo.zzi(sb2);
                            ((ViewGroup) parent).removeView(zzcwdVar.c());
                        }
                        inn innVar = zzbjg.A9;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue()) {
                            zzdhf zzdhfVar = zzcwdVar.g.a;
                            zzeua zzeuaVar = this.d;
                            zzdig zzdigVar = zzdhfVar.a;
                            zzdigVar.b = zzeuaVar;
                            zzdigVar.c = this.e;
                        }
                        frameLayout.addView(zzcwdVar.c());
                        zzeup zzeupVar = this.o;
                        if (zzeupVar != null) {
                            zzeupVar.c(zzcwdVar);
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue()) {
                            Executor executor = this.b;
                            zzeua zzeuaVar2 = this.d;
                            Objects.requireNonNull(zzeuaVar2);
                            executor.execute(new x3o(zzeuaVar2, 10));
                        }
                        if (zzcwdVar.i() >= 0) {
                            this.m = false;
                            zzdgq zzdgqVar = this.h;
                            zzdgqVar.q0(zzcwdVar.i());
                            zzdgqVar.r0(zzcwdVar.h());
                        } else {
                            this.m = true;
                            this.h.q0(zzcwdVar.h());
                        }
                    } catch (InterruptedException e) {
                        e = e;
                        d();
                        com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.m = true;
                        this.h.zzc();
                    } catch (ExecutionException e2) {
                        e = e2;
                        d();
                        com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.m = true;
                        this.h.zzc();
                    }
                } else if (this.l != null) {
                    com.google.android.gms.ads.internal.util.zze.zza("Show timer went off but there is an ongoing ad request.");
                    this.m = true;
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.m = true;
                    this.h.zzc();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        this.l = null;
        com.google.android.gms.ads.internal.client.zze zzeVar = this.n;
        this.n = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.A9)).booleanValue() && zzeVar != null) {
            this.b.execute(new nkn(this, zzeVar, false, 20));
        }
        zzeup zzeupVar = this.o;
        if (zzeupVar != null) {
            zzeupVar.mo12zza();
        }
    }
}
