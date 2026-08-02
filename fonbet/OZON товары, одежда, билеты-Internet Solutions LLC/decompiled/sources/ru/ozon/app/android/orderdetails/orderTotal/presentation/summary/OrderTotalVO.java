package ru.ozon.app.android.orderdetails.orderTotal.presentation.summary;

import De.C2860c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b!\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/HeaderVO;", CommentV3DTO.HEADER_FIELD_NAME, "", "Lru/ozon/uni/atoms/data/AtomDTO;", "badges", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/AbstractPriceBlockVO;", "prices", "<init>", "(JLru/ozon/app/android/orderdetails/orderTotal/presentation/summary/HeaderVO;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/HeaderVO;", "getHeader", "()Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/HeaderVO;", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "getPrices", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderTotalVO implements c {
    private final List<AtomDTO> badges;

    @NotNull
    private final HeaderVO header;
    private final long id;
    private final List<AbstractPriceBlockVO> prices;

    /* JADX WARN: Multi-variable type inference failed */
    public OrderTotalVO(long j11, @NotNull HeaderVO header, List<? extends AtomDTO> list, List<? extends AbstractPriceBlockVO> list2) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.id = j11;
        this.header = header;
        this.badges = list;
        this.prices = list2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderTotalVO)) {
            return false;
        }
        OrderTotalVO orderTotalVO = (OrderTotalVO) other;
        return this.id == orderTotalVO.id && Intrinsics.d(this.header, orderTotalVO.header) && Intrinsics.d(this.badges, orderTotalVO.badges) && Intrinsics.d(this.prices, orderTotalVO.prices);
    }

    public final List<AtomDTO> getBadges() {
        return this.badges;
    }

    @NotNull
    public final HeaderVO getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final List<AbstractPriceBlockVO> getPrices() {
        return this.prices;
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
        int hashCode = (this.header.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        List<AtomDTO> list = this.badges;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<AbstractPriceBlockVO> list2 = this.prices;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        HeaderVO headerVO = this.header;
        List<AtomDTO> list = this.badges;
        List<AbstractPriceBlockVO> list2 = this.prices;
        StringBuilder sb2 = new StringBuilder("OrderTotalVO(id=");
        sb2.append(j11);
        sb2.append(", header=");
        sb2.append(headerVO);
        C2860c.g(", badges=", ", prices=", sb2, list, list2);
        sb2.append(")");
        return sb2.toString();
    }
}
