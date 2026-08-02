package V9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;

/* renamed from: V9.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1761q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        Status status = null;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                status = (Status) E9.a.p(parcel, E10, Status.CREATOR);
            } else if (w10 != 2) {
                E9.a.M(parcel, E10);
            } else {
                locationSettingsStates = (LocationSettingsStates) E9.a.p(parcel, E10, LocationSettingsStates.CREATOR);
            }
        }
        E9.a.v(parcel, N10);
        return new LocationSettingsResult(status, locationSettingsStates);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationSettingsResult[i10];
    }
}
