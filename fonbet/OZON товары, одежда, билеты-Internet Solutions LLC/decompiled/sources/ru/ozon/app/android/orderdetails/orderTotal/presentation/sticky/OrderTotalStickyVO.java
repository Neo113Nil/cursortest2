package ru.ozon.app.android.orderdetails.orderTotal.presentation.sticky;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/presentation/sticky/OrderTotalStickyVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/AtomDTO;", "button", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/sticky/StickySummaryVO;", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "<init>", "(JLru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/app/android/orderdetails/orderTotal/presentation/sticky/StickySummaryVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/AtomDTO;", "getButton", "()Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/sticky/StickySummaryVO;", "getSummary", "()Lru/ozon/app/android/orderdetails/orderTotal/presentation/sticky/StickySummaryVO;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderTotalStickyVO implements c {
    public static final int $stable = (TextAtom.$stable | Price.$stable) | AtomDTO.$stable;

    @NotNull
    private final AtomDTO button;
    private final long id;

    @NotNull
    private final StickySummaryVO summary;

    public OrderTotalStickyVO(long j11, @NotNull AtomDTO button, @NotNull StickySummaryVO summary) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(summary, "summary");
        this.id = j11;
        this.button = button;
        this.summary = summary;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderTotalStickyVO)) {
            return false;
        }
        OrderTotalStickyVO orderTotalStickyVO = (OrderTotalStickyVO) other;
        return this.id == orderTotalStickyVO.id && Intrinsics.d(this.button, orderTotalStickyVO.button) && Intrinsics.d(this.summary, orderTotalStickyVO.summary);
    }

    @NotNull
    public final AtomDTO getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final StickySummaryVO getSummary() {
        return this.summary;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.summary.hashCode() + ((this.button.hashCode() + (Long.hashCode(this.id) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "OrderTotalStickyVO(id=" + this.id + ", button=" + this.button + ", summary=" + this.summary + ")";
    }
}
