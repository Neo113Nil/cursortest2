package com.vk.api.external.exceptions;

import org.json.JSONObject;
import xsna.epx;

/* compiled from: VKWebAuthException.kt */
/* loaded from: classes.dex */
public final class VKWebAuthException extends Exception {
    private final String error;
    private final String errorDescription;
    private final String errorReason;
    private final JSONObject fullError;
    private final JSONObject info;
    private final int lastResponseCode;

    public /* synthetic */ VKWebAuthException(int i, int i2, String str, String str2, String str3) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, null, null);
    }

    public final String d() {
        return this.error;
    }

    public final String g() {
        return this.errorDescription;
    }

    public final String h() {
        return this.errorReason;
    }

    public final int i() {
        return this.lastResponseCode;
    }

    public final boolean j() {
        return epx.f(this.error, "access_token_expired");
    }

    public final boolean k() {
        return epx.f(this.error, "invalid_password");
    }

    public final boolean l() {
        int i = this.lastResponseCode;
        return 200 <= i && i < 300;
    }

    public final boolean m() {
        return epx.f(this.error, "need_captcha");
    }

    public final boolean n() {
        return epx.f(this.error, "need_password");
    }

    public VKWebAuthException(int i, String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2) {
        super(str);
        this.lastResponseCode = i;
        this.error = str;
        this.errorDescription = str2;
        this.errorReason = str3;
        this.info = jSONObject;
        this.fullError = jSONObject2;
    }
}
