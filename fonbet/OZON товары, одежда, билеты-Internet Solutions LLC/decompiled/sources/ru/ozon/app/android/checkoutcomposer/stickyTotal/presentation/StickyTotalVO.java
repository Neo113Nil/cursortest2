package ru.ozon.app.android.checkoutcomposer.stickyTotal.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.atoms.data.deprecated.Button;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00016Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010\u0017R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b0\u0010\u0017R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b1\u0010/R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010+\u001a\u0004\b5\u0010\u0017¨\u00067"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyTotal/presentation/StickyTotalVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeInfo", "Lru/ozon/app/android/checkoutcomposer/stickyTotal/presentation/StickyTotalVO$Summary;", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "Lru/ozon/uni/atoms/data/deprecated/Button;", "button", "", "buttonColor", "", "disableSeparator", "backgroundColor", "showIsland", "Lru/ozon/uni/atoms/data/text/TextDTO;", "taxAmount", "buttonTextColor", "<init>", "(JLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/checkoutcomposer/stickyTotal/presentation/StickyTotalVO$Summary;Lru/ozon/uni/atoms/data/deprecated/Button;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadgeInfo", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/app/android/checkoutcomposer/stickyTotal/presentation/StickyTotalVO$Summary;", "getSummary", "()Lru/ozon/app/android/checkoutcomposer/stickyTotal/presentation/StickyTotalVO$Summary;", "Lru/ozon/uni/atoms/data/deprecated/Button;", "getButton", "()Lru/ozon/uni/atoms/data/deprecated/Button;", "Ljava/lang/String;", "getButtonColor", "Ljava/lang/Boolean;", "getDisableSeparator", "()Ljava/lang/Boolean;", "getBackgroundColor", "getShowIsland", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTaxAmount", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getButtonTextColor", "Summary", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class StickyTotalVO implements c {
    public static final int $stable = Button.$stable | PriceDTO.$stable;
    private final String backgroundColor;
    private final BadgeDTO badgeInfo;

    @NotNull
    private final Button button;
    private final String buttonColor;
    private final String buttonTextColor;
    private final Boolean disableSeparator;
    private final long id;
    private final Boolean showIsland;

    @NotNull
    private final Summary summary;
    private final TextDTO taxAmount;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyTotal/presentation/StickyTotalVO$Summary;", "", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "newPrice", "Lru/ozon/uni/atoms/data/text/TextDTO;", "newAtomInfoText", "<init>", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getNewPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getNewAtomInfoText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Summary {
        public static final int $stable = PriceDTO.$stable;
        private final TextDTO newAtomInfoText;
        private final PriceDTO newPrice;

        public Summary(PriceDTO priceDTO, TextDTO textDTO) {
            this.newPrice = priceDTO;
            this.newAtomInfoText = textDTO;
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

    public StickyTotalVO(long j11, BadgeDTO badgeDTO, @NotNull Summary summary, @NotNull Button button, String str, Boolean bool, String str2, Boolean bool2, TextDTO textDTO, String str3) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.badgeInfo = badgeDTO;
        this.summary = summary;
        this.button = button;
        this.buttonColor = str;
        this.disableSeparator = bool;
        this.backgroundColor = str2;
        this.showIsland = bool2;
        this.taxAmount = textDTO;
        this.buttonTextColor = str3;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyTotalVO)) {
            return false;
        }
        StickyTotalVO stickyTotalVO = (StickyTotalVO) other;
        return this.id == stickyTotalVO.id && Intrinsics.d(this.badgeInfo, stickyTotalVO.badgeInfo) && Intrinsics.d(this.summary, stickyTotalVO.summary) && Intrinsics.d(this.button, stickyTotalVO.button) && Intrinsics.d(this.buttonColor, stickyTotalVO.buttonColor) && Intrinsics.d(this.disableSeparator, stickyTotalVO.disableSeparator) && Intrinsics.d(this.backgroundColor, stickyTotalVO.backgroundColor) && Intrinsics.d(this.showIsland, stickyTotalVO.showIsland) && Intrinsics.d(this.taxAmount, stickyTotalVO.taxAmount) && Intrinsics.d(this.buttonTextColor, stickyTotalVO.buttonTextColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BadgeDTO getBadgeInfo() {
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

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
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

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        BadgeDTO badgeDTO = this.badgeInfo;
        int hashCode2 = (this.button.hashCode() + ((this.summary.hashCode() + ((hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31)) * 31)) * 31;
        String str = this.buttonColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.disableSeparator;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.showIsland;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        TextDTO textDTO = this.taxAmount;
        int hashCode7 = (hashCode6 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        String str3 = this.buttonTextColor;
        return hashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "StickyTotalVO(id=" + this.id + ", badgeInfo=" + this.badgeInfo + ", summary=" + this.summary + ", button=" + this.button + ", buttonColor=" + this.buttonColor + ", disableSeparator=" + this.disableSeparator + ", backgroundColor=" + this.backgroundColor + ", showIsland=" + this.showIsland + ", taxAmount=" + this.taxAmount + ", buttonTextColor=" + this.buttonTextColor + ")";
    }
}
