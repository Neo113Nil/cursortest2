package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdcr implements zzinw {
    public final zzczf a;
    public final zzczc b;
    public final zziof c;
    public final zziof d;
    public final zziof e;

    public zzdcr(zzczf zzczfVar, zzczc zzczcVar, zzinv zzinvVar, zzinv zzinvVar2, zzinv zzinvVar3) {
        this.a = zzczfVar;
        this.b = zzczcVar;
        this.c = zzinvVar;
        this.d = zzinvVar2;
        this.e = zzinvVar3;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdcq(this.a.a(), this.b.a(), (Clock) this.c.zzb(), (zzeaj) this.d.zzb(), (ScheduledExecutorService) this.e.zzb());
    }
}
