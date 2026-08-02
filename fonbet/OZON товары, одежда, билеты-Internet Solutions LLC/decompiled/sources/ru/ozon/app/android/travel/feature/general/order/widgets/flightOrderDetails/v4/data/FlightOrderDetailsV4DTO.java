package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.data;

import G.g;
import GR.b;
import Kk.c;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.tripLeg.v3.TripLegV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0018B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO;", "", "segments", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getSegments", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "SegmentDTO", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FlightOrderDetailsV4DTO {
    public static final int $stable = 8;

    @NotNull
    private final List<SegmentDTO> segments;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "segmentParts", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO;", "info", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getSegmentParts", "()Ljava/util/List;", "getInfo", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SegmentPartDTO", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class SegmentDTO {
        public static final int $stable = 8;
        private final TextDTO info;

        @NotNull
        private final List<SegmentPartDTO> segmentParts;
        private final TextDTO subtitle;
        private final TextDTO title;

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO;", "", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "airlineCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "tripLeg", "Lru/ozon/app/android/travel/molecules/dto/tripLeg/v3/TripLegV3DTO;", "luggageBlock", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO$LuggageBlockDTO;", "transferCell", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/travel/molecules/dto/tripLeg/v3/TripLegV3DTO;Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO$LuggageBlockDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAirlineCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getTripLeg", "()Lru/ozon/app/android/travel/molecules/dto/tripLeg/v3/TripLegV3DTO;", "getLuggageBlock", "()Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO$LuggageBlockDTO;", "getTransferCell", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LuggageBlockDTO", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class SegmentPartDTO {
            public static final int $stable = 8;

            @NotNull
            private final CellDTO airlineCell;
            private final BadgeDTO badge;

            @NotNull
            private final LuggageBlockDTO luggageBlock;
            private final CellDTO transferCell;

            @NotNull
            private final TripLegV3DTO tripLeg;

            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO$LuggageBlockDTO;", "", "handCarry", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO$LuggageBlockDTO$LuggageItemDTO;", "luggage", "extraLuggage", "button", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO$LuggageBlockDTO$LuggageItemDTO;Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO$LuggageBlockDTO$LuggageItemDTO;Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO$LuggageBlockDTO$LuggageItemDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getHandCarry", "()Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO$LuggageBlockDTO$LuggageItemDTO;", "getLuggage", "getExtraLuggage", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LuggageItemDTO", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            @j(generateAdapter = true)
            public static final /* data */ class LuggageBlockDTO {
                public static final int $stable;

                @NotNull
                private final IconButtonV3DTO button;
                private final LuggageItemDTO extraLuggage;

                @NotNull
                private final LuggageItemDTO handCarry;

                @NotNull
                private final LuggageItemDTO luggage;

                @NotNull
                private final TextDTO title;

                @j(generateAdapter = true)
                @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO$LuggageBlockDTO$LuggageItemDTO;", "", "icon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class LuggageItemDTO {
                    public static final int $stable = CommonAtomIconDTO.$stable;

                    @NotNull
                    private final CommonAtomIconDTO icon;

                    @NotNull
                    private final TextDTO title;

                    public LuggageItemDTO(@NotNull CommonAtomIconDTO icon, @NotNull TextDTO title) {
                        Intrinsics.checkNotNullParameter(icon, "icon");
                        Intrinsics.checkNotNullParameter(title, "title");
                        this.icon = icon;
                        this.title = title;
                    }

                    public static /* synthetic */ LuggageItemDTO copy$default(LuggageItemDTO luggageItemDTO, CommonAtomIconDTO commonAtomIconDTO, TextDTO textDTO, int i11, Object obj) {
                        if ((i11 & 1) != 0) {
                            commonAtomIconDTO = luggageItemDTO.icon;
                        }
                        if ((i11 & 2) != 0) {
                            textDTO = luggageItemDTO.title;
                        }
                        return luggageItemDTO.copy(commonAtomIconDTO, textDTO);
                    }

                    @NotNull
                    /* renamed from: component1, reason: from getter */
                    public final CommonAtomIconDTO getIcon() {
                        return this.icon;
                    }

                    @NotNull
                    /* renamed from: component2, reason: from getter */
                    public final TextDTO getTitle() {
                        return this.title;
                    }

                    @NotNull
                    public final LuggageItemDTO copy(@NotNull CommonAtomIconDTO icon, @NotNull TextDTO title) {
                        Intrinsics.checkNotNullParameter(icon, "icon");
                        Intrinsics.checkNotNullParameter(title, "title");
                        return new LuggageItemDTO(icon, title);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof LuggageItemDTO)) {
                            return false;
                        }
                        LuggageItemDTO luggageItemDTO = (LuggageItemDTO) other;
                        return Intrinsics.d(this.icon, luggageItemDTO.icon) && Intrinsics.d(this.title, luggageItemDTO.title);
                    }

                    @NotNull
                    public final CommonAtomIconDTO getIcon() {
                        return this.icon;
                    }

                    @NotNull
                    public final TextDTO getTitle() {
                        return this.title;
                    }

                    public int hashCode() {
                        return this.title.hashCode() + (this.icon.hashCode() * 31);
                    }

                    @NotNull
                    public String toString() {
                        return "LuggageItemDTO(icon=" + this.icon + ", title=" + this.title + ")";
                    }
                }

                static {
                    int i11 = IconButtonV3DTO.$stable;
                    int i12 = CommonAtomIconDTO.$stable;
                    $stable = i11 | i12 | i12 | i12;
                }

                public LuggageBlockDTO(@NotNull LuggageItemDTO handCarry, @NotNull LuggageItemDTO luggage, LuggageItemDTO luggageItemDTO, @NotNull IconButtonV3DTO button, @NotNull TextDTO title) {
                    Intrinsics.checkNotNullParameter(handCarry, "handCarry");
                    Intrinsics.checkNotNullParameter(luggage, "luggage");
                    Intrinsics.checkNotNullParameter(button, "button");
                    Intrinsics.checkNotNullParameter(title, "title");
                    this.handCarry = handCarry;
                    this.luggage = luggage;
                    this.extraLuggage = luggageItemDTO;
                    this.button = button;
                    this.title = title;
                }

                public static /* synthetic */ LuggageBlockDTO copy$default(LuggageBlockDTO luggageBlockDTO, LuggageItemDTO luggageItemDTO, LuggageItemDTO luggageItemDTO2, LuggageItemDTO luggageItemDTO3, IconButtonV3DTO iconButtonV3DTO, TextDTO textDTO, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        luggageItemDTO = luggageBlockDTO.handCarry;
                    }
                    if ((i11 & 2) != 0) {
                        luggageItemDTO2 = luggageBlockDTO.luggage;
                    }
                    if ((i11 & 4) != 0) {
                        luggageItemDTO3 = luggageBlockDTO.extraLuggage;
                    }
                    if ((i11 & 8) != 0) {
                        iconButtonV3DTO = luggageBlockDTO.button;
                    }
                    if ((i11 & 16) != 0) {
                        textDTO = luggageBlockDTO.title;
                    }
                    TextDTO textDTO2 = textDTO;
                    LuggageItemDTO luggageItemDTO4 = luggageItemDTO3;
                    return luggageBlockDTO.copy(luggageItemDTO, luggageItemDTO2, luggageItemDTO4, iconButtonV3DTO, textDTO2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final LuggageItemDTO getHandCarry() {
                    return this.handCarry;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final LuggageItemDTO getLuggage() {
                    return this.luggage;
                }

                /* renamed from: component3, reason: from getter */
                public final LuggageItemDTO getExtraLuggage() {
                    return this.extraLuggage;
                }

                @NotNull
                /* renamed from: component4, reason: from getter */
                public final IconButtonV3DTO getButton() {
                    return this.button;
                }

                @NotNull
                /* renamed from: component5, reason: from getter */
                public final TextDTO getTitle() {
                    return this.title;
                }

                @NotNull
                public final LuggageBlockDTO copy(@NotNull LuggageItemDTO handCarry, @NotNull LuggageItemDTO luggage, LuggageItemDTO extraLuggage, @NotNull IconButtonV3DTO button, @NotNull TextDTO title) {
                    Intrinsics.checkNotNullParameter(handCarry, "handCarry");
                    Intrinsics.checkNotNullParameter(luggage, "luggage");
                    Intrinsics.checkNotNullParameter(button, "button");
                    Intrinsics.checkNotNullParameter(title, "title");
                    return new LuggageBlockDTO(handCarry, luggage, extraLuggage, button, title);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof LuggageBlockDTO)) {
                        return false;
                    }
                    LuggageBlockDTO luggageBlockDTO = (LuggageBlockDTO) other;
                    return Intrinsics.d(this.handCarry, luggageBlockDTO.handCarry) && Intrinsics.d(this.luggage, luggageBlockDTO.luggage) && Intrinsics.d(this.extraLuggage, luggageBlockDTO.extraLuggage) && Intrinsics.d(this.button, luggageBlockDTO.button) && Intrinsics.d(this.title, luggageBlockDTO.title);
                }

                @NotNull
                public final IconButtonV3DTO getButton() {
                    return this.button;
                }

                public final LuggageItemDTO getExtraLuggage() {
                    return this.extraLuggage;
                }

                @NotNull
                public final LuggageItemDTO getHandCarry() {
                    return this.handCarry;
                }

                @NotNull
                public final LuggageItemDTO getLuggage() {
                    return this.luggage;
                }

                @NotNull
                public final TextDTO getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    int hashCode = (this.luggage.hashCode() + (this.handCarry.hashCode() * 31)) * 31;
                    LuggageItemDTO luggageItemDTO = this.extraLuggage;
                    return this.title.hashCode() + b.c(this.button, (hashCode + (luggageItemDTO == null ? 0 : luggageItemDTO.hashCode())) * 31, 31);
                }

                @NotNull
                public String toString() {
                    LuggageItemDTO luggageItemDTO = this.handCarry;
                    LuggageItemDTO luggageItemDTO2 = this.luggage;
                    LuggageItemDTO luggageItemDTO3 = this.extraLuggage;
                    IconButtonV3DTO iconButtonV3DTO = this.button;
                    TextDTO textDTO = this.title;
                    StringBuilder sb2 = new StringBuilder("LuggageBlockDTO(handCarry=");
                    sb2.append(luggageItemDTO);
                    sb2.append(", luggage=");
                    sb2.append(luggageItemDTO2);
                    sb2.append(", extraLuggage=");
                    sb2.append(luggageItemDTO3);
                    sb2.append(", button=");
                    sb2.append(iconButtonV3DTO);
                    sb2.append(", title=");
                    return Tl.b.e(sb2, textDTO, ")");
                }
            }

            public SegmentPartDTO(BadgeDTO badgeDTO, @NotNull CellDTO airlineCell, @NotNull TripLegV3DTO tripLeg, @NotNull LuggageBlockDTO luggageBlock, CellDTO cellDTO) {
                Intrinsics.checkNotNullParameter(airlineCell, "airlineCell");
                Intrinsics.checkNotNullParameter(tripLeg, "tripLeg");
                Intrinsics.checkNotNullParameter(luggageBlock, "luggageBlock");
                this.badge = badgeDTO;
                this.airlineCell = airlineCell;
                this.tripLeg = tripLeg;
                this.luggageBlock = luggageBlock;
                this.transferCell = cellDTO;
            }

            public static /* synthetic */ SegmentPartDTO copy$default(SegmentPartDTO segmentPartDTO, BadgeDTO badgeDTO, CellDTO cellDTO, TripLegV3DTO tripLegV3DTO, LuggageBlockDTO luggageBlockDTO, CellDTO cellDTO2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    badgeDTO = segmentPartDTO.badge;
                }
                if ((i11 & 2) != 0) {
                    cellDTO = segmentPartDTO.airlineCell;
                }
                if ((i11 & 4) != 0) {
                    tripLegV3DTO = segmentPartDTO.tripLeg;
                }
                if ((i11 & 8) != 0) {
                    luggageBlockDTO = segmentPartDTO.luggageBlock;
                }
                if ((i11 & 16) != 0) {
                    cellDTO2 = segmentPartDTO.transferCell;
                }
                CellDTO cellDTO3 = cellDTO2;
                TripLegV3DTO tripLegV3DTO2 = tripLegV3DTO;
                return segmentPartDTO.copy(badgeDTO, cellDTO, tripLegV3DTO2, luggageBlockDTO, cellDTO3);
            }

            /* renamed from: component1, reason: from getter */
            public final BadgeDTO getBadge() {
                return this.badge;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final CellDTO getAirlineCell() {
                return this.airlineCell;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final TripLegV3DTO getTripLeg() {
                return this.tripLeg;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final LuggageBlockDTO getLuggageBlock() {
                return this.luggageBlock;
            }

            /* renamed from: component5, reason: from getter */
            public final CellDTO getTransferCell() {
                return this.transferCell;
            }

            @NotNull
            public final SegmentPartDTO copy(BadgeDTO badge, @NotNull CellDTO airlineCell, @NotNull TripLegV3DTO tripLeg, @NotNull LuggageBlockDTO luggageBlock, CellDTO transferCell) {
                Intrinsics.checkNotNullParameter(airlineCell, "airlineCell");
                Intrinsics.checkNotNullParameter(tripLeg, "tripLeg");
                Intrinsics.checkNotNullParameter(luggageBlock, "luggageBlock");
                return new SegmentPartDTO(badge, airlineCell, tripLeg, luggageBlock, transferCell);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SegmentPartDTO)) {
                    return false;
                }
                SegmentPartDTO segmentPartDTO = (SegmentPartDTO) other;
                return Intrinsics.d(this.badge, segmentPartDTO.badge) && Intrinsics.d(this.airlineCell, segmentPartDTO.airlineCell) && Intrinsics.d(this.tripLeg, segmentPartDTO.tripLeg) && Intrinsics.d(this.luggageBlock, segmentPartDTO.luggageBlock) && Intrinsics.d(this.transferCell, segmentPartDTO.transferCell);
            }

            @NotNull
            public final CellDTO getAirlineCell() {
                return this.airlineCell;
            }

            public final BadgeDTO getBadge() {
                return this.badge;
            }

            @NotNull
            public final LuggageBlockDTO getLuggageBlock() {
                return this.luggageBlock;
            }

            public final CellDTO getTransferCell() {
                return this.transferCell;
            }

            @NotNull
            public final TripLegV3DTO getTripLeg() {
                return this.tripLeg;
            }

            public int hashCode() {
                BadgeDTO badgeDTO = this.badge;
                int hashCode = (this.luggageBlock.hashCode() + ((this.tripLeg.hashCode() + Bi.b.c(this.airlineCell, (badgeDTO == null ? 0 : badgeDTO.hashCode()) * 31, 31)) * 31)) * 31;
                CellDTO cellDTO = this.transferCell;
                return hashCode + (cellDTO != null ? cellDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "SegmentPartDTO(badge=" + this.badge + ", airlineCell=" + this.airlineCell + ", tripLeg=" + this.tripLeg + ", luggageBlock=" + this.luggageBlock + ", transferCell=" + this.transferCell + ")";
            }
        }

        public SegmentDTO(TextDTO textDTO, TextDTO textDTO2, @NotNull List<SegmentPartDTO> segmentParts, TextDTO textDTO3) {
            Intrinsics.checkNotNullParameter(segmentParts, "segmentParts");
            this.title = textDTO;
            this.subtitle = textDTO2;
            this.segmentParts = segmentParts;
            this.info = textDTO3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SegmentDTO copy$default(SegmentDTO segmentDTO, TextDTO textDTO, TextDTO textDTO2, List list, TextDTO textDTO3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = segmentDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = segmentDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                list = segmentDTO.segmentParts;
            }
            if ((i11 & 8) != 0) {
                textDTO3 = segmentDTO.info;
            }
            return segmentDTO.copy(textDTO, textDTO2, list, textDTO3);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final List<SegmentPartDTO> component3() {
            return this.segmentParts;
        }

        /* renamed from: component4, reason: from getter */
        public final TextDTO getInfo() {
            return this.info;
        }

        @NotNull
        public final SegmentDTO copy(TextDTO title, TextDTO subtitle, @NotNull List<SegmentPartDTO> segmentParts, TextDTO info) {
            Intrinsics.checkNotNullParameter(segmentParts, "segmentParts");
            return new SegmentDTO(title, subtitle, segmentParts, info);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SegmentDTO)) {
                return false;
            }
            SegmentDTO segmentDTO = (SegmentDTO) other;
            return Intrinsics.d(this.title, segmentDTO.title) && Intrinsics.d(this.subtitle, segmentDTO.subtitle) && Intrinsics.d(this.segmentParts, segmentDTO.segmentParts) && Intrinsics.d(this.info, segmentDTO.info);
        }

        public final TextDTO getInfo() {
            return this.info;
        }

        @NotNull
        public final List<SegmentPartDTO> getSegmentParts() {
            return this.segmentParts;
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
            int b11 = g.b((hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31, 31, this.segmentParts);
            TextDTO textDTO3 = this.info;
            return b11 + (textDTO3 != null ? textDTO3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            List<SegmentPartDTO> list = this.segmentParts;
            TextDTO textDTO3 = this.info;
            StringBuilder g10 = D3.g.g("SegmentDTO(title=", textDTO, ", subtitle=", textDTO2, ", segmentParts=");
            g10.append(list);
            g10.append(", info=");
            g10.append(textDTO3);
            g10.append(")");
            return g10.toString();
        }
    }

    public FlightOrderDetailsV4DTO(@NotNull List<SegmentDTO> segments, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.segments = segments;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlightOrderDetailsV4DTO copy$default(FlightOrderDetailsV4DTO flightOrderDetailsV4DTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = flightOrderDetailsV4DTO.segments;
        }
        if ((i11 & 2) != 0) {
            map = flightOrderDetailsV4DTO.trackingInfo;
        }
        return flightOrderDetailsV4DTO.copy(list, map);
    }

    @NotNull
    public final List<SegmentDTO> component1() {
        return this.segments;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final FlightOrderDetailsV4DTO copy(@NotNull List<SegmentDTO> segments, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        return new FlightOrderDetailsV4DTO(segments, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightOrderDetailsV4DTO)) {
            return false;
        }
        FlightOrderDetailsV4DTO flightOrderDetailsV4DTO = (FlightOrderDetailsV4DTO) other;
        return Intrinsics.d(this.segments, flightOrderDetailsV4DTO.segments) && Intrinsics.d(this.trackingInfo, flightOrderDetailsV4DTO.trackingInfo);
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
        return c.d("FlightOrderDetailsV4DTO(segments=", ", trackingInfo=", ")", this.segments, this.trackingInfo);
    }
}
