package ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams;

import G.g;
import Lh.a;
import Lh.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsItem;", "paramsGroups", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/util/List;LWZ/t;)V", "copy", "(JLjava/util/List;LWZ/t;)Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getParamsGroups", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderParamsVO implements c {
    private final long id;

    @NotNull
    private final List<OrderParamsItem> paramsGroups;
    private final t tokenizedEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public OrderParamsVO(long j11, @NotNull List<? extends OrderParamsItem> paramsGroups, t tVar) {
        Intrinsics.checkNotNullParameter(paramsGroups, "paramsGroups");
        this.id = j11;
        this.paramsGroups = paramsGroups;
        this.tokenizedEvent = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderParamsVO copy$default(OrderParamsVO orderParamsVO, long j11, List list, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = orderParamsVO.id;
        }
        if ((i11 & 2) != 0) {
            list = orderParamsVO.paramsGroups;
        }
        if ((i11 & 4) != 0) {
            tVar = orderParamsVO.tokenizedEvent;
        }
        return orderParamsVO.copy(j11, list, tVar);
    }

    @NotNull
    public final OrderParamsVO copy(long id2, @NotNull List<? extends OrderParamsItem> paramsGroups, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(paramsGroups, "paramsGroups");
        return new OrderParamsVO(id2, paramsGroups, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderParamsVO)) {
            return false;
        }
        OrderParamsVO orderParamsVO = (OrderParamsVO) other;
        return this.id == orderParamsVO.id && Intrinsics.d(this.paramsGroups, orderParamsVO.paramsGroups) && Intrinsics.d(this.tokenizedEvent, orderParamsVO.tokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<OrderParamsItem> getParamsGroups() {
        return this.paramsGroups;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.paramsGroups);
        t tVar = this.tokenizedEvent;
        return b11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<OrderParamsItem> list = this.paramsGroups;
        return a.b(b.b(j11, "OrderParamsVO(id=", ", paramsGroups=", list), ", tokenizedEvent=", this.tokenizedEvent, ")");
    }
}
