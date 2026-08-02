package hf;

import com.google.gson.h;
import com.google.gson.k;
import com.zoho.livechat.android.models.SalesIQArticle;
import com.zoho.livechat.android.modules.knowledgebase.data.datasources.local.entities.ArticleEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.EnumC5132a;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import og.AbstractC5896h;
import og.i;

/* loaded from: classes4.dex */
public abstract class g {
    public static final SalesIQArticle a(ArticleEntity articleEntity) {
        h r10;
        h r11;
        h r12;
        Intrinsics.checkNotNullParameter(articleEntity, "<this>");
        k o10 = i.o(articleEntity.getStats());
        String id2 = articleEntity.getId();
        String title = articleEntity.getTitle();
        String categoryId = articleEntity.getCategoryId();
        String categoryName = articleEntity.getCategoryName();
        Integer num = null;
        int m10 = i.m((o10 == null || (r12 = o10.r(EnumC5132a.Viewed.getValue())) == null) ? null : Integer.valueOf(AbstractC5896h.b(r12)));
        int m11 = i.m((o10 == null || (r11 = o10.r(EnumC5132a.Liked.getValue())) == null) ? null : Integer.valueOf(AbstractC5896h.b(r11)));
        if (o10 != null && (r10 = o10.r(EnumC5132a.Disliked.getValue())) != null) {
            num = Integer.valueOf(AbstractC5896h.b(r10));
        }
        return new SalesIQArticle(id2, title, categoryId, categoryName, m10, m11, i.m(num), articleEntity.getDepartmentId(), i.r(articleEntity.getCreatedTime()), i.r(articleEntity.getModifiedTime()), articleEntity.getContent(), -1, articleEntity.getModifier());
    }

    public static final List b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((ArticleEntity) it.next()));
        }
        return arrayList;
    }
}
