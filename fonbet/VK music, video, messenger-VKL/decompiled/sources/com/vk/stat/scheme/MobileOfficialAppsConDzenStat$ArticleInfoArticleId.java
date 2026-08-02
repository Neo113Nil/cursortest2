package com.vk.stat.scheme;

import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;

/* compiled from: MobileOfficialAppsConDzenStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsConDzenStat$ArticleInfoArticleId {
    public final transient String a;

    @pmi0("article_id")
    private final FilteredString filteredArticleId;

    /* compiled from: MobileOfficialAppsConDzenStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsConDzenStat$ArticleInfoArticleId>, a9y<MobileOfficialAppsConDzenStat$ArticleInfoArticleId> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            return new MobileOfficialAppsConDzenStat$ArticleInfoArticleId(fai.s((x9y) b9yVar, "article_id"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            x9y x9yVar = new x9y();
            x9yVar.o("article_id", ((MobileOfficialAppsConDzenStat$ArticleInfoArticleId) obj).a);
            return x9yVar;
        }
    }

    public MobileOfficialAppsConDzenStat$ArticleInfoArticleId(String str) {
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(16));
        this.filteredArticleId = filteredString;
        filteredString.a(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsConDzenStat$ArticleInfoArticleId) && epx.f(this.a, ((MobileOfficialAppsConDzenStat$ArticleInfoArticleId) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("ArticleInfoArticleId(articleId="), this.a, ')');
    }
}
