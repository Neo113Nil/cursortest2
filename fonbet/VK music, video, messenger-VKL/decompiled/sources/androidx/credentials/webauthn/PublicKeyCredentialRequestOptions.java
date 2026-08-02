package androidx.credentials.webauthn;

import org.json.JSONObject;

/* compiled from: PublicKeyCredentialRequestOptions.kt */
/* loaded from: classes12.dex */
public final class PublicKeyCredentialRequestOptions {
    private final byte[] challenge;
    private final JSONObject json;
    private final String rpId;
    private final long timeout;
    private final String userVerification;

    public PublicKeyCredentialRequestOptions(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.json = jSONObject;
        this.challenge = WebAuthnUtils.Companion.b64Decode(jSONObject.getString("challenge"));
        this.timeout = jSONObject.optLong("timeout", 0L);
        this.rpId = jSONObject.optString("rpId", "");
        this.userVerification = jSONObject.optString("userVerification", "preferred");
    }

    public final byte[] getChallenge() {
        return this.challenge;
    }

    public final JSONObject getJson() {
        return this.json;
    }

    public final String getRpId() {
        return this.rpId;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    public final String getUserVerification() {
        return this.userVerification;
    }
}
