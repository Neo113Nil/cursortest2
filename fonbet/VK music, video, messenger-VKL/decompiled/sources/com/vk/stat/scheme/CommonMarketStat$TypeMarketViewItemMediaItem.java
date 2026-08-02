package com.vk.stat.scheme;

import com.ironsource.X3;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketViewItemMediaItem implements MobileOfficialAppsMarketStat$TypeMarketView.b {

    @pmi0("context_content")
    private final CommonMarketStat$TypeMarketContextContent contextContent;

    @pmi0("fomo_labels")
    private final CommonMarketStat$ProductCardFomoLabels fomoLabels;

    @pmi0(X3.i.I0)
    private final CommonMarketStat$TypeMedia media;

    @pmi0("parent_context_content")
    private final CommonMarketStat$TypeMarketContextContent parentContextContent;

    public CommonMarketStat$TypeMarketViewItemMediaItem() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMarketViewItemMediaItem)) {
            return false;
        }
        CommonMarketStat$TypeMarketViewItemMediaItem commonMarketStat$TypeMarketViewItemMediaItem = (CommonMarketStat$TypeMarketViewItemMediaItem) obj;
        return epx.f(this.media, commonMarketStat$TypeMarketViewItemMediaItem.media) && epx.f(this.contextContent, commonMarketStat$TypeMarketViewItemMediaItem.contextContent) && epx.f(this.parentContextContent, commonMarketStat$TypeMarketViewItemMediaItem.parentContextContent) && epx.f(this.fomoLabels, commonMarketStat$TypeMarketViewItemMediaItem.fomoLabels);
    }

    public final int hashCode() {
        CommonMarketStat$TypeMedia commonMarketStat$TypeMedia = this.media;
        int hashCode = (commonMarketStat$TypeMedia == null ? 0 : commonMarketStat$TypeMedia.hashCode()) * 31;
        CommonMarketStat$TypeMarketContextContent commonMarketStat$TypeMarketContextContent = this.contextContent;
        int hashCode2 = (hashCode + (commonMarketStat$TypeMarketContextContent == null ? 0 : commonMarketStat$TypeMarketContextContent.hashCode())) * 31;
        CommonMarketStat$TypeMarketContextContent commonMarketStat$TypeMarketContextContent2 = this.parentContextContent;
        int hashCode3 = (hashCode2 + (commonMarketStat$TypeMarketContextContent2 == null ? 0 : commonMarketStat$TypeMarketContextContent2.hashCode())) * 31;
        CommonMarketStat$ProductCardFomoLabels commonMarketStat$ProductCardFomoLabels = this.fomoLabels;
        return hashCode3 + (commonMarketStat$ProductCardFomoLabels != null ? commonMarketStat$ProductCardFomoLabels.hashCode() : 0);
    }

    public final String toString() {
        return "TypeMarketViewItemMediaItem(media=" + this.media + ", contextContent=" + this.contextContent + ", parentContextContent=" + this.parentContextContent + ", fomoLabels=" + this.fomoLabels + ')';
    }

    public CommonMarketStat$TypeMarketViewItemMediaItem(CommonMarketStat$TypeMedia commonMarketStat$TypeMedia, CommonMarketStat$TypeMarketContextContent commonMarketStat$TypeMarketContextContent, CommonMarketStat$TypeMarketContextContent commonMarketStat$TypeMarketContextContent2, CommonMarketStat$ProductCardFomoLabels commonMarketStat$ProductCardFomoLabels) {
        this.media = commonMarketStat$TypeMedia;
        this.contextContent = commonMarketStat$TypeMarketContextContent;
        this.parentContextContent = commonMarketStat$TypeMarketContextContent2;
        this.fomoLabels = commonMarketStat$ProductCardFomoLabels;
    }

    public /* synthetic */ CommonMarketStat$TypeMarketViewItemMediaItem(CommonMarketStat$TypeMedia commonMarketStat$TypeMedia, CommonMarketStat$TypeMarketContextContent commonMarketStat$TypeMarketContextContent, CommonMarketStat$TypeMarketContextContent commonMarketStat$TypeMarketContextContent2, CommonMarketStat$ProductCardFomoLabels commonMarketStat$ProductCardFomoLabels, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : commonMarketStat$TypeMedia, (i & 2) != 0 ? null : commonMarketStat$TypeMarketContextContent, (i & 4) != 0 ? null : commonMarketStat$TypeMarketContextContent2, (i & 8) != 0 ? null : commonMarketStat$ProductCardFomoLabels);
    }
}
