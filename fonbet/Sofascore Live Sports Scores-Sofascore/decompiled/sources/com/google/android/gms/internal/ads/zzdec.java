package com.google.android.gms.internal.ads;

import defpackage.ewm;
import defpackage.fsn;
import defpackage.hsn;
import defpackage.ohn;
import defpackage.w9f;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdec extends zzdjn implements zzddt {
    public final ScheduledExecutorService b;
    public ScheduledFuture c;
    public boolean d;

    public zzdec(zzddy zzddyVar, Set set, hsn hsnVar, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.d = false;
        this.b = scheduledExecutorService;
        n0(zzddyVar, hsnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void L(zzdol zzdolVar) {
        if (this.d) {
            return;
        }
        ScheduledFuture scheduledFuture = this.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        p0(new ewm(zzdolVar, 13));
    }

    public final void q0() {
        this.c = this.b.schedule(new fsn(this, 18), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.pc)).intValue(), TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        p0(new ohn(zzeVar, 8));
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zze() {
        p0(w9f.e);
    }
}
