package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.v3;

import B90.C2618u;
import Ih.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.v3.FlightV3DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bu\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u00100\u001a\u00020\u0010HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0017\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0003J\u008b\u0001\u00103\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006:"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/AviaSearchV3SelectLuggageResponse;", "", "luggageTabs", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$LuggageTabDTO;", "premiumBadge", "Lru/ozon/uni/atoms/data/badge/Badge;", "bonusPremiumBadge", "simplePrice", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$SimplePrice;", "bonusPrice", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$BonusPrice;", "smallButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "bonusSmallButton", "cardClickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "bonusCardClickAction", "cardClickTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$SimplePrice;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$BonusPrice;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getLuggageTabs", "()Ljava/util/List;", "getPremiumBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getBonusPremiumBadge", "getSimplePrice", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$SimplePrice;", "getBonusPrice", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$BonusPrice;", "getSmallButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getBonusSmallButton", "getCardClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBonusCardClickAction", "getCardClickTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AviaSearchV3SelectLuggageResponse {
    public static final int $stable = 8;
    private final AtomActionDTO bonusCardClickAction;
    private final Badge bonusPremiumBadge;
    private final FlightV3DTO.BonusPrice bonusPrice;
    private final ButtonV3Atom.SmallButton bonusSmallButton;

    @NotNull
    private final AtomActionDTO cardClickAction;
    private final Map<String, TokenizedTrackingInfo> cardClickTrackingInfo;

    @NotNull
    private final List<FlightV3DTO.LuggageTabDTO> luggageTabs;
    private final Badge premiumBadge;

    @NotNull
    private final FlightV3DTO.SimplePrice simplePrice;

    @NotNull
    private final ButtonV3Atom.SmallButton smallButton;

    public AviaSearchV3SelectLuggageResponse(@NotNull List<FlightV3DTO.LuggageTabDTO> luggageTabs, Badge badge, Badge badge2, @NotNull FlightV3DTO.SimplePrice simplePrice, FlightV3DTO.BonusPrice bonusPrice, @NotNull ButtonV3Atom.SmallButton smallButton, ButtonV3Atom.SmallButton smallButton2, @NotNull AtomActionDTO cardClickAction, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(luggageTabs, "luggageTabs");
        Intrinsics.checkNotNullParameter(simplePrice, "simplePrice");
        Intrinsics.checkNotNullParameter(smallButton, "smallButton");
        Intrinsics.checkNotNullParameter(cardClickAction, "cardClickAction");
        this.luggageTabs = luggageTabs;
        this.premiumBadge = badge;
        this.bonusPremiumBadge = badge2;
        this.simplePrice = simplePrice;
        this.bonusPrice = bonusPrice;
        this.smallButton = smallButton;
        this.bonusSmallButton = smallButton2;
        this.cardClickAction = cardClickAction;
        this.bonusCardClickAction = atomActionDTO;
        this.cardClickTrackingInfo = map;
    }

    public static /* synthetic */ AviaSearchV3SelectLuggageResponse copy$default(AviaSearchV3SelectLuggageResponse aviaSearchV3SelectLuggageResponse, List list, Badge badge, Badge badge2, FlightV3DTO.SimplePrice simplePrice, FlightV3DTO.BonusPrice bonusPrice, ButtonV3Atom.SmallButton smallButton, ButtonV3Atom.SmallButton smallButton2, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = aviaSearchV3SelectLuggageResponse.luggageTabs;
        }
        if ((i11 & 2) != 0) {
            badge = aviaSearchV3SelectLuggageResponse.premiumBadge;
        }
        if ((i11 & 4) != 0) {
            badge2 = aviaSearchV3SelectLuggageResponse.bonusPremiumBadge;
        }
        if ((i11 & 8) != 0) {
            simplePrice = aviaSearchV3SelectLuggageResponse.simplePrice;
        }
        if ((i11 & 16) != 0) {
            bonusPrice = aviaSearchV3SelectLuggageResponse.bonusPrice;
        }
        if ((i11 & 32) != 0) {
            smallButton = aviaSearchV3SelectLuggageResponse.smallButton;
        }
        if ((i11 & 64) != 0) {
            smallButton2 = aviaSearchV3SelectLuggageResponse.bonusSmallButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            atomActionDTO = aviaSearchV3SelectLuggageResponse.cardClickAction;
        }
        if ((i11 & 256) != 0) {
            atomActionDTO2 = aviaSearchV3SelectLuggageResponse.bonusCardClickAction;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            map = aviaSearchV3SelectLuggageResponse.cardClickTrackingInfo;
        }
        AtomActionDTO atomActionDTO3 = atomActionDTO2;
        Map map2 = map;
        ButtonV3Atom.SmallButton smallButton3 = smallButton2;
        AtomActionDTO atomActionDTO4 = atomActionDTO;
        FlightV3DTO.BonusPrice bonusPrice2 = bonusPrice;
        ButtonV3Atom.SmallButton smallButton4 = smallButton;
        return aviaSearchV3SelectLuggageResponse.copy(list, badge, badge2, simplePrice, bonusPrice2, smallButton4, smallButton3, atomActionDTO4, atomActionDTO3, map2);
    }

    @NotNull
    public final List<FlightV3DTO.LuggageTabDTO> component1() {
        return this.luggageTabs;
    }

    public final Map<String, TokenizedTrackingInfo> component10() {
        return this.cardClickTrackingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final Badge getPremiumBadge() {
        return this.premiumBadge;
    }

    /* renamed from: component3, reason: from getter */
    public final Badge getBonusPremiumBadge() {
        return this.bonusPremiumBadge;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final FlightV3DTO.SimplePrice getSimplePrice() {
        return this.simplePrice;
    }

    /* renamed from: component5, reason: from getter */
    public final FlightV3DTO.BonusPrice getBonusPrice() {
        return this.bonusPrice;
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

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final AtomActionDTO getCardClickAction() {
        return this.cardClickAction;
    }

    /* renamed from: component9, reason: from getter */
    public final AtomActionDTO getBonusCardClickAction() {
        return this.bonusCardClickAction;
    }

    @NotNull
    public final AviaSearchV3SelectLuggageResponse copy(@NotNull List<FlightV3DTO.LuggageTabDTO> luggageTabs, Badge premiumBadge, Badge bonusPremiumBadge, @NotNull FlightV3DTO.SimplePrice simplePrice, FlightV3DTO.BonusPrice bonusPrice, @NotNull ButtonV3Atom.SmallButton smallButton, ButtonV3Atom.SmallButton bonusSmallButton, @NotNull AtomActionDTO cardClickAction, AtomActionDTO bonusCardClickAction, Map<String, TokenizedTrackingInfo> cardClickTrackingInfo) {
        Intrinsics.checkNotNullParameter(luggageTabs, "luggageTabs");
        Intrinsics.checkNotNullParameter(simplePrice, "simplePrice");
        Intrinsics.checkNotNullParameter(smallButton, "smallButton");
        Intrinsics.checkNotNullParameter(cardClickAction, "cardClickAction");
        return new AviaSearchV3SelectLuggageResponse(luggageTabs, premiumBadge, bonusPremiumBadge, simplePrice, bonusPrice, smallButton, bonusSmallButton, cardClickAction, bonusCardClickAction, cardClickTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AviaSearchV3SelectLuggageResponse)) {
            return false;
        }
        AviaSearchV3SelectLuggageResponse aviaSearchV3SelectLuggageResponse = (AviaSearchV3SelectLuggageResponse) other;
        return Intrinsics.d(this.luggageTabs, aviaSearchV3SelectLuggageResponse.luggageTabs) && Intrinsics.d(this.premiumBadge, aviaSearchV3SelectLuggageResponse.premiumBadge) && Intrinsics.d(this.bonusPremiumBadge, aviaSearchV3SelectLuggageResponse.bonusPremiumBadge) && Intrinsics.d(this.simplePrice, aviaSearchV3SelectLuggageResponse.simplePrice) && Intrinsics.d(this.bonusPrice, aviaSearchV3SelectLuggageResponse.bonusPrice) && Intrinsics.d(this.smallButton, aviaSearchV3SelectLuggageResponse.smallButton) && Intrinsics.d(this.bonusSmallButton, aviaSearchV3SelectLuggageResponse.bonusSmallButton) && Intrinsics.d(this.cardClickAction, aviaSearchV3SelectLuggageResponse.cardClickAction) && Intrinsics.d(this.bonusCardClickAction, aviaSearchV3SelectLuggageResponse.bonusCardClickAction) && Intrinsics.d(this.cardClickTrackingInfo, aviaSearchV3SelectLuggageResponse.cardClickTrackingInfo);
    }

    public final AtomActionDTO getBonusCardClickAction() {
        return this.bonusCardClickAction;
    }

    public final Badge getBonusPremiumBadge() {
        return this.bonusPremiumBadge;
    }

    public final FlightV3DTO.BonusPrice getBonusPrice() {
        return this.bonusPrice;
    }

    public final ButtonV3Atom.SmallButton getBonusSmallButton() {
        return this.bonusSmallButton;
    }

    @NotNull
    public final AtomActionDTO getCardClickAction() {
        return this.cardClickAction;
    }

    public final Map<String, TokenizedTrackingInfo> getCardClickTrackingInfo() {
        return this.cardClickTrackingInfo;
    }

    @NotNull
    public final List<FlightV3DTO.LuggageTabDTO> getLuggageTabs() {
        return this.luggageTabs;
    }

    public final Badge getPremiumBadge() {
        return this.premiumBadge;
    }

    @NotNull
    public final FlightV3DTO.SimplePrice getSimplePrice() {
        return this.simplePrice;
    }

    @NotNull
    public final ButtonV3Atom.SmallButton getSmallButton() {
        return this.smallButton;
    }

    public int hashCode() {
        int hashCode = this.luggageTabs.hashCode() * 31;
        Badge badge = this.premiumBadge;
        int hashCode2 = (hashCode + (badge == null ? 0 : badge.hashCode())) * 31;
        Badge badge2 = this.bonusPremiumBadge;
        int hashCode3 = (this.simplePrice.hashCode() + ((hashCode2 + (badge2 == null ? 0 : badge2.hashCode())) * 31)) * 31;
        FlightV3DTO.BonusPrice bonusPrice = this.bonusPrice;
        int c11 = C2618u.c(this.smallButton, (hashCode3 + (bonusPrice == null ? 0 : bonusPrice.hashCode())) * 31, 31);
        ButtonV3Atom.SmallButton smallButton = this.bonusSmallButton;
        int b11 = a.b(this.cardClickAction, (c11 + (smallButton == null ? 0 : smallButton.hashCode())) * 31, 31);
        AtomActionDTO atomActionDTO = this.bonusCardClickAction;
        int hashCode4 = (b11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.cardClickTrackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<FlightV3DTO.LuggageTabDTO> list = this.luggageTabs;
        Badge badge = this.premiumBadge;
        Badge badge2 = this.bonusPremiumBadge;
        FlightV3DTO.SimplePrice simplePrice = this.simplePrice;
        FlightV3DTO.BonusPrice bonusPrice = this.bonusPrice;
        ButtonV3Atom.SmallButton smallButton = this.smallButton;
        ButtonV3Atom.SmallButton smallButton2 = this.bonusSmallButton;
        AtomActionDTO atomActionDTO = this.cardClickAction;
        AtomActionDTO atomActionDTO2 = this.bonusCardClickAction;
        Map<String, TokenizedTrackingInfo> map = this.cardClickTrackingInfo;
        StringBuilder sb2 = new StringBuilder("AviaSearchV3SelectLuggageResponse(luggageTabs=");
        sb2.append(list);
        sb2.append(", premiumBadge=");
        sb2.append(badge);
        sb2.append(", bonusPremiumBadge=");
        sb2.append(badge2);
        sb2.append(", simplePrice=");
        sb2.append(simplePrice);
        sb2.append(", bonusPrice=");
        sb2.append(bonusPrice);
        sb2.append(", smallButton=");
        sb2.append(smallButton);
        sb2.append(", bonusSmallButton=");
        sb2.append(smallButton2);
        sb2.append(", cardClickAction=");
        sb2.append(atomActionDTO);
        sb2.append(", bonusCardClickAction=");
        return D40.a.d(sb2, atomActionDTO2, ", cardClickTrackingInfo=", map, ")");
    }
}
