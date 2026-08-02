package com.google.android.gms.internal.p002firebaseauthapi;

import E9.a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzahu implements Parcelable.Creator<zzahv> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzahv createFromParcel(Parcel parcel) {
        int N10 = a.N(parcel);
        String str = null;
        String str2 = null;
        Long l10 = null;
        String str3 = null;
        Long l11 = null;
        while (parcel.dataPosition() < N10) {
            int E10 = a.E(parcel);
            int w10 = a.w(E10);
            if (w10 == 2) {
                str = a.q(parcel, E10);
            } else if (w10 == 3) {
                str2 = a.q(parcel, E10);
            } else if (w10 == 4) {
                l10 = a.J(parcel, E10);
            } else if (w10 == 5) {
                str3 = a.q(parcel, E10);
            } else if (w10 != 6) {
                a.M(parcel, E10);
            } else {
                l11 = a.J(parcel, E10);
            }
        }
        a.v(parcel, N10);
        return new zzahv(str, str2, l10, str3, l11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzahv[] newArray(int i10) {
        return new zzahv[i10];
    }
}
