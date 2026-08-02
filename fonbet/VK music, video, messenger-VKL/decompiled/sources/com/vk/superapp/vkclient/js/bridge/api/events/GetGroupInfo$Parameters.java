package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GetGroupInfo.kt */
/* loaded from: classes6.dex */
public final class GetGroupInfo$Parameters implements ad6 {

    @pmi0("group_id")
    private final Long groupId;

    @pmi0("group_ids")
    private final String groupIds;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public GetGroupInfo$Parameters(String str, Long l, String str2) {
        this.requestId = str;
        this.groupId = l;
        this.groupIds = str2;
    }

    public static final GetGroupInfo$Parameters a(GetGroupInfo$Parameters getGroupInfo$Parameters) {
        return getGroupInfo$Parameters.requestId == null ? new GetGroupInfo$Parameters("default_request_id", getGroupInfo$Parameters.groupId, getGroupInfo$Parameters.groupIds) : getGroupInfo$Parameters;
    }

    public static final void b(GetGroupInfo$Parameters getGroupInfo$Parameters) {
        Long l = getGroupInfo$Parameters.groupId;
        if (l != null && l.longValue() < 1) {
            throw new IllegalArgumentException("Value groupId cannot be less than 1");
        }
    }

    public static final void c(GetGroupInfo$Parameters getGroupInfo$Parameters) {
        if (getGroupInfo$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final Long d() {
        return this.groupId;
    }

    public final String e() {
        return this.groupIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetGroupInfo$Parameters)) {
            return false;
        }
        GetGroupInfo$Parameters getGroupInfo$Parameters = (GetGroupInfo$Parameters) obj;
        return epx.f(this.requestId, getGroupInfo$Parameters.requestId) && epx.f(this.groupId, getGroupInfo$Parameters.groupId) && epx.f(this.groupIds, getGroupInfo$Parameters.groupIds);
    }

    public final String f() {
        return this.requestId;
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        Long l = this.groupId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.groupIds;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", groupId=");
        sb.append(this.groupId);
        sb.append(", groupIds=");
        return ho8.a(sb, this.groupIds, ')');
    }

    public /* synthetic */ GetGroupInfo$Parameters(String str, Long l, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2);
    }
}
