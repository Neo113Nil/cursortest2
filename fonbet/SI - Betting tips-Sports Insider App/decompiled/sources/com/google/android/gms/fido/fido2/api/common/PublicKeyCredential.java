package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d9.e;
import g6.v;
import java.util.Arrays;
import k7.j1;
import k7.r0;
import q6.b;
import r4.k;
import y6.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new l(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f4709a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4710b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f4711c;

    /* renamed from: d, reason: collision with root package name */
    public final AuthenticatorAttestationResponse f4712d;

    /* renamed from: e, reason: collision with root package name */
    public final AuthenticatorAssertionResponse f4713e;

    /* renamed from: f, reason: collision with root package name */
    public final AuthenticatorErrorResponse f4714f;

    /* renamed from: g, reason: collision with root package name */
    public final AuthenticationExtensionsClientOutputs f4715g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4716h;

    public PublicKeyCredential(String str, String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3) {
        r0 h10 = bArr == null ? null : r0.h(bArr.length, bArr);
        boolean z5 = false;
        v.a("Must provide a response object.", (authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null));
        if (authenticatorErrorResponse != null || (str != null && h10 != null)) {
            z5 = true;
        }
        v.a("Must provide id and rawId if not an error response.", z5);
        this.f4709a = str;
        this.f4710b = str2;
        this.f4711c = h10;
        this.f4712d = authenticatorAttestationResponse;
        this.f4713e = authenticatorAssertionResponse;
        this.f4714f = authenticatorErrorResponse;
        this.f4715g = authenticationExtensionsClientOutputs;
        this.f4716h = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return v.k(this.f4709a, publicKeyCredential.f4709a) && v.k(this.f4710b, publicKeyCredential.f4710b) && v.k(this.f4711c, publicKeyCredential.f4711c) && v.k(this.f4712d, publicKeyCredential.f4712d) && v.k(this.f4713e, publicKeyCredential.f4713e) && v.k(this.f4714f, publicKeyCredential.f4714f) && v.k(this.f4715g, publicKeyCredential.f4715g) && v.k(this.f4716h, publicKeyCredential.f4716h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4709a, this.f4710b, this.f4711c, this.f4713e, this.f4712d, this.f4714f, this.f4715g, this.f4716h});
    }

    public final String toString() {
        r0 r0Var = this.f4711c;
        String c2 = b.c(r0Var == null ? null : r0Var.i());
        String valueOf = String.valueOf(this.f4712d);
        String valueOf2 = String.valueOf(this.f4713e);
        String valueOf3 = String.valueOf(this.f4714f);
        String valueOf4 = String.valueOf(this.f4715g);
        StringBuilder q = k.q("PublicKeyCredential{\n id='", this.f4709a, "', \n type='", this.f4710b, "', \n rawId=");
        k.s(q, c2, ", \n registerResponse=", valueOf, ", \n signResponse=");
        k.s(q, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        return e.n(q, valueOf4, ", \n authenticatorAttachment='", this.f4716h, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        j1.f18884a.c();
        throw null;
    }
}
