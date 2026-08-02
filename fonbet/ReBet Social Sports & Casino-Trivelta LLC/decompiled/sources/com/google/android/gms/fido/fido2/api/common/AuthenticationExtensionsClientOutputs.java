package com.google.android.gms.fido.fido2.api.common;

import R9.v;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new v();

    /* renamed from: a, reason: collision with root package name */
    public final UvmEntries f32886a;

    /* renamed from: b, reason: collision with root package name */
    public final zzf f32887b;

    /* renamed from: c, reason: collision with root package name */
    public final AuthenticationExtensionsCredPropsOutputs f32888c;

    /* renamed from: d, reason: collision with root package name */
    public final zzh f32889d;

    public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, zzf zzfVar, AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, zzh zzhVar) {
        this.f32886a = uvmEntries;
        this.f32887b = zzfVar;
        this.f32888c = authenticationExtensionsCredPropsOutputs;
        this.f32889d = zzhVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        return AbstractC3189m.b(this.f32886a, authenticationExtensionsClientOutputs.f32886a) && AbstractC3189m.b(this.f32887b, authenticationExtensionsClientOutputs.f32887b) && AbstractC3189m.b(this.f32888c, authenticationExtensionsClientOutputs.f32888c) && AbstractC3189m.b(this.f32889d, authenticationExtensionsClientOutputs.f32889d);
    }

    public AuthenticationExtensionsCredPropsOutputs g() {
        return this.f32888c;
    }

    public UvmEntries h() {
        return this.f32886a;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32886a, this.f32887b, this.f32888c, this.f32889d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.D(parcel, 1, h(), i10, false);
        E9.b.D(parcel, 2, this.f32887b, i10, false);
        E9.b.D(parcel, 3, g(), i10, false);
        E9.b.D(parcel, 4, this.f32889d, i10, false);
        E9.b.b(parcel, a10);
    }
}
