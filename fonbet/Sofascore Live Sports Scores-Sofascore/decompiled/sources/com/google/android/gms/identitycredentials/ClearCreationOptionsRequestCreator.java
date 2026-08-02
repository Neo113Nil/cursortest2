package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identitycredentials.ClearCreationOptionsRequest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ClearCreationOptionsRequestCreator implements Parcelable.Creator<ClearCreationOptionsRequest> {
    @Override // android.os.Parcelable.Creator
    public final ClearCreationOptionsRequest createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        ClearCreationOptionsRequest.ClearTypedCreationOption clearTypedCreationOption = null;
        boolean z = true;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = SafeParcelReader.o(parcel, readInt);
            } else if (c != 2) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                clearTypedCreationOption = (ClearCreationOptionsRequest.ClearTypedCreationOption) SafeParcelReader.h(parcel, readInt, ClearCreationOptionsRequest.ClearTypedCreationOption.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new ClearCreationOptionsRequest(z, clearTypedCreationOption);
    }

    @Override // android.os.Parcelable.Creator
    public final ClearCreationOptionsRequest[] newArray(int i) {
        return new ClearCreationOptionsRequest[i];
    }
}
