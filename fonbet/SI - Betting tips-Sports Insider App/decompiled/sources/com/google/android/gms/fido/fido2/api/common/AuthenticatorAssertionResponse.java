package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.appcompat.app.v0;
import g6.v;
import java.util.Arrays;
import k7.j0;
import k7.l0;
import k7.r0;
import org.json.JSONException;
import org.json.JSONObject;
import q6.b;
import y6.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new l(20);

    /* renamed from: a, reason: collision with root package name */
    public final r0 f4662a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f4663b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f4664c;

    /* renamed from: d, reason: collision with root package name */
    public final r0 f4665d;

    /* renamed from: e, reason: collision with root package name */
    public final r0 f4666e;

    public AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        v.h(bArr);
        r0 h10 = r0.h(bArr.length, bArr);
        v.h(bArr2);
        r0 h11 = r0.h(bArr2.length, bArr2);
        v.h(bArr3);
        r0 h12 = r0.h(bArr3.length, bArr3);
        v.h(bArr4);
        r0 h13 = r0.h(bArr4.length, bArr4);
        r0 h14 = bArr5 == null ? null : r0.h(bArr5.length, bArr5);
        this.f4662a = h10;
        this.f4663b = h11;
        this.f4664c = h12;
        this.f4665d = h13;
        this.f4666e = h14;
    }

    public final JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", b.c(this.f4663b.i()));
            jSONObject.put("authenticatorData", b.c(this.f4664c.i()));
            jSONObject.put("signature", b.c(this.f4665d.i()));
            r0 r0Var = this.f4666e;
            if (r0Var == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", b.c(r0Var == null ? null : r0Var.i()));
            return jSONObject;
        } catch (JSONException e7) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return v.k(this.f4662a, authenticatorAssertionResponse.f4662a) && v.k(this.f4663b, authenticatorAssertionResponse.f4663b) && v.k(this.f4664c, authenticatorAssertionResponse.f4664c) && v.k(this.f4665d, authenticatorAssertionResponse.f4665d) && v.k(this.f4666e, authenticatorAssertionResponse.f4666e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f4662a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4663b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4664c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4665d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4666e}))});
    }

    public final String toString() {
        v0 c2 = k7.a.c(this);
        j0 j0Var = l0.f18889d;
        byte[] i5 = this.f4662a.i();
        c2.a0(j0Var.c(i5.length, i5), "keyHandle");
        byte[] i10 = this.f4663b.i();
        c2.a0(j0Var.c(i10.length, i10), "clientDataJSON");
        byte[] i11 = this.f4664c.i();
        c2.a0(j0Var.c(i11.length, i11), "authenticatorData");
        byte[] i12 = this.f4665d.i();
        c2.a0(j0Var.c(i12.length, i12), "signature");
        r0 r0Var = this.f4666e;
        byte[] i13 = r0Var == null ? null : r0Var.i();
        if (i13 != null) {
            c2.a0(j0Var.c(i13.length, i13), "userHandle");
        }
        return c2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.G(parcel, 2, this.f4662a.i(), false);
        h8.b.G(parcel, 3, this.f4663b.i(), false);
        h8.b.G(parcel, 4, this.f4664c.i(), false);
        h8.b.G(parcel, 5, this.f4665d.i(), false);
        r0 r0Var = this.f4666e;
        h8.b.G(parcel, 6, r0Var == null ? null : r0Var.i(), false);
        h8.b.W(parcel, V);
    }
}
