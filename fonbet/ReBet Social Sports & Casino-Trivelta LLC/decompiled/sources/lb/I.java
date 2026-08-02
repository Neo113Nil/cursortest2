package lb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.internal.zzbj;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class I implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                arrayList = E9.a.u(parcel, E10, PhoneMultiFactorInfo.CREATOR);
            } else if (w10 != 2) {
                E9.a.M(parcel, E10);
            } else {
                arrayList2 = E9.a.u(parcel, E10, TotpMultiFactorInfo.CREATOR);
            }
        }
        E9.a.v(parcel, N10);
        return new zzbj(arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbj[i10];
    }
}
