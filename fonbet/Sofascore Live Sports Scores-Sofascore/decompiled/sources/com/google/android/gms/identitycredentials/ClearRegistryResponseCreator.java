package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ClearRegistryResponseCreator implements Parcelable.Creator<ClearRegistryResponse> {
    @Override // android.os.Parcelable.Creator
    public final ClearRegistryResponse createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        boolean z = false;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                z = SafeParcelReader.o(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new ClearRegistryResponse(z);
    }

    @Override // android.os.Parcelable.Creator
    public final ClearRegistryResponse[] newArray(int i) {
        return new ClearRegistryResponse[i];
    }
}
