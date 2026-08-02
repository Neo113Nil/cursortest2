package com.vk.superapp.core.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: StorageGet.kt */
/* loaded from: classes6.dex */
public final class StorageGet$Parameters implements ad6 {

    @pmi0(ApiProtocol.PARAM_KEYS)
    private final List<String> keys;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public StorageGet$Parameters(List<String> list, String str) {
        this.keys = list;
        this.requestId = str;
    }

    public static final StorageGet$Parameters a(StorageGet$Parameters storageGet$Parameters) {
        return storageGet$Parameters.requestId == null ? new StorageGet$Parameters(storageGet$Parameters.keys, "default_request_id") : storageGet$Parameters;
    }

    public static final void b(StorageGet$Parameters storageGet$Parameters) {
        if (storageGet$Parameters.keys == null) {
            throw new IllegalArgumentException("Value of non-nullable member keys cannot be\n                        null");
        }
        if (storageGet$Parameters.requestId == null) {
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
        if (!(obj instanceof StorageGet$Parameters)) {
            return false;
        }
        StorageGet$Parameters storageGet$Parameters = (StorageGet$Parameters) obj;
        return epx.f(this.keys, storageGet$Parameters.keys) && epx.f(this.requestId, storageGet$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + (this.keys.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(keys=");
        sb.append(this.keys);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
