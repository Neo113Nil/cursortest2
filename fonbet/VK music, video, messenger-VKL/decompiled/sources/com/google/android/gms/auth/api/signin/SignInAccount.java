package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.exc0;
import xsna.ozg0;
import xsna.qqz0;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes12.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInAccount> CREATOR = new qqz0();

    @Deprecated
    public final String b;
    public final GoogleSignInAccount c;

    @Deprecated
    public final String d;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.c = googleSignInAccount;
        exc0.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.b = str;
        exc0.g(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 4, this.b, false);
        ozg0.p(parcel, 7, this.c, i, false);
        ozg0.q(parcel, 8, this.d, false);
        ozg0.x(w, parcel);
    }
}
