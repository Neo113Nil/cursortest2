package com.vk.stat.scheme;

import com.ironsource.X3;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketPlayItemVideoItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0(X3.i.I0)
    private final CommonMarketStat$TypeMedia media;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonMarketStat$TypeMarketPlayItemVideoItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonMarketStat$TypeMarketPlayItemVideoItem) && epx.f(this.media, ((CommonMarketStat$TypeMarketPlayItemVideoItem) obj).media);
    }

    public final int hashCode() {
        CommonMarketStat$TypeMedia commonMarketStat$TypeMedia = this.media;
        if (commonMarketStat$TypeMedia == null) {
            return 0;
        }
        return commonMarketStat$TypeMedia.hashCode();
    }

    public final String toString() {
        return "TypeMarketPlayItemVideoItem(media=" + this.media + ')';
    }

    public CommonMarketStat$TypeMarketPlayItemVideoItem(CommonMarketStat$TypeMedia commonMarketStat$TypeMedia) {
        this.media = commonMarketStat$TypeMedia;
    }

    public /* synthetic */ CommonMarketStat$TypeMarketPlayItemVideoItem(CommonMarketStat$TypeMedia commonMarketStat$TypeMedia, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : commonMarketStat$TypeMedia);
    }
}
