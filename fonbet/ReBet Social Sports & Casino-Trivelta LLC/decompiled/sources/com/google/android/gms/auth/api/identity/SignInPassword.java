package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import z9.t;

@Deprecated
/* loaded from: classes2.dex */
public class SignInPassword extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInPassword> CREATOR = new t();

    /* renamed from: a, reason: collision with root package name */
    public final String f32186a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32187b;

    public SignInPassword(String str, String str2) {
        this.f32186a = AbstractC3191o.h(((String) AbstractC3191o.n(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.f32187b = AbstractC3191o.g(str2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        return AbstractC3189m.b(this.f32186a, signInPassword.f32186a) && AbstractC3189m.b(this.f32187b, signInPassword.f32187b);
    }

    public String g() {
        return this.f32187b;
    }

    public String getId() {
        return this.f32186a;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32186a, this.f32187b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, getId(), false);
        E9.b.F(parcel, 2, g(), false);
        E9.b.b(parcel, a10);
    }
}
