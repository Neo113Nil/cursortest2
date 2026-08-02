package kb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaiz;
import com.google.firebase.auth.TotpMultiFactorInfo;

/* loaded from: classes3.dex */
public final class Z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        String str2 = null;
        zzaiz zzaizVar = null;
        long j10 = 0;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                str = E9.a.q(parcel, E10);
            } else if (w10 == 2) {
                str2 = E9.a.q(parcel, E10);
            } else if (w10 == 3) {
                j10 = E9.a.I(parcel, E10);
            } else if (w10 != 4) {
                E9.a.M(parcel, E10);
            } else {
                zzaizVar = (zzaiz) E9.a.p(parcel, E10, zzaiz.CREATOR);
            }
        }
        E9.a.v(parcel, N10);
        return new TotpMultiFactorInfo(str, str2, j10, zzaizVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new TotpMultiFactorInfo[i10];
    }
}
