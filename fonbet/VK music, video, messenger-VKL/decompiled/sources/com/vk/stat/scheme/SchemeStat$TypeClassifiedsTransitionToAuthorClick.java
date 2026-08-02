package com.vk.stat.scheme;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsTransitionToAuthorClick {

    @pmi0("community_id")
    private final Long communityId;

    @pmi0("item_id")
    private final Long itemId;

    @pmi0("previous_screen")
    private final String previousScreen;

    @pmi0("youla_user_id")
    private final String youlaUserId;

    public SchemeStat$TypeClassifiedsTransitionToAuthorClick() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsTransitionToAuthorClick)) {
            return false;
        }
        SchemeStat$TypeClassifiedsTransitionToAuthorClick schemeStat$TypeClassifiedsTransitionToAuthorClick = (SchemeStat$TypeClassifiedsTransitionToAuthorClick) obj;
        return epx.f(this.itemId, schemeStat$TypeClassifiedsTransitionToAuthorClick.itemId) && epx.f(this.communityId, schemeStat$TypeClassifiedsTransitionToAuthorClick.communityId) && epx.f(this.youlaUserId, schemeStat$TypeClassifiedsTransitionToAuthorClick.youlaUserId) && epx.f(this.previousScreen, schemeStat$TypeClassifiedsTransitionToAuthorClick.previousScreen);
    }

    public final int hashCode() {
        Long l = this.itemId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.communityId;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.youlaUserId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.previousScreen;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClassifiedsTransitionToAuthorClick(itemId=");
        sb.append(this.itemId);
        sb.append(", communityId=");
        sb.append(this.communityId);
        sb.append(", youlaUserId=");
        sb.append(this.youlaUserId);
        sb.append(", previousScreen=");
        return ho8.a(sb, this.previousScreen, ')');
    }

    public SchemeStat$TypeClassifiedsTransitionToAuthorClick(Long l, Long l2, String str, String str2) {
        this.itemId = l;
        this.communityId = l2;
        this.youlaUserId = str;
        this.previousScreen = str2;
    }

    public /* synthetic */ SchemeStat$TypeClassifiedsTransitionToAuthorClick(Long l, Long l2, String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
