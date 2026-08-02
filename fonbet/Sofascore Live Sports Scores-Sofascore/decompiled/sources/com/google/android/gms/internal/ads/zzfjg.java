package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.fvn;
import defpackage.p03;
import defpackage.vlo;
import defpackage.vng;
import defpackage.x3o;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfjg implements zzeuq {
    public final Context a;
    public final Executor b;
    public final zzcob c;
    public final zzeua d;
    public final zzfkh e;
    public zzbkb f;
    public final zzfrj g;
    public final zzflv h;
    public zzfpp i;

    public zzfjg(Context context, Executor executor, zzcob zzcobVar, zzeua zzeuaVar, zzfkh zzfkhVar, zzflv zzflvVar) {
        this.a = context;
        this.b = executor;
        this.c = zzcobVar;
        this.d = zzeuaVar;
        this.h = zzflvVar;
        this.e = zzfkhVar;
        this.g = zzcobVar.r();
    }

    public final boolean a(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzeuo zzeuoVar, zzeup zzeupVar) {
        fvn zzh;
        zzfrg zzfrgVar;
        Executor executor = this.b;
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("Ad unit ID should not be null for interstitial ad.");
            executor.execute(new x3o(this, 11));
            return false;
        }
        if (b()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n3)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.va)).booleanValue();
        zzcob zzcobVar = this.c;
        if (booleanValue && zzmVar.zzf) {
            zzcobVar.q().b(true);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar = ((zzfiz) zzeuoVar).a;
        Bundle a = zzdzu.a(new Pair("api-call", Long.valueOf(zzmVar.zzz)), new Pair("dynamite-enter", Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().a())));
        zzflv zzflvVar = this.h;
        zzflvVar.c = str;
        zzflvVar.b = zzrVar;
        zzflvVar.a = zzmVar;
        zzflvVar.t = a;
        zzflw a2 = zzflvVar.a();
        int b = zzfrf.b(a2);
        Context context = this.a;
        zzfqw c = zzfqw.c(context, b, 4, zzmVar);
        boolean booleanValue2 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.C9)).booleanValue();
        zzeua zzeuaVar = this.d;
        if (booleanValue2) {
            vng i2 = zzcobVar.i();
            zzdcy zzdcyVar = new zzdcy();
            zzdcyVar.a = context;
            zzdcyVar.b = a2;
            i2.e = new zzdcz(zzdcyVar);
            zzdjo zzdjoVar = new zzdjo();
            zzdjoVar.d(zzeuaVar, executor);
            zzdjoVar.b(zzeuaVar, executor);
            i2.d = new zzdjp(zzdjoVar);
            i2.f = new zzesg(this.f);
            zzh = i2.zzh();
        } else {
            zzdjo zzdjoVar2 = new zzdjo();
            HashSet hashSet = zzdjoVar2.h;
            HashSet hashSet2 = zzdjoVar2.e;
            zzfkh zzfkhVar = this.e;
            if (zzfkhVar != null) {
                hashSet2.add(new zzdlo(zzfkhVar, executor));
                hashSet.add(new zzdlo(zzfkhVar, executor));
                zzdjoVar2.a(zzfkhVar, executor);
            }
            vng i3 = zzcobVar.i();
            zzdcy zzdcyVar2 = new zzdcy();
            zzdcyVar2.a = context;
            zzdcyVar2.b = a2;
            i3.e = new zzdcz(zzdcyVar2);
            zzdjoVar2.d(zzeuaVar, executor);
            hashSet2.add(new zzdlo(zzeuaVar, executor));
            hashSet.add(new zzdlo(zzeuaVar, executor));
            zzdjoVar2.a(zzeuaVar, executor);
            zzdjoVar2.c.add(new zzdlo(zzeuaVar, executor));
            zzdjoVar2.c(zzeuaVar, executor);
            zzdjoVar2.b(zzeuaVar, executor);
            zzdjoVar2.m.add(new zzdlo(zzeuaVar, executor));
            zzdjoVar2.l.add(new zzdlo(zzeuaVar, executor));
            i3.d = new zzdjp(zzdjoVar2);
            i3.f = new zzesg(this.f);
            zzh = i3.zzh();
        }
        fvn fvnVar = zzh;
        if (((Boolean) zzbla.c.c()).booleanValue()) {
            zzfrgVar = fvnVar.c();
            zzfrgVar.i(4);
            zzfrgVar.c(zzmVar.zzp);
            zzfrgVar.d(zzmVar.zzm);
        } else {
            zzfrgVar = null;
        }
        zzczp b2 = fvnVar.b();
        zzfpp c2 = b2.c(b2.b());
        this.i = c2;
        c2.addListener(new vlo(0, c2, new p03(this, zzeupVar, zzfrgVar, c, fvnVar, 25, false)), executor);
        return true;
    }

    public final boolean b() {
        zzfpp zzfppVar = this.i;
        return (zzfppVar == null || zzfppVar.c.isDone()) ? false : true;
    }
}
