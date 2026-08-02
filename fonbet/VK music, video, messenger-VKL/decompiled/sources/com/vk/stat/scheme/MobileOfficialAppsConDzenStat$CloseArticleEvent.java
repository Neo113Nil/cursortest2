package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConDzenStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConDzenStat$CloseArticleEvent {

    @pmi0("article_info")
    private final MobileOfficialAppsConDzenStat$ArticleInfo articleInfo;

    @pmi0("close_type")
    private final CloseType closeType;

    @pmi0("view_session_duration")
    private final int viewSessionDuration;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConDzenStat.kt */
    public static final class CloseType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CloseType[] $VALUES;

        @pmi0("read_full")
        public static final CloseType READ_FULL;

        @pmi0("read_part")
        public static final CloseType READ_PART;

        @pmi0("without_read")
        public static final CloseType WITHOUT_READ;

        static {
            CloseType closeType = new CloseType("WITHOUT_READ", 0);
            WITHOUT_READ = closeType;
            CloseType closeType2 = new CloseType("READ_PART", 1);
            READ_PART = closeType2;
            CloseType closeType3 = new CloseType("READ_FULL", 2);
            READ_FULL = closeType3;
            CloseType[] closeTypeArr = {closeType, closeType2, closeType3};
            $VALUES = closeTypeArr;
            $ENTRIES = new asp(closeTypeArr);
        }

        private CloseType(String str, int i) {
        }

        public static CloseType valueOf(String str) {
            return (CloseType) Enum.valueOf(CloseType.class, str);
        }

        public static CloseType[] values() {
            return (CloseType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConDzenStat$CloseArticleEvent(CloseType closeType, MobileOfficialAppsConDzenStat$ArticleInfo mobileOfficialAppsConDzenStat$ArticleInfo, int i) {
        this.closeType = closeType;
        this.articleInfo = mobileOfficialAppsConDzenStat$ArticleInfo;
        this.viewSessionDuration = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConDzenStat$CloseArticleEvent)) {
            return false;
        }
        MobileOfficialAppsConDzenStat$CloseArticleEvent mobileOfficialAppsConDzenStat$CloseArticleEvent = (MobileOfficialAppsConDzenStat$CloseArticleEvent) obj;
        return this.closeType == mobileOfficialAppsConDzenStat$CloseArticleEvent.closeType && epx.f(this.articleInfo, mobileOfficialAppsConDzenStat$CloseArticleEvent.articleInfo) && this.viewSessionDuration == mobileOfficialAppsConDzenStat$CloseArticleEvent.viewSessionDuration;
    }

    public final int hashCode() {
        return Integer.hashCode(this.viewSessionDuration) + ((this.articleInfo.hashCode() + (this.closeType.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CloseArticleEvent(closeType=");
        sb.append(this.closeType);
        sb.append(", articleInfo=");
        sb.append(this.articleInfo);
        sb.append(", viewSessionDuration=");
        return vu5.b(sb, this.viewSessionDuration, ')');
    }
}
