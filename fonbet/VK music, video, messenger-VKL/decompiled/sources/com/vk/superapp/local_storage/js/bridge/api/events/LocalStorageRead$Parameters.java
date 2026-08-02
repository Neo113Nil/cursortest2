package com.vk.superapp.local_storage.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: LocalStorageRead.kt */
/* loaded from: classes6.dex */
public final class LocalStorageRead$Parameters implements ad6 {

    @pmi0("key")
    private final String key;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("stats_id")
    private final Integer statsId;

    public LocalStorageRead$Parameters(String str, String str2, Integer num) {
        this.requestId = str;
        this.key = str2;
        this.statsId = num;
    }

    public static final LocalStorageRead$Parameters a(LocalStorageRead$Parameters localStorageRead$Parameters) {
        return localStorageRead$Parameters.requestId == null ? new LocalStorageRead$Parameters("default_request_id", localStorageRead$Parameters.key, localStorageRead$Parameters.statsId) : localStorageRead$Parameters;
    }

    public static final void b(LocalStorageRead$Parameters localStorageRead$Parameters) {
        if (localStorageRead$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
        if (localStorageRead$Parameters.key == null) {
            throw new IllegalArgumentException("Value of non-nullable member key cannot be\n                        null");
        }
    }

    public final String c() {
        return this.key;
    }

    public final String d() {
        return this.requestId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalStorageRead$Parameters)) {
            return false;
        }
        LocalStorageRead$Parameters localStorageRead$Parameters = (LocalStorageRead$Parameters) obj;
        return epx.f(this.requestId, localStorageRead$Parameters.requestId) && epx.f(this.key, localStorageRead$Parameters.key) && epx.f(this.statsId, localStorageRead$Parameters.statsId);
    }

    public final int hashCode() {
        int a = urd0.a(this.requestId.hashCode() * 31, 31, this.key);
        Integer num = this.statsId;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", statsId=");
        return uqi.b(sb, this.statsId, ')');
    }

    public /* synthetic */ LocalStorageRead$Parameters(String str, String str2, Integer num, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : num);
    }
}
