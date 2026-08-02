package com.sports.insider.data.repository.room.billing;

import androidx.annotation.Keep;
import eb.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/sports/insider/data/repository/room/billing/SkuIdContentTypeTable;", "", "", "id", "", SkuIdContentTypeTable.typeSkuContentColumn, SkuIdContentTypeTable.typeSkuColumn, "<init>", "(Ljava/lang/String;II)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "I", "getTypeSkuContent", "()I", "getTypeSku", "setTypeSku", "(I)V", "Companion", "eb/t", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SkuIdContentTypeTable {

    @NotNull
    public static final t Companion = new t();

    @NotNull
    public static final String idColumn = "id";

    @NotNull
    public static final String tableName = "sku_id_content_type_table";

    @NotNull
    public static final String typeSkuColumn = "typeSku";

    @NotNull
    public static final String typeSkuContentColumn = "typeSkuContent";

    @NotNull
    private String id;
    private int typeSku;
    private final int typeSkuContent;

    public SkuIdContentTypeTable(@NotNull String id2, int i5, int i10) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.typeSkuContent = i5;
        this.typeSku = i10;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getTypeSku() {
        return this.typeSku;
    }

    public final int getTypeSkuContent() {
        return this.typeSkuContent;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setTypeSku(int i5) {
        this.typeSku = i5;
    }
}
