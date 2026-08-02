package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identitycredentials.ClearRegistryRequest;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ClearTypedRegistryOptionCreator implements Parcelable.Creator<ClearRegistryRequest.ClearTypedRegistryOption> {
    @Override // android.os.Parcelable.Creator
    public final ClearRegistryRequest.ClearTypedRegistryOption createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = SafeParcelReader.o(parcel, readInt);
            } else if (c == 2) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c == 3) {
                z2 = SafeParcelReader.o(parcel, readInt);
            } else if (c != 4) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                arrayList = SafeParcelReader.k(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new ClearRegistryRequest.ClearTypedRegistryOption(z, str, z2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final ClearRegistryRequest.ClearTypedRegistryOption[] newArray(int i) {
        return new ClearRegistryRequest.ClearTypedRegistryOption[i];
    }
}
