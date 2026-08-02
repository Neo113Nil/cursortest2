package U9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 2:
                    str = E9.a.q(parcel, E10);
                    break;
                case 3:
                    str2 = E9.a.q(parcel, E10);
                    break;
                case 4:
                    str3 = E9.a.q(parcel, E10);
                    break;
                case 5:
                    str4 = E9.a.q(parcel, E10);
                    break;
                case 6:
                    str5 = E9.a.q(parcel, E10);
                    break;
                case 7:
                    str6 = E9.a.q(parcel, E10);
                    break;
                case 8:
                    str7 = E9.a.q(parcel, E10);
                    break;
                case 9:
                    str8 = E9.a.q(parcel, E10);
                    break;
                case 10:
                    str9 = E9.a.q(parcel, E10);
                    break;
                case 11:
                    str10 = E9.a.q(parcel, E10);
                    break;
                case 12:
                    str11 = E9.a.q(parcel, E10);
                    break;
                case 13:
                    str12 = E9.a.q(parcel, E10);
                    break;
                case 14:
                    z10 = E9.a.x(parcel, E10);
                    break;
                case 15:
                    str13 = E9.a.q(parcel, E10);
                    break;
                case 16:
                    str14 = E9.a.q(parcel, E10);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new UserAddress(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z10, str13, str14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new UserAddress[i10];
    }
}
