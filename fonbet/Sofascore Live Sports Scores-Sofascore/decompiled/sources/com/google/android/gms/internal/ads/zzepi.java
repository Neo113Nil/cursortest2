package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzepi implements zzinw {
    public final zzinv a;
    public final zzinx b;
    public final zziof c;

    public zzepi(zzinv zzinvVar, zzinx zzinxVar, zziof zziofVar) {
        this.a = zzinvVar;
        this.b = zzinxVar;
        this.c = zziofVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        return new zzeph((Context) this.a.zzb(), (zzdpa) this.b.a, ((zzcpa) this.c).a());
    }
}
