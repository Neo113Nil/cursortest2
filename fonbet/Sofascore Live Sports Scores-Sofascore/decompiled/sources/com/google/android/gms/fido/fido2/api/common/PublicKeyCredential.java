package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzia;
import com.google.android.gms.internal.fido.zzib;
import defpackage.bf3;
import defpackage.fc6;
import defpackage.mz1;
import defpackage.vp2;
import defpackage.xgo;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new zzao();
    public final String a;
    public final String b;
    public final xgo c;
    public final AuthenticatorAttestationResponse d;
    public final AuthenticatorAssertionResponse e;
    public final AuthenticatorErrorResponse f;
    public final AuthenticationExtensionsClientOutputs g;
    public final String h;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Builder {
    }

    public PublicKeyCredential(String str, String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3) {
        xgo r = bArr == null ? null : zzgx.r(bArr.length, bArr);
        boolean z = false;
        Preconditions.a("Must provide a response object.", (authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null));
        if (authenticatorErrorResponse != null || (str != null && r != null)) {
            z = true;
        }
        Preconditions.a("Must provide id and rawId if not an error response.", z);
        this.a = str;
        this.b = str2;
        this.c = r;
        this.d = authenticatorAttestationResponse;
        this.e = authenticatorAssertionResponse;
        this.f = authenticatorErrorResponse;
        this.g = authenticationExtensionsClientOutputs;
        this.h = str3;
    }

    public final JSONObject Y0() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            xgo xgoVar = this.c;
            if (xgoVar != null && xgoVar.s().length > 0) {
                jSONObject2.put("rawId", Base64Utils.b(xgoVar.s()));
            }
            String str = this.h;
            if (str != null) {
                jSONObject2.put("authenticatorAttachment", str);
            }
            String str2 = this.b;
            AuthenticatorErrorResponse authenticatorErrorResponse = this.f;
            if (str2 != null && authenticatorErrorResponse == null) {
                jSONObject2.put("type", str2);
            }
            String str3 = this.a;
            if (str3 != null) {
                jSONObject2.put("id", str3);
            }
            String str4 = "response";
            AuthenticatorAssertionResponse authenticatorAssertionResponse = this.e;
            boolean z = true;
            if (authenticatorAssertionResponse != null) {
                jSONObject = authenticatorAssertionResponse.Y0();
            } else {
                AuthenticatorAttestationResponse authenticatorAttestationResponse = this.d;
                if (authenticatorAttestationResponse != null) {
                    jSONObject = authenticatorAttestationResponse.Y0();
                } else {
                    z = false;
                    if (authenticatorErrorResponse != null) {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("code", authenticatorErrorResponse.a.a);
                            String str5 = authenticatorErrorResponse.b;
                            if (str5 != null) {
                                jSONObject3.put(PglCryptUtils.KEY_MESSAGE, str5);
                            }
                            jSONObject = jSONObject3;
                            str4 = "error";
                        } catch (JSONException e) {
                            throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
                        }
                    } else {
                        jSONObject = null;
                    }
                }
            }
            if (jSONObject != null) {
                jSONObject2.put(str4, jSONObject);
            }
            AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.g;
            if (authenticationExtensionsClientOutputs != null) {
                jSONObject2.put("clientExtensionResults", authenticationExtensionsClientOutputs.Y0());
                return jSONObject2;
            }
            if (z) {
                jSONObject2.put("clientExtensionResults", new JSONObject());
            }
            return jSONObject2;
        } catch (JSONException e2) {
            vp2.e("Error encoding PublicKeyCredential to JSON object", e2);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return Objects.a(this.a, publicKeyCredential.a) && Objects.a(this.b, publicKeyCredential.b) && Objects.a(this.c, publicKeyCredential.c) && Objects.a(this.d, publicKeyCredential.d) && Objects.a(this.e, publicKeyCredential.e) && Objects.a(this.f, publicKeyCredential.f) && Objects.a(this.g, publicKeyCredential.g) && Objects.a(this.h, publicKeyCredential.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.d, this.f, this.g, this.h});
    }

    public final String toString() {
        xgo xgoVar = this.c;
        String b = Base64Utils.b(xgoVar == null ? null : xgoVar.s());
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        StringBuilder s = mz1.s("PublicKeyCredential{\n id='", this.a, "', \n type='", this.b, "', \n rawId=");
        bf3.v(s, b, ", \n registerResponse=", valueOf, ", \n signResponse=");
        bf3.v(s, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        return fc6.o(s, valueOf4, ", \n authenticatorAttachment='", this.h, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ((zzib) zzia.b.a.a).zza();
        throw null;
    }
}
