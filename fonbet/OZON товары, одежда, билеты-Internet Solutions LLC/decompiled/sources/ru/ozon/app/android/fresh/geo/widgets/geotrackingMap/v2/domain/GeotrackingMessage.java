package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.domain;

import B90.C2618u;
import C.o0;
import Cm.e;
import Pk0.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation.OrderStatusEnumVO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingMessage;", "", "<init>", "()V", "CourierLocation", "NeedsPageRefresh", "OrderStatus", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingMessage$CourierLocation;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingMessage$NeedsPageRefresh;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingMessage$OrderStatus;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class GeotrackingMessage {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingMessage$CourierLocation;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingMessage;", "", "latitude", "longitude", "direction", "", "modificationType", "<init>", "(DDDLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getLatitude", "()D", "getLongitude", "getDirection", "Ljava/lang/String;", "getModificationType", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CourierLocation extends GeotrackingMessage {
        private final double direction;
        private final double latitude;
        private final double longitude;
        private final String modificationType;

        public CourierLocation(double d11, double d12, double d13, String str) {
            super(null);
            this.latitude = d11;
            this.longitude = d12;
            this.direction = d13;
            this.modificationType = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CourierLocation)) {
                return false;
            }
            CourierLocation courierLocation = (CourierLocation) other;
            return Double.compare(this.latitude, courierLocation.latitude) == 0 && Double.compare(this.longitude, courierLocation.longitude) == 0 && Double.compare(this.direction, courierLocation.direction) == 0 && Intrinsics.d(this.modificationType, courierLocation.modificationType);
        }

        public final double getDirection() {
            return this.direction;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        public final String getModificationType() {
            return this.modificationType;
        }

        public int hashCode() {
            int a11 = g.a(g.a(Double.hashCode(this.latitude) * 31, 31, this.longitude), 31, this.direction);
            String str = this.modificationType;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            double d11 = this.latitude;
            double d12 = this.longitude;
            double d13 = this.direction;
            String str = this.modificationType;
            StringBuilder e11 = e.e(d11, "CourierLocation(latitude=", ", longitude=");
            e11.append(d12);
            e11.append(", direction=");
            e11.append(d13);
            e11.append(", modificationType=");
            return o0.c(e11, str, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingMessage$NeedsPageRefresh;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingMessage;", "", "needsPageRefresh", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getNeedsPageRefresh", "()Z", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeedsPageRefresh extends GeotrackingMessage {
        private final boolean needsPageRefresh;

        public NeedsPageRefresh(boolean z11) {
            super(null);
            this.needsPageRefresh = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NeedsPageRefresh) && this.needsPageRefresh == ((NeedsPageRefresh) other).needsPageRefresh;
        }

        public final boolean getNeedsPageRefresh() {
            return this.needsPageRefresh;
        }

        public int hashCode() {
            return Boolean.hashCode(this.needsPageRefresh);
        }

        @NotNull
        public String toString() {
            return C2618u.g("NeedsPageRefresh(needsPageRefresh=", ")", this.needsPageRefresh);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingMessage$OrderStatus;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingMessage;", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusEnumVO;", "orderStatus", "<init>", "(Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusEnumVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusEnumVO;", "getOrderStatus", "()Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusEnumVO;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrderStatus extends GeotrackingMessage {

        @NotNull
        private final OrderStatusEnumVO orderStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderStatus(@NotNull OrderStatusEnumVO orderStatus) {
            super(null);
            Intrinsics.checkNotNullParameter(orderStatus, "orderStatus");
            this.orderStatus = orderStatus;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OrderStatus) && this.orderStatus == ((OrderStatus) other).orderStatus;
        }

        @NotNull
        public final OrderStatusEnumVO getOrderStatus() {
            return this.orderStatus;
        }

        public int hashCode() {
            return this.orderStatus.hashCode();
        }

        @NotNull
        public String toString() {
            return "OrderStatus(orderStatus=" + this.orderStatus + ")";
        }
    }

    public /* synthetic */ GeotrackingMessage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GeotrackingMessage() {
    }
}
