package Y9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/* loaded from: classes2.dex */
public final class p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String str3 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i10 = 0;
        int i11 = 0;
        float f16 = 1.0f;
        float f17 = 0.5f;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 2:
                    latLng = (LatLng) E9.a.p(parcel, E10, LatLng.CREATOR);
                    break;
                case 3:
                    str = E9.a.q(parcel, E10);
                    break;
                case 4:
                    str2 = E9.a.q(parcel, E10);
                    break;
                case 5:
                    iBinder = E9.a.F(parcel, E10);
                    break;
                case 6:
                    f10 = E9.a.C(parcel, E10);
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
                    z12 = E9.a.x(parcel, E10);
                    break;
                case 11:
                    f12 = E9.a.C(parcel, E10);
                    break;
                case 12:
                    f17 = E9.a.C(parcel, E10);
                    break;
                case 13:
                    f13 = E9.a.C(parcel, E10);
                    break;
                case 14:
                    f16 = E9.a.C(parcel, E10);
                    break;
                case 15:
                    f14 = E9.a.C(parcel, E10);
                    break;
                case 16:
                default:
                    E9.a.M(parcel, E10);
                    break;
                case 17:
                    i10 = E9.a.G(parcel, E10);
                    break;
                case 18:
                    iBinder2 = E9.a.F(parcel, E10);
                    break;
                case 19:
                    i11 = E9.a.G(parcel, E10);
                    break;
                case 20:
                    str3 = E9.a.q(parcel, E10);
                    break;
                case 21:
                    f15 = E9.a.C(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new MarkerOptions(latLng, str, str2, iBinder, f10, f11, z10, z11, z12, f12, f17, f13, f16, f14, i10, iBinder2, i11, str3, f15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new MarkerOptions[i10];
    }
}
