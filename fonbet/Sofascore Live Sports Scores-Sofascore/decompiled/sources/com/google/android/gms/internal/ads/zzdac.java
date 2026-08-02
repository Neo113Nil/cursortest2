package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdac implements zzinw {
    public final zziof a;
    public final zzinv b;

    public zzdac(zzinv zzinvVar, zzinv zzinvVar2) {
        this.a = zzinvVar;
        this.b = zzinvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdab((Clock) this.a.zzb(), (zzcfp) this.b.zzb());
    }
}
