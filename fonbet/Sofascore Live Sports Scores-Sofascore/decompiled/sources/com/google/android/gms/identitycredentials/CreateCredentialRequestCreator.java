package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class CreateCredentialRequestCreator implements Parcelable.Creator<CreateCredentialRequest> {
    @Override // android.os.Parcelable.Creator
    public final CreateCredentialRequest createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        Bundle bundle = null;
        Bundle bundle2 = null;
        String str2 = null;
        String str3 = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 2:
                    bundle = SafeParcelReader.b(parcel, readInt);
                    break;
                case 3:
                    bundle2 = SafeParcelReader.b(parcel, readInt);
                    break;
                case 4:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    resultReceiver = (ResultReceiver) SafeParcelReader.h(parcel, readInt, ResultReceiver.CREATOR);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new CreateCredentialRequest(str, bundle, bundle2, str2, str3, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public final CreateCredentialRequest[] newArray(int i) {
        return new CreateCredentialRequest[i];
    }
}
