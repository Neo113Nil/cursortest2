package lb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.internal.zzah;

/* renamed from: lb.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5428g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                j10 = E9.a.I(parcel, E10);
            } else if (w10 != 2) {
                E9.a.M(parcel, E10);
            } else {
                j11 = E9.a.I(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new zzah(j10, j11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzah[i10];
    }
}
