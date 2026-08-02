package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzefa implements zzinw {
    public final zzcok a;
    public final zzcpa b;

    public zzefa(zzcok zzcokVar, zzcpa zzcpaVar) {
        this.a = zzcokVar;
        this.b = zzcpaVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Context a = this.a.a();
        VersionInfoParcel a2 = this.b.a();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzeez(a, a2, hsnVar);
    }
}
