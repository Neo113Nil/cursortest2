package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfbk implements zzinw {
    public final zzddg a;
    public final zziof b;
    public final zziof c;

    public zzfbk(zzddg zzddgVar, zzinv zzinvVar, zzcoe zzcoeVar) {
        this.a = zzddgVar;
        this.b = zzinvVar;
        this.c = zzcoeVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzfbi(hsnVar, this.a.a(), (PackageInfo) this.b.zzb(), ((zzcoe) this.c).zzb());
    }
}
