package com.google.android.gms.internal.wallet;

import E9.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;

/* loaded from: classes2.dex */
public final class zzn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = a.N(parcel);
        String[] strArr = null;
        int[] iArr = null;
        RemoteViews remoteViews = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < N10) {
            int E10 = a.E(parcel);
            int w10 = a.w(E10);
            if (w10 == 1) {
                strArr = a.r(parcel, E10);
            } else if (w10 == 2) {
                iArr = a.k(parcel, E10);
            } else if (w10 == 3) {
                remoteViews = (RemoteViews) a.p(parcel, E10, RemoteViews.CREATOR);
            } else if (w10 != 4) {
                a.M(parcel, E10);
            } else {
                bArr = a.g(parcel, E10);
            }
        }
        a.v(parcel, N10);
        return new zzm(strArr, iArr, remoteViews, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzm[i10];
    }
}
