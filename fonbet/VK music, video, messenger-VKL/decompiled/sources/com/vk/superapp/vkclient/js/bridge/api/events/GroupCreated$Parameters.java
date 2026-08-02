package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GroupCreated.kt */
/* loaded from: classes6.dex */
public final class GroupCreated$Parameters implements ad6 {

    @pmi0("id")
    private final int id;

    @pmi0("isNewFlow")
    private final Boolean isNewFlow;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public GroupCreated$Parameters(int i, String str, Boolean bool) {
        this.id = i;
        this.requestId = str;
        this.isNewFlow = bool;
    }

    public static final GroupCreated$Parameters a(GroupCreated$Parameters groupCreated$Parameters) {
        return groupCreated$Parameters.requestId == null ? new GroupCreated$Parameters(groupCreated$Parameters.id, "default_request_id", groupCreated$Parameters.isNewFlow) : groupCreated$Parameters;
    }

    public static final void b(GroupCreated$Parameters groupCreated$Parameters) {
        if (groupCreated$Parameters.id < 0) {
            throw new IllegalArgumentException("Value id cannot be less than 0");
        }
    }

    public static final void c(GroupCreated$Parameters groupCreated$Parameters) {
        if (groupCreated$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupCreated$Parameters)) {
            return false;
        }
        GroupCreated$Parameters groupCreated$Parameters = (GroupCreated$Parameters) obj;
        return this.id == groupCreated$Parameters.id && epx.f(this.requestId, groupCreated$Parameters.requestId) && epx.f(this.isNewFlow, groupCreated$Parameters.isNewFlow);
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.id) * 31, 31, this.requestId);
        Boolean bool = this.isNewFlow;
        return a + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(id=");
        sb.append(this.id);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", isNewFlow=");
        return tn.a(sb, this.isNewFlow, ')');
    }

    public /* synthetic */ GroupCreated$Parameters(int i, String str, Boolean bool, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : bool);
    }
}
