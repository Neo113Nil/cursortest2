package y9;

import E9.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.zzo;
import com.google.android.gms.auth.api.accounttransfer.zzs;
import com.google.android.gms.auth.api.accounttransfer.zzu;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: y9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6860a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        HashSet hashSet = new HashSet();
        int i10 = 0;
        ArrayList arrayList = null;
        zzs zzsVar = null;
        int i11 = 0;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                i10 = E9.a.G(parcel, E10);
                hashSet.add(1);
            } else if (w10 == 2) {
                arrayList = E9.a.u(parcel, E10, zzu.CREATOR);
                hashSet.add(2);
            } else if (w10 == 3) {
                i11 = E9.a.G(parcel, E10);
                hashSet.add(3);
            } else if (w10 != 4) {
                E9.a.M(parcel, E10);
            } else {
                zzsVar = (zzs) E9.a.p(parcel, E10, zzs.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == N10) {
            return new zzo(hashSet, i10, arrayList, i11, zzsVar);
        }
        throw new a.C0068a("Overread allowed size end=" + N10, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzo[i10];
    }
}
