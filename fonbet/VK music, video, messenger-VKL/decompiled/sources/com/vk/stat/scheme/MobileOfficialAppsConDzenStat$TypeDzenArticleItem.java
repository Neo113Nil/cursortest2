package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsConDzenStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConDzenStat$TypeDzenArticleItem implements SchemeStat$TypeClick.b {

    @pmi0("close_article_event")
    private final MobileOfficialAppsConDzenStat$CloseArticleEvent closeArticleEvent;

    @pmi0("open_article_event")
    private final MobileOfficialAppsConDzenStat$OpenArticleEvent openArticleEvent;

    @pmi0("scroll_article_event")
    private final MobileOfficialAppsConDzenStat$ScrollArticleEvent scrollArticleEvent;

    @pmi0("share_click_event")
    private final MobileOfficialAppsConDzenStat$ShareClickEvent shareClickEvent;

    public MobileOfficialAppsConDzenStat$TypeDzenArticleItem() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConDzenStat$TypeDzenArticleItem)) {
            return false;
        }
        MobileOfficialAppsConDzenStat$TypeDzenArticleItem mobileOfficialAppsConDzenStat$TypeDzenArticleItem = (MobileOfficialAppsConDzenStat$TypeDzenArticleItem) obj;
        return epx.f(this.openArticleEvent, mobileOfficialAppsConDzenStat$TypeDzenArticleItem.openArticleEvent) && epx.f(this.closeArticleEvent, mobileOfficialAppsConDzenStat$TypeDzenArticleItem.closeArticleEvent) && epx.f(this.scrollArticleEvent, mobileOfficialAppsConDzenStat$TypeDzenArticleItem.scrollArticleEvent) && epx.f(this.shareClickEvent, mobileOfficialAppsConDzenStat$TypeDzenArticleItem.shareClickEvent);
    }

    public final int hashCode() {
        MobileOfficialAppsConDzenStat$OpenArticleEvent mobileOfficialAppsConDzenStat$OpenArticleEvent = this.openArticleEvent;
        int hashCode = (mobileOfficialAppsConDzenStat$OpenArticleEvent == null ? 0 : mobileOfficialAppsConDzenStat$OpenArticleEvent.hashCode()) * 31;
        MobileOfficialAppsConDzenStat$CloseArticleEvent mobileOfficialAppsConDzenStat$CloseArticleEvent = this.closeArticleEvent;
        int hashCode2 = (hashCode + (mobileOfficialAppsConDzenStat$CloseArticleEvent == null ? 0 : mobileOfficialAppsConDzenStat$CloseArticleEvent.hashCode())) * 31;
        MobileOfficialAppsConDzenStat$ScrollArticleEvent mobileOfficialAppsConDzenStat$ScrollArticleEvent = this.scrollArticleEvent;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsConDzenStat$ScrollArticleEvent == null ? 0 : mobileOfficialAppsConDzenStat$ScrollArticleEvent.hashCode())) * 31;
        MobileOfficialAppsConDzenStat$ShareClickEvent mobileOfficialAppsConDzenStat$ShareClickEvent = this.shareClickEvent;
        return hashCode3 + (mobileOfficialAppsConDzenStat$ShareClickEvent != null ? mobileOfficialAppsConDzenStat$ShareClickEvent.hashCode() : 0);
    }

    public final String toString() {
        return "TypeDzenArticleItem(openArticleEvent=" + this.openArticleEvent + ", closeArticleEvent=" + this.closeArticleEvent + ", scrollArticleEvent=" + this.scrollArticleEvent + ", shareClickEvent=" + this.shareClickEvent + ')';
    }

    public MobileOfficialAppsConDzenStat$TypeDzenArticleItem(MobileOfficialAppsConDzenStat$OpenArticleEvent mobileOfficialAppsConDzenStat$OpenArticleEvent, MobileOfficialAppsConDzenStat$CloseArticleEvent mobileOfficialAppsConDzenStat$CloseArticleEvent, MobileOfficialAppsConDzenStat$ScrollArticleEvent mobileOfficialAppsConDzenStat$ScrollArticleEvent, MobileOfficialAppsConDzenStat$ShareClickEvent mobileOfficialAppsConDzenStat$ShareClickEvent) {
        this.openArticleEvent = mobileOfficialAppsConDzenStat$OpenArticleEvent;
        this.closeArticleEvent = mobileOfficialAppsConDzenStat$CloseArticleEvent;
        this.scrollArticleEvent = mobileOfficialAppsConDzenStat$ScrollArticleEvent;
        this.shareClickEvent = mobileOfficialAppsConDzenStat$ShareClickEvent;
    }

    public /* synthetic */ MobileOfficialAppsConDzenStat$TypeDzenArticleItem(MobileOfficialAppsConDzenStat$OpenArticleEvent mobileOfficialAppsConDzenStat$OpenArticleEvent, MobileOfficialAppsConDzenStat$CloseArticleEvent mobileOfficialAppsConDzenStat$CloseArticleEvent, MobileOfficialAppsConDzenStat$ScrollArticleEvent mobileOfficialAppsConDzenStat$ScrollArticleEvent, MobileOfficialAppsConDzenStat$ShareClickEvent mobileOfficialAppsConDzenStat$ShareClickEvent, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsConDzenStat$OpenArticleEvent, (i & 2) != 0 ? null : mobileOfficialAppsConDzenStat$CloseArticleEvent, (i & 4) != 0 ? null : mobileOfficialAppsConDzenStat$ScrollArticleEvent, (i & 8) != 0 ? null : mobileOfficialAppsConDzenStat$ShareClickEvent);
    }
}
