package com.sofascore.model.database;

import defpackage.fc6;
import defpackage.mz1;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/sofascore/model/database/DbPopularCategories;", "", "sportName", "", "categoryId", "", "orderIndex", "<init>", "(Ljava/lang/String;II)V", "getSportName", "()Ljava/lang/String;", "getCategoryId", "()I", "getOrderIndex", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DbPopularCategories {
    private final int categoryId;
    private final int orderIndex;

    @NotNull
    private final String sportName;

    public DbPopularCategories(@NotNull String str, int i, int i2) {
        str.getClass();
        this.sportName = str;
        this.categoryId = i;
        this.orderIndex = i2;
    }

    public static /* synthetic */ DbPopularCategories copy$default(DbPopularCategories dbPopularCategories, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = dbPopularCategories.sportName;
        }
        if ((i3 & 2) != 0) {
            i = dbPopularCategories.categoryId;
        }
        if ((i3 & 4) != 0) {
            i2 = dbPopularCategories.orderIndex;
        }
        return dbPopularCategories.copy(str, i, i2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSportName() {
        return this.sportName;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCategoryId() {
        return this.categoryId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getOrderIndex() {
        return this.orderIndex;
    }

    @NotNull
    public final DbPopularCategories copy(@NotNull String sportName, int categoryId, int orderIndex) {
        sportName.getClass();
        return new DbPopularCategories(sportName, categoryId, orderIndex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DbPopularCategories)) {
            return false;
        }
        DbPopularCategories dbPopularCategories = (DbPopularCategories) other;
        return Intrinsics.c(this.sportName, dbPopularCategories.sportName) && this.categoryId == dbPopularCategories.categoryId && this.orderIndex == dbPopularCategories.orderIndex;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final int getOrderIndex() {
        return this.orderIndex;
    }

    @NotNull
    public final String getSportName() {
        return this.sportName;
    }

    public int hashCode() {
        return Integer.hashCode(this.orderIndex) + wv8.a(this.categoryId, this.sportName.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.sportName;
        return fc6.h(this.orderIndex, ")", mz1.q(this.categoryId, "DbPopularCategories(sportName=", str, ", categoryId=", ", orderIndex="));
    }
}
