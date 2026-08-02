package com.google.android.gms.auth.api.signin;

import E9.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zab implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = a.N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < N10) {
            int E10 = a.E(parcel);
            switch (a.w(E10)) {
                case 1:
                    i10 = a.G(parcel, E10);
                    break;
                case 2:
                    str = a.q(parcel, E10);
                    break;
                case 3:
                    str2 = a.q(parcel, E10);
                    break;
                case 4:
                    str3 = a.q(parcel, E10);
                    break;
                case 5:
                    str4 = a.q(parcel, E10);
                    break;
                case 6:
                    uri = (Uri) a.p(parcel, E10, Uri.CREATOR);
                    break;
                case 7:
                    str5 = a.q(parcel, E10);
                    break;
                case 8:
                    j10 = a.I(parcel, E10);
                    break;
                case 9:
                    str6 = a.q(parcel, E10);
                    break;
                case 10:
                    arrayList = a.u(parcel, E10, Scope.CREATOR);
                    break;
                case 11:
                    str7 = a.q(parcel, E10);
                    break;
                case 12:
                    str8 = a.q(parcel, E10);
                    break;
                default:
                    a.M(parcel, E10);
                    break;
            }
        }
        a.v(parcel, N10);
        return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
