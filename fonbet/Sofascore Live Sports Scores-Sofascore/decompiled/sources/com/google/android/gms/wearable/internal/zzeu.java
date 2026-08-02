package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        boolean z = false;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (c == 3) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.h(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (c != 4) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                z = SafeParcelReader.o(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new zzet(i, parcelFileDescriptor, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzet[i];
    }
}
