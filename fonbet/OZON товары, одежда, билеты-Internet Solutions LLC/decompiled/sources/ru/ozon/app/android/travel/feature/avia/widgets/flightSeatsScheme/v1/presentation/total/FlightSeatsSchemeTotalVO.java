package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.total;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.orderTotal.OrderTotalVO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/total/FlightSeatsSchemeTotalVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "LA00/a$J$a;", "", "id", "Lru/ozon/app/android/travel/feature/avia/shared/orderTotal/OrderTotalVO;", "total", "<init>", "(JLru/ozon/app/android/travel/feature/avia/shared/orderTotal/OrderTotalVO;)V", "copy", "(JLru/ozon/app/android/travel/feature/avia/shared/orderTotal/OrderTotalVO;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/total/FlightSeatsSchemeTotalVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/avia/shared/orderTotal/OrderTotalVO;", "getTotal", "()Lru/ozon/app/android/travel/feature/avia/shared/orderTotal/OrderTotalVO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FlightSeatsSchemeTotalVO implements c, a.J.InterfaceC0007a {
    public static final int $stable;
    private final long id;

    @NotNull
    private final OrderTotalVO total;

    static {
        int i11 = ButtonV3Atom.SmallIconButton.$stable | ButtonV3Atom.LargeButton.$stable;
        int i12 = TextAtom.$stable;
        $stable = i11 | i12 | i12;
    }

    public FlightSeatsSchemeTotalVO(long j11, @NotNull OrderTotalVO total) {
        Intrinsics.checkNotNullParameter(total, "total");
        this.id = j11;
        this.total = total;
    }

    public static /* synthetic */ FlightSeatsSchemeTotalVO copy$default(FlightSeatsSchemeTotalVO flightSeatsSchemeTotalVO, long j11, OrderTotalVO orderTotalVO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = flightSeatsSchemeTotalVO.id;
        }
        if ((i11 & 2) != 0) {
            orderTotalVO = flightSeatsSchemeTotalVO.total;
        }
        return flightSeatsSchemeTotalVO.copy(j11, orderTotalVO);
    }

    @NotNull
    public final FlightSeatsSchemeTotalVO copy(long id2, @NotNull OrderTotalVO total) {
        Intrinsics.checkNotNullParameter(total, "total");
        return new FlightSeatsSchemeTotalVO(id2, total);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSeatsSchemeTotalVO)) {
            return false;
        }
        FlightSeatsSchemeTotalVO flightSeatsSchemeTotalVO = (FlightSeatsSchemeTotalVO) other;
        return this.id == flightSeatsSchemeTotalVO.id && Intrinsics.d(this.total, flightSeatsSchemeTotalVO.total);
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
    public final OrderTotalVO getTotal() {
        return this.total;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.total.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        return "FlightSeatsSchemeTotalVO(id=" + this.id + ", total=" + this.total + ")";
    }
}
