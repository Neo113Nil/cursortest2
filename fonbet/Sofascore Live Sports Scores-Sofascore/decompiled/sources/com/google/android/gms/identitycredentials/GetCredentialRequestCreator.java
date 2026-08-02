package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class GetCredentialRequestCreator implements Parcelable.Creator<GetCredentialRequest> {
    @Override // android.os.Parcelable.Creator
    public final GetCredentialRequest createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        ArrayList arrayList = null;
        Bundle bundle = null;
        String str = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = SafeParcelReader.m(parcel, readInt, CredentialOption.CREATOR);
            } else if (c == 2) {
                bundle = SafeParcelReader.b(parcel, readInt);
            } else if (c == 3) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c != 4) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                resultReceiver = (ResultReceiver) SafeParcelReader.h(parcel, readInt, ResultReceiver.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, B);
        return new GetCredentialRequest(arrayList, bundle, str, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public final GetCredentialRequest[] newArray(int i) {
        return new GetCredentialRequest[i];
    }
}
