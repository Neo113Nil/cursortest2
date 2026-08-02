package V9;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.location.CurrentLocationRequest;

/* loaded from: classes2.dex */
public final class D implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        WorkSource workSource = new WorkSource();
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        int i12 = 102;
        String str = null;
        zzd zzdVar = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 1:
                    j10 = E9.a.I(parcel, E10);
                    break;
                case 2:
                    i10 = E9.a.G(parcel, E10);
                    break;
                case 3:
                    i12 = E9.a.G(parcel, E10);
                    break;
                case 4:
                    j11 = E9.a.I(parcel, E10);
                    break;
                case 5:
                    z10 = E9.a.x(parcel, E10);
                    break;
                case 6:
                    workSource = (WorkSource) E9.a.p(parcel, E10, WorkSource.CREATOR);
                    break;
                case 7:
                    i11 = E9.a.G(parcel, E10);
                    break;
                case 8:
                    str = E9.a.q(parcel, E10);
                    break;
                case 9:
                    zzdVar = (zzd) E9.a.p(parcel, E10, zzd.CREATOR);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new CurrentLocationRequest(j10, i10, i12, j11, z10, i11, str, workSource, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new CurrentLocationRequest[i10];
    }
}
