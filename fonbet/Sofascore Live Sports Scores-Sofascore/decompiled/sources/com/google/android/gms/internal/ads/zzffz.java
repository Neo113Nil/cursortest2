package com.google.android.gms.internal.ads;

import defpackage.hsn;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzffz implements zzinw {
    public final zziof a;
    public final zzffr b;
    public final zzffo c;
    public final zziof d;
    public final zzfft e;

    public zzffz(zzinv zzinvVar, zzffr zzffrVar, zzffo zzffoVar, zzinv zzinvVar2, zzfft zzfftVar) {
        this.a = zzinvVar;
        this.b = zzffrVar;
        this.c = zzffoVar;
        this.d = zzinvVar2;
        this.e = zzfftVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzffx zzb() {
        zzcfv zzcfvVar = (zzcfv) this.a.zzb();
        boolean z = this.b.a.a.k;
        new zzcfl();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        zzioe.a(this.c.a.a.d);
        return new zzffx(zzcfvVar, z, hsnVar, (ScheduledExecutorService) this.d.zzb(), this.e.zzb().intValue());
    }
}
