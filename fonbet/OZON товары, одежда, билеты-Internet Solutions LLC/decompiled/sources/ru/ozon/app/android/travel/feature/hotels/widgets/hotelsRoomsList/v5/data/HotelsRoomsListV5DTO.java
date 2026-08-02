package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.data;

import B90.C2616s;
import Fm.C3051a;
import G.g;
import H00.a;
import H3.c;
import Ns.b;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.app.android.travel.molecules.dto.counterInput.v2.CounterInputV2DTO;
import ru.ozon.app.android.travel.molecules.dto.starsBadge.v1.StarsBadgeDTO;
import ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0004()*+BK\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003JU\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\rHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO;", "Lru/ozon/app/android/travel/utils/listtracking/TrackingInfoHolder;", "rooms", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO$Room;", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "expandButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "controlSettings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/util/Map;)V", "getRooms", "()Ljava/util/List;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getExpandButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getControlSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Room", "Tariffs", "Tariff", "Service", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsRoomsListV5DTO implements TrackingInfoHolder {
    public static final int $stable = 8;
    private final CommonControlSettings controlSettings;
    private final ButtonV3DTO expandButton;
    private final NotificationDTO notification;

    @NotNull
    private final List<Room> rooms;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO$Service;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "infoButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "saleBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getInfoButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getSaleBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Service {
        public static final int $stable = IconButtonV3DTO.$stable | IconDTO.$stable;

        @NotNull
        private final IconDTO icon;
        private final IconButtonV3DTO infoButton;
        private final BadgeDTO saleBadge;

        @NotNull
        private final TextDTO text;

        public Service(@NotNull IconDTO icon, @NotNull TextDTO text, IconButtonV3DTO iconButtonV3DTO, BadgeDTO badgeDTO) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(text, "text");
            this.icon = icon;
            this.text = text;
            this.infoButton = iconButtonV3DTO;
            this.saleBadge = badgeDTO;
        }

        public static /* synthetic */ Service copy$default(Service service, IconDTO iconDTO, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, BadgeDTO badgeDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconDTO = service.icon;
            }
            if ((i11 & 2) != 0) {
                textDTO = service.text;
            }
            if ((i11 & 4) != 0) {
                iconButtonV3DTO = service.infoButton;
            }
            if ((i11 & 8) != 0) {
                badgeDTO = service.saleBadge;
            }
            return service.copy(iconDTO, textDTO, iconButtonV3DTO, badgeDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component3, reason: from getter */
        public final IconButtonV3DTO getInfoButton() {
            return this.infoButton;
        }

        /* renamed from: component4, reason: from getter */
        public final BadgeDTO getSaleBadge() {
            return this.saleBadge;
        }

        @NotNull
        public final Service copy(@NotNull IconDTO icon, @NotNull TextDTO text, IconButtonV3DTO infoButton, BadgeDTO saleBadge) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(text, "text");
            return new Service(icon, text, infoButton, saleBadge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Service)) {
                return false;
            }
            Service service = (Service) other;
            return Intrinsics.d(this.icon, service.icon) && Intrinsics.d(this.text, service.text) && Intrinsics.d(this.infoButton, service.infoButton) && Intrinsics.d(this.saleBadge, service.saleBadge);
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        public final IconButtonV3DTO getInfoButton() {
            return this.infoButton;
        }

        public final BadgeDTO getSaleBadge() {
            return this.saleBadge;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            int a11 = b.a(this.text, this.icon.hashCode() * 31, 31);
            IconButtonV3DTO iconButtonV3DTO = this.infoButton;
            int hashCode = (a11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
            BadgeDTO badgeDTO = this.saleBadge;
            return hashCode + (badgeDTO != null ? badgeDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.icon;
            TextDTO textDTO = this.text;
            IconButtonV3DTO iconButtonV3DTO = this.infoButton;
            BadgeDTO badgeDTO = this.saleBadge;
            StringBuilder i11 = Bi.b.i("Service(icon=", ", text=", ", infoButton=", iconDTO, textDTO);
            i11.append(iconButtonV3DTO);
            i11.append(", saleBadge=");
            i11.append(badgeDTO);
            i11.append(")");
            return i11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO$Tariffs;", "", "tariffs", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO$Tariff;", "<init>", "(Ljava/util/List;)V", "getTariffs", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Tariffs {
        public static final int $stable = 8;

        @NotNull
        private final List<Tariff> tariffs;

        public Tariffs() {
            this(null, 1, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Tariffs copy$default(Tariffs tariffs, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = tariffs.tariffs;
            }
            return tariffs.copy(list);
        }

        @NotNull
        public final List<Tariff> component1() {
            return this.tariffs;
        }

        @NotNull
        public final Tariffs copy(@NotNull List<Tariff> tariffs) {
            Intrinsics.checkNotNullParameter(tariffs, "tariffs");
            return new Tariffs(tariffs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Tariffs) && Intrinsics.d(this.tariffs, ((Tariffs) other).tariffs);
        }

        @NotNull
        public final List<Tariff> getTariffs() {
            return this.tariffs;
        }

        public int hashCode() {
            return this.tariffs.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("Tariffs(tariffs=", ")", this.tariffs);
        }

        public Tariffs(@NotNull List<Tariff> tariffs) {
            Intrinsics.checkNotNullParameter(tariffs, "tariffs");
            this.tariffs = tariffs;
        }

        public Tariffs(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? K.f71697a : list);
        }
    }

    public HotelsRoomsListV5DTO(@NotNull List<Room> rooms, NotificationDTO notificationDTO, ButtonV3DTO buttonV3DTO, CommonControlSettings commonControlSettings, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(rooms, "rooms");
        this.rooms = rooms;
        this.notification = notificationDTO;
        this.expandButton = buttonV3DTO;
        this.controlSettings = commonControlSettings;
        this.trackingInfo = map;
    }

    public static /* synthetic */ HotelsRoomsListV5DTO copy$default(HotelsRoomsListV5DTO hotelsRoomsListV5DTO, List list, NotificationDTO notificationDTO, ButtonV3DTO buttonV3DTO, CommonControlSettings commonControlSettings, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = hotelsRoomsListV5DTO.rooms;
        }
        if ((i11 & 2) != 0) {
            notificationDTO = hotelsRoomsListV5DTO.notification;
        }
        if ((i11 & 4) != 0) {
            buttonV3DTO = hotelsRoomsListV5DTO.expandButton;
        }
        if ((i11 & 8) != 0) {
            commonControlSettings = hotelsRoomsListV5DTO.controlSettings;
        }
        if ((i11 & 16) != 0) {
            map = hotelsRoomsListV5DTO.trackingInfo;
        }
        Map map2 = map;
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        return hotelsRoomsListV5DTO.copy(list, notificationDTO, buttonV3DTO2, commonControlSettings, map2);
    }

    @NotNull
    public final List<Room> component1() {
        return this.rooms;
    }

    /* renamed from: component2, reason: from getter */
    public final NotificationDTO getNotification() {
        return this.notification;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonV3DTO getExpandButton() {
        return this.expandButton;
    }

    /* renamed from: component4, reason: from getter */
    public final CommonControlSettings getControlSettings() {
        return this.controlSettings;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final HotelsRoomsListV5DTO copy(@NotNull List<Room> rooms, NotificationDTO notification, ButtonV3DTO expandButton, CommonControlSettings controlSettings, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(rooms, "rooms");
        return new HotelsRoomsListV5DTO(rooms, notification, expandButton, controlSettings, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsRoomsListV5DTO)) {
            return false;
        }
        HotelsRoomsListV5DTO hotelsRoomsListV5DTO = (HotelsRoomsListV5DTO) other;
        return Intrinsics.d(this.rooms, hotelsRoomsListV5DTO.rooms) && Intrinsics.d(this.notification, hotelsRoomsListV5DTO.notification) && Intrinsics.d(this.expandButton, hotelsRoomsListV5DTO.expandButton) && Intrinsics.d(this.controlSettings, hotelsRoomsListV5DTO.controlSettings) && Intrinsics.d(this.trackingInfo, hotelsRoomsListV5DTO.trackingInfo);
    }

    public final CommonControlSettings getControlSettings() {
        return this.controlSettings;
    }

    public final ButtonV3DTO getExpandButton() {
        return this.expandButton;
    }

    public final NotificationDTO getNotification() {
        return this.notification;
    }

    @NotNull
    public final List<Room> getRooms() {
        return this.rooms;
    }

    @Override // ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.rooms.hashCode() * 31;
        NotificationDTO notificationDTO = this.notification;
        int hashCode2 = (hashCode + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.expandButton;
        int hashCode3 = (hashCode2 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.controlSettings;
        int hashCode4 = (hashCode3 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Room> list = this.rooms;
        NotificationDTO notificationDTO = this.notification;
        ButtonV3DTO buttonV3DTO = this.expandButton;
        CommonControlSettings commonControlSettings = this.controlSettings;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("HotelsRoomsListV5DTO(rooms=");
        sb2.append(list);
        sb2.append(", notification=");
        sb2.append(notificationDTO);
        sb2.append(", expandButton=");
        sb2.append(buttonV3DTO);
        sb2.append(", controlSettings=");
        sb2.append(commonControlSettings);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    public HotelsRoomsListV5DTO(List list, NotificationDTO notificationDTO, ButtonV3DTO buttonV3DTO, CommonControlSettings commonControlSettings, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, notificationDTO, buttonV3DTO, commonControlSettings, map);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\t\u0010/\u001a\u00020\u0001HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u008d\u0001\u00103\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u000fHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006:"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO$Tariff;", "", ResultDTO.CONTENT_TYPE_SERVICES, "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO$Service;", "specialTariffBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "serviceBadge", "milesBadge", "starsBadge", "Lru/ozon/app/android/travel/molecules/dto/starsBadge/v1/StarsBadgeDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "actionButton", "borderColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "roomsAvailable", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/travel/molecules/dto/starsBadge/v1/StarsBadgeDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getServices", "()Ljava/util/List;", "getSpecialTariffBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getServiceBadge", "getMilesBadge", "getStarsBadge", "()Lru/ozon/app/android/travel/molecules/dto/starsBadge/v1/StarsBadgeDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getActionButton", "()Ljava/lang/Object;", "getBorderColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "getRoomsAvailable", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Tariff {
        public static final int $stable = 8;

        @NotNull
        private final Object actionButton;
        private final String borderColor;
        private final BadgeDTO milesBadge;

        @NotNull
        private final PriceDTO price;
        private final TextDTO roomsAvailable;
        private final BadgeDTO serviceBadge;

        @NotNull
        private final List<Service> services;
        private final BadgeDTO specialTariffBadge;
        private final StarsBadgeDTO starsBadge;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Tariff(@NotNull List<Service> services, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, BadgeDTO badgeDTO3, StarsBadgeDTO starsBadgeDTO, @NotNull PriceDTO price, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "roomCounter", type = CounterInputV2DTO.class)}) @NotNull @ProtoOneOf(label = "type") Object actionButton, String str, Map<String, TokenizedTrackingInfo> map, TextDTO textDTO) {
            Intrinsics.checkNotNullParameter(services, "services");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(actionButton, "actionButton");
            this.services = services;
            this.specialTariffBadge = badgeDTO;
            this.serviceBadge = badgeDTO2;
            this.milesBadge = badgeDTO3;
            this.starsBadge = starsBadgeDTO;
            this.price = price;
            this.actionButton = actionButton;
            this.borderColor = str;
            this.trackingInfo = map;
            this.roomsAvailable = textDTO;
        }

        public static /* synthetic */ Tariff copy$default(Tariff tariff, List list, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, BadgeDTO badgeDTO3, StarsBadgeDTO starsBadgeDTO, PriceDTO priceDTO, Object obj, String str, Map map, TextDTO textDTO, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                list = tariff.services;
            }
            if ((i11 & 2) != 0) {
                badgeDTO = tariff.specialTariffBadge;
            }
            if ((i11 & 4) != 0) {
                badgeDTO2 = tariff.serviceBadge;
            }
            if ((i11 & 8) != 0) {
                badgeDTO3 = tariff.milesBadge;
            }
            if ((i11 & 16) != 0) {
                starsBadgeDTO = tariff.starsBadge;
            }
            if ((i11 & 32) != 0) {
                priceDTO = tariff.price;
            }
            if ((i11 & 64) != 0) {
                obj = tariff.actionButton;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str = tariff.borderColor;
            }
            if ((i11 & 256) != 0) {
                map = tariff.trackingInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                textDTO = tariff.roomsAvailable;
            }
            Map map2 = map;
            TextDTO textDTO2 = textDTO;
            Object obj3 = obj;
            String str2 = str;
            StarsBadgeDTO starsBadgeDTO2 = starsBadgeDTO;
            PriceDTO priceDTO2 = priceDTO;
            return tariff.copy(list, badgeDTO, badgeDTO2, badgeDTO3, starsBadgeDTO2, priceDTO2, obj3, str2, map2, textDTO2);
        }

        @NotNull
        public final List<Service> component1() {
            return this.services;
        }

        /* renamed from: component10, reason: from getter */
        public final TextDTO getRoomsAvailable() {
            return this.roomsAvailable;
        }

        /* renamed from: component2, reason: from getter */
        public final BadgeDTO getSpecialTariffBadge() {
            return this.specialTariffBadge;
        }

        /* renamed from: component3, reason: from getter */
        public final BadgeDTO getServiceBadge() {
            return this.serviceBadge;
        }

        /* renamed from: component4, reason: from getter */
        public final BadgeDTO getMilesBadge() {
            return this.milesBadge;
        }

        /* renamed from: component5, reason: from getter */
        public final StarsBadgeDTO getStarsBadge() {
            return this.starsBadge;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final Object getActionButton() {
            return this.actionButton;
        }

        /* renamed from: component8, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.trackingInfo;
        }

        @NotNull
        public final Tariff copy(@NotNull List<Service> services, BadgeDTO specialTariffBadge, BadgeDTO serviceBadge, BadgeDTO milesBadge, StarsBadgeDTO starsBadge, @NotNull PriceDTO price, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "roomCounter", type = CounterInputV2DTO.class)}) @NotNull @ProtoOneOf(label = "type") Object actionButton, String borderColor, Map<String, TokenizedTrackingInfo> trackingInfo, TextDTO roomsAvailable) {
            Intrinsics.checkNotNullParameter(services, "services");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(actionButton, "actionButton");
            return new Tariff(services, specialTariffBadge, serviceBadge, milesBadge, starsBadge, price, actionButton, borderColor, trackingInfo, roomsAvailable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tariff)) {
                return false;
            }
            Tariff tariff = (Tariff) other;
            return Intrinsics.d(this.services, tariff.services) && Intrinsics.d(this.specialTariffBadge, tariff.specialTariffBadge) && Intrinsics.d(this.serviceBadge, tariff.serviceBadge) && Intrinsics.d(this.milesBadge, tariff.milesBadge) && Intrinsics.d(this.starsBadge, tariff.starsBadge) && Intrinsics.d(this.price, tariff.price) && Intrinsics.d(this.actionButton, tariff.actionButton) && Intrinsics.d(this.borderColor, tariff.borderColor) && Intrinsics.d(this.trackingInfo, tariff.trackingInfo) && Intrinsics.d(this.roomsAvailable, tariff.roomsAvailable);
        }

        @NotNull
        public final Object getActionButton() {
            return this.actionButton;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        public final BadgeDTO getMilesBadge() {
            return this.milesBadge;
        }

        @NotNull
        public final PriceDTO getPrice() {
            return this.price;
        }

        public final TextDTO getRoomsAvailable() {
            return this.roomsAvailable;
        }

        public final BadgeDTO getServiceBadge() {
            return this.serviceBadge;
        }

        @NotNull
        public final List<Service> getServices() {
            return this.services;
        }

        public final BadgeDTO getSpecialTariffBadge() {
            return this.specialTariffBadge;
        }

        public final StarsBadgeDTO getStarsBadge() {
            return this.starsBadge;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.services.hashCode() * 31;
            BadgeDTO badgeDTO = this.specialTariffBadge;
            int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            BadgeDTO badgeDTO2 = this.serviceBadge;
            int hashCode3 = (hashCode2 + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31;
            BadgeDTO badgeDTO3 = this.milesBadge;
            int hashCode4 = (hashCode3 + (badgeDTO3 == null ? 0 : badgeDTO3.hashCode())) * 31;
            StarsBadgeDTO starsBadgeDTO = this.starsBadge;
            int c11 = a.c(C3051a.b(this.price, (hashCode4 + (starsBadgeDTO == null ? 0 : starsBadgeDTO.hashCode())) * 31, 31), 31, this.actionButton);
            String str = this.borderColor;
            int hashCode5 = (c11 + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
            TextDTO textDTO = this.roomsAvailable;
            return hashCode6 + (textDTO != null ? textDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Tariff(services=" + this.services + ", specialTariffBadge=" + this.specialTariffBadge + ", serviceBadge=" + this.serviceBadge + ", milesBadge=" + this.milesBadge + ", starsBadge=" + this.starsBadge + ", price=" + this.price + ", actionButton=" + this.actionButton + ", borderColor=" + this.borderColor + ", trackingInfo=" + this.trackingInfo + ", roomsAvailable=" + this.roomsAvailable + ")";
        }

        public Tariff(List list, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, BadgeDTO badgeDTO3, StarsBadgeDTO starsBadgeDTO, PriceDTO priceDTO, Object obj, String str, Map map, TextDTO textDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? K.f71697a : list, badgeDTO, badgeDTO2, badgeDTO3, starsBadgeDTO, priceDTO, obj, str, map, textDTO);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u0017\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J¬\u0001\u00105\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\u00142\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010(\u001a\u0004\b\u0013\u0010'R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001e¨\u0006<"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO$Room;", "", "images", "", "", "tags", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "detailBadge", "accommodation", "roomBadges", "galleryTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "tariffs", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO$Tariffs;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "isLoading", "", "roomsLeftBadge", "<init>", "(Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO$Tariffs;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getImages", "()Ljava/util/List;", "getTags", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDetailBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAccommodation", "getRoomBadges", "getGalleryTrackingInfo", "()Ljava/util/Map;", "getTariffs", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO$Tariffs;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRoomsLeftBadge", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO$Tariffs;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO$Room;", "equals", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Room {
        public static final int $stable = 8;

        @NotNull
        private final List<TextDTO> accommodation;
        private final ButtonV3DTO button;
        private final BadgeDTO detailBadge;
        private final Map<String, TokenizedTrackingInfo> galleryTrackingInfo;

        @NotNull
        private final List<String> images;
        private final Boolean isLoading;

        @NotNull
        private final TextDTO name;

        @NotNull
        private final List<BadgeDTO> roomBadges;
        private final BadgeDTO roomsLeftBadge;

        @NotNull
        private final List<BadgeDTO> tags;
        private final Tariffs tariffs;

        public Room(@NotNull List<String> images, @NotNull List<BadgeDTO> tags, @NotNull TextDTO name, BadgeDTO badgeDTO, @NotNull List<TextDTO> accommodation, @NotNull List<BadgeDTO> roomBadges, Map<String, TokenizedTrackingInfo> map, Tariffs tariffs, ButtonV3DTO buttonV3DTO, Boolean bool, BadgeDTO badgeDTO2) {
            Intrinsics.checkNotNullParameter(images, "images");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(accommodation, "accommodation");
            Intrinsics.checkNotNullParameter(roomBadges, "roomBadges");
            this.images = images;
            this.tags = tags;
            this.name = name;
            this.detailBadge = badgeDTO;
            this.accommodation = accommodation;
            this.roomBadges = roomBadges;
            this.galleryTrackingInfo = map;
            this.tariffs = tariffs;
            this.button = buttonV3DTO;
            this.isLoading = bool;
            this.roomsLeftBadge = badgeDTO2;
        }

        public static /* synthetic */ Room copy$default(Room room, List list, List list2, TextDTO textDTO, BadgeDTO badgeDTO, List list3, List list4, Map map, Tariffs tariffs, ButtonV3DTO buttonV3DTO, Boolean bool, BadgeDTO badgeDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = room.images;
            }
            if ((i11 & 2) != 0) {
                list2 = room.tags;
            }
            if ((i11 & 4) != 0) {
                textDTO = room.name;
            }
            if ((i11 & 8) != 0) {
                badgeDTO = room.detailBadge;
            }
            if ((i11 & 16) != 0) {
                list3 = room.accommodation;
            }
            if ((i11 & 32) != 0) {
                list4 = room.roomBadges;
            }
            if ((i11 & 64) != 0) {
                map = room.galleryTrackingInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                tariffs = room.tariffs;
            }
            if ((i11 & 256) != 0) {
                buttonV3DTO = room.button;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                bool = room.isLoading;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                badgeDTO2 = room.roomsLeftBadge;
            }
            Boolean bool2 = bool;
            BadgeDTO badgeDTO3 = badgeDTO2;
            Tariffs tariffs2 = tariffs;
            ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
            List list5 = list4;
            Map map2 = map;
            List list6 = list3;
            TextDTO textDTO2 = textDTO;
            return room.copy(list, list2, textDTO2, badgeDTO, list6, list5, map2, tariffs2, buttonV3DTO2, bool2, badgeDTO3);
        }

        @NotNull
        public final List<String> component1() {
            return this.images;
        }

        /* renamed from: component10, reason: from getter */
        public final Boolean getIsLoading() {
            return this.isLoading;
        }

        /* renamed from: component11, reason: from getter */
        public final BadgeDTO getRoomsLeftBadge() {
            return this.roomsLeftBadge;
        }

        @NotNull
        public final List<BadgeDTO> component2() {
            return this.tags;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getName() {
            return this.name;
        }

        /* renamed from: component4, reason: from getter */
        public final BadgeDTO getDetailBadge() {
            return this.detailBadge;
        }

        @NotNull
        public final List<TextDTO> component5() {
            return this.accommodation;
        }

        @NotNull
        public final List<BadgeDTO> component6() {
            return this.roomBadges;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.galleryTrackingInfo;
        }

        /* renamed from: component8, reason: from getter */
        public final Tariffs getTariffs() {
            return this.tariffs;
        }

        /* renamed from: component9, reason: from getter */
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        @NotNull
        public final Room copy(@NotNull List<String> images, @NotNull List<BadgeDTO> tags, @NotNull TextDTO name, BadgeDTO detailBadge, @NotNull List<TextDTO> accommodation, @NotNull List<BadgeDTO> roomBadges, Map<String, TokenizedTrackingInfo> galleryTrackingInfo, Tariffs tariffs, ButtonV3DTO button, Boolean isLoading, BadgeDTO roomsLeftBadge) {
            Intrinsics.checkNotNullParameter(images, "images");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(accommodation, "accommodation");
            Intrinsics.checkNotNullParameter(roomBadges, "roomBadges");
            return new Room(images, tags, name, detailBadge, accommodation, roomBadges, galleryTrackingInfo, tariffs, button, isLoading, roomsLeftBadge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Room)) {
                return false;
            }
            Room room = (Room) other;
            return Intrinsics.d(this.images, room.images) && Intrinsics.d(this.tags, room.tags) && Intrinsics.d(this.name, room.name) && Intrinsics.d(this.detailBadge, room.detailBadge) && Intrinsics.d(this.accommodation, room.accommodation) && Intrinsics.d(this.roomBadges, room.roomBadges) && Intrinsics.d(this.galleryTrackingInfo, room.galleryTrackingInfo) && Intrinsics.d(this.tariffs, room.tariffs) && Intrinsics.d(this.button, room.button) && Intrinsics.d(this.isLoading, room.isLoading) && Intrinsics.d(this.roomsLeftBadge, room.roomsLeftBadge);
        }

        @NotNull
        public final List<TextDTO> getAccommodation() {
            return this.accommodation;
        }

        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public final BadgeDTO getDetailBadge() {
            return this.detailBadge;
        }

        public final Map<String, TokenizedTrackingInfo> getGalleryTrackingInfo() {
            return this.galleryTrackingInfo;
        }

        @NotNull
        public final List<String> getImages() {
            return this.images;
        }

        @NotNull
        public final TextDTO getName() {
            return this.name;
        }

        @NotNull
        public final List<BadgeDTO> getRoomBadges() {
            return this.roomBadges;
        }

        public final BadgeDTO getRoomsLeftBadge() {
            return this.roomsLeftBadge;
        }

        @NotNull
        public final List<BadgeDTO> getTags() {
            return this.tags;
        }

        public final Tariffs getTariffs() {
            return this.tariffs;
        }

        public int hashCode() {
            int a11 = b.a(this.name, g.b(this.images.hashCode() * 31, 31, this.tags), 31);
            BadgeDTO badgeDTO = this.detailBadge;
            int b11 = g.b(g.b((a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31, this.accommodation), 31, this.roomBadges);
            Map<String, TokenizedTrackingInfo> map = this.galleryTrackingInfo;
            int hashCode = (b11 + (map == null ? 0 : map.hashCode())) * 31;
            Tariffs tariffs = this.tariffs;
            int hashCode2 = (hashCode + (tariffs == null ? 0 : tariffs.hashCode())) * 31;
            ButtonV3DTO buttonV3DTO = this.button;
            int hashCode3 = (hashCode2 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
            Boolean bool = this.isLoading;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            BadgeDTO badgeDTO2 = this.roomsLeftBadge;
            return hashCode4 + (badgeDTO2 != null ? badgeDTO2.hashCode() : 0);
        }

        public final Boolean isLoading() {
            return this.isLoading;
        }

        @NotNull
        public String toString() {
            List<String> list = this.images;
            List<BadgeDTO> list2 = this.tags;
            TextDTO textDTO = this.name;
            BadgeDTO badgeDTO = this.detailBadge;
            List<TextDTO> list3 = this.accommodation;
            List<BadgeDTO> list4 = this.roomBadges;
            Map<String, TokenizedTrackingInfo> map = this.galleryTrackingInfo;
            Tariffs tariffs = this.tariffs;
            ButtonV3DTO buttonV3DTO = this.button;
            Boolean bool = this.isLoading;
            BadgeDTO badgeDTO2 = this.roomsLeftBadge;
            StringBuilder d11 = Fj.c.d("Room(images=", list, ", tags=", ", name=", list2);
            d11.append(textDTO);
            d11.append(", detailBadge=");
            d11.append(badgeDTO);
            d11.append(", accommodation=");
            C2616s.g(", roomBadges=", ", galleryTrackingInfo=", d11, list3, list4);
            d11.append(map);
            d11.append(", tariffs=");
            d11.append(tariffs);
            d11.append(", button=");
            d11.append(buttonV3DTO);
            d11.append(", isLoading=");
            d11.append(bool);
            d11.append(", roomsLeftBadge=");
            return AZ.c.b(d11, badgeDTO2, ")");
        }

        public Room(List list, List list2, TextDTO textDTO, BadgeDTO badgeDTO, List list3, List list4, Map map, Tariffs tariffs, ButtonV3DTO buttonV3DTO, Boolean bool, BadgeDTO badgeDTO2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? K.f71697a : list, (i11 & 2) != 0 ? K.f71697a : list2, textDTO, badgeDTO, (i11 & 16) != 0 ? K.f71697a : list3, (i11 & 32) != 0 ? K.f71697a : list4, map, tariffs, buttonV3DTO, bool, badgeDTO2);
        }
    }
}
