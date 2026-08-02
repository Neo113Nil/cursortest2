package androidx.credentials.webauthn;

import java.security.MessageDigest;
import java.util.Collection;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.e43;
import xsna.emb;
import xsna.jgp;
import xsna.jw5;
import xsna.zcl;

/* compiled from: AuthenticatorAttestationResponse.kt */
/* loaded from: classes12.dex */
public final class AuthenticatorAttestationResponse implements AuthenticatorResponse {
    private byte[] attestationObject;
    private final boolean be;
    private final boolean bs;
    private final byte[] clientDataHash;
    private JSONObject clientJson;
    private final byte[] credentialId;
    private final byte[] credentialPublicKey;
    private final String origin;
    private final String packageName;
    private final PublicKeyCredentialCreationOptions requestOptions;
    private final boolean up;
    private final boolean uv;

    public AuthenticatorAttestationResponse(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, byte[] bArr, byte[] bArr2, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, byte[] bArr3) {
        this.requestOptions = publicKeyCredentialCreationOptions;
        this.credentialId = bArr;
        this.credentialPublicKey = bArr2;
        this.origin = str;
        this.up = z;
        this.uv = z2;
        this.be = z3;
        this.bs = z4;
        this.packageName = str2;
        this.clientDataHash = bArr3;
        this.clientJson = new JSONObject();
        getClientJson().put("type", "webauthn.create");
        getClientJson().put("challenge", WebAuthnUtils.Companion.b64Encode(publicKeyCredentialCreationOptions.getChallenge()));
        getClientJson().put("origin", str);
        if (str2 != null) {
            getClientJson().put("androidPackageName", str2);
        }
        this.attestationObject = defaultAttestationObject$credentials_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v7 */
    private final byte[] authData() {
        byte[] digest = MessageDigest.getInstance("SHA-256").digest(this.requestOptions.getRp().getId().getBytes(emb.b));
        boolean z = this.up;
        boolean z2 = z;
        if (this.uv) {
            z2 = (z ? 1 : 0) | 4;
        }
        boolean z3 = z2;
        if (this.be) {
            z3 = (z2 ? 1 : 0) | '\b';
        }
        ?? r1 = z3;
        if (this.bs) {
            r1 = (z3 ? 1 : 0) | 16;
        }
        int i = r1 | 64;
        byte[] bArr = new byte[16];
        for (int i2 = 0; i2 < 16; i2++) {
            bArr[i2] = 0;
        }
        byte[] bArr2 = this.credentialId;
        return jw5.x(jw5.x(jw5.x(jw5.x(jw5.x(jw5.x(digest, new byte[]{(byte) i}), new byte[]{0, 0, 0, 0}), bArr), new byte[]{(byte) (bArr2.length >> 8), (byte) bArr2.length}), this.credentialId), this.credentialPublicKey);
    }

    public final byte[] defaultAttestationObject$credentials_release() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("fmt", "none");
        linkedHashMap.put("attStmt", jgp.b);
        linkedHashMap.put("authData", authData());
        return new Cbor().encode(linkedHashMap);
    }

    public final byte[] getAttestationObject() {
        return this.attestationObject;
    }

    @Override // androidx.credentials.webauthn.AuthenticatorResponse
    public JSONObject getClientJson() {
        return this.clientJson;
    }

    @Override // androidx.credentials.webauthn.AuthenticatorResponse
    public JSONObject json() {
        byte[] bytes = getClientJson().toString().getBytes(emb.b);
        JSONObject jSONObject = new JSONObject();
        if (this.clientDataHash == null) {
            jSONObject.put("clientDataJSON", WebAuthnUtils.Companion.b64Encode(bytes));
        }
        jSONObject.put("attestationObject", WebAuthnUtils.Companion.b64Encode(this.attestationObject));
        jSONObject.put("transports", new JSONArray((Collection) e43.l("internal", "hybrid")));
        return jSONObject;
    }

    public final void setAttestationObject(byte[] bArr) {
        this.attestationObject = bArr;
    }

    @Override // androidx.credentials.webauthn.AuthenticatorResponse
    public void setClientJson(JSONObject jSONObject) {
        this.clientJson = jSONObject;
    }

    public /* synthetic */ AuthenticatorAttestationResponse(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, byte[] bArr, byte[] bArr2, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, byte[] bArr3, int i, zcl zclVar) {
        this(publicKeyCredentialCreationOptions, bArr, bArr2, str, z, z2, z3, z4, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : bArr3);
    }
}
