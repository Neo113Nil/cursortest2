package androidx.credentials.webauthn;

import androidx.credentials.webauthn.WebAuthnUtils;
import com.huawei.hms.support.feature.result.CommonConstant;
import io.jsonwebtoken.JwsHeader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.j5g;

/* compiled from: PublicKeyCredentialCreationOptions.kt */
/* loaded from: classes12.dex */
public final class PublicKeyCredentialCreationOptions {
    private String attestation;
    private AuthenticatorSelectionCriteria authenticatorSelection;
    private final byte[] challenge;
    private List<PublicKeyCredentialDescriptor> excludeCredentials;
    private final JSONObject json;
    private final List<PublicKeyCredentialParameters> pubKeyCredParams;
    private final PublicKeyCredentialRpEntity rp;
    private long timeout;
    private final PublicKeyCredentialUserEntity user;

    public PublicKeyCredentialCreationOptions(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.json = jSONObject;
        String string = jSONObject.getString("challenge");
        WebAuthnUtils.Companion companion = WebAuthnUtils.Companion;
        this.challenge = companion.b64Decode(string);
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        this.rp = new PublicKeyCredentialRpEntity(jSONObject2.getString("name"), jSONObject2.getString("id"));
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        this.user = new PublicKeyCredentialUserEntity(jSONObject3.getString("name"), companion.b64Decode(jSONObject3.getString("id")), jSONObject3.getString(CommonConstant.KEY_DISPLAY_NAME));
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i);
            arrayList.add(new PublicKeyCredentialParameters(jSONObject4.getString("type"), jSONObject4.getLong(JwsHeader.ALGORITHM)));
        }
        List<PublicKeyCredentialParameters> O0 = j5g.O0(arrayList);
        this.pubKeyCredParams = O0;
        this.timeout = this.json.optLong("timeout", 0L);
        this.excludeCredentials = EmptyList.b;
        this.authenticatorSelection = new AuthenticatorSelectionCriteria("platform", "required", false, null, 12, null);
        this.attestation = this.json.optString("attestation", "none");
        Objects.toString(this.rp);
        Objects.toString(this.user);
        Objects.toString(O0);
        Objects.toString(this.excludeCredentials);
        Objects.toString(this.authenticatorSelection);
    }

    public final String getAttestation() {
        return this.attestation;
    }

    public final AuthenticatorSelectionCriteria getAuthenticatorSelection() {
        return this.authenticatorSelection;
    }

    public final byte[] getChallenge() {
        return this.challenge;
    }

    public final List<PublicKeyCredentialDescriptor> getExcludeCredentials() {
        return this.excludeCredentials;
    }

    public final JSONObject getJson() {
        return this.json;
    }

    public final List<PublicKeyCredentialParameters> getPubKeyCredParams() {
        return this.pubKeyCredParams;
    }

    public final PublicKeyCredentialRpEntity getRp() {
        return this.rp;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    public final PublicKeyCredentialUserEntity getUser() {
        return this.user;
    }

    public final void setAttestation(String str) {
        this.attestation = str;
    }

    public final void setAuthenticatorSelection(AuthenticatorSelectionCriteria authenticatorSelectionCriteria) {
        this.authenticatorSelection = authenticatorSelectionCriteria;
    }

    public final void setExcludeCredentials(List<PublicKeyCredentialDescriptor> list) {
        this.excludeCredentials = list;
    }

    public final void setTimeout(long j) {
        this.timeout = j;
    }
}
