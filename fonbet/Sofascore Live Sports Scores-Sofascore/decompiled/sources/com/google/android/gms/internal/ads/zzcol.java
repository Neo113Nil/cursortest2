package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcol implements zzinw {
    public final zzcod a;

    public zzcol(zzcod zzcodVar) {
        this.a = zzcodVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        WeakReference weakReference = this.a.d;
        zzioe.a(weakReference);
        return weakReference;
    }
}
