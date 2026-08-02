package y9;

import E9.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.zzu;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import java.util.HashSet;

/* renamed from: y9.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6863d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        HashSet hashSet = new HashSet();
        int i10 = 0;
        zzw zzwVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                i10 = E9.a.G(parcel, E10);
                hashSet.add(1);
            } else if (w10 == 2) {
                zzwVar = (zzw) E9.a.p(parcel, E10, zzw.CREATOR);
                hashSet.add(2);
            } else if (w10 == 3) {
                str = E9.a.q(parcel, E10);
                hashSet.add(3);
            } else if (w10 == 4) {
                str2 = E9.a.q(parcel, E10);
                hashSet.add(4);
            } else if (w10 != 5) {
                E9.a.M(parcel, E10);
            } else {
                str3 = E9.a.q(parcel, E10);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == N10) {
            return new zzu(hashSet, i10, zzwVar, str, str2, str3);
        }
        throw new a.C0068a("Overread allowed size end=" + N10, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzu[i10];
    }
}
