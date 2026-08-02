package I9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.zal;
import com.google.android.gms.common.server.response.zam;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        int i10 = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                i10 = E9.a.G(parcel, E10);
            } else if (w10 == 2) {
                str = E9.a.q(parcel, E10);
            } else if (w10 != 3) {
                E9.a.M(parcel, E10);
            } else {
                arrayList = E9.a.u(parcel, E10, zam.CREATOR);
            }
        }
        E9.a.v(parcel, N10);
        return new zal(i10, str, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zal[i10];
    }
}
