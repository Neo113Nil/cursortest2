package com.vk.superapp.auth.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: SaveCredentials.kt */
/* loaded from: classes6.dex */
public final class SaveCredentials$Parameters implements ad6 {

    @pmi0("login")
    private final String login;

    @pmi0(LoginApiConstants.PARAM_NAME_PASSWORD)
    private final String password;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public SaveCredentials$Parameters(String str, String str2, String str3) {
        this.login = str;
        this.password = str2;
        this.requestId = str3;
    }

    public static final SaveCredentials$Parameters a(SaveCredentials$Parameters saveCredentials$Parameters) {
        return saveCredentials$Parameters.requestId == null ? new SaveCredentials$Parameters(saveCredentials$Parameters.login, saveCredentials$Parameters.password, "default_request_id") : saveCredentials$Parameters;
    }

    public static final void b(SaveCredentials$Parameters saveCredentials$Parameters) {
        if (saveCredentials$Parameters.login == null) {
            throw new IllegalArgumentException("Value of non-nullable member login cannot be\n                        null");
        }
        if (saveCredentials$Parameters.password == null) {
            throw new IllegalArgumentException("Value of non-nullable member password cannot be\n                        null");
        }
        if (saveCredentials$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String c() {
        return this.login;
    }

    public final String d() {
        return this.password;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveCredentials$Parameters)) {
            return false;
        }
        SaveCredentials$Parameters saveCredentials$Parameters = (SaveCredentials$Parameters) obj;
        return epx.f(this.login, saveCredentials$Parameters.login) && epx.f(this.password, saveCredentials$Parameters.password) && epx.f(this.requestId, saveCredentials$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + urd0.a(this.login.hashCode() * 31, 31, this.password);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(login=");
        sb.append(this.login);
        sb.append(", password=");
        sb.append(this.password);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
