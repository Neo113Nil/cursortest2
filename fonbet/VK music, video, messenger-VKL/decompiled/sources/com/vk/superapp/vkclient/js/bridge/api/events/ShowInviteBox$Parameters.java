package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShowInviteBox.kt */
/* loaded from: classes6.dex */
public final class ShowInviteBox$Parameters implements ad6 {

    @pmi0("friend_id")
    private final Integer friendId;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("requestKey")
    private final String requestKey;

    public ShowInviteBox$Parameters(String str, Integer num, String str2) {
        this.requestId = str;
        this.friendId = num;
        this.requestKey = str2;
    }

    public static final ShowInviteBox$Parameters a(ShowInviteBox$Parameters showInviteBox$Parameters) {
        return showInviteBox$Parameters.requestId == null ? new ShowInviteBox$Parameters("default_request_id", showInviteBox$Parameters.friendId, showInviteBox$Parameters.requestKey) : showInviteBox$Parameters;
    }

    public static final void b(ShowInviteBox$Parameters showInviteBox$Parameters) {
        if (showInviteBox$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowInviteBox$Parameters)) {
            return false;
        }
        ShowInviteBox$Parameters showInviteBox$Parameters = (ShowInviteBox$Parameters) obj;
        return epx.f(this.requestId, showInviteBox$Parameters.requestId) && epx.f(this.friendId, showInviteBox$Parameters.friendId) && epx.f(this.requestKey, showInviteBox$Parameters.requestKey);
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        Integer num = this.friendId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.requestKey;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", friendId=");
        sb.append(this.friendId);
        sb.append(", requestKey=");
        return ho8.a(sb, this.requestKey, ')');
    }

    public /* synthetic */ ShowInviteBox$Parameters(String str, Integer num, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2);
    }
}
