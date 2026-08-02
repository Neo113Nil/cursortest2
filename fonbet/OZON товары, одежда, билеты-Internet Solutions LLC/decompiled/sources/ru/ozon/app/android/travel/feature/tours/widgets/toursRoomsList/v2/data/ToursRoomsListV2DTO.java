package ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.data;

import De.C2859b;
import Fm.C3051a;
import G.g;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002#$BA\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/data/ToursRoomsListV2DTO;", "Lru/ozon/app/android/travel/utils/listtracking/TrackingInfoHolder;", "rooms", "", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/data/ToursRoomsListV2DTO$Room;", "lazyRefreshAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "behaviorType", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/data/ToursRoomsListV2DTO$BehaviorType;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/data/ToursRoomsListV2DTO$BehaviorType;Ljava/util/Map;)V", "getRooms", "()Ljava/util/List;", "getLazyRefreshAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBehaviorType", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/data/ToursRoomsListV2DTO$BehaviorType;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Room", "BehaviorType", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ToursRoomsListV2DTO implements TrackingInfoHolder {
    public static final int $stable = 8;

    @NotNull
    private final BehaviorType behaviorType;
    private final AtomActionDTO lazyRefreshAction;

    @NotNull
    private final List<Room> rooms;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/data/ToursRoomsListV2DTO$BehaviorType;", "", "<init>", "(Ljava/lang/String;I)V", "NO_ACTION", "EMPTY_FETCH_STATE", "FETCH_STATE", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BehaviorType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ BehaviorType[] $VALUES;

        @i(name = "NO_ACTION")
        public static final BehaviorType NO_ACTION = new BehaviorType("NO_ACTION", 0);

        @i(name = "EMPTY_FETCH_STATE")
        public static final BehaviorType EMPTY_FETCH_STATE = new BehaviorType("EMPTY_FETCH_STATE", 1);

        @i(name = "FETCH_STATE")
        public static final BehaviorType FETCH_STATE = new BehaviorType("FETCH_STATE", 2);

        private static final /* synthetic */ BehaviorType[] $values() {
            return new BehaviorType[]{NO_ACTION, EMPTY_FETCH_STATE, FETCH_STATE};
        }

        static {
            BehaviorType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private BehaviorType(String str, int i11) {
        }

        public static BehaviorType valueOf(String str) {
            return (BehaviorType) Enum.valueOf(BehaviorType.class, str);
        }

        public static BehaviorType[] values() {
            return (BehaviorType[]) $VALUES.clone();
        }
    }

    public ToursRoomsListV2DTO(@NotNull List<Room> rooms, AtomActionDTO atomActionDTO, @NotNull BehaviorType behaviorType, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(rooms, "rooms");
        Intrinsics.checkNotNullParameter(behaviorType, "behaviorType");
        this.rooms = rooms;
        this.lazyRefreshAction = atomActionDTO;
        this.behaviorType = behaviorType;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ToursRoomsListV2DTO copy$default(ToursRoomsListV2DTO toursRoomsListV2DTO, List list, AtomActionDTO atomActionDTO, BehaviorType behaviorType, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = toursRoomsListV2DTO.rooms;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = toursRoomsListV2DTO.lazyRefreshAction;
        }
        if ((i11 & 4) != 0) {
            behaviorType = toursRoomsListV2DTO.behaviorType;
        }
        if ((i11 & 8) != 0) {
            map = toursRoomsListV2DTO.trackingInfo;
        }
        return toursRoomsListV2DTO.copy(list, atomActionDTO, behaviorType, map);
    }

    @NotNull
    public final List<Room> component1() {
        return this.rooms;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getLazyRefreshAction() {
        return this.lazyRefreshAction;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BehaviorType getBehaviorType() {
        return this.behaviorType;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final ToursRoomsListV2DTO copy(@NotNull List<Room> rooms, AtomActionDTO lazyRefreshAction, @NotNull BehaviorType behaviorType, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(rooms, "rooms");
        Intrinsics.checkNotNullParameter(behaviorType, "behaviorType");
        return new ToursRoomsListV2DTO(rooms, lazyRefreshAction, behaviorType, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursRoomsListV2DTO)) {
            return false;
        }
        ToursRoomsListV2DTO toursRoomsListV2DTO = (ToursRoomsListV2DTO) other;
        return Intrinsics.d(this.rooms, toursRoomsListV2DTO.rooms) && Intrinsics.d(this.lazyRefreshAction, toursRoomsListV2DTO.lazyRefreshAction) && this.behaviorType == toursRoomsListV2DTO.behaviorType && Intrinsics.d(this.trackingInfo, toursRoomsListV2DTO.trackingInfo);
    }

    @NotNull
    public final BehaviorType getBehaviorType() {
        return this.behaviorType;
    }

    public final AtomActionDTO getLazyRefreshAction() {
        return this.lazyRefreshAction;
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
        AtomActionDTO atomActionDTO = this.lazyRefreshAction;
        int hashCode2 = (this.behaviorType.hashCode() + ((hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ToursRoomsListV2DTO(rooms=" + this.rooms + ", lazyRefreshAction=" + this.lazyRefreshAction + ", behaviorType=" + this.behaviorType + ", trackingInfo=" + this.trackingInfo + ")";
    }

    public ToursRoomsListV2DTO(List list, AtomActionDTO atomActionDTO, BehaviorType behaviorType, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, atomActionDTO, (i11 & 4) != 0 ? BehaviorType.NO_ACTION : behaviorType, map);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u000fHÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003Ju\u0010+\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/data/ToursRoomsListV2DTO$Room;", "", "images", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "detailBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "details", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "priceDescription", "selectButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "getImages", "()Ljava/util/List;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDetailBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getDetails", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPriceDescription", "getSelectButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Room {
        public static final int $stable = 8;
        private final BadgeDTO detailBadge;

        @NotNull
        private final List<CellDTO> details;

        @NotNull
        private final List<String> images;

        @NotNull
        private final PriceDTO price;

        @NotNull
        private final TextDTO priceDescription;

        @NotNull
        private final ButtonV3DTO selectButton;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Room(@NotNull List<String> images, @NotNull TextDTO title, BadgeDTO badgeDTO, @NotNull List<CellDTO> details, @NotNull PriceDTO price, @NotNull TextDTO priceDescription, @NotNull ButtonV3DTO selectButton, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(images, "images");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
            Intrinsics.checkNotNullParameter(selectButton, "selectButton");
            this.images = images;
            this.title = title;
            this.detailBadge = badgeDTO;
            this.details = details;
            this.price = price;
            this.priceDescription = priceDescription;
            this.selectButton = selectButton;
            this.trackingInfo = map;
        }

        public static /* synthetic */ Room copy$default(Room room, List list, TextDTO textDTO, BadgeDTO badgeDTO, List list2, PriceDTO priceDTO, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = room.images;
            }
            if ((i11 & 2) != 0) {
                textDTO = room.title;
            }
            if ((i11 & 4) != 0) {
                badgeDTO = room.detailBadge;
            }
            if ((i11 & 8) != 0) {
                list2 = room.details;
            }
            if ((i11 & 16) != 0) {
                priceDTO = room.price;
            }
            if ((i11 & 32) != 0) {
                textDTO2 = room.priceDescription;
            }
            if ((i11 & 64) != 0) {
                buttonV3DTO = room.selectButton;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                map = room.trackingInfo;
            }
            ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
            Map map2 = map;
            PriceDTO priceDTO2 = priceDTO;
            TextDTO textDTO3 = textDTO2;
            return room.copy(list, textDTO, badgeDTO, list2, priceDTO2, textDTO3, buttonV3DTO2, map2);
        }

        @NotNull
        public final List<String> component1() {
            return this.images;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final BadgeDTO getDetailBadge() {
            return this.detailBadge;
        }

        @NotNull
        public final List<CellDTO> component4() {
            return this.details;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final TextDTO getPriceDescription() {
            return this.priceDescription;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final ButtonV3DTO getSelectButton() {
            return this.selectButton;
        }

        public final Map<String, TokenizedTrackingInfo> component8() {
            return this.trackingInfo;
        }

        @NotNull
        public final Room copy(@NotNull List<String> images, @NotNull TextDTO title, BadgeDTO detailBadge, @NotNull List<CellDTO> details, @NotNull PriceDTO price, @NotNull TextDTO priceDescription, @NotNull ButtonV3DTO selectButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(images, "images");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
            Intrinsics.checkNotNullParameter(selectButton, "selectButton");
            return new Room(images, title, detailBadge, details, price, priceDescription, selectButton, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Room)) {
                return false;
            }
            Room room = (Room) other;
            return Intrinsics.d(this.images, room.images) && Intrinsics.d(this.title, room.title) && Intrinsics.d(this.detailBadge, room.detailBadge) && Intrinsics.d(this.details, room.details) && Intrinsics.d(this.price, room.price) && Intrinsics.d(this.priceDescription, room.priceDescription) && Intrinsics.d(this.selectButton, room.selectButton) && Intrinsics.d(this.trackingInfo, room.trackingInfo);
        }

        public final BadgeDTO getDetailBadge() {
            return this.detailBadge;
        }

        @NotNull
        public final List<CellDTO> getDetails() {
            return this.details;
        }

        @NotNull
        public final List<String> getImages() {
            return this.images;
        }

        @NotNull
        public final PriceDTO getPrice() {
            return this.price;
        }

        @NotNull
        public final TextDTO getPriceDescription() {
            return this.priceDescription;
        }

        @NotNull
        public final ButtonV3DTO getSelectButton() {
            return this.selectButton;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = Ns.b.a(this.title, this.images.hashCode() * 31, 31);
            BadgeDTO badgeDTO = this.detailBadge;
            int c11 = C2859b.c(this.selectButton, Ns.b.a(this.priceDescription, C3051a.b(this.price, g.b((a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31, this.details), 31), 31), 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return c11 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Room(images=" + this.images + ", title=" + this.title + ", detailBadge=" + this.detailBadge + ", details=" + this.details + ", price=" + this.price + ", priceDescription=" + this.priceDescription + ", selectButton=" + this.selectButton + ", trackingInfo=" + this.trackingInfo + ")";
        }

        public Room(List list, TextDTO textDTO, BadgeDTO badgeDTO, List list2, PriceDTO priceDTO, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? K.f71697a : list, textDTO, badgeDTO, (i11 & 8) != 0 ? K.f71697a : list2, priceDTO, textDTO2, buttonV3DTO, map);
        }
    }
}
