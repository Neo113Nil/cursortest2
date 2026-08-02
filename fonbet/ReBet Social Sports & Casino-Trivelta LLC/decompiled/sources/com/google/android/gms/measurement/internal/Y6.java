package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class Y6 implements Parcelable.Creator {
    public static void a(zzpl zzplVar, Parcel parcel, int i10) {
        int i11 = zzplVar.f34450a;
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, i11);
        E9.b.F(parcel, 2, zzplVar.f34451b, false);
        E9.b.y(parcel, 3, zzplVar.f34452c);
        E9.b.A(parcel, 4, zzplVar.f34453d, false);
        E9.b.s(parcel, 5, null, false);
        E9.b.F(parcel, 6, zzplVar.f34454e, false);
        E9.b.F(parcel, 7, zzplVar.f34455f, false);
        E9.b.p(parcel, 8, zzplVar.f34456g, false);
        E9.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        Long l10 = null;
        Float f10 = null;
        String str2 = null;
        String str3 = null;
        Double d10 = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 1:
                    i10 = E9.a.G(parcel, E10);
                    break;
                case 2:
                    str = E9.a.q(parcel, E10);
                    break;
                case 3:
                    j10 = E9.a.I(parcel, E10);
                    break;
                case 4:
                    l10 = E9.a.J(parcel, E10);
                    break;
                case 5:
                    f10 = E9.a.D(parcel, E10);
                    break;
                case 6:
                    str2 = E9.a.q(parcel, E10);
                    break;
                case 7:
                    str3 = E9.a.q(parcel, E10);
                    break;
                case 8:
                    d10 = E9.a.B(parcel, E10);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new zzpl(i10, str, j10, l10, f10, str2, str3, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzpl[i10];
    }
}
