package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import B3.p;
import B90.C2619v;
import Cm.e;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import Pk0.g;
import WZ.t;
import android.graphics.PointF;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.molecules.tooltip.TooltipVO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b$\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002EFB\u008d\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u0012\u000e\u0010\u0015\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ°\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b-\u0010,R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b.\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b\u000e\u00105R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b7\u00108R\u001f\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b:\u0010;R\u001f\u0010\u0014\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u00109\u001a\u0004\b<\u0010;R\u001f\u0010\u0015\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b\u0015\u00109\u001a\u0004\b=\u0010;R\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0016\u00102\u001a\u0004\b>\u0010\u001fR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010?\u001a\u0004\b@\u0010AR\"\u0010B\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u00104\u001a\u0004\bB\u00105\"\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin;", "courierPin", "destinationPin", "darkStorePin", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$PinSize;", "largestPinSize", "", "orderStatus", "", "isReceived", "", "currentSheetRatio", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "locationTrackingInfo", "defaultSheetTrackingInfo", "expandedSheetTrackingInfo", "webSocketUrl", "", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Modification;", "courierPinModifications", "<init>", "(JLru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$PinSize;Ljava/lang/String;ZDLWZ/t;LWZ/t;LWZ/t;Ljava/lang/String;Ljava/util/List;)V", "copy", "(JLru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$PinSize;Ljava/lang/String;ZDLWZ/t;LWZ/t;LWZ/t;Ljava/lang/String;Ljava/util/List;)Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin;", "getCourierPin", "()Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin;", "getDestinationPin", "getDarkStorePin", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$PinSize;", "getLargestPinSize", "()Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$PinSize;", "Ljava/lang/String;", "getOrderStatus", "Z", "()Z", "D", "getCurrentSheetRatio", "()D", "LWZ/t;", "getLocationTrackingInfo", "()LWZ/t;", "getDefaultSheetTrackingInfo", "getExpandedSheetTrackingInfo", "getWebSocketUrl", "Ljava/util/List;", "getCourierPinModifications", "()Ljava/util/List;", "isInitial", "setInitial", "(Z)V", "PinSize", "Pin", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GeotrackingMapV2VO implements c {

    @NotNull
    private final Pin courierPin;

    @NotNull
    private final List<Pin.Modification> courierPinModifications;
    private final double currentSheetRatio;

    @NotNull
    private final Pin darkStorePin;
    private final t defaultSheetTrackingInfo;

    @NotNull
    private final Pin destinationPin;
    private final t expandedSheetTrackingInfo;
    private final long id;
    private boolean isInitial;
    private final boolean isReceived;

    @NotNull
    private final PinSize largestPinSize;
    private final t locationTrackingInfo;

    @NotNull
    private final String orderStatus;

    @NotNull
    private final String webSocketUrl;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001:\u0003'()B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJF\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b\t\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin;", "", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Coordinates;", "coordinates", "", "direction", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Icon;", "icon", "", "isCourier", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Modification;", "currentModification", "<init>", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Coordinates;DLru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Icon;ZLru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Modification;)V", "copy", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Coordinates;DLru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Icon;ZLru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Modification;)Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Coordinates;", "getCoordinates", "()Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Coordinates;", "D", "getDirection", "()D", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Icon;", "getIcon", "()Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Icon;", "Z", "()Z", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Modification;", "getCurrentModification", "()Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Modification;", "Coordinates", "Icon", "Modification", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Pin {
        private final Coordinates coordinates;
        private final Modification currentModification;
        private final double direction;

        @NotNull
        private final Icon icon;
        private final boolean isCourier;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Coordinates;", "", "", "longitude", "latitude", "<init>", "(DD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getLongitude", "()D", "getLatitude", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Coordinates {
            private final double latitude;
            private final double longitude;

            public Coordinates(double d11, double d12) {
                this.longitude = d11;
                this.latitude = d12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Coordinates)) {
                    return false;
                }
                Coordinates coordinates = (Coordinates) other;
                return Double.compare(this.longitude, coordinates.longitude) == 0 && Double.compare(this.latitude, coordinates.latitude) == 0;
            }

            public final double getLatitude() {
                return this.latitude;
            }

            public final double getLongitude() {
                return this.longitude;
            }

            public int hashCode() {
                return Double.hashCode(this.latitude) + (Double.hashCode(this.longitude) * 31);
            }

            @NotNull
            public String toString() {
                double d11 = this.longitude;
                return C2619v.c(e.e(d11, "Coordinates(longitude=", ", latitude="), this.latitude, ")");
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Icon;", "", "", ImagesContract.URL, "animatedIconUrl", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Icon$Options;", "options", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Icon$Options;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Icon$Options;)Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Icon;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getAnimatedIconUrl", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Icon$Options;", "getOptions", "()Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Icon$Options;", "Options", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Icon {
            private final String animatedIconUrl;

            @NotNull
            private final Options options;

            @NotNull
            private final String url;

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Icon$Options;", "", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$PinSize;", "size", "Landroid/graphics/PointF;", "contentAnchor", "<init>", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$PinSize;Landroid/graphics/PointF;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$PinSize;", "getSize", "()Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$PinSize;", "Landroid/graphics/PointF;", "getContentAnchor", "()Landroid/graphics/PointF;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Options {

                @NotNull
                private final PointF contentAnchor;

                @NotNull
                private final PinSize size;

                public Options(@NotNull PinSize size, @NotNull PointF contentAnchor) {
                    Intrinsics.checkNotNullParameter(size, "size");
                    Intrinsics.checkNotNullParameter(contentAnchor, "contentAnchor");
                    this.size = size;
                    this.contentAnchor = contentAnchor;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Options)) {
                        return false;
                    }
                    Options options = (Options) other;
                    return Intrinsics.d(this.size, options.size) && Intrinsics.d(this.contentAnchor, options.contentAnchor);
                }

                @NotNull
                public final PointF getContentAnchor() {
                    return this.contentAnchor;
                }

                @NotNull
                public final PinSize getSize() {
                    return this.size;
                }

                public int hashCode() {
                    return this.contentAnchor.hashCode() + (this.size.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return "Options(size=" + this.size + ", contentAnchor=" + this.contentAnchor + ")";
                }
            }

            public Icon(@NotNull String url, String str, @NotNull Options options) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(options, "options");
                this.url = url;
                this.animatedIconUrl = str;
                this.options = options;
            }

            public static /* synthetic */ Icon copy$default(Icon icon, String str, String str2, Options options, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = icon.url;
                }
                if ((i11 & 2) != 0) {
                    str2 = icon.animatedIconUrl;
                }
                if ((i11 & 4) != 0) {
                    options = icon.options;
                }
                return icon.copy(str, str2, options);
            }

            @NotNull
            public final Icon copy(@NotNull String url, String animatedIconUrl, @NotNull Options options) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(options, "options");
                return new Icon(url, animatedIconUrl, options);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) other;
                return Intrinsics.d(this.url, icon.url) && Intrinsics.d(this.animatedIconUrl, icon.animatedIconUrl) && Intrinsics.d(this.options, icon.options);
            }

            public final String getAnimatedIconUrl() {
                return this.animatedIconUrl;
            }

            @NotNull
            public final Options getOptions() {
                return this.options;
            }

            @NotNull
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                int hashCode = this.url.hashCode() * 31;
                String str = this.animatedIconUrl;
                return this.options.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            @NotNull
            public String toString() {
                String str = this.url;
                String str2 = this.animatedIconUrl;
                Options options = this.options;
                StringBuilder d11 = C3660k.d("Icon(url=", str, ", animatedIconUrl=", str2, ", options=");
                d11.append(options);
                d11.append(")");
                return d11.toString();
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$Pin$Modification;", "", "", "type", "animatedIconUrl", "Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/TooltipVO;", "tooltip", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/TooltipVO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getAnimatedIconUrl", "Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/TooltipVO;", "getTooltip", "()Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/TooltipVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Modification {
            private final String animatedIconUrl;
            private final t tokenizedEvent;
            private final TooltipVO tooltip;

            @NotNull
            private final String type;

            public Modification(@NotNull String type, String str, TooltipVO tooltipVO, t tVar) {
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
                this.animatedIconUrl = str;
                this.tooltip = tooltipVO;
                this.tokenizedEvent = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Modification)) {
                    return false;
                }
                Modification modification = (Modification) other;
                return Intrinsics.d(this.type, modification.type) && Intrinsics.d(this.animatedIconUrl, modification.animatedIconUrl) && Intrinsics.d(this.tooltip, modification.tooltip) && Intrinsics.d(this.tokenizedEvent, modification.tokenizedEvent);
            }

            public final String getAnimatedIconUrl() {
                return this.animatedIconUrl;
            }

            public final t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public final TooltipVO getTooltip() {
                return this.tooltip;
            }

            @NotNull
            public final String getType() {
                return this.type;
            }

            public int hashCode() {
                int hashCode = this.type.hashCode() * 31;
                String str = this.animatedIconUrl;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                TooltipVO tooltipVO = this.tooltip;
                int hashCode3 = (hashCode2 + (tooltipVO == null ? 0 : tooltipVO.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.type;
                String str2 = this.animatedIconUrl;
                TooltipVO tooltipVO = this.tooltip;
                t tVar = this.tokenizedEvent;
                StringBuilder d11 = C3660k.d("Modification(type=", str, ", animatedIconUrl=", str2, ", tooltip=");
                d11.append(tooltipVO);
                d11.append(", tokenizedEvent=");
                d11.append(tVar);
                d11.append(")");
                return d11.toString();
            }
        }

        public Pin(Coordinates coordinates, double d11, @NotNull Icon icon, boolean z11, Modification modification) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.coordinates = coordinates;
            this.direction = d11;
            this.icon = icon;
            this.isCourier = z11;
            this.currentModification = modification;
        }

        public static /* synthetic */ Pin copy$default(Pin pin, Coordinates coordinates, double d11, Icon icon, boolean z11, Modification modification, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                coordinates = pin.coordinates;
            }
            if ((i11 & 2) != 0) {
                d11 = pin.direction;
            }
            if ((i11 & 4) != 0) {
                icon = pin.icon;
            }
            if ((i11 & 8) != 0) {
                z11 = pin.isCourier;
            }
            if ((i11 & 16) != 0) {
                modification = pin.currentModification;
            }
            Modification modification2 = modification;
            Icon icon2 = icon;
            return pin.copy(coordinates, d11, icon2, z11, modification2);
        }

        @NotNull
        public final Pin copy(Coordinates coordinates, double direction, @NotNull Icon icon, boolean isCourier, Modification currentModification) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new Pin(coordinates, direction, icon, isCourier, currentModification);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) other;
            return Intrinsics.d(this.coordinates, pin.coordinates) && Double.compare(this.direction, pin.direction) == 0 && Intrinsics.d(this.icon, pin.icon) && this.isCourier == pin.isCourier && Intrinsics.d(this.currentModification, pin.currentModification);
        }

        public final Coordinates getCoordinates() {
            return this.coordinates;
        }

        public final Modification getCurrentModification() {
            return this.currentModification;
        }

        public final double getDirection() {
            return this.direction;
        }

        @NotNull
        public final Icon getIcon() {
            return this.icon;
        }

        public int hashCode() {
            Coordinates coordinates = this.coordinates;
            int a11 = C3532b.a((this.icon.hashCode() + g.a((coordinates == null ? 0 : coordinates.hashCode()) * 31, 31, this.direction)) * 31, 31, this.isCourier);
            Modification modification = this.currentModification;
            return a11 + (modification != null ? modification.hashCode() : 0);
        }

        /* renamed from: isCourier, reason: from getter */
        public final boolean getIsCourier() {
            return this.isCourier;
        }

        @NotNull
        public String toString() {
            return "Pin(coordinates=" + this.coordinates + ", direction=" + this.direction + ", icon=" + this.icon + ", isCourier=" + this.isCourier + ", currentModification=" + this.currentModification + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO$PinSize;", "", "", "width", "height", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getWidth", "getHeight", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PinSize {
        private final int height;
        private final int width;

        public PinSize(int i11, int i12) {
            this.width = i11;
            this.height = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PinSize)) {
                return false;
            }
            PinSize pinSize = (PinSize) other;
            return this.width == pinSize.width && this.height == pinSize.height;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return Integer.hashCode(this.height) + (Integer.hashCode(this.width) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("PinSize(width=", this.width, ", height=", ")", this.height);
        }
    }

    public GeotrackingMapV2VO(long j11, @NotNull Pin courierPin, @NotNull Pin destinationPin, @NotNull Pin darkStorePin, @NotNull PinSize largestPinSize, @NotNull String orderStatus, boolean z11, double d11, t tVar, t tVar2, t tVar3, @NotNull String webSocketUrl, @NotNull List<Pin.Modification> courierPinModifications) {
        Intrinsics.checkNotNullParameter(courierPin, "courierPin");
        Intrinsics.checkNotNullParameter(destinationPin, "destinationPin");
        Intrinsics.checkNotNullParameter(darkStorePin, "darkStorePin");
        Intrinsics.checkNotNullParameter(largestPinSize, "largestPinSize");
        Intrinsics.checkNotNullParameter(orderStatus, "orderStatus");
        Intrinsics.checkNotNullParameter(webSocketUrl, "webSocketUrl");
        Intrinsics.checkNotNullParameter(courierPinModifications, "courierPinModifications");
        this.id = j11;
        this.courierPin = courierPin;
        this.destinationPin = destinationPin;
        this.darkStorePin = darkStorePin;
        this.largestPinSize = largestPinSize;
        this.orderStatus = orderStatus;
        this.isReceived = z11;
        this.currentSheetRatio = d11;
        this.locationTrackingInfo = tVar;
        this.defaultSheetTrackingInfo = tVar2;
        this.expandedSheetTrackingInfo = tVar3;
        this.webSocketUrl = webSocketUrl;
        this.courierPinModifications = courierPinModifications;
    }

    @NotNull
    public final GeotrackingMapV2VO copy(long id2, @NotNull Pin courierPin, @NotNull Pin destinationPin, @NotNull Pin darkStorePin, @NotNull PinSize largestPinSize, @NotNull String orderStatus, boolean isReceived, double currentSheetRatio, t locationTrackingInfo, t defaultSheetTrackingInfo, t expandedSheetTrackingInfo, @NotNull String webSocketUrl, @NotNull List<Pin.Modification> courierPinModifications) {
        Intrinsics.checkNotNullParameter(courierPin, "courierPin");
        Intrinsics.checkNotNullParameter(destinationPin, "destinationPin");
        Intrinsics.checkNotNullParameter(darkStorePin, "darkStorePin");
        Intrinsics.checkNotNullParameter(largestPinSize, "largestPinSize");
        Intrinsics.checkNotNullParameter(orderStatus, "orderStatus");
        Intrinsics.checkNotNullParameter(webSocketUrl, "webSocketUrl");
        Intrinsics.checkNotNullParameter(courierPinModifications, "courierPinModifications");
        return new GeotrackingMapV2VO(id2, courierPin, destinationPin, darkStorePin, largestPinSize, orderStatus, isReceived, currentSheetRatio, locationTrackingInfo, defaultSheetTrackingInfo, expandedSheetTrackingInfo, webSocketUrl, courierPinModifications);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeotrackingMapV2VO)) {
            return false;
        }
        GeotrackingMapV2VO geotrackingMapV2VO = (GeotrackingMapV2VO) other;
        return this.id == geotrackingMapV2VO.id && Intrinsics.d(this.courierPin, geotrackingMapV2VO.courierPin) && Intrinsics.d(this.destinationPin, geotrackingMapV2VO.destinationPin) && Intrinsics.d(this.darkStorePin, geotrackingMapV2VO.darkStorePin) && Intrinsics.d(this.largestPinSize, geotrackingMapV2VO.largestPinSize) && Intrinsics.d(this.orderStatus, geotrackingMapV2VO.orderStatus) && this.isReceived == geotrackingMapV2VO.isReceived && Double.compare(this.currentSheetRatio, geotrackingMapV2VO.currentSheetRatio) == 0 && Intrinsics.d(this.locationTrackingInfo, geotrackingMapV2VO.locationTrackingInfo) && Intrinsics.d(this.defaultSheetTrackingInfo, geotrackingMapV2VO.defaultSheetTrackingInfo) && Intrinsics.d(this.expandedSheetTrackingInfo, geotrackingMapV2VO.expandedSheetTrackingInfo) && Intrinsics.d(this.webSocketUrl, geotrackingMapV2VO.webSocketUrl) && Intrinsics.d(this.courierPinModifications, geotrackingMapV2VO.courierPinModifications);
    }

    @NotNull
    public final Pin getCourierPin() {
        return this.courierPin;
    }

    @NotNull
    public final List<Pin.Modification> getCourierPinModifications() {
        return this.courierPinModifications;
    }

    public final double getCurrentSheetRatio() {
        return this.currentSheetRatio;
    }

    @NotNull
    public final Pin getDarkStorePin() {
        return this.darkStorePin;
    }

    public final t getDefaultSheetTrackingInfo() {
        return this.defaultSheetTrackingInfo;
    }

    @NotNull
    public final Pin getDestinationPin() {
        return this.destinationPin;
    }

    public final t getExpandedSheetTrackingInfo() {
        return this.expandedSheetTrackingInfo;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final t getLocationTrackingInfo() {
        return this.locationTrackingInfo;
    }

    @NotNull
    public final String getOrderStatus() {
        return this.orderStatus;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    @NotNull
    public final String getWebSocketUrl() {
        return this.webSocketUrl;
    }

    public int hashCode() {
        int a11 = g.a(C3532b.a(G.g.a((this.largestPinSize.hashCode() + ((this.darkStorePin.hashCode() + ((this.destinationPin.hashCode() + ((this.courierPin.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.orderStatus), 31, this.isReceived), 31, this.currentSheetRatio);
        t tVar = this.locationTrackingInfo;
        int hashCode = (a11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.defaultSheetTrackingInfo;
        int hashCode2 = (hashCode + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
        t tVar3 = this.expandedSheetTrackingInfo;
        return this.courierPinModifications.hashCode() + G.g.a((hashCode2 + (tVar3 != null ? tVar3.hashCode() : 0)) * 31, 31, this.webSocketUrl);
    }

    /* renamed from: isInitial, reason: from getter */
    public final boolean getIsInitial() {
        return this.isInitial;
    }

    public final void setInitial(boolean z11) {
        this.isInitial = z11;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Pin pin = this.courierPin;
        Pin pin2 = this.destinationPin;
        Pin pin3 = this.darkStorePin;
        PinSize pinSize = this.largestPinSize;
        String str = this.orderStatus;
        boolean z11 = this.isReceived;
        double d11 = this.currentSheetRatio;
        t tVar = this.locationTrackingInfo;
        t tVar2 = this.defaultSheetTrackingInfo;
        t tVar3 = this.expandedSheetTrackingInfo;
        String str2 = this.webSocketUrl;
        List<Pin.Modification> list = this.courierPinModifications;
        StringBuilder sb2 = new StringBuilder("GeotrackingMapV2VO(id=");
        sb2.append(j11);
        sb2.append(", courierPin=");
        sb2.append(pin);
        sb2.append(", destinationPin=");
        sb2.append(pin2);
        sb2.append(", darkStorePin=");
        sb2.append(pin3);
        sb2.append(", largestPinSize=");
        sb2.append(pinSize);
        sb2.append(", orderStatus=");
        sb2.append(str);
        sb2.append(", isReceived=");
        sb2.append(z11);
        sb2.append(", currentSheetRatio=");
        sb2.append(d11);
        sb2.append(", locationTrackingInfo=");
        sb2.append(tVar);
        p.d(sb2, ", defaultSheetTrackingInfo=", tVar2, ", expandedSheetTrackingInfo=", tVar3);
        a.g(", webSocketUrl=", str2, ", courierPinModifications=", sb2, list);
        sb2.append(")");
        return sb2.toString();
    }
}
