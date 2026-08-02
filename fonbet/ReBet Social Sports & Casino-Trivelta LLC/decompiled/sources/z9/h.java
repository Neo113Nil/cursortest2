package z9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.zbf;

/* loaded from: classes2.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        boolean z10 = false;
        String str = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                str = E9.a.q(parcel, E10);
            } else if (w10 != 2) {
                E9.a.M(parcel, E10);
            } else {
                z10 = E9.a.x(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new zbf(str, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zbf[i10];
    }
}
