package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Deprecated
/* loaded from: classes.dex */
public class SignInPassword extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInPassword> CREATOR = new u5.b(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f4370a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4371b;

    public SignInPassword(String str, String str2) {
        v.i(str, "Account identifier cannot be null");
        String trim = str.trim();
        v.f(trim, "Account identifier cannot be empty");
        this.f4370a = trim;
        v.e(str2);
        this.f4371b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        return v.k(this.f4370a, signInPassword.f4370a) && v.k(this.f4371b, signInPassword.f4371b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4370a, this.f4371b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.O(parcel, 1, this.f4370a, false);
        h8.b.O(parcel, 2, this.f4371b, false);
        h8.b.W(parcel, V);
    }
}
