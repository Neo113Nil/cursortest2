package Y9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.Cap;

/* loaded from: classes2.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        IBinder iBinder = null;
        int i10 = 0;
        Float f10 = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 2) {
                i10 = E9.a.G(parcel, E10);
            } else if (w10 == 3) {
                iBinder = E9.a.F(parcel, E10);
            } else if (w10 != 4) {
                E9.a.M(parcel, E10);
            } else {
                f10 = E9.a.D(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new Cap(i10, iBinder, f10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Cap[i10];
    }
}
