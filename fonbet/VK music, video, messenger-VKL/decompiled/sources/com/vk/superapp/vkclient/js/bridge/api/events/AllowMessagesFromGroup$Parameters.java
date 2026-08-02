package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import xsna.ad6;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AllowMessagesFromGroup.kt */
/* loaded from: classes6.dex */
public final class AllowMessagesFromGroup$Parameters implements ad6 {

    @pmi0("group_id")
    private final int groupId;

    @pmi0("intents")
    private final List<String> intents;

    @pmi0("key")
    private final String key;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("subscribe_ids")
    private final List<Integer> subscribeIds;

    public AllowMessagesFromGroup$Parameters(int i, String str, String str2, List<String> list, List<Integer> list2) {
        this.groupId = i;
        this.requestId = str;
        this.key = str2;
        this.intents = list;
        this.subscribeIds = list2;
    }

    public static final AllowMessagesFromGroup$Parameters a(AllowMessagesFromGroup$Parameters allowMessagesFromGroup$Parameters) {
        return allowMessagesFromGroup$Parameters.requestId == null ? new AllowMessagesFromGroup$Parameters(allowMessagesFromGroup$Parameters.groupId, "default_request_id", allowMessagesFromGroup$Parameters.key, allowMessagesFromGroup$Parameters.intents, allowMessagesFromGroup$Parameters.subscribeIds) : allowMessagesFromGroup$Parameters;
    }

    public static final void b(AllowMessagesFromGroup$Parameters allowMessagesFromGroup$Parameters) {
        if (allowMessagesFromGroup$Parameters.groupId < 1) {
            throw new IllegalArgumentException("Value groupId cannot be less than 1");
        }
    }

    public static final void c(AllowMessagesFromGroup$Parameters allowMessagesFromGroup$Parameters) {
        if (allowMessagesFromGroup$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final int d() {
        return this.groupId;
    }

    public final List<String> e() {
        return this.intents;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllowMessagesFromGroup$Parameters)) {
            return false;
        }
        AllowMessagesFromGroup$Parameters allowMessagesFromGroup$Parameters = (AllowMessagesFromGroup$Parameters) obj;
        return this.groupId == allowMessagesFromGroup$Parameters.groupId && epx.f(this.requestId, allowMessagesFromGroup$Parameters.requestId) && epx.f(this.key, allowMessagesFromGroup$Parameters.key) && epx.f(this.intents, allowMessagesFromGroup$Parameters.intents) && epx.f(this.subscribeIds, allowMessagesFromGroup$Parameters.subscribeIds);
    }

    public final String f() {
        return this.key;
    }

    public final String g() {
        return this.requestId;
    }

    public final List<Integer> h() {
        return this.subscribeIds;
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.groupId) * 31, 31, this.requestId);
        String str = this.key;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.intents;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.subscribeIds;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(groupId=");
        sb.append(this.groupId);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", intents=");
        sb.append(this.intents);
        sb.append(", subscribeIds=");
        return ms9.a(')', sb, this.subscribeIds);
    }

    public /* synthetic */ AllowMessagesFromGroup$Parameters(int i, String str, String str2, List list, List list2, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : list2);
    }
}
