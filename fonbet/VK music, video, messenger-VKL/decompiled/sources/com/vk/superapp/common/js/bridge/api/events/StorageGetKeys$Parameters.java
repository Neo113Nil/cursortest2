package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;

/* compiled from: StorageGetKeys.kt */
/* loaded from: classes6.dex */
public final class StorageGetKeys$Parameters implements ad6 {

    @pmi0("count")
    private final int count;

    @pmi0(SignalingProtocol.KEY_OFFSET)
    private final int offset;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public StorageGetKeys$Parameters(int i, int i2, String str) {
        this.count = i;
        this.offset = i2;
        this.requestId = str;
    }

    public static final StorageGetKeys$Parameters a(StorageGetKeys$Parameters storageGetKeys$Parameters) {
        return storageGetKeys$Parameters.requestId == null ? new StorageGetKeys$Parameters(storageGetKeys$Parameters.count, storageGetKeys$Parameters.offset, "default_request_id") : storageGetKeys$Parameters;
    }

    public static final void b(StorageGetKeys$Parameters storageGetKeys$Parameters) {
        int i = storageGetKeys$Parameters.count;
        if (i < 0 || i > 1000) {
            throw new IllegalArgumentException("Value count cannot be less than 0 or more than\n                        1000");
        }
    }

    public static final void c(StorageGetKeys$Parameters storageGetKeys$Parameters) {
        if (storageGetKeys$Parameters.offset < 0) {
            throw new IllegalArgumentException("Value offset cannot be less than 0");
        }
    }

    public static final void d(StorageGetKeys$Parameters storageGetKeys$Parameters) {
        if (storageGetKeys$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final int e() {
        return this.count;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageGetKeys$Parameters)) {
            return false;
        }
        StorageGetKeys$Parameters storageGetKeys$Parameters = (StorageGetKeys$Parameters) obj;
        return this.count == storageGetKeys$Parameters.count && this.offset == storageGetKeys$Parameters.offset && epx.f(this.requestId, storageGetKeys$Parameters.requestId);
    }

    public final int f() {
        return this.offset;
    }

    public final int hashCode() {
        return this.requestId.hashCode() + shy.a(this.offset, Integer.hashCode(this.count) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(count=");
        sb.append(this.count);
        sb.append(", offset=");
        sb.append(this.offset);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
