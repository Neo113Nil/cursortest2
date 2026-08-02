package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ShowRequestBox.kt */
/* loaded from: classes6.dex */
public final class ShowRequestBox$Parameters implements ad6 {

    @pmi0("message")
    private final String message;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("requestKey")
    private final String requestKey;

    @pmi0("uid")
    private final int uid;

    public ShowRequestBox$Parameters(int i, String str, String str2, String str3) {
        this.uid = i;
        this.message = str;
        this.requestId = str2;
        this.requestKey = str3;
    }

    public static final ShowRequestBox$Parameters a(ShowRequestBox$Parameters showRequestBox$Parameters) {
        return showRequestBox$Parameters.requestId == null ? new ShowRequestBox$Parameters(showRequestBox$Parameters.uid, showRequestBox$Parameters.message, "default_request_id", showRequestBox$Parameters.requestKey) : showRequestBox$Parameters;
    }

    public static final void b(ShowRequestBox$Parameters showRequestBox$Parameters) {
        if (showRequestBox$Parameters.message == null) {
            throw new IllegalArgumentException("Value of non-nullable member message cannot be\n                        null");
        }
        if (showRequestBox$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowRequestBox$Parameters)) {
            return false;
        }
        ShowRequestBox$Parameters showRequestBox$Parameters = (ShowRequestBox$Parameters) obj;
        return this.uid == showRequestBox$Parameters.uid && epx.f(this.message, showRequestBox$Parameters.message) && epx.f(this.requestId, showRequestBox$Parameters.requestId) && epx.f(this.requestKey, showRequestBox$Parameters.requestKey);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(Integer.hashCode(this.uid) * 31, 31, this.message), 31, this.requestId);
        String str = this.requestKey;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(uid=");
        sb.append(this.uid);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", requestKey=");
        return ho8.a(sb, this.requestKey, ')');
    }

    public /* synthetic */ ShowRequestBox$Parameters(int i, String str, String str2, String str3, int i2, zcl zclVar) {
        this(i, str, str2, (i2 & 8) != 0 ? null : str3);
    }
}
