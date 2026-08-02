package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import xsna.ad6;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FriendsSearch.kt */
/* loaded from: classes6.dex */
public final class FriendsSearch$Parameters implements ad6 {

    @pmi0("ids")
    private final List<Integer> ids;

    @pmi0("listIds")
    private final List<Integer> listIds;

    @pmi0("lists")
    private final Boolean lists;

    @pmi0("multi")
    private final Boolean multi;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public FriendsSearch$Parameters(String str, Boolean bool, Boolean bool2, List<Integer> list, List<Integer> list2) {
        this.requestId = str;
        this.lists = bool;
        this.multi = bool2;
        this.listIds = list;
        this.ids = list2;
    }

    public static final FriendsSearch$Parameters a(FriendsSearch$Parameters friendsSearch$Parameters) {
        return friendsSearch$Parameters.requestId == null ? new FriendsSearch$Parameters("default_request_id", friendsSearch$Parameters.lists, friendsSearch$Parameters.multi, friendsSearch$Parameters.listIds, friendsSearch$Parameters.ids) : friendsSearch$Parameters;
    }

    public static final void b(FriendsSearch$Parameters friendsSearch$Parameters) {
        if (friendsSearch$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsSearch$Parameters)) {
            return false;
        }
        FriendsSearch$Parameters friendsSearch$Parameters = (FriendsSearch$Parameters) obj;
        return epx.f(this.requestId, friendsSearch$Parameters.requestId) && epx.f(this.lists, friendsSearch$Parameters.lists) && epx.f(this.multi, friendsSearch$Parameters.multi) && epx.f(this.listIds, friendsSearch$Parameters.listIds) && epx.f(this.ids, friendsSearch$Parameters.ids);
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        Boolean bool = this.lists;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.multi;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<Integer> list = this.listIds;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.ids;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", lists=");
        sb.append(this.lists);
        sb.append(", multi=");
        sb.append(this.multi);
        sb.append(", listIds=");
        sb.append(this.listIds);
        sb.append(", ids=");
        return ms9.a(')', sb, this.ids);
    }

    public /* synthetic */ FriendsSearch$Parameters(String str, Boolean bool, Boolean bool2, List list, List list2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2);
    }
}
