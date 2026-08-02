package com.zoho.livechat.android.modules.knowledgebase.data.datasources.remote.entities;

import Gb.c;
import androidx.annotation.Keep;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import com.google.gson.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJp\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0013J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u0015J\u001a\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b-\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b.\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u001bR\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b1\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b2\u0010\u0013R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u0010\u001f¨\u00065"}, d2 = {"Lcom/zoho/livechat/android/modules/knowledgebase/data/datasources/remote/entities/ArticleCategoryResponse;", "", "", StackTraceHelper.ID_KEY, "", "articlesCount", "", "articlesModifiedTime", "childrenCount", "departmentId", "", ViewProps.ENABLED, "order", "parentCategoryId", "Lcom/google/gson/h;", "nameTranslations", "<init>", "(Ljava/lang/String;IJILjava/lang/String;ZILjava/lang/String;Lcom/google/gson/h;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()J", "component4", "component5", "component6", "()Z", "component7", "component8", "component9", "()Lcom/google/gson/h;", "copy", "(Ljava/lang/String;IJILjava/lang/String;ZILjava/lang/String;Lcom/google/gson/h;)Lcom/zoho/livechat/android/modules/knowledgebase/data/datasources/remote/entities/ArticleCategoryResponse;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "I", "getArticlesCount", "J", "getArticlesModifiedTime", "getChildrenCount", "getDepartmentId", "Z", "getEnabled", "getOrder", "getParentCategoryId", "Lcom/google/gson/h;", "getNameTranslations", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ArticleCategoryResponse {

    @c("articles_count")
    private final int articlesCount;

    @c("articles_modified_time")
    private final long articlesModifiedTime;

    @c("children_count")
    private final int childrenCount;

    @c("department_id")
    @Nullable
    private final String departmentId;

    @c(ViewProps.ENABLED)
    private final boolean enabled;

    @NotNull
    private final String id;

    @c("name_translations")
    @Nullable
    private final h nameTranslations;

    @c("order")
    private final int order;

    @c("parent_category_id")
    @Nullable
    private final String parentCategoryId;

    public ArticleCategoryResponse(@NotNull String id2, int i10, long j10, int i11, @Nullable String str, boolean z10, int i12, @Nullable String str2, @Nullable h hVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.articlesCount = i10;
        this.articlesModifiedTime = j10;
        this.childrenCount = i11;
        this.departmentId = str;
        this.enabled = z10;
        this.order = i12;
        this.parentCategoryId = str2;
        this.nameTranslations = hVar;
    }

    public static /* synthetic */ ArticleCategoryResponse copy$default(ArticleCategoryResponse articleCategoryResponse, String str, int i10, long j10, int i11, String str2, boolean z10, int i12, String str3, h hVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = articleCategoryResponse.id;
        }
        if ((i13 & 2) != 0) {
            i10 = articleCategoryResponse.articlesCount;
        }
        if ((i13 & 4) != 0) {
            j10 = articleCategoryResponse.articlesModifiedTime;
        }
        if ((i13 & 8) != 0) {
            i11 = articleCategoryResponse.childrenCount;
        }
        if ((i13 & 16) != 0) {
            str2 = articleCategoryResponse.departmentId;
        }
        if ((i13 & 32) != 0) {
            z10 = articleCategoryResponse.enabled;
        }
        if ((i13 & 64) != 0) {
            i12 = articleCategoryResponse.order;
        }
        if ((i13 & 128) != 0) {
            str3 = articleCategoryResponse.parentCategoryId;
        }
        if ((i13 & 256) != 0) {
            hVar = articleCategoryResponse.nameTranslations;
        }
        String str4 = str3;
        h hVar2 = hVar;
        long j11 = j10;
        return articleCategoryResponse.copy(str, i10, j11, i11, str2, z10, i12, str4, hVar2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getArticlesCount() {
        return this.articlesCount;
    }

    /* renamed from: component3, reason: from getter */
    public final long getArticlesModifiedTime() {
        return this.articlesModifiedTime;
    }

    /* renamed from: component4, reason: from getter */
    public final int getChildrenCount() {
        return this.childrenCount;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getDepartmentId() {
        return this.departmentId;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component7, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getParentCategoryId() {
        return this.parentCategoryId;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final h getNameTranslations() {
        return this.nameTranslations;
    }

    @NotNull
    public final ArticleCategoryResponse copy(@NotNull String id2, int articlesCount, long articlesModifiedTime, int childrenCount, @Nullable String departmentId, boolean enabled, int order, @Nullable String parentCategoryId, @Nullable h nameTranslations) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new ArticleCategoryResponse(id2, articlesCount, articlesModifiedTime, childrenCount, departmentId, enabled, order, parentCategoryId, nameTranslations);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleCategoryResponse)) {
            return false;
        }
        ArticleCategoryResponse articleCategoryResponse = (ArticleCategoryResponse) other;
        return Intrinsics.areEqual(this.id, articleCategoryResponse.id) && this.articlesCount == articleCategoryResponse.articlesCount && this.articlesModifiedTime == articleCategoryResponse.articlesModifiedTime && this.childrenCount == articleCategoryResponse.childrenCount && Intrinsics.areEqual(this.departmentId, articleCategoryResponse.departmentId) && this.enabled == articleCategoryResponse.enabled && this.order == articleCategoryResponse.order && Intrinsics.areEqual(this.parentCategoryId, articleCategoryResponse.parentCategoryId) && Intrinsics.areEqual(this.nameTranslations, articleCategoryResponse.nameTranslations);
    }

    public final int getArticlesCount() {
        return this.articlesCount;
    }

    public final long getArticlesModifiedTime() {
        return this.articlesModifiedTime;
    }

    public final int getChildrenCount() {
        return this.childrenCount;
    }

    @Nullable
    public final String getDepartmentId() {
        return this.departmentId;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final h getNameTranslations() {
        return this.nameTranslations;
    }

    public final int getOrder() {
        return this.order;
    }

    @Nullable
    public final String getParentCategoryId() {
        return this.parentCategoryId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.id.hashCode() * 31) + Integer.hashCode(this.articlesCount)) * 31) + Long.hashCode(this.articlesModifiedTime)) * 31) + Integer.hashCode(this.childrenCount)) * 31;
        String str = this.departmentId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z10 = this.enabled;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode3 = (((hashCode2 + i10) * 31) + Integer.hashCode(this.order)) * 31;
        String str2 = this.parentCategoryId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        h hVar = this.nameTranslations;
        return hashCode4 + (hVar != null ? hVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ArticleCategoryResponse(id=" + this.id + ", articlesCount=" + this.articlesCount + ", articlesModifiedTime=" + this.articlesModifiedTime + ", childrenCount=" + this.childrenCount + ", departmentId=" + this.departmentId + ", enabled=" + this.enabled + ", order=" + this.order + ", parentCategoryId=" + this.parentCategoryId + ", nameTranslations=" + this.nameTranslations + ')';
    }

    public /* synthetic */ ArticleCategoryResponse(String str, int i10, long j10, int i11, String str2, boolean z10, int i12, String str3, h hVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? 0 : i10, (i13 & 4) != 0 ? -1L : j10, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? false : z10, (i13 & 64) != 0 ? -1 : i12, (i13 & 128) != 0 ? null : str3, (i13 & 256) != 0 ? null : hVar);
    }
}
