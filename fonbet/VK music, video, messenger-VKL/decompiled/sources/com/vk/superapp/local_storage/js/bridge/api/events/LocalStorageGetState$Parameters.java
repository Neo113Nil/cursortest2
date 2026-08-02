package com.vk.superapp.local_storage.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: LocalStorageGetState.kt */
/* loaded from: classes6.dex */
public final class LocalStorageGetState$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("stats_id")
    private final Integer statsId;

    public LocalStorageGetState$Parameters(String str, Integer num) {
        this.requestId = str;
        this.statsId = num;
    }

    public static final LocalStorageGetState$Parameters a(LocalStorageGetState$Parameters localStorageGetState$Parameters) {
        return localStorageGetState$Parameters.requestId == null ? new LocalStorageGetState$Parameters("default_request_id", localStorageGetState$Parameters.statsId) : localStorageGetState$Parameters;
    }

    public static final void b(LocalStorageGetState$Parameters localStorageGetState$Parameters) {
        if (localStorageGetState$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalStorageGetState$Parameters)) {
            return false;
        }
        LocalStorageGetState$Parameters localStorageGetState$Parameters = (LocalStorageGetState$Parameters) obj;
        return epx.f(this.requestId, localStorageGetState$Parameters.requestId) && epx.f(this.statsId, localStorageGetState$Parameters.statsId);
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        Integer num = this.statsId;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", statsId=");
        return uqi.b(sb, this.statsId, ')');
    }

    public /* synthetic */ LocalStorageGetState$Parameters(String str, Integer num, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num);
    }
}
