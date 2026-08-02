package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzftv implements zzinw {
    public final zzinv a;
    public final zzfug b;
    public final zzcok c;
    public final zzinv d;
    public final zzinv e;
    public final zzcoe f;

    public zzftv(zzinv zzinvVar, zzfug zzfugVar, zzcok zzcokVar, zzinv zzinvVar2, zzinv zzinvVar3, zzcoe zzcoeVar) {
        this.a = zzinvVar;
        this.b = zzfugVar;
        this.c = zzcokVar;
        this.d = zzinvVar2;
        this.e = zzinvVar3;
        this.f = zzcoeVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzftu((zzfve) this.a.zzb(), this.b.zzb(), this.c.a(), (Clock) this.d.zzb(), (zzftp) this.e.zzb(), this.f.zzb());
    }
}
