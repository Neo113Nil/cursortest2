package ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.data;

import G.g;
import Hj.C3143a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.infoBadge.InfoBadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/data/TravelRoomsGuestsCardDTO;", "", "mobileTitle", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "infoBadge", "Lru/ozon/app/android/travel/molecules/dto/infoBadge/InfoBadgeDTO;", "rooms", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/data/TravelRoomAndGuestsDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/molecules/dto/infoBadge/InfoBadgeDTO;Ljava/util/List;Ljava/util/Map;)V", "getMobileTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getInfoBadge", "()Lru/ozon/app/android/travel/molecules/dto/infoBadge/InfoBadgeDTO;", "getRooms", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelRoomsGuestsCardDTO {
    public static final int $stable = 8;
    private final InfoBadgeDTO infoBadge;

    @NotNull
    private final TextAtom mobileTitle;

    @NotNull
    private final List<TravelRoomAndGuestsDTO> rooms;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public TravelRoomsGuestsCardDTO(@NotNull TextAtom mobileTitle, InfoBadgeDTO infoBadgeDTO, @NotNull List<TravelRoomAndGuestsDTO> rooms, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(mobileTitle, "mobileTitle");
        Intrinsics.checkNotNullParameter(rooms, "rooms");
        this.mobileTitle = mobileTitle;
        this.infoBadge = infoBadgeDTO;
        this.rooms = rooms;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelRoomsGuestsCardDTO copy$default(TravelRoomsGuestsCardDTO travelRoomsGuestsCardDTO, TextAtom textAtom, InfoBadgeDTO infoBadgeDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = travelRoomsGuestsCardDTO.mobileTitle;
        }
        if ((i11 & 2) != 0) {
            infoBadgeDTO = travelRoomsGuestsCardDTO.infoBadge;
        }
        if ((i11 & 4) != 0) {
            list = travelRoomsGuestsCardDTO.rooms;
        }
        if ((i11 & 8) != 0) {
            map = travelRoomsGuestsCardDTO.trackingInfo;
        }
        return travelRoomsGuestsCardDTO.copy(textAtom, infoBadgeDTO, list, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getMobileTitle() {
        return this.mobileTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final InfoBadgeDTO getInfoBadge() {
        return this.infoBadge;
    }

    @NotNull
    public final List<TravelRoomAndGuestsDTO> component3() {
        return this.rooms;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final TravelRoomsGuestsCardDTO copy(@NotNull TextAtom mobileTitle, InfoBadgeDTO infoBadge, @NotNull List<TravelRoomAndGuestsDTO> rooms, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(mobileTitle, "mobileTitle");
        Intrinsics.checkNotNullParameter(rooms, "rooms");
        return new TravelRoomsGuestsCardDTO(mobileTitle, infoBadge, rooms, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelRoomsGuestsCardDTO)) {
            return false;
        }
        TravelRoomsGuestsCardDTO travelRoomsGuestsCardDTO = (TravelRoomsGuestsCardDTO) other;
        return Intrinsics.d(this.mobileTitle, travelRoomsGuestsCardDTO.mobileTitle) && Intrinsics.d(this.infoBadge, travelRoomsGuestsCardDTO.infoBadge) && Intrinsics.d(this.rooms, travelRoomsGuestsCardDTO.rooms) && Intrinsics.d(this.trackingInfo, travelRoomsGuestsCardDTO.trackingInfo);
    }

    public final InfoBadgeDTO getInfoBadge() {
        return this.infoBadge;
    }

    @NotNull
    public final TextAtom getMobileTitle() {
        return this.mobileTitle;
    }

    @NotNull
    public final List<TravelRoomAndGuestsDTO> getRooms() {
        return this.rooms;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.mobileTitle.hashCode() * 31;
        InfoBadgeDTO infoBadgeDTO = this.infoBadge;
        int b11 = g.b((hashCode + (infoBadgeDTO == null ? 0 : infoBadgeDTO.hashCode())) * 31, 31, this.rooms);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.mobileTitle;
        InfoBadgeDTO infoBadgeDTO = this.infoBadge;
        List<TravelRoomAndGuestsDTO> list = this.rooms;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("TravelRoomsGuestsCardDTO(mobileTitle=");
        sb2.append(textAtom);
        sb2.append(", infoBadge=");
        sb2.append(infoBadgeDTO);
        sb2.append(", rooms=");
        return C3143a.h(sb2, list, ", trackingInfo=", map, ")");
    }

    public TravelRoomsGuestsCardDTO(TextAtom textAtom, InfoBadgeDTO infoBadgeDTO, List list, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, infoBadgeDTO, (i11 & 4) != 0 ? K.f71697a : list, map);
    }
}
