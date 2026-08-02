package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsConDzenStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConDzenStat$ShareClickEvent {

    @pmi0("article_info")
    private final MobileOfficialAppsConDzenStat$ArticleInfo articleInfo;

    public MobileOfficialAppsConDzenStat$ShareClickEvent(MobileOfficialAppsConDzenStat$ArticleInfo mobileOfficialAppsConDzenStat$ArticleInfo) {
        this.articleInfo = mobileOfficialAppsConDzenStat$ArticleInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsConDzenStat$ShareClickEvent) && epx.f(this.articleInfo, ((MobileOfficialAppsConDzenStat$ShareClickEvent) obj).articleInfo);
    }

    public final int hashCode() {
        return this.articleInfo.hashCode();
    }

    public final String toString() {
        return "ShareClickEvent(articleInfo=" + this.articleInfo + ')';
    }
}
