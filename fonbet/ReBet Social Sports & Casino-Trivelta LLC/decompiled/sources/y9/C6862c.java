package y9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.zzs;
import java.util.ArrayList;

/* renamed from: y9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6862c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        int i10 = 0;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 1:
                    i10 = E9.a.G(parcel, E10);
                    break;
                case 2:
                    arrayList = E9.a.s(parcel, E10);
                    break;
                case 3:
                    arrayList2 = E9.a.s(parcel, E10);
                    break;
                case 4:
                    arrayList3 = E9.a.s(parcel, E10);
                    break;
                case 5:
                    arrayList4 = E9.a.s(parcel, E10);
                    break;
                case 6:
                    arrayList5 = E9.a.s(parcel, E10);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new zzs(i10, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzs[i10];
    }
}
