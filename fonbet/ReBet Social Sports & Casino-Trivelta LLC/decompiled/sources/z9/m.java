package z9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                arrayList = E9.a.u(parcel, E10, Scope.CREATOR);
            } else if (w10 == 2) {
                account = (Account) E9.a.p(parcel, E10, Account.CREATOR);
            } else if (w10 != 3) {
                E9.a.M(parcel, E10);
            } else {
                str = E9.a.q(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new RevokeAccessRequest(arrayList, account, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new RevokeAccessRequest[i10];
    }
}
