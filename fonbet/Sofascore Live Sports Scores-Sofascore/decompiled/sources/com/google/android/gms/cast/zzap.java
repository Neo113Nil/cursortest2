package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzap implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        zzam zzamVar = null;
        zzam zzamVar2 = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                zzamVar = (zzam) SafeParcelReader.h(parcel, readInt, zzam.CREATOR);
            } else if (c != 3) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                zzamVar2 = (zzam) SafeParcelReader.h(parcel, readInt, zzam.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzao(zzamVar, zzamVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzao[i];
    }
}
