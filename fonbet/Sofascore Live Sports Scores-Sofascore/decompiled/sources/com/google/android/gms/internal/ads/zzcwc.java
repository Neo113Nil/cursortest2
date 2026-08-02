package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcwc implements zzinw {
    public final zzinv a;
    public final zzinv b;
    public final zzinv c;

    public zzcwc(zzinv zzinvVar, zzinv zzinvVar2, zzinv zzinvVar3) {
        this.a = zzinvVar;
        this.b = zzinvVar2;
        this.c = zzinvVar3;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzdgq zzb() {
        return new zzdgq((ScheduledExecutorService) this.a.zzb(), (Clock) this.b.zzb(), (zzeaj) this.c.zzb());
    }
}
