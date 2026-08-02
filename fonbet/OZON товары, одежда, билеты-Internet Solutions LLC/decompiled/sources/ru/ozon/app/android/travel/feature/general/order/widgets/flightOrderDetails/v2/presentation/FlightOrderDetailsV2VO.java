package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation;

import B90.C2619v;
import Bl.C2639a;
import Bl.b;
import G.g;
import WZ.t;
import ed.InterfaceC6346b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.travel.molecules.view.tripLeg.v1.TripLegVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001+BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\"\u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010\u0016¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment;", "segments", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "", "horizontalOffset", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;LWZ/t;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Ljava/util/List;", "getSegments", "()Ljava/util/List;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "I", "getHorizontalOffset", "Segment", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FlightOrderDetailsV2VO implements c {
    private final int horizontalOffset;
    private final long id;

    @NotNull
    private final List<Segment> segments;

    @NotNull
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment;", "", "DashedSeparator", "AirlineInfo", "Transfer", "TripLeg", "AdditionalInfo", "BookingInfo", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment$AdditionalInfo;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment$AirlineInfo;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment$BookingInfo;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment$DashedSeparator;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment$Transfer;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment$TripLeg;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Segment {

        @InterfaceC6346b
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment$AdditionalInfo;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "additionalInfo", "constructor-impl", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)Lru/ozon/uni/atoms/data/texts/TextAtom;", "", "toString-impl", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)I", "hashCode", "", "other", "", "equals-impl", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Object;)Z", "equals", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAdditionalInfo", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AdditionalInfo implements Segment {

            @NotNull
            private final TextAtom additionalInfo;

            private /* synthetic */ AdditionalInfo(TextAtom textAtom) {
                this.additionalInfo = textAtom;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ AdditionalInfo m1288boximpl(TextAtom textAtom) {
                return new AdditionalInfo(textAtom);
            }

            @NotNull
            /* renamed from: constructor-impl, reason: not valid java name */
            public static TextAtom m1289constructorimpl(@NotNull TextAtom additionalInfo) {
                Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
                return additionalInfo;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m1290equalsimpl(TextAtom textAtom, Object obj) {
                return (obj instanceof AdditionalInfo) && Intrinsics.d(textAtom, ((AdditionalInfo) obj).getAdditionalInfo());
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m1291hashCodeimpl(TextAtom textAtom) {
                return textAtom.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m1292toStringimpl(TextAtom textAtom) {
                return "AdditionalInfo(additionalInfo=" + textAtom + ")";
            }

            public boolean equals(Object obj) {
                return m1290equalsimpl(this.additionalInfo, obj);
            }

            public int hashCode() {
                return m1291hashCodeimpl(this.additionalInfo);
            }

            public String toString() {
                return m1292toStringimpl(this.additionalInfo);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ TextAtom getAdditionalInfo() {
                return this.additionalInfo;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment$AirlineInfo;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "imageLink", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "smallButton", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/lang/String;", "getImageLink", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getSmallButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AirlineInfo implements Segment {
            public static final int $stable = ButtonV3Atom.SmallBorderlessButton.$stable | TextAtom.$stable;

            @NotNull
            private final String imageLink;

            @NotNull
            private final ButtonV3Atom.SmallBorderlessButton smallButton;

            @NotNull
            private final TextAtom title;

            public AirlineInfo(@NotNull TextAtom title, @NotNull String imageLink, @NotNull ButtonV3Atom.SmallBorderlessButton smallButton) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(imageLink, "imageLink");
                Intrinsics.checkNotNullParameter(smallButton, "smallButton");
                this.title = title;
                this.imageLink = imageLink;
                this.smallButton = smallButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AirlineInfo)) {
                    return false;
                }
                AirlineInfo airlineInfo = (AirlineInfo) other;
                return Intrinsics.d(this.title, airlineInfo.title) && Intrinsics.d(this.imageLink, airlineInfo.imageLink) && Intrinsics.d(this.smallButton, airlineInfo.smallButton);
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

            public int hashCode() {
                return this.smallButton.hashCode() + g.a(this.title.hashCode() * 31, 31, this.imageLink);
            }

            @NotNull
            public String toString() {
                TextAtom textAtom = this.title;
                String str = this.imageLink;
                ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.smallButton;
                StringBuilder d11 = b.d("AirlineInfo(title=", ", imageLink=", str, ", smallButton=", textAtom);
                d11.append(smallBorderlessButton);
                d11.append(")");
                return d11.toString();
            }
        }

        @InterfaceC6346b
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment$BookingInfo;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "bookingInfo", "constructor-impl", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "", "toString-impl", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)I", "hashCode", "", "other", "", "equals-impl", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/Object;)Z", "equals", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getBookingInfo", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class BookingInfo implements Segment {

            @NotNull
            private final CellDTO bookingInfo;

            private /* synthetic */ BookingInfo(CellDTO cellDTO) {
                this.bookingInfo = cellDTO;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ BookingInfo m1294boximpl(CellDTO cellDTO) {
                return new BookingInfo(cellDTO);
            }

            @NotNull
            /* renamed from: constructor-impl, reason: not valid java name */
            public static CellDTO m1295constructorimpl(@NotNull CellDTO bookingInfo) {
                Intrinsics.checkNotNullParameter(bookingInfo, "bookingInfo");
                return bookingInfo;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m1296equalsimpl(CellDTO cellDTO, Object obj) {
                return (obj instanceof BookingInfo) && Intrinsics.d(cellDTO, ((BookingInfo) obj).getBookingInfo());
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m1297hashCodeimpl(CellDTO cellDTO) {
                return cellDTO.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m1298toStringimpl(CellDTO cellDTO) {
                return "BookingInfo(bookingInfo=" + cellDTO + ")";
            }

            public boolean equals(Object obj) {
                return m1296equalsimpl(this.bookingInfo, obj);
            }

            public int hashCode() {
                return m1297hashCodeimpl(this.bookingInfo);
            }

            public String toString() {
                return m1298toStringimpl(this.bookingInfo);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ CellDTO getBookingInfo() {
                return this.bookingInfo;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment$DashedSeparator;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DashedSeparator implements Segment {

            @NotNull
            public static final DashedSeparator INSTANCE = new DashedSeparator();

            private DashedSeparator() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof DashedSeparator);
            }

            public int hashCode() {
                return 1028471396;
            }

            @NotNull
            public String toString() {
                return "DashedSeparator";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment$Transfer;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCounter;", "transfer", "", "transferCellBackgroundColor", "<init>", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCounter;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCounter;", "getTransfer", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCounter;", "Ljava/lang/String;", "getTransferCellBackgroundColor", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Transfer implements Segment {

            @NotNull
            private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter transfer;
            private final String transferCellBackgroundColor;

            public Transfer(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter transfer, String str) {
                Intrinsics.checkNotNullParameter(transfer, "transfer");
                this.transfer = transfer;
                this.transferCellBackgroundColor = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Transfer)) {
                    return false;
                }
                Transfer transfer = (Transfer) other;
                return Intrinsics.d(this.transfer, transfer.transfer) && Intrinsics.d(this.transferCellBackgroundColor, transfer.transferCellBackgroundColor);
            }

            @NotNull
            public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter getTransfer() {
                return this.transfer;
            }

            public final String getTransferCellBackgroundColor() {
                return this.transferCellBackgroundColor;
            }

            public int hashCode() {
                int hashCode = this.transfer.hashCode() * 31;
                String str = this.transferCellBackgroundColor;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return "Transfer(transfer=" + this.transfer + ", transferCellBackgroundColor=" + this.transferCellBackgroundColor + ")";
            }
        }

        @InterfaceC6346b
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment$TripLeg;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment;", "Lru/ozon/app/android/travel/molecules/view/tripLeg/v1/TripLegVO;", "tripLeg", "constructor-impl", "(Lru/ozon/app/android/travel/molecules/view/tripLeg/v1/TripLegVO;)Lru/ozon/app/android/travel/molecules/view/tripLeg/v1/TripLegVO;", "", "toString-impl", "(Lru/ozon/app/android/travel/molecules/view/tripLeg/v1/TripLegVO;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lru/ozon/app/android/travel/molecules/view/tripLeg/v1/TripLegVO;)I", "hashCode", "", "other", "", "equals-impl", "(Lru/ozon/app/android/travel/molecules/view/tripLeg/v1/TripLegVO;Ljava/lang/Object;)Z", "equals", "Lru/ozon/app/android/travel/molecules/view/tripLeg/v1/TripLegVO;", "getTripLeg", "()Lru/ozon/app/android/travel/molecules/view/tripLeg/v1/TripLegVO;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class TripLeg implements Segment {

            @NotNull
            private final TripLegVO tripLeg;

            private /* synthetic */ TripLeg(TripLegVO tripLegVO) {
                this.tripLeg = tripLegVO;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ TripLeg m1300boximpl(TripLegVO tripLegVO) {
                return new TripLeg(tripLegVO);
            }

            @NotNull
            /* renamed from: constructor-impl, reason: not valid java name */
            public static TripLegVO m1301constructorimpl(@NotNull TripLegVO tripLeg) {
                Intrinsics.checkNotNullParameter(tripLeg, "tripLeg");
                return tripLeg;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m1302equalsimpl(TripLegVO tripLegVO, Object obj) {
                return (obj instanceof TripLeg) && Intrinsics.d(tripLegVO, ((TripLeg) obj).getTripLeg());
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m1303hashCodeimpl(TripLegVO tripLegVO) {
                return tripLegVO.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m1304toStringimpl(TripLegVO tripLegVO) {
                return "TripLeg(tripLeg=" + tripLegVO + ")";
            }

            public boolean equals(Object obj) {
                return m1302equalsimpl(this.tripLeg, obj);
            }

            public int hashCode() {
                return m1303hashCodeimpl(this.tripLeg);
            }

            public String toString() {
                return m1304toStringimpl(this.tripLeg);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ TripLegVO getTripLeg() {
                return this.tripLeg;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlightOrderDetailsV2VO(long j11, @NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull List<? extends Segment> segments, t tVar, int i11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.id = j11;
        this.title = title;
        this.subtitle = subtitle;
        this.segments = segments;
        this.viewEvent = tVar;
        this.horizontalOffset = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightOrderDetailsV2VO)) {
            return false;
        }
        FlightOrderDetailsV2VO flightOrderDetailsV2VO = (FlightOrderDetailsV2VO) other;
        return this.id == flightOrderDetailsV2VO.id && Intrinsics.d(this.title, flightOrderDetailsV2VO.title) && Intrinsics.d(this.subtitle, flightOrderDetailsV2VO.subtitle) && Intrinsics.d(this.segments, flightOrderDetailsV2VO.segments) && Intrinsics.d(this.viewEvent, flightOrderDetailsV2VO.viewEvent) && this.horizontalOffset == flightOrderDetailsV2VO.horizontalOffset;
    }

    public final int getHorizontalOffset() {
        return this.horizontalOffset;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<Segment> getSegments() {
        return this.segments;
    }

    @NotNull
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
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
        int b11 = g.b(C2619v.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.subtitle), 31, this.segments);
        t tVar = this.viewEvent;
        return Integer.hashCode(this.horizontalOffset) + ((b11 + (tVar == null ? 0 : tVar.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        List<Segment> list = this.segments;
        t tVar = this.viewEvent;
        int i11 = this.horizontalOffset;
        StringBuilder c11 = C2639a.c("FlightOrderDetailsV2VO(id=", j11, ", title=", textAtom);
        c11.append(", subtitle=");
        c11.append(textAtom2);
        c11.append(", segments=");
        c11.append(list);
        c11.append(", viewEvent=");
        c11.append(tVar);
        c11.append(", horizontalOffset=");
        c11.append(i11);
        c11.append(")");
        return c11.toString();
    }
}
