package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzean implements zzinw {
    public final zzinv a;
    public final zzioi b;
    public final zziof c;

    public zzean(zzinv zzinvVar, zzioi zzioiVar, zzinv zzinvVar2) {
        this.a = zzinvVar;
        this.b = zzioiVar;
        this.c = zzinvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeam((zzeae) this.a.zzb(), this.b.zzb(), (Clock) this.c.zzb());
    }
}
