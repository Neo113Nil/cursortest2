package v9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.AccountChangeEventsRequest;

/* renamed from: v9.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6670e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        int i10 = 0;
        int i11 = 0;
        Account account = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                i10 = E9.a.G(parcel, E10);
            } else if (w10 == 2) {
                i11 = E9.a.G(parcel, E10);
            } else if (w10 == 3) {
                str = E9.a.q(parcel, E10);
            } else if (w10 != 4) {
                E9.a.M(parcel, E10);
            } else {
                account = (Account) E9.a.p(parcel, E10, Account.CREATOR);
            }
        }
        E9.a.v(parcel, N10);
        return new AccountChangeEventsRequest(i10, i11, str, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AccountChangeEventsRequest[i10];
    }
}
