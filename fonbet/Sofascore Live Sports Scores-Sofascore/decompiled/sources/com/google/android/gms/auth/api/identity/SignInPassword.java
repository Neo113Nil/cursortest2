package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@Deprecated
/* loaded from: classes3.dex */
public class SignInPassword extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInPassword> CREATOR = new zbw();
    public final String a;
    public final String b;

    public SignInPassword(String str, String str2) {
        Preconditions.j(str, "Account identifier cannot be null");
        String trim = str.trim();
        Preconditions.g(trim, "Account identifier cannot be empty");
        this.a = trim;
        Preconditions.f(str2);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        return Objects.a(this.a, signInPassword.a) && Objects.a(this.b, signInPassword.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 1, this.a, false);
        SafeParcelWriter.m(parcel, 2, this.b, false);
        SafeParcelWriter.t(parcel, s);
    }
}
