package com.zoho.livechat.android.modules.knowledgebase.data.datasources.local.entities;

import androidx.annotation.Keep;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jp\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0006HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017¨\u0006-"}, d2 = {"Lcom/zoho/livechat/android/modules/knowledgebase/data/datasources/local/entities/ArticleCategoryEntity;", "", StackTraceHelper.ID_KEY, "", "name", "articlesCount", "", "articlesModifiedTime", "", "childrenCount", "departmentId", ViewProps.ENABLED, "", "order", "parentCategoryId", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;ILjava/lang/String;ZILjava/lang/String;)V", "getArticlesCount", "()I", "getArticlesModifiedTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getChildrenCount", "getDepartmentId", "()Ljava/lang/String;", "getEnabled", "()Z", "getId", "getName", "getOrder", "getParentCategoryId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;ILjava/lang/String;ZILjava/lang/String;)Lcom/zoho/livechat/android/modules/knowledgebase/data/datasources/local/entities/ArticleCategoryEntity;", "equals", "other", "hashCode", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ArticleCategoryEntity {
    private final int articlesCount;

    @Nullable
    private final Long articlesModifiedTime;
    private final int childrenCount;

    @Nullable
    private final String departmentId;
    private final boolean enabled;

    @NotNull
    private final String id;

    @Nullable
    private final String name;
    private final int order;

    @Nullable
    private final String parentCategoryId;

    public ArticleCategoryEntity(@NotNull String id2, @Nullable String str, int i10, @Nullable Long l10, int i11, @Nullable String str2, boolean z10, int i12, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.name = str;
        this.articlesCount = i10;
        this.articlesModifiedTime = l10;
        this.childrenCount = i11;
        this.departmentId = str2;
        this.enabled = z10;
        this.order = i12;
        this.parentCategoryId = str3;
    }

    public static /* synthetic */ ArticleCategoryEntity copy$default(ArticleCategoryEntity articleCategoryEntity, String str, String str2, int i10, Long l10, int i11, String str3, boolean z10, int i12, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = articleCategoryEntity.id;
        }
        if ((i13 & 2) != 0) {
            str2 = articleCategoryEntity.name;
        }
        if ((i13 & 4) != 0) {
            i10 = articleCategoryEntity.articlesCount;
        }
        if ((i13 & 8) != 0) {
            l10 = articleCategoryEntity.articlesModifiedTime;
        }
        if ((i13 & 16) != 0) {
            i11 = articleCategoryEntity.childrenCount;
        }
        if ((i13 & 32) != 0) {
            str3 = articleCategoryEntity.departmentId;
        }
        if ((i13 & 64) != 0) {
            z10 = articleCategoryEntity.enabled;
        }
        if ((i13 & 128) != 0) {
            i12 = articleCategoryEntity.order;
        }
        if ((i13 & 256) != 0) {
            str4 = articleCategoryEntity.parentCategoryId;
        }
        int i14 = i12;
        String str5 = str4;
        String str6 = str3;
        boolean z11 = z10;
        int i15 = i11;
        int i16 = i10;
        return articleCategoryEntity.copy(str, str2, i16, l10, i15, str6, z11, i14, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final int getArticlesCount() {
        return this.articlesCount;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Long getArticlesModifiedTime() {
        return this.articlesModifiedTime;
    }

    /* renamed from: component5, reason: from getter */
    public final int getChildrenCount() {
        return this.childrenCount;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getDepartmentId() {
        return this.departmentId;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component8, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getParentCategoryId() {
        return this.parentCategoryId;
    }

    @NotNull
    public final ArticleCategoryEntity copy(@NotNull String id2, @Nullable String name, int articlesCount, @Nullable Long articlesModifiedTime, int childrenCount, @Nullable String departmentId, boolean enabled, int order, @Nullable String parentCategoryId) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new ArticleCategoryEntity(id2, name, articlesCount, articlesModifiedTime, childrenCount, departmentId, enabled, order, parentCategoryId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleCategoryEntity)) {
            return false;
        }
        ArticleCategoryEntity articleCategoryEntity = (ArticleCategoryEntity) other;
        return Intrinsics.areEqual(this.id, articleCategoryEntity.id) && Intrinsics.areEqual(this.name, articleCategoryEntity.name) && this.articlesCount == articleCategoryEntity.articlesCount && Intrinsics.areEqual(this.articlesModifiedTime, articleCategoryEntity.articlesModifiedTime) && this.childrenCount == articleCategoryEntity.childrenCount && Intrinsics.areEqual(this.departmentId, articleCategoryEntity.departmentId) && this.enabled == articleCategoryEntity.enabled && this.order == articleCategoryEntity.order && Intrinsics.areEqual(this.parentCategoryId, articleCategoryEntity.parentCategoryId);
    }

    public final int getArticlesCount() {
        return this.articlesCount;
    }

    @Nullable
    public final Long getArticlesModifiedTime() {
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
    public final String getName() {
        return this.name;
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
        int hashCode = this.id.hashCode() * 31;
        String str = this.name;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.articlesCount)) * 31;
        Long l10 = this.articlesModifiedTime;
        int hashCode3 = (((hashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31) + Integer.hashCode(this.childrenCount)) * 31;
        String str2 = this.departmentId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z10 = this.enabled;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode5 = (((hashCode4 + i10) * 31) + Integer.hashCode(this.order)) * 31;
        String str3 = this.parentCategoryId;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ArticleCategoryEntity(id=" + this.id + ", name=" + this.name + ", articlesCount=" + this.articlesCount + ", articlesModifiedTime=" + this.articlesModifiedTime + ", childrenCount=" + this.childrenCount + ", departmentId=" + this.departmentId + ", enabled=" + this.enabled + ", order=" + this.order + ", parentCategoryId=" + this.parentCategoryId + ')';
    }

    public /* synthetic */ ArticleCategoryEntity(String str, String str2, int i10, Long l10, int i11, String str3, boolean z10, int i12, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? 0 : i10, (i13 & 8) != 0 ? -1L : l10, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? null : str3, z10, (i13 & 128) != 0 ? -1 : i12, (i13 & 256) != 0 ? null : str4);
    }
}
