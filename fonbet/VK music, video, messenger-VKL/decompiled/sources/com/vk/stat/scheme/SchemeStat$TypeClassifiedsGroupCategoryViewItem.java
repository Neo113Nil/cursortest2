package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsGroupCategoryViewItem {

    @pmi0("category_id")
    private final Integer categoryId;

    @pmi0("is_friends_seen")
    private final Integer isFriendsSeen;

    @pmi0("is_subscribed")
    private final Integer isSubscribed;

    @pmi0("new_count")
    private final Integer newCount;

    @pmi0("owner_id")
    private final long ownerId;

    public SchemeStat$TypeClassifiedsGroupCategoryViewItem(long j, Integer num, Integer num2, Integer num3, Integer num4) {
        this.ownerId = j;
        this.categoryId = num;
        this.isSubscribed = num2;
        this.isFriendsSeen = num3;
        this.newCount = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsGroupCategoryViewItem)) {
            return false;
        }
        SchemeStat$TypeClassifiedsGroupCategoryViewItem schemeStat$TypeClassifiedsGroupCategoryViewItem = (SchemeStat$TypeClassifiedsGroupCategoryViewItem) obj;
        return this.ownerId == schemeStat$TypeClassifiedsGroupCategoryViewItem.ownerId && epx.f(this.categoryId, schemeStat$TypeClassifiedsGroupCategoryViewItem.categoryId) && epx.f(this.isSubscribed, schemeStat$TypeClassifiedsGroupCategoryViewItem.isSubscribed) && epx.f(this.isFriendsSeen, schemeStat$TypeClassifiedsGroupCategoryViewItem.isFriendsSeen) && epx.f(this.newCount, schemeStat$TypeClassifiedsGroupCategoryViewItem.newCount);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.ownerId) * 31;
        Integer num = this.categoryId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.isSubscribed;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.isFriendsSeen;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.newCount;
        return hashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClassifiedsGroupCategoryViewItem(ownerId=");
        sb.append(this.ownerId);
        sb.append(", categoryId=");
        sb.append(this.categoryId);
        sb.append(", isSubscribed=");
        sb.append(this.isSubscribed);
        sb.append(", isFriendsSeen=");
        sb.append(this.isFriendsSeen);
        sb.append(", newCount=");
        return uqi.b(sb, this.newCount, ')');
    }

    public /* synthetic */ SchemeStat$TypeClassifiedsGroupCategoryViewItem(long j, Integer num, Integer num2, Integer num3, Integer num4, int i, zcl zclVar) {
        this(j, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4);
    }
}
