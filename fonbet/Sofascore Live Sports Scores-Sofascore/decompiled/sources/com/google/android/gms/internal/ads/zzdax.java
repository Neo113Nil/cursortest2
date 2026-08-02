package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdax implements zzinw {
    public final zzcok a;
    public final zzinv b;
    public final zzcpa c;

    public zzdax(zzcok zzcokVar, zzcpa zzcpaVar, zzinv zzinvVar) {
        this.a = zzcokVar;
        this.b = zzinvVar;
        this.c = zzcpaVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Context a = this.a.a();
        zzfrj zzfrjVar = (zzfrj) this.b.zzb();
        VersionInfoParcel a2 = this.c.a();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzdaw(a, zzfrjVar, a2, hsnVar);
    }
}
