package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        String str2 = null;
        zaa zaaVar = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 1:
                    i10 = E9.a.G(parcel, E10);
                    break;
                case 2:
                    i11 = E9.a.G(parcel, E10);
                    break;
                case 3:
                    z10 = E9.a.x(parcel, E10);
                    break;
                case 4:
                    i12 = E9.a.G(parcel, E10);
                    break;
                case 5:
                    z11 = E9.a.x(parcel, E10);
                    break;
                case 6:
                    str = E9.a.q(parcel, E10);
                    break;
                case 7:
                    i13 = E9.a.G(parcel, E10);
                    break;
                case 8:
                    str2 = E9.a.q(parcel, E10);
                    break;
                case 9:
                    zaaVar = (zaa) E9.a.p(parcel, E10, zaa.CREATOR);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new FastJsonResponse.Field(i10, i11, z10, i12, z11, str, i13, str2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new FastJsonResponse.Field[i10];
    }
}
