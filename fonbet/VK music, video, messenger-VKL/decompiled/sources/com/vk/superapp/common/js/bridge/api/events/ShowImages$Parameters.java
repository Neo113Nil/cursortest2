package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import xsna.ad6;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ShowImages.kt */
/* loaded from: classes6.dex */
public final class ShowImages$Parameters implements ad6 {

    @pmi0("images")
    private final List<String> images;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("start_index")
    private final Integer startIndex;

    public ShowImages$Parameters(List<String> list, String str, Integer num) {
        this.images = list;
        this.requestId = str;
        this.startIndex = num;
    }

    public static final ShowImages$Parameters a(ShowImages$Parameters showImages$Parameters) {
        return showImages$Parameters.requestId == null ? new ShowImages$Parameters(showImages$Parameters.images, "default_request_id", showImages$Parameters.startIndex) : showImages$Parameters;
    }

    public static final void b(ShowImages$Parameters showImages$Parameters) {
        Integer num = showImages$Parameters.startIndex;
        if (num != null && num.intValue() < 0) {
            throw new IllegalArgumentException("Value startIndex cannot be less than 0");
        }
    }

    public static final void c(ShowImages$Parameters showImages$Parameters) {
        if (showImages$Parameters.images == null) {
            throw new IllegalArgumentException("Value of non-nullable member images cannot be\n                        null");
        }
        if (showImages$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowImages$Parameters)) {
            return false;
        }
        ShowImages$Parameters showImages$Parameters = (ShowImages$Parameters) obj;
        return epx.f(this.images, showImages$Parameters.images) && epx.f(this.requestId, showImages$Parameters.requestId) && epx.f(this.startIndex, showImages$Parameters.startIndex);
    }

    public final int hashCode() {
        int a = urd0.a(this.images.hashCode() * 31, 31, this.requestId);
        Integer num = this.startIndex;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(images=");
        sb.append(this.images);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", startIndex=");
        return uqi.b(sb, this.startIndex, ')');
    }

    public /* synthetic */ ShowImages$Parameters(List list, String str, Integer num, int i, zcl zclVar) {
        this(list, str, (i & 4) != 0 ? null : num);
    }
}
