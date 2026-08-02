package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class RegistrationRequestCreator implements Parcelable.Creator<RegistrationRequest> {
    @Override // android.os.Parcelable.Creator
    public final RegistrationRequest createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        List list = Collections.EMPTY_LIST;
        String str = "";
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        byte[] bArr = null;
        byte[] bArr2 = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    bArr = SafeParcelReader.c(parcel, readInt);
                    break;
                case 2:
                    bArr2 = SafeParcelReader.c(parcel, readInt);
                    break;
                case 3:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    list = SafeParcelReader.k(parcel, readInt);
                    break;
                case 6:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 7:
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new RegistrationRequest(bArr, bArr2, str, str2, list, str3, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final RegistrationRequest[] newArray(int i) {
        return new RegistrationRequest[i];
    }
}
