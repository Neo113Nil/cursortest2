package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class CredentialOptionCreator implements Parcelable.Creator<CredentialOption> {
    @Override // android.os.Parcelable.Creator
    public final CredentialOption createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = "";
        String str2 = str;
        String str3 = str2;
        Bundle bundle = null;
        Bundle bundle2 = null;
        String str4 = null;
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
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new CredentialOption(str, bundle, bundle2, str4, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final CredentialOption[] newArray(int i) {
        return new CredentialOption[i];
    }
}
