package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import defpackage.ahn;
import defpackage.ddb;
import defpackage.lrn;
import defpackage.yvn;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzewv implements zzfdi {
    public final zzcfv a;
    public final AppSetIdClient b;
    public final ScheduledExecutorService c;
    public final zzhdi d;
    public final Context e;

    public zzewv(Context context, zzcfv zzcfvVar, ScheduledExecutorService scheduledExecutorService, zzhdi zzhdiVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.a4)).booleanValue()) {
            this.b = AppSet.getClient(context);
        }
        this.e = context;
        this.a = zzcfvVar;
        this.c = scheduledExecutorService;
        this.d = zzhdiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        Task<AppSetIdInfo> appSetIdInfo;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.W3)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.b4)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.X3)).booleanValue()) {
                    return zzhcy.i(zzgdv.a(this.b.getAppSetIdInfo()), ahn.m, zzcgj.h);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.a4)).booleanValue()) {
                    zzfnb.a(this.e, false);
                    synchronized (zzfnb.c) {
                        appSetIdInfo = zzfnb.a;
                    }
                } else {
                    appSetIdInfo = this.b.getAppSetIdInfo();
                }
                if (appSetIdInfo == null) {
                    return zzhcy.a(new zzeww(null, -1));
                }
                ddb h = zzhcy.h(zzgdv.a(appSetIdInfo), yvn.j, zzcgj.h);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Y3)).booleanValue()) {
                    h = zzhcy.g(h, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Z3)).longValue(), TimeUnit.MILLISECONDS, this.c);
                }
                return zzhcy.e(h, Exception.class, new lrn(this, 4), this.d);
            }
        }
        return zzhcy.a(new zzeww(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 11;
    }
}
