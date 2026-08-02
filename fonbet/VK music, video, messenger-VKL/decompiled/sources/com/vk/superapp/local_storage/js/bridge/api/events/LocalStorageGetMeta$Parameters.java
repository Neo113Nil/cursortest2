package com.vk.superapp.local_storage.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.ad6;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: LocalStorageGetMeta.kt */
/* loaded from: classes6.dex */
public final class LocalStorageGetMeta$Parameters implements ad6 {

    @pmi0(ApiProtocol.PARAM_KEYS)
    private final List<String> keys;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("stats_id")
    private final Integer statsId;

    public LocalStorageGetMeta$Parameters(String str, Integer num, List<String> list) {
        this.requestId = str;
        this.statsId = num;
        this.keys = list;
    }

    public static final LocalStorageGetMeta$Parameters a(LocalStorageGetMeta$Parameters localStorageGetMeta$Parameters) {
        return localStorageGetMeta$Parameters.requestId == null ? new LocalStorageGetMeta$Parameters("default_request_id", localStorageGetMeta$Parameters.statsId, localStorageGetMeta$Parameters.keys) : localStorageGetMeta$Parameters;
    }

    public static final void b(LocalStorageGetMeta$Parameters localStorageGetMeta$Parameters) {
        if (localStorageGetMeta$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final List<String> c() {
        return this.keys;
    }

    public final String d() {
        return this.requestId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalStorageGetMeta$Parameters)) {
            return false;
        }
        LocalStorageGetMeta$Parameters localStorageGetMeta$Parameters = (LocalStorageGetMeta$Parameters) obj;
        return epx.f(this.requestId, localStorageGetMeta$Parameters.requestId) && epx.f(this.statsId, localStorageGetMeta$Parameters.statsId) && epx.f(this.keys, localStorageGetMeta$Parameters.keys);
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        Integer num = this.statsId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.keys;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", statsId=");
        sb.append(this.statsId);
        sb.append(", keys=");
        return ms9.a(')', sb, this.keys);
    }

    public /* synthetic */ LocalStorageGetMeta$Parameters(String str, Integer num, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list);
    }
}
