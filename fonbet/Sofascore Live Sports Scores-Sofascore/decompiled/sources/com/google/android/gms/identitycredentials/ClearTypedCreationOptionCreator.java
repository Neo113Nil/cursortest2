package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identitycredentials.ClearCreationOptionsRequest;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ClearTypedCreationOptionCreator implements Parcelable.Creator<ClearCreationOptionsRequest.ClearTypedCreationOption> {
    @Override // android.os.Parcelable.Creator
    public final ClearCreationOptionsRequest.ClearTypedCreationOption createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        boolean z = false;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = SafeParcelReader.o(parcel, readInt);
            } else if (c == 2) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c != 3) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                arrayList = SafeParcelReader.k(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new ClearCreationOptionsRequest.ClearTypedCreationOption(str, arrayList, z);
    }

    @Override // android.os.Parcelable.Creator
    public final ClearCreationOptionsRequest.ClearTypedCreationOption[] newArray(int i) {
        return new ClearCreationOptionsRequest.ClearTypedCreationOption[i];
    }
}
