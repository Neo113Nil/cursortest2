package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcov implements zzinw {
    public final zzcok a;
    public final zzinv b;

    public zzcov(zzcok zzcokVar, zzinv zzinvVar) {
        this.a = zzcokVar;
        this.b = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return Wrappers.a(this.a.a()).b(0, ((ApplicationInfo) this.b.zzb()).packageName);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
