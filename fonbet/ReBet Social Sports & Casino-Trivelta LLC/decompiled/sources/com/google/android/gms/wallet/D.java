package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class D implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        ArrayList c10 = K9.b.c();
        ArrayList c11 = K9.b.c();
        ArrayList c12 = K9.b.c();
        ArrayList arrayList = c10;
        ArrayList arrayList2 = c11;
        ArrayList arrayList3 = c12;
        ArrayList c13 = K9.b.c();
        ArrayList c14 = K9.b.c();
        ArrayList c15 = K9.b.c();
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
        TimeInterval timeInterval = null;
        String str11 = null;
        String str12 = null;
        LoyaltyPoints loyaltyPoints = null;
        int i10 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 2:
                    str = E9.a.q(parcel, E10);
                    break;
                case 3:
                    str2 = E9.a.q(parcel, E10);
                    break;
                case 4:
                    str3 = E9.a.q(parcel, E10);
                    break;
                case 5:
                    str4 = E9.a.q(parcel, E10);
                    break;
                case 6:
                    str5 = E9.a.q(parcel, E10);
                    break;
                case 7:
                    str6 = E9.a.q(parcel, E10);
                    break;
                case 8:
                    str7 = E9.a.q(parcel, E10);
                    break;
                case 9:
                    str8 = E9.a.q(parcel, E10);
                    break;
                case 10:
                    str9 = E9.a.q(parcel, E10);
                    break;
                case 11:
                    str10 = E9.a.q(parcel, E10);
                    break;
                case 12:
                    i10 = E9.a.G(parcel, E10);
                    break;
                case 13:
                    arrayList = E9.a.u(parcel, E10, WalletObjectMessage.CREATOR);
                    break;
                case 14:
                    timeInterval = (TimeInterval) E9.a.p(parcel, E10, TimeInterval.CREATOR);
                    break;
                case 15:
                    arrayList2 = E9.a.u(parcel, E10, LatLng.CREATOR);
                    break;
                case 16:
                    str11 = E9.a.q(parcel, E10);
                    break;
                case 17:
                    str12 = E9.a.q(parcel, E10);
                    break;
                case 18:
                    arrayList3 = E9.a.u(parcel, E10, LabelValueRow.CREATOR);
                    break;
                case 19:
                    z10 = E9.a.x(parcel, E10);
                    break;
                case 20:
                    c13 = E9.a.u(parcel, E10, UriData.CREATOR);
                    break;
                case 21:
                    c14 = E9.a.u(parcel, E10, TextModuleData.CREATOR);
                    break;
                case 22:
                    c15 = E9.a.u(parcel, E10, UriData.CREATOR);
                    break;
                case 23:
                    loyaltyPoints = (LoyaltyPoints) E9.a.p(parcel, E10, LoyaltyPoints.CREATOR);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new LoyaltyWalletObject(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i10, arrayList, timeInterval, arrayList2, str11, str12, arrayList3, z10, c13, c14, c15, loyaltyPoints);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LoyaltyWalletObject[i10];
    }
}
