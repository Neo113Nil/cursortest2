package ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.lsatdivider;

import Bl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/lsatdivider/OrderDeliveryDetailBottomDividerVO;", "Ll20/c;", "", "id", "", "hasIconButton", "<init>", "(JZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "getHasIconButton", "()Z", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderDeliveryDetailBottomDividerVO implements c {
    private final boolean hasIconButton;
    private final long id;

    public OrderDeliveryDetailBottomDividerVO(long j11, boolean z11) {
        this.id = j11;
        this.hasIconButton = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDeliveryDetailBottomDividerVO)) {
            return false;
        }
        OrderDeliveryDetailBottomDividerVO orderDeliveryDetailBottomDividerVO = (OrderDeliveryDetailBottomDividerVO) other;
        return this.id == orderDeliveryDetailBottomDividerVO.id && this.hasIconButton == orderDeliveryDetailBottomDividerVO.hasIconButton;
    }

    public final boolean getHasIconButton() {
        return this.hasIconButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasIconButton) + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder c11 = b.c(this.id, "OrderDeliveryDetailBottomDividerVO(id=", ", hasIconButton=", this.hasIconButton);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ OrderDeliveryDetailBottomDividerVO(long j11, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, (i11 & 2) != 0 ? false : z11);
    }
}
