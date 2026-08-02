package com.sports.insider.data.repository.room.sports.db.impl;

import androidx.annotation.Keep;
import d9.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pb.f;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0001%B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u001fR$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\"\u0010\r\"\u0004\b#\u0010\u001f¨\u0006&"}, d2 = {"Lcom/sports/insider/data/repository/room/sports/db/impl/SportsTable;", "", "", "id", "", "nameEn", "nameRu", "logo", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sports/insider/data/repository/room/sports/db/impl/SportsTable;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "setId", "(I)V", "Ljava/lang/String;", "getNameEn", "setNameEn", "(Ljava/lang/String;)V", "getNameRu", "setNameRu", "getLogo", "setLogo", "KindTableNamed", "pb/f", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SportsTable {

    @NotNull
    public static final String ID_COLUMN = "idCategory";

    @NotNull
    public static final f KindTableNamed = new f();

    @NotNull
    public static final String LOGO_COLUMN = "logoCategory";

    @NotNull
    public static final String NAME_COLUMN_EN = "nameCategoryEn";

    @NotNull
    public static final String NAME_COLUMN_RU = "nameCategoryRu";

    @NotNull
    public static final String TABLE_NAME = "sports_table";
    private int id;

    @Nullable
    private String logo;

    @NotNull
    private String nameEn;

    @NotNull
    private String nameRu;

    public SportsTable(int i5, @NotNull String nameEn, @NotNull String nameRu, @Nullable String str) {
        Intrinsics.checkNotNullParameter(nameEn, "nameEn");
        Intrinsics.checkNotNullParameter(nameRu, "nameRu");
        this.id = i5;
        this.nameEn = nameEn;
        this.nameRu = nameRu;
        this.logo = str;
    }

    public static /* synthetic */ SportsTable copy$default(SportsTable sportsTable, int i5, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i5 = sportsTable.id;
        }
        if ((i10 & 2) != 0) {
            str = sportsTable.nameEn;
        }
        if ((i10 & 4) != 0) {
            str2 = sportsTable.nameRu;
        }
        if ((i10 & 8) != 0) {
            str3 = sportsTable.logo;
        }
        return sportsTable.copy(i5, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getNameEn() {
        return this.nameEn;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getNameRu() {
        return this.nameRu;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    @NotNull
    public final SportsTable copy(int id2, @NotNull String nameEn, @NotNull String nameRu, @Nullable String logo) {
        Intrinsics.checkNotNullParameter(nameEn, "nameEn");
        Intrinsics.checkNotNullParameter(nameRu, "nameRu");
        return new SportsTable(id2, nameEn, nameRu, logo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportsTable)) {
            return false;
        }
        SportsTable sportsTable = (SportsTable) other;
        return this.id == sportsTable.id && Intrinsics.areEqual(this.nameEn, sportsTable.nameEn) && Intrinsics.areEqual(this.nameRu, sportsTable.nameRu) && Intrinsics.areEqual(this.logo, sportsTable.logo);
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getLogo() {
        return this.logo;
    }

    @NotNull
    public final String getNameEn() {
        return this.nameEn;
    }

    @NotNull
    public final String getNameRu() {
        return this.nameRu;
    }

    public int hashCode() {
        int j = k.j(k.j(this.id * 31, 31, this.nameEn), 31, this.nameRu);
        String str = this.logo;
        return j + (str == null ? 0 : str.hashCode());
    }

    public final void setId(int i5) {
        this.id = i5;
    }

    public final void setLogo(@Nullable String str) {
        this.logo = str;
    }

    public final void setNameEn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nameEn = str;
    }

    public final void setNameRu(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nameRu = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SportsTable(id=");
        sb2.append(this.id);
        sb2.append(", nameEn=");
        sb2.append(this.nameEn);
        sb2.append(", nameRu=");
        sb2.append(this.nameRu);
        sb2.append(", logo=");
        return e.k(sb2, this.logo, ')');
    }

    public /* synthetic */ SportsTable(int i5, String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i5, (i10 & 2) != 0 ? "Undefined" : str, (i10 & 4) != 0 ? "Undefined" : str2, (i10 & 8) != 0 ? null : str3);
    }
}
