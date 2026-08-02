package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbkm implements zzinw {
    public final zzinv a;
    public final zzinv b;
    public final zzinv c;
    public final zzinv d;

    public zzbkm(zzinv zzinvVar, zzinv zzinvVar2, zzinv zzinvVar3, zzinv zzinvVar4) {
        this.a = zzinvVar;
        this.b = zzinvVar2;
        this.c = zzinvVar3;
        this.d = zzinvVar4;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzbkl zzb() {
        return new zzbkl((ScheduledExecutorService) this.a.zzb(), (com.google.android.gms.ads.nonagon.signalgeneration.zzj) this.b.zzb(), (com.google.android.gms.ads.nonagon.signalgeneration.zza) this.c.zzb(), (zzeao) this.d.zzb());
    }
}
