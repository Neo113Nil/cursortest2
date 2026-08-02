package androidx.credentials.webauthn;

import org.json.JSONObject;

/* compiled from: FidoPublicKeyCredential.kt */
/* loaded from: classes12.dex */
public final class FidoPublicKeyCredential {
    private final String authenticatorAttachment;
    private final byte[] rawId;
    private final AuthenticatorResponse response;

    public FidoPublicKeyCredential(byte[] bArr, AuthenticatorResponse authenticatorResponse, String str) {
        this.rawId = bArr;
        this.response = authenticatorResponse;
        this.authenticatorAttachment = str;
    }

    public final String getAuthenticatorAttachment() {
        return this.authenticatorAttachment;
    }

    public final byte[] getRawId() {
        return this.rawId;
    }

    public final AuthenticatorResponse getResponse() {
        return this.response;
    }

    public final String json() {
        String b64Encode = WebAuthnUtils.Companion.b64Encode(this.rawId);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", b64Encode);
        jSONObject.put("rawId", b64Encode);
        jSONObject.put("type", "public-key");
        jSONObject.put("authenticatorAttachment", this.authenticatorAttachment);
        jSONObject.put("response", this.response.json());
        jSONObject.put("clientExtensionResults", new JSONObject());
        return jSONObject.toString();
    }
}
