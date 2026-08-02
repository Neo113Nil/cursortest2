package v9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.TokenData;
import java.util.ArrayList;

/* renamed from: v9.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6678m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        Long l10 = null;
        ArrayList arrayList = null;
        String str2 = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 1:
                    i10 = E9.a.G(parcel, E10);
                    break;
                case 2:
                    str = E9.a.q(parcel, E10);
                    break;
                case 3:
                    l10 = E9.a.J(parcel, E10);
                    break;
                case 4:
                    z10 = E9.a.x(parcel, E10);
                    break;
                case 5:
                    z11 = E9.a.x(parcel, E10);
                    break;
                case 6:
                    arrayList = E9.a.s(parcel, E10);
                    break;
                case 7:
                    str2 = E9.a.q(parcel, E10);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new TokenData(i10, str, l10, z10, z11, arrayList, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new TokenData[i10];
    }
}
