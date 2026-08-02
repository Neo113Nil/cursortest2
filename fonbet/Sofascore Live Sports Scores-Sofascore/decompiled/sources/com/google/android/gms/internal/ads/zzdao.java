package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdao implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zzddg c;
    public final zzinv d;

    public zzdao(zziof zziofVar, zziof zziofVar2, zzddg zzddgVar, zzinv zzinvVar) {
        this.a = zziofVar;
        this.b = zziofVar2;
        this.c = zzddgVar;
        this.d = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdan((Clock) this.a.zzb(), (zzdap) this.b.zzb(), this.c.a(), (String) this.d.zzb());
    }
}
