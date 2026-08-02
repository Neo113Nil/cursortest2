package ru.ozon.app.android.account.orders.orderfilters.presentation;

import C.o0;
import D3.h;
import G.g;
import K1.G;
import Lh.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/account/orders/orderfilters/presentation/OrderFiltersVO;", "Ll20/c;", "", "id", "", "Lru/ozon/app/android/account/orders/orderfilters/presentation/OrderFiltersVO$SortVO;", "sorts", "Lru/ozon/app/android/account/orders/orderfilters/presentation/OrderFiltersVO$YearVO;", "years", "<init>", "(JLjava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getSorts", "()Ljava/util/List;", "getYears", "SortVO", "YearVO", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderFiltersVO implements c {
    private final long id;

    @NotNull
    private final List<SortVO> sorts;

    @NotNull
    private final List<YearVO> years;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0015\u0010\n¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/account/orders/orderfilters/presentation/OrderFiltersVO$SortVO;", "", "", "isSelected", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "deeplink", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Ljava/lang/String;", "getName", "getDeeplink", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SortVO {

        @NotNull
        private final String deeplink;
        private final boolean isSelected;

        @NotNull
        private final String name;

        public SortVO(boolean z11, @NotNull String name, @NotNull String deeplink) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.isSelected = z11;
            this.name = name;
            this.deeplink = deeplink;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SortVO)) {
                return false;
            }
            SortVO sortVO = (SortVO) other;
            return this.isSelected == sortVO.isSelected && Intrinsics.d(this.name, sortVO.name) && Intrinsics.d(this.deeplink, sortVO.deeplink);
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.deeplink.hashCode() + g.a(Boolean.hashCode(this.isSelected) * 31, 31, this.name);
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isSelected;
            String str = this.name;
            return o0.c(G.d("SortVO(isSelected=", ", name=", str, ", deeplink=", z11), this.deeplink, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/account/orders/orderfilters/presentation/OrderFiltersVO$YearVO;", "", "", "isSelected", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "deeplink", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "copy", "(ZLjava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/account/orders/orderfilters/presentation/OrderFiltersVO$YearVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Ljava/lang/String;", "getName", "getDeeplink", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class YearVO {

        @NotNull
        private final String deeplink;
        private final boolean isSelected;

        @NotNull
        private final String name;

        public YearVO(boolean z11, @NotNull String name, @NotNull String deeplink) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.isSelected = z11;
            this.name = name;
            this.deeplink = deeplink;
        }

        public static /* synthetic */ YearVO copy$default(YearVO yearVO, boolean z11, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = yearVO.isSelected;
            }
            if ((i11 & 2) != 0) {
                str = yearVO.name;
            }
            if ((i11 & 4) != 0) {
                str2 = yearVO.deeplink;
            }
            return yearVO.copy(z11, str, str2);
        }

        @NotNull
        public final YearVO copy(boolean isSelected, @NotNull String name, @NotNull String deeplink) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new YearVO(isSelected, name, deeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof YearVO)) {
                return false;
            }
            YearVO yearVO = (YearVO) other;
            return this.isSelected == yearVO.isSelected && Intrinsics.d(this.name, yearVO.name) && Intrinsics.d(this.deeplink, yearVO.deeplink);
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.deeplink.hashCode() + g.a(Boolean.hashCode(this.isSelected) * 31, 31, this.name);
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isSelected;
            String str = this.name;
            return o0.c(G.d("YearVO(isSelected=", ", name=", str, ", deeplink=", z11), this.deeplink, ")");
        }
    }

    public OrderFiltersVO(long j11, @NotNull List<SortVO> sorts, @NotNull List<YearVO> years) {
        Intrinsics.checkNotNullParameter(sorts, "sorts");
        Intrinsics.checkNotNullParameter(years, "years");
        this.id = j11;
        this.sorts = sorts;
        this.years = years;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderFiltersVO)) {
            return false;
        }
        OrderFiltersVO orderFiltersVO = (OrderFiltersVO) other;
        return this.id == orderFiltersVO.id && Intrinsics.d(this.sorts, orderFiltersVO.sorts) && Intrinsics.d(this.years, orderFiltersVO.years);
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
    public final List<SortVO> getSorts() {
        return this.sorts;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    @NotNull
    public final List<YearVO> getYears() {
        return this.years;
    }

    public int hashCode() {
        return this.years.hashCode() + g.b(Long.hashCode(this.id) * 31, 31, this.sorts);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<SortVO> list = this.sorts;
        return h.c(b.b(j11, "OrderFiltersVO(id=", ", sorts=", list), ", years=", this.years, ")");
    }
}
