package ha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;

/* loaded from: classes2.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        String str2 = null;
        TimeInterval timeInterval = null;
        UriData uriData = null;
        UriData uriData2 = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 2) {
                str = E9.a.q(parcel, E10);
            } else if (w10 == 3) {
                str2 = E9.a.q(parcel, E10);
            } else if (w10 == 4) {
                timeInterval = (TimeInterval) E9.a.p(parcel, E10, TimeInterval.CREATOR);
            } else if (w10 == 5) {
                uriData = (UriData) E9.a.p(parcel, E10, UriData.CREATOR);
            } else if (w10 != 6) {
                E9.a.M(parcel, E10);
            } else {
                uriData2 = (UriData) E9.a.p(parcel, E10, UriData.CREATOR);
            }
        }
        E9.a.v(parcel, N10);
        return new WalletObjectMessage(str, str2, timeInterval, uriData, uriData2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new WalletObjectMessage[i10];
    }
}
