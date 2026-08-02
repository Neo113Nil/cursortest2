package com.google.android.gms.auth.api.signin;

import E9.a;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zae implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = a.N(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < N10) {
            int E10 = a.E(parcel);
            switch (a.w(E10)) {
                case 1:
                    i10 = a.G(parcel, E10);
                    break;
                case 2:
                    arrayList = a.u(parcel, E10, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) a.p(parcel, E10, Account.CREATOR);
                    break;
                case 4:
                    z10 = a.x(parcel, E10);
                    break;
                case 5:
                    z11 = a.x(parcel, E10);
                    break;
                case 6:
                    z12 = a.x(parcel, E10);
                    break;
                case 7:
                    str = a.q(parcel, E10);
                    break;
                case 8:
                    str2 = a.q(parcel, E10);
                    break;
                case 9:
                    arrayList2 = a.u(parcel, E10, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    str3 = a.q(parcel, E10);
                    break;
                default:
                    a.M(parcel, E10);
                    break;
            }
        }
        a.v(parcel, N10);
        return new GoogleSignInOptions(i10, arrayList, account, z10, z11, z12, str, str2, arrayList2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
