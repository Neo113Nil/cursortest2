package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConDzenStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConDzenStat$OpenArticleEvent {

    @pmi0("article_info")
    private final MobileOfficialAppsConDzenStat$ArticleInfo articleInfo;

    @pmi0("entry_point")
    private final EntryPoint entryPoint;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConDzenStat.kt */
    public static final class EntryPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @pmi0("deeplink")
        public static final EntryPoint DEEPLINK;

        @pmi0("feed_block")
        public static final EntryPoint FEED_BLOCK;

        static {
            EntryPoint entryPoint = new EntryPoint("FEED_BLOCK", 0);
            FEED_BLOCK = entryPoint;
            EntryPoint entryPoint2 = new EntryPoint("DEEPLINK", 1);
            DEEPLINK = entryPoint2;
            EntryPoint[] entryPointArr = {entryPoint, entryPoint2};
            $VALUES = entryPointArr;
            $ENTRIES = new asp(entryPointArr);
        }

        private EntryPoint(String str, int i) {
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConDzenStat$OpenArticleEvent(EntryPoint entryPoint, MobileOfficialAppsConDzenStat$ArticleInfo mobileOfficialAppsConDzenStat$ArticleInfo) {
        this.entryPoint = entryPoint;
        this.articleInfo = mobileOfficialAppsConDzenStat$ArticleInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConDzenStat$OpenArticleEvent)) {
            return false;
        }
        MobileOfficialAppsConDzenStat$OpenArticleEvent mobileOfficialAppsConDzenStat$OpenArticleEvent = (MobileOfficialAppsConDzenStat$OpenArticleEvent) obj;
        return this.entryPoint == mobileOfficialAppsConDzenStat$OpenArticleEvent.entryPoint && epx.f(this.articleInfo, mobileOfficialAppsConDzenStat$OpenArticleEvent.articleInfo);
    }

    public final int hashCode() {
        return this.articleInfo.hashCode() + (this.entryPoint.hashCode() * 31);
    }

    public final String toString() {
        return "OpenArticleEvent(entryPoint=" + this.entryPoint + ", articleInfo=" + this.articleInfo + ')';
    }
}
