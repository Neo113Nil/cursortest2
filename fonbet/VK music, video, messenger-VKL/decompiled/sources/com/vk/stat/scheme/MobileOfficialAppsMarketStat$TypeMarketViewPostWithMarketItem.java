package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketViewPostWithMarketItem implements MobileOfficialAppsMarketStat$TypeMarketView.b {

    @pmi0("post_id")
    private final Integer postId;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsMarketStat$TypeMarketViewPostWithMarketItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsMarketStat$TypeMarketViewPostWithMarketItem) && epx.f(this.postId, ((MobileOfficialAppsMarketStat$TypeMarketViewPostWithMarketItem) obj).postId);
    }

    public final int hashCode() {
        Integer num = this.postId;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return uqi.b(new StringBuilder("TypeMarketViewPostWithMarketItem(postId="), this.postId, ')');
    }

    public MobileOfficialAppsMarketStat$TypeMarketViewPostWithMarketItem(Integer num) {
        this.postId = num;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketViewPostWithMarketItem(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
