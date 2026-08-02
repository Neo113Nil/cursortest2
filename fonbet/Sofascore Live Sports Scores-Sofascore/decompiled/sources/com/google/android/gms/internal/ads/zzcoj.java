package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcoj implements zzinw {
    public final zzcok a;

    public zzcoj(zzcok zzcokVar) {
        this.a = zzcokVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        ApplicationInfo applicationInfo = this.a.a().getApplicationInfo();
        zzioe.a(applicationInfo);
        return applicationInfo;
    }
}
