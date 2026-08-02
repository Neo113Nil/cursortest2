package com.google.android.gms.fido.fido2.api.common;

import R9.C;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;

/* loaded from: classes2.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new C();

    /* renamed from: a, reason: collision with root package name */
    public final ErrorCode f32891a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32892b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32893c;

    public AuthenticatorErrorResponse(int i10, String str, int i11) {
        try {
            this.f32891a = ErrorCode.b(i10);
            this.f32892b = str;
            this.f32893c = i11;
        } catch (ErrorCode.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        return AbstractC3189m.b(this.f32891a, authenticatorErrorResponse.f32891a) && AbstractC3189m.b(this.f32892b, authenticatorErrorResponse.f32892b) && AbstractC3189m.b(Integer.valueOf(this.f32893c), Integer.valueOf(authenticatorErrorResponse.f32893c));
    }

    public int g() {
        return this.f32891a.a();
    }

    public String h() {
        return this.f32892b;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32891a, this.f32892b, Integer.valueOf(this.f32893c));
    }

    public String toString() {
        zzam zza = zzan.zza(this);
        zza.zza("errorCode", this.f32891a.a());
        String str = this.f32892b;
        if (str != null) {
            zza.zzb("errorMessage", str);
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 2, g());
        E9.b.F(parcel, 3, h(), false);
        E9.b.u(parcel, 4, this.f32893c);
        E9.b.b(parcel, a10);
    }
}
