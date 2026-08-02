package Y9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        LatLng latLng = null;
        ArrayList arrayList = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        float f10 = 0.0f;
        float f11 = 0.0f;
        double d10 = 0.0d;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 2:
                    latLng = (LatLng) E9.a.p(parcel, E10, LatLng.CREATOR);
                    break;
                case 3:
                    d10 = E9.a.A(parcel, E10);
                    break;
                case 4:
                    f10 = E9.a.C(parcel, E10);
                    break;
                case 5:
                    i10 = E9.a.G(parcel, E10);
                    break;
                case 6:
                    i11 = E9.a.G(parcel, E10);
                    break;
                case 7:
                    f11 = E9.a.C(parcel, E10);
                    break;
                case 8:
                    z10 = E9.a.x(parcel, E10);
                    break;
                case 9:
                    z11 = E9.a.x(parcel, E10);
                    break;
                case 10:
                    arrayList = E9.a.u(parcel, E10, PatternItem.CREATOR);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new CircleOptions(latLng, d10, f10, i10, i11, f11, z10, z11, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new CircleOptions[i10];
    }
}
