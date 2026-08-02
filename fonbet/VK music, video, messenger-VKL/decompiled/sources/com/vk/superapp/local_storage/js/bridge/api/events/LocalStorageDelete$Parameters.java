package com.vk.superapp.local_storage.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.ad6;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: LocalStorageDelete.kt */
/* loaded from: classes6.dex */
public final class LocalStorageDelete$Parameters implements ad6 {

    @pmi0(ApiProtocol.PARAM_KEYS)
    private final List<String> keys;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("stats_id")
    private final Integer statsId;

    public LocalStorageDelete$Parameters(String str, List<String> list, Integer num) {
        this.requestId = str;
        this.keys = list;
        this.statsId = num;
    }

    public static final LocalStorageDelete$Parameters a(LocalStorageDelete$Parameters localStorageDelete$Parameters) {
        return localStorageDelete$Parameters.requestId == null ? new LocalStorageDelete$Parameters("default_request_id", localStorageDelete$Parameters.keys, localStorageDelete$Parameters.statsId) : localStorageDelete$Parameters;
    }

    public static final void b(LocalStorageDelete$Parameters localStorageDelete$Parameters) {
        if (localStorageDelete$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
        if (localStorageDelete$Parameters.keys == null) {
            throw new IllegalArgumentException("Value of non-nullable member keys cannot be\n                        null");
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
        if (!(obj instanceof LocalStorageDelete$Parameters)) {
            return false;
        }
        LocalStorageDelete$Parameters localStorageDelete$Parameters = (LocalStorageDelete$Parameters) obj;
        return epx.f(this.requestId, localStorageDelete$Parameters.requestId) && epx.f(this.keys, localStorageDelete$Parameters.keys) && epx.f(this.statsId, localStorageDelete$Parameters.statsId);
    }

    public final int hashCode() {
        int a = fw3.a(this.requestId.hashCode() * 31, 31, this.keys);
        Integer num = this.statsId;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", keys=");
        sb.append(this.keys);
        sb.append(", statsId=");
        return uqi.b(sb, this.statsId, ')');
    }

    public /* synthetic */ LocalStorageDelete$Parameters(String str, List list, Integer num, int i, zcl zclVar) {
        this(str, list, (i & 4) != 0 ? null : num);
    }
}
