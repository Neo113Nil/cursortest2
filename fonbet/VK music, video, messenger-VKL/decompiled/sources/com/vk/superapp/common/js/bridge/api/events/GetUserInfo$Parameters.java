package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GetUserInfo.kt */
/* loaded from: classes6.dex */
public final class GetUserInfo$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("user_id")
    private final Long userId;

    @pmi0("user_ids")
    private final String userIds;

    public GetUserInfo$Parameters(String str, Long l, String str2) {
        this.requestId = str;
        this.userId = l;
        this.userIds = str2;
    }

    public static final GetUserInfo$Parameters a(GetUserInfo$Parameters getUserInfo$Parameters) {
        return getUserInfo$Parameters.requestId == null ? new GetUserInfo$Parameters("default_request_id", getUserInfo$Parameters.userId, getUserInfo$Parameters.userIds) : getUserInfo$Parameters;
    }

    public static final void b(GetUserInfo$Parameters getUserInfo$Parameters) {
        Long l = getUserInfo$Parameters.userId;
        if (l != null && l.longValue() < 1) {
            throw new IllegalArgumentException("Value userId cannot be less than 1");
        }
    }

    public static final void c(GetUserInfo$Parameters getUserInfo$Parameters) {
        if (getUserInfo$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String d() {
        return this.requestId;
    }

    public final Long e() {
        return this.userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetUserInfo$Parameters)) {
            return false;
        }
        GetUserInfo$Parameters getUserInfo$Parameters = (GetUserInfo$Parameters) obj;
        return epx.f(this.requestId, getUserInfo$Parameters.requestId) && epx.f(this.userId, getUserInfo$Parameters.userId) && epx.f(this.userIds, getUserInfo$Parameters.userIds);
    }

    public final String f() {
        return this.userIds;
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        Long l = this.userId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.userIds;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", userIds=");
        return ho8.a(sb, this.userIds, ')');
    }

    public /* synthetic */ GetUserInfo$Parameters(String str, Long l, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2);
    }
}
