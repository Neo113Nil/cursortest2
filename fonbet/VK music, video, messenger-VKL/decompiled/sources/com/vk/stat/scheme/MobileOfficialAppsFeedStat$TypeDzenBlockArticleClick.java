package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeDzenBlockArticleClick implements SchemeStat$TypeClick.b {

    @pmi0("article_id")
    private final MobileOfficialAppsConDzenStat$ArticleInfoArticleId articleId;

    @pmi0("target")
    private final Target target;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class Target {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Target[] $VALUES;

        @pmi0("button")
        public static final Target BUTTON;

        @pmi0("card")
        public static final Target CARD;

        static {
            Target target = new Target("CARD", 0);
            CARD = target;
            Target target2 = new Target("BUTTON", 1);
            BUTTON = target2;
            Target[] targetArr = {target, target2};
            $VALUES = targetArr;
            $ENTRIES = new asp(targetArr);
        }

        private Target(String str, int i) {
        }

        public static Target valueOf(String str) {
            return (Target) Enum.valueOf(Target.class, str);
        }

        public static Target[] values() {
            return (Target[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsFeedStat$TypeDzenBlockArticleClick(Target target, MobileOfficialAppsConDzenStat$ArticleInfoArticleId mobileOfficialAppsConDzenStat$ArticleInfoArticleId) {
        this.target = target;
        this.articleId = mobileOfficialAppsConDzenStat$ArticleInfoArticleId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeDzenBlockArticleClick)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeDzenBlockArticleClick mobileOfficialAppsFeedStat$TypeDzenBlockArticleClick = (MobileOfficialAppsFeedStat$TypeDzenBlockArticleClick) obj;
        return this.target == mobileOfficialAppsFeedStat$TypeDzenBlockArticleClick.target && epx.f(this.articleId, mobileOfficialAppsFeedStat$TypeDzenBlockArticleClick.articleId);
    }

    public final int hashCode() {
        return this.articleId.a.hashCode() + (this.target.hashCode() * 31);
    }

    public final String toString() {
        return "TypeDzenBlockArticleClick(target=" + this.target + ", articleId=" + this.articleId + ')';
    }
}
