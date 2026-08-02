package ha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.LoyaltyPointsBalance;

/* loaded from: classes2.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        int i10 = -1;
        long j10 = 0;
        String str = null;
        String str2 = null;
        double d10 = 0.0d;
        int i11 = 0;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 2:
                    i11 = E9.a.G(parcel, E10);
                    break;
                case 3:
                    str = E9.a.q(parcel, E10);
                    break;
                case 4:
                    d10 = E9.a.A(parcel, E10);
                    break;
                case 5:
                    str2 = E9.a.q(parcel, E10);
                    break;
                case 6:
                    j10 = E9.a.I(parcel, E10);
                    break;
                case 7:
                    i10 = E9.a.G(parcel, E10);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new LoyaltyPointsBalance(i11, str, d10, str2, j10, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LoyaltyPointsBalance[i10];
    }
}
