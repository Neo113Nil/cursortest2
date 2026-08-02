package com.vk.superapp.local_storage.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: LocalStorageWrite.kt */
/* loaded from: classes6.dex */
public final class LocalStorageWrite$Parameters implements ad6 {

    @pmi0("data")
    private final String data;

    @pmi0("key")
    private final String key;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("stats_id")
    private final Integer statsId;

    public LocalStorageWrite$Parameters(String str, String str2, String str3, Integer num) {
        this.requestId = str;
        this.key = str2;
        this.data = str3;
        this.statsId = num;
    }

    public static final LocalStorageWrite$Parameters a(LocalStorageWrite$Parameters localStorageWrite$Parameters) {
        return localStorageWrite$Parameters.requestId == null ? new LocalStorageWrite$Parameters("default_request_id", localStorageWrite$Parameters.key, localStorageWrite$Parameters.data, localStorageWrite$Parameters.statsId) : localStorageWrite$Parameters;
    }

    public static final void b(LocalStorageWrite$Parameters localStorageWrite$Parameters) {
        if (localStorageWrite$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
        if (localStorageWrite$Parameters.key == null) {
            throw new IllegalArgumentException("Value of non-nullable member key cannot be\n                        null");
        }
        if (localStorageWrite$Parameters.data == null) {
            throw new IllegalArgumentException("Value of non-nullable member data cannot be\n                        null");
        }
    }

    public final String c() {
        return this.data;
    }

    public final String d() {
        return this.key;
    }

    public final String e() {
        return this.requestId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalStorageWrite$Parameters)) {
            return false;
        }
        LocalStorageWrite$Parameters localStorageWrite$Parameters = (LocalStorageWrite$Parameters) obj;
        return epx.f(this.requestId, localStorageWrite$Parameters.requestId) && epx.f(this.key, localStorageWrite$Parameters.key) && epx.f(this.data, localStorageWrite$Parameters.data) && epx.f(this.statsId, localStorageWrite$Parameters.statsId);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.requestId.hashCode() * 31, 31, this.key), 31, this.data);
        Integer num = this.statsId;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", statsId=");
        return uqi.b(sb, this.statsId, ')');
    }

    public /* synthetic */ LocalStorageWrite$Parameters(String str, String str2, String str3, Integer num, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : num);
    }
}
