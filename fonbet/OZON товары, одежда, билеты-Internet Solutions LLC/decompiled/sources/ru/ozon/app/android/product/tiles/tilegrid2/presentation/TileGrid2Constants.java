package ru.ozon.app.android.product.tiles.tilegrid2.presentation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefrontcommonwidgets.utils.Dimens;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\bJ\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\bR\u0011\u0010\u0014\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\bR\u0011\u0010\u0016\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\bR\u0011\u0010\u0018\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\bR\u0011\u0010\u001a\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\bR\u0011\u0010\u001c\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\bR\u0011\u0010\u001e\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\bR\u0011\u0010 \u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\bR\u0011\u0010\"\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b!\u0010\bR\u0011\u0010$\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b#\u0010\bR\u0011\u0010&\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b%\u0010\bR\u0011\u0010(\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b'\u0010\bR\u0011\u0010*\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b)\u0010\bR\u0011\u0010,\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b+\u0010\bR\u0011\u0010.\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b-\u0010\bR\u0011\u00100\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b/\u0010\bR\u0011\u00102\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b1\u0010\bR\u0011\u00104\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b3\u0010\bR\u0011\u00106\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b5\u0010\bR\u0011\u00108\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b7\u0010\bR\u0011\u0010:\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b9\u0010\bR\u0011\u0010<\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b;\u0010\bR\u0011\u0010>\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b=\u0010\bR\u0011\u0010@\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b?\u0010\bR\u0011\u0010B\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bA\u0010\bR\u0011\u0010D\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bC\u0010\bR\u0011\u0010F\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bE\u0010\u000fR\u0011\u0010H\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bG\u0010\bR\u0011\u0010J\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bI\u0010\u000fR\u0011\u0010L\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bK\u0010\u000fR\u0011\u0010N\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bM\u0010\bR\u0011\u0010P\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bO\u0010\u000fR\u0011\u0010R\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bQ\u0010\u000fR\u0011\u0010T\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bS\u0010\u000fR\u0011\u0010V\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bU\u0010\u000f¨\u0006W"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/TileGrid2Constants;", "", "<init>", "()V", "", "containerCornerRadiusInt", "I", "getContainerCornerRadiusInt", "()I", "ratingTopMargin", "getRatingTopMargin", "DP_4", "getDP_4", "", "getContainerCornerRadius", "()F", "containerCornerRadius", "getContainerPadding", "containerPadding", "getContainerBackgroundTopInset", "containerBackgroundTopInset", "getContainerHorizontalMargin", "containerHorizontalMargin", "getBUTTON_MARGIN", "BUTTON_MARGIN", "getRSV_BTN_HEIGHT", "RSV_BTN_HEIGHT", "getRSV_BTN_MARGIN_BOTTOM", "RSV_BTN_MARGIN_BOTTOM", "getRSV_BTN_MARGIN_HORIZONTAL", "RSV_BTN_MARGIN_HORIZONTAL", "getBannerRootBottomPadding", "bannerRootBottomPadding", "getBannerButtonTopMargin", "bannerButtonTopMargin", "getBannerContentHorizontalMargin", "bannerContentHorizontalMargin", "getBannerContentTopMargin", "bannerContentTopMargin", "getBannerBadgeOuterMargin", "bannerBadgeOuterMargin", "getBannerBadgeInnerMargin", "bannerBadgeInnerMargin", "getBannerBadgeTouchAreaDX", "bannerBadgeTouchAreaDX", "getBannerBadgeTouchAreaDY", "bannerBadgeTouchAreaDY", "getBannerExtraBadgeMinWidth", "bannerExtraBadgeMinWidth", "getTopRightBtnsWidth", "topRightBtnsWidth", "getTopRightBtnsTopMargin", "topRightBtnsTopMargin", "getTopRightBtnsFavoriteHeight", "topRightBtnsFavoriteHeight", "getTopRightBtnsFavoriteHorizontalPadding", "topRightBtnsFavoriteHorizontalPadding", "getTopRightBtnsFavoriteVerticalPadding", "topRightBtnsFavoriteVerticalPadding", "getTopRightBtnsToggleVerticalMargin", "topRightBtnsToggleVerticalMargin", "getTopRightBtnsIconVerticalMargin", "topRightBtnsIconVerticalMargin", "getTopRightBtnsCheckboxAtomSize", "topRightBtnsCheckboxAtomSize", "getCountButtonSize", "countButtonSize", "getCountButtonBackgroundSize", "countButtonBackgroundSize", "getCountButtonBackgroundRadius", "countButtonBackgroundRadius", "getCountButtonIconSize", "countButtonIconSize", "getCountButtonElevation", "countButtonElevation", "getCountButtonBadgeMargin", "countButtonBadgeMargin", "getCountButtonBadgeHorizontalPadding", "countButtonBadgeHorizontalPadding", "getCountButtonBadgeRadius", "countButtonBadgeRadius", "getIndicatorDotSize", "indicatorDotSize", "getIndicatorDotSelectedSize", "indicatorDotSelectedSize", "getIndicatorDotSpacing", "indicatorDotSpacing", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2Constants {
    private static final int DP_4;

    @NotNull
    public static final TileGrid2Constants INSTANCE;
    private static final int containerCornerRadiusInt;
    private static final int ratingTopMargin;

    static {
        TileGrid2Constants tileGrid2Constants = new TileGrid2Constants();
        INSTANCE = tileGrid2Constants;
        containerCornerRadiusInt = (int) tileGrid2Constants.getContainerCornerRadius();
        ratingTopMargin = Dimens.INSTANCE.getDP_8();
        DP_4 = ResourceExtKt.toPx(4);
    }

    private TileGrid2Constants() {
    }

    public final int getBUTTON_MARGIN() {
        return Dimens.INSTANCE.getDP_2();
    }

    public final int getBannerBadgeInnerMargin() {
        return Dimens.INSTANCE.getDP_2();
    }

    public final int getBannerBadgeOuterMargin() {
        return Dimens.INSTANCE.getDP_8();
    }

    public final int getBannerBadgeTouchAreaDX() {
        return Dimens.INSTANCE.getDP_1();
    }

    public final int getBannerBadgeTouchAreaDY() {
        return Dimens.INSTANCE.getDP_4();
    }

    public final int getBannerButtonTopMargin() {
        return Dimens.INSTANCE.getDP_8();
    }

    public final int getBannerContentHorizontalMargin() {
        return Dimens.INSTANCE.getDP_8();
    }

    public final int getBannerContentTopMargin() {
        return Dimens.INSTANCE.getDP_8();
    }

    public final int getBannerExtraBadgeMinWidth() {
        return Dimens.INSTANCE.getDP_12();
    }

    public final int getBannerRootBottomPadding() {
        return Dimens.INSTANCE.getDP_8();
    }

    public final int getContainerBackgroundTopInset() {
        return Dimens.INSTANCE.getDP_2();
    }

    public final float getContainerCornerRadius() {
        return Dimens.INSTANCE.getDPF_16();
    }

    public final int getContainerCornerRadiusInt() {
        return containerCornerRadiusInt;
    }

    public final int getContainerHorizontalMargin() {
        return Dimens.INSTANCE.getDP_1();
    }

    public final int getContainerPadding() {
        return Dimens.INSTANCE.getDP_2();
    }

    public final float getCountButtonBackgroundRadius() {
        return getCountButtonBackgroundSize() / 2.0f;
    }

    public final int getCountButtonBackgroundSize() {
        return Dimens.INSTANCE.getDP_44();
    }

    public final int getCountButtonBadgeHorizontalPadding() {
        return Dimens.INSTANCE.getDP_4();
    }

    public final float getCountButtonBadgeMargin() {
        return Dimens.INSTANCE.getDPF_3();
    }

    public final float getCountButtonBadgeRadius() {
        return Dimens.INSTANCE.getDPF_10();
    }

    public final float getCountButtonElevation() {
        return Dimens.INSTANCE.getDPF_8();
    }

    public final int getCountButtonIconSize() {
        return Dimens.INSTANCE.getDP_24();
    }

    public final int getCountButtonSize() {
        return Dimens.INSTANCE.getDP_56();
    }

    public final int getDP_4() {
        return DP_4;
    }

    public final float getIndicatorDotSelectedSize() {
        return Dimens.INSTANCE.getDPF_4();
    }

    public final float getIndicatorDotSize() {
        return Dimens.INSTANCE.getDPF_4();
    }

    public final float getIndicatorDotSpacing() {
        return Dimens.INSTANCE.getDPF_2();
    }

    public final int getRSV_BTN_HEIGHT() {
        return Dimens.INSTANCE.getDP_32();
    }

    public final int getRSV_BTN_MARGIN_BOTTOM() {
        return Dimens.INSTANCE.getDP_8();
    }

    public final int getRSV_BTN_MARGIN_HORIZONTAL() {
        return Dimens.INSTANCE.getDP_8();
    }

    public final int getRatingTopMargin() {
        return ratingTopMargin;
    }

    public final int getTopRightBtnsCheckboxAtomSize() {
        return Dimens.INSTANCE.getDP_24();
    }

    public final int getTopRightBtnsFavoriteHeight() {
        return Dimens.INSTANCE.getDP_32();
    }

    public final int getTopRightBtnsFavoriteHorizontalPadding() {
        return Dimens.INSTANCE.getDP_8();
    }

    public final int getTopRightBtnsFavoriteVerticalPadding() {
        return Dimens.INSTANCE.getDP_4();
    }

    public final int getTopRightBtnsIconVerticalMargin() {
        return Dimens.INSTANCE.getDP_4();
    }

    public final int getTopRightBtnsToggleVerticalMargin() {
        return Dimens.INSTANCE.getDP_4();
    }

    public final int getTopRightBtnsTopMargin() {
        return Dimens.INSTANCE.getDP_4();
    }

    public final int getTopRightBtnsWidth() {
        return Dimens.INSTANCE.getDP_40();
    }
}
