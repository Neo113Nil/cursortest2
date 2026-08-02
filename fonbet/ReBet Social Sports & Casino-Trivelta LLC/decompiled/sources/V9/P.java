package V9;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes2.dex */
public final class P implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        WorkSource workSource = new WorkSource();
        int i10 = 102;
        long j10 = 3600000;
        long j11 = 600000;
        long j12 = 0;
        long j13 = Long.MAX_VALUE;
        long j14 = Long.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        float f10 = 0.0f;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        long j15 = -1;
        String str = null;
        zzd zzdVar = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 1:
                    i10 = E9.a.G(parcel, E10);
                    break;
                case 2:
                    j10 = E9.a.I(parcel, E10);
                    break;
                case 3:
                    j11 = E9.a.I(parcel, E10);
                    break;
                case 4:
                default:
                    E9.a.M(parcel, E10);
                    break;
                case 5:
                    j13 = E9.a.I(parcel, E10);
                    break;
                case 6:
                    i11 = E9.a.G(parcel, E10);
                    break;
                case 7:
                    f10 = E9.a.C(parcel, E10);
                    break;
                case 8:
                    j12 = E9.a.I(parcel, E10);
                    break;
                case 9:
                    z10 = E9.a.x(parcel, E10);
                    break;
                case 10:
                    j14 = E9.a.I(parcel, E10);
                    break;
                case 11:
                    j15 = E9.a.I(parcel, E10);
                    break;
                case 12:
                    i12 = E9.a.G(parcel, E10);
                    break;
                case 13:
                    i13 = E9.a.G(parcel, E10);
                    break;
                case 14:
                    str = E9.a.q(parcel, E10);
                    break;
                case 15:
                    z11 = E9.a.x(parcel, E10);
                    break;
                case 16:
                    workSource = (WorkSource) E9.a.p(parcel, E10, WorkSource.CREATOR);
                    break;
                case 17:
                    zzdVar = (zzd) E9.a.p(parcel, E10, zzd.CREATOR);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new LocationRequest(i10, j10, j11, j12, j13, j14, i11, f10, z10, j15, i12, i13, str, z11, workSource, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
