package com.google.android.gms.fido.fido2.api.common;

import R9.C1559j;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new C1559j();

    /* renamed from: a, reason: collision with root package name */
    public final String f32918a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32919b;

    /* renamed from: c, reason: collision with root package name */
    public final AuthenticatorAttestationResponse f32920c;

    /* renamed from: d, reason: collision with root package name */
    public final AuthenticatorAssertionResponse f32921d;

    /* renamed from: e, reason: collision with root package name */
    public final AuthenticatorErrorResponse f32922e;

    /* renamed from: f, reason: collision with root package name */
    public final AuthenticationExtensionsClientOutputs f32923f;

    /* renamed from: g, reason: collision with root package name */
    public final String f32924g;

    @NonNull
    private final byte[] zzc;

    public PublicKeyCredential(String str, String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3) {
        boolean z10 = true;
        if ((authenticatorAttestationResponse == null || authenticatorAssertionResponse != null || authenticatorErrorResponse != null) && ((authenticatorAttestationResponse != null || authenticatorAssertionResponse == null || authenticatorErrorResponse != null) && (authenticatorAttestationResponse != null || authenticatorAssertionResponse != null || authenticatorErrorResponse == null))) {
            z10 = false;
        }
        AbstractC3191o.a(z10);
        this.f32918a = str;
        this.f32919b = str2;
        this.zzc = bArr;
        this.f32920c = authenticatorAttestationResponse;
        this.f32921d = authenticatorAssertionResponse;
        this.f32922e = authenticatorErrorResponse;
        this.f32923f = authenticationExtensionsClientOutputs;
        this.f32924g = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return AbstractC3189m.b(this.f32918a, publicKeyCredential.f32918a) && AbstractC3189m.b(this.f32919b, publicKeyCredential.f32919b) && Arrays.equals(this.zzc, publicKeyCredential.zzc) && AbstractC3189m.b(this.f32920c, publicKeyCredential.f32920c) && AbstractC3189m.b(this.f32921d, publicKeyCredential.f32921d) && AbstractC3189m.b(this.f32922e, publicKeyCredential.f32922e) && AbstractC3189m.b(this.f32923f, publicKeyCredential.f32923f) && AbstractC3189m.b(this.f32924g, publicKeyCredential.f32924g);
    }

    public String g() {
        return this.f32924g;
    }

    public String getId() {
        return this.f32918a;
    }

    public AuthenticationExtensionsClientOutputs h() {
        return this.f32923f;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32918a, this.f32919b, this.zzc, this.f32921d, this.f32920c, this.f32922e, this.f32923f, this.f32924g);
    }

    public byte[] i() {
        return this.zzc;
    }

    public String j() {
        return this.f32919b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, getId(), false);
        E9.b.F(parcel, 2, j(), false);
        E9.b.l(parcel, 3, i(), false);
        E9.b.D(parcel, 4, this.f32920c, i10, false);
        E9.b.D(parcel, 5, this.f32921d, i10, false);
        E9.b.D(parcel, 6, this.f32922e, i10, false);
        E9.b.D(parcel, 7, h(), i10, false);
        E9.b.F(parcel, 8, g(), false);
        E9.b.b(parcel, a10);
    }
}
