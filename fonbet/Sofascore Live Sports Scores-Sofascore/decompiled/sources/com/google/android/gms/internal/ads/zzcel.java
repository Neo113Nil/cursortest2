package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.trn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcel implements zzinw {
    public final zzinx a;
    public final zzinv b;

    public zzcel(zzinv zzinvVar, zzinx zzinxVar) {
        this.a = zzinxVar;
        this.b = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        return new zzcek((Clock) this.a.a, (trn) this.b.zzb());
    }
}
