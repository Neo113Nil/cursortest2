package hf;

import com.google.gson.Gson;
import com.zoho.livechat.android.modules.knowledgebase.data.datasources.local.entities.ArticleEntity;
import com.zoho.livechat.android.modules.knowledgebase.ui.entities.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import og.AbstractC5895g;

/* loaded from: classes4.dex */
public abstract class f {
    public static final Resource a(ArticleEntity articleEntity, Gson gson, boolean z10) {
        Resource.User user;
        Resource.User user2;
        Intrinsics.checkNotNullParameter(articleEntity, "<this>");
        Intrinsics.checkNotNullParameter(gson, "gson");
        return new Resource(articleEntity.getId(), new Resource.Category(articleEntity.getCategoryId(), articleEntity.getCategoryName()), articleEntity.getTitle(), articleEntity.getDepartmentId(), articleEntity.getLanguage() != null ? (Resource.Language) AbstractC5895g.b(gson, articleEntity.getLanguage(), Resource.Language.class) : null, (articleEntity.getCreator() == null || (user2 = (Resource.User) AbstractC5895g.b(gson, articleEntity.getCreator(), Resource.User.class)) == null) ? null : user2.appendBaseUrlWithImageUrl(), (articleEntity.getModifier() == null || (user = (Resource.User) AbstractC5895g.b(gson, articleEntity.getModifier(), Resource.User.class)) == null) ? null : user.appendBaseUrlWithImageUrl(), articleEntity.getCreatedTime(), articleEntity.getModifiedTime(), articleEntity.getPublicUrl(), articleEntity.getStats() != null ? (Resource.Stats) AbstractC5895g.b(gson, articleEntity.getStats(), Resource.Stats.class) : null, z10 ? null : articleEntity.getContent(), (Resource.ArticleAction) AbstractC5895g.b(gson, articleEntity.getRatedType(), Resource.ArticleAction.class));
    }

    public static final List b(List list, Gson gson) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(gson, "gson");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((ArticleEntity) it.next(), gson, true));
        }
        return arrayList;
    }

    public static /* synthetic */ Resource c(ArticleEntity articleEntity, Gson gson, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a(articleEntity, gson, z10);
    }
}
