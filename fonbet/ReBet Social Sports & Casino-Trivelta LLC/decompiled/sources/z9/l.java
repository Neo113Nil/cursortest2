package z9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.zbf;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList arrayList = null;
        boolean z10 = false;
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
                    i10 = E9.a.G(parcel, E10);
                    break;
                case 7:
                    arrayList = E9.a.u(parcel, E10, zbf.CREATOR);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new GetSignInIntentRequest(str, str2, str3, str4, z10, i10, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GetSignInIntentRequest[i10];
    }
}
