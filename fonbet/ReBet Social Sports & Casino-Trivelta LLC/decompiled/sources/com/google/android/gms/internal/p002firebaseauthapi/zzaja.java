package com.google.android.gms.internal.p002firebaseauthapi;

import E9.a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzaja implements Parcelable.Creator<zzajb> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzajb createFromParcel(Parcel parcel) {
        int N10 = a.N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < N10) {
            int E10 = a.E(parcel);
            switch (a.w(E10)) {
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
                    str5 = a.q(parcel, E10);
                    break;
                case 7:
                    str6 = a.q(parcel, E10);
                    break;
                case 8:
                    str7 = a.q(parcel, E10);
                    break;
                case 9:
                    str8 = a.q(parcel, E10);
                    break;
                case 10:
                    z10 = a.x(parcel, E10);
                    break;
                case 11:
                    z11 = a.x(parcel, E10);
                    break;
                case 12:
                    str9 = a.q(parcel, E10);
                    break;
                case 13:
                    str10 = a.q(parcel, E10);
                    break;
                case 14:
                    str11 = a.q(parcel, E10);
                    break;
                case 15:
                    str12 = a.q(parcel, E10);
                    break;
                case 16:
                    z12 = a.x(parcel, E10);
                    break;
                case 17:
                    str13 = a.q(parcel, E10);
                    break;
                default:
                    a.M(parcel, E10);
                    break;
            }
        }
        a.v(parcel, N10);
        return new zzajb(str, str2, str3, str4, str5, str6, str7, str8, z10, z11, str9, str10, str11, str12, z12, str13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzajb[] newArray(int i10) {
        return new zzajb[i10];
    }
}
