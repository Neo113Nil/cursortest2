package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CopyText.kt */
/* loaded from: classes6.dex */
public final class CopyText$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("text")
    private final String text;

    public CopyText$Parameters(String str, String str2) {
        this.text = str;
        this.requestId = str2;
    }

    public static final CopyText$Parameters a(CopyText$Parameters copyText$Parameters) {
        return copyText$Parameters.requestId == null ? new CopyText$Parameters(copyText$Parameters.text, "default_request_id") : copyText$Parameters;
    }

    public static final void b(CopyText$Parameters copyText$Parameters) {
        if (copyText$Parameters.text == null) {
            throw new IllegalArgumentException("Value of non-nullable member text cannot be\n                        null");
        }
        if (copyText$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CopyText$Parameters)) {
            return false;
        }
        CopyText$Parameters copyText$Parameters = (CopyText$Parameters) obj;
        return epx.f(this.text, copyText$Parameters.text) && epx.f(this.requestId, copyText$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(text=");
        sb.append(this.text);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
