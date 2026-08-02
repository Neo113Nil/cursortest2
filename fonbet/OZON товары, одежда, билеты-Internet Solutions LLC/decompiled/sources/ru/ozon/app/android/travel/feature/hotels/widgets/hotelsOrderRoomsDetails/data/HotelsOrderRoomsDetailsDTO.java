package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsOrderRoomsDetails.data;

import B3.p;
import B90.C2616s;
import G.g;
import GR.b;
import Pk0.a;
import com.squareup.moshi.j;
import ed.InterfaceC6346b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001:\u0004\u000f\u0010\u0011\u0012B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsDTO;", "Lru/ozon/app/android/travel/utils/listtracking/TrackingInfoHolder;", "roomsDetails", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsDTO$RoomDetailsDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getRoomsDetails", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "RoomDetailsDTO", "CellBlockDTO", "DsCell", "ElementMargins", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsOrderRoomsDetailsDTO implements TrackingInfoHolder {
    public static final int $stable = 8;

    @NotNull
    private final List<RoomDetailsDTO> roomsDetails;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @InterfaceC6346b
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsDTO$DsCell;", "", "dsCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "constructor-impl", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getDsCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "equals", "", "other", "equals-impl", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)I", "toString", "", "toString-impl", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)Ljava/lang/String;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final class DsCell {

        @NotNull
        private final CellDTO dsCell;

        private /* synthetic */ DsCell(CellDTO cellDTO) {
            this.dsCell = cellDTO;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ DsCell m1402boximpl(CellDTO cellDTO) {
            return new DsCell(cellDTO);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static CellDTO m1403constructorimpl(@NotNull CellDTO dsCell) {
            Intrinsics.checkNotNullParameter(dsCell, "dsCell");
            return dsCell;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1404equalsimpl(CellDTO cellDTO, Object obj) {
            return (obj instanceof DsCell) && Intrinsics.d(cellDTO, ((DsCell) obj).m1408unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1405equalsimpl0(CellDTO cellDTO, CellDTO cellDTO2) {
            return Intrinsics.d(cellDTO, cellDTO2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1406hashCodeimpl(CellDTO cellDTO) {
            return cellDTO.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1407toStringimpl(CellDTO cellDTO) {
            return "DsCell(dsCell=" + cellDTO + ")";
        }

        public boolean equals(Object obj) {
            return m1404equalsimpl(this.dsCell, obj);
        }

        @NotNull
        public final CellDTO getDsCell() {
            return this.dsCell;
        }

        public int hashCode() {
            return m1406hashCodeimpl(this.dsCell);
        }

        public String toString() {
            return m1407toStringimpl(this.dsCell);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ CellDTO m1408unboximpl() {
            return this.dsCell;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsDTO$ElementMargins;", "", "leading", "Lru/ozon/uni/atoms/data/common/Paddings;", "top", "trailing", "bottom", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getLeading", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getTop", "getTrailing", "getBottom", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ElementMargins {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final ElementMargins EMPTY = new ElementMargins(null, null, null, null, 15, null);

        @EnumNullFallback
        @NotNull
        private final Paddings bottom;

        @EnumNullFallback
        @NotNull
        private final Paddings leading;

        @EnumNullFallback
        @NotNull
        private final Paddings top;

        @EnumNullFallback
        @NotNull
        private final Paddings trailing;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsDTO$ElementMargins$Companion;", "", "<init>", "()V", "EMPTY", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsDTO$ElementMargins;", "getEMPTY", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsDTO$ElementMargins;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ElementMargins getEMPTY() {
                return ElementMargins.EMPTY;
            }

            private Companion() {
            }
        }

        public ElementMargins() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ ElementMargins copy$default(ElementMargins elementMargins, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = elementMargins.leading;
            }
            if ((i11 & 2) != 0) {
                paddings2 = elementMargins.top;
            }
            if ((i11 & 4) != 0) {
                paddings3 = elementMargins.trailing;
            }
            if ((i11 & 8) != 0) {
                paddings4 = elementMargins.bottom;
            }
            return elementMargins.copy(paddings, paddings2, paddings3, paddings4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getLeading() {
            return this.leading;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getTrailing() {
            return this.trailing;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final ElementMargins copy(@NotNull Paddings leading, @NotNull Paddings top, @NotNull Paddings trailing, @NotNull Paddings bottom) {
            Intrinsics.checkNotNullParameter(leading, "leading");
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(trailing, "trailing");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            return new ElementMargins(leading, top, trailing, bottom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ElementMargins)) {
                return false;
            }
            ElementMargins elementMargins = (ElementMargins) other;
            return this.leading == elementMargins.leading && this.top == elementMargins.top && this.trailing == elementMargins.trailing && this.bottom == elementMargins.bottom;
        }

        @NotNull
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final Paddings getLeading() {
            return this.leading;
        }

        @NotNull
        public final Paddings getTop() {
            return this.top;
        }

        @NotNull
        public final Paddings getTrailing() {
            return this.trailing;
        }

        public int hashCode() {
            return this.bottom.hashCode() + b.b(this.trailing, b.b(this.top, this.leading.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.leading;
            Paddings paddings2 = this.top;
            return b.e(p.b("ElementMargins(leading=", paddings, ", top=", paddings2, ", trailing="), this.trailing, ", bottom=", this.bottom, ")");
        }

        public ElementMargins(@NotNull Paddings leading, @NotNull Paddings top, @NotNull Paddings trailing, @NotNull Paddings bottom) {
            Intrinsics.checkNotNullParameter(leading, "leading");
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(trailing, "trailing");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            this.leading = leading;
            this.top = top;
            this.trailing = trailing;
            this.bottom = bottom;
        }

        public /* synthetic */ ElementMargins(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.NONE : paddings, (i11 & 2) != 0 ? Paddings.NONE : paddings2, (i11 & 4) != 0 ? Paddings.NONE : paddings3, (i11 & 8) != 0 ? Paddings.NONE : paddings4);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsDTO$RoomDetailsDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "cellBlocks", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsDTO$CellBlockDTO;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getCellBlocks", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RoomDetailsDTO {
        public static final int $stable = 8;
        private final BadgeDTO badge;

        @NotNull
        private final List<CellBlockDTO> cellBlocks;
        private final ImageDTO image;

        @NotNull
        private final TextDTO title;

        public RoomDetailsDTO(ImageDTO imageDTO, @NotNull TextDTO title, BadgeDTO badgeDTO, @NotNull List<CellBlockDTO> cellBlocks) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(cellBlocks, "cellBlocks");
            this.image = imageDTO;
            this.title = title;
            this.badge = badgeDTO;
            this.cellBlocks = cellBlocks;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RoomDetailsDTO copy$default(RoomDetailsDTO roomDetailsDTO, ImageDTO imageDTO, TextDTO textDTO, BadgeDTO badgeDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = roomDetailsDTO.image;
            }
            if ((i11 & 2) != 0) {
                textDTO = roomDetailsDTO.title;
            }
            if ((i11 & 4) != 0) {
                badgeDTO = roomDetailsDTO.badge;
            }
            if ((i11 & 8) != 0) {
                list = roomDetailsDTO.cellBlocks;
            }
            return roomDetailsDTO.copy(imageDTO, textDTO, badgeDTO, list);
        }

        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final List<CellBlockDTO> component4() {
            return this.cellBlocks;
        }

        @NotNull
        public final RoomDetailsDTO copy(ImageDTO image, @NotNull TextDTO title, BadgeDTO badge, @NotNull List<CellBlockDTO> cellBlocks) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(cellBlocks, "cellBlocks");
            return new RoomDetailsDTO(image, title, badge, cellBlocks);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RoomDetailsDTO)) {
                return false;
            }
            RoomDetailsDTO roomDetailsDTO = (RoomDetailsDTO) other;
            return Intrinsics.d(this.image, roomDetailsDTO.image) && Intrinsics.d(this.title, roomDetailsDTO.title) && Intrinsics.d(this.badge, roomDetailsDTO.badge) && Intrinsics.d(this.cellBlocks, roomDetailsDTO.cellBlocks);
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final List<CellBlockDTO> getCellBlocks() {
            return this.cellBlocks;
        }

        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            ImageDTO imageDTO = this.image;
            int a11 = Ns.b.a(this.title, (imageDTO == null ? 0 : imageDTO.hashCode()) * 31, 31);
            BadgeDTO badgeDTO = this.badge;
            return this.cellBlocks.hashCode() + ((a11 + (badgeDTO != null ? badgeDTO.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.image;
            TextDTO textDTO = this.title;
            BadgeDTO badgeDTO = this.badge;
            List<CellBlockDTO> list = this.cellBlocks;
            StringBuilder d11 = C2616s.d("RoomDetailsDTO(image=", imageDTO, ", title=", textDTO, ", badge=");
            d11.append(badgeDTO);
            d11.append(", cellBlocks=");
            d11.append(list);
            d11.append(")");
            return d11.toString();
        }
    }

    public HotelsOrderRoomsDetailsDTO(@NotNull List<RoomDetailsDTO> roomsDetails, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(roomsDetails, "roomsDetails");
        this.roomsDetails = roomsDetails;
        this.trackingInfo = map;
    }

    @NotNull
    public final List<RoomDetailsDTO> getRoomsDetails() {
        return this.roomsDetails;
    }

    @Override // ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003J[\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsDTO$CellBlockDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "margins", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsDTO$ElementMargins;", "cells", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsDTO$DsCell;", "enableHtmlTags", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsDTO$ElementMargins;Ljava/util/List;Z)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getMargins", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsDTO$ElementMargins;", "getCells", "()Ljava/util/List;", "getEnableHtmlTags", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellBlockDTO {
        public static final int $stable = 8;
        private final String backgroundColor;

        @NotNull
        private final List<DsCell> cells;

        @EnumNullFallback
        @NotNull
        private final CornerRadius cornerRadius;
        private final boolean enableHtmlTags;

        @NotNull
        private final ElementMargins margins;
        private final TextDTO subtitle;
        private final TextDTO title;

        public CellBlockDTO(TextDTO textDTO, TextDTO textDTO2, String str, @NotNull CornerRadius cornerRadius, @NotNull ElementMargins margins, @NotNull List<DsCell> cells, boolean z11) {
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            Intrinsics.checkNotNullParameter(margins, "margins");
            Intrinsics.checkNotNullParameter(cells, "cells");
            this.title = textDTO;
            this.subtitle = textDTO2;
            this.backgroundColor = str;
            this.cornerRadius = cornerRadius;
            this.margins = margins;
            this.cells = cells;
            this.enableHtmlTags = z11;
        }

        public static /* synthetic */ CellBlockDTO copy$default(CellBlockDTO cellBlockDTO, TextDTO textDTO, TextDTO textDTO2, String str, CornerRadius cornerRadius, ElementMargins elementMargins, List list, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = cellBlockDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = cellBlockDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                str = cellBlockDTO.backgroundColor;
            }
            if ((i11 & 8) != 0) {
                cornerRadius = cellBlockDTO.cornerRadius;
            }
            if ((i11 & 16) != 0) {
                elementMargins = cellBlockDTO.margins;
            }
            if ((i11 & 32) != 0) {
                list = cellBlockDTO.cells;
            }
            if ((i11 & 64) != 0) {
                z11 = cellBlockDTO.enableHtmlTags;
            }
            List list2 = list;
            boolean z12 = z11;
            ElementMargins elementMargins2 = elementMargins;
            String str2 = str;
            return cellBlockDTO.copy(textDTO, textDTO2, str2, cornerRadius, elementMargins2, list2, z12);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final ElementMargins getMargins() {
            return this.margins;
        }

        @NotNull
        public final List<DsCell> component6() {
            return this.cells;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getEnableHtmlTags() {
            return this.enableHtmlTags;
        }

        @NotNull
        public final CellBlockDTO copy(TextDTO title, TextDTO subtitle, String backgroundColor, @NotNull CornerRadius cornerRadius, @NotNull ElementMargins margins, @NotNull List<DsCell> cells, boolean enableHtmlTags) {
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            Intrinsics.checkNotNullParameter(margins, "margins");
            Intrinsics.checkNotNullParameter(cells, "cells");
            return new CellBlockDTO(title, subtitle, backgroundColor, cornerRadius, margins, cells, enableHtmlTags);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellBlockDTO)) {
                return false;
            }
            CellBlockDTO cellBlockDTO = (CellBlockDTO) other;
            return Intrinsics.d(this.title, cellBlockDTO.title) && Intrinsics.d(this.subtitle, cellBlockDTO.subtitle) && Intrinsics.d(this.backgroundColor, cellBlockDTO.backgroundColor) && this.cornerRadius == cellBlockDTO.cornerRadius && Intrinsics.d(this.margins, cellBlockDTO.margins) && Intrinsics.d(this.cells, cellBlockDTO.cells) && this.enableHtmlTags == cellBlockDTO.enableHtmlTags;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final List<DsCell> getCells() {
            return this.cells;
        }

        @NotNull
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        public final boolean getEnableHtmlTags() {
            return this.enableHtmlTags;
        }

        @NotNull
        public final ElementMargins getMargins() {
            return this.margins;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            TextDTO textDTO2 = this.subtitle;
            int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            String str = this.backgroundColor;
            return Boolean.hashCode(this.enableHtmlTags) + g.b((this.margins.hashCode() + Tl.b.b(this.cornerRadius, (hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31)) * 31, 31, this.cells);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            String str = this.backgroundColor;
            CornerRadius cornerRadius = this.cornerRadius;
            ElementMargins elementMargins = this.margins;
            List<DsCell> list = this.cells;
            boolean z11 = this.enableHtmlTags;
            StringBuilder g10 = D3.g.g("CellBlockDTO(title=", textDTO, ", subtitle=", textDTO2, ", backgroundColor=");
            g10.append(str);
            g10.append(", cornerRadius=");
            g10.append(cornerRadius);
            g10.append(", margins=");
            g10.append(elementMargins);
            g10.append(", cells=");
            g10.append(list);
            g10.append(", enableHtmlTags=");
            return a.a(")", g10, z11);
        }

        public /* synthetic */ CellBlockDTO(TextDTO textDTO, TextDTO textDTO2, String str, CornerRadius cornerRadius, ElementMargins elementMargins, List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, textDTO2, str, (i11 & 8) != 0 ? CornerRadius.NO_RADIUS : cornerRadius, (i11 & 16) != 0 ? ElementMargins.INSTANCE.getEMPTY() : elementMargins, list, (i11 & 64) != 0 ? false : z11);
        }
    }
}
