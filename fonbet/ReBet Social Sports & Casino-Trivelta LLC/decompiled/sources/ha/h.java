package ha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.LoyaltyPointsBalance;
import com.google.android.gms.wallet.wobs.TimeInterval;

/* loaded from: classes2.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        LoyaltyPointsBalance loyaltyPointsBalance = null;
        TimeInterval timeInterval = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 2) {
                str = E9.a.q(parcel, E10);
            } else if (w10 == 3) {
                loyaltyPointsBalance = (LoyaltyPointsBalance) E9.a.p(parcel, E10, LoyaltyPointsBalance.CREATOR);
            } else if (w10 != 5) {
                E9.a.M(parcel, E10);
            } else {
                timeInterval = (TimeInterval) E9.a.p(parcel, E10, TimeInterval.CREATOR);
            }
        }
        E9.a.v(parcel, N10);
        return new LoyaltyPoints(str, loyaltyPointsBalance, timeInterval);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LoyaltyPoints[i10];
    }
}
