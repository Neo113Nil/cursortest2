package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: SelectSbpBank.kt */
/* loaded from: classes6.dex */
public final class SelectSbpBank$Parameters implements ad6 {

    @pmi0("prefered_icon_size")
    private final int preferedIconSize;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public SelectSbpBank$Parameters(int i, String str) {
        this.preferedIconSize = i;
        this.requestId = str;
    }

    public static final SelectSbpBank$Parameters a(SelectSbpBank$Parameters selectSbpBank$Parameters) {
        return selectSbpBank$Parameters.requestId == null ? new SelectSbpBank$Parameters(selectSbpBank$Parameters.preferedIconSize, "default_request_id") : selectSbpBank$Parameters;
    }

    public static final void b(SelectSbpBank$Parameters selectSbpBank$Parameters) {
        if (selectSbpBank$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectSbpBank$Parameters)) {
            return false;
        }
        SelectSbpBank$Parameters selectSbpBank$Parameters = (SelectSbpBank$Parameters) obj;
        return this.preferedIconSize == selectSbpBank$Parameters.preferedIconSize && epx.f(this.requestId, selectSbpBank$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + (Integer.hashCode(this.preferedIconSize) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(preferedIconSize=");
        sb.append(this.preferedIconSize);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
