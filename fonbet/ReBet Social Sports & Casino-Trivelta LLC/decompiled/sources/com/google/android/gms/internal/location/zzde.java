package com.google.android.gms.internal.location;

import E9.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzde implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = a.N(parcel);
        LocationRequest locationRequest = null;
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        long j10 = Long.MAX_VALUE;
        while (parcel.dataPosition() < N10) {
            int E10 = a.E(parcel);
            int w10 = a.w(E10);
            if (w10 == 1) {
                locationRequest = (LocationRequest) a.p(parcel, E10, LocationRequest.CREATOR);
            } else if (w10 != 5) {
                switch (w10) {
                    case 8:
                        z10 = a.x(parcel, E10);
                        break;
                    case 9:
                        z11 = a.x(parcel, E10);
                        break;
                    case 10:
                        str = a.q(parcel, E10);
                        break;
                    case 11:
                        z12 = a.x(parcel, E10);
                        break;
                    case 12:
                        z13 = a.x(parcel, E10);
                        break;
                    case 13:
                        str2 = a.q(parcel, E10);
                        break;
                    case 14:
                        j10 = a.I(parcel, E10);
                        break;
                    default:
                        a.M(parcel, E10);
                        break;
                }
            } else {
                arrayList = a.u(parcel, E10, ClientIdentity.CREATOR);
            }
        }
        a.v(parcel, N10);
        return new zzdd(locationRequest, arrayList, z10, z11, str, z12, z13, str2, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdd[i10];
    }
}
