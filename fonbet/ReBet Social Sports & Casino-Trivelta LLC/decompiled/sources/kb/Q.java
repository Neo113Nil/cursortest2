package kb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.GithubAuthCredential;

/* loaded from: classes3.dex */
public final class Q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            if (E9.a.w(E10) != 1) {
                E9.a.M(parcel, E10);
            } else {
                str = E9.a.q(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new GithubAuthCredential(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GithubAuthCredential[i10];
    }
}
