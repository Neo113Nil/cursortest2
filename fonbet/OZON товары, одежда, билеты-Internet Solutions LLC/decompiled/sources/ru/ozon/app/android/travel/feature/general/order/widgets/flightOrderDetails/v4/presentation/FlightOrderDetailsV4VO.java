package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.presentation;

import G.g;
import Ns.b;
import TY.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.tripLeg.v3.TripLegV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001)BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b%\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO;", "segmentParts", "info", "LWZ/t;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Ljava/util/List;", "getSegmentParts", "()Ljava/util/List;", "getInfo", "LWZ/t;", "getViewEvent", "()LWZ/t;", "SegmentPartVO", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FlightOrderDetailsV4VO implements c {
    private final long id;
    private final TextDTO info;

    @NotNull
    private final List<SegmentPartVO> segmentParts;
    private final TextDTO subtitle;
    private final TextDTO title;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO;", "", "", "id", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO;", "flightSegment", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "transferCell", "<init>", "(ILru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO;", "getFlightSegment", "()Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getTransferCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "FlightSegmentVO", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SegmentPartVO {

        @NotNull
        private final FlightSegmentVO flightSegment;
        private final int id;
        private final CellDTO transferCell;

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO;", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "airlineCell", "Lru/ozon/app/android/travel/molecules/dto/tripLeg/v3/TripLegV3DTO;", "tripLeg", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO$LuggageBlockVO;", "luggageBlock", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/travel/molecules/dto/tripLeg/v3/TripLegV3DTO;Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO$LuggageBlockVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getAirlineCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/travel/molecules/dto/tripLeg/v3/TripLegV3DTO;", "getTripLeg", "()Lru/ozon/app/android/travel/molecules/dto/tripLeg/v3/TripLegV3DTO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO$LuggageBlockVO;", "getLuggageBlock", "()Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO$LuggageBlockVO;", "LuggageBlockVO", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FlightSegmentVO {

            @NotNull
            private final CellDTO airlineCell;
            private final BadgeDTO badge;

            @NotNull
            private final LuggageBlockVO luggageBlock;

            @NotNull
            private final TripLegV3DTO tripLeg;

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b\u000b\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO$LuggageBlockVO;", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO$LuggageBlockVO$LuggageItemVO;", "handCarry", "luggage", "extraLuggage", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "button", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "isExpanded", "<init>", "(Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO$LuggageBlockVO$LuggageItemVO;Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO$LuggageBlockVO$LuggageItemVO;Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO$LuggageBlockVO$LuggageItemVO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO$LuggageBlockVO$LuggageItemVO;", "getHandCarry", "()Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO$LuggageBlockVO$LuggageItemVO;", "getLuggage", "getExtraLuggage", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Z", "()Z", "LuggageItemVO", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class LuggageBlockVO {
                public static final int $stable;

                @NotNull
                private final IconButtonV3DTO button;
                private final LuggageItemVO extraLuggage;

                @NotNull
                private final LuggageItemVO handCarry;
                private final boolean isExpanded;

                @NotNull
                private final LuggageItemVO luggage;

                @NotNull
                private final TextDTO title;

                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO$LuggageBlockVO$LuggageItemVO;", "", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class LuggageItemVO {
                    public static final int $stable = CommonAtomIconDTO.$stable;

                    @NotNull
                    private final CommonAtomIconDTO icon;

                    @NotNull
                    private final TextDTO title;

                    public LuggageItemVO(@NotNull CommonAtomIconDTO icon, @NotNull TextDTO title) {
                        Intrinsics.checkNotNullParameter(icon, "icon");
                        Intrinsics.checkNotNullParameter(title, "title");
                        this.icon = icon;
                        this.title = title;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof LuggageItemVO)) {
                            return false;
                        }
                        LuggageItemVO luggageItemVO = (LuggageItemVO) other;
                        return Intrinsics.d(this.icon, luggageItemVO.icon) && Intrinsics.d(this.title, luggageItemVO.title);
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
                        return "LuggageItemVO(icon=" + this.icon + ", title=" + this.title + ")";
                    }
                }

                static {
                    int i11 = IconButtonV3DTO.$stable;
                    int i12 = CommonAtomIconDTO.$stable;
                    $stable = i11 | i12 | i12 | i12;
                }

                public LuggageBlockVO(@NotNull LuggageItemVO handCarry, @NotNull LuggageItemVO luggage, LuggageItemVO luggageItemVO, @NotNull IconButtonV3DTO button, @NotNull TextDTO title, boolean z11) {
                    Intrinsics.checkNotNullParameter(handCarry, "handCarry");
                    Intrinsics.checkNotNullParameter(luggage, "luggage");
                    Intrinsics.checkNotNullParameter(button, "button");
                    Intrinsics.checkNotNullParameter(title, "title");
                    this.handCarry = handCarry;
                    this.luggage = luggage;
                    this.extraLuggage = luggageItemVO;
                    this.button = button;
                    this.title = title;
                    this.isExpanded = z11;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof LuggageBlockVO)) {
                        return false;
                    }
                    LuggageBlockVO luggageBlockVO = (LuggageBlockVO) other;
                    return Intrinsics.d(this.handCarry, luggageBlockVO.handCarry) && Intrinsics.d(this.luggage, luggageBlockVO.luggage) && Intrinsics.d(this.extraLuggage, luggageBlockVO.extraLuggage) && Intrinsics.d(this.button, luggageBlockVO.button) && Intrinsics.d(this.title, luggageBlockVO.title) && this.isExpanded == luggageBlockVO.isExpanded;
                }

                @NotNull
                public final IconButtonV3DTO getButton() {
                    return this.button;
                }

                public final LuggageItemVO getExtraLuggage() {
                    return this.extraLuggage;
                }

                @NotNull
                public final LuggageItemVO getHandCarry() {
                    return this.handCarry;
                }

                @NotNull
                public final LuggageItemVO getLuggage() {
                    return this.luggage;
                }

                @NotNull
                public final TextDTO getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    int hashCode = (this.luggage.hashCode() + (this.handCarry.hashCode() * 31)) * 31;
                    LuggageItemVO luggageItemVO = this.extraLuggage;
                    return Boolean.hashCode(this.isExpanded) + b.a(this.title, GR.b.c(this.button, (hashCode + (luggageItemVO == null ? 0 : luggageItemVO.hashCode())) * 31, 31), 31);
                }

                /* renamed from: isExpanded, reason: from getter */
                public final boolean getIsExpanded() {
                    return this.isExpanded;
                }

                @NotNull
                public String toString() {
                    return "LuggageBlockVO(handCarry=" + this.handCarry + ", luggage=" + this.luggage + ", extraLuggage=" + this.extraLuggage + ", button=" + this.button + ", title=" + this.title + ", isExpanded=" + this.isExpanded + ")";
                }
            }

            public FlightSegmentVO(BadgeDTO badgeDTO, @NotNull CellDTO airlineCell, @NotNull TripLegV3DTO tripLeg, @NotNull LuggageBlockVO luggageBlock) {
                Intrinsics.checkNotNullParameter(airlineCell, "airlineCell");
                Intrinsics.checkNotNullParameter(tripLeg, "tripLeg");
                Intrinsics.checkNotNullParameter(luggageBlock, "luggageBlock");
                this.badge = badgeDTO;
                this.airlineCell = airlineCell;
                this.tripLeg = tripLeg;
                this.luggageBlock = luggageBlock;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FlightSegmentVO)) {
                    return false;
                }
                FlightSegmentVO flightSegmentVO = (FlightSegmentVO) other;
                return Intrinsics.d(this.badge, flightSegmentVO.badge) && Intrinsics.d(this.airlineCell, flightSegmentVO.airlineCell) && Intrinsics.d(this.tripLeg, flightSegmentVO.tripLeg) && Intrinsics.d(this.luggageBlock, flightSegmentVO.luggageBlock);
            }

            @NotNull
            public final CellDTO getAirlineCell() {
                return this.airlineCell;
            }

            public final BadgeDTO getBadge() {
                return this.badge;
            }

            @NotNull
            public final LuggageBlockVO getLuggageBlock() {
                return this.luggageBlock;
            }

            @NotNull
            public final TripLegV3DTO getTripLeg() {
                return this.tripLeg;
            }

            public int hashCode() {
                BadgeDTO badgeDTO = this.badge;
                return this.luggageBlock.hashCode() + ((this.tripLeg.hashCode() + Bi.b.c(this.airlineCell, (badgeDTO == null ? 0 : badgeDTO.hashCode()) * 31, 31)) * 31);
            }

            @NotNull
            public String toString() {
                return "FlightSegmentVO(badge=" + this.badge + ", airlineCell=" + this.airlineCell + ", tripLeg=" + this.tripLeg + ", luggageBlock=" + this.luggageBlock + ")";
            }
        }

        public SegmentPartVO(int i11, @NotNull FlightSegmentVO flightSegment, CellDTO cellDTO) {
            Intrinsics.checkNotNullParameter(flightSegment, "flightSegment");
            this.id = i11;
            this.flightSegment = flightSegment;
            this.transferCell = cellDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SegmentPartVO)) {
                return false;
            }
            SegmentPartVO segmentPartVO = (SegmentPartVO) other;
            return this.id == segmentPartVO.id && Intrinsics.d(this.flightSegment, segmentPartVO.flightSegment) && Intrinsics.d(this.transferCell, segmentPartVO.transferCell);
        }

        @NotNull
        public final FlightSegmentVO getFlightSegment() {
            return this.flightSegment;
        }

        public final int getId() {
            return this.id;
        }

        public final CellDTO getTransferCell() {
            return this.transferCell;
        }

        public int hashCode() {
            int hashCode = (this.flightSegment.hashCode() + (Integer.hashCode(this.id) * 31)) * 31;
            CellDTO cellDTO = this.transferCell;
            return hashCode + (cellDTO == null ? 0 : cellDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "SegmentPartVO(id=" + this.id + ", flightSegment=" + this.flightSegment + ", transferCell=" + this.transferCell + ")";
        }
    }

    public FlightOrderDetailsV4VO(long j11, TextDTO textDTO, TextDTO textDTO2, @NotNull List<SegmentPartVO> segmentParts, TextDTO textDTO3, t tVar) {
        Intrinsics.checkNotNullParameter(segmentParts, "segmentParts");
        this.id = j11;
        this.title = textDTO;
        this.subtitle = textDTO2;
        this.segmentParts = segmentParts;
        this.info = textDTO3;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightOrderDetailsV4VO)) {
            return false;
        }
        FlightOrderDetailsV4VO flightOrderDetailsV4VO = (FlightOrderDetailsV4VO) other;
        return this.id == flightOrderDetailsV4VO.id && Intrinsics.d(this.title, flightOrderDetailsV4VO.title) && Intrinsics.d(this.subtitle, flightOrderDetailsV4VO.subtitle) && Intrinsics.d(this.segmentParts, flightOrderDetailsV4VO.segmentParts) && Intrinsics.d(this.info, flightOrderDetailsV4VO.info) && Intrinsics.d(this.viewEvent, flightOrderDetailsV4VO.viewEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final TextDTO getInfo() {
        return this.info;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<SegmentPartVO> getSegmentParts() {
        return this.segmentParts;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextDTO textDTO = this.title;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.subtitle;
        int b11 = g.b((hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31, 31, this.segmentParts);
        TextDTO textDTO3 = this.info;
        int hashCode3 = (b11 + (textDTO3 == null ? 0 : textDTO3.hashCode())) * 31;
        t tVar = this.viewEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        List<SegmentPartVO> list = this.segmentParts;
        TextDTO textDTO3 = this.info;
        t tVar = this.viewEvent;
        StringBuilder b11 = a.b("FlightOrderDetailsV4VO(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", segmentParts=");
        b11.append(list);
        b11.append(", info=");
        b11.append(textDTO3);
        b11.append(", viewEvent=");
        b11.append(tVar);
        b11.append(")");
        return b11.toString();
    }
}
