package com.vk.stat.scheme;

import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonVasStat.kt */
/* loaded from: classes5.dex */
public final class CommonVasStat$TypeDisplayLocationContext {

    @pmi0("primary_id")
    private final Long primaryId;

    @pmi0("secondary_id")
    private final Long secondaryId;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonVasStat$TypeDisplayLocationContext() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVasStat$TypeDisplayLocationContext)) {
            return false;
        }
        CommonVasStat$TypeDisplayLocationContext commonVasStat$TypeDisplayLocationContext = (CommonVasStat$TypeDisplayLocationContext) obj;
        return epx.f(this.primaryId, commonVasStat$TypeDisplayLocationContext.primaryId) && epx.f(this.secondaryId, commonVasStat$TypeDisplayLocationContext.secondaryId);
    }

    public final int hashCode() {
        Long l = this.primaryId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.secondaryId;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeDisplayLocationContext(primaryId=");
        sb.append(this.primaryId);
        sb.append(", secondaryId=");
        return iq.b(sb, this.secondaryId, ')');
    }

    public CommonVasStat$TypeDisplayLocationContext(Long l, Long l2) {
        this.primaryId = l;
        this.secondaryId = l2;
    }

    public /* synthetic */ CommonVasStat$TypeDisplayLocationContext(Long l, Long l2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2);
    }
}
