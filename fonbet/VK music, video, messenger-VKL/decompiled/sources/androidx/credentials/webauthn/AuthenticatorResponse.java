package androidx.credentials.webauthn;

import org.json.JSONObject;

/* compiled from: AuthenticatorResponse.kt */
/* loaded from: classes12.dex */
public interface AuthenticatorResponse {
    JSONObject getClientJson();

    JSONObject json();

    void setClientJson(JSONObject jSONObject);
}
