package z9;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        GoogleSignInAccount googleSignInAccount = null;
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 1:
                    str = E9.a.q(parcel, E10);
                    break;
                case 2:
                    str2 = E9.a.q(parcel, E10);
                    break;
                case 3:
                    str3 = E9.a.q(parcel, E10);
                    break;
                case 4:
                    arrayList = E9.a.s(parcel, E10);
                    break;
                case 5:
                    googleSignInAccount = (GoogleSignInAccount) E9.a.p(parcel, E10, GoogleSignInAccount.CREATOR);
                    break;
                case 6:
                    pendingIntent = (PendingIntent) E9.a.p(parcel, E10, PendingIntent.CREATOR);
                    break;
                case 7:
                    bundle = E9.a.f(parcel, E10);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new AuthorizationResult(str, str2, str3, arrayList, googleSignInAccount, pendingIntent, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthorizationResult[i10];
    }
}
