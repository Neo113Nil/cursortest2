package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import g6.v;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import k7.a1;
import k7.b1;
import k7.d1;
import k7.j0;
import k7.l0;
import k7.q0;
import k7.r;
import k7.r0;
import k7.v0;
import k7.w0;
import k7.x0;
import k7.y0;
import k7.z0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q6.b;
import y6.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new l(21);

    /* renamed from: a, reason: collision with root package name */
    public final r0 f4667a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f4668b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f4669c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f4670d;

    public AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        v.h(bArr);
        r0 h10 = r0.h(bArr.length, bArr);
        v.h(bArr2);
        r0 h11 = r0.h(bArr2.length, bArr2);
        v.h(bArr3);
        r0 h12 = r0.h(bArr3.length, bArr3);
        this.f4667a = h10;
        this.f4668b = h11;
        this.f4669c = h12;
        v.h(strArr);
        this.f4670d = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0223 A[Catch: JSONException -> 0x0021, TRY_LEAVE, TryCatch #3 {JSONException -> 0x0021, blocks: (B:3:0x000a, B:5:0x0013, B:8:0x0028, B:9:0x0035, B:10:0x003c, B:12:0x003f, B:14:0x0049, B:16:0x0054, B:17:0x004f, B:20:0x0057, B:22:0x0060, B:24:0x006a, B:26:0x007b, B:27:0x0083, B:29:0x0091, B:31:0x00a3, B:33:0x00c1, B:35:0x00d0, B:36:0x00d9, B:40:0x00e6, B:41:0x00e9, B:42:0x00ef, B:47:0x0111, B:53:0x020f, B:55:0x0223, B:58:0x0134, B:60:0x0145, B:65:0x015f, B:68:0x017b, B:70:0x0190, B:72:0x0195, B:73:0x01b6, B:74:0x01bb, B:75:0x01bc, B:76:0x01c3, B:81:0x01d0, B:83:0x01dd, B:85:0x01ea, B:86:0x0203, B:87:0x0208, B:88:0x0209, B:89:0x020e, B:91:0x0230, B:92:0x0235, B:95:0x0236, B:96:0x023d, B:97:0x023e, B:98:0x0244, B:104:0x0246, B:105:0x0249, B:108:0x00d3, B:110:0x024d, B:111:0x0254, B:113:0x0257, B:114:0x025e, B:116:0x025f, B:117:0x0266, B:118:0x0269, B:119:0x0270, B:121:0x0271, B:122:0x0278, B:125:0x027c, B:126:0x0283), top: B:2:0x000a, inners: #1, #4, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject c() {
        byte[] bArr;
        String[] strArr = this.f4670d;
        try {
            JSONObject jSONObject = new JSONObject();
            r0 r0Var = this.f4668b;
            if (r0Var != null) {
                jSONObject.put("clientDataJSON", b.c(r0Var.i()));
            }
            r0 r0Var2 = this.f4669c;
            if (r0Var2 != null) {
                jSONObject.put("attestationObject", b.c(r0Var2.i()));
            }
            JSONArray jSONArray = new JSONArray();
            for (int i5 = 0; i5 < strArr.length; i5++) {
                if (strArr[i5].equals("cable")) {
                    jSONArray.put(i5, "hybrid");
                } else {
                    jSONArray.put(i5, strArr[i5]);
                }
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    b1 b1Var = (b1) ((y0) b1.e(r0Var2.i()).c(y0.class)).f18941b.get(new z0("authData"));
                    if (b1Var == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    r0 r0Var3 = ((v0) b1Var.c(v0.class)).f18927a;
                    byte[] bArr2 = r0Var3.f18915b;
                    ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(bArr2, 0, r0Var3.d()).asReadOnlyBuffer();
                    try {
                        asReadOnlyBuffer.position(asReadOnlyBuffer.position() + 32);
                        if ((asReadOnlyBuffer.get() & 64) == 0) {
                            throw new IllegalArgumentException("authData does not include credential data");
                        }
                        asReadOnlyBuffer.position(asReadOnlyBuffer.position() + 4);
                        asReadOnlyBuffer.position(asReadOnlyBuffer.position() + 16);
                        asReadOnlyBuffer.position(asReadOnlyBuffer.position() + asReadOnlyBuffer.getShort());
                        try {
                            try {
                                int position = asReadOnlyBuffer.position();
                                int g10 = r0.g(position, bArr2.length, r0Var3.d());
                                d1 d1Var = new d1((g10 == 0 ? r0.f18913c : new q0(bArr2, position, g10)).f());
                                try {
                                    r rVar = ((y0) k7.a.l(d1Var).c(y0.class)).f18941b;
                                    b1 b1Var2 = (b1) rVar.get(new x0(3L));
                                    b1 b1Var3 = (b1) rVar.get(new x0(1L));
                                    if (b1Var2 == null || b1Var3 == null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    try {
                                        long j = ((x0) b1Var2.c(x0.class)).f18937a;
                                        long j6 = ((x0) b1Var3.c(x0.class)).f18937a;
                                        byte[] bArr3 = null;
                                        if (j6 != 1) {
                                            if (j6 == 2) {
                                                j6 = 2;
                                            }
                                            bArr = bArr3;
                                            jSONObject.put("authenticatorData", b.c(r0Var3.i()));
                                            jSONObject.put("publicKeyAlgorithm", j);
                                            if (bArr != null) {
                                                jSONObject.put("publicKey", Base64.encodeToString(bArr, 11));
                                            }
                                            return jSONObject;
                                        }
                                        b1 b1Var4 = (b1) rVar.get(new x0(-1L));
                                        if (b1Var4 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        long j10 = ((x0) b1Var4.c(x0.class)).f18937a;
                                        if (j6 == 2 && j10 == 1) {
                                            b1 b1Var5 = (b1) rVar.get(new x0(-2L));
                                            b1 b1Var6 = (b1) rVar.get(new x0(-3L));
                                            if (b1Var5 == null || b1Var6 == null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            r0 r0Var4 = ((v0) b1Var5.c(v0.class)).f18927a;
                                            r0 r0Var5 = ((v0) b1Var6.c(v0.class)).f18927a;
                                            if (r0Var4.f18915b.length != 32 || r0Var5.f18915b.length != 32) {
                                                throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                            }
                                            bArr3 = k7.a.k(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), r0Var4.i(), r0Var5.i());
                                        } else if (j6 == 1 && j10 == 6) {
                                            b1 b1Var7 = (b1) rVar.get(new x0(-2L));
                                            if (b1Var7 == null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            r0 r0Var6 = ((v0) b1Var7.c(v0.class)).f18927a;
                                            if (r0Var6.f18915b.length != 32) {
                                                throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                            }
                                            bArr3 = k7.a.k(Base64.decode("MCowBQYDK2VwAyEA", 0), r0Var6.i());
                                        }
                                        bArr = bArr3;
                                        jSONObject.put("authenticatorData", b.c(r0Var3.i()));
                                        jSONObject.put("publicKeyAlgorithm", j);
                                        if (bArr != null) {
                                        }
                                        return jSONObject;
                                    } catch (a1 e7) {
                                        throw new IllegalArgumentException("COSE key ill-formed", e7);
                                    }
                                } finally {
                                    try {
                                        d1Var.close();
                                    } catch (IOException unused) {
                                    }
                                }
                            } catch (w0 e9) {
                                e = e9;
                                throw new IllegalArgumentException("failed to parse COSE key", e);
                            }
                        } catch (a1 e10) {
                            e = e10;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        }
                    } catch (IllegalArgumentException e11) {
                        throw new IllegalArgumentException("ill-formed authenticator data", e11);
                    }
                } catch (a1 e12) {
                    throw new IllegalArgumentException("authData value has wrong type", e12);
                }
            } catch (a1 e13) {
                e = e13;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            } catch (w0 e14) {
                e = e14;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            }
        } catch (JSONException e15) {
            throw new RuntimeException("Error encoding AuthenticatorAttestationResponse to JSON object", e15);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return v.k(this.f4667a, authenticatorAttestationResponse.f4667a) && v.k(this.f4668b, authenticatorAttestationResponse.f4668b) && v.k(this.f4669c, authenticatorAttestationResponse.f4669c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f4667a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4668b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4669c}))});
    }

    public final String toString() {
        androidx.appcompat.app.v0 c2 = k7.a.c(this);
        j0 j0Var = l0.f18889d;
        byte[] i5 = this.f4667a.i();
        c2.a0(j0Var.c(i5.length, i5), "keyHandle");
        byte[] i10 = this.f4668b.i();
        c2.a0(j0Var.c(i10.length, i10), "clientDataJSON");
        byte[] i11 = this.f4669c.i();
        c2.a0(j0Var.c(i11.length, i11), "attestationObject");
        c2.a0(Arrays.toString(this.f4670d), "transports");
        return c2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.G(parcel, 2, this.f4667a.i(), false);
        h8.b.G(parcel, 3, this.f4668b.i(), false);
        h8.b.G(parcel, 4, this.f4669c.i(), false);
        String[] strArr = this.f4670d;
        if (strArr != null) {
            int V2 = h8.b.V(parcel, 5);
            parcel.writeStringArray(strArr);
            h8.b.W(parcel, V2);
        }
        h8.b.W(parcel, V);
    }
}
