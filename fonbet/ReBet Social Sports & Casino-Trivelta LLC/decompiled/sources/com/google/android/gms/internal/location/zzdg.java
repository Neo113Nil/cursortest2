package com.google.android.gms.internal.location;

import E9.a;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzdg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = a.N(parcel);
        int i10 = 1;
        zzdd zzddVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder3 = null;
        String str = null;
        while (parcel.dataPosition() < N10) {
            int E10 = a.E(parcel);
            switch (a.w(E10)) {
                case 1:
                    i10 = a.G(parcel, E10);
                    break;
                case 2:
                    zzddVar = (zzdd) a.p(parcel, E10, zzdd.CREATOR);
                    break;
                case 3:
                    iBinder = a.F(parcel, E10);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) a.p(parcel, E10, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = a.F(parcel, E10);
                    break;
                case 6:
                    iBinder3 = a.F(parcel, E10);
                    break;
                case 7:
                default:
                    a.M(parcel, E10);
                    break;
                case 8:
                    str = a.q(parcel, E10);
                    break;
            }
        }
        a.v(parcel, N10);
        return new zzdf(i10, zzddVar, iBinder, iBinder2, pendingIntent, iBinder3, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdf[i10];
    }
}
