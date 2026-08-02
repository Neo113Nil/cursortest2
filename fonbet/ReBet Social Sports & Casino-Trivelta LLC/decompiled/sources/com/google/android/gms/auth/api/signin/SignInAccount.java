package com.google.android.gms.auth.api.signin;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInAccount> CREATOR = new zbb();

    @Deprecated
    final String zba;

    @Deprecated
    final String zbb;
    private final GoogleSignInAccount zbc;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.zbc = googleSignInAccount;
        this.zba = AbstractC3191o.h(str, "8.3 and 8.4 SDKs require non-null email");
        this.zbb = AbstractC3191o.h(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String str = this.zba;
        int a10 = b.a(parcel);
        b.F(parcel, 4, str, false);
        b.D(parcel, 7, this.zbc, i10, false);
        b.F(parcel, 8, this.zbb, false);
        b.b(parcel, a10);
    }

    public final GoogleSignInAccount zba() {
        return this.zbc;
    }
}
