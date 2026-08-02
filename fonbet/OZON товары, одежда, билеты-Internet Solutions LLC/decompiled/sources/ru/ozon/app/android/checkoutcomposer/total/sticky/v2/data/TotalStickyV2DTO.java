package ru.ozon.app.android.checkoutcomposer.total.sticky.v2.data;

import B90.C2618u;
import HY.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.partnerBanks.data.PartnerBanksDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u00018Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0082\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010 \u001a\u0004\b#\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00069"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/TotalStickyV2DTO;", "", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/TotalStickyV2DTO$Summary;", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "badgeInfo", "Lru/ozon/uni/atoms/data/badge/Badge;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "disableSeparator", "", "backgroundColor", "showIsland", "disabledButtonStyle", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/DisabledButtonStyleDTO;", "newButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/TotalStickyV2DTO$Summary;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/DisabledButtonStyleDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getSummary", "()Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/TotalStickyV2DTO$Summary;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getBadgeInfo", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getTrackingInfo", "()Ljava/util/Map;", "getDisableSeparator", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBackgroundColor", "()Ljava/lang/String;", "getShowIsland", "getDisabledButtonStyle", "()Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/DisabledButtonStyleDTO;", "getNewButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/TotalStickyV2DTO$Summary;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/DisabledButtonStyleDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/TotalStickyV2DTO;", "equals", "other", "hashCode", "", "toString", "Summary", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TotalStickyV2DTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final Badge badgeInfo;

    @NotNull
    private final ButtonV3Atom.SmallButton button;
    private final Boolean disableSeparator;
    private final DisabledButtonStyleDTO disabledButtonStyle;
    private final ButtonV3DTO newButton;
    private final Boolean showIsland;

    @NotNull
    private final Summary summary;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/TotalStickyV2DTO$Summary;", "", "price", "Lru/ozon/uni/atoms/data/price/Price;", "infoText", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "secondPrice", "partnerBanksMolecule", "Lru/ozon/app/android/partnerBanks/data/PartnerBanksDTO;", "<init>", "(Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/app/android/partnerBanks/data/PartnerBanksDTO;)V", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getInfoText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSecondPrice", "getPartnerBanksMolecule", "()Lru/ozon/app/android/partnerBanks/data/PartnerBanksDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Summary {
        public static final int $stable;
        private final TextAtom infoText;
        private final PartnerBanksDTO partnerBanksMolecule;

        @NotNull
        private final Price price;
        private final Price secondPrice;

        static {
            int i11 = PartnerBanksDTO.$stable;
            int i12 = Price.$stable;
            $stable = i11 | i12 | TextAtom.$stable | i12;
        }

        public Summary(@NotNull Price price, TextAtom textAtom, Price price2, PartnerBanksDTO partnerBanksDTO) {
            Intrinsics.checkNotNullParameter(price, "price");
            this.price = price;
            this.infoText = textAtom;
            this.secondPrice = price2;
            this.partnerBanksMolecule = partnerBanksDTO;
        }

        public static /* synthetic */ Summary copy$default(Summary summary, Price price, TextAtom textAtom, Price price2, PartnerBanksDTO partnerBanksDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                price = summary.price;
            }
            if ((i11 & 2) != 0) {
                textAtom = summary.infoText;
            }
            if ((i11 & 4) != 0) {
                price2 = summary.secondPrice;
            }
            if ((i11 & 8) != 0) {
                partnerBanksDTO = summary.partnerBanksMolecule;
            }
            return summary.copy(price, textAtom, price2, partnerBanksDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Price getPrice() {
            return this.price;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getInfoText() {
            return this.infoText;
        }

        /* renamed from: component3, reason: from getter */
        public final Price getSecondPrice() {
            return this.secondPrice;
        }

        /* renamed from: component4, reason: from getter */
        public final PartnerBanksDTO getPartnerBanksMolecule() {
            return this.partnerBanksMolecule;
        }

        @NotNull
        public final Summary copy(@NotNull Price price, TextAtom infoText, Price secondPrice, PartnerBanksDTO partnerBanksMolecule) {
            Intrinsics.checkNotNullParameter(price, "price");
            return new Summary(price, infoText, secondPrice, partnerBanksMolecule);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Summary)) {
                return false;
            }
            Summary summary = (Summary) other;
            return Intrinsics.d(this.price, summary.price) && Intrinsics.d(this.infoText, summary.infoText) && Intrinsics.d(this.secondPrice, summary.secondPrice) && Intrinsics.d(this.partnerBanksMolecule, summary.partnerBanksMolecule);
        }

        public final TextAtom getInfoText() {
            return this.infoText;
        }

        public final PartnerBanksDTO getPartnerBanksMolecule() {
            return this.partnerBanksMolecule;
        }

        @NotNull
        public final Price getPrice() {
            return this.price;
        }

        public final Price getSecondPrice() {
            return this.secondPrice;
        }

        public int hashCode() {
            int hashCode = this.price.hashCode() * 31;
            TextAtom textAtom = this.infoText;
            int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            Price price = this.secondPrice;
            int hashCode3 = (hashCode2 + (price == null ? 0 : price.hashCode())) * 31;
            PartnerBanksDTO partnerBanksDTO = this.partnerBanksMolecule;
            return hashCode3 + (partnerBanksDTO != null ? partnerBanksDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Summary(price=" + this.price + ", infoText=" + this.infoText + ", secondPrice=" + this.secondPrice + ", partnerBanksMolecule=" + this.partnerBanksMolecule + ")";
        }
    }

    public TotalStickyV2DTO(@NotNull Summary summary, @NotNull ButtonV3Atom.SmallButton button, Badge badge, Map<String, TokenizedTrackingInfo> map, Boolean bool, String str, Boolean bool2, DisabledButtonStyleDTO disabledButtonStyleDTO, ButtonV3DTO buttonV3DTO) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(button, "button");
        this.summary = summary;
        this.button = button;
        this.badgeInfo = badge;
        this.trackingInfo = map;
        this.disableSeparator = bool;
        this.backgroundColor = str;
        this.showIsland = bool2;
        this.disabledButtonStyle = disabledButtonStyleDTO;
        this.newButton = buttonV3DTO;
    }

    public static /* synthetic */ TotalStickyV2DTO copy$default(TotalStickyV2DTO totalStickyV2DTO, Summary summary, ButtonV3Atom.SmallButton smallButton, Badge badge, Map map, Boolean bool, String str, Boolean bool2, DisabledButtonStyleDTO disabledButtonStyleDTO, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            summary = totalStickyV2DTO.summary;
        }
        if ((i11 & 2) != 0) {
            smallButton = totalStickyV2DTO.button;
        }
        if ((i11 & 4) != 0) {
            badge = totalStickyV2DTO.badgeInfo;
        }
        if ((i11 & 8) != 0) {
            map = totalStickyV2DTO.trackingInfo;
        }
        if ((i11 & 16) != 0) {
            bool = totalStickyV2DTO.disableSeparator;
        }
        if ((i11 & 32) != 0) {
            str = totalStickyV2DTO.backgroundColor;
        }
        if ((i11 & 64) != 0) {
            bool2 = totalStickyV2DTO.showIsland;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            disabledButtonStyleDTO = totalStickyV2DTO.disabledButtonStyle;
        }
        if ((i11 & 256) != 0) {
            buttonV3DTO = totalStickyV2DTO.newButton;
        }
        DisabledButtonStyleDTO disabledButtonStyleDTO2 = disabledButtonStyleDTO;
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        String str2 = str;
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        Badge badge2 = badge;
        return totalStickyV2DTO.copy(summary, smallButton, badge2, map, bool4, str2, bool3, disabledButtonStyleDTO2, buttonV3DTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Summary getSummary() {
        return this.summary;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    /* renamed from: component3, reason: from getter */
    public final Badge getBadgeInfo() {
        return this.badgeInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getDisableSeparator() {
        return this.disableSeparator;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getShowIsland() {
        return this.showIsland;
    }

    /* renamed from: component8, reason: from getter */
    public final DisabledButtonStyleDTO getDisabledButtonStyle() {
        return this.disabledButtonStyle;
    }

    /* renamed from: component9, reason: from getter */
    public final ButtonV3DTO getNewButton() {
        return this.newButton;
    }

    @NotNull
    public final TotalStickyV2DTO copy(@NotNull Summary summary, @NotNull ButtonV3Atom.SmallButton button, Badge badgeInfo, Map<String, TokenizedTrackingInfo> trackingInfo, Boolean disableSeparator, String backgroundColor, Boolean showIsland, DisabledButtonStyleDTO disabledButtonStyle, ButtonV3DTO newButton) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(button, "button");
        return new TotalStickyV2DTO(summary, button, badgeInfo, trackingInfo, disableSeparator, backgroundColor, showIsland, disabledButtonStyle, newButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalStickyV2DTO)) {
            return false;
        }
        TotalStickyV2DTO totalStickyV2DTO = (TotalStickyV2DTO) other;
        return Intrinsics.d(this.summary, totalStickyV2DTO.summary) && Intrinsics.d(this.button, totalStickyV2DTO.button) && Intrinsics.d(this.badgeInfo, totalStickyV2DTO.badgeInfo) && Intrinsics.d(this.trackingInfo, totalStickyV2DTO.trackingInfo) && Intrinsics.d(this.disableSeparator, totalStickyV2DTO.disableSeparator) && Intrinsics.d(this.backgroundColor, totalStickyV2DTO.backgroundColor) && Intrinsics.d(this.showIsland, totalStickyV2DTO.showIsland) && Intrinsics.d(this.disabledButtonStyle, totalStickyV2DTO.disabledButtonStyle) && Intrinsics.d(this.newButton, totalStickyV2DTO.newButton);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Badge getBadgeInfo() {
        return this.badgeInfo;
    }

    @NotNull
    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    public final Boolean getDisableSeparator() {
        return this.disableSeparator;
    }

    public final DisabledButtonStyleDTO getDisabledButtonStyle() {
        return this.disabledButtonStyle;
    }

    public final ButtonV3DTO getNewButton() {
        return this.newButton;
    }

    public final Boolean getShowIsland() {
        return this.showIsland;
    }

    @NotNull
    public final Summary getSummary() {
        return this.summary;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int c11 = C2618u.c(this.button, this.summary.hashCode() * 31, 31);
        Badge badge = this.badgeInfo;
        int hashCode = (c11 + (badge == null ? 0 : badge.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.disableSeparator;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.showIsland;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        DisabledButtonStyleDTO disabledButtonStyleDTO = this.disabledButtonStyle;
        int hashCode6 = (hashCode5 + (disabledButtonStyleDTO == null ? 0 : disabledButtonStyleDTO.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.newButton;
        return hashCode6 + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Summary summary = this.summary;
        ButtonV3Atom.SmallButton smallButton = this.button;
        Badge badge = this.badgeInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Boolean bool = this.disableSeparator;
        String str = this.backgroundColor;
        Boolean bool2 = this.showIsland;
        DisabledButtonStyleDTO disabledButtonStyleDTO = this.disabledButtonStyle;
        ButtonV3DTO buttonV3DTO = this.newButton;
        StringBuilder sb2 = new StringBuilder("TotalStickyV2DTO(summary=");
        sb2.append(summary);
        sb2.append(", button=");
        sb2.append(smallButton);
        sb2.append(", badgeInfo=");
        sb2.append(badge);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", disableSeparator=");
        b.c(bool, ", backgroundColor=", str, ", showIsland=", sb2);
        sb2.append(bool2);
        sb2.append(", disabledButtonStyle=");
        sb2.append(disabledButtonStyleDTO);
        sb2.append(", newButton=");
        sb2.append(buttonV3DTO);
        sb2.append(")");
        return sb2.toString();
    }
}
