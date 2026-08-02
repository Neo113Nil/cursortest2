package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class SignalCredentialStateResponseCreator implements Parcelable.Creator<SignalCredentialStateResponse> {
    @Override // android.os.Parcelable.Creator
    public final SignalCredentialStateResponse createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        while (parcel.dataPosition() < B) {
            SafeParcelReader.A(parcel, parcel.readInt());
        }
        SafeParcelReader.n(parcel, B);
        return new SignalCredentialStateResponse();
    }

    @Override // android.os.Parcelable.Creator
    public final SignalCredentialStateResponse[] newArray(int i) {
        return new SignalCredentialStateResponse[i];
    }
}
