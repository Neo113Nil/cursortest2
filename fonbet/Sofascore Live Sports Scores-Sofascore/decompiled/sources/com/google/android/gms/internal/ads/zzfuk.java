package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfuk implements zzinw {
    public final zzinv a;
    public final zzfug b;
    public final zzcok c;
    public final zzinv d;

    public zzfuk(zzinv zzinvVar, zzfug zzfugVar, zzcok zzcokVar, zzinv zzinvVar2) {
        this.a = zzinvVar;
        this.b = zzfugVar;
        this.c = zzcokVar;
        this.d = zzinvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfuj((zzfve) this.a.zzb(), this.b.zzb(), this.c.a(), (Clock) this.d.zzb());
    }
}
