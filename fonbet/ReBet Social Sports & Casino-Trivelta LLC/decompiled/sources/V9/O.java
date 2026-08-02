package V9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.zzac;

/* loaded from: classes2.dex */
public final class O implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        int i10 = 1000;
        int i11 = 1;
        int i12 = 1;
        long j10 = 0;
        zzac[] zzacVarArr = null;
        boolean z10 = false;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 1:
                    i11 = E9.a.G(parcel, E10);
                    break;
                case 2:
                    i12 = E9.a.G(parcel, E10);
                    break;
                case 3:
                    j10 = E9.a.I(parcel, E10);
                    break;
                case 4:
                    i10 = E9.a.G(parcel, E10);
                    break;
                case 5:
                    zzacVarArr = (zzac[]) E9.a.t(parcel, E10, zzac.CREATOR);
                    break;
                case 6:
                    z10 = E9.a.x(parcel, E10);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new LocationAvailability(i10, i11, i12, j10, zzacVarArr, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
