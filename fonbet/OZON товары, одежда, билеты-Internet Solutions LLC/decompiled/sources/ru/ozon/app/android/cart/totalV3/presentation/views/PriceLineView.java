package ru.ozon.app.android.cart.totalV3.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.totalV3.presentation.TotalVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0014J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014J\u001c\u0010\u0015\u001a\u00020\u000f2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/views/PriceLineView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "leftPriceLinePartView", "Lru/ozon/app/android/cart/totalV3/presentation/views/PriceLinePartView;", "rightPriceLinePartView", "minLeftViewWidth", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "bind", "priceLine", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceLineVO;", "setActionHandler", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PriceLineView extends FrameLayout {

    @NotNull
    private final PriceLinePartView leftPriceLinePartView;
    private final int minLeftViewWidth;

    @NotNull
    private final PriceLinePartView rightPriceLinePartView;

    public /* synthetic */ PriceLineView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull TotalVO.TotalItemVO.PriceLineVO priceLine) {
        Intrinsics.checkNotNullParameter(priceLine, "priceLine");
        this.leftPriceLinePartView.bindOrGone(priceLine.getLeft());
        this.rightPriceLinePartView.bindOrGone(priceLine.getRight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size = (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingStart()) - getPaddingEnd();
        int measuredWidth = this.leftPriceLinePartView.getMeasuredWidth();
        int measuredWidth2 = this.rightPriceLinePartView.getMeasuredWidth();
        if (measuredWidth + measuredWidth2 > size) {
            if (measuredWidth == 0) {
                if (size - measuredWidth2 > 0) {
                    size = measuredWidth2;
                }
                measuredWidth2 = size;
                size = 0;
            } else if (measuredWidth2 == 0) {
                if (size - measuredWidth > 0) {
                    size = measuredWidth;
                }
                measuredWidth2 = 0;
            } else {
                int i11 = size - measuredWidth2;
                int max = Math.max(i11, this.minLeftViewWidth);
                int i12 = this.minLeftViewWidth;
                boolean z11 = max == i12;
                if (z11) {
                    i11 = i12;
                }
                if (z11) {
                    measuredWidth2 = size - i12;
                }
                size = i11;
            }
            PriceLinePartView priceLinePartView = this.leftPriceLinePartView;
            MeasureExtKt.measure(priceLinePartView, size, 1073741824, priceLinePartView.getMeasuredHeight(), 0);
            MeasureExtKt.measure(this.rightPriceLinePartView, measuredWidth2, 1073741824, this.leftPriceLinePartView.getMeasuredHeight(), 0);
        }
    }

    public final void setActionHandler(Function1<? super AtomAction, Unit> actionHandler) {
        this.leftPriceLinePartView.setActionHandler(actionHandler);
        this.rightPriceLinePartView.setActionHandler(actionHandler);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceLineView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        DefaultConstructorMarker defaultConstructorMarker = null;
        AttributeSet attributeSet2 = null;
        int i12 = 0;
        PriceLinePartView priceLinePartView = new PriceLinePartView(context, false, attributeSet2, i12, 14, defaultConstructorMarker);
        this.leftPriceLinePartView = priceLinePartView;
        PriceLinePartView priceLinePartView2 = new PriceLinePartView(context, true, attributeSet2, i12, 12, defaultConstructorMarker);
        this.rightPriceLinePartView = priceLinePartView2;
        this.minLeftViewWidth = ResourceExtKt.toPx(120);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        Unit unit = Unit.f71690a;
        addView(priceLinePartView, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388629;
        addView(priceLinePartView2, layoutParams2);
    }
}
