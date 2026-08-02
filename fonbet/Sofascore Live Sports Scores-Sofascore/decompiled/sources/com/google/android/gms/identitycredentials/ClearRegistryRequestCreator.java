package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identitycredentials.ClearRegistryRequest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ClearRegistryRequestCreator implements Parcelable.Creator<ClearRegistryRequest> {
    @Override // android.os.Parcelable.Creator
    public final ClearRegistryRequest createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        ClearRegistryRequest.ClearTypedRegistryOption clearTypedRegistryOption = null;
        boolean z = true;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = SafeParcelReader.o(parcel, readInt);
            } else if (c != 2) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                clearTypedRegistryOption = (ClearRegistryRequest.ClearTypedRegistryOption) SafeParcelReader.h(parcel, readInt, ClearRegistryRequest.ClearTypedRegistryOption.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new ClearRegistryRequest(z, clearTypedRegistryOption);
    }

    @Override // android.os.Parcelable.Creator
    public final ClearRegistryRequest[] newArray(int i) {
        return new ClearRegistryRequest[i];
    }
}
