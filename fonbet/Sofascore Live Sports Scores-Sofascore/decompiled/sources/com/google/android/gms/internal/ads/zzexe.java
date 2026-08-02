package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzexe implements zzinw {
    public final zziof a;

    public zzexe(zzcpa zzcpaVar) {
        this.a = zzcpaVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzexc zzb() {
        VersionInfoParcel a = ((zzcpa) this.a).a();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzexc(a, hsnVar);
    }
}
