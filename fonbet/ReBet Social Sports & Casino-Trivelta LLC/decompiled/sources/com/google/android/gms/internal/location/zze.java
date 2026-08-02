package com.google.android.gms.internal.location;

import E9.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import java.util.List;

/* loaded from: classes2.dex */
public final class zze implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = a.N(parcel);
        List zzk = zzds.zzk();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        zzd zzdVar = null;
        while (parcel.dataPosition() < N10) {
            int E10 = a.E(parcel);
            switch (a.w(E10)) {
                case 1:
                    i10 = a.G(parcel, E10);
                    break;
                case 2:
                    i11 = a.G(parcel, E10);
                    break;
                case 3:
                    str = a.q(parcel, E10);
                    break;
                case 4:
                    str2 = a.q(parcel, E10);
                    break;
                case 5:
                    i12 = a.G(parcel, E10);
                    break;
                case 6:
                    str3 = a.q(parcel, E10);
                    break;
                case 7:
                    zzdVar = (zzd) a.p(parcel, E10, zzd.CREATOR);
                    break;
                case 8:
                    zzk = a.u(parcel, E10, Feature.CREATOR);
                    break;
                default:
                    a.M(parcel, E10);
                    break;
            }
        }
        a.v(parcel, N10);
        return new zzd(i10, i11, str, str2, str3, i12, zzk, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzd[i10];
    }
}
