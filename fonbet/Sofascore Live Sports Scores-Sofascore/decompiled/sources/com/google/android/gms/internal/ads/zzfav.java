package com.google.android.gms.internal.ads;

import android.content.Intent;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfav implements zzinw {
    public final zziof a;
    public final zziof b;

    public zzfav(zzcok zzcokVar, zzinv zzinvVar) {
        this.a = zzcokVar;
        this.b = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzfat zzb() {
        return new zzfat(((zzcok) this.a).a(), (Intent) this.b.zzb());
    }
}
