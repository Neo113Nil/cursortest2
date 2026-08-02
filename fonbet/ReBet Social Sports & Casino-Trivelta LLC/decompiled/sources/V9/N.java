package V9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.location.LastLocationRequest;

/* loaded from: classes2.dex */
public final class N implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        long j10 = Long.MAX_VALUE;
        int i10 = 0;
        boolean z10 = false;
        String str = null;
        zzd zzdVar = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                j10 = E9.a.I(parcel, E10);
            } else if (w10 == 2) {
                i10 = E9.a.G(parcel, E10);
            } else if (w10 == 3) {
                z10 = E9.a.x(parcel, E10);
            } else if (w10 == 4) {
                str = E9.a.q(parcel, E10);
            } else if (w10 != 5) {
                E9.a.M(parcel, E10);
            } else {
                zzdVar = (zzd) E9.a.p(parcel, E10, zzd.CREATOR);
            }
        }
        E9.a.v(parcel, N10);
        return new LastLocationRequest(j10, i10, z10, str, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LastLocationRequest[i10];
    }
}
