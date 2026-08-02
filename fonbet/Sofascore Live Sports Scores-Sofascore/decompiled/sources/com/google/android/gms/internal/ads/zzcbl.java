package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzcbl extends zzbev implements zzcbm {
    public zzcbl() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzbew.b(parcel, ParcelFileDescriptor.CREATOR);
            zzbew.f(parcel);
            A3(parcelFileDescriptor);
        } else if (i == 2) {
            com.google.android.gms.ads.internal.util.zzba zzbaVar = (com.google.android.gms.ads.internal.util.zzba) zzbew.b(parcel, com.google.android.gms.ads.internal.util.zzba.CREATOR);
            zzbew.f(parcel);
            D2(zzbaVar);
        } else {
            if (i != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) zzbew.b(parcel, ParcelFileDescriptor.CREATOR);
            zzcbv zzcbvVar = (zzcbv) zzbew.b(parcel, zzcbv.CREATOR);
            zzbew.f(parcel);
            T2(parcelFileDescriptor2, zzcbvVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
