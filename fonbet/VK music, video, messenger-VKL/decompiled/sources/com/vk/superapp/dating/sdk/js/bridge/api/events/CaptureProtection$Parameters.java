package com.vk.superapp.dating.sdk.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CaptureProtection.kt */
/* loaded from: classes6.dex */
public final class CaptureProtection$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("should_protect")
    private final boolean shouldProtect;

    public CaptureProtection$Parameters(boolean z, String str) {
        this.shouldProtect = z;
        this.requestId = str;
    }

    public static final CaptureProtection$Parameters a(CaptureProtection$Parameters captureProtection$Parameters) {
        return captureProtection$Parameters.requestId == null ? new CaptureProtection$Parameters(captureProtection$Parameters.shouldProtect, "default_request_id") : captureProtection$Parameters;
    }

    public final String b() {
        return this.requestId;
    }

    public final boolean c() {
        return this.shouldProtect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptureProtection$Parameters)) {
            return false;
        }
        CaptureProtection$Parameters captureProtection$Parameters = (CaptureProtection$Parameters) obj;
        return this.shouldProtect == captureProtection$Parameters.shouldProtect && epx.f(this.requestId, captureProtection$Parameters.requestId);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.shouldProtect) * 31;
        String str = this.requestId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(shouldProtect=");
        sb.append(this.shouldProtect);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
