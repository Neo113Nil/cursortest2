package com.vk.superapp.core.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: StorageSet.kt */
/* loaded from: classes6.dex */
public final class StorageSet$Parameters implements ad6 {

    @pmi0("key")
    private final String key;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("value")
    private final String value;

    public StorageSet$Parameters(String str, String str2, String str3) {
        this.key = str;
        this.requestId = str2;
        this.value = str3;
    }

    public static final StorageSet$Parameters a(StorageSet$Parameters storageSet$Parameters) {
        return storageSet$Parameters.requestId == null ? new StorageSet$Parameters(storageSet$Parameters.key, "default_request_id", storageSet$Parameters.value) : storageSet$Parameters;
    }

    public static final void b(StorageSet$Parameters storageSet$Parameters) {
        if (storageSet$Parameters.key.length() > 100) {
            throw new IllegalArgumentException("Value key cannot be more than 100");
        }
    }

    public static final void c(StorageSet$Parameters storageSet$Parameters) {
        if (storageSet$Parameters.key == null) {
            throw new IllegalArgumentException("Value of non-nullable member key cannot be\n                        null");
        }
        if (storageSet$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
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
        if (!(obj instanceof StorageSet$Parameters)) {
            return false;
        }
        StorageSet$Parameters storageSet$Parameters = (StorageSet$Parameters) obj;
        return epx.f(this.key, storageSet$Parameters.key) && epx.f(this.requestId, storageSet$Parameters.requestId) && epx.f(this.value, storageSet$Parameters.value);
    }

    public final String f() {
        return this.value;
    }

    public final int hashCode() {
        int a = urd0.a(this.key.hashCode() * 31, 31, this.requestId);
        String str = this.value;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(key=");
        sb.append(this.key);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", value=");
        return ho8.a(sb, this.value, ')');
    }

    public /* synthetic */ StorageSet$Parameters(String str, String str2, String str3, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
