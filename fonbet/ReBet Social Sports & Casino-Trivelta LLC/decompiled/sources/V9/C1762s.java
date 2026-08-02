package V9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.zzac;

/* renamed from: V9.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1762s implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        int i10 = 1;
        int i11 = 1;
        long j10 = -1;
        long j11 = -1;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                i10 = E9.a.G(parcel, E10);
            } else if (w10 == 2) {
                i11 = E9.a.G(parcel, E10);
            } else if (w10 == 3) {
                j10 = E9.a.I(parcel, E10);
            } else if (w10 != 4) {
                E9.a.M(parcel, E10);
            } else {
                j11 = E9.a.I(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new zzac(i10, i11, j10, j11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzac[i10];
    }
}
