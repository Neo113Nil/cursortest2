package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zad implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        Account account = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 2:
                    arrayList2 = SafeParcelReader.m(parcel, readInt, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.h(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 5:
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 6:
                    z3 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 7:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\b':
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\t':
                    arrayList = SafeParcelReader.m(parcel, readInt, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case '\n':
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new GoogleSignInOptions(i, arrayList2, account, z, z2, z3, str, str2, GoogleSignInOptions.Z0(arrayList), str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
