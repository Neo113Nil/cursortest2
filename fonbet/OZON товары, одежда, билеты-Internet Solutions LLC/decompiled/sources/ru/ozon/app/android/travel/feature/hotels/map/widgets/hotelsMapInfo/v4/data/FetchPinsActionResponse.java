package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data;

import B0.C2454a;
import Fj.c;
import G.g;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.DistrictsDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003JK\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\nHÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/FetchPinsActionResponse;", "", "pins", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/PinDTO;", "polygons", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$Polygon;", "nextAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nextFetchInterval", "", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;ILru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getPins$annotations", "()V", "getPins", "()Ljava/util/List;", "getPolygons", "getNextAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getNextFetchInterval", "()I", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FetchPinsActionResponse {
    private final AtomActionDTO nextAction;
    private final int nextFetchInterval;
    private final NotificationDTO notification;

    @NotNull
    private final List<PinDTO> pins;

    @NotNull
    private final List<DistrictsDTO.Polygon> polygons;

    public FetchPinsActionResponse(@NotNull List<PinDTO> pins, @NotNull List<DistrictsDTO.Polygon> polygons, AtomActionDTO atomActionDTO, int i11, NotificationDTO notificationDTO) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        Intrinsics.checkNotNullParameter(polygons, "polygons");
        this.pins = pins;
        this.polygons = polygons;
        this.nextAction = atomActionDTO;
        this.nextFetchInterval = i11;
        this.notification = notificationDTO;
    }

    public static /* synthetic */ FetchPinsActionResponse copy$default(FetchPinsActionResponse fetchPinsActionResponse, List list, List list2, AtomActionDTO atomActionDTO, int i11, NotificationDTO notificationDTO, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = fetchPinsActionResponse.pins;
        }
        if ((i12 & 2) != 0) {
            list2 = fetchPinsActionResponse.polygons;
        }
        if ((i12 & 4) != 0) {
            atomActionDTO = fetchPinsActionResponse.nextAction;
        }
        if ((i12 & 8) != 0) {
            i11 = fetchPinsActionResponse.nextFetchInterval;
        }
        if ((i12 & 16) != 0) {
            notificationDTO = fetchPinsActionResponse.notification;
        }
        NotificationDTO notificationDTO2 = notificationDTO;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        return fetchPinsActionResponse.copy(list, list2, atomActionDTO2, i11, notificationDTO2);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getPins$annotations() {
    }

    @NotNull
    public final List<PinDTO> component1() {
        return this.pins;
    }

    @NotNull
    public final List<DistrictsDTO.Polygon> component2() {
        return this.polygons;
    }

    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getNextAction() {
        return this.nextAction;
    }

    /* renamed from: component4, reason: from getter */
    public final int getNextFetchInterval() {
        return this.nextFetchInterval;
    }

    /* renamed from: component5, reason: from getter */
    public final NotificationDTO getNotification() {
        return this.notification;
    }

    @NotNull
    public final FetchPinsActionResponse copy(@NotNull List<PinDTO> pins, @NotNull List<DistrictsDTO.Polygon> polygons, AtomActionDTO nextAction, int nextFetchInterval, NotificationDTO notification) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        Intrinsics.checkNotNullParameter(polygons, "polygons");
        return new FetchPinsActionResponse(pins, polygons, nextAction, nextFetchInterval, notification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchPinsActionResponse)) {
            return false;
        }
        FetchPinsActionResponse fetchPinsActionResponse = (FetchPinsActionResponse) other;
        return Intrinsics.d(this.pins, fetchPinsActionResponse.pins) && Intrinsics.d(this.polygons, fetchPinsActionResponse.polygons) && Intrinsics.d(this.nextAction, fetchPinsActionResponse.nextAction) && this.nextFetchInterval == fetchPinsActionResponse.nextFetchInterval && Intrinsics.d(this.notification, fetchPinsActionResponse.notification);
    }

    public final AtomActionDTO getNextAction() {
        return this.nextAction;
    }

    public final int getNextFetchInterval() {
        return this.nextFetchInterval;
    }

    public final NotificationDTO getNotification() {
        return this.notification;
    }

    @NotNull
    public final List<PinDTO> getPins() {
        return this.pins;
    }

    @NotNull
    public final List<DistrictsDTO.Polygon> getPolygons() {
        return this.polygons;
    }

    public int hashCode() {
        int b11 = g.b(this.pins.hashCode() * 31, 31, this.polygons);
        AtomActionDTO atomActionDTO = this.nextAction;
        int a11 = C2454a.a(this.nextFetchInterval, (b11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31);
        NotificationDTO notificationDTO = this.notification;
        return a11 + (notificationDTO != null ? notificationDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<PinDTO> list = this.pins;
        List<DistrictsDTO.Polygon> list2 = this.polygons;
        AtomActionDTO atomActionDTO = this.nextAction;
        int i11 = this.nextFetchInterval;
        NotificationDTO notificationDTO = this.notification;
        StringBuilder d11 = c.d("FetchPinsActionResponse(pins=", list, ", polygons=", ", nextAction=", list2);
        d11.append(atomActionDTO);
        d11.append(", nextFetchInterval=");
        d11.append(i11);
        d11.append(", notification=");
        d11.append(notificationDTO);
        d11.append(")");
        return d11.toString();
    }

    public FetchPinsActionResponse(List list, List list2, AtomActionDTO atomActionDTO, int i11, NotificationDTO notificationDTO, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? K.f71697a : list, (i12 & 2) != 0 ? K.f71697a : list2, atomActionDTO, (i12 & 8) != 0 ? 0 : i11, notificationDTO);
    }
}
