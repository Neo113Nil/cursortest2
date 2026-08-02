package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms;

import El.C2971a;
import G.g;
import Kk.C3532b;
import Ns.b;
import WZ.t;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B¯\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b/\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u00102R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u00108R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b9\u0010.R\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b:\u00102R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b;\u0010.R\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b<\u00102R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010,\u001a\u0004\b=\u0010.R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0017\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0017\u00100\u001a\u0004\b\u0017\u00102R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u00106\u001a\u0004\bG\u00108R$\u0010I\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010O\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010U\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010J\u001a\u0004\bV\u0010L\"\u0004\bW\u0010NR$\u0010X\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010J\u001a\u0004\bY\u0010L\"\u0004\bZ\u0010NR$\u0010\\\u001a\u0004\u0018\u00010[8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010a¨\u0006b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/HotelsRoomsListV5RoomVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/ImageVO;", "images", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "tags", "", "areTagsVisible", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "detailBadge", "accommodation", "areAccommodationVisible", "roomBadges", "areRoomBadgesVisible", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffVO;", "tariffs", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "isTariffsLoaderVisible", "LWZ/t;", "galleryTrackingInfo", "Lru/ozon/uni/atoms/af/AtomAction;", "openDetailAction", "roomsLeftBadge", "<init>", "(JLjava/util/List;Ljava/util/List;ZLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;ZLjava/util/List;ZLjava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;ZLWZ/t;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "getTags", "Z", "getAreTagsVisible", "()Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getDetailBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAccommodation", "getAreAccommodationVisible", "getRoomBadges", "getAreRoomBadgesVisible", "getTariffs", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "LWZ/t;", "getGalleryTrackingInfo", "()LWZ/t;", "Lru/ozon/uni/atoms/af/AtomAction;", "getOpenDetailAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getRoomsLeftBadge", "Landroid/os/Parcelable;", "imagesState", "Landroid/os/Parcelable;", "getImagesState", "()Landroid/os/Parcelable;", "setImagesState", "(Landroid/os/Parcelable;)V", "highlightedDotPosition", "Ljava/lang/Integer;", "getHighlightedDotPosition", "()Ljava/lang/Integer;", "setHighlightedDotPosition", "(Ljava/lang/Integer;)V", "roomBadgesState", "getRoomBadgesState", "setRoomBadgesState", "tariffsState", "getTariffsState", "setTariffsState", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffLayoutCache;", "tariffLayoutCache", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffLayoutCache;", "getTariffLayoutCache", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffLayoutCache;", "setTariffLayoutCache", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffLayoutCache;)V", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsRoomsListV5RoomVO implements c {

    @NotNull
    private final List<TextDTO> accommodation;
    private final boolean areAccommodationVisible;
    private final boolean areRoomBadgesVisible;
    private final boolean areTagsVisible;
    private final ButtonV3DTO button;
    private final BadgeDTO detailBadge;
    private final t galleryTrackingInfo;
    private Integer highlightedDotPosition;
    private final long id;

    @NotNull
    private final List<ImageVO> images;
    private Parcelable imagesState;
    private final boolean isTariffsLoaderVisible;

    @NotNull
    private final TextDTO name;
    private final AtomAction openDetailAction;

    @NotNull
    private final List<BadgeDTO> roomBadges;
    private Parcelable roomBadgesState;
    private final BadgeDTO roomsLeftBadge;

    @NotNull
    private final List<BadgeDTO> tags;
    private TariffLayoutCache tariffLayoutCache;

    @NotNull
    private final List<TariffVO> tariffs;
    private Parcelable tariffsState;

    public HotelsRoomsListV5RoomVO(long j11, @NotNull List<ImageVO> images, @NotNull List<BadgeDTO> tags, boolean z11, @NotNull TextDTO name, BadgeDTO badgeDTO, @NotNull List<TextDTO> accommodation, boolean z12, @NotNull List<BadgeDTO> roomBadges, boolean z13, @NotNull List<TariffVO> tariffs, ButtonV3DTO buttonV3DTO, boolean z14, t tVar, AtomAction atomAction, BadgeDTO badgeDTO2) {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(accommodation, "accommodation");
        Intrinsics.checkNotNullParameter(roomBadges, "roomBadges");
        Intrinsics.checkNotNullParameter(tariffs, "tariffs");
        this.id = j11;
        this.images = images;
        this.tags = tags;
        this.areTagsVisible = z11;
        this.name = name;
        this.detailBadge = badgeDTO;
        this.accommodation = accommodation;
        this.areAccommodationVisible = z12;
        this.roomBadges = roomBadges;
        this.areRoomBadgesVisible = z13;
        this.tariffs = tariffs;
        this.button = buttonV3DTO;
        this.isTariffsLoaderVisible = z14;
        this.galleryTrackingInfo = tVar;
        this.openDetailAction = atomAction;
        this.roomsLeftBadge = badgeDTO2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsRoomsListV5RoomVO)) {
            return false;
        }
        HotelsRoomsListV5RoomVO hotelsRoomsListV5RoomVO = (HotelsRoomsListV5RoomVO) other;
        return this.id == hotelsRoomsListV5RoomVO.id && Intrinsics.d(this.images, hotelsRoomsListV5RoomVO.images) && Intrinsics.d(this.tags, hotelsRoomsListV5RoomVO.tags) && this.areTagsVisible == hotelsRoomsListV5RoomVO.areTagsVisible && Intrinsics.d(this.name, hotelsRoomsListV5RoomVO.name) && Intrinsics.d(this.detailBadge, hotelsRoomsListV5RoomVO.detailBadge) && Intrinsics.d(this.accommodation, hotelsRoomsListV5RoomVO.accommodation) && this.areAccommodationVisible == hotelsRoomsListV5RoomVO.areAccommodationVisible && Intrinsics.d(this.roomBadges, hotelsRoomsListV5RoomVO.roomBadges) && this.areRoomBadgesVisible == hotelsRoomsListV5RoomVO.areRoomBadgesVisible && Intrinsics.d(this.tariffs, hotelsRoomsListV5RoomVO.tariffs) && Intrinsics.d(this.button, hotelsRoomsListV5RoomVO.button) && this.isTariffsLoaderVisible == hotelsRoomsListV5RoomVO.isTariffsLoaderVisible && Intrinsics.d(this.galleryTrackingInfo, hotelsRoomsListV5RoomVO.galleryTrackingInfo) && Intrinsics.d(this.openDetailAction, hotelsRoomsListV5RoomVO.openDetailAction) && Intrinsics.d(this.roomsLeftBadge, hotelsRoomsListV5RoomVO.roomsLeftBadge);
    }

    @NotNull
    public final List<TextDTO> getAccommodation() {
        return this.accommodation;
    }

    public final boolean getAreAccommodationVisible() {
        return this.areAccommodationVisible;
    }

    public final boolean getAreRoomBadgesVisible() {
        return this.areRoomBadgesVisible;
    }

    public final boolean getAreTagsVisible() {
        return this.areTagsVisible;
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final BadgeDTO getDetailBadge() {
        return this.detailBadge;
    }

    public final t getGalleryTrackingInfo() {
        return this.galleryTrackingInfo;
    }

    public final Integer getHighlightedDotPosition() {
        return this.highlightedDotPosition;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<ImageVO> getImages() {
        return this.images;
    }

    public final Parcelable getImagesState() {
        return this.imagesState;
    }

    @NotNull
    public final TextDTO getName() {
        return this.name;
    }

    public final AtomAction getOpenDetailAction() {
        return this.openDetailAction;
    }

    @NotNull
    public final List<BadgeDTO> getRoomBadges() {
        return this.roomBadges;
    }

    public final Parcelable getRoomBadgesState() {
        return this.roomBadgesState;
    }

    public final BadgeDTO getRoomsLeftBadge() {
        return this.roomsLeftBadge;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<BadgeDTO> getTags() {
        return this.tags;
    }

    public final TariffLayoutCache getTariffLayoutCache() {
        return this.tariffLayoutCache;
    }

    @NotNull
    public final List<TariffVO> getTariffs() {
        return this.tariffs;
    }

    public final Parcelable getTariffsState() {
        return this.tariffsState;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.name, C3532b.a(g.b(g.b(Long.hashCode(this.id) * 31, 31, this.images), 31, this.tags), 31, this.areTagsVisible), 31);
        BadgeDTO badgeDTO = this.detailBadge;
        int b11 = g.b(C3532b.a(g.b(C3532b.a(g.b((a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31, this.accommodation), 31, this.areAccommodationVisible), 31, this.roomBadges), 31, this.areRoomBadgesVisible), 31, this.tariffs);
        ButtonV3DTO buttonV3DTO = this.button;
        int a12 = C3532b.a((b11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31, 31, this.isTariffsLoaderVisible);
        t tVar = this.galleryTrackingInfo;
        int hashCode = (a12 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        AtomAction atomAction = this.openDetailAction;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        BadgeDTO badgeDTO2 = this.roomsLeftBadge;
        return hashCode2 + (badgeDTO2 != null ? badgeDTO2.hashCode() : 0);
    }

    /* renamed from: isTariffsLoaderVisible, reason: from getter */
    public final boolean getIsTariffsLoaderVisible() {
        return this.isTariffsLoaderVisible;
    }

    public final void setHighlightedDotPosition(Integer num) {
        this.highlightedDotPosition = num;
    }

    public final void setImagesState(Parcelable parcelable) {
        this.imagesState = parcelable;
    }

    public final void setRoomBadgesState(Parcelable parcelable) {
        this.roomBadgesState = parcelable;
    }

    public final void setTariffLayoutCache(TariffLayoutCache tariffLayoutCache) {
        this.tariffLayoutCache = tariffLayoutCache;
    }

    public final void setTariffsState(Parcelable parcelable) {
        this.tariffsState = parcelable;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<ImageVO> list = this.images;
        List<BadgeDTO> list2 = this.tags;
        boolean z11 = this.areTagsVisible;
        TextDTO textDTO = this.name;
        BadgeDTO badgeDTO = this.detailBadge;
        List<TextDTO> list3 = this.accommodation;
        boolean z12 = this.areAccommodationVisible;
        List<BadgeDTO> list4 = this.roomBadges;
        boolean z13 = this.areRoomBadgesVisible;
        List<TariffVO> list5 = this.tariffs;
        ButtonV3DTO buttonV3DTO = this.button;
        boolean z14 = this.isTariffsLoaderVisible;
        t tVar = this.galleryTrackingInfo;
        AtomAction atomAction = this.openDetailAction;
        BadgeDTO badgeDTO2 = this.roomsLeftBadge;
        StringBuilder b11 = Lh.b.b(j11, "HotelsRoomsListV5RoomVO(id=", ", images=", list);
        AZ.c.c(b11, ", tags=", list2, ", areTagsVisible=", z11);
        b11.append(", name=");
        b11.append(textDTO);
        b11.append(", detailBadge=");
        b11.append(badgeDTO);
        AZ.c.c(b11, ", accommodation=", list3, ", areAccommodationVisible=", z12);
        AZ.c.c(b11, ", roomBadges=", list4, ", areRoomBadgesVisible=", z13);
        b11.append(", tariffs=");
        b11.append(list5);
        b11.append(", button=");
        b11.append(buttonV3DTO);
        C2971a.d(b11, ", isTariffsLoaderVisible=", z14, ", galleryTrackingInfo=", tVar);
        b11.append(", openDetailAction=");
        b11.append(atomAction);
        b11.append(", roomsLeftBadge=");
        b11.append(badgeDTO2);
        b11.append(")");
        return b11.toString();
    }
}
