package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class E implements Parcelable.Creator {
    public static void a(zzbg zzbgVar, Parcel parcel, int i10) {
        String str = zzbgVar.f34435a;
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 2, str, false);
        E9.b.D(parcel, 3, zzbgVar.f34436b, i10, false);
        E9.b.F(parcel, 4, zzbgVar.f34437c, false);
        E9.b.y(parcel, 5, zzbgVar.f34438d);
        E9.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        long j10 = 0;
        String str = null;
        zzbe zzbeVar = null;
        String str2 = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 2) {
                str = E9.a.q(parcel, E10);
            } else if (w10 == 3) {
                zzbeVar = (zzbe) E9.a.p(parcel, E10, zzbe.CREATOR);
            } else if (w10 == 4) {
                str2 = E9.a.q(parcel, E10);
            } else if (w10 != 5) {
                E9.a.M(parcel, E10);
            } else {
                j10 = E9.a.I(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new zzbg(str, zzbeVar, str2, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbg[i10];
    }
}
