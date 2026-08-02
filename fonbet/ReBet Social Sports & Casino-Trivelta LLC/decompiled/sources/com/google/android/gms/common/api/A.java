package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes2.dex */
public final class A implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        ConnectionResult connectionResult = null;
        int i10 = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                i10 = E9.a.G(parcel, E10);
            } else if (w10 == 2) {
                str = E9.a.q(parcel, E10);
            } else if (w10 == 3) {
                pendingIntent = (PendingIntent) E9.a.p(parcel, E10, PendingIntent.CREATOR);
            } else if (w10 != 4) {
                E9.a.M(parcel, E10);
            } else {
                connectionResult = (ConnectionResult) E9.a.p(parcel, E10, ConnectionResult.CREATOR);
            }
        }
        E9.a.v(parcel, N10);
        return new Status(i10, str, pendingIntent, connectionResult);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
