package hf;

import com.facebook.react.devsupport.StackTraceHelper;
import com.google.gson.h;
import com.google.gson.k;
import com.zoho.livechat.android.modules.knowledgebase.data.datasources.local.entities.ArticleEntity;
import com.zoho.livechat.android.modules.knowledgebase.data.datasources.remote.entities.SalesIQArticleResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import og.AbstractC5896h;

/* loaded from: classes4.dex */
public abstract class e {
    public static final ArticleEntity a(SalesIQArticleResponse salesIQArticleResponse) {
        k d10;
        h r10;
        k d11;
        h r11;
        Intrinsics.checkNotNullParameter(salesIQArticleResponse, "<this>");
        String id2 = salesIQArticleResponse.getId();
        h category = salesIQArticleResponse.getCategory();
        String f10 = (category == null || (d11 = AbstractC5896h.d(category)) == null || (r11 = d11.r(StackTraceHelper.ID_KEY)) == null) ? null : AbstractC5896h.f(r11);
        h category2 = salesIQArticleResponse.getCategory();
        String f11 = (category2 == null || (d10 = AbstractC5896h.d(category2)) == null || (r10 = d10.r("name")) == null) ? null : AbstractC5896h.f(r10);
        String title = salesIQArticleResponse.getTitle();
        h titles = salesIQArticleResponse.getTitles();
        String hVar = titles != null ? titles.toString() : null;
        String type = salesIQArticleResponse.getType();
        Boolean enabled = salesIQArticleResponse.getEnabled();
        List<String> channels = salesIQArticleResponse.getChannels();
        String obj = channels != null ? channels.toString() : null;
        h creator = salesIQArticleResponse.getCreator();
        String hVar2 = creator != null ? creator.toString() : null;
        h modifier = salesIQArticleResponse.getModifier();
        String hVar3 = modifier != null ? modifier.toString() : null;
        String departmentId = salesIQArticleResponse.getDepartmentId();
        h language = salesIQArticleResponse.getLanguage();
        String hVar4 = language != null ? language.toString() : null;
        Long createdTime = salesIQArticleResponse.getCreatedTime();
        Long modifiedTime = salesIQArticleResponse.getModifiedTime();
        String publicUrl = salesIQArticleResponse.getPublicUrl();
        String publishedTitle = salesIQArticleResponse.getPublishedTitle();
        h stats = salesIQArticleResponse.getStats();
        return new ArticleEntity(id2, f10, f11, title, hVar, type, enabled, obj, hVar2, hVar3, departmentId, hVar4, createdTime, modifiedTime, publicUrl, publishedTitle, stats != null ? stats.toString() : null, salesIQArticleResponse.getContent(), null, null, null, null, 3670016, null);
    }

    public static final List b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((SalesIQArticleResponse) it.next()));
        }
        return arrayList;
    }
}
