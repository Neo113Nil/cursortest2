package V9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionRequest;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class B implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        ArrayList arrayList = null;
        String str = null;
        ArrayList arrayList2 = null;
        String str2 = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                arrayList = E9.a.u(parcel, E10, ActivityTransition.CREATOR);
            } else if (w10 == 2) {
                str = E9.a.q(parcel, E10);
            } else if (w10 == 3) {
                arrayList2 = E9.a.u(parcel, E10, ClientIdentity.CREATOR);
            } else if (w10 != 4) {
                E9.a.M(parcel, E10);
            } else {
                str2 = E9.a.q(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new ActivityTransitionRequest(arrayList, str, arrayList2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ActivityTransitionRequest[i10];
    }
}
