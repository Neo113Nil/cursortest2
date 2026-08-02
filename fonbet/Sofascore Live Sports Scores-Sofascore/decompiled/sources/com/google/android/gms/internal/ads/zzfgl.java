package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.a8o;
import defpackage.d1l;
import defpackage.ddb;
import defpackage.p03;
import defpackage.vlo;
import defpackage.x3o;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzfgl implements zzeuq {
    public final Context a;
    public final Executor b;
    public final zzcob c;
    public final zzfhc d;
    public final zzfiu e;
    public final VersionInfoParcel f;
    public final FrameLayout g;
    public final zzfrj h;
    public final zzflv i;
    public ddb j;

    public zzfgl(Context context, Executor executor, zzcob zzcobVar, zzfiu zzfiuVar, zzfhc zzfhcVar, zzflv zzflvVar, VersionInfoParcel versionInfoParcel) {
        this.a = context;
        this.b = executor;
        this.c = zzcobVar;
        this.e = zzfiuVar;
        this.d = zzfhcVar;
        this.i = zzflvVar;
        this.f = versionInfoParcel;
        this.g = new FrameLayout(context);
        this.h = zzcobVar.r();
    }

    public final synchronized boolean a(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzeuo zzeuoVar, zzeup zzeupVar) {
        zzfgl zzfglVar;
        Throwable th;
        boolean z;
        zzfrg zzfrgVar;
        zzcvn zzcvnVar;
        try {
            if (!zzmVar.zzb()) {
                if (((Boolean) zzblf.d.c()).booleanValue()) {
                    try {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Oc)).booleanValue()) {
                            z = true;
                            if (this.f.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Pc)).intValue() || !z) {
                                Preconditions.e("loadAd must be called on the main UI thread.");
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        zzfglVar = this;
                        throw th;
                    }
                }
                z = false;
                if (this.f.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Pc)).intValue()) {
                }
                Preconditions.e("loadAd must be called on the main UI thread.");
            }
            if (str == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzf("Ad unit ID should not be null for app open ad.");
                this.b.execute(new x3o(this, 8));
                return false;
            }
            if (this.j != null) {
                return false;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n3)).booleanValue()) {
                com.google.android.gms.ads.internal.client.zzay.zzc();
            }
            if (!((Boolean) zzbla.c.c()).booleanValue() || (zzcvnVar = (zzcvn) this.e.zzd()) == null) {
                zzfrgVar = null;
            } else {
                zzfrg zzd = zzcvnVar.zzd();
                zzd.i(7);
                zzd.c(zzmVar.zzp);
                zzd.d(zzmVar.zzm);
                zzfrgVar = zzd;
            }
            Context context = this.a;
            boolean z2 = zzmVar.zzf;
            zzfmt.b(context, z2);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.va)).booleanValue() && z2) {
                this.c.q().b(true);
            }
            Bundle a = zzdzu.a(new Pair("api-call", Long.valueOf(zzmVar.zzz)), new Pair("dynamite-enter", Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().a())));
            zzflv zzflvVar = this.i;
            zzflvVar.c = str;
            zzflvVar.b = com.google.android.gms.ads.internal.client.zzr.zzd();
            zzflvVar.a = zzmVar;
            zzflvVar.t = a;
            zzflw a2 = zzflvVar.a();
            zzfqw c = zzfqw.c(context, zzfrf.b(a2), 7, zzmVar);
            a8o a8oVar = new a8o();
            a8oVar.a = a2;
            ddb a3 = this.e.a(new zzfiv(a8oVar, null), new d1l(this, 20));
            this.j = a3;
            zzfglVar = this;
            try {
                try {
                    a3.addListener(new vlo(0, a3, new p03(zzfglVar, zzeupVar, zzfrgVar, c, a8oVar, 24, false)), zzfglVar.b);
                    return true;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            zzfglVar = this;
            th = th5;
        }
    }

    public abstract zzcvq b(zzdcz zzdczVar, zzdjp zzdjpVar);

    public final synchronized zzdcw c(zzfis zzfisVar) {
        a8o a8oVar = (a8o) zzfisVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.B9)).booleanValue()) {
            zzdcy zzdcyVar = new zzdcy();
            zzdcyVar.a = this.a;
            zzdcyVar.b = a8oVar.a;
            zzdcz zzdczVar = new zzdcz(zzdcyVar);
            zzdjo zzdjoVar = new zzdjo();
            zzfhc zzfhcVar = this.d;
            Executor executor = this.b;
            zzdjoVar.l.add(new zzdlo(zzfhcVar, executor));
            zzdjoVar.c(zzfhcVar, executor);
            return b(zzdczVar, new zzdjp(zzdjoVar));
        }
        zzfhc zzfhcVar2 = this.d;
        zzfhc zzfhcVar3 = new zzfhc(zzfhcVar2.a);
        zzfhcVar3.i = zzfhcVar2;
        zzdjo zzdjoVar2 = new zzdjo();
        Executor executor2 = this.b;
        zzdjoVar2.a(zzfhcVar3, executor2);
        zzdjoVar2.g.add(new zzdlo(zzfhcVar3, executor2));
        zzdjoVar2.n.add(new zzdlo(zzfhcVar3, executor2));
        zzdjoVar2.m.add(new zzdlo(zzfhcVar3, executor2));
        zzdjoVar2.l.add(new zzdlo(zzfhcVar3, executor2));
        zzdjoVar2.c(zzfhcVar3, executor2);
        zzdjoVar2.o = zzfhcVar3;
        zzdcy zzdcyVar2 = new zzdcy();
        zzdcyVar2.a = this.a;
        zzdcyVar2.b = a8oVar.a;
        return b(new zzdcz(zzdcyVar2), new zzdjp(zzdjoVar2));
    }
}
