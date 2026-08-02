package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        String str4 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 1:
                    z10 = E9.a.x(parcel, E10);
                    break;
                case 2:
                    str = E9.a.q(parcel, E10);
                    break;
                case 3:
                    str2 = E9.a.q(parcel, E10);
                    break;
                case 4:
                    z11 = E9.a.x(parcel, E10);
                    break;
                case 5:
                    str3 = E9.a.q(parcel, E10);
                    break;
                case 6:
                    arrayList = E9.a.s(parcel, E10);
                    break;
                case 7:
                    z12 = E9.a.x(parcel, E10);
                    break;
                case 8:
                    arrayList2 = E9.a.u(parcel, E10, zbf.CREATOR);
                    break;
                case 9:
                    str4 = E9.a.q(parcel, E10);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(z10, str, str2, z11, str3, arrayList, z12, arrayList2, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i10];
    }
}
