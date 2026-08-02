package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import D40.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.DistrictsVO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001BK\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/FetchPinsActionResponseVO;", "", "", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "pins", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$Polygon;", "polygons", "Lru/ozon/uni/atoms/af/AtomAction;", "nextAction", "", "nextFetchInterval", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "<init>", "(Ljava/util/Map;Ljava/util/Map;Lru/ozon/uni/atoms/af/AtomAction;JLru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getPins", "()Ljava/util/Map;", "getPolygons", "Lru/ozon/uni/atoms/af/AtomAction;", "getNextAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "J", "getNextFetchInterval", "()J", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FetchPinsActionResponseVO {
    private final AtomAction nextAction;
    private final long nextFetchInterval;
    private final NotificationDTO notification;

    @NotNull
    private final Map<String, HotelsMapInfoV4VO.Pin> pins;

    @NotNull
    private final Map<String, DistrictsVO.Polygon> polygons;

    public FetchPinsActionResponseVO(@NotNull Map<String, HotelsMapInfoV4VO.Pin> pins, @NotNull Map<String, DistrictsVO.Polygon> polygons, AtomAction atomAction, long j11, NotificationDTO notificationDTO) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        Intrinsics.checkNotNullParameter(polygons, "polygons");
        this.pins = pins;
        this.polygons = polygons;
        this.nextAction = atomAction;
        this.nextFetchInterval = j11;
        this.notification = notificationDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchPinsActionResponseVO)) {
            return false;
        }
        FetchPinsActionResponseVO fetchPinsActionResponseVO = (FetchPinsActionResponseVO) other;
        return Intrinsics.d(this.pins, fetchPinsActionResponseVO.pins) && Intrinsics.d(this.polygons, fetchPinsActionResponseVO.polygons) && Intrinsics.d(this.nextAction, fetchPinsActionResponseVO.nextAction) && this.nextFetchInterval == fetchPinsActionResponseVO.nextFetchInterval && Intrinsics.d(this.notification, fetchPinsActionResponseVO.notification);
    }

    public final AtomAction getNextAction() {
        return this.nextAction;
    }

    public final long getNextFetchInterval() {
        return this.nextFetchInterval;
    }

    public final NotificationDTO getNotification() {
        return this.notification;
    }

    @NotNull
    public final Map<String, HotelsMapInfoV4VO.Pin> getPins() {
        return this.pins;
    }

    @NotNull
    public final Map<String, DistrictsVO.Polygon> getPolygons() {
        return this.polygons;
    }

    public int hashCode() {
        int a11 = c.a(this.polygons, this.pins.hashCode() * 31, 31);
        AtomAction atomAction = this.nextAction;
        int a12 = Pk0.c.a((a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31, this.nextFetchInterval);
        NotificationDTO notificationDTO = this.notification;
        return a12 + (notificationDTO != null ? notificationDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FetchPinsActionResponseVO(pins=" + this.pins + ", polygons=" + this.polygons + ", nextAction=" + this.nextAction + ", nextFetchInterval=" + this.nextFetchInterval + ", notification=" + this.notification + ")";
    }
}
