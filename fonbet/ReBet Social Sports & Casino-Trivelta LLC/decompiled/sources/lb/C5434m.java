package lb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzam;
import java.util.ArrayList;

/* renamed from: lb.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5434m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        zzaf zzafVar = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                str = E9.a.q(parcel, E10);
            } else if (w10 == 2) {
                str2 = E9.a.q(parcel, E10);
            } else if (w10 == 3) {
                arrayList = E9.a.u(parcel, E10, PhoneMultiFactorInfo.CREATOR);
            } else if (w10 == 4) {
                arrayList2 = E9.a.u(parcel, E10, TotpMultiFactorInfo.CREATOR);
            } else if (w10 != 5) {
                E9.a.M(parcel, E10);
            } else {
                zzafVar = (zzaf) E9.a.p(parcel, E10, zzaf.CREATOR);
            }
        }
        E9.a.v(parcel, N10);
        return new zzam(str, str2, arrayList, arrayList2, zzafVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzam[i10];
    }
}
