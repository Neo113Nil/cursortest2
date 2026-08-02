package kb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.ActionCodeSettings;

/* loaded from: classes3.dex */
public final class I implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 1:
                    str = E9.a.q(parcel, E10);
                    break;
                case 2:
                    str2 = E9.a.q(parcel, E10);
                    break;
                case 3:
                    str3 = E9.a.q(parcel, E10);
                    break;
                case 4:
                    str4 = E9.a.q(parcel, E10);
                    break;
                case 5:
                    z10 = E9.a.x(parcel, E10);
                    break;
                case 6:
                    str5 = E9.a.q(parcel, E10);
                    break;
                case 7:
                    z11 = E9.a.x(parcel, E10);
                    break;
                case 8:
                    str6 = E9.a.q(parcel, E10);
                    break;
                case 9:
                    i10 = E9.a.G(parcel, E10);
                    break;
                case 10:
                    str7 = E9.a.q(parcel, E10);
                    break;
                case 11:
                    str8 = E9.a.q(parcel, E10);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new ActionCodeSettings(str, str2, str3, str4, z10, str5, z11, str6, i10, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ActionCodeSettings[i10];
    }
}
