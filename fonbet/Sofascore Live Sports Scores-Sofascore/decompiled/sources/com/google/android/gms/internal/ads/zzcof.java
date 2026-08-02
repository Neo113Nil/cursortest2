package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcof implements zzinw {
    public final zzcoe a;
    public final zzinv b;
    public final zzfug c;
    public final zzinv d;

    public zzcof(zzcoe zzcoeVar, zzinv zzinvVar, zzfug zzfugVar, zzinv zzinvVar2) {
        this.a = zzcoeVar;
        this.b = zzinvVar;
        this.c = zzfugVar;
        this.d = zzinvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.util.zzj zzb = this.a.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b.zzb();
        zzfuf zzb2 = this.c.zzb();
        Clock clock = (Clock) this.d.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.R)).booleanValue()) {
            return new zzftp(zzb, scheduledExecutorService, zzb2, clock);
        }
        return null;
    }
}
