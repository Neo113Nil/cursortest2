package kb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.EmailAuthCredential;

/* loaded from: classes3.dex */
public final class e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                str = E9.a.q(parcel, E10);
            } else if (w10 == 2) {
                str2 = E9.a.q(parcel, E10);
            } else if (w10 == 3) {
                str3 = E9.a.q(parcel, E10);
            } else if (w10 == 4) {
                str4 = E9.a.q(parcel, E10);
            } else if (w10 != 5) {
                E9.a.M(parcel, E10);
            } else {
                z10 = E9.a.x(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new EmailAuthCredential(str, str2, str3, str4, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new EmailAuthCredential[i10];
    }
}
