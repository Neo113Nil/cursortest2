package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import ru.ok.android.sdk.SharedKt;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: UsersSearch.kt */
/* loaded from: classes6.dex */
public final class UsersSearch$Parameters implements ad6 {

    @pmi0(SharedKt.PARAM_ACCESS_TOKEN)
    private final String accessToken;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public UsersSearch$Parameters(String str, String str2) {
        this.accessToken = str;
        this.requestId = str2;
    }

    public static final UsersSearch$Parameters a(UsersSearch$Parameters usersSearch$Parameters) {
        return usersSearch$Parameters.requestId == null ? new UsersSearch$Parameters(usersSearch$Parameters.accessToken, "default_request_id") : usersSearch$Parameters;
    }

    public static final void b(UsersSearch$Parameters usersSearch$Parameters) {
        if (usersSearch$Parameters.accessToken == null) {
            throw new IllegalArgumentException("Value of non-nullable member accessToken cannot be\n                        null");
        }
        if (usersSearch$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersSearch$Parameters)) {
            return false;
        }
        UsersSearch$Parameters usersSearch$Parameters = (UsersSearch$Parameters) obj;
        return epx.f(this.accessToken, usersSearch$Parameters.accessToken) && epx.f(this.requestId, usersSearch$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + (this.accessToken.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(accessToken=");
        sb.append(this.accessToken);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
