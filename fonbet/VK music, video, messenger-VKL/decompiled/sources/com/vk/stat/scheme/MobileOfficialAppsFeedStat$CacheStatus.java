package com.vk.stat.scheme;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$CacheStatus {

    @pmi0("creation_time")
    private final Long creationTime;

    @pmi0("expiration_time")
    private final Long expirationTime;

    @pmi0("items")
    private final List<MobileOfficialAppsFeedStat$FeedItemId> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final Long requestId;

    @pmi0("state")
    private final MobileOfficialAppsFeedStat$ClientCacheStatus state;

    public MobileOfficialAppsFeedStat$CacheStatus() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$CacheStatus)) {
            return false;
        }
        MobileOfficialAppsFeedStat$CacheStatus mobileOfficialAppsFeedStat$CacheStatus = (MobileOfficialAppsFeedStat$CacheStatus) obj;
        return epx.f(this.requestId, mobileOfficialAppsFeedStat$CacheStatus.requestId) && epx.f(this.creationTime, mobileOfficialAppsFeedStat$CacheStatus.creationTime) && epx.f(this.expirationTime, mobileOfficialAppsFeedStat$CacheStatus.expirationTime) && epx.f(this.nextFrom, mobileOfficialAppsFeedStat$CacheStatus.nextFrom) && epx.f(this.items, mobileOfficialAppsFeedStat$CacheStatus.items) && this.state == mobileOfficialAppsFeedStat$CacheStatus.state;
    }

    public final int hashCode() {
        Long l = this.requestId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.creationTime;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.expirationTime;
        int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.nextFrom;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<MobileOfficialAppsFeedStat$FeedItemId> list = this.items;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        MobileOfficialAppsFeedStat$ClientCacheStatus mobileOfficialAppsFeedStat$ClientCacheStatus = this.state;
        return hashCode5 + (mobileOfficialAppsFeedStat$ClientCacheStatus != null ? mobileOfficialAppsFeedStat$ClientCacheStatus.hashCode() : 0);
    }

    public final String toString() {
        return "CacheStatus(requestId=" + this.requestId + ", creationTime=" + this.creationTime + ", expirationTime=" + this.expirationTime + ", nextFrom=" + this.nextFrom + ", items=" + this.items + ", state=" + this.state + ')';
    }

    public MobileOfficialAppsFeedStat$CacheStatus(Long l, Long l2, Long l3, String str, List<MobileOfficialAppsFeedStat$FeedItemId> list, MobileOfficialAppsFeedStat$ClientCacheStatus mobileOfficialAppsFeedStat$ClientCacheStatus) {
        this.requestId = l;
        this.creationTime = l2;
        this.expirationTime = l3;
        this.nextFrom = str;
        this.items = list;
        this.state = mobileOfficialAppsFeedStat$ClientCacheStatus;
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$CacheStatus(Long l, Long l2, Long l3, String str, List list, MobileOfficialAppsFeedStat$ClientCacheStatus mobileOfficialAppsFeedStat$ClientCacheStatus, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : l3, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : mobileOfficialAppsFeedStat$ClientCacheStatus);
    }
}
