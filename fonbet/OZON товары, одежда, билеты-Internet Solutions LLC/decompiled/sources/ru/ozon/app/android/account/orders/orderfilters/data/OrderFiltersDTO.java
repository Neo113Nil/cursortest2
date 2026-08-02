package ru.ozon.app.android.account.orders.orderfilters.data;

import Ak.C2436a;
import C.o0;
import G.g;
import K1.G;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/account/orders/orderfilters/data/OrderFiltersDTO;", "", "sorts", "", "Lru/ozon/app/android/account/orders/orderfilters/data/OrderFiltersDTO$SortDTO;", "years", "Lru/ozon/app/android/account/orders/orderfilters/data/OrderFiltersDTO$YearDTO;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getSorts", "()Ljava/util/List;", "getYears", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SortDTO", "YearDTO", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderFiltersDTO {
    public static final int $stable = 8;
    private final List<SortDTO> sorts;
    private final List<YearDTO> years;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/account/orders/orderfilters/data/OrderFiltersDTO$SortDTO;", "", "isSelected", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "deeplink", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "()Z", "getName", "()Ljava/lang/String;", "getDeeplink", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SortDTO {
        public static final int $stable = 0;

        @NotNull
        private final String deeplink;
        private final boolean isSelected;

        @NotNull
        private final String name;

        public SortDTO(boolean z11, @NotNull String name, @NotNull String deeplink) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.isSelected = z11;
            this.name = name;
            this.deeplink = deeplink;
        }

        public static /* synthetic */ SortDTO copy$default(SortDTO sortDTO, boolean z11, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = sortDTO.isSelected;
            }
            if ((i11 & 2) != 0) {
                str = sortDTO.name;
            }
            if ((i11 & 4) != 0) {
                str2 = sortDTO.deeplink;
            }
            return sortDTO.copy(z11, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final SortDTO copy(boolean isSelected, @NotNull String name, @NotNull String deeplink) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new SortDTO(isSelected, name, deeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SortDTO)) {
                return false;
            }
            SortDTO sortDTO = (SortDTO) other;
            return this.isSelected == sortDTO.isSelected && Intrinsics.d(this.name, sortDTO.name) && Intrinsics.d(this.deeplink, sortDTO.deeplink);
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

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isSelected;
            String str = this.name;
            return o0.c(G.d("SortDTO(isSelected=", ", name=", str, ", deeplink=", z11), this.deeplink, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/account/orders/orderfilters/data/OrderFiltersDTO$YearDTO;", "", "isSelected", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "deeplink", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "()Z", "getName", "()Ljava/lang/String;", "getDeeplink", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class YearDTO {
        public static final int $stable = 0;

        @NotNull
        private final String deeplink;
        private final boolean isSelected;

        @NotNull
        private final String name;

        public YearDTO(boolean z11, @NotNull String name, @NotNull String deeplink) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.isSelected = z11;
            this.name = name;
            this.deeplink = deeplink;
        }

        public static /* synthetic */ YearDTO copy$default(YearDTO yearDTO, boolean z11, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = yearDTO.isSelected;
            }
            if ((i11 & 2) != 0) {
                str = yearDTO.name;
            }
            if ((i11 & 4) != 0) {
                str2 = yearDTO.deeplink;
            }
            return yearDTO.copy(z11, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final YearDTO copy(boolean isSelected, @NotNull String name, @NotNull String deeplink) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new YearDTO(isSelected, name, deeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof YearDTO)) {
                return false;
            }
            YearDTO yearDTO = (YearDTO) other;
            return this.isSelected == yearDTO.isSelected && Intrinsics.d(this.name, yearDTO.name) && Intrinsics.d(this.deeplink, yearDTO.deeplink);
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

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isSelected;
            String str = this.name;
            return o0.c(G.d("YearDTO(isSelected=", ", name=", str, ", deeplink=", z11), this.deeplink, ")");
        }
    }

    public OrderFiltersDTO(List<SortDTO> list, List<YearDTO> list2) {
        this.sorts = list;
        this.years = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderFiltersDTO copy$default(OrderFiltersDTO orderFiltersDTO, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = orderFiltersDTO.sorts;
        }
        if ((i11 & 2) != 0) {
            list2 = orderFiltersDTO.years;
        }
        return orderFiltersDTO.copy(list, list2);
    }

    public final List<SortDTO> component1() {
        return this.sorts;
    }

    public final List<YearDTO> component2() {
        return this.years;
    }

    @NotNull
    public final OrderFiltersDTO copy(List<SortDTO> sorts, List<YearDTO> years) {
        return new OrderFiltersDTO(sorts, years);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderFiltersDTO)) {
            return false;
        }
        OrderFiltersDTO orderFiltersDTO = (OrderFiltersDTO) other;
        return Intrinsics.d(this.sorts, orderFiltersDTO.sorts) && Intrinsics.d(this.years, orderFiltersDTO.years);
    }

    public final List<SortDTO> getSorts() {
        return this.sorts;
    }

    public final List<YearDTO> getYears() {
        return this.years;
    }

    public int hashCode() {
        List<SortDTO> list = this.sorts;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<YearDTO> list2 = this.years;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return C2436a.b("OrderFiltersDTO(sorts=", this.sorts, ", years=", ")", this.years);
    }
}
