package ru.ozon.app.android.checkoutcomposer.stickyTotal.data;

import C.o0;
import HY.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.deprecated.Button;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00013B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003Jv\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001a¨\u00064"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyTotal/data/StickyTotalDTO;", "", "badgeInfo", "Lru/ozon/uni/atoms/data/badge/Badge;", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "Lru/ozon/app/android/checkoutcomposer/stickyTotal/data/StickyTotalDTO$Summary;", "button", "Lru/ozon/uni/atoms/data/deprecated/Button;", "buttonColor", "", "disableSeparator", "", "backgroundColor", "showIsland", "taxAmount", "Lru/ozon/uni/atoms/data/text/TextDTO;", "buttonTextColor", "<init>", "(Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/app/android/checkoutcomposer/stickyTotal/data/StickyTotalDTO$Summary;Lru/ozon/uni/atoms/data/deprecated/Button;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "getBadgeInfo", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getSummary", "()Lru/ozon/app/android/checkoutcomposer/stickyTotal/data/StickyTotalDTO$Summary;", "getButton", "()Lru/ozon/uni/atoms/data/deprecated/Button;", "getButtonColor", "()Ljava/lang/String;", "getDisableSeparator", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBackgroundColor", "getShowIsland", "getTaxAmount", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getButtonTextColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/app/android/checkoutcomposer/stickyTotal/data/StickyTotalDTO$Summary;Lru/ozon/uni/atoms/data/deprecated/Button;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)Lru/ozon/app/android/checkoutcomposer/stickyTotal/data/StickyTotalDTO;", "equals", "other", "hashCode", "", "toString", "Summary", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class StickyTotalDTO {
    public static final int $stable = (Button.$stable | PriceDTO.$stable) | Badge.$stable;
    private final String backgroundColor;
    private final Badge badgeInfo;

    @NotNull
    private final Button button;
    private final String buttonColor;
    private final String buttonTextColor;
    private final Boolean disableSeparator;
    private final Boolean showIsland;

    @NotNull
    private final Summary summary;
    private final TextDTO taxAmount;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyTotal/data/StickyTotalDTO$Summary;", "", "newPrice", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "newAtomInfoText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getNewPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getNewAtomInfoText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Summary {
        public static final int $stable = PriceDTO.$stable;
        private final TextDTO newAtomInfoText;
        private final PriceDTO newPrice;

        public Summary(PriceDTO priceDTO, TextDTO textDTO) {
            this.newPrice = priceDTO;
            this.newAtomInfoText = textDTO;
        }

        public static /* synthetic */ Summary copy$default(Summary summary, PriceDTO priceDTO, TextDTO textDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                priceDTO = summary.newPrice;
            }
            if ((i11 & 2) != 0) {
                textDTO = summary.newAtomInfoText;
            }
            return summary.copy(priceDTO, textDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final PriceDTO getNewPrice() {
            return this.newPrice;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getNewAtomInfoText() {
            return this.newAtomInfoText;
        }

        @NotNull
        public final Summary copy(PriceDTO newPrice, TextDTO newAtomInfoText) {
            return new Summary(newPrice, newAtomInfoText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Summary)) {
                return false;
            }
            Summary summary = (Summary) other;
            return Intrinsics.d(this.newPrice, summary.newPrice) && Intrinsics.d(this.newAtomInfoText, summary.newAtomInfoText);
        }

        public final TextDTO getNewAtomInfoText() {
            return this.newAtomInfoText;
        }

        public final PriceDTO getNewPrice() {
            return this.newPrice;
        }

        public int hashCode() {
            PriceDTO priceDTO = this.newPrice;
            int hashCode = (priceDTO == null ? 0 : priceDTO.hashCode()) * 31;
            TextDTO textDTO = this.newAtomInfoText;
            return hashCode + (textDTO != null ? textDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Summary(newPrice=" + this.newPrice + ", newAtomInfoText=" + this.newAtomInfoText + ")";
        }
    }

    public StickyTotalDTO(Badge badge, @NotNull Summary summary, @NotNull Button button, String str, Boolean bool, String str2, Boolean bool2, TextDTO textDTO, String str3) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(button, "button");
        this.badgeInfo = badge;
        this.summary = summary;
        this.button = button;
        this.buttonColor = str;
        this.disableSeparator = bool;
        this.backgroundColor = str2;
        this.showIsland = bool2;
        this.taxAmount = textDTO;
        this.buttonTextColor = str3;
    }

    public static /* synthetic */ StickyTotalDTO copy$default(StickyTotalDTO stickyTotalDTO, Badge badge, Summary summary, Button button, String str, Boolean bool, String str2, Boolean bool2, TextDTO textDTO, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            badge = stickyTotalDTO.badgeInfo;
        }
        if ((i11 & 2) != 0) {
            summary = stickyTotalDTO.summary;
        }
        if ((i11 & 4) != 0) {
            button = stickyTotalDTO.button;
        }
        if ((i11 & 8) != 0) {
            str = stickyTotalDTO.buttonColor;
        }
        if ((i11 & 16) != 0) {
            bool = stickyTotalDTO.disableSeparator;
        }
        if ((i11 & 32) != 0) {
            str2 = stickyTotalDTO.backgroundColor;
        }
        if ((i11 & 64) != 0) {
            bool2 = stickyTotalDTO.showIsland;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            textDTO = stickyTotalDTO.taxAmount;
        }
        if ((i11 & 256) != 0) {
            str3 = stickyTotalDTO.buttonTextColor;
        }
        TextDTO textDTO2 = textDTO;
        String str4 = str3;
        String str5 = str2;
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        Button button2 = button;
        return stickyTotalDTO.copy(badge, summary, button2, str, bool4, str5, bool3, textDTO2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final Badge getBadgeInfo() {
        return this.badgeInfo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Summary getSummary() {
        return this.summary;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    /* renamed from: component4, reason: from getter */
    public final String getButtonColor() {
        return this.buttonColor;
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
    public final TextDTO getTaxAmount() {
        return this.taxAmount;
    }

    /* renamed from: component9, reason: from getter */
    public final String getButtonTextColor() {
        return this.buttonTextColor;
    }

    @NotNull
    public final StickyTotalDTO copy(Badge badgeInfo, @NotNull Summary summary, @NotNull Button button, String buttonColor, Boolean disableSeparator, String backgroundColor, Boolean showIsland, TextDTO taxAmount, String buttonTextColor) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(button, "button");
        return new StickyTotalDTO(badgeInfo, summary, button, buttonColor, disableSeparator, backgroundColor, showIsland, taxAmount, buttonTextColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyTotalDTO)) {
            return false;
        }
        StickyTotalDTO stickyTotalDTO = (StickyTotalDTO) other;
        return Intrinsics.d(this.badgeInfo, stickyTotalDTO.badgeInfo) && Intrinsics.d(this.summary, stickyTotalDTO.summary) && Intrinsics.d(this.button, stickyTotalDTO.button) && Intrinsics.d(this.buttonColor, stickyTotalDTO.buttonColor) && Intrinsics.d(this.disableSeparator, stickyTotalDTO.disableSeparator) && Intrinsics.d(this.backgroundColor, stickyTotalDTO.backgroundColor) && Intrinsics.d(this.showIsland, stickyTotalDTO.showIsland) && Intrinsics.d(this.taxAmount, stickyTotalDTO.taxAmount) && Intrinsics.d(this.buttonTextColor, stickyTotalDTO.buttonTextColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Badge getBadgeInfo() {
        return this.badgeInfo;
    }

    @NotNull
    public final Button getButton() {
        return this.button;
    }

    public final String getButtonColor() {
        return this.buttonColor;
    }

    public final String getButtonTextColor() {
        return this.buttonTextColor;
    }

    public final Boolean getDisableSeparator() {
        return this.disableSeparator;
    }

    public final Boolean getShowIsland() {
        return this.showIsland;
    }

    @NotNull
    public final Summary getSummary() {
        return this.summary;
    }

    public final TextDTO getTaxAmount() {
        return this.taxAmount;
    }

    public int hashCode() {
        Badge badge = this.badgeInfo;
        int hashCode = (this.button.hashCode() + ((this.summary.hashCode() + ((badge == null ? 0 : badge.hashCode()) * 31)) * 31)) * 31;
        String str = this.buttonColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.disableSeparator;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.showIsland;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        TextDTO textDTO = this.taxAmount;
        int hashCode6 = (hashCode5 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        String str3 = this.buttonTextColor;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Badge badge = this.badgeInfo;
        Summary summary = this.summary;
        Button button = this.button;
        String str = this.buttonColor;
        Boolean bool = this.disableSeparator;
        String str2 = this.backgroundColor;
        Boolean bool2 = this.showIsland;
        TextDTO textDTO = this.taxAmount;
        String str3 = this.buttonTextColor;
        StringBuilder sb2 = new StringBuilder("StickyTotalDTO(badgeInfo=");
        sb2.append(badge);
        sb2.append(", summary=");
        sb2.append(summary);
        sb2.append(", button=");
        sb2.append(button);
        sb2.append(", buttonColor=");
        sb2.append(str);
        sb2.append(", disableSeparator=");
        b.c(bool, ", backgroundColor=", str2, ", showIsland=", sb2);
        sb2.append(bool2);
        sb2.append(", taxAmount=");
        sb2.append(textDTO);
        sb2.append(", buttonTextColor=");
        return o0.c(sb2, str3, ")");
    }
}
