package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcuz implements zzinw {
    public final zzinv a;
    public final zzinv b;
    public final zziof c;
    public final zzinv d;
    public final zziof e;

    public zzcuz(zzinv zzinvVar, zzinv zzinvVar2, zzinv zzinvVar3, zzinv zzinvVar4, zzinv zzinvVar5) {
        this.a = zzinvVar;
        this.b = zzinvVar2;
        this.c = zzinvVar3;
        this.d = zzinvVar4;
        this.e = zzinvVar5;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcuy((zzbvj) this.a.zzb(), (zzcuu) this.b.zzb(), (Executor) this.c.zzb(), (zzcut) this.d.zzb(), (Clock) this.e.zzb());
    }
}
