package com.vk.stat.scheme;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsProfileReviewsClick {

    @pmi0("youla_author_id")
    private final String youlaAuthorId;

    @pmi0("youla_user_id")
    private final String youlaUserId;

    /* JADX WARN: Multi-variable type inference failed */
    public SchemeStat$TypeClassifiedsProfileReviewsClick() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsProfileReviewsClick)) {
            return false;
        }
        SchemeStat$TypeClassifiedsProfileReviewsClick schemeStat$TypeClassifiedsProfileReviewsClick = (SchemeStat$TypeClassifiedsProfileReviewsClick) obj;
        return epx.f(this.youlaUserId, schemeStat$TypeClassifiedsProfileReviewsClick.youlaUserId) && epx.f(this.youlaAuthorId, schemeStat$TypeClassifiedsProfileReviewsClick.youlaAuthorId);
    }

    public final int hashCode() {
        String str = this.youlaUserId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.youlaAuthorId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClassifiedsProfileReviewsClick(youlaUserId=");
        sb.append(this.youlaUserId);
        sb.append(", youlaAuthorId=");
        return ho8.a(sb, this.youlaAuthorId, ')');
    }

    public SchemeStat$TypeClassifiedsProfileReviewsClick(String str, String str2) {
        this.youlaUserId = str;
        this.youlaAuthorId = str2;
    }

    public /* synthetic */ SchemeStat$TypeClassifiedsProfileReviewsClick(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
