package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: LeaveGroup.kt */
/* loaded from: classes6.dex */
public final class LeaveGroup$Parameters implements ad6 {

    @pmi0("group_id")
    private final int groupId;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public LeaveGroup$Parameters(int i, String str) {
        this.groupId = i;
        this.requestId = str;
    }

    public static final LeaveGroup$Parameters a(LeaveGroup$Parameters leaveGroup$Parameters) {
        return leaveGroup$Parameters.requestId == null ? new LeaveGroup$Parameters(leaveGroup$Parameters.groupId, "default_request_id") : leaveGroup$Parameters;
    }

    public static final void b(LeaveGroup$Parameters leaveGroup$Parameters) {
        if (leaveGroup$Parameters.groupId < 1) {
            throw new IllegalArgumentException("Value groupId cannot be less than 1");
        }
    }

    public static final void c(LeaveGroup$Parameters leaveGroup$Parameters) {
        if (leaveGroup$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaveGroup$Parameters)) {
            return false;
        }
        LeaveGroup$Parameters leaveGroup$Parameters = (LeaveGroup$Parameters) obj;
        return this.groupId == leaveGroup$Parameters.groupId && epx.f(this.requestId, leaveGroup$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + (Integer.hashCode(this.groupId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(groupId=");
        sb.append(this.groupId);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
