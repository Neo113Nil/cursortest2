package lb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzal;
import com.google.firebase.auth.internal.zzam;
import com.google.firebase.auth.zze;
import java.util.ArrayList;

/* renamed from: lb.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5432k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        ArrayList arrayList = null;
        zzam zzamVar = null;
        String str = null;
        zze zzeVar = null;
        zzaf zzafVar = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 1:
                    arrayList = E9.a.u(parcel, E10, PhoneMultiFactorInfo.CREATOR);
                    break;
                case 2:
                    zzamVar = (zzam) E9.a.p(parcel, E10, zzam.CREATOR);
                    break;
                case 3:
                    str = E9.a.q(parcel, E10);
                    break;
                case 4:
                    zzeVar = (zze) E9.a.p(parcel, E10, zze.CREATOR);
                    break;
                case 5:
                    zzafVar = (zzaf) E9.a.p(parcel, E10, zzaf.CREATOR);
                    break;
                case 6:
                    arrayList2 = E9.a.u(parcel, E10, TotpMultiFactorInfo.CREATOR);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new zzal(arrayList, zzamVar, str, zzeVar, zzafVar, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzal[i10];
    }
}
