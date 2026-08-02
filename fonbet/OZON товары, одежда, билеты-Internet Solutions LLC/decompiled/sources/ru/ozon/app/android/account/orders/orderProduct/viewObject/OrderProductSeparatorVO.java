package ru.ozon.app.android.account.orders.orderProduct.viewObject;

import Ak.C2436a;
import G.g;
import GR.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/account/orders/orderProduct/viewObject/OrderProductSeparatorVO;", "Ll20/c;", "", "id", "", "backgroundColor", "Lru/ozon/uni/atoms/data/common/Paddings;", "leftPadding", "rightPadding", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/common/Paddings;", "getLeftPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getRightPadding", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderProductSeparatorVO implements c {

    @NotNull
    private final String backgroundColor;
    private final long id;

    @NotNull
    private final Paddings leftPadding;

    @NotNull
    private final Paddings rightPadding;

    public OrderProductSeparatorVO(long j11, @NotNull String backgroundColor, @NotNull Paddings leftPadding, @NotNull Paddings rightPadding) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
        Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
        this.id = j11;
        this.backgroundColor = backgroundColor;
        this.leftPadding = leftPadding;
        this.rightPadding = rightPadding;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderProductSeparatorVO)) {
            return false;
        }
        OrderProductSeparatorVO orderProductSeparatorVO = (OrderProductSeparatorVO) other;
        return this.id == orderProductSeparatorVO.id && Intrinsics.d(this.backgroundColor, orderProductSeparatorVO.backgroundColor) && this.leftPadding == orderProductSeparatorVO.leftPadding && this.rightPadding == orderProductSeparatorVO.rightPadding;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final Paddings getLeftPadding() {
        return this.leftPadding;
    }

    @NotNull
    public final Paddings getRightPadding() {
        return this.rightPadding;
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
        return this.rightPadding.hashCode() + b.b(this.leftPadding, g.a(Long.hashCode(this.id) * 31, 31, this.backgroundColor), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.backgroundColor;
        Paddings paddings = this.leftPadding;
        Paddings paddings2 = this.rightPadding;
        StringBuilder c11 = C2436a.c(j11, "OrderProductSeparatorVO(id=", ", backgroundColor=", str);
        c11.append(", leftPadding=");
        c11.append(paddings);
        c11.append(", rightPadding=");
        c11.append(paddings2);
        c11.append(")");
        return c11.toString();
    }
}
