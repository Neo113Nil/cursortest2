package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.v3;

import B90.C2618u;
import B90.C2619v;
import C.o0;
import Fj.c;
import G.g;
import Kk.C3532b;
import Lc.a;
import Sh.b;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.infoBadge.InfoBadgeDTO;
import ru.ozon.app.android.travel.molecules.dto.tripRoute.TripRouteDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0004UVWXBÑ\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d\u0012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d¢\u0006\u0004\b \u0010!J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010?\u001a\u00020\bHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010B\u001a\u00020\u000eHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\t\u0010J\u001a\u00020\u001aHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u0017\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dHÆ\u0003J\u0017\u0010M\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dHÆ\u0003Jõ\u0001\u0010N\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dHÆ\u0001J\u0013\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010R\u001a\u00020SHÖ\u0001J\t\u0010T\u001a\u00020\u0013HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b9\u00108R\u001f\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u001f\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b<\u0010;¨\u0006Y"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO;", "", "routeBlocks", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$RouteBlockDTO;", "luggageTabs", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$LuggageTabDTO;", "simplePrice", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$SimplePrice;", "bonusPrice", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$BonusPrice;", "remainingTickets", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "smallButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "bonusSmallButton", "routeBadges", "Lru/ozon/uni/atoms/data/badge/Badge;", "borderColor", "", "bonusBackgroundColor", "premiumBadge", "bonusPremiumBadge", "crossedPrice", "Lru/ozon/uni/atoms/data/price/Price;", "cardClickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "bonusCardClickAction", "cardClickTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewTrackingInfo", "<init>", "(Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$SimplePrice;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$BonusPrice;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/util/Map;)V", "getRouteBlocks", "()Ljava/util/List;", "getLuggageTabs", "getSimplePrice", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$SimplePrice;", "getBonusPrice", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$BonusPrice;", "getRemainingTickets", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSmallButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getBonusSmallButton", "getRouteBadges", "getBorderColor", "()Ljava/lang/String;", "getBonusBackgroundColor", "getPremiumBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getBonusPremiumBadge", "getCrossedPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getCardClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBonusCardClickAction", "getCardClickTrackingInfo", "()Ljava/util/Map;", "getViewTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "", "other", "hashCode", "", "toString", "SimplePrice", "BonusPrice", "RouteBlockDTO", "LuggageTabDTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightV3DTO {
    public static final int $stable = 8;
    private final String bonusBackgroundColor;
    private final AtomActionDTO bonusCardClickAction;
    private final Badge bonusPremiumBadge;
    private final BonusPrice bonusPrice;
    private final ButtonV3Atom.SmallButton bonusSmallButton;
    private final String borderColor;

    @NotNull
    private final AtomActionDTO cardClickAction;
    private final Map<String, TokenizedTrackingInfo> cardClickTrackingInfo;
    private final Price crossedPrice;

    @NotNull
    private final List<LuggageTabDTO> luggageTabs;
    private final Badge premiumBadge;
    private final TextAtom remainingTickets;
    private final List<Badge> routeBadges;

    @NotNull
    private final List<RouteBlockDTO> routeBlocks;

    @NotNull
    private final SimplePrice simplePrice;

    @NotNull
    private final ButtonV3Atom.SmallButton smallButton;
    private final Map<String, TokenizedTrackingInfo> viewTrackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$BonusPrice;", "", "price", "Lru/ozon/uni/atoms/data/price/Price;", "percent", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "<init>", "(Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getPercent", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BonusPrice {
        public static final int $stable = TextAtom.$stable | Price.$stable;
        private final TextAtom percent;

        @NotNull
        private final Price price;

        public BonusPrice(@NotNull Price price, TextAtom textAtom) {
            Intrinsics.checkNotNullParameter(price, "price");
            this.price = price;
            this.percent = textAtom;
        }

        public static /* synthetic */ BonusPrice copy$default(BonusPrice bonusPrice, Price price, TextAtom textAtom, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                price = bonusPrice.price;
            }
            if ((i11 & 2) != 0) {
                textAtom = bonusPrice.percent;
            }
            return bonusPrice.copy(price, textAtom);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Price getPrice() {
            return this.price;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getPercent() {
            return this.percent;
        }

        @NotNull
        public final BonusPrice copy(@NotNull Price price, TextAtom percent) {
            Intrinsics.checkNotNullParameter(price, "price");
            return new BonusPrice(price, percent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BonusPrice)) {
                return false;
            }
            BonusPrice bonusPrice = (BonusPrice) other;
            return Intrinsics.d(this.price, bonusPrice.price) && Intrinsics.d(this.percent, bonusPrice.percent);
        }

        public final TextAtom getPercent() {
            return this.percent;
        }

        @NotNull
        public final Price getPrice() {
            return this.price;
        }

        public int hashCode() {
            int hashCode = this.price.hashCode() * 31;
            TextAtom textAtom = this.percent;
            return hashCode + (textAtom == null ? 0 : textAtom.hashCode());
        }

        @NotNull
        public String toString() {
            return "BonusPrice(price=" + this.price + ", percent=" + this.percent + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003J\u0017\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u008d\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u00102\u001a\u00020\u000f2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\"R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001a¨\u00067"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$LuggageTabDTO;", "", "handCarryIcon", "Lru/ozon/uni/atoms/data/button/Icon;", "luggageIcon", "handCarryWeight", "", "luggageWeight", "handCarryCount", "luggageCount", "price", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "isSelected", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "totalPrice", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/AtomActionDTO;ZLjava/util/Map;Ljava/lang/String;)V", "getHandCarryIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getLuggageIcon", "getHandCarryWeight", "()Ljava/lang/String;", "getLuggageWeight", "getHandCarryCount", "getLuggageCount", "getPrice", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "()Z", "getTrackingInfo", "()Ljava/util/Map;", "getTotalPrice", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LuggageTabDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final String handCarryCount;

        @NotNull
        private final Icon handCarryIcon;

        @NotNull
        private final String handCarryWeight;
        private final boolean isSelected;
        private final String luggageCount;

        @NotNull
        private final Icon luggageIcon;

        @NotNull
        private final String luggageWeight;

        @NotNull
        private final TextAtom price;
        private final String totalPrice;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public LuggageTabDTO(@NotNull Icon handCarryIcon, @NotNull Icon luggageIcon, @NotNull String handCarryWeight, @NotNull String luggageWeight, String str, String str2, @NotNull TextAtom price, AtomActionDTO atomActionDTO, boolean z11, Map<String, TokenizedTrackingInfo> map, String str3) {
            Intrinsics.checkNotNullParameter(handCarryIcon, "handCarryIcon");
            Intrinsics.checkNotNullParameter(luggageIcon, "luggageIcon");
            Intrinsics.checkNotNullParameter(handCarryWeight, "handCarryWeight");
            Intrinsics.checkNotNullParameter(luggageWeight, "luggageWeight");
            Intrinsics.checkNotNullParameter(price, "price");
            this.handCarryIcon = handCarryIcon;
            this.luggageIcon = luggageIcon;
            this.handCarryWeight = handCarryWeight;
            this.luggageWeight = luggageWeight;
            this.handCarryCount = str;
            this.luggageCount = str2;
            this.price = price;
            this.action = atomActionDTO;
            this.isSelected = z11;
            this.trackingInfo = map;
            this.totalPrice = str3;
        }

        public static /* synthetic */ LuggageTabDTO copy$default(LuggageTabDTO luggageTabDTO, Icon icon, Icon icon2, String str, String str2, String str3, String str4, TextAtom textAtom, AtomActionDTO atomActionDTO, boolean z11, Map map, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                icon = luggageTabDTO.handCarryIcon;
            }
            if ((i11 & 2) != 0) {
                icon2 = luggageTabDTO.luggageIcon;
            }
            if ((i11 & 4) != 0) {
                str = luggageTabDTO.handCarryWeight;
            }
            if ((i11 & 8) != 0) {
                str2 = luggageTabDTO.luggageWeight;
            }
            if ((i11 & 16) != 0) {
                str3 = luggageTabDTO.handCarryCount;
            }
            if ((i11 & 32) != 0) {
                str4 = luggageTabDTO.luggageCount;
            }
            if ((i11 & 64) != 0) {
                textAtom = luggageTabDTO.price;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                atomActionDTO = luggageTabDTO.action;
            }
            if ((i11 & 256) != 0) {
                z11 = luggageTabDTO.isSelected;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                map = luggageTabDTO.trackingInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                str5 = luggageTabDTO.totalPrice;
            }
            Map map2 = map;
            String str6 = str5;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            boolean z12 = z11;
            String str7 = str4;
            TextAtom textAtom2 = textAtom;
            String str8 = str3;
            String str9 = str;
            return luggageTabDTO.copy(icon, icon2, str9, str2, str8, str7, textAtom2, atomActionDTO2, z12, map2, str6);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Icon getHandCarryIcon() {
            return this.handCarryIcon;
        }

        public final Map<String, TokenizedTrackingInfo> component10() {
            return this.trackingInfo;
        }

        /* renamed from: component11, reason: from getter */
        public final String getTotalPrice() {
            return this.totalPrice;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Icon getLuggageIcon() {
            return this.luggageIcon;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getHandCarryWeight() {
            return this.handCarryWeight;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getLuggageWeight() {
            return this.luggageWeight;
        }

        /* renamed from: component5, reason: from getter */
        public final String getHandCarryCount() {
            return this.handCarryCount;
        }

        /* renamed from: component6, reason: from getter */
        public final String getLuggageCount() {
            return this.luggageCount;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final TextAtom getPrice() {
            return this.price;
        }

        /* renamed from: component8, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public final LuggageTabDTO copy(@NotNull Icon handCarryIcon, @NotNull Icon luggageIcon, @NotNull String handCarryWeight, @NotNull String luggageWeight, String handCarryCount, String luggageCount, @NotNull TextAtom price, AtomActionDTO action, boolean isSelected, Map<String, TokenizedTrackingInfo> trackingInfo, String totalPrice) {
            Intrinsics.checkNotNullParameter(handCarryIcon, "handCarryIcon");
            Intrinsics.checkNotNullParameter(luggageIcon, "luggageIcon");
            Intrinsics.checkNotNullParameter(handCarryWeight, "handCarryWeight");
            Intrinsics.checkNotNullParameter(luggageWeight, "luggageWeight");
            Intrinsics.checkNotNullParameter(price, "price");
            return new LuggageTabDTO(handCarryIcon, luggageIcon, handCarryWeight, luggageWeight, handCarryCount, luggageCount, price, action, isSelected, trackingInfo, totalPrice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LuggageTabDTO)) {
                return false;
            }
            LuggageTabDTO luggageTabDTO = (LuggageTabDTO) other;
            return Intrinsics.d(this.handCarryIcon, luggageTabDTO.handCarryIcon) && Intrinsics.d(this.luggageIcon, luggageTabDTO.luggageIcon) && Intrinsics.d(this.handCarryWeight, luggageTabDTO.handCarryWeight) && Intrinsics.d(this.luggageWeight, luggageTabDTO.luggageWeight) && Intrinsics.d(this.handCarryCount, luggageTabDTO.handCarryCount) && Intrinsics.d(this.luggageCount, luggageTabDTO.luggageCount) && Intrinsics.d(this.price, luggageTabDTO.price) && Intrinsics.d(this.action, luggageTabDTO.action) && this.isSelected == luggageTabDTO.isSelected && Intrinsics.d(this.trackingInfo, luggageTabDTO.trackingInfo) && Intrinsics.d(this.totalPrice, luggageTabDTO.totalPrice);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getHandCarryCount() {
            return this.handCarryCount;
        }

        @NotNull
        public final Icon getHandCarryIcon() {
            return this.handCarryIcon;
        }

        @NotNull
        public final String getHandCarryWeight() {
            return this.handCarryWeight;
        }

        public final String getLuggageCount() {
            return this.luggageCount;
        }

        @NotNull
        public final Icon getLuggageIcon() {
            return this.luggageIcon;
        }

        @NotNull
        public final String getLuggageWeight() {
            return this.luggageWeight;
        }

        @NotNull
        public final TextAtom getPrice() {
            return this.price;
        }

        public final String getTotalPrice() {
            return this.totalPrice;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = g.a(g.a(a.a(this.luggageIcon, this.handCarryIcon.hashCode() * 31, 31), 31, this.handCarryWeight), 31, this.luggageWeight);
            String str = this.handCarryCount;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.luggageCount;
            int b11 = C2619v.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.price);
            AtomActionDTO atomActionDTO = this.action;
            int a12 = C3532b.a((b11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.isSelected);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode2 = (a12 + (map == null ? 0 : map.hashCode())) * 31;
            String str3 = this.totalPrice;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            Icon icon = this.handCarryIcon;
            Icon icon2 = this.luggageIcon;
            String str = this.handCarryWeight;
            String str2 = this.luggageWeight;
            String str3 = this.handCarryCount;
            String str4 = this.luggageCount;
            TextAtom textAtom = this.price;
            AtomActionDTO atomActionDTO = this.action;
            boolean z11 = this.isSelected;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            String str5 = this.totalPrice;
            StringBuilder sb2 = new StringBuilder("LuggageTabDTO(handCarryIcon=");
            sb2.append(icon);
            sb2.append(", luggageIcon=");
            sb2.append(icon2);
            sb2.append(", handCarryWeight=");
            Nh.a.h(sb2, str, ", luggageWeight=", str2, ", handCarryCount=");
            Nh.a.h(sb2, str3, ", luggageCount=", str4, ", price=");
            sb2.append(textAtom);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", isSelected=");
            sb2.append(z11);
            sb2.append(", trackingInfo=");
            sb2.append(map);
            sb2.append(", totalPrice=");
            return o0.c(sb2, str5, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$RouteBlockDTO;", "", "route", "Lru/ozon/app/android/travel/molecules/dto/tripRoute/TripRouteDTO;", "badges", "", "Lru/ozon/app/android/travel/molecules/dto/infoBadge/InfoBadgeDTO;", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/tripRoute/TripRouteDTO;Ljava/util/List;)V", "getRoute", "()Lru/ozon/app/android/travel/molecules/dto/tripRoute/TripRouteDTO;", "getBadges", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteBlockDTO {
        public static final int $stable = 8;
        private final List<InfoBadgeDTO> badges;

        @NotNull
        private final TripRouteDTO route;

        public RouteBlockDTO(@NotNull TripRouteDTO route, List<InfoBadgeDTO> list) {
            Intrinsics.checkNotNullParameter(route, "route");
            this.route = route;
            this.badges = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RouteBlockDTO copy$default(RouteBlockDTO routeBlockDTO, TripRouteDTO tripRouteDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                tripRouteDTO = routeBlockDTO.route;
            }
            if ((i11 & 2) != 0) {
                list = routeBlockDTO.badges;
            }
            return routeBlockDTO.copy(tripRouteDTO, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TripRouteDTO getRoute() {
            return this.route;
        }

        public final List<InfoBadgeDTO> component2() {
            return this.badges;
        }

        @NotNull
        public final RouteBlockDTO copy(@NotNull TripRouteDTO route, List<InfoBadgeDTO> badges) {
            Intrinsics.checkNotNullParameter(route, "route");
            return new RouteBlockDTO(route, badges);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RouteBlockDTO)) {
                return false;
            }
            RouteBlockDTO routeBlockDTO = (RouteBlockDTO) other;
            return Intrinsics.d(this.route, routeBlockDTO.route) && Intrinsics.d(this.badges, routeBlockDTO.badges);
        }

        public final List<InfoBadgeDTO> getBadges() {
            return this.badges;
        }

        @NotNull
        public final TripRouteDTO getRoute() {
            return this.route;
        }

        public int hashCode() {
            int hashCode = this.route.hashCode() * 31;
            List<InfoBadgeDTO> list = this.badges;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public String toString() {
            return "RouteBlockDTO(route=" + this.route + ", badges=" + this.badges + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$SimplePrice;", "", "price", "Lru/ozon/uni/atoms/data/price/Price;", "<init>", "(Lru/ozon/uni/atoms/data/price/Price;)V", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SimplePrice {
        public static final int $stable = Price.$stable;

        @NotNull
        private final Price price;

        public SimplePrice(@NotNull Price price) {
            Intrinsics.checkNotNullParameter(price, "price");
            this.price = price;
        }

        public static /* synthetic */ SimplePrice copy$default(SimplePrice simplePrice, Price price, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                price = simplePrice.price;
            }
            return simplePrice.copy(price);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Price getPrice() {
            return this.price;
        }

        @NotNull
        public final SimplePrice copy(@NotNull Price price) {
            Intrinsics.checkNotNullParameter(price, "price");
            return new SimplePrice(price);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SimplePrice) && Intrinsics.d(this.price, ((SimplePrice) other).price);
        }

        @NotNull
        public final Price getPrice() {
            return this.price;
        }

        public int hashCode() {
            return this.price.hashCode();
        }

        @NotNull
        public String toString() {
            return "SimplePrice(price=" + this.price + ")";
        }
    }

    public FlightV3DTO(@NotNull List<RouteBlockDTO> routeBlocks, @NotNull List<LuggageTabDTO> luggageTabs, @NotNull SimplePrice simplePrice, BonusPrice bonusPrice, TextAtom textAtom, @NotNull ButtonV3Atom.SmallButton smallButton, ButtonV3Atom.SmallButton smallButton2, List<Badge> list, String str, String str2, Badge badge, Badge badge2, Price price, @NotNull AtomActionDTO cardClickAction, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2) {
        Intrinsics.checkNotNullParameter(routeBlocks, "routeBlocks");
        Intrinsics.checkNotNullParameter(luggageTabs, "luggageTabs");
        Intrinsics.checkNotNullParameter(simplePrice, "simplePrice");
        Intrinsics.checkNotNullParameter(smallButton, "smallButton");
        Intrinsics.checkNotNullParameter(cardClickAction, "cardClickAction");
        this.routeBlocks = routeBlocks;
        this.luggageTabs = luggageTabs;
        this.simplePrice = simplePrice;
        this.bonusPrice = bonusPrice;
        this.remainingTickets = textAtom;
        this.smallButton = smallButton;
        this.bonusSmallButton = smallButton2;
        this.routeBadges = list;
        this.borderColor = str;
        this.bonusBackgroundColor = str2;
        this.premiumBadge = badge;
        this.bonusPremiumBadge = badge2;
        this.crossedPrice = price;
        this.cardClickAction = cardClickAction;
        this.bonusCardClickAction = atomActionDTO;
        this.cardClickTrackingInfo = map;
        this.viewTrackingInfo = map2;
    }

    public static /* synthetic */ FlightV3DTO copy$default(FlightV3DTO flightV3DTO, List list, List list2, SimplePrice simplePrice, BonusPrice bonusPrice, TextAtom textAtom, ButtonV3Atom.SmallButton smallButton, ButtonV3Atom.SmallButton smallButton2, List list3, String str, String str2, Badge badge, Badge badge2, Price price, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, Map map, Map map2, int i11, Object obj) {
        Map map3;
        Map map4;
        List list4;
        FlightV3DTO flightV3DTO2;
        AtomActionDTO atomActionDTO3;
        List list5;
        SimplePrice simplePrice2;
        BonusPrice bonusPrice2;
        TextAtom textAtom2;
        ButtonV3Atom.SmallButton smallButton3;
        ButtonV3Atom.SmallButton smallButton4;
        List list6;
        String str3;
        String str4;
        Badge badge3;
        Badge badge4;
        Price price2;
        AtomActionDTO atomActionDTO4;
        List list7 = (i11 & 1) != 0 ? flightV3DTO.routeBlocks : list;
        List list8 = (i11 & 2) != 0 ? flightV3DTO.luggageTabs : list2;
        SimplePrice simplePrice3 = (i11 & 4) != 0 ? flightV3DTO.simplePrice : simplePrice;
        BonusPrice bonusPrice3 = (i11 & 8) != 0 ? flightV3DTO.bonusPrice : bonusPrice;
        TextAtom textAtom3 = (i11 & 16) != 0 ? flightV3DTO.remainingTickets : textAtom;
        ButtonV3Atom.SmallButton smallButton5 = (i11 & 32) != 0 ? flightV3DTO.smallButton : smallButton;
        ButtonV3Atom.SmallButton smallButton6 = (i11 & 64) != 0 ? flightV3DTO.bonusSmallButton : smallButton2;
        List list9 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? flightV3DTO.routeBadges : list3;
        String str5 = (i11 & 256) != 0 ? flightV3DTO.borderColor : str;
        String str6 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? flightV3DTO.bonusBackgroundColor : str2;
        Badge badge5 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? flightV3DTO.premiumBadge : badge;
        Badge badge6 = (i11 & 2048) != 0 ? flightV3DTO.bonusPremiumBadge : badge2;
        Price price3 = (i11 & 4096) != 0 ? flightV3DTO.crossedPrice : price;
        AtomActionDTO atomActionDTO5 = (i11 & 8192) != 0 ? flightV3DTO.cardClickAction : atomActionDTO;
        List list10 = list7;
        AtomActionDTO atomActionDTO6 = (i11 & 16384) != 0 ? flightV3DTO.bonusCardClickAction : atomActionDTO2;
        Map map5 = (i11 & 32768) != 0 ? flightV3DTO.cardClickTrackingInfo : map;
        if ((i11 & 65536) != 0) {
            map4 = map5;
            map3 = flightV3DTO.viewTrackingInfo;
            atomActionDTO3 = atomActionDTO6;
            list5 = list8;
            simplePrice2 = simplePrice3;
            bonusPrice2 = bonusPrice3;
            textAtom2 = textAtom3;
            smallButton3 = smallButton5;
            smallButton4 = smallButton6;
            list6 = list9;
            str3 = str5;
            str4 = str6;
            badge3 = badge5;
            badge4 = badge6;
            price2 = price3;
            atomActionDTO4 = atomActionDTO5;
            list4 = list10;
            flightV3DTO2 = flightV3DTO;
        } else {
            map3 = map2;
            map4 = map5;
            list4 = list10;
            flightV3DTO2 = flightV3DTO;
            atomActionDTO3 = atomActionDTO6;
            list5 = list8;
            simplePrice2 = simplePrice3;
            bonusPrice2 = bonusPrice3;
            textAtom2 = textAtom3;
            smallButton3 = smallButton5;
            smallButton4 = smallButton6;
            list6 = list9;
            str3 = str5;
            str4 = str6;
            badge3 = badge5;
            badge4 = badge6;
            price2 = price3;
            atomActionDTO4 = atomActionDTO5;
        }
        return flightV3DTO2.copy(list4, list5, simplePrice2, bonusPrice2, textAtom2, smallButton3, smallButton4, list6, str3, str4, badge3, badge4, price2, atomActionDTO4, atomActionDTO3, map4, map3);
    }

    @NotNull
    public final List<RouteBlockDTO> component1() {
        return this.routeBlocks;
    }

    /* renamed from: component10, reason: from getter */
    public final String getBonusBackgroundColor() {
        return this.bonusBackgroundColor;
    }

    /* renamed from: component11, reason: from getter */
    public final Badge getPremiumBadge() {
        return this.premiumBadge;
    }

    /* renamed from: component12, reason: from getter */
    public final Badge getBonusPremiumBadge() {
        return this.bonusPremiumBadge;
    }

    /* renamed from: component13, reason: from getter */
    public final Price getCrossedPrice() {
        return this.crossedPrice;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final AtomActionDTO getCardClickAction() {
        return this.cardClickAction;
    }

    /* renamed from: component15, reason: from getter */
    public final AtomActionDTO getBonusCardClickAction() {
        return this.bonusCardClickAction;
    }

    public final Map<String, TokenizedTrackingInfo> component16() {
        return this.cardClickTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component17() {
        return this.viewTrackingInfo;
    }

    @NotNull
    public final List<LuggageTabDTO> component2() {
        return this.luggageTabs;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final SimplePrice getSimplePrice() {
        return this.simplePrice;
    }

    /* renamed from: component4, reason: from getter */
    public final BonusPrice getBonusPrice() {
        return this.bonusPrice;
    }

    /* renamed from: component5, reason: from getter */
    public final TextAtom getRemainingTickets() {
        return this.remainingTickets;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final ButtonV3Atom.SmallButton getSmallButton() {
        return this.smallButton;
    }

    /* renamed from: component7, reason: from getter */
    public final ButtonV3Atom.SmallButton getBonusSmallButton() {
        return this.bonusSmallButton;
    }

    public final List<Badge> component8() {
        return this.routeBadges;
    }

    /* renamed from: component9, reason: from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final FlightV3DTO copy(@NotNull List<RouteBlockDTO> routeBlocks, @NotNull List<LuggageTabDTO> luggageTabs, @NotNull SimplePrice simplePrice, BonusPrice bonusPrice, TextAtom remainingTickets, @NotNull ButtonV3Atom.SmallButton smallButton, ButtonV3Atom.SmallButton bonusSmallButton, List<Badge> routeBadges, String borderColor, String bonusBackgroundColor, Badge premiumBadge, Badge bonusPremiumBadge, Price crossedPrice, @NotNull AtomActionDTO cardClickAction, AtomActionDTO bonusCardClickAction, Map<String, TokenizedTrackingInfo> cardClickTrackingInfo, Map<String, TokenizedTrackingInfo> viewTrackingInfo) {
        Intrinsics.checkNotNullParameter(routeBlocks, "routeBlocks");
        Intrinsics.checkNotNullParameter(luggageTabs, "luggageTabs");
        Intrinsics.checkNotNullParameter(simplePrice, "simplePrice");
        Intrinsics.checkNotNullParameter(smallButton, "smallButton");
        Intrinsics.checkNotNullParameter(cardClickAction, "cardClickAction");
        return new FlightV3DTO(routeBlocks, luggageTabs, simplePrice, bonusPrice, remainingTickets, smallButton, bonusSmallButton, routeBadges, borderColor, bonusBackgroundColor, premiumBadge, bonusPremiumBadge, crossedPrice, cardClickAction, bonusCardClickAction, cardClickTrackingInfo, viewTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightV3DTO)) {
            return false;
        }
        FlightV3DTO flightV3DTO = (FlightV3DTO) other;
        return Intrinsics.d(this.routeBlocks, flightV3DTO.routeBlocks) && Intrinsics.d(this.luggageTabs, flightV3DTO.luggageTabs) && Intrinsics.d(this.simplePrice, flightV3DTO.simplePrice) && Intrinsics.d(this.bonusPrice, flightV3DTO.bonusPrice) && Intrinsics.d(this.remainingTickets, flightV3DTO.remainingTickets) && Intrinsics.d(this.smallButton, flightV3DTO.smallButton) && Intrinsics.d(this.bonusSmallButton, flightV3DTO.bonusSmallButton) && Intrinsics.d(this.routeBadges, flightV3DTO.routeBadges) && Intrinsics.d(this.borderColor, flightV3DTO.borderColor) && Intrinsics.d(this.bonusBackgroundColor, flightV3DTO.bonusBackgroundColor) && Intrinsics.d(this.premiumBadge, flightV3DTO.premiumBadge) && Intrinsics.d(this.bonusPremiumBadge, flightV3DTO.bonusPremiumBadge) && Intrinsics.d(this.crossedPrice, flightV3DTO.crossedPrice) && Intrinsics.d(this.cardClickAction, flightV3DTO.cardClickAction) && Intrinsics.d(this.bonusCardClickAction, flightV3DTO.bonusCardClickAction) && Intrinsics.d(this.cardClickTrackingInfo, flightV3DTO.cardClickTrackingInfo) && Intrinsics.d(this.viewTrackingInfo, flightV3DTO.viewTrackingInfo);
    }

    public final String getBonusBackgroundColor() {
        return this.bonusBackgroundColor;
    }

    public final AtomActionDTO getBonusCardClickAction() {
        return this.bonusCardClickAction;
    }

    public final Badge getBonusPremiumBadge() {
        return this.bonusPremiumBadge;
    }

    public final BonusPrice getBonusPrice() {
        return this.bonusPrice;
    }

    public final ButtonV3Atom.SmallButton getBonusSmallButton() {
        return this.bonusSmallButton;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final AtomActionDTO getCardClickAction() {
        return this.cardClickAction;
    }

    public final Map<String, TokenizedTrackingInfo> getCardClickTrackingInfo() {
        return this.cardClickTrackingInfo;
    }

    public final Price getCrossedPrice() {
        return this.crossedPrice;
    }

    @NotNull
    public final List<LuggageTabDTO> getLuggageTabs() {
        return this.luggageTabs;
    }

    public final Badge getPremiumBadge() {
        return this.premiumBadge;
    }

    public final TextAtom getRemainingTickets() {
        return this.remainingTickets;
    }

    public final List<Badge> getRouteBadges() {
        return this.routeBadges;
    }

    @NotNull
    public final List<RouteBlockDTO> getRouteBlocks() {
        return this.routeBlocks;
    }

    @NotNull
    public final SimplePrice getSimplePrice() {
        return this.simplePrice;
    }

    @NotNull
    public final ButtonV3Atom.SmallButton getSmallButton() {
        return this.smallButton;
    }

    public final Map<String, TokenizedTrackingInfo> getViewTrackingInfo() {
        return this.viewTrackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.simplePrice.hashCode() + g.b(this.routeBlocks.hashCode() * 31, 31, this.luggageTabs)) * 31;
        BonusPrice bonusPrice = this.bonusPrice;
        int hashCode2 = (hashCode + (bonusPrice == null ? 0 : bonusPrice.hashCode())) * 31;
        TextAtom textAtom = this.remainingTickets;
        int c11 = C2618u.c(this.smallButton, (hashCode2 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31);
        ButtonV3Atom.SmallButton smallButton = this.bonusSmallButton;
        int hashCode3 = (c11 + (smallButton == null ? 0 : smallButton.hashCode())) * 31;
        List<Badge> list = this.routeBadges;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.borderColor;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bonusBackgroundColor;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Badge badge = this.premiumBadge;
        int hashCode7 = (hashCode6 + (badge == null ? 0 : badge.hashCode())) * 31;
        Badge badge2 = this.bonusPremiumBadge;
        int hashCode8 = (hashCode7 + (badge2 == null ? 0 : badge2.hashCode())) * 31;
        Price price = this.crossedPrice;
        int b11 = Ih.a.b(this.cardClickAction, (hashCode8 + (price == null ? 0 : price.hashCode())) * 31, 31);
        AtomActionDTO atomActionDTO = this.bonusCardClickAction;
        int hashCode9 = (b11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.cardClickTrackingInfo;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.viewTrackingInfo;
        return hashCode10 + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<RouteBlockDTO> list = this.routeBlocks;
        List<LuggageTabDTO> list2 = this.luggageTabs;
        SimplePrice simplePrice = this.simplePrice;
        BonusPrice bonusPrice = this.bonusPrice;
        TextAtom textAtom = this.remainingTickets;
        ButtonV3Atom.SmallButton smallButton = this.smallButton;
        ButtonV3Atom.SmallButton smallButton2 = this.bonusSmallButton;
        List<Badge> list3 = this.routeBadges;
        String str = this.borderColor;
        String str2 = this.bonusBackgroundColor;
        Badge badge = this.premiumBadge;
        Badge badge2 = this.bonusPremiumBadge;
        Price price = this.crossedPrice;
        AtomActionDTO atomActionDTO = this.cardClickAction;
        AtomActionDTO atomActionDTO2 = this.bonusCardClickAction;
        Map<String, TokenizedTrackingInfo> map = this.cardClickTrackingInfo;
        Map<String, TokenizedTrackingInfo> map2 = this.viewTrackingInfo;
        StringBuilder d11 = c.d("FlightV3DTO(routeBlocks=", list, ", luggageTabs=", ", simplePrice=", list2);
        d11.append(simplePrice);
        d11.append(", bonusPrice=");
        d11.append(bonusPrice);
        d11.append(", remainingTickets=");
        d11.append(textAtom);
        d11.append(", smallButton=");
        d11.append(smallButton);
        d11.append(", bonusSmallButton=");
        d11.append(smallButton2);
        d11.append(", routeBadges=");
        d11.append(list3);
        d11.append(", borderColor=");
        Nh.a.h(d11, str, ", bonusBackgroundColor=", str2, ", premiumBadge=");
        d11.append(badge);
        d11.append(", bonusPremiumBadge=");
        d11.append(badge2);
        d11.append(", crossedPrice=");
        d11.append(price);
        d11.append(", cardClickAction=");
        d11.append(atomActionDTO);
        d11.append(", bonusCardClickAction=");
        b.f(d11, atomActionDTO2, ", cardClickTrackingInfo=", map, ", viewTrackingInfo=");
        return P.f(d11, map2, ")");
    }
}
