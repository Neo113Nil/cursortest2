package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ImportCredentialsForDeviceSetupResponseCreator implements Parcelable.Creator<ImportCredentialsForDeviceSetupResponse> {
    @Override // android.os.Parcelable.Creator
    public final ImportCredentialsForDeviceSetupResponse createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                bundle = SafeParcelReader.b(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new ImportCredentialsForDeviceSetupResponse(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final ImportCredentialsForDeviceSetupResponse[] newArray(int i) {
        return new ImportCredentialsForDeviceSetupResponse[i];
    }
}
