package com.google.android.gms.identitycredentials;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ImportCredentialsForDeviceSetupRequestCreator implements Parcelable.Creator<ImportCredentialsForDeviceSetupRequest> {
    @Override // android.os.Parcelable.Creator
    public final ImportCredentialsForDeviceSetupRequest createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        Uri uri = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c == 2) {
                uri = (Uri) SafeParcelReader.h(parcel, readInt, Uri.CREATOR);
            } else if (c != 3) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                bundle = SafeParcelReader.b(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new ImportCredentialsForDeviceSetupRequest(str, uri, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final ImportCredentialsForDeviceSetupRequest[] newArray(int i) {
        return new ImportCredentialsForDeviceSetupRequest[i];
    }
}
