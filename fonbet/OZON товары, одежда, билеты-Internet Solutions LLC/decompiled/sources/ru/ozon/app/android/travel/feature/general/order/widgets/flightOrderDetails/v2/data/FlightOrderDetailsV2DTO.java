package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.data;

import Bl.b;
import Co.a;
import G.g;
import Kk.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.travel.molecules.dto.tripLeg.v1.TripLegDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0018B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/data/FlightOrderDetailsV2DTO;", "", "segments", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/data/FlightOrderDetailsV2DTO$SegmentDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getSegments", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "SegmentDTO", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FlightOrderDetailsV2DTO {
    public static final int $stable = 8;

    @NotNull
    private final List<SegmentDTO> segments;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/data/FlightOrderDetailsV2DTO$SegmentDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/data/FlightOrderDetailsV2DTO$SegmentDTO$HeaderDTO;", "content", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/data/FlightOrderDetailsV2DTO$SegmentDTO$SegmentContentDTO;", "<init>", "(Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/data/FlightOrderDetailsV2DTO$SegmentDTO$HeaderDTO;Ljava/util/List;)V", "getHeader", "()Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/data/FlightOrderDetailsV2DTO$SegmentDTO$HeaderDTO;", "getContent", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HeaderDTO", "SegmentContentDTO", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class SegmentDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<SegmentContentDTO> content;

        @NotNull
        private final HeaderDTO header;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/data/FlightOrderDetailsV2DTO$SegmentDTO$HeaderDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class HeaderDTO {
            public static final int $stable = TextAtom.$stable;

            @NotNull
            private final TextAtom subtitle;

            @NotNull
            private final TextAtom title;

            public HeaderDTO(@NotNull TextAtom title, @NotNull TextAtom subtitle) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                this.title = title;
                this.subtitle = subtitle;
            }

            public static /* synthetic */ HeaderDTO copy$default(HeaderDTO headerDTO, TextAtom textAtom, TextAtom textAtom2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textAtom = headerDTO.title;
                }
                if ((i11 & 2) != 0) {
                    textAtom2 = headerDTO.subtitle;
                }
                return headerDTO.copy(textAtom, textAtom2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextAtom getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextAtom getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final HeaderDTO copy(@NotNull TextAtom title, @NotNull TextAtom subtitle) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                return new HeaderDTO(title, subtitle);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HeaderDTO)) {
                    return false;
                }
                HeaderDTO headerDTO = (HeaderDTO) other;
                return Intrinsics.d(this.title, headerDTO.title) && Intrinsics.d(this.subtitle, headerDTO.subtitle);
            }

            @NotNull
            public final TextAtom getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextAtom getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.subtitle.hashCode() + (this.title.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return a.a("HeaderDTO(title=", this.title, ", subtitle=", this.subtitle, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003Ja\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/data/FlightOrderDetailsV2DTO$SegmentDTO$SegmentContentDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "imageLink", "", "smallButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "tripLeg", "Lru/ozon/app/android/travel/molecules/dto/tripLeg/v1/TripLegDTO;", "transfer", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCounter;", "transferCellBackgroundColor", "additionalInfo", "bookingInfo", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Lru/ozon/app/android/travel/molecules/dto/tripLeg/v1/TripLegDTO;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCounter;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getImageLink", "()Ljava/lang/String;", "getSmallButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getTripLeg", "()Lru/ozon/app/android/travel/molecules/dto/tripLeg/v1/TripLegDTO;", "getTransfer", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCounter;", "getTransferCellBackgroundColor", "getAdditionalInfo", "getBookingInfo", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SegmentContentDTO {
            public static final int $stable = 8;
            private final TextAtom additionalInfo;
            private final CellDTO bookingInfo;

            @NotNull
            private final String imageLink;

            @NotNull
            private final ButtonV3Atom.SmallBorderlessButton smallButton;

            @NotNull
            private final TextAtom title;
            private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter transfer;
            private final String transferCellBackgroundColor;

            @NotNull
            private final TripLegDTO tripLeg;

            public SegmentContentDTO(@NotNull TextAtom title, @NotNull String imageLink, @NotNull ButtonV3Atom.SmallBorderlessButton smallButton, @NotNull TripLegDTO tripLeg, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter cellWithSubtitle24IconCounter, String str, TextAtom textAtom, CellDTO cellDTO) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(imageLink, "imageLink");
                Intrinsics.checkNotNullParameter(smallButton, "smallButton");
                Intrinsics.checkNotNullParameter(tripLeg, "tripLeg");
                this.title = title;
                this.imageLink = imageLink;
                this.smallButton = smallButton;
                this.tripLeg = tripLeg;
                this.transfer = cellWithSubtitle24IconCounter;
                this.transferCellBackgroundColor = str;
                this.additionalInfo = textAtom;
                this.bookingInfo = cellDTO;
            }

            public static /* synthetic */ SegmentContentDTO copy$default(SegmentContentDTO segmentContentDTO, TextAtom textAtom, String str, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, TripLegDTO tripLegDTO, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter cellWithSubtitle24IconCounter, String str2, TextAtom textAtom2, CellDTO cellDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textAtom = segmentContentDTO.title;
                }
                if ((i11 & 2) != 0) {
                    str = segmentContentDTO.imageLink;
                }
                if ((i11 & 4) != 0) {
                    smallBorderlessButton = segmentContentDTO.smallButton;
                }
                if ((i11 & 8) != 0) {
                    tripLegDTO = segmentContentDTO.tripLeg;
                }
                if ((i11 & 16) != 0) {
                    cellWithSubtitle24IconCounter = segmentContentDTO.transfer;
                }
                if ((i11 & 32) != 0) {
                    str2 = segmentContentDTO.transferCellBackgroundColor;
                }
                if ((i11 & 64) != 0) {
                    textAtom2 = segmentContentDTO.additionalInfo;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    cellDTO = segmentContentDTO.bookingInfo;
                }
                TextAtom textAtom3 = textAtom2;
                CellDTO cellDTO2 = cellDTO;
                CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter cellWithSubtitle24IconCounter2 = cellWithSubtitle24IconCounter;
                String str3 = str2;
                return segmentContentDTO.copy(textAtom, str, smallBorderlessButton, tripLegDTO, cellWithSubtitle24IconCounter2, str3, textAtom3, cellDTO2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextAtom getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getImageLink() {
                return this.imageLink;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final ButtonV3Atom.SmallBorderlessButton getSmallButton() {
                return this.smallButton;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final TripLegDTO getTripLeg() {
                return this.tripLeg;
            }

            /* renamed from: component5, reason: from getter */
            public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter getTransfer() {
                return this.transfer;
            }

            /* renamed from: component6, reason: from getter */
            public final String getTransferCellBackgroundColor() {
                return this.transferCellBackgroundColor;
            }

            /* renamed from: component7, reason: from getter */
            public final TextAtom getAdditionalInfo() {
                return this.additionalInfo;
            }

            /* renamed from: component8, reason: from getter */
            public final CellDTO getBookingInfo() {
                return this.bookingInfo;
            }

            @NotNull
            public final SegmentContentDTO copy(@NotNull TextAtom title, @NotNull String imageLink, @NotNull ButtonV3Atom.SmallBorderlessButton smallButton, @NotNull TripLegDTO tripLeg, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter transfer, String transferCellBackgroundColor, TextAtom additionalInfo, CellDTO bookingInfo) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(imageLink, "imageLink");
                Intrinsics.checkNotNullParameter(smallButton, "smallButton");
                Intrinsics.checkNotNullParameter(tripLeg, "tripLeg");
                return new SegmentContentDTO(title, imageLink, smallButton, tripLeg, transfer, transferCellBackgroundColor, additionalInfo, bookingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SegmentContentDTO)) {
                    return false;
                }
                SegmentContentDTO segmentContentDTO = (SegmentContentDTO) other;
                return Intrinsics.d(this.title, segmentContentDTO.title) && Intrinsics.d(this.imageLink, segmentContentDTO.imageLink) && Intrinsics.d(this.smallButton, segmentContentDTO.smallButton) && Intrinsics.d(this.tripLeg, segmentContentDTO.tripLeg) && Intrinsics.d(this.transfer, segmentContentDTO.transfer) && Intrinsics.d(this.transferCellBackgroundColor, segmentContentDTO.transferCellBackgroundColor) && Intrinsics.d(this.additionalInfo, segmentContentDTO.additionalInfo) && Intrinsics.d(this.bookingInfo, segmentContentDTO.bookingInfo);
            }

            public final TextAtom getAdditionalInfo() {
                return this.additionalInfo;
            }

            public final CellDTO getBookingInfo() {
                return this.bookingInfo;
            }

            @NotNull
            public final String getImageLink() {
                return this.imageLink;
            }

            @NotNull
            public final ButtonV3Atom.SmallBorderlessButton getSmallButton() {
                return this.smallButton;
            }

            @NotNull
            public final TextAtom getTitle() {
                return this.title;
            }

            public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter getTransfer() {
                return this.transfer;
            }

            public final String getTransferCellBackgroundColor() {
                return this.transferCellBackgroundColor;
            }

            @NotNull
            public final TripLegDTO getTripLeg() {
                return this.tripLeg;
            }

            public int hashCode() {
                int hashCode = (this.tripLeg.hashCode() + ((this.smallButton.hashCode() + g.a(this.title.hashCode() * 31, 31, this.imageLink)) * 31)) * 31;
                CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter cellWithSubtitle24IconCounter = this.transfer;
                int hashCode2 = (hashCode + (cellWithSubtitle24IconCounter == null ? 0 : cellWithSubtitle24IconCounter.hashCode())) * 31;
                String str = this.transferCellBackgroundColor;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                TextAtom textAtom = this.additionalInfo;
                int hashCode4 = (hashCode3 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
                CellDTO cellDTO = this.bookingInfo;
                return hashCode4 + (cellDTO != null ? cellDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                TextAtom textAtom = this.title;
                String str = this.imageLink;
                ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.smallButton;
                TripLegDTO tripLegDTO = this.tripLeg;
                CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter cellWithSubtitle24IconCounter = this.transfer;
                String str2 = this.transferCellBackgroundColor;
                TextAtom textAtom2 = this.additionalInfo;
                CellDTO cellDTO = this.bookingInfo;
                StringBuilder d11 = b.d("SegmentContentDTO(title=", ", imageLink=", str, ", smallButton=", textAtom);
                d11.append(smallBorderlessButton);
                d11.append(", tripLeg=");
                d11.append(tripLegDTO);
                d11.append(", transfer=");
                d11.append(cellWithSubtitle24IconCounter);
                d11.append(", transferCellBackgroundColor=");
                d11.append(str2);
                d11.append(", additionalInfo=");
                d11.append(textAtom2);
                d11.append(", bookingInfo=");
                d11.append(cellDTO);
                d11.append(")");
                return d11.toString();
            }
        }

        public SegmentDTO(@NotNull HeaderDTO header, @NotNull List<SegmentContentDTO> content) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(content, "content");
            this.header = header;
            this.content = content;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SegmentDTO copy$default(SegmentDTO segmentDTO, HeaderDTO headerDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                headerDTO = segmentDTO.header;
            }
            if ((i11 & 2) != 0) {
                list = segmentDTO.content;
            }
            return segmentDTO.copy(headerDTO, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final HeaderDTO getHeader() {
            return this.header;
        }

        @NotNull
        public final List<SegmentContentDTO> component2() {
            return this.content;
        }

        @NotNull
        public final SegmentDTO copy(@NotNull HeaderDTO header, @NotNull List<SegmentContentDTO> content) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(content, "content");
            return new SegmentDTO(header, content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SegmentDTO)) {
                return false;
            }
            SegmentDTO segmentDTO = (SegmentDTO) other;
            return Intrinsics.d(this.header, segmentDTO.header) && Intrinsics.d(this.content, segmentDTO.content);
        }

        @NotNull
        public final List<SegmentContentDTO> getContent() {
            return this.content;
        }

        @NotNull
        public final HeaderDTO getHeader() {
            return this.header;
        }

        public int hashCode() {
            return this.content.hashCode() + (this.header.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "SegmentDTO(header=" + this.header + ", content=" + this.content + ")";
        }
    }

    public FlightOrderDetailsV2DTO(@NotNull List<SegmentDTO> segments, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.segments = segments;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlightOrderDetailsV2DTO copy$default(FlightOrderDetailsV2DTO flightOrderDetailsV2DTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = flightOrderDetailsV2DTO.segments;
        }
        if ((i11 & 2) != 0) {
            map = flightOrderDetailsV2DTO.trackingInfo;
        }
        return flightOrderDetailsV2DTO.copy(list, map);
    }

    @NotNull
    public final List<SegmentDTO> component1() {
        return this.segments;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final FlightOrderDetailsV2DTO copy(@NotNull List<SegmentDTO> segments, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        return new FlightOrderDetailsV2DTO(segments, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightOrderDetailsV2DTO)) {
            return false;
        }
        FlightOrderDetailsV2DTO flightOrderDetailsV2DTO = (FlightOrderDetailsV2DTO) other;
        return Intrinsics.d(this.segments, flightOrderDetailsV2DTO.segments) && Intrinsics.d(this.trackingInfo, flightOrderDetailsV2DTO.trackingInfo);
    }

    @NotNull
    public final List<SegmentDTO> getSegments() {
        return this.segments;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.segments.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return c.d("FlightOrderDetailsV2DTO(segments=", ", trackingInfo=", ")", this.segments, this.trackingInfo);
    }
}
