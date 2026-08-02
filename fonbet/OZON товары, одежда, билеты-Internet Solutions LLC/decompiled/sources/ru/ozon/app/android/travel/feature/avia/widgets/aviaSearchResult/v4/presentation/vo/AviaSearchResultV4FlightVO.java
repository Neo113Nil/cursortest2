package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo;

import B90.C2618u;
import D3.g;
import D40.d;
import Fm.C3051a;
import K00.b;
import Kk.C3532b;
import Nh.a;
import Ve.C4598rp;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b+\b\u0081\b\u0018\u00002\u00020\u0001:\u0002OPB¯\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010%R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b\b\u00100R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u00106R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u00109R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b:\u0010.R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b;\u00109R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010<\u001a\u0004\b?\u0010>R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\bA\u0010#R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010@\u001a\u0004\bB\u0010#R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010I\u001a\u0004\bJ\u0010KR%\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001f\u0010L\u001a\u0004\bM\u0010N¨\u0006Q"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4ListItemVO;", "", "itemId", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "", "isBadgesVisible", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "premiumBadge", "Lru/ozon/uni/atoms/data/text/TextDTO;", "luggageText", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "airlineIcons", "airlinesText", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO$TripRoute;", "wayThereDetails", "wayBackDetails", "", "borderColor", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "cardClickAction", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboardingApp", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO$AdditionalInfo;", "additionalInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewTrackingInfo", "<init>", "(ILjava/util/List;ZLru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO$TripRoute;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO$TripRoute;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO$AdditionalInfo;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getItemId", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "Z", "()Z", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getPremiumBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getLuggageText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAirlineIcons", "getAirlinesText", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO$TripRoute;", "getWayThereDetails", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO$TripRoute;", "getWayBackDetails", "Ljava/lang/String;", "getBorderColor", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getCardClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboardingApp", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO$AdditionalInfo;", "getAdditionalInfo", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO$AdditionalInfo;", "Ljava/util/Map;", "getViewTrackingInfo", "()Ljava/util/Map;", "TripRoute", "AdditionalInfo", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AviaSearchResultV4FlightVO implements AviaSearchResultV4ListItemVO {
    private final AdditionalInfo additionalInfo;

    @NotNull
    private final List<IconDTO> airlineIcons;

    @NotNull
    private final TextDTO airlinesText;
    private final String backgroundColor;
    private final List<BadgeDTO> badges;
    private final String borderColor;

    @NotNull
    private final AtomAction cardClickAction;
    private final boolean isBadgesVisible;
    private final int itemId;

    @NotNull
    private final TextDTO luggageText;
    private final OnBoardingDTO onboardingApp;
    private final BadgeDTO premiumBadge;

    @NotNull
    private final PriceDTO price;
    private final Map<String, TokenizedTrackingInfo> viewTrackingInfo;
    private final TripRoute wayBackDetails;

    @NotNull
    private final TripRoute wayThereDetails;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO$AdditionalInfo;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "offsetXPx", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "I", "getOffsetXPx", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AdditionalInfo {
        private final BadgeDTO badge;
        private final int offsetXPx;
        private final TextDTO text;

        public AdditionalInfo(TextDTO textDTO, BadgeDTO badgeDTO, int i11) {
            this.text = textDTO;
            this.badge = badgeDTO;
            this.offsetXPx = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdditionalInfo)) {
                return false;
            }
            AdditionalInfo additionalInfo = (AdditionalInfo) other;
            return Intrinsics.d(this.text, additionalInfo.text) && Intrinsics.d(this.badge, additionalInfo.badge) && this.offsetXPx == additionalInfo.offsetXPx;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final int getOffsetXPx() {
            return this.offsetXPx;
        }

        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            TextDTO textDTO = this.text;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            BadgeDTO badgeDTO = this.badge;
            return Integer.hashCode(this.offsetXPx) + ((hashCode + (badgeDTO != null ? badgeDTO.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            BadgeDTO badgeDTO = this.badge;
            int i11 = this.offsetXPx;
            StringBuilder sb2 = new StringBuilder("AdditionalInfo(text=");
            sb2.append(textDTO);
            sb2.append(", badge=");
            sb2.append(badgeDTO);
            sb2.append(", offsetXPx=");
            return b.e(i11, ")", sb2);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO$TripRoute;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "tripTime", "tripDuration", "routeInfo", "timeDifference", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO$TripRoute$Transfer;", "transfers", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTripTime", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTripDuration", "getRouteInfo", "getTimeDifference", "Ljava/util/List;", "getTransfers", "()Ljava/util/List;", "Transfer", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TripRoute {

        @NotNull
        private final TextDTO routeInfo;
        private final TextDTO timeDifference;

        @NotNull
        private final List<Transfer> transfers;

        @NotNull
        private final TextDTO tripDuration;

        @NotNull
        private final TextDTO tripTime;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO$TripRoute$Transfer;", "", "", "id", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "atoms", "<init>", "(JLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getAtoms", "()Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Transfer {

            @NotNull
            private final List<AtomDTO> atoms;
            private final long id;

            /* JADX WARN: Multi-variable type inference failed */
            public Transfer(long j11, @NotNull List<? extends AtomDTO> atoms) {
                Intrinsics.checkNotNullParameter(atoms, "atoms");
                this.id = j11;
                this.atoms = atoms;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Transfer)) {
                    return false;
                }
                Transfer transfer = (Transfer) other;
                return this.id == transfer.id && Intrinsics.d(this.atoms, transfer.atoms);
            }

            @NotNull
            public final List<AtomDTO> getAtoms() {
                return this.atoms;
            }

            public final long getId() {
                return this.id;
            }

            public int hashCode() {
                return this.atoms.hashCode() + (Long.hashCode(this.id) * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder b11 = Lh.b.b(this.id, "Transfer(id=", ", atoms=", this.atoms);
                b11.append(")");
                return b11.toString();
            }
        }

        public TripRoute(@NotNull TextDTO tripTime, @NotNull TextDTO tripDuration, @NotNull TextDTO routeInfo, TextDTO textDTO, @NotNull List<Transfer> transfers) {
            Intrinsics.checkNotNullParameter(tripTime, "tripTime");
            Intrinsics.checkNotNullParameter(tripDuration, "tripDuration");
            Intrinsics.checkNotNullParameter(routeInfo, "routeInfo");
            Intrinsics.checkNotNullParameter(transfers, "transfers");
            this.tripTime = tripTime;
            this.tripDuration = tripDuration;
            this.routeInfo = routeInfo;
            this.timeDifference = textDTO;
            this.transfers = transfers;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TripRoute)) {
                return false;
            }
            TripRoute tripRoute = (TripRoute) other;
            return Intrinsics.d(this.tripTime, tripRoute.tripTime) && Intrinsics.d(this.tripDuration, tripRoute.tripDuration) && Intrinsics.d(this.routeInfo, tripRoute.routeInfo) && Intrinsics.d(this.timeDifference, tripRoute.timeDifference) && Intrinsics.d(this.transfers, tripRoute.transfers);
        }

        @NotNull
        public final TextDTO getRouteInfo() {
            return this.routeInfo;
        }

        public final TextDTO getTimeDifference() {
            return this.timeDifference;
        }

        @NotNull
        public final List<Transfer> getTransfers() {
            return this.transfers;
        }

        @NotNull
        public final TextDTO getTripDuration() {
            return this.tripDuration;
        }

        @NotNull
        public final TextDTO getTripTime() {
            return this.tripTime;
        }

        public int hashCode() {
            int a11 = Ns.b.a(this.routeInfo, Ns.b.a(this.tripDuration, this.tripTime.hashCode() * 31, 31), 31);
            TextDTO textDTO = this.timeDifference;
            return this.transfers.hashCode() + ((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.tripTime;
            TextDTO textDTO2 = this.tripDuration;
            TextDTO textDTO3 = this.routeInfo;
            TextDTO textDTO4 = this.timeDifference;
            List<Transfer> list = this.transfers;
            StringBuilder g10 = g.g("TripRoute(tripTime=", textDTO, ", tripDuration=", textDTO2, ", routeInfo=");
            d.e(", timeDifference=", ", transfers=", g10, textDTO3, textDTO4);
            return C2618u.h(g10, list, ")");
        }
    }

    public AviaSearchResultV4FlightVO(int i11, List<BadgeDTO> list, boolean z11, @NotNull PriceDTO price, BadgeDTO badgeDTO, @NotNull TextDTO luggageText, @NotNull List<IconDTO> airlineIcons, @NotNull TextDTO airlinesText, @NotNull TripRoute wayThereDetails, TripRoute tripRoute, String str, String str2, @NotNull AtomAction cardClickAction, OnBoardingDTO onBoardingDTO, AdditionalInfo additionalInfo, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(luggageText, "luggageText");
        Intrinsics.checkNotNullParameter(airlineIcons, "airlineIcons");
        Intrinsics.checkNotNullParameter(airlinesText, "airlinesText");
        Intrinsics.checkNotNullParameter(wayThereDetails, "wayThereDetails");
        Intrinsics.checkNotNullParameter(cardClickAction, "cardClickAction");
        this.itemId = i11;
        this.badges = list;
        this.isBadgesVisible = z11;
        this.price = price;
        this.premiumBadge = badgeDTO;
        this.luggageText = luggageText;
        this.airlineIcons = airlineIcons;
        this.airlinesText = airlinesText;
        this.wayThereDetails = wayThereDetails;
        this.wayBackDetails = tripRoute;
        this.borderColor = str;
        this.backgroundColor = str2;
        this.cardClickAction = cardClickAction;
        this.onboardingApp = onBoardingDTO;
        this.additionalInfo = additionalInfo;
        this.viewTrackingInfo = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AviaSearchResultV4FlightVO)) {
            return false;
        }
        AviaSearchResultV4FlightVO aviaSearchResultV4FlightVO = (AviaSearchResultV4FlightVO) other;
        return this.itemId == aviaSearchResultV4FlightVO.itemId && Intrinsics.d(this.badges, aviaSearchResultV4FlightVO.badges) && this.isBadgesVisible == aviaSearchResultV4FlightVO.isBadgesVisible && Intrinsics.d(this.price, aviaSearchResultV4FlightVO.price) && Intrinsics.d(this.premiumBadge, aviaSearchResultV4FlightVO.premiumBadge) && Intrinsics.d(this.luggageText, aviaSearchResultV4FlightVO.luggageText) && Intrinsics.d(this.airlineIcons, aviaSearchResultV4FlightVO.airlineIcons) && Intrinsics.d(this.airlinesText, aviaSearchResultV4FlightVO.airlinesText) && Intrinsics.d(this.wayThereDetails, aviaSearchResultV4FlightVO.wayThereDetails) && Intrinsics.d(this.wayBackDetails, aviaSearchResultV4FlightVO.wayBackDetails) && Intrinsics.d(this.borderColor, aviaSearchResultV4FlightVO.borderColor) && Intrinsics.d(this.backgroundColor, aviaSearchResultV4FlightVO.backgroundColor) && Intrinsics.d(this.cardClickAction, aviaSearchResultV4FlightVO.cardClickAction) && Intrinsics.d(this.onboardingApp, aviaSearchResultV4FlightVO.onboardingApp) && Intrinsics.d(this.additionalInfo, aviaSearchResultV4FlightVO.additionalInfo) && Intrinsics.d(this.viewTrackingInfo, aviaSearchResultV4FlightVO.viewTrackingInfo);
    }

    public final AdditionalInfo getAdditionalInfo() {
        return this.additionalInfo;
    }

    @NotNull
    public final List<IconDTO> getAirlineIcons() {
        return this.airlineIcons;
    }

    @NotNull
    public final TextDTO getAirlinesText() {
        return this.airlinesText;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<BadgeDTO> getBadges() {
        return this.badges;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final AtomAction getCardClickAction() {
        return this.cardClickAction;
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4ListItemVO
    public int getItemId() {
        return this.itemId;
    }

    @NotNull
    public final TextDTO getLuggageText() {
        return this.luggageText;
    }

    public final OnBoardingDTO getOnboardingApp() {
        return this.onboardingApp;
    }

    public final BadgeDTO getPremiumBadge() {
        return this.premiumBadge;
    }

    @NotNull
    public final PriceDTO getPrice() {
        return this.price;
    }

    public final Map<String, TokenizedTrackingInfo> getViewTrackingInfo() {
        return this.viewTrackingInfo;
    }

    public final TripRoute getWayBackDetails() {
        return this.wayBackDetails;
    }

    @NotNull
    public final TripRoute getWayThereDetails() {
        return this.wayThereDetails;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.itemId) * 31;
        List<BadgeDTO> list = this.badges;
        int b11 = C3051a.b(this.price, C3532b.a((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.isBadgesVisible), 31);
        BadgeDTO badgeDTO = this.premiumBadge;
        int hashCode2 = (this.wayThereDetails.hashCode() + Ns.b.a(this.airlinesText, G.g.b(Ns.b.a(this.luggageText, (b11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31), 31, this.airlineIcons), 31)) * 31;
        TripRoute tripRoute = this.wayBackDetails;
        int hashCode3 = (hashCode2 + (tripRoute == null ? 0 : tripRoute.hashCode())) * 31;
        String str = this.borderColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int a11 = C4598rp.a(this.cardClickAction, (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        OnBoardingDTO onBoardingDTO = this.onboardingApp;
        int hashCode5 = (a11 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
        AdditionalInfo additionalInfo = this.additionalInfo;
        int hashCode6 = (hashCode5 + (additionalInfo == null ? 0 : additionalInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }

    /* renamed from: isBadgesVisible, reason: from getter */
    public final boolean getIsBadgesVisible() {
        return this.isBadgesVisible;
    }

    @NotNull
    public String toString() {
        int i11 = this.itemId;
        List<BadgeDTO> list = this.badges;
        boolean z11 = this.isBadgesVisible;
        PriceDTO priceDTO = this.price;
        BadgeDTO badgeDTO = this.premiumBadge;
        TextDTO textDTO = this.luggageText;
        List<IconDTO> list2 = this.airlineIcons;
        TextDTO textDTO2 = this.airlinesText;
        TripRoute tripRoute = this.wayThereDetails;
        TripRoute tripRoute2 = this.wayBackDetails;
        String str = this.borderColor;
        String str2 = this.backgroundColor;
        AtomAction atomAction = this.cardClickAction;
        OnBoardingDTO onBoardingDTO = this.onboardingApp;
        AdditionalInfo additionalInfo = this.additionalInfo;
        Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
        StringBuilder sb2 = new StringBuilder("AviaSearchResultV4FlightVO(itemId=");
        sb2.append(i11);
        sb2.append(", badges=");
        sb2.append(list);
        sb2.append(", isBadgesVisible=");
        sb2.append(z11);
        sb2.append(", price=");
        sb2.append(priceDTO);
        sb2.append(", premiumBadge=");
        sb2.append(badgeDTO);
        sb2.append(", luggageText=");
        sb2.append(textDTO);
        sb2.append(", airlineIcons=");
        sb2.append(list2);
        sb2.append(", airlinesText=");
        sb2.append(textDTO2);
        sb2.append(", wayThereDetails=");
        sb2.append(tripRoute);
        sb2.append(", wayBackDetails=");
        sb2.append(tripRoute2);
        sb2.append(", borderColor=");
        a.h(sb2, str, ", backgroundColor=", str2, ", cardClickAction=");
        sb2.append(atomAction);
        sb2.append(", onboardingApp=");
        sb2.append(onBoardingDTO);
        sb2.append(", additionalInfo=");
        sb2.append(additionalInfo);
        sb2.append(", viewTrackingInfo=");
        sb2.append(map);
        sb2.append(")");
        return sb2.toString();
    }
}
