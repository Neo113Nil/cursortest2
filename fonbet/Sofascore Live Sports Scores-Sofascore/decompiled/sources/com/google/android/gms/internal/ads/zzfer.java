package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Tasks;
import defpackage.ddb;
import defpackage.kco;
import defpackage.lrn;
import defpackage.yvn;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfer implements zzfdi {
    public final zzcfv a;
    public final ScheduledExecutorService b;
    public final zzhdi c;

    public zzfer(zzcfv zzcfvVar, ScheduledExecutorService scheduledExecutorService, zzhdi zzhdiVar) {
        this.a = zzcfvVar;
        this.b = scheduledExecutorService;
        this.c = zzhdiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.W3)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.b4)).booleanValue()) {
                kco a = zzgdv.a(Tasks.forResult(null));
                yvn yvnVar = yvn.l;
                zzhdi zzhdiVar = this.c;
                ddb h = zzhcy.h(a, yvnVar, zzhdiVar);
                if (((Boolean) zzbku.a.c()).booleanValue()) {
                    h = zzhcy.g(h, ((Long) zzbku.b.c()).longValue(), TimeUnit.MILLISECONDS, this.b);
                }
                return zzhcy.e(h, Exception.class, new lrn(this, 5), zzhdiVar);
            }
        }
        return zzhcy.a(new zzfes(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 43;
    }
}
