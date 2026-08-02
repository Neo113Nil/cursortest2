package ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid3.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.common.overlaytitle.OverlayTitleView;
import ru.ozon.app.android.product.common.wave.WaveView;
import ru.ozon.app.android.uikit.view.atoms.texts.TextAtomWithIconView;
import ru.ozon.app.android.universalwidgets.widgets.uw.badgescontainer.HorizontalBadgesContainerView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.SkuImageWrapper;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u0013\u0010\u0017\u001a\u00020\u0006*\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0006*\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0006*\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0016*\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u0014J7\u0010$\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0014¢\u0006\u0004\b$\u0010%R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u00106\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010;\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010@\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010D\u001a\u00020?8\u0006¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010CR\u0017\u0010F\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010K\u001a\u00020J8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010P\u001a\u00020O8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S¨\u0006T"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid3/presentation/SkuGrid3View;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "measureHeight", "(II)I", "", "layoutVerticalItems", "()V", "parentWidthMeasureSpec", "parentHeightMeasureSpec", "measureAdditionalViews", "(II)V", "layoutAdditionalViews", "Landroid/view/View;", "collectVerticalMargin", "(Landroid/view/View;)I", "getTopMargin", "getBottomMargin", "getIfNotGone", "(Landroid/view/View;)Landroid/view/View;", "onMeasure", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/SkuImageWrapper;", "adultIv", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/SkuImageWrapper;", "getAdultIv", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/SkuImageWrapper;", "Landroidx/appcompat/widget/AppCompatImageView;", "overlayImage", "Landroidx/appcompat/widget/AppCompatImageView;", "getOverlayImage", "()Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView;", "overlayTitleView", "Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView;", "getOverlayTitleView", "()Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView;", "Lru/ozon/app/android/product/common/wave/WaveView;", "waveView", "Lru/ozon/app/android/product/common/wave/WaveView;", "getWaveView", "()Lru/ozon/app/android/product/common/wave/WaveView;", "Lru/ozon/app/android/universalwidgets/widgets/uw/badgescontainer/HorizontalBadgesContainerView;", "badgesContainer", "Lru/ozon/app/android/universalwidgets/widgets/uw/badgescontainer/HorizontalBadgesContainerView;", "getBadgesContainer", "()Lru/ozon/app/android/universalwidgets/widgets/uw/badgescontainer/HorizontalBadgesContainerView;", "Landroidx/recyclerview/widget/RecyclerView;", "topRightButtonsRV", "Landroidx/recyclerview/widget/RecyclerView;", "getTopRightButtonsRV", "()Landroidx/recyclerview/widget/RecyclerView;", "stateVal", "getStateVal", "stateView", "Landroid/view/View;", "getStateView", "()Landroid/view/View;", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "productSa", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "getProductSa", "()Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "Lru/ozon/app/android/uikit/view/atoms/texts/TextAtomWithIconView;", "buttonSubtitle", "Lru/ozon/app/android/uikit/view/atoms/texts/TextAtomWithIconView;", "getButtonSubtitle", "()Lru/ozon/app/android/uikit/view/atoms/texts/TextAtomWithIconView;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SkuGrid3View extends ViewGroup {

    @NotNull
    private final SkuImageWrapper adultIv;

    @NotNull
    private final HorizontalBadgesContainerView badgesContainer;

    @NotNull
    private final TextAtomWithIconView buttonSubtitle;

    @NotNull
    private final AppCompatImageView overlayImage;

    @NotNull
    private final OverlayTitleView overlayTitleView;

    @NotNull
    private final SingleAtom productSa;

    @NotNull
    private final RecyclerView stateVal;

    @NotNull
    private final View stateView;

    @NotNull
    private final RecyclerView topRightButtonsRV;

    @NotNull
    private final WaveView waveView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SkuGrid3View(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int collectVerticalMargin(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
        }
        return 0;
    }

    private final int getBottomMargin(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    private final View getIfNotGone(View view) {
        if (view.getVisibility() != 8) {
            return view;
        }
        return null;
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
        View ifNotGone = getIfNotGone(this.overlayImage);
        if (ifNotGone != null) {
            ifNotGone.layout(this.adultIv.getLeft(), this.adultIv.getTop(), this.adultIv.getRight(), this.adultIv.getBottom());
        }
        View ifNotGone2 = getIfNotGone(this.badgesContainer);
        if (ifNotGone2 != null) {
            ifNotGone2.layout(this.adultIv.getLeft(), this.adultIv.getTop(), this.adultIv.getRight(), this.adultIv.getBottom());
        }
        View ifNotGone3 = getIfNotGone(this.overlayTitleView);
        if (ifNotGone3 != null) {
            ifNotGone3.layout(this.adultIv.getLeft(), this.adultIv.getBottom() - this.overlayTitleView.getMeasuredHeight(), this.adultIv.getRight(), this.adultIv.getBottom());
        }
        View ifNotGone4 = getIfNotGone(this.waveView);
        if (ifNotGone4 != null) {
            ifNotGone4.layout(this.adultIv.getLeft(), this.adultIv.getBottom() - this.waveView.getMeasuredHeight(), this.adultIv.getRight(), this.adultIv.getBottom());
        }
        View ifNotGone5 = getIfNotGone(this.topRightButtonsRV);
        if (ifNotGone5 != null) {
            ifNotGone5.layout(this.adultIv.getRight() - this.topRightButtonsRV.getMeasuredWidth(), this.adultIv.getTop(), this.adultIv.getRight(), this.topRightButtonsRV.getMeasuredHeight() + this.adultIv.getTop());
        }
    }

    private final void layoutVerticalItems() {
        int paddingTop = getPaddingTop() + getTopMargin(this.adultIv);
        int measuredHeight = this.adultIv.getMeasuredHeight() + paddingTop;
        int measuredWidth = getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = this.adultIv.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i11 = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        SkuImageWrapper skuImageWrapper = this.adultIv;
        skuImageWrapper.layout(i11, paddingTop, skuImageWrapper.getMeasuredWidth() + i11, measuredHeight);
        int measuredHeight2 = this.adultIv.getMeasuredHeight() + getBottomMargin(this.adultIv) + getTopMargin(this.stateVal) + paddingTop;
        int measuredHeight3 = this.stateVal.getMeasuredHeight() + measuredHeight2;
        this.stateVal.layout(0, measuredHeight2, measuredWidth, measuredHeight3);
        this.stateView.layout(0, measuredHeight2, measuredWidth, measuredHeight3);
        int measuredHeight4 = getMeasuredHeight() - getPaddingBottom();
        if (this.buttonSubtitle.getVisibility() != 8) {
            int bottomMargin = measuredHeight4 - getBottomMargin(this.buttonSubtitle);
            measuredHeight2 = bottomMargin - this.buttonSubtitle.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams2 = this.buttonSubtitle.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i12 = marginLayoutParams2 != null ? marginLayoutParams2.leftMargin : 0;
            TextAtomWithIconView textAtomWithIconView = this.buttonSubtitle;
            textAtomWithIconView.layout(i12, measuredHeight2, textAtomWithIconView.getMeasuredWidth() + i12, bottomMargin);
        }
        if (this.productSa.getVisibility() != 8 && getIfNotGone(this.buttonSubtitle) != null) {
            int topMargin = (measuredHeight2 - getTopMargin(this.buttonSubtitle)) - getBottomMargin(this.productSa);
            this.productSa.layout(0, topMargin - this.productSa.getMeasuredHeight(), measuredWidth, topMargin);
        } else {
            if (this.productSa.getVisibility() == 8 || getIfNotGone(this.buttonSubtitle) != null) {
                return;
            }
            int measuredHeight5 = (getMeasuredHeight() - getPaddingBottom()) - getBottomMargin(this.productSa);
            this.productSa.layout(0, measuredHeight5 - this.productSa.getMeasuredHeight(), measuredWidth, measuredHeight5);
        }
    }

    private final void measureAdditionalViews(int parentWidthMeasureSpec, int parentHeightMeasureSpec) {
        View ifNotGone = getIfNotGone(this.overlayImage);
        if (ifNotGone != null) {
            MeasureExtKt.measureExactly(ifNotGone, this.adultIv.getMeasuredWidth(), this.adultIv.getMeasuredHeight());
        }
        View ifNotGone2 = getIfNotGone(this.badgesContainer);
        if (ifNotGone2 != null) {
            MeasureExtKt.measureExactly(ifNotGone2, this.adultIv.getMeasuredWidth(), this.adultIv.getMeasuredHeight());
        }
        View ifNotGone3 = getIfNotGone(this.overlayTitleView);
        if (ifNotGone3 != null) {
            ifNotGone3.measure(View.MeasureSpec.makeMeasureSpec(this.adultIv.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        View ifNotGone4 = getIfNotGone(this.waveView);
        if (ifNotGone4 != null) {
            MeasureExtKt.measureExactly(ifNotGone4, this.adultIv.getMeasuredWidth(), SkuGrid3ViewBuilder.INSTANCE.getDp10());
        }
        measureChildWithMargins(this.topRightButtonsRV, parentWidthMeasureSpec, 0, parentHeightMeasureSpec, 0);
    }

    private final int measureHeight(int widthMeasureSpec, int heightMeasureSpec) {
        measureChildWithMargins(this.adultIv, widthMeasureSpec, 0, heightMeasureSpec, 0);
        int measuredHeight = this.adultIv.getMeasuredHeight() + collectVerticalMargin(this.adultIv);
        measureChildWithMargins(this.stateVal, widthMeasureSpec, 0, heightMeasureSpec, measuredHeight);
        int measuredHeight2 = this.stateVal.getMeasuredHeight() + measuredHeight + collectVerticalMargin(this.stateVal);
        if (this.productSa.getVisibility() != 8) {
            measureChildWithMargins(this.productSa, widthMeasureSpec, 0, heightMeasureSpec, measuredHeight2);
            measuredHeight2 = this.productSa.getMeasuredHeight() + measuredHeight2 + collectVerticalMargin(this.productSa);
        }
        if (this.buttonSubtitle.getVisibility() == 8) {
            return measuredHeight2;
        }
        measureChildWithMargins(this.buttonSubtitle, widthMeasureSpec, 0, heightMeasureSpec, measuredHeight2);
        return this.buttonSubtitle.getMeasuredHeight() + measuredHeight2 + collectVerticalMargin(this.buttonSubtitle);
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
        measureAdditionalViews(widthMeasureSpec, heightMeasureSpec);
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(paddingTop, size), 1073741824));
    }

    public /* synthetic */ SkuGrid3View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkuGrid3View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        SkuGrid3ViewBuilder skuGrid3ViewBuilder = SkuGrid3ViewBuilder.INSTANCE;
        this.adultIv = skuGrid3ViewBuilder.buildAdultIv(this);
        this.overlayImage = skuGrid3ViewBuilder.buildOverlayImage(this);
        this.overlayTitleView = skuGrid3ViewBuilder.overlayTitle(this);
        this.waveView = skuGrid3ViewBuilder.waveView(this);
        this.badgesContainer = skuGrid3ViewBuilder.badgesContainer(this);
        this.topRightButtonsRV = skuGrid3ViewBuilder.topRightButtonsRV(this);
        this.stateVal = skuGrid3ViewBuilder.stateVal(this);
        this.stateView = skuGrid3ViewBuilder.stateView(this);
        this.productSa = skuGrid3ViewBuilder.productSa(this);
        this.buttonSubtitle = skuGrid3ViewBuilder.buttonSubtitle(this);
    }
}
