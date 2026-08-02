package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzeux;
import com.google.android.gms.internal.ads.zzfmy;
import defpackage.fjn;
import defpackage.hsn;
import defpackage.nc3;
import defpackage.p03;
import defpackage.pxn;
import defpackage.sun;
import defpackage.vlo;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeux implements zzeuq {
    public final zzflv a;
    public final zzcob b;
    public final Context c;
    public final zzeun d;
    public final zzfrj e;
    public zzcza f;

    public zzeux(zzcob zzcobVar, Context context, zzeun zzeunVar, zzflv zzflvVar) {
        this.b = zzcobVar;
        this.c = context;
        this.d = zzeunVar;
        this.a = zzflvVar;
        this.e = zzcobVar.r();
        zzflvVar.r = zzeunVar.b;
    }

    public final boolean a(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzeuo zzeuoVar, zzeup zzeupVar) {
        zzeun zzeunVar = this.d;
        zzeua zzeuaVar = zzeunVar.b;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n3)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.c;
        boolean zzK = com.google.android.gms.ads.internal.util.zzs.zzK(context);
        final int i = 0;
        final int i2 = 1;
        zzcob zzcobVar = this.b;
        if (zzK && zzmVar.zzs == null) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("Failed to load the ad because app ID is missing.");
            zzcobVar.d().execute(new Runnable(this) { // from class: h6o
                public final /* synthetic */ zzeux b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i2;
                    zzeux zzeuxVar = this.b;
                    switch (i4) {
                        case 0:
                            zzeuxVar.d.c.i0(zzfmy.d(6, null, null));
                            break;
                        default:
                            zzeuxVar.d.c.i0(zzfmy.d(4, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        if (str == null) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("Ad unit ID should not be null for NativeAdLoader.");
            zzcobVar.d().execute(new Runnable(this) { // from class: h6o
                public final /* synthetic */ zzeux b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i42 = i;
                    zzeux zzeuxVar = this.b;
                    switch (i42) {
                        case 0:
                            zzeuxVar.d.c.i0(zzfmy.d(6, null, null));
                            break;
                        default:
                            zzeuxVar.d.c.i0(zzfmy.d(4, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        boolean z = zzmVar.zzf;
        zzfmt.b(context, z);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.va)).booleanValue() && z) {
            zzcobVar.q().b(true);
        }
        int i5 = ((zzeur) zzeuoVar).a;
        Long valueOf = Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().a());
        Bundle a = zzdzu.a(new Pair("api-call", valueOf), new Pair("dynamite-enter", valueOf));
        zzflv zzflvVar = this.a;
        zzflvVar.a = zzmVar;
        zzflvVar.t = a;
        zzflvVar.m = i5;
        zzflw a2 = zzflvVar.a();
        zzfqw c = zzfqw.c(context, zzfrf.b(a2), 8, zzmVar);
        com.google.android.gms.ads.internal.client.zzcl zzclVar = a2.o;
        if (zzclVar != null) {
            zzeuaVar.A(zzclVar);
        }
        nc3 k = zzcobVar.k();
        zzdcy zzdcyVar = new zzdcy();
        zzdcyVar.a = context;
        zzdcyVar.b = a2;
        k.e = new zzdcz(zzdcyVar);
        zzdjo zzdjoVar = new zzdjo();
        zzdjoVar.b(zzeuaVar, zzcobVar.d());
        k.d = new zzdjp(zzdjoVar);
        k.f = new zzdov(zzeunVar.a, zzeuaVar.c());
        zzfrg zzfrgVar = null;
        k.g = new zzcwa(null);
        sun zzh = k.zzh();
        if (((Boolean) zzbla.c.c()).booleanValue()) {
            zzfrgVar = (zzfrg) zzh.e.zzb();
            zzfrgVar.i(8);
            zzfrgVar.c(zzmVar.zzp);
            zzfrgVar.d(zzmVar.zzm);
        }
        zzcobVar.p().a(1);
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        ScheduledExecutorService e = zzcobVar.e();
        zzczp a3 = zzh.a();
        zzfpp c2 = a3.c(a3.b());
        zzcza zzczaVar = new zzcza(hsnVar, e, c2);
        this.f = zzczaVar;
        c2.addListener(new vlo(i, c2, new pxn(zzczaVar, new p03(this, (fjn) zzeupVar, zzfrgVar, c, zzh, 23, false), i)), hsnVar);
        return true;
    }
}
