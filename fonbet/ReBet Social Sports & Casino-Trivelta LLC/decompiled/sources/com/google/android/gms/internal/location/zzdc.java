package com.google.android.gms.internal.location;

import E9.a;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzdc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = a.N(parcel);
        int i10 = 0;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < N10) {
            int E10 = a.E(parcel);
            switch (a.w(E10)) {
                case 1:
                    i10 = a.G(parcel, E10);
                    break;
                case 2:
                    iBinder = a.F(parcel, E10);
                    break;
                case 3:
                    iBinder2 = a.F(parcel, E10);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) a.p(parcel, E10, PendingIntent.CREATOR);
                    break;
                case 5:
                    str = a.q(parcel, E10);
                    break;
                case 6:
                    str2 = a.q(parcel, E10);
                    break;
                default:
                    a.M(parcel, E10);
                    break;
            }
        }
        a.v(parcel, N10);
        return new zzdb(i10, iBinder, iBinder2, pendingIntent, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdb[i10];
    }
}
