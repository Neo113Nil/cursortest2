package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import ru.ok.android.sdk.SharedKt;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CheckAllowedScopes.kt */
/* loaded from: classes6.dex */
public final class CheckAllowedScopes$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0(SharedKt.PARAM_SCOPES)
    private final String scopes;

    public CheckAllowedScopes$Parameters(String str, String str2) {
        this.scopes = str;
        this.requestId = str2;
    }

    public static final CheckAllowedScopes$Parameters a(CheckAllowedScopes$Parameters checkAllowedScopes$Parameters) {
        return checkAllowedScopes$Parameters.requestId == null ? new CheckAllowedScopes$Parameters(checkAllowedScopes$Parameters.scopes, "default_request_id") : checkAllowedScopes$Parameters;
    }

    public static final void b(CheckAllowedScopes$Parameters checkAllowedScopes$Parameters) {
        if (checkAllowedScopes$Parameters.scopes == null) {
            throw new IllegalArgumentException("Value of non-nullable member scopes cannot be\n                        null");
        }
        if (checkAllowedScopes$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckAllowedScopes$Parameters)) {
            return false;
        }
        CheckAllowedScopes$Parameters checkAllowedScopes$Parameters = (CheckAllowedScopes$Parameters) obj;
        return epx.f(this.scopes, checkAllowedScopes$Parameters.scopes) && epx.f(this.requestId, checkAllowedScopes$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + (this.scopes.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(scopes=");
        sb.append(this.scopes);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
