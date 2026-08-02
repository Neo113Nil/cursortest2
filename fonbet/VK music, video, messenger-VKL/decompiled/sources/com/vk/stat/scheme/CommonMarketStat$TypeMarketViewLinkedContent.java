package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketViewLinkedContent implements MobileOfficialAppsMarketStat$TypeMarketView.b {

    @pmi0("context_content")
    private final CommonMarketStat$TypeMarketContextContent contextContent;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonMarketStat$TypeMarketViewLinkedContent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonMarketStat$TypeMarketViewLinkedContent) && epx.f(this.contextContent, ((CommonMarketStat$TypeMarketViewLinkedContent) obj).contextContent);
    }

    public final int hashCode() {
        CommonMarketStat$TypeMarketContextContent commonMarketStat$TypeMarketContextContent = this.contextContent;
        if (commonMarketStat$TypeMarketContextContent == null) {
            return 0;
        }
        return commonMarketStat$TypeMarketContextContent.hashCode();
    }

    public final String toString() {
        return "TypeMarketViewLinkedContent(contextContent=" + this.contextContent + ')';
    }

    public CommonMarketStat$TypeMarketViewLinkedContent(CommonMarketStat$TypeMarketContextContent commonMarketStat$TypeMarketContextContent) {
        this.contextContent = commonMarketStat$TypeMarketContextContent;
    }

    public /* synthetic */ CommonMarketStat$TypeMarketViewLinkedContent(CommonMarketStat$TypeMarketContextContent commonMarketStat$TypeMarketContextContent, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : commonMarketStat$TypeMarketContextContent);
    }
}
