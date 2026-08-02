package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import defpackage.b1l;
import defpackage.cpn;
import defpackage.ddb;
import defpackage.een;
import defpackage.q3o;
import defpackage.tko;
import defpackage.vlo;
import defpackage.yvn;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzegi implements zzeho {
    public static final Pattern h = Pattern.compile("Received error HTTP response code: (.*)");
    public final zzefj a;
    public final zzhdi b;
    public final zzflw c;
    public final ScheduledExecutorService d;
    public final zzekb e;
    public final zzfrg f;
    public final Context g;

    public zzegi(Context context, zzflw zzflwVar, zzefj zzefjVar, zzhdi zzhdiVar, ScheduledExecutorService scheduledExecutorService, zzekb zzekbVar, zzfrg zzfrgVar) {
        this.g = context;
        this.c = zzflwVar;
        this.a = zzefjVar;
        this.b = zzhdiVar;
        this.d = scheduledExecutorService;
        this.e = zzekbVar;
        this.f = zzfrgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeho
    public final ddb e(zzcbv zzcbvVar) {
        zzefj zzefjVar = this.a;
        zzhdi zzhdiVar = zzefjVar.b;
        String str = zzcbvVar.d;
        com.google.android.gms.ads.internal.zzt.zzc();
        tko f = zzhcy.f(com.google.android.gms.ads.internal.util.zzs.zzF(str) ? zzhcy.b(new zzehp(1)) : zzhcy.f(zzefjVar.a.submit(new een(6, zzefjVar, zzcbvVar)), ExecutionException.class, yvn.c, zzhdiVar), zzehp.class, new q3o(zzefjVar, zzcbvVar, Binder.getCallingUid(), 0), zzhdiVar);
        zzfqw e = zzfqw.e(11, this.g);
        zzfrf.a(f, e);
        ddb h2 = zzhcy.h(f, new cpn(this, 5), this.b);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.I6)).booleanValue()) {
            h2 = zzhcy.f(zzhcy.g(h2, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.J6)).intValue(), TimeUnit.SECONDS, this.d), TimeoutException.class, yvn.d, zzcgj.h);
        }
        zzfrf.c(h2, this.f, e, false);
        h2.addListener(new vlo(0, h2, new b1l(this, 16)), zzcgj.h);
        return h2;
    }
}
