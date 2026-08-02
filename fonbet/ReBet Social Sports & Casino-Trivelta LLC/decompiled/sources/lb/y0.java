package lb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.internal.zzz;
import com.google.firebase.auth.zze;

/* loaded from: classes3.dex */
public final class y0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        zzaf zzafVar = null;
        zzx zzxVar = null;
        zze zzeVar = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                zzafVar = (zzaf) E9.a.p(parcel, E10, zzaf.CREATOR);
            } else if (w10 == 2) {
                zzxVar = (zzx) E9.a.p(parcel, E10, zzx.CREATOR);
            } else if (w10 != 3) {
                E9.a.M(parcel, E10);
            } else {
                zzeVar = (zze) E9.a.p(parcel, E10, zze.CREATOR);
            }
        }
        E9.a.v(parcel, N10);
        return new zzz(zzafVar, zzxVar, zzeVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzz[i10];
    }
}
