package da;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;

/* loaded from: classes2.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        ConnectionResult connectionResult = null;
        int i10 = 0;
        zav zavVar = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                i10 = E9.a.G(parcel, E10);
            } else if (w10 == 2) {
                connectionResult = (ConnectionResult) E9.a.p(parcel, E10, ConnectionResult.CREATOR);
            } else if (w10 != 3) {
                E9.a.M(parcel, E10);
            } else {
                zavVar = (zav) E9.a.p(parcel, E10, zav.CREATOR);
            }
        }
        E9.a.v(parcel, N10);
        return new zak(i10, connectionResult, zavVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zak[i10];
    }
}
