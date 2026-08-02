package com.zoho.livechat.android.modules.knowledgebase.ui.entities;

import androidx.annotation.Keep;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/ResourceCategory;", "", StackTraceHelper.ID_KEY, "", "count", "", "resourceModifiedTime", "", "childrenCount", "departmentId", "order", "parentCategoryId", "name", "(Ljava/lang/String;ILjava/lang/Long;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getChildrenCount", "()I", "getCount", "getDepartmentId", "()Ljava/lang/String;", "getId", "getName", "getOrder", "getParentCategoryId", "getResourceModifiedTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ResourceCategory {
    private final int childrenCount;
    private final int count;

    @Nullable
    private final String departmentId;

    @NotNull
    private final String id;

    @Nullable
    private final String name;
    private final int order;

    @Nullable
    private final String parentCategoryId;

    @Nullable
    private final Long resourceModifiedTime;

    public ResourceCategory(@NotNull String id2, int i10, @Nullable Long l10, int i11, @Nullable String str, int i12, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.count = i10;
        this.resourceModifiedTime = l10;
        this.childrenCount = i11;
        this.departmentId = str;
        this.order = i12;
        this.parentCategoryId = str2;
        this.name = str3;
    }

    public final int getChildrenCount() {
        return this.childrenCount;
    }

    public final int getCount() {
        return this.count;
    }

    @Nullable
    public final String getDepartmentId() {
        return this.departmentId;
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

    @Nullable
    public final Long getResourceModifiedTime() {
        return this.resourceModifiedTime;
    }

    public /* synthetic */ ResourceCategory(String str, int i10, Long l10, int i11, String str2, int i12, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? -1 : i10, (i13 & 4) != 0 ? -1L : l10, (i13 & 8) != 0 ? -1 : i11, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? -1 : i12, (i13 & 64) != 0 ? null : str3, (i13 & 128) != 0 ? null : str4);
    }
}
