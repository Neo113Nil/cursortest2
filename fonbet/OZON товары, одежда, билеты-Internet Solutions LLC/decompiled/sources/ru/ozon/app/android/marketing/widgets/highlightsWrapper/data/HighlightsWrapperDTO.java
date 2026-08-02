package ru.ozon.app.android.marketing.widgets.highlightsWrapper.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.actionProgress.data.ActionProgressDTO;
import ru.ozon.app.android.marketing.widgets.coupon.data.CouponDTO;
import ru.ozon.app.android.marketing.widgets.highlightProducts.data.HighlightProductsDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JQ\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperDTO;", "", "actionProgress", "Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO;", "coupon", "Lru/ozon/app/android/marketing/widgets/coupon/data/CouponDTO;", "highlightProducts", "Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO;", "currentMiniWidget", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "cartButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "progressText", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText;", "<init>", "(Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO;Lru/ozon/app/android/marketing/widgets/coupon/data/CouponDTO;Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO;Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText;)V", "getActionProgress", "()Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO;", "getCoupon", "()Lru/ozon/app/android/marketing/widgets/coupon/data/CouponDTO;", "getHighlightProducts", "()Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO;", "getCurrentMiniWidget", "()Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "getCartButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getProgressText", "()Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HighlightsWrapperDTO {
    public static final int $stable = 8;
    private final ActionProgressDTO actionProgress;
    private final ButtonV3Atom.LargeButton cartButton;
    private final CouponDTO coupon;
    private final HighlightsCurrentMiniWidget currentMiniWidget;
    private final HighlightProductsDTO highlightProducts;
    private final HighlightsWrapperProgressText progressText;

    public HighlightsWrapperDTO(ActionProgressDTO actionProgressDTO, CouponDTO couponDTO, HighlightProductsDTO highlightProductsDTO, HighlightsCurrentMiniWidget highlightsCurrentMiniWidget, ButtonV3Atom.LargeButton largeButton, HighlightsWrapperProgressText highlightsWrapperProgressText) {
        this.actionProgress = actionProgressDTO;
        this.coupon = couponDTO;
        this.highlightProducts = highlightProductsDTO;
        this.currentMiniWidget = highlightsCurrentMiniWidget;
        this.cartButton = largeButton;
        this.progressText = highlightsWrapperProgressText;
    }

    public static /* synthetic */ HighlightsWrapperDTO copy$default(HighlightsWrapperDTO highlightsWrapperDTO, ActionProgressDTO actionProgressDTO, CouponDTO couponDTO, HighlightProductsDTO highlightProductsDTO, HighlightsCurrentMiniWidget highlightsCurrentMiniWidget, ButtonV3Atom.LargeButton largeButton, HighlightsWrapperProgressText highlightsWrapperProgressText, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            actionProgressDTO = highlightsWrapperDTO.actionProgress;
        }
        if ((i11 & 2) != 0) {
            couponDTO = highlightsWrapperDTO.coupon;
        }
        if ((i11 & 4) != 0) {
            highlightProductsDTO = highlightsWrapperDTO.highlightProducts;
        }
        if ((i11 & 8) != 0) {
            highlightsCurrentMiniWidget = highlightsWrapperDTO.currentMiniWidget;
        }
        if ((i11 & 16) != 0) {
            largeButton = highlightsWrapperDTO.cartButton;
        }
        if ((i11 & 32) != 0) {
            highlightsWrapperProgressText = highlightsWrapperDTO.progressText;
        }
        ButtonV3Atom.LargeButton largeButton2 = largeButton;
        HighlightsWrapperProgressText highlightsWrapperProgressText2 = highlightsWrapperProgressText;
        return highlightsWrapperDTO.copy(actionProgressDTO, couponDTO, highlightProductsDTO, highlightsCurrentMiniWidget, largeButton2, highlightsWrapperProgressText2);
    }

    /* renamed from: component1, reason: from getter */
    public final ActionProgressDTO getActionProgress() {
        return this.actionProgress;
    }

    /* renamed from: component2, reason: from getter */
    public final CouponDTO getCoupon() {
        return this.coupon;
    }

    /* renamed from: component3, reason: from getter */
    public final HighlightProductsDTO getHighlightProducts() {
        return this.highlightProducts;
    }

    /* renamed from: component4, reason: from getter */
    public final HighlightsCurrentMiniWidget getCurrentMiniWidget() {
        return this.currentMiniWidget;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonV3Atom.LargeButton getCartButton() {
        return this.cartButton;
    }

    /* renamed from: component6, reason: from getter */
    public final HighlightsWrapperProgressText getProgressText() {
        return this.progressText;
    }

    @NotNull
    public final HighlightsWrapperDTO copy(ActionProgressDTO actionProgress, CouponDTO coupon, HighlightProductsDTO highlightProducts, HighlightsCurrentMiniWidget currentMiniWidget, ButtonV3Atom.LargeButton cartButton, HighlightsWrapperProgressText progressText) {
        return new HighlightsWrapperDTO(actionProgress, coupon, highlightProducts, currentMiniWidget, cartButton, progressText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighlightsWrapperDTO)) {
            return false;
        }
        HighlightsWrapperDTO highlightsWrapperDTO = (HighlightsWrapperDTO) other;
        return Intrinsics.d(this.actionProgress, highlightsWrapperDTO.actionProgress) && Intrinsics.d(this.coupon, highlightsWrapperDTO.coupon) && Intrinsics.d(this.highlightProducts, highlightsWrapperDTO.highlightProducts) && this.currentMiniWidget == highlightsWrapperDTO.currentMiniWidget && Intrinsics.d(this.cartButton, highlightsWrapperDTO.cartButton) && Intrinsics.d(this.progressText, highlightsWrapperDTO.progressText);
    }

    public final ActionProgressDTO getActionProgress() {
        return this.actionProgress;
    }

    public final ButtonV3Atom.LargeButton getCartButton() {
        return this.cartButton;
    }

    public final CouponDTO getCoupon() {
        return this.coupon;
    }

    public final HighlightsCurrentMiniWidget getCurrentMiniWidget() {
        return this.currentMiniWidget;
    }

    public final HighlightProductsDTO getHighlightProducts() {
        return this.highlightProducts;
    }

    public final HighlightsWrapperProgressText getProgressText() {
        return this.progressText;
    }

    public int hashCode() {
        ActionProgressDTO actionProgressDTO = this.actionProgress;
        int hashCode = (actionProgressDTO == null ? 0 : actionProgressDTO.hashCode()) * 31;
        CouponDTO couponDTO = this.coupon;
        int hashCode2 = (hashCode + (couponDTO == null ? 0 : couponDTO.hashCode())) * 31;
        HighlightProductsDTO highlightProductsDTO = this.highlightProducts;
        int hashCode3 = (hashCode2 + (highlightProductsDTO == null ? 0 : highlightProductsDTO.hashCode())) * 31;
        HighlightsCurrentMiniWidget highlightsCurrentMiniWidget = this.currentMiniWidget;
        int hashCode4 = (hashCode3 + (highlightsCurrentMiniWidget == null ? 0 : highlightsCurrentMiniWidget.hashCode())) * 31;
        ButtonV3Atom.LargeButton largeButton = this.cartButton;
        int hashCode5 = (hashCode4 + (largeButton == null ? 0 : largeButton.hashCode())) * 31;
        HighlightsWrapperProgressText highlightsWrapperProgressText = this.progressText;
        return hashCode5 + (highlightsWrapperProgressText != null ? highlightsWrapperProgressText.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HighlightsWrapperDTO(actionProgress=" + this.actionProgress + ", coupon=" + this.coupon + ", highlightProducts=" + this.highlightProducts + ", currentMiniWidget=" + this.currentMiniWidget + ", cartButton=" + this.cartButton + ", progressText=" + this.progressText + ")";
    }
}
