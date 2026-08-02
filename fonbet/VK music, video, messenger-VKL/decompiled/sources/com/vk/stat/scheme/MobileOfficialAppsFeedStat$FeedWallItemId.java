package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$FeedWallItemId {

    @pmi0("id")
    private final Integer id;

    @pmi0("owner_id")
    private final Long ownerId;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsFeedStat$FeedWallItemId() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$FeedWallItemId)) {
            return false;
        }
        MobileOfficialAppsFeedStat$FeedWallItemId mobileOfficialAppsFeedStat$FeedWallItemId = (MobileOfficialAppsFeedStat$FeedWallItemId) obj;
        return epx.f(this.ownerId, mobileOfficialAppsFeedStat$FeedWallItemId.ownerId) && epx.f(this.id, mobileOfficialAppsFeedStat$FeedWallItemId.id);
    }

    public final int hashCode() {
        Long l = this.ownerId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.id;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedWallItemId(ownerId=");
        sb.append(this.ownerId);
        sb.append(", id=");
        return uqi.b(sb, this.id, ')');
    }

    public MobileOfficialAppsFeedStat$FeedWallItemId(Long l, Integer num) {
        this.ownerId = l;
        this.id = num;
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$FeedWallItemId(Long l, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : num);
    }
}
