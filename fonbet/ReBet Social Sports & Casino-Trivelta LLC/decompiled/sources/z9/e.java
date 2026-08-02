package z9;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        int i10 = 0;
        ArrayList arrayList = null;
        String str = null;
        Account account = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 1:
                    arrayList = E9.a.u(parcel, E10, Scope.CREATOR);
                    break;
                case 2:
                    str = E9.a.q(parcel, E10);
                    break;
                case 3:
                    z10 = E9.a.x(parcel, E10);
                    break;
                case 4:
                    z11 = E9.a.x(parcel, E10);
                    break;
                case 5:
                    account = (Account) E9.a.p(parcel, E10, Account.CREATOR);
                    break;
                case 6:
                    str2 = E9.a.q(parcel, E10);
                    break;
                case 7:
                    str3 = E9.a.q(parcel, E10);
                    break;
                case 8:
                    z12 = E9.a.x(parcel, E10);
                    break;
                case 9:
                    bundle = E9.a.f(parcel, E10);
                    break;
                case 10:
                    z13 = E9.a.x(parcel, E10);
                    break;
                case 11:
                    i10 = E9.a.G(parcel, E10);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new AuthorizationRequest(arrayList, str, z10, z11, account, str2, str3, z12, bundle, z13, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthorizationRequest[i10];
    }
}
