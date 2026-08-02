package V9;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.zzb;

/* loaded from: classes2.dex */
public final class x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        long j10 = 0;
        long j11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        WorkSource workSource = null;
        String str = null;
        int[] iArr = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 1:
                    j10 = E9.a.I(parcel, E10);
                    break;
                case 2:
                    z10 = E9.a.x(parcel, E10);
                    break;
                case 3:
                    workSource = (WorkSource) E9.a.p(parcel, E10, WorkSource.CREATOR);
                    break;
                case 4:
                    str = E9.a.q(parcel, E10);
                    break;
                case 5:
                    iArr = E9.a.k(parcel, E10);
                    break;
                case 6:
                    z11 = E9.a.x(parcel, E10);
                    break;
                case 7:
                    str2 = E9.a.q(parcel, E10);
                    break;
                case 8:
                    j11 = E9.a.I(parcel, E10);
                    break;
                case 9:
                    str3 = E9.a.q(parcel, E10);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new zzb(j10, z10, workSource, str, iArr, z11, str2, j11, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzb[i10];
    }
}
