package W9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes2.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        int i10 = 0;
        int i11 = 0;
        CameraPosition cameraPosition = null;
        Float f10 = null;
        Float f11 = null;
        LatLngBounds latLngBounds = null;
        Integer num = null;
        String str = null;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        byte b13 = -1;
        byte b14 = -1;
        byte b15 = -1;
        byte b16 = -1;
        byte b17 = -1;
        byte b18 = -1;
        byte b19 = -1;
        byte b20 = -1;
        byte b21 = -1;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 2:
                    b10 = E9.a.z(parcel, E10);
                    break;
                case 3:
                    b11 = E9.a.z(parcel, E10);
                    break;
                case 4:
                    i10 = E9.a.G(parcel, E10);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) E9.a.p(parcel, E10, CameraPosition.CREATOR);
                    break;
                case 6:
                    b12 = E9.a.z(parcel, E10);
                    break;
                case 7:
                    b13 = E9.a.z(parcel, E10);
                    break;
                case 8:
                    b14 = E9.a.z(parcel, E10);
                    break;
                case 9:
                    b15 = E9.a.z(parcel, E10);
                    break;
                case 10:
                    b16 = E9.a.z(parcel, E10);
                    break;
                case 11:
                    b17 = E9.a.z(parcel, E10);
                    break;
                case 12:
                    b18 = E9.a.z(parcel, E10);
                    break;
                case 13:
                case 22:
                default:
                    E9.a.M(parcel, E10);
                    break;
                case 14:
                    b19 = E9.a.z(parcel, E10);
                    break;
                case 15:
                    b20 = E9.a.z(parcel, E10);
                    break;
                case 16:
                    f10 = E9.a.D(parcel, E10);
                    break;
                case 17:
                    f11 = E9.a.D(parcel, E10);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) E9.a.p(parcel, E10, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b21 = E9.a.z(parcel, E10);
                    break;
                case 20:
                    num = E9.a.H(parcel, E10);
                    break;
                case 21:
                    str = E9.a.q(parcel, E10);
                    break;
                case 23:
                    i11 = E9.a.G(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new GoogleMapOptions(b10, b11, i10, cameraPosition, b12, b13, b14, b15, b16, b17, b18, b19, b20, f10, f11, latLngBounds, b21, num, str, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleMapOptions[i10];
    }
}
