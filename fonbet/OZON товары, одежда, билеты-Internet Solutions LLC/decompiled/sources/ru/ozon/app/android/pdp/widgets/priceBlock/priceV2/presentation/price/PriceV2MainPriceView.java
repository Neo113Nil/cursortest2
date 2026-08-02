package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.price;

import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.drawables.ScrollablePriceGradientOverlayDrawable;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/price/PriceV2MainPriceView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "gradientColor", "", "setupGradientViewIfNeededWithBind", "(Ljava/lang/Integer;)V", "innerBackgroundColor", "updateScrollableGradientColor", "(I)V", "Landroid/widget/HorizontalScrollView;", "horizontalScrollView", "Landroid/widget/HorizontalScrollView;", "Landroid/widget/LinearLayout;", "scrollablePriceContentLl", "Landroid/widget/LinearLayout;", "getScrollablePriceContentLl", "()Landroid/widget/LinearLayout;", "LSc/j;", "Landroid/view/View;", "scrollableGradientV", "LSc/j;", "lastGradientColor", "Ljava/lang/Integer;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/drawables/ScrollablePriceGradientOverlayDrawable;", "scrollableGradientDrawable$delegate", "getScrollableGradientDrawable", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/drawables/ScrollablePriceGradientOverlayDrawable;", "scrollableGradientDrawable", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class PriceV2MainPriceView extends FrameLayout {

    @NotNull
    private final HorizontalScrollView horizontalScrollView;
    private Integer lastGradientColor;

    /* renamed from: scrollableGradientDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j scrollableGradientDrawable;

    @NotNull
    private final InterfaceC4008j<View> scrollableGradientV;

    @NotNull
    private final LinearLayout scrollablePriceContentLl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceV2MainPriceView(@NotNull Context context) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setId(R$id.scrollablePriceSv);
        horizontalScrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setOverScrollMode(2);
        Dimens dimens = Dimens.INSTANCE;
        ViewExtKt.updatePadding$default(horizontalScrollView, dimens.getDP_12(), 0, dimens.getDP_12(), 0, 10, null);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.horizontalScrollView = horizontalScrollView;
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R$id.scrollablePriceContentLl);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        this.scrollablePriceContentLl = linearLayout;
        this.scrollableGradientV = DelegatesKt.lazyUnsafe(new PriceV2MainPriceView$scrollableGradientV$1(context, this));
        this.scrollableGradientDrawable = DelegatesKt.lazyUnsafe(PriceV2MainPriceView$scrollableGradientDrawable$2.INSTANCE);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = dimens.getDP_16();
        layoutParams.rightMargin = dimens.getDP_16();
        setLayoutParams(layoutParams);
        ViewExtKt.updatePadding$default(this, 0, dimens.getDP_12(), 0, 0, 13, null);
        horizontalScrollView.addView(linearLayout);
        addView(horizontalScrollView);
        linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.price.PriceV2MainPriceView$special$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                Integer num;
                if (linearLayout.getMeasuredWidth() <= 0 || linearLayout.getMeasuredHeight() <= 0) {
                    return;
                }
                linearLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                PriceV2MainPriceView priceV2MainPriceView = this;
                num = priceV2MainPriceView.lastGradientColor;
                priceV2MainPriceView.setupGradientViewIfNeededWithBind(num);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScrollablePriceGradientOverlayDrawable getScrollableGradientDrawable() {
        return (ScrollablePriceGradientOverlayDrawable) this.scrollableGradientDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupGradientViewIfNeededWithBind(Integer gradientColor) {
        if (getMeasuredWidth() != 0 && this.scrollablePriceContentLl.getMeasuredWidth() > getMeasuredWidth() - Dimens.INSTANCE.getDP_24() && !this.scrollableGradientV.isInitialized()) {
            addView(this.scrollableGradientV.getValue());
            if (gradientColor != null) {
                getScrollableGradientDrawable().setGradientColor(gradientColor.intValue());
            }
        } else if (this.scrollableGradientV.isInitialized() && !Intrinsics.d(this.lastGradientColor, gradientColor)) {
            this.lastGradientColor = gradientColor;
            if (gradientColor != null) {
                getScrollableGradientDrawable().setGradientColor(gradientColor.intValue());
            }
        }
        this.lastGradientColor = gradientColor;
    }

    @NotNull
    public final LinearLayout getScrollablePriceContentLl() {
        return this.scrollablePriceContentLl;
    }

    public final void updateScrollableGradientColor(int innerBackgroundColor) {
        setupGradientViewIfNeededWithBind(Integer.valueOf(innerBackgroundColor));
    }
}
