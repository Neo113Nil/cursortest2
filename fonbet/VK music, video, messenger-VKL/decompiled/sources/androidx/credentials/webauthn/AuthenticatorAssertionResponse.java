package androidx.credentials.webauthn;

import androidx.credentials.webauthn.WebAuthnUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.security.MessageDigest;
import org.json.JSONObject;
import xsna.emb;
import xsna.jw5;
import xsna.zcl;

/* compiled from: AuthenticatorAssertionResponse.kt */
/* loaded from: classes12.dex */
public final class AuthenticatorAssertionResponse implements AuthenticatorResponse {
    private byte[] authenticatorData;
    private final boolean be;
    private final boolean bs;
    private final byte[] clientDataHash;
    private JSONObject clientJson;
    private final byte[] credentialId;
    private final String origin;
    private final String packageName;
    private final PublicKeyCredentialRequestOptions requestOptions;
    private byte[] signature;
    private final boolean up;
    private byte[] userHandle;
    private final boolean uv;

    public AuthenticatorAssertionResponse(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, byte[] bArr, String str, boolean z, boolean z2, boolean z3, boolean z4, byte[] bArr2, String str2, byte[] bArr3) {
        this.requestOptions = publicKeyCredentialRequestOptions;
        this.credentialId = bArr;
        this.origin = str;
        this.up = z;
        this.uv = z2;
        this.be = z3;
        this.bs = z4;
        this.userHandle = bArr2;
        this.packageName = str2;
        this.clientDataHash = bArr3;
        this.clientJson = new JSONObject();
        this.signature = new byte[0];
        getClientJson().put("type", "webauthn.get");
        getClientJson().put("challenge", WebAuthnUtils.Companion.b64Encode(publicKeyCredentialRequestOptions.getChallenge()));
        getClientJson().put("origin", str);
        if (str2 != null) {
            getClientJson().put("androidPackageName", str2);
        }
        this.authenticatorData = defaultAuthenticatorData();
    }

    public final byte[] dataToSign() {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bArr = this.clientDataHash;
        if (bArr == null) {
            bArr = messageDigest.digest(getClientJson().toString().getBytes(emb.b));
        }
        return jw5.x(this.authenticatorData, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final byte[] defaultAuthenticatorData() {
        byte[] digest = MessageDigest.getInstance("SHA-256").digest(this.requestOptions.getRpId().getBytes(emb.b));
        boolean z = this.up;
        boolean z2 = z;
        if (this.uv) {
            z2 = (z ? 1 : 0) | 4;
        }
        boolean z3 = z2;
        if (this.be) {
            z3 = (z2 ? 1 : 0) | '\b';
        }
        int i = z3;
        if (this.bs) {
            i = (z3 ? 1 : 0) | 16;
        }
        return jw5.x(jw5.x(digest, new byte[]{(byte) i}), new byte[]{0, 0, 0, 0});
    }

    public final byte[] getAuthenticatorData() {
        return this.authenticatorData;
    }

    @Override // androidx.credentials.webauthn.AuthenticatorResponse
    public JSONObject getClientJson() {
        return this.clientJson;
    }

    public final byte[] getSignature() {
        return this.signature;
    }

    @Override // androidx.credentials.webauthn.AuthenticatorResponse
    public JSONObject json() {
        byte[] bytes = getClientJson().toString().getBytes(emb.b);
        JSONObject jSONObject = new JSONObject();
        if (this.clientDataHash == null) {
            jSONObject.put("clientDataJSON", WebAuthnUtils.Companion.b64Encode(bytes));
        }
        WebAuthnUtils.Companion companion = WebAuthnUtils.Companion;
        jSONObject.put("authenticatorData", companion.b64Encode(this.authenticatorData));
        jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, companion.b64Encode(this.signature));
        jSONObject.put("userHandle", companion.b64Encode(this.userHandle));
        return jSONObject;
    }

    public final void setAuthenticatorData(byte[] bArr) {
        this.authenticatorData = bArr;
    }

    @Override // androidx.credentials.webauthn.AuthenticatorResponse
    public void setClientJson(JSONObject jSONObject) {
        this.clientJson = jSONObject;
    }

    public final void setSignature(byte[] bArr) {
        this.signature = bArr;
    }

    public /* synthetic */ AuthenticatorAssertionResponse(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, byte[] bArr, String str, boolean z, boolean z2, boolean z3, boolean z4, byte[] bArr2, String str2, byte[] bArr3, int i, zcl zclVar) {
        this(publicKeyCredentialRequestOptions, bArr, str, z, z2, z3, z4, bArr2, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : bArr3);
    }
}
