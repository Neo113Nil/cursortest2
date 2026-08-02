package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfvf implements zzinw {
    public final zzcok a;
    public final zzcpa b;
    public final zzinv c;
    public final zzinv d;
    public final zzcru e;
    public final zzinv f;
    public final zzinv g;
    public final zzfug h;

    public zzfvf(zzcok zzcokVar, zzcpa zzcpaVar, zzinv zzinvVar, zzinv zzinvVar2, zzcru zzcruVar, zzinv zzinvVar3, zzinv zzinvVar4, zzfug zzfugVar) {
        this.a = zzcokVar;
        this.b = zzcpaVar;
        this.c = zzinvVar;
        this.d = zzinvVar2;
        this.e = zzcruVar;
        this.f = zzinvVar3;
        this.g = zzinvVar4;
        this.h = zzfugVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        return new zzfve(this.a.a(), this.b.a(), (ScheduledExecutorService) this.c.zzb(), (zzfpm) this.d.zzb(), zzfms.a(this.e.a.a()), (Clock) this.f.zzb(), (zzftp) this.g.zzb(), this.h.zzb());
    }
}
