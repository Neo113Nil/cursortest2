package com.google.android.gms.identitycredentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ImportCredentialsRequestCreator implements Parcelable.Creator<ImportCredentialsRequest> {
    @Override // android.os.Parcelable.Creator
    public final ImportCredentialsRequest createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        Uri uri = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c != 2) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                uri = (Uri) SafeParcelReader.h(parcel, readInt, Uri.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new ImportCredentialsRequest(str, uri);
    }

    @Override // android.os.Parcelable.Creator
    public final ImportCredentialsRequest[] newArray(int i) {
        return new ImportCredentialsRequest[i];
    }
}
