package ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.data;

import B4.V;
import B90.C2616s;
import D40.a;
import D40.d;
import F3.G;
import Fm.C3051a;
import G.g;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.themeImage.v1.ThemeImageV1DTO;
import ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001:B\u0087\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0012\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0012HÆ\u0003J\u0017\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012HÆ\u0003J\u009d\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&¨\u0006;"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/data/HotTicketsDTO;", "Lru/ozon/app/android/travel/utils/listtracking/TrackingInfoHolder;", "titleImage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "tickets", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/data/HotTicketsDTO$TicketDTO;", "backgroundImage", "Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;", "image", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "widgetBorderColor", "", "ticketBorderColor", "asyncParams", "", "trackingInfo", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "getTitleImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTickets", "()Ljava/util/List;", "getBackgroundImage", "()Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;", "getImage", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getWidgetBorderColor", "()Ljava/lang/String;", "getTicketBorderColor", "getAsyncParams", "()Ljava/util/Map;", "getTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TicketDTO", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotTicketsDTO implements TrackingInfoHolder {
    public static final int $stable = 8;
    private final Map<String, String> asyncParams;
    private final ThemeImageV1DTO backgroundImage;
    private final ButtonV3DTO button;
    private final ThemeImageV1DTO image;
    private final String ticketBorderColor;
    private final List<TicketDTO> tickets;

    @NotNull
    private final TextDTO title;
    private final ImageDTO titleImage;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final String widgetBorderColor;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0017\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0003J\u0089\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006:"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/data/HotTicketsDTO$TicketDTO;", "", "dateBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "airlineIcons", "", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "destination", "Lru/ozon/uni/atoms/data/text/TextDTO;", "tripDuration", "tripTime", "transferText", "transferIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "cardClickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getDateBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getAirlineIcons", "()Ljava/util/List;", "getDestination", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTripDuration", "getTripTime", "getTransferText", "getTransferIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getCardClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TicketDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<ImageDTO> airlineIcons;
        private final AtomActionDTO cardClickAction;

        @NotNull
        private final BadgeDTO dateBadge;

        @NotNull
        private final TextDTO destination;

        @NotNull
        private final PriceDTO price;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final IconDTO transferIcon;
        private final TextDTO transferText;

        @NotNull
        private final TextDTO tripDuration;
        private final TextDTO tripTime;

        public TicketDTO(@NotNull BadgeDTO dateBadge, @NotNull PriceDTO price, @NotNull List<ImageDTO> airlineIcons, @NotNull TextDTO destination, @NotNull TextDTO tripDuration, TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(dateBadge, "dateBadge");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(airlineIcons, "airlineIcons");
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intrinsics.checkNotNullParameter(tripDuration, "tripDuration");
            this.dateBadge = dateBadge;
            this.price = price;
            this.airlineIcons = airlineIcons;
            this.destination = destination;
            this.tripDuration = tripDuration;
            this.tripTime = textDTO;
            this.transferText = textDTO2;
            this.transferIcon = iconDTO;
            this.cardClickAction = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ TicketDTO copy$default(TicketDTO ticketDTO, BadgeDTO badgeDTO, PriceDTO priceDTO, List list, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, TextDTO textDTO4, IconDTO iconDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                badgeDTO = ticketDTO.dateBadge;
            }
            if ((i11 & 2) != 0) {
                priceDTO = ticketDTO.price;
            }
            if ((i11 & 4) != 0) {
                list = ticketDTO.airlineIcons;
            }
            if ((i11 & 8) != 0) {
                textDTO = ticketDTO.destination;
            }
            if ((i11 & 16) != 0) {
                textDTO2 = ticketDTO.tripDuration;
            }
            if ((i11 & 32) != 0) {
                textDTO3 = ticketDTO.tripTime;
            }
            if ((i11 & 64) != 0) {
                textDTO4 = ticketDTO.transferText;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                iconDTO = ticketDTO.transferIcon;
            }
            if ((i11 & 256) != 0) {
                atomActionDTO = ticketDTO.cardClickAction;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                map = ticketDTO.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            TextDTO textDTO5 = textDTO4;
            IconDTO iconDTO2 = iconDTO;
            TextDTO textDTO6 = textDTO2;
            TextDTO textDTO7 = textDTO3;
            return ticketDTO.copy(badgeDTO, priceDTO, list, textDTO, textDTO6, textDTO7, textDTO5, iconDTO2, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final BadgeDTO getDateBadge() {
            return this.dateBadge;
        }

        public final Map<String, TokenizedTrackingInfo> component10() {
            return this.trackingInfo;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        @NotNull
        public final List<ImageDTO> component3() {
            return this.airlineIcons;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TextDTO getDestination() {
            return this.destination;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final TextDTO getTripDuration() {
            return this.tripDuration;
        }

        /* renamed from: component6, reason: from getter */
        public final TextDTO getTripTime() {
            return this.tripTime;
        }

        /* renamed from: component7, reason: from getter */
        public final TextDTO getTransferText() {
            return this.transferText;
        }

        /* renamed from: component8, reason: from getter */
        public final IconDTO getTransferIcon() {
            return this.transferIcon;
        }

        /* renamed from: component9, reason: from getter */
        public final AtomActionDTO getCardClickAction() {
            return this.cardClickAction;
        }

        @NotNull
        public final TicketDTO copy(@NotNull BadgeDTO dateBadge, @NotNull PriceDTO price, @NotNull List<ImageDTO> airlineIcons, @NotNull TextDTO destination, @NotNull TextDTO tripDuration, TextDTO tripTime, TextDTO transferText, IconDTO transferIcon, AtomActionDTO cardClickAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(dateBadge, "dateBadge");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(airlineIcons, "airlineIcons");
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intrinsics.checkNotNullParameter(tripDuration, "tripDuration");
            return new TicketDTO(dateBadge, price, airlineIcons, destination, tripDuration, tripTime, transferText, transferIcon, cardClickAction, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TicketDTO)) {
                return false;
            }
            TicketDTO ticketDTO = (TicketDTO) other;
            return Intrinsics.d(this.dateBadge, ticketDTO.dateBadge) && Intrinsics.d(this.price, ticketDTO.price) && Intrinsics.d(this.airlineIcons, ticketDTO.airlineIcons) && Intrinsics.d(this.destination, ticketDTO.destination) && Intrinsics.d(this.tripDuration, ticketDTO.tripDuration) && Intrinsics.d(this.tripTime, ticketDTO.tripTime) && Intrinsics.d(this.transferText, ticketDTO.transferText) && Intrinsics.d(this.transferIcon, ticketDTO.transferIcon) && Intrinsics.d(this.cardClickAction, ticketDTO.cardClickAction) && Intrinsics.d(this.trackingInfo, ticketDTO.trackingInfo);
        }

        @NotNull
        public final List<ImageDTO> getAirlineIcons() {
            return this.airlineIcons;
        }

        public final AtomActionDTO getCardClickAction() {
            return this.cardClickAction;
        }

        @NotNull
        public final BadgeDTO getDateBadge() {
            return this.dateBadge;
        }

        @NotNull
        public final TextDTO getDestination() {
            return this.destination;
        }

        @NotNull
        public final PriceDTO getPrice() {
            return this.price;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final IconDTO getTransferIcon() {
            return this.transferIcon;
        }

        public final TextDTO getTransferText() {
            return this.transferText;
        }

        @NotNull
        public final TextDTO getTripDuration() {
            return this.tripDuration;
        }

        public final TextDTO getTripTime() {
            return this.tripTime;
        }

        public int hashCode() {
            int a11 = b.a(this.tripDuration, b.a(this.destination, g.b(C3051a.b(this.price, this.dateBadge.hashCode() * 31, 31), 31, this.airlineIcons), 31), 31);
            TextDTO textDTO = this.tripTime;
            int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.transferText;
            int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            IconDTO iconDTO = this.transferIcon;
            int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.cardClickAction;
            int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            BadgeDTO badgeDTO = this.dateBadge;
            PriceDTO priceDTO = this.price;
            List<ImageDTO> list = this.airlineIcons;
            TextDTO textDTO = this.destination;
            TextDTO textDTO2 = this.tripDuration;
            TextDTO textDTO3 = this.tripTime;
            TextDTO textDTO4 = this.transferText;
            IconDTO iconDTO = this.transferIcon;
            AtomActionDTO atomActionDTO = this.cardClickAction;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("TicketDTO(dateBadge=");
            sb2.append(badgeDTO);
            sb2.append(", price=");
            sb2.append(priceDTO);
            sb2.append(", airlineIcons=");
            sb2.append(list);
            sb2.append(", destination=");
            sb2.append(textDTO);
            sb2.append(", tripDuration=");
            d.e(", tripTime=", ", transferText=", sb2, textDTO2, textDTO3);
            G.f(sb2, textDTO4, ", transferIcon=", iconDTO, ", cardClickAction=");
            return a.d(sb2, atomActionDTO, ", trackingInfo=", map, ")");
        }
    }

    public HotTicketsDTO(ImageDTO imageDTO, @NotNull TextDTO title, List<TicketDTO> list, ThemeImageV1DTO themeImageV1DTO, ThemeImageV1DTO themeImageV1DTO2, ButtonV3DTO buttonV3DTO, String str, String str2, Map<String, String> map, Map<String, TokenizedTrackingInfo> map2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.titleImage = imageDTO;
        this.title = title;
        this.tickets = list;
        this.backgroundImage = themeImageV1DTO;
        this.image = themeImageV1DTO2;
        this.button = buttonV3DTO;
        this.widgetBorderColor = str;
        this.ticketBorderColor = str2;
        this.asyncParams = map;
        this.trackingInfo = map2;
    }

    public static /* synthetic */ HotTicketsDTO copy$default(HotTicketsDTO hotTicketsDTO, ImageDTO imageDTO, TextDTO textDTO, List list, ThemeImageV1DTO themeImageV1DTO, ThemeImageV1DTO themeImageV1DTO2, ButtonV3DTO buttonV3DTO, String str, String str2, Map map, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = hotTicketsDTO.titleImage;
        }
        if ((i11 & 2) != 0) {
            textDTO = hotTicketsDTO.title;
        }
        if ((i11 & 4) != 0) {
            list = hotTicketsDTO.tickets;
        }
        if ((i11 & 8) != 0) {
            themeImageV1DTO = hotTicketsDTO.backgroundImage;
        }
        if ((i11 & 16) != 0) {
            themeImageV1DTO2 = hotTicketsDTO.image;
        }
        if ((i11 & 32) != 0) {
            buttonV3DTO = hotTicketsDTO.button;
        }
        if ((i11 & 64) != 0) {
            str = hotTicketsDTO.widgetBorderColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str2 = hotTicketsDTO.ticketBorderColor;
        }
        if ((i11 & 256) != 0) {
            map = hotTicketsDTO.asyncParams;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            map2 = hotTicketsDTO.trackingInfo;
        }
        Map map3 = map;
        Map map4 = map2;
        String str3 = str;
        String str4 = str2;
        ThemeImageV1DTO themeImageV1DTO3 = themeImageV1DTO2;
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        return hotTicketsDTO.copy(imageDTO, textDTO, list, themeImageV1DTO, themeImageV1DTO3, buttonV3DTO2, str3, str4, map3, map4);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageDTO getTitleImage() {
        return this.titleImage;
    }

    public final Map<String, TokenizedTrackingInfo> component10() {
        return this.trackingInfo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    public final List<TicketDTO> component3() {
        return this.tickets;
    }

    /* renamed from: component4, reason: from getter */
    public final ThemeImageV1DTO getBackgroundImage() {
        return this.backgroundImage;
    }

    /* renamed from: component5, reason: from getter */
    public final ThemeImageV1DTO getImage() {
        return this.image;
    }

    /* renamed from: component6, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    /* renamed from: component7, reason: from getter */
    public final String getWidgetBorderColor() {
        return this.widgetBorderColor;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTicketBorderColor() {
        return this.ticketBorderColor;
    }

    public final Map<String, String> component9() {
        return this.asyncParams;
    }

    @NotNull
    public final HotTicketsDTO copy(ImageDTO titleImage, @NotNull TextDTO title, List<TicketDTO> tickets, ThemeImageV1DTO backgroundImage, ThemeImageV1DTO image, ButtonV3DTO button, String widgetBorderColor, String ticketBorderColor, Map<String, String> asyncParams, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new HotTicketsDTO(titleImage, title, tickets, backgroundImage, image, button, widgetBorderColor, ticketBorderColor, asyncParams, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotTicketsDTO)) {
            return false;
        }
        HotTicketsDTO hotTicketsDTO = (HotTicketsDTO) other;
        return Intrinsics.d(this.titleImage, hotTicketsDTO.titleImage) && Intrinsics.d(this.title, hotTicketsDTO.title) && Intrinsics.d(this.tickets, hotTicketsDTO.tickets) && Intrinsics.d(this.backgroundImage, hotTicketsDTO.backgroundImage) && Intrinsics.d(this.image, hotTicketsDTO.image) && Intrinsics.d(this.button, hotTicketsDTO.button) && Intrinsics.d(this.widgetBorderColor, hotTicketsDTO.widgetBorderColor) && Intrinsics.d(this.ticketBorderColor, hotTicketsDTO.ticketBorderColor) && Intrinsics.d(this.asyncParams, hotTicketsDTO.asyncParams) && Intrinsics.d(this.trackingInfo, hotTicketsDTO.trackingInfo);
    }

    public final Map<String, String> getAsyncParams() {
        return this.asyncParams;
    }

    public final ThemeImageV1DTO getBackgroundImage() {
        return this.backgroundImage;
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final ThemeImageV1DTO getImage() {
        return this.image;
    }

    public final String getTicketBorderColor() {
        return this.ticketBorderColor;
    }

    public final List<TicketDTO> getTickets() {
        return this.tickets;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final ImageDTO getTitleImage() {
        return this.titleImage;
    }

    @Override // ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final String getWidgetBorderColor() {
        return this.widgetBorderColor;
    }

    public int hashCode() {
        ImageDTO imageDTO = this.titleImage;
        int a11 = b.a(this.title, (imageDTO == null ? 0 : imageDTO.hashCode()) * 31, 31);
        List<TicketDTO> list = this.tickets;
        int hashCode = (a11 + (list == null ? 0 : list.hashCode())) * 31;
        ThemeImageV1DTO themeImageV1DTO = this.backgroundImage;
        int hashCode2 = (hashCode + (themeImageV1DTO == null ? 0 : themeImageV1DTO.hashCode())) * 31;
        ThemeImageV1DTO themeImageV1DTO2 = this.image;
        int hashCode3 = (hashCode2 + (themeImageV1DTO2 == null ? 0 : themeImageV1DTO2.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.button;
        int hashCode4 = (hashCode3 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        String str = this.widgetBorderColor;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ticketBorderColor;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.asyncParams;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        return hashCode7 + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ImageDTO imageDTO = this.titleImage;
        TextDTO textDTO = this.title;
        List<TicketDTO> list = this.tickets;
        ThemeImageV1DTO themeImageV1DTO = this.backgroundImage;
        ThemeImageV1DTO themeImageV1DTO2 = this.image;
        ButtonV3DTO buttonV3DTO = this.button;
        String str = this.widgetBorderColor;
        String str2 = this.ticketBorderColor;
        Map<String, String> map = this.asyncParams;
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        StringBuilder d11 = C2616s.d("HotTicketsDTO(titleImage=", imageDTO, ", title=", textDTO, ", tickets=");
        d11.append(list);
        d11.append(", backgroundImage=");
        d11.append(themeImageV1DTO);
        d11.append(", image=");
        d11.append(themeImageV1DTO2);
        d11.append(", button=");
        d11.append(buttonV3DTO);
        d11.append(", widgetBorderColor=");
        Nh.a.h(d11, str, ", ticketBorderColor=", str2, ", asyncParams=");
        return V.c(d11, map, ", trackingInfo=", map2, ")");
    }
}
