package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: JoinGroup.kt */
/* loaded from: classes6.dex */
public final class JoinGroup$Parameters implements ad6 {

    @pmi0("group_id")
    private final long groupId;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public JoinGroup$Parameters(long j, String str) {
        this.groupId = j;
        this.requestId = str;
    }

    public static final JoinGroup$Parameters a(JoinGroup$Parameters joinGroup$Parameters) {
        return joinGroup$Parameters.requestId == null ? new JoinGroup$Parameters(joinGroup$Parameters.groupId, "default_request_id") : joinGroup$Parameters;
    }

    public static final void b(JoinGroup$Parameters joinGroup$Parameters) {
        if (joinGroup$Parameters.groupId < 1) {
            throw new IllegalArgumentException("Value groupId cannot be less than 1");
        }
    }

    public static final void c(JoinGroup$Parameters joinGroup$Parameters) {
        if (joinGroup$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final long d() {
        return this.groupId;
    }

    public final String e() {
        return this.requestId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinGroup$Parameters)) {
            return false;
        }
        JoinGroup$Parameters joinGroup$Parameters = (JoinGroup$Parameters) obj;
        return this.groupId == joinGroup$Parameters.groupId && epx.f(this.requestId, joinGroup$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + (Long.hashCode(this.groupId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(groupId=");
        sb.append(this.groupId);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
