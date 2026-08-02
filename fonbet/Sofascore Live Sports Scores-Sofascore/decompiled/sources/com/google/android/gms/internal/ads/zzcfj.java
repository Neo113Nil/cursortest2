package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcfj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        com.google.android.gms.ads.internal.client.zzr zzrVar = null;
        com.google.android.gms.ads.internal.client.zzm zzmVar = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c == 2) {
                str2 = SafeParcelReader.i(parcel, readInt);
            } else if (c == 3) {
                zzrVar = (com.google.android.gms.ads.internal.client.zzr) SafeParcelReader.h(parcel, readInt, com.google.android.gms.ads.internal.client.zzr.CREATOR);
            } else if (c != 4) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                zzmVar = (com.google.android.gms.ads.internal.client.zzm) SafeParcelReader.h(parcel, readInt, com.google.android.gms.ads.internal.client.zzm.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzcfi(str, str2, zzrVar, zzmVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcfi[i];
    }
}
