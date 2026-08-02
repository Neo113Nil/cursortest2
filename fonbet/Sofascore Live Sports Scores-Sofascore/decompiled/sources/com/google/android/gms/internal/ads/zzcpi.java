package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.dff;
import defpackage.hsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcpi implements zzinw {
    public final zzcok a;
    public final zzinv b;

    public zzcpi(zzcok zzcokVar, zzinv zzinvVar) {
        this.a = zzcokVar;
        this.b = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzcbr zzb() {
        Context a = this.a.a();
        zzfrj zzfrjVar = (zzfrj) this.b.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        com.google.android.gms.ads.internal.zzt.zzr().a(a, VersionInfoParcel.forPackage(), zzfrjVar);
        zzbva a2 = com.google.android.gms.ads.internal.zzt.zzr().a(a, VersionInfoParcel.forPackage(), zzfrjVar);
        dff dffVar = zzbux.a;
        return new zzcbr(a, a2.a("google.afma.sdkConstants.getSdkConstants", dffVar, dffVar), VersionInfoParcel.forPackage(), hsnVar);
    }
}
