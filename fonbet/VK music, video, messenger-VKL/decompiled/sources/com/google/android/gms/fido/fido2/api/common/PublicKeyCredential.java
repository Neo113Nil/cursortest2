package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzia;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.dq70;
import xsna.exc0;
import xsna.h5s;
import xsna.iyz0;
import xsna.k46;
import xsna.n6j;
import xsna.ozg0;
import xsna.xe9;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new iyz0();

    @Nullable
    public final String b;

    @NonNull
    public final String c;

    @Nullable
    public final zzgx d;

    @Nullable
    public final AuthenticatorAttestationResponse e;

    @Nullable
    public final AuthenticatorAssertionResponse f;

    @Nullable
    public final AuthenticatorErrorResponse g;

    @Nullable
    public final AuthenticationExtensionsClientOutputs h;

    @Nullable
    public final String i;

    @Nullable
    public String j;

    public PublicKeyCredential(@Nullable String str, @NonNull String str2, @Nullable byte[] bArr, @Nullable AuthenticatorAttestationResponse authenticatorAttestationResponse, @Nullable AuthenticatorAssertionResponse authenticatorAssertionResponse, @Nullable AuthenticatorErrorResponse authenticatorErrorResponse, @Nullable AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, @Nullable String str3) {
        boolean z = false;
        zzgx zzl = bArr == null ? null : zzgx.zzl(bArr, 0, bArr.length);
        exc0.a("Must provide a response object.", (authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null));
        if (authenticatorErrorResponse != null || (str != null && zzl != null)) {
            z = true;
        }
        exc0.a("Must provide id and rawId if not an error response.", z);
        this.b = str;
        this.c = str2;
        this.d = zzl;
        this.e = authenticatorAttestationResponse;
        this.f = authenticatorAssertionResponse;
        this.g = authenticatorErrorResponse;
        this.h = authenticationExtensionsClientOutputs;
        this.i = str3;
        this.j = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return dq70.b(this.b, publicKeyCredential.b) && dq70.b(this.c, publicKeyCredential.c) && dq70.b(this.d, publicKeyCredential.d) && dq70.b(this.e, publicKeyCredential.e) && dq70.b(this.f, publicKeyCredential.f) && dq70.b(this.g, publicKeyCredential.g) && dq70.b(this.h, publicKeyCredential.h) && dq70.b(this.i, publicKeyCredential.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.f, this.e, this.g, this.h, this.i});
    }

    @NonNull
    public final JSONObject i() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            zzgx zzgxVar = this.d;
            if (zzgxVar != null && zzgxVar.zzm().length > 0) {
                jSONObject2.put("rawId", k46.c(zzgxVar.zzm()));
            }
            String str = this.i;
            if (str != null) {
                jSONObject2.put("authenticatorAttachment", str);
            }
            String str2 = this.c;
            AuthenticatorErrorResponse authenticatorErrorResponse = this.g;
            if (str2 != null && authenticatorErrorResponse == null) {
                jSONObject2.put("type", str2);
            }
            String str3 = this.b;
            if (str3 != null) {
                jSONObject2.put("id", str3);
            }
            String str4 = "response";
            AuthenticatorAssertionResponse authenticatorAssertionResponse = this.f;
            boolean z = true;
            if (authenticatorAssertionResponse != null) {
                jSONObject = authenticatorAssertionResponse.i();
            } else {
                AuthenticatorAttestationResponse authenticatorAttestationResponse = this.e;
                if (authenticatorAttestationResponse != null) {
                    jSONObject = authenticatorAttestationResponse.i();
                } else {
                    z = false;
                    if (authenticatorErrorResponse != null) {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("code", authenticatorErrorResponse.b.i());
                            String str5 = authenticatorErrorResponse.c;
                            if (str5 != null) {
                                jSONObject3.put("message", str5);
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
            AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.h;
            if (authenticationExtensionsClientOutputs != null) {
                jSONObject2.put("clientExtensionResults", authenticationExtensionsClientOutputs.i());
                return jSONObject2;
            }
            if (z) {
                jSONObject2.put("clientExtensionResults", new JSONObject());
            }
            return jSONObject2;
        } catch (JSONException e2) {
            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e2);
        }
    }

    @NonNull
    public final String toString() {
        zzgx zzgxVar = this.d;
        String c = k46.c(zzgxVar == null ? null : zzgxVar.zzm());
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.f);
        String valueOf3 = String.valueOf(this.g);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder a = xe9.a("PublicKeyCredential{\n id='", this.b, "', \n type='", this.c, "', \n rawId=");
        n6j.b(a, c, ", \n registerResponse=", valueOf, ", \n signResponse=");
        n6j.b(a, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        return h5s.d(a, valueOf4, ", \n authenticatorAttachment='", this.i, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        if (zzia.zzc()) {
            this.j = i().toString();
        }
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        ozg0.q(parcel, 2, this.c, false);
        zzgx zzgxVar = this.d;
        ozg0.e(parcel, 3, zzgxVar == null ? null : zzgxVar.zzm(), false);
        ozg0.p(parcel, 4, this.e, i, false);
        ozg0.p(parcel, 5, this.f, i, false);
        ozg0.p(parcel, 6, this.g, i, false);
        ozg0.p(parcel, 7, this.h, i, false);
        ozg0.q(parcel, 8, this.i, false);
        ozg0.q(parcel, 9, this.j, false);
        ozg0.x(w, parcel);
        this.j = null;
    }
}
