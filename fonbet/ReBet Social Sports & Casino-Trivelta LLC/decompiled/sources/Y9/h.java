package Y9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.StampStyle;
import com.google.android.gms.maps.model.StrokeStyle;

/* loaded from: classes2.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        StampStyle stampStyle = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        float f10 = 0.0f;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 2) {
                f10 = E9.a.C(parcel, E10);
            } else if (w10 == 3) {
                i10 = E9.a.G(parcel, E10);
            } else if (w10 == 4) {
                i11 = E9.a.G(parcel, E10);
            } else if (w10 == 5) {
                z10 = E9.a.x(parcel, E10);
            } else if (w10 != 6) {
                E9.a.M(parcel, E10);
            } else {
                stampStyle = (StampStyle) E9.a.p(parcel, E10, StampStyle.CREATOR);
            }
        }
        E9.a.v(parcel, N10);
        return new StrokeStyle(f10, i10, i11, z10, stampStyle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new StrokeStyle[i10];
    }
}
