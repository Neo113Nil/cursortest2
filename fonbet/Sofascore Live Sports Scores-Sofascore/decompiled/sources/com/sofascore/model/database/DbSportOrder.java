package com.sofascore.model.database;

import defpackage.mz1;
import defpackage.wt3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/sofascore/model/database/DbSportOrder;", "", "sportName", "", "sportOrder", "", "isSelected", "", "<init>", "(Ljava/lang/String;IZ)V", "getSportName", "()Ljava/lang/String;", "getSportOrder", "()I", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DbSportOrder {
    private final boolean isSelected;

    @NotNull
    private final String sportName;
    private final int sportOrder;

    public DbSportOrder(@NotNull String str, int i, boolean z) {
        str.getClass();
        this.sportName = str;
        this.sportOrder = i;
        this.isSelected = z;
    }

    public static /* synthetic */ DbSportOrder copy$default(DbSportOrder dbSportOrder, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dbSportOrder.sportName;
        }
        if ((i2 & 2) != 0) {
            i = dbSportOrder.sportOrder;
        }
        if ((i2 & 4) != 0) {
            z = dbSportOrder.isSelected;
        }
        return dbSportOrder.copy(str, i, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSportName() {
        return this.sportName;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSportOrder() {
        return this.sportOrder;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public final DbSportOrder copy(@NotNull String sportName, int sportOrder, boolean isSelected) {
        sportName.getClass();
        return new DbSportOrder(sportName, sportOrder, isSelected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DbSportOrder)) {
            return false;
        }
        DbSportOrder dbSportOrder = (DbSportOrder) other;
        return Intrinsics.c(this.sportName, dbSportOrder.sportName) && this.sportOrder == dbSportOrder.sportOrder && this.isSelected == dbSportOrder.isSelected;
    }

    @NotNull
    public final String getSportName() {
        return this.sportName;
    }

    public final int getSportOrder() {
        return this.sportOrder;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + wv8.a(this.sportOrder, this.sportName.hashCode() * 31, 31);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        String str = this.sportName;
        int i = this.sportOrder;
        return wt3.p(mz1.q(i, "DbSportOrder(sportName=", str, ", sportOrder=", ", isSelected="), this.isSelected, ")");
    }
}
