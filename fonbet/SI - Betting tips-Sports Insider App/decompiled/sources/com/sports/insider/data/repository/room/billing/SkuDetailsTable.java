package com.sports.insider.data.repository.room.billing;

import androidx.annotation.Keep;
import d9.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/sports/insider/data/repository/room/billing/SkuDetailsTable;", "", "", PurchaseSubsTable.skuColumn, PurchaseSubsTable.jsonStringColumn, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/sports/insider/data/repository/room/billing/SkuDetailsTable;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSku", "setSku", "(Ljava/lang/String;)V", "getJsonString", "setJsonString", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SkuDetailsTable {

    @NotNull
    private String jsonString;

    @NotNull
    private String sku;

    public SkuDetailsTable(@NotNull String sku, @NotNull String jsonString) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        this.sku = sku;
        this.jsonString = jsonString;
    }

    public static /* synthetic */ SkuDetailsTable copy$default(SkuDetailsTable skuDetailsTable, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = skuDetailsTable.sku;
        }
        if ((i5 & 2) != 0) {
            str2 = skuDetailsTable.jsonString;
        }
        return skuDetailsTable.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getJsonString() {
        return this.jsonString;
    }

    @NotNull
    public final SkuDetailsTable copy(@NotNull String sku, @NotNull String jsonString) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        return new SkuDetailsTable(sku, jsonString);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkuDetailsTable)) {
            return false;
        }
        SkuDetailsTable skuDetailsTable = (SkuDetailsTable) other;
        return Intrinsics.areEqual(this.sku, skuDetailsTable.sku) && Intrinsics.areEqual(this.jsonString, skuDetailsTable.jsonString);
    }

    @NotNull
    public String getJsonString() {
        return this.jsonString;
    }

    @NotNull
    public String getSku() {
        return this.sku;
    }

    public int hashCode() {
        return this.jsonString.hashCode() + (this.sku.hashCode() * 31);
    }

    public void setJsonString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.jsonString = str;
    }

    public void setSku(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sku = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SkuDetailsTable(sku=");
        sb2.append(this.sku);
        sb2.append(", jsonString=");
        return e.k(sb2, this.jsonString, ')');
    }
}
