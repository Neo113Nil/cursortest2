package com.google.android.gms.fido.fido2.api.common;

import R9.x;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class AuthenticationExtensionsCredPropsOutputs extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensionsCredPropsOutputs> CREATOR = new x();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f32890a;

    public AuthenticationExtensionsCredPropsOutputs(boolean z10) {
        this.f32890a = z10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AuthenticationExtensionsCredPropsOutputs) && this.f32890a == ((AuthenticationExtensionsCredPropsOutputs) obj).f32890a;
    }

    public boolean g() {
        return this.f32890a;
    }

    public int hashCode() {
        return AbstractC3189m.c(Boolean.valueOf(this.f32890a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.g(parcel, 1, g());
        E9.b.b(parcel, a10);
    }
}
