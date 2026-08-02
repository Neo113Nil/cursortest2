package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ClearExportRequestCreator implements Parcelable.Creator<ClearExportRequest> {
    @Override // android.os.Parcelable.Creator
    public final ClearExportRequest createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        ArrayList arrayList = null;
        boolean z = false;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = SafeParcelReader.o(parcel, readInt);
            } else if (c != 2) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                arrayList = SafeParcelReader.k(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new ClearExportRequest(arrayList, z);
    }

    @Override // android.os.Parcelable.Creator
    public final ClearExportRequest[] newArray(int i) {
        return new ClearExportRequest[i];
    }
}
