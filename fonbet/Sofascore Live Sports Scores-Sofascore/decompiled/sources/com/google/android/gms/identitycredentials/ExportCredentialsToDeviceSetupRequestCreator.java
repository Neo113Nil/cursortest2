package com.google.android.gms.identitycredentials;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ExportCredentialsToDeviceSetupRequestCreator implements Parcelable.Creator<ExportCredentialsToDeviceSetupRequest> {
    @Override // android.os.Parcelable.Creator
    public final ExportCredentialsToDeviceSetupRequest createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        Uri uri = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                uri = (Uri) SafeParcelReader.h(parcel, readInt, Uri.CREATOR);
            } else if (c != 2) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                bundle = SafeParcelReader.b(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new ExportCredentialsToDeviceSetupRequest(uri, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final ExportCredentialsToDeviceSetupRequest[] newArray(int i) {
        return new ExportCredentialsToDeviceSetupRequest[i];
    }
}
