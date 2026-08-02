package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3262h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        String str2 = null;
        zzpl zzplVar = null;
        String str3 = null;
        zzbg zzbgVar = null;
        zzbg zzbgVar2 = null;
        zzbg zzbgVar3 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 2:
                    str = E9.a.q(parcel, E10);
                    break;
                case 3:
                    str2 = E9.a.q(parcel, E10);
                    break;
                case 4:
                    zzplVar = (zzpl) E9.a.p(parcel, E10, zzpl.CREATOR);
                    break;
                case 5:
                    j10 = E9.a.I(parcel, E10);
                    break;
                case 6:
                    z10 = E9.a.x(parcel, E10);
                    break;
                case 7:
                    str3 = E9.a.q(parcel, E10);
                    break;
                case 8:
                    zzbgVar = (zzbg) E9.a.p(parcel, E10, zzbg.CREATOR);
                    break;
                case 9:
                    j11 = E9.a.I(parcel, E10);
                    break;
                case 10:
                    zzbgVar2 = (zzbg) E9.a.p(parcel, E10, zzbg.CREATOR);
                    break;
                case 11:
                    j12 = E9.a.I(parcel, E10);
                    break;
                case 12:
                    zzbgVar3 = (zzbg) E9.a.p(parcel, E10, zzbg.CREATOR);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new zzah(str, str2, zzplVar, j10, z10, str3, zzbgVar, j11, zzbgVar2, j12, zzbgVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzah[i10];
    }
}
