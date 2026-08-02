package com.google.android.gms.fido.fido2.api.common;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        Account account = null;
        long j = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 2:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    bArr = SafeParcelReader.c(parcel, readInt);
                    break;
                case 4:
                    bArr2 = SafeParcelReader.c(parcel, readInt);
                    break;
                case 5:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 6:
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 7:
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                case '\b':
                    account = (Account) SafeParcelReader.h(parcel, readInt, Account.CREATOR);
                    break;
                case '\t':
                    z3 = SafeParcelReader.o(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new FidoCredentialDetails(str, str2, bArr, bArr2, z, z2, j, account, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FidoCredentialDetails[i];
    }
}
