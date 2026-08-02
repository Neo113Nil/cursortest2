package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConDzenStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConDzenStat$ScrollArticleEvent {

    @pmi0("article_info")
    private final MobileOfficialAppsConDzenStat$ArticleInfo articleInfo;

    @pmi0("scroll_pesent")
    private final ScrollPesent scrollPesent;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConDzenStat.kt */
    public static final class ScrollPesent {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ScrollPesent[] $VALUES;

        @pmi0("scrolled_p1")
        public static final ScrollPesent SCROLLED_P1;

        @pmi0("scrolled_p100")
        public static final ScrollPesent SCROLLED_P100;

        @pmi0("scrolled_p25")
        public static final ScrollPesent SCROLLED_P25;

        @pmi0("scrolled_p50")
        public static final ScrollPesent SCROLLED_P50;

        @pmi0("scrolled_p75")
        public static final ScrollPesent SCROLLED_P75;

        @pmi0("scrolled_p99")
        public static final ScrollPesent SCROLLED_P99;

        static {
            ScrollPesent scrollPesent = new ScrollPesent("SCROLLED_P1", 0);
            SCROLLED_P1 = scrollPesent;
            ScrollPesent scrollPesent2 = new ScrollPesent("SCROLLED_P25", 1);
            SCROLLED_P25 = scrollPesent2;
            ScrollPesent scrollPesent3 = new ScrollPesent("SCROLLED_P50", 2);
            SCROLLED_P50 = scrollPesent3;
            ScrollPesent scrollPesent4 = new ScrollPesent("SCROLLED_P75", 3);
            SCROLLED_P75 = scrollPesent4;
            ScrollPesent scrollPesent5 = new ScrollPesent("SCROLLED_P99", 4);
            SCROLLED_P99 = scrollPesent5;
            ScrollPesent scrollPesent6 = new ScrollPesent("SCROLLED_P100", 5);
            SCROLLED_P100 = scrollPesent6;
            ScrollPesent[] scrollPesentArr = {scrollPesent, scrollPesent2, scrollPesent3, scrollPesent4, scrollPesent5, scrollPesent6};
            $VALUES = scrollPesentArr;
            $ENTRIES = new asp(scrollPesentArr);
        }

        private ScrollPesent(String str, int i) {
        }

        public static ScrollPesent valueOf(String str) {
            return (ScrollPesent) Enum.valueOf(ScrollPesent.class, str);
        }

        public static ScrollPesent[] values() {
            return (ScrollPesent[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConDzenStat$ScrollArticleEvent(ScrollPesent scrollPesent, MobileOfficialAppsConDzenStat$ArticleInfo mobileOfficialAppsConDzenStat$ArticleInfo) {
        this.scrollPesent = scrollPesent;
        this.articleInfo = mobileOfficialAppsConDzenStat$ArticleInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConDzenStat$ScrollArticleEvent)) {
            return false;
        }
        MobileOfficialAppsConDzenStat$ScrollArticleEvent mobileOfficialAppsConDzenStat$ScrollArticleEvent = (MobileOfficialAppsConDzenStat$ScrollArticleEvent) obj;
        return this.scrollPesent == mobileOfficialAppsConDzenStat$ScrollArticleEvent.scrollPesent && epx.f(this.articleInfo, mobileOfficialAppsConDzenStat$ScrollArticleEvent.articleInfo);
    }

    public final int hashCode() {
        return this.articleInfo.hashCode() + (this.scrollPesent.hashCode() * 31);
    }

    public final String toString() {
        return "ScrollArticleEvent(scrollPesent=" + this.scrollPesent + ", articleInfo=" + this.articleInfo + ')';
    }
}
