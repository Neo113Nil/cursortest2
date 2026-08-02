package com.vk.superapp.auth.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: RelatedProfileDeleted.kt */
/* loaded from: classes6.dex */
public final class RelatedProfileDeleted$Parameters implements ad6 {

    @pmi0("related_profile_id")
    private final long relatedProfileId;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public RelatedProfileDeleted$Parameters(long j, String str) {
        this.relatedProfileId = j;
        this.requestId = str;
    }

    public static final RelatedProfileDeleted$Parameters a(RelatedProfileDeleted$Parameters relatedProfileDeleted$Parameters) {
        return relatedProfileDeleted$Parameters.requestId == null ? new RelatedProfileDeleted$Parameters(relatedProfileDeleted$Parameters.relatedProfileId, "default_request_id") : relatedProfileDeleted$Parameters;
    }

    public static final void b(RelatedProfileDeleted$Parameters relatedProfileDeleted$Parameters) {
        if (relatedProfileDeleted$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelatedProfileDeleted$Parameters)) {
            return false;
        }
        RelatedProfileDeleted$Parameters relatedProfileDeleted$Parameters = (RelatedProfileDeleted$Parameters) obj;
        return this.relatedProfileId == relatedProfileDeleted$Parameters.relatedProfileId && epx.f(this.requestId, relatedProfileDeleted$Parameters.requestId);
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
