package com.vk.superapp.auth.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: RelatedProfileCreated.kt */
/* loaded from: classes6.dex */
public final class RelatedProfileCreated$Parameters implements ad6 {

    @pmi0("related_profile_id")
    private final long relatedProfileId;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public RelatedProfileCreated$Parameters(long j, String str) {
        this.relatedProfileId = j;
        this.requestId = str;
    }

    public static final RelatedProfileCreated$Parameters a(RelatedProfileCreated$Parameters relatedProfileCreated$Parameters) {
        return relatedProfileCreated$Parameters.requestId == null ? new RelatedProfileCreated$Parameters(relatedProfileCreated$Parameters.relatedProfileId, "default_request_id") : relatedProfileCreated$Parameters;
    }

    public static final void b(RelatedProfileCreated$Parameters relatedProfileCreated$Parameters) {
        if (relatedProfileCreated$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelatedProfileCreated$Parameters)) {
            return false;
        }
        RelatedProfileCreated$Parameters relatedProfileCreated$Parameters = (RelatedProfileCreated$Parameters) obj;
        return this.relatedProfileId == relatedProfileCreated$Parameters.relatedProfileId && epx.f(this.requestId, relatedProfileCreated$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + (Long.hashCode(this.relatedProfileId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(relatedProfileId=");
        sb.append(this.relatedProfileId);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
