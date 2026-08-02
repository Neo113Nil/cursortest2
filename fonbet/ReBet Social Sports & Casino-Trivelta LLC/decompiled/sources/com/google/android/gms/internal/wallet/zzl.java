package com.google.android.gms.internal.wallet;

import E9.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = a.N(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < N10) {
            int E10 = a.E(parcel);
            if (a.w(E10) != 1) {
                a.M(parcel, E10);
            } else {
                pendingIntent = (PendingIntent) a.p(parcel, E10, PendingIntent.CREATOR);
            }
        }
        a.v(parcel, N10);
        return new zzk(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzk[i10];
    }
}
