package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcbk extends zzbeu implements zzcbm {
    public zzcbk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void A3(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel J = J();
        zzbew.c(J, parcelFileDescriptor);
        Z1(J, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void D2(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        Parcel J = J();
        zzbew.c(J, zzbaVar);
        Z1(J, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void T2(ParcelFileDescriptor parcelFileDescriptor, zzcbv zzcbvVar) {
        Parcel J = J();
        zzbew.c(J, parcelFileDescriptor);
        zzbew.c(J, zzcbvVar);
        Z1(J, 3);
    }
}
