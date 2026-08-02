package com.google.android.gms.internal.auth;

import E9.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzbc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = a.N(parcel);
        String str = null;
        int i10 = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < N10) {
            int E10 = a.E(parcel);
            int w10 = a.w(E10);
            if (w10 == 1) {
                i10 = a.G(parcel, E10);
            } else if (w10 == 2) {
                str = a.q(parcel, E10);
            } else if (w10 != 3) {
                a.M(parcel, E10);
            } else {
                pendingIntent = (PendingIntent) a.p(parcel, E10, PendingIntent.CREATOR);
            }
        }
        a.v(parcel, N10);
        return new zzbb(i10, str, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbb[i10];
    }
}
