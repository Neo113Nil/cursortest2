package Y9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.FeatureStyle;

/* loaded from: classes2.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        Integer num = null;
        Integer num2 = null;
        Float f10 = null;
        Float f11 = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                num = E9.a.H(parcel, E10);
            } else if (w10 == 2) {
                num2 = E9.a.H(parcel, E10);
            } else if (w10 == 3) {
                f10 = E9.a.D(parcel, E10);
            } else if (w10 != 4) {
                E9.a.M(parcel, E10);
            } else {
                f11 = E9.a.D(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new FeatureStyle(num, num2, f10, f11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new FeatureStyle[i10];
    }
}
