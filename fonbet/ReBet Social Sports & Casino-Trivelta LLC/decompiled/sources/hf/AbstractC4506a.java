package hf;

import com.google.gson.h;
import com.google.gson.k;
import com.zoho.livechat.android.modules.knowledgebase.data.datasources.remote.entities.ArticleCategoryResponse;
import com.zoho.livechat.android.modules.knowledgebase.ui.entities.ResourceCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import og.AbstractC5896h;

/* renamed from: hf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4506a {
    public static final ResourceCategory a(ArticleCategoryResponse articleCategoryResponse) {
        k d10;
        Set q10;
        Map.Entry entry;
        h hVar;
        k d11;
        h r10;
        Intrinsics.checkNotNullParameter(articleCategoryResponse, "<this>");
        String id2 = articleCategoryResponse.getId();
        int articlesCount = articleCategoryResponse.getArticlesCount();
        Long valueOf = Long.valueOf(articleCategoryResponse.getArticlesModifiedTime());
        int childrenCount = articleCategoryResponse.getChildrenCount();
        String departmentId = articleCategoryResponse.getDepartmentId();
        int order = articleCategoryResponse.getOrder();
        String parentCategoryId = articleCategoryResponse.getParentCategoryId();
        h nameTranslations = articleCategoryResponse.getNameTranslations();
        return new ResourceCategory(id2, articlesCount, valueOf, childrenCount, departmentId, order, parentCategoryId, (nameTranslations == null || (d10 = AbstractC5896h.d(nameTranslations)) == null || (q10 = d10.q()) == null || (entry = (Map.Entry) CollectionsKt.firstOrNull(q10)) == null || (hVar = (h) entry.getValue()) == null || (d11 = AbstractC5896h.d(hVar)) == null || (r10 = d11.r("name")) == null) ? null : AbstractC5896h.f(r10));
    }

    public static final List b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((ArticleCategoryResponse) it.next()));
        }
        return arrayList;
    }
}
