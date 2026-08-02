package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.ddb;
import defpackage.fjn;
import defpackage.ivn;
import defpackage.o8o;
import defpackage.p03;
import defpackage.vlo;
import defpackage.x3o;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfkq implements zzeuq {
    public final Context a;
    public final Executor b;
    public final zzcob c;
    public final zzfkh d;
    public final zzfiu e;
    public final zzflp f;
    public final zzfrj g;
    public final zzflv h;
    public ddb i;

    public zzfkq(Context context, Executor executor, zzcob zzcobVar, zzfiu zzfiuVar, zzfkh zzfkhVar, zzflv zzflvVar, zzflp zzflpVar) {
        this.a = context;
        this.b = executor;
        this.c = zzcobVar;
        this.e = zzfiuVar;
        this.d = zzfkhVar;
        this.h = zzflvVar;
        this.f = zzflpVar;
        this.g = zzcobVar.r();
    }

    public final boolean a(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzeuo zzeuoVar, zzeup zzeupVar) {
        zzfrg zzfrgVar;
        zzcco zzccoVar = new zzcco(zzmVar, str);
        int i = 0;
        Executor executor = this.b;
        String str2 = zzccoVar.b;
        if (str2 == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("Ad unit ID should not be null for rewarded video ad.");
            executor.execute(new x3o(this, 13));
            return false;
        }
        ddb ddbVar = this.i;
        if (ddbVar != null && !ddbVar.isDone()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n3)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        boolean booleanValue = ((Boolean) zzbla.c.c()).booleanValue();
        zzfiu zzfiuVar = this.e;
        com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzccoVar.a;
        if (!booleanValue || zzfiuVar.zzd() == null) {
            zzfrgVar = null;
        } else {
            zzfrgVar = ((o) ((zzdwp) zzfiuVar.zzd())).zzd();
            zzfrgVar.i(5);
            zzfrgVar.c(zzmVar2.zzp);
            zzfrgVar.d(zzmVar2.zzm);
        }
        boolean z = zzmVar2.zzf;
        Context context = this.a;
        zzfmt.b(context, z);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.va)).booleanValue() && z) {
            this.c.q().b(true);
        }
        Bundle a = zzdzu.a(new Pair("api-call", Long.valueOf(zzmVar2.zzz)), new Pair("dynamite-enter", Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().a())));
        zzflv zzflvVar = this.h;
        zzflvVar.c = str2;
        zzflvVar.b = com.google.android.gms.ads.internal.client.zzr.zzc();
        zzflvVar.a = zzmVar2;
        zzflvVar.t = a;
        zzflw a2 = zzflvVar.a();
        zzfqw c = zzfqw.c(context, zzfrf.b(a2), 5, zzmVar2);
        o8o o8oVar = new o8o();
        o8oVar.a = a2;
        ddb a3 = zzfiuVar.a(new zzfiv(o8oVar, null), new fjn(this, 16));
        this.i = a3;
        a3.addListener(new vlo(i, a3, new p03(this, zzeupVar, zzfrgVar, c, o8oVar, 26, false)), executor);
        return true;
    }

    public final zzdwo b(zzfis zzfisVar) {
        ivn l = this.c.l();
        zzdcy zzdcyVar = new zzdcy();
        zzdcyVar.a = this.a;
        zzdcyVar.b = ((o8o) zzfisVar).a;
        zzdcyVar.d = this.f;
        l.e = new zzdcz(zzdcyVar);
        l.d = new zzdjp(new zzdjo());
        return l;
    }
}
