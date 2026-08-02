package com.vk.stat.scheme;

import xsna.a9y;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;

/* compiled from: MobileOfficialAppsConDzenStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsConDzenStat$ArticleInfo {
    public final transient String a;

    @pmi0("article_info")
    private final MobileOfficialAppsConDzenStat$ArticleInfoArticleId articleInfo;

    @pmi0("publisher_id")
    private final FilteredString filteredPublisherId;

    /* compiled from: MobileOfficialAppsConDzenStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsConDzenStat$ArticleInfo>, a9y<MobileOfficialAppsConDzenStat$ArticleInfo> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsConDzenStat$ArticleInfo((MobileOfficialAppsConDzenStat$ArticleInfoArticleId) dq.f(x9yVar, "article_info", tru.a(), MobileOfficialAppsConDzenStat$ArticleInfoArticleId.class), fai.C(x9yVar, "publisher_id"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsConDzenStat$ArticleInfo mobileOfficialAppsConDzenStat$ArticleInfo = (MobileOfficialAppsConDzenStat$ArticleInfo) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("article_info", tru.a().toJson(mobileOfficialAppsConDzenStat$ArticleInfo.a()));
            x9yVar.o("publisher_id", mobileOfficialAppsConDzenStat$ArticleInfo.a);
            return x9yVar;
        }
    }

    public MobileOfficialAppsConDzenStat$ArticleInfo(MobileOfficialAppsConDzenStat$ArticleInfoArticleId mobileOfficialAppsConDzenStat$ArticleInfoArticleId, String str) {
        this.articleInfo = mobileOfficialAppsConDzenStat$ArticleInfoArticleId;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(32));
        this.filteredPublisherId = filteredString;
        filteredString.a(str);
    }

    public final MobileOfficialAppsConDzenStat$ArticleInfoArticleId a() {
        return this.articleInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConDzenStat$ArticleInfo)) {
            return false;
        }
        MobileOfficialAppsConDzenStat$ArticleInfo mobileOfficialAppsConDzenStat$ArticleInfo = (MobileOfficialAppsConDzenStat$ArticleInfo) obj;
        return epx.f(this.articleInfo, mobileOfficialAppsConDzenStat$ArticleInfo.articleInfo) && epx.f(this.a, mobileOfficialAppsConDzenStat$ArticleInfo.a);
    }

    public final int hashCode() {
        int hashCode = this.articleInfo.a.hashCode() * 31;
        String str = this.a;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArticleInfo(articleInfo=");
        sb.append(this.articleInfo);
        sb.append(", publisherId=");
        return ho8.a(sb, this.a, ')');
    }

    public /* synthetic */ MobileOfficialAppsConDzenStat$ArticleInfo(MobileOfficialAppsConDzenStat$ArticleInfoArticleId mobileOfficialAppsConDzenStat$ArticleInfoArticleId, String str, int i, zcl zclVar) {
        this(mobileOfficialAppsConDzenStat$ArticleInfoArticleId, (i & 2) != 0 ? null : str);
    }
}
