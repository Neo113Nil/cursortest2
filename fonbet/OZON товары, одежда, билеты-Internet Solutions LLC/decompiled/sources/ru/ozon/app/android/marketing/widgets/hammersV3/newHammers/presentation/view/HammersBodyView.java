package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;
import ru.ozon.app.android.uikit.view.atoms.flashsale.StockBarView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0007H\u0014J0\u00109\u001a\u0002062\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u0007H\u0014J\u0018\u0010@\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0007H\u0002J\u0014\u0010A\u001a\u00020\u0007*\u00020B2\u0006\u0010C\u001a\u00020\u0007H\u0002J\b\u0010D\u001a\u000206H\u0002J\u001c\u0010E\u001a\u00020\u0007*\u00020B2\u0006\u0010F\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\u0007H\u0002J\b\u0010H\u001a\u000206H\u0002J\b\u0010I\u001a\u000206H\u0002J\f\u0010J\u001a\u00020\u0007*\u00020BH\u0002J\f\u0010K\u001a\u00020\u0007*\u00020BH\u0002J\f\u0010L\u001a\u00020\u0007*\u00020BH\u0002J\f\u0010M\u001a\u00020\u0007*\u00020BH\u0002J\f\u0010N\u001a\u00020\u0007*\u00020BH\u0002R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001d\"\u0004\b(\u0010\u001fR\u001c\u0010)\u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\u001c\u0010,\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001fR\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006O"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/view/HammersBodyView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "overlayImage", "Landroidx/appcompat/widget/AppCompatImageView;", "getOverlayImage", "()Landroidx/appcompat/widget/AppCompatImageView;", "setOverlayImage", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "bottomBadge", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBottomBadge", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "setBottomBadge", "(Lru/ozon/uni/android/atom/badge/BadgeView;)V", "mainImage", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView;", "getMainImage", "()Lru/ozon/app/android/product/imagesswipeview/AdultImageView;", "hammerTextTop", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getHammerTextTop", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "setHammerTextTop", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;)V", "hammerDiscount", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "getHammerDiscount", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "setHammerDiscount", "(Lru/ozon/uni/android/atom/price/ui/PriceAtomView;)V", "hammerTextMiddle", "getHammerTextMiddle", "setHammerTextMiddle", "hammerPrice", "getHammerPrice", "setHammerPrice", "hammerLabel", "getHammerLabel", "setHammerLabel", "hammerStockBar", "Lru/ozon/app/android/uikit/view/atoms/flashsale/StockBarView;", "getHammerStockBar", "()Lru/ozon/app/android/uikit/view/atoms/flashsale/StockBarView;", "setHammerStockBar", "(Lru/ozon/app/android/uikit/view/atoms/flashsale/StockBarView;)V", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "l", "t", "r", "b", "measureHeight", "measureInfo", "Landroid/view/View;", "totalHeight", "layoutVerticalItems", "layoutInfo", "viewTop", "parentWidth", "measureAdditionalViews", "layoutAdditionalViews", "collectVerticalMargin", "getLeftMargin", "getRightMargin", "getTopMargin", "getBottomMargin", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HammersBodyView extends ViewGroup {
    private BadgeView bottomBadge;
    private PriceAtomView hammerDiscount;
    private TextAtomV2View hammerLabel;
    private PriceAtomView hammerPrice;
    private StockBarView hammerStockBar;
    private TextAtomV2View hammerTextMiddle;
    private TextAtomV2View hammerTextTop;

    @NotNull
    private final AdultImageView mainImage;
    private AppCompatImageView overlayImage;

    public /* synthetic */ HammersBodyView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final int collectVerticalMargin(View view) {
        return getTopMargin(view) + getBottomMargin(view);
    }

    private final int getBottomMargin(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    private final int getLeftMargin(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    private final int getRightMargin(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    private final int getTopMargin(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    private final void layoutAdditionalViews() {
        View ifNotGone;
        View ifNotGone2;
        AppCompatImageView appCompatImageView = this.overlayImage;
        if (appCompatImageView != null && (ifNotGone2 = ViewExtKt.getIfNotGone(appCompatImageView)) != null) {
            LayoutExtKt.layoutLeftTop(ifNotGone2, this.mainImage.getLeft(), this.mainImage.getTop());
        }
        BadgeView badgeView = this.bottomBadge;
        if (badgeView == null || (ifNotGone = ViewExtKt.getIfNotGone(badgeView)) == null) {
            return;
        }
        int left = this.mainImage.getLeft();
        ViewGroup.LayoutParams layoutParams = badgeView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        LayoutExtKt.layoutLeftBottom(ifNotGone, left + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0), this.mainImage.getBottom() - getBottomMargin(badgeView));
    }

    private final int layoutInfo(View view, int i11, int i12) {
        int measuredHeight = view.getMeasuredHeight() + i11 + getTopMargin(view);
        view.layout(getLeftMargin(view), getTopMargin(view) + i11, i12 - getRightMargin(view), measuredHeight);
        return measuredHeight - i11;
    }

    private final void layoutVerticalItems() {
        View ifNotGone;
        View ifNotGone2;
        View ifNotGone3;
        View ifNotGone4;
        View ifNotGone5;
        View ifNotGone6;
        int paddingTop = getPaddingTop() + getTopMargin(this.mainImage);
        int leftMargin = getLeftMargin(this.mainImage);
        AdultImageView adultImageView = this.mainImage;
        adultImageView.layout(leftMargin, paddingTop, adultImageView.getMeasuredWidth() + leftMargin, this.mainImage.getMeasuredWidth() + paddingTop);
        int measuredWidth = this.mainImage.getMeasuredWidth() + getBottomMargin(this.mainImage) + paddingTop;
        TextAtomV2View textAtomV2View = this.hammerTextTop;
        int i11 = 0;
        int layoutInfo = measuredWidth + ((textAtomV2View == null || (ifNotGone6 = ViewExtKt.getIfNotGone(textAtomV2View)) == null) ? 0 : layoutInfo(ifNotGone6, measuredWidth, getMeasuredWidth()));
        PriceAtomView priceAtomView = this.hammerDiscount;
        int layoutInfo2 = layoutInfo + ((priceAtomView == null || (ifNotGone5 = ViewExtKt.getIfNotGone(priceAtomView)) == null) ? 0 : layoutInfo(ifNotGone5, layoutInfo, getMeasuredWidth()));
        TextAtomV2View textAtomV2View2 = this.hammerTextMiddle;
        int layoutInfo3 = layoutInfo2 + ((textAtomV2View2 == null || (ifNotGone4 = ViewExtKt.getIfNotGone(textAtomV2View2)) == null) ? 0 : layoutInfo(ifNotGone4, layoutInfo2, getMeasuredWidth()));
        PriceAtomView priceAtomView2 = this.hammerPrice;
        int layoutInfo4 = layoutInfo3 + ((priceAtomView2 == null || (ifNotGone3 = ViewExtKt.getIfNotGone(priceAtomView2)) == null) ? 0 : layoutInfo(ifNotGone3, layoutInfo3, getMeasuredWidth()));
        TextAtomV2View textAtomV2View3 = this.hammerLabel;
        if (textAtomV2View3 != null && (ifNotGone2 = ViewExtKt.getIfNotGone(textAtomV2View3)) != null) {
            i11 = layoutInfo(ifNotGone2, layoutInfo4, getMeasuredWidth());
        }
        int i12 = layoutInfo4 + i11;
        StockBarView stockBarView = this.hammerStockBar;
        if (stockBarView == null || (ifNotGone = ViewExtKt.getIfNotGone(stockBarView)) == null) {
            return;
        }
        layoutInfo(ifNotGone, i12, getMeasuredWidth());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void measureAdditionalViews() {
        View ifNotGone;
        int i11;
        BadgeView badgeView;
        View ifNotGone2;
        AppCompatImageView appCompatImageView = this.overlayImage;
        if (appCompatImageView != null && (ifNotGone2 = ViewExtKt.getIfNotGone(appCompatImageView)) != null) {
            MeasureExtKt.measureExactly(ifNotGone2, this.mainImage.getMeasuredWidth(), this.mainImage.getMeasuredWidth());
        }
        BadgeView badgeView2 = this.bottomBadge;
        if (badgeView2 == null || (ifNotGone = ViewExtKt.getIfNotGone(badgeView2)) == null) {
            return;
        }
        int measuredWidth = this.mainImage.getMeasuredWidth();
        BadgeView badgeView3 = this.bottomBadge;
        int i12 = 0;
        if (badgeView3 != null) {
            ViewGroup.LayoutParams layoutParams = badgeView3.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                i11 = marginLayoutParams.leftMargin;
                int i13 = measuredWidth - i11;
                badgeView = this.bottomBadge;
                if (badgeView != null) {
                    ViewGroup.LayoutParams layoutParams2 = badgeView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    if (marginLayoutParams2 != null) {
                        i12 = marginLayoutParams2.rightMargin;
                    }
                }
                MeasureExtKt.measureAtMost(ifNotGone, i13 - i12, this.mainImage.getMeasuredHeight());
            }
        }
        i11 = 0;
        int i132 = measuredWidth - i11;
        badgeView = this.bottomBadge;
        if (badgeView != null) {
        }
        MeasureExtKt.measureAtMost(ifNotGone, i132 - i12, this.mainImage.getMeasuredHeight());
    }

    private final int measureHeight(int widthMeasureSpec, int heightMeasureSpec) {
        View ifNotGone;
        View ifNotGone2;
        View ifNotGone3;
        View ifNotGone4;
        View ifNotGone5;
        View ifNotGone6;
        measureChildWithMargins(this.mainImage, widthMeasureSpec, 0, heightMeasureSpec, 0);
        int measuredWidth = this.mainImage.getMeasuredWidth() + collectVerticalMargin(this.mainImage);
        TextAtomV2View textAtomV2View = this.hammerTextTop;
        int i11 = 0;
        int measureInfo = measuredWidth + ((textAtomV2View == null || (ifNotGone6 = ViewExtKt.getIfNotGone(textAtomV2View)) == null) ? 0 : measureInfo(ifNotGone6, measuredWidth));
        PriceAtomView priceAtomView = this.hammerDiscount;
        int measureInfo2 = measureInfo + ((priceAtomView == null || (ifNotGone5 = ViewExtKt.getIfNotGone(priceAtomView)) == null) ? 0 : measureInfo(ifNotGone5, measureInfo));
        TextAtomV2View textAtomV2View2 = this.hammerTextMiddle;
        int measureInfo3 = measureInfo2 + ((textAtomV2View2 == null || (ifNotGone4 = ViewExtKt.getIfNotGone(textAtomV2View2)) == null) ? 0 : measureInfo(ifNotGone4, measureInfo2));
        PriceAtomView priceAtomView2 = this.hammerPrice;
        int measureInfo4 = measureInfo3 + ((priceAtomView2 == null || (ifNotGone3 = ViewExtKt.getIfNotGone(priceAtomView2)) == null) ? 0 : measureInfo(ifNotGone3, measureInfo3));
        TextAtomV2View textAtomV2View3 = this.hammerLabel;
        int measureInfo5 = measureInfo4 + ((textAtomV2View3 == null || (ifNotGone2 = ViewExtKt.getIfNotGone(textAtomV2View3)) == null) ? 0 : measureInfo(ifNotGone2, measureInfo4));
        StockBarView stockBarView = this.hammerStockBar;
        if (stockBarView != null && (ifNotGone = ViewExtKt.getIfNotGone(stockBarView)) != null) {
            i11 = measureInfo(ifNotGone, measureInfo5);
        }
        return measureInfo5 + i11;
    }

    private final int measureInfo(View view, int i11) {
        int measuredWidth = (this.mainImage.getMeasuredWidth() - getLeftMargin(view)) - getRightMargin(view);
        ViewGroup.LayoutParams layoutParams = this.mainImage.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i12 = measuredWidth + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = this.mainImage.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        view.measure(View.MeasureSpec.makeMeasureSpec(i12 + (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return ((view.getMeasuredHeight() + collectVerticalMargin(view)) + i11) - i11;
    }

    public final BadgeView getBottomBadge() {
        return this.bottomBadge;
    }

    public final PriceAtomView getHammerDiscount() {
        return this.hammerDiscount;
    }

    public final TextAtomV2View getHammerLabel() {
        return this.hammerLabel;
    }

    public final PriceAtomView getHammerPrice() {
        return this.hammerPrice;
    }

    public final StockBarView getHammerStockBar() {
        return this.hammerStockBar;
    }

    public final TextAtomV2View getHammerTextMiddle() {
        return this.hammerTextMiddle;
    }

    public final TextAtomV2View getHammerTextTop() {
        return this.hammerTextTop;
    }

    @NotNull
    public final AdultImageView getMainImage() {
        return this.mainImage;
    }

    public final AppCompatImageView getOverlayImage() {
        return this.overlayImage;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        layoutVerticalItems();
        layoutAdditionalViews();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        int paddingTop = getPaddingTop() + getPaddingBottom() + measureHeight(widthMeasureSpec, heightMeasureSpec);
        measureAdditionalViews();
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(paddingTop, size), 1073741824));
    }

    public final void setBottomBadge(BadgeView badgeView) {
        this.bottomBadge = badgeView;
    }

    public final void setHammerDiscount(PriceAtomView priceAtomView) {
        this.hammerDiscount = priceAtomView;
    }

    public final void setHammerLabel(TextAtomV2View textAtomV2View) {
        this.hammerLabel = textAtomV2View;
    }

    public final void setHammerPrice(PriceAtomView priceAtomView) {
        this.hammerPrice = priceAtomView;
    }

    public final void setHammerStockBar(StockBarView stockBarView) {
        this.hammerStockBar = stockBarView;
    }

    public final void setHammerTextMiddle(TextAtomV2View textAtomV2View) {
        this.hammerTextMiddle = textAtomV2View;
    }

    public final void setHammerTextTop(TextAtomV2View textAtomV2View) {
        this.hammerTextTop = textAtomV2View;
    }

    public final void setOverlayImage(AppCompatImageView appCompatImageView) {
        this.overlayImage = appCompatImageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HammersBodyView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mainImage = HammersBodyViewBuilder.INSTANCE.buildMainIv(this);
    }
}
