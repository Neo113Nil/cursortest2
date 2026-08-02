package com.sports.insider.data.room.general.table;

import androidx.annotation.Keep;
import d9.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r4.k;
import vb.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0001$B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010 R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010 ¨\u0006%"}, d2 = {"Lcom/sports/insider/data/room/general/table/OrdersTable;", "", "", OrdersTable.orderColumn, OrdersTable.productPayColumn, "", "id", "success", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;II)Lcom/sports/insider/data/room/general/table/OrdersTable;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrder", "getProductPay", "setProductPay", "(Ljava/lang/String;)V", "I", "getId", "setId", "(I)V", "getSuccess", "setSuccess", "OrderTableNamed", "vb/b", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OrdersTable {

    @NotNull
    public static final b OrderTableNamed = new b();

    @NotNull
    public static final String idColumn = "id";

    @NotNull
    public static final String orderColumn = "order";

    @NotNull
    public static final String productPayColumn = "productPay";

    @NotNull
    public static final String successColumn = "success";

    @NotNull
    public static final String tableName = "order_table";
    private int id;

    @NotNull
    private final String order;

    @NotNull
    private String productPay;
    private int success;

    public OrdersTable(@NotNull String order, @NotNull String productPay, int i5, int i10) {
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(productPay, "productPay");
        this.order = order;
        this.productPay = productPay;
        this.id = i5;
        this.success = i10;
    }

    public static /* synthetic */ OrdersTable copy$default(OrdersTable ordersTable, String str, String str2, int i5, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = ordersTable.order;
        }
        if ((i11 & 2) != 0) {
            str2 = ordersTable.productPay;
        }
        if ((i11 & 4) != 0) {
            i5 = ordersTable.id;
        }
        if ((i11 & 8) != 0) {
            i10 = ordersTable.success;
        }
        return ordersTable.copy(str, str2, i5, i10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getOrder() {
        return this.order;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getProductPay() {
        return this.productPay;
    }

    /* renamed from: component3, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSuccess() {
        return this.success;
    }

    @NotNull
    public final OrdersTable copy(@NotNull String order, @NotNull String productPay, int id2, int success) {
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(productPay, "productPay");
        return new OrdersTable(order, productPay, id2, success);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrdersTable)) {
            return false;
        }
        OrdersTable ordersTable = (OrdersTable) other;
        return Intrinsics.areEqual(this.order, ordersTable.order) && Intrinsics.areEqual(this.productPay, ordersTable.productPay) && this.id == ordersTable.id && this.success == ordersTable.success;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getOrder() {
        return this.order;
    }

    @NotNull
    public final String getProductPay() {
        return this.productPay;
    }

    public final int getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return ((k.j(this.order.hashCode() * 31, 31, this.productPay) + this.id) * 31) + this.success;
    }

    public final void setId(int i5) {
        this.id = i5;
    }

    public final void setProductPay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.productPay = str;
    }

    public final void setSuccess(int i5) {
        this.success = i5;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("OrdersTable(order=");
        sb2.append(this.order);
        sb2.append(", productPay=");
        sb2.append(this.productPay);
        sb2.append(", id=");
        sb2.append(this.id);
        sb2.append(", success=");
        return e.i(sb2, this.success, ')');
    }

    public /* synthetic */ OrdersTable(String str, String str2, int i5, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i5, (i11 & 8) != 0 ? 0 : i10);
    }
}
