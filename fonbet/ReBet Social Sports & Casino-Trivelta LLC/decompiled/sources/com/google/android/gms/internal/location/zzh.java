package com.google.android.gms.internal.location;

import E9.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class zzh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = a.N(parcel);
        Status status = null;
        while (parcel.dataPosition() < N10) {
            int E10 = a.E(parcel);
            if (a.w(E10) != 1) {
                a.M(parcel, E10);
            } else {
                status = (Status) a.p(parcel, E10, Status.CREATOR);
            }
        }
        a.v(parcel, N10);
        return new zzg(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzg[i10];
    }
}
