package Y9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes2.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        float f10 = 0.0f;
        float f11 = 0.0f;
        LatLng latLng = null;
        float f12 = 0.0f;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 2) {
                latLng = (LatLng) E9.a.p(parcel, E10, LatLng.CREATOR);
            } else if (w10 == 3) {
                f10 = E9.a.C(parcel, E10);
            } else if (w10 == 4) {
                f12 = E9.a.C(parcel, E10);
            } else if (w10 != 5) {
                E9.a.M(parcel, E10);
            } else {
                f11 = E9.a.C(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new CameraPosition(latLng, f10, f12, f11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new CameraPosition[i10];
    }
}
