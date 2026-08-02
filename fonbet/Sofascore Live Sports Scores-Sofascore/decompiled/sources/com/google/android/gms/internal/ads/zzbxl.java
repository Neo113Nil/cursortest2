package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbxl extends zzbeu implements zzbxn {
    public zzbxl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void a(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel J = J();
        zzbew.c(J, zzeVar);
        Z1(J, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void s2(zzbwj zzbwjVar) {
        Parcel J = J();
        zzbew.e(J, zzbwjVar);
        Z1(J, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzf(String str) {
        Parcel J = J();
        J.writeString("Adapter returned null.");
        Z1(J, 2);
    }
}
