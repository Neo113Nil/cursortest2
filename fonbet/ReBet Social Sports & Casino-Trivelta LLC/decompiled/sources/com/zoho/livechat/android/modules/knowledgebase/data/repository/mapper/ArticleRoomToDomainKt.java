package com.zoho.livechat.android.modules.knowledgebase.data.repository.mapper;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zoho.livechat.android.modules.knowledgebase.data.datasources.local.entities.ArticleEntity;
import com.zoho.livechat.android.modules.knowledgebase.domain.entities.SalesIQResource;
import com.zoho.livechat.android.utils.y;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.EnumC5132a;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import og.AbstractC5895g;
import og.i;

/* loaded from: classes4.dex */
public abstract class ArticleRoomToDomainKt {
    public static final SalesIQResource.Data a(ArticleEntity articleEntity, Gson gson, boolean z10) {
        SalesIQResource.Data.Stats stats;
        String content;
        boolean z11;
        String str;
        EnumC5132a enumC5132a;
        EnumC5132a enumC5132a2;
        Intrinsics.checkNotNullParameter(articleEntity, "<this>");
        Intrinsics.checkNotNullParameter(gson, "gson");
        new TypeToken<List<? extends SalesIQResource.Data.Title>>() { // from class: com.zoho.livechat.android.modules.knowledgebase.data.repository.mapper.ArticleRoomToDomainKt$toDomainEntity$titleListType$1
        }.getType();
        String id2 = articleEntity.getId();
        SalesIQResource.Data.Category category = new SalesIQResource.Data.Category(articleEntity.getCategoryId(), articleEntity.getCategoryName());
        String type = articleEntity.getType();
        String title = articleEntity.getTitle();
        String departmentId = articleEntity.getDepartmentId();
        Boolean enabled = articleEntity.getEnabled();
        boolean booleanValue = enabled != null ? enabled.booleanValue() : false;
        SalesIQResource.Data.Language language = articleEntity.getLanguage() != null ? (SalesIQResource.Data.Language) AbstractC5895g.b(gson, articleEntity.getLanguage(), SalesIQResource.Data.Language.class) : null;
        SalesIQResource.Data.User user = articleEntity.getCreator() != null ? (SalesIQResource.Data.User) AbstractC5895g.b(gson, articleEntity.getCreator(), SalesIQResource.Data.User.class) : null;
        SalesIQResource.Data.User user2 = articleEntity.getModifier() != null ? (SalesIQResource.Data.User) AbstractC5895g.b(gson, articleEntity.getModifier(), SalesIQResource.Data.User.class) : null;
        Long createdTime = articleEntity.getCreatedTime();
        SalesIQResource.Data.User user3 = user;
        SalesIQResource.Data.User user4 = user2;
        Long modifiedTime = articleEntity.getModifiedTime();
        String publicUrl = articleEntity.getPublicUrl();
        SalesIQResource.Data.Stats stats2 = articleEntity.getStats() != null ? (SalesIQResource.Data.Stats) AbstractC5895g.b(gson, articleEntity.getStats(), SalesIQResource.Data.Stats.class) : null;
        ArticleEntity.a localMeta = articleEntity.getLocalMeta();
        if (i.f(localMeta != null ? localMeta.a() : null)) {
            StringBuilder sb2 = new StringBuilder();
            stats = stats2;
            sb2.append(y.INSTANCE.getFileCache().e().getAbsolutePath());
            sb2.append("/articles/");
            sb2.append(articleEntity.getId());
            sb2.append(".html");
            File file = new File(sb2.toString());
            content = file.exists() ? FilesKt.readText$default(file, null, 1, null) : articleEntity.getContent();
        } else {
            stats = stats2;
            content = articleEntity.getContent();
        }
        if (articleEntity.getRatedType() != null) {
            EnumC5132a[] values = EnumC5132a.values();
            int length = values.length;
            String str2 = content;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z11 = booleanValue;
                    enumC5132a2 = null;
                    break;
                }
                EnumC5132a enumC5132a3 = values[i10];
                int i11 = i10;
                z11 = booleanValue;
                if (Intrinsics.areEqual(enumC5132a3.getValue(), articleEntity.getRatedType())) {
                    enumC5132a2 = enumC5132a3;
                    break;
                }
                i10 = i11 + 1;
                booleanValue = z11;
            }
            enumC5132a = enumC5132a2;
            str = str2;
        } else {
            z11 = booleanValue;
            str = content;
            enumC5132a = null;
        }
        return new SalesIQResource.Data(id2, category, type, title, departmentId, z11, language, user3, user4, createdTime, modifiedTime, publicUrl, stats, str, enumC5132a, articleEntity.getLastViewedTime(), articleEntity.getRecentlyViewedTimeFromSearch(), z10);
    }

    public static final List b(List list, Gson gson, boolean z10) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(gson, "gson");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((ArticleEntity) it.next(), gson, z10));
        }
        return arrayList;
    }

    public static /* synthetic */ SalesIQResource.Data c(ArticleEntity articleEntity, Gson gson, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a(articleEntity, gson, z10);
    }

    public static /* synthetic */ List d(List list, Gson gson, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return b(list, gson, z10);
    }
}
