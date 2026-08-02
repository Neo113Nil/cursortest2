package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import u5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInAccount> CREATOR = new b(14);

    /* renamed from: a, reason: collision with root package name */
    public final String f4412a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInAccount f4413b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4414c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f4413b = googleSignInAccount;
        v.f(str, "8.3 and 8.4 SDKs require non-null email");
        this.f4412a = str;
        v.f(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f4414c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.O(parcel, 4, this.f4412a, false);
        h8.b.N(parcel, 7, this.f4413b, i5, false);
        h8.b.O(parcel, 8, this.f4414c, false);
        h8.b.W(parcel, V);
    }
}
