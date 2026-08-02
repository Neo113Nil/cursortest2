package hf;

import com.zoho.livechat.android.modules.knowledgebase.data.datasources.local.entities.ArticleCategoryEntity;
import com.zoho.livechat.android.modules.knowledgebase.domain.entities.SalesIQResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class d {
    public static final SalesIQResource.a a(ArticleCategoryEntity articleCategoryEntity) {
        Intrinsics.checkNotNullParameter(articleCategoryEntity, "<this>");
        return new SalesIQResource.a(articleCategoryEntity.getId(), articleCategoryEntity.getArticlesCount(), articleCategoryEntity.getChildrenCount(), articleCategoryEntity.getDepartmentId(), articleCategoryEntity.getEnabled(), articleCategoryEntity.getOrder(), articleCategoryEntity.getParentCategoryId(), articleCategoryEntity.getName());
    }

    public static final List b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((ArticleCategoryEntity) it.next()));
        }
        return arrayList;
    }
}
