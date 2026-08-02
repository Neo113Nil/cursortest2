package T9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.UserAddressRequest;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            if (E9.a.w(E10) != 2) {
                E9.a.M(parcel, E10);
            } else {
                arrayList = E9.a.u(parcel, E10, CountrySpecification.CREATOR);
            }
        }
        E9.a.v(parcel, N10);
        return new UserAddressRequest(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new UserAddressRequest[i10];
    }
}
