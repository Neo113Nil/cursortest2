package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;

/* compiled from: GetFriends.kt */
/* loaded from: classes6.dex */
public final class GetFriends$Parameters implements ad6 {

    @pmi0("lists")
    private final Boolean lists;

    @pmi0("multi")
    private final Boolean multi;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public GetFriends$Parameters(String str, Boolean bool, Boolean bool2) {
        this.requestId = str;
        this.multi = bool;
        this.lists = bool2;
    }

    public static final GetFriends$Parameters a(GetFriends$Parameters getFriends$Parameters) {
        return getFriends$Parameters.requestId == null ? new GetFriends$Parameters("default_request_id", getFriends$Parameters.multi, getFriends$Parameters.lists) : getFriends$Parameters;
    }

    public static final void b(GetFriends$Parameters getFriends$Parameters) {
        if (getFriends$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetFriends$Parameters)) {
            return false;
        }
        GetFriends$Parameters getFriends$Parameters = (GetFriends$Parameters) obj;
        return epx.f(this.requestId, getFriends$Parameters.requestId) && epx.f(this.multi, getFriends$Parameters.multi) && epx.f(this.lists, getFriends$Parameters.lists);
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        Boolean bool = this.multi;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.lists;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", multi=");
        sb.append(this.multi);
        sb.append(", lists=");
        return tn.a(sb, this.lists, ')');
    }

    public /* synthetic */ GetFriends$Parameters(String str, Boolean bool, Boolean bool2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2);
    }
}
