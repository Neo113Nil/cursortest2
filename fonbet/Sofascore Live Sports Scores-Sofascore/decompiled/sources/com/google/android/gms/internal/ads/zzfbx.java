package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfbx implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zziof c;

    public zzfbx(zzcok zzcokVar, zzinv zzinvVar, zzinv zzinvVar2) {
        this.a = zzinvVar;
        this.b = zzinvVar2;
        this.c = zzcokVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzfbv zzb() {
        return new zzfbv((ApplicationInfo) this.a.zzb(), (PackageInfo) this.b.zzb(), ((zzcok) this.c).a());
    }
}
