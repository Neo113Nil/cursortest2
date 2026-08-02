package hf;

import com.google.gson.h;
import com.google.gson.k;
import com.zoho.livechat.android.modules.knowledgebase.data.datasources.local.entities.ArticleCategoryEntity;
import com.zoho.livechat.android.modules.knowledgebase.data.datasources.remote.entities.ArticleCategoryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import og.AbstractC5896h;

/* loaded from: classes4.dex */
public abstract class b {
    public static final ArticleCategoryEntity a(ArticleCategoryResponse articleCategoryResponse, String languageCode) {
        k d10;
        Set q10;
        Object obj;
        h hVar;
        k d11;
        h r10;
        h r11;
        Intrinsics.checkNotNullParameter(articleCategoryResponse, "<this>");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        String id2 = articleCategoryResponse.getId();
        h nameTranslations = articleCategoryResponse.getNameTranslations();
        String str = null;
        if (nameTranslations != null && (d10 = AbstractC5896h.d(nameTranslations)) != null && (q10 = d10.q()) != null) {
            Iterator it = q10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Object value = ((Map.Entry) obj).getValue();
                Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
                k d12 = AbstractC5896h.d((h) value);
                if (Intrinsics.areEqual((d12 == null || (r11 = d12.r("language_code")) == null) ? null : AbstractC5896h.f(r11), languageCode)) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry != null && (hVar = (h) entry.getValue()) != null && (d11 = AbstractC5896h.d(hVar)) != null && (r10 = d11.r("name")) != null) {
                str = AbstractC5896h.f(r10);
            }
        }
        return new ArticleCategoryEntity(id2, str, articleCategoryResponse.getArticlesCount(), Long.valueOf(articleCategoryResponse.getArticlesModifiedTime()), articleCategoryResponse.getChildrenCount(), articleCategoryResponse.getDepartmentId(), articleCategoryResponse.getEnabled(), articleCategoryResponse.getOrder(), articleCategoryResponse.getParentCategoryId());
    }

    public static final List b(List list, String languageCode) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((ArticleCategoryResponse) it.next(), languageCode));
        }
        return arrayList;
    }
}
