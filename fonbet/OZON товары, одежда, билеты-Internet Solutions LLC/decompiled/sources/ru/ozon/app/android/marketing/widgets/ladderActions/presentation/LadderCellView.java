package ru.ozon.app.android.marketing.widgets.ladderActions.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.ladderActions.presentation.LadderActionsVO;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 &2\u00020\u0001:\u0001&B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0014J0\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0014J\"\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00110\u001fJ\b\u0010!\u001a\u00020\"H\u0002J\u001c\u0010#\u001a\u00020\u0011*\u00020$2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderCellView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "topPrice", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "bottomPrice", "button", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", "right", "bottom", "bind", "item", "Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsVO$LadderActionsCellVO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "getWrapLayoutParams", "Landroid/view/ViewGroup$MarginLayoutParams;", "layoutCenterVertical", "Landroid/view/View;", "parentHeight", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LadderCellView extends ViewGroup {
    public static final int $stable;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int buttonWidth;
    private static final int dp8;
    private static final int priceMargin;

    @NotNull
    private final PriceAtomView bottomPrice;

    @NotNull
    private final ButtonV3View button;

    @NotNull
    private final PriceAtomView topPrice;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderCellView$Companion;", "", "<init>", "()V", "dp8", "", "buttonWidth", "priceMargin", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        int i11 = ButtonV3View.$stable;
        int i12 = PriceAtomView.$stable;
        $stable = i11 | i12 | i12;
        dp8 = ResourceExtKt.toPx(8);
        buttonWidth = ResourceExtKt.toPx(137);
        priceMargin = ResourceExtKt.toPx(2);
    }

    public /* synthetic */ LadderCellView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final ViewGroup.MarginLayoutParams getWrapLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    private final void layoutCenterVertical(View view, int i11, int i12) {
        LayoutExtKt.layoutLeftTop(view, i12, (i11 - view.getMeasuredHeight()) / 2);
    }

    public final void bind(@NotNull LadderActionsVO.LadderActionsCellVO item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        PriceAtomHolderKt.bind$default(this.topPrice, item.getPrimaryPrice(), null, 2, null);
        PriceAtomHolderKt.bind$default(this.bottomPrice, item.getSecondaryPrice(), null, 2, null);
        ButtonV3HolderKt.bind(this.button, item.getIsActive() ? item.getActiveButton() : item.getDefaultButton(), onAction);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        LayoutExtKt.layoutLeftTop(this.topPrice, getPaddingLeft(), 0);
        LayoutExtKt.layoutLeftTop(this.bottomPrice, getPaddingLeft(), this.topPrice.getMeasuredHeight() + priceMargin);
        layoutCenterVertical(this.button, getMeasuredHeight(), (getMeasuredWidth() - this.button.getMeasuredWidth()) - getPaddingRight());
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        this.button.measure(View.MeasureSpec.makeMeasureSpec(buttonWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int paddingLeft = ((size - getPaddingLeft()) - getPaddingRight()) - this.button.getMeasuredWidth();
        this.topPrice.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.bottomPrice.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.button.getMeasuredHeight();
        int measuredHeight2 = this.bottomPrice.getMeasuredHeight() + this.topPrice.getMeasuredHeight() + priceMargin;
        if (measuredHeight < measuredHeight2) {
            measuredHeight = measuredHeight2;
        }
        setMeasuredDimension(size, measuredHeight);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LadderCellView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        PriceAtomView priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        priceAtomView.setLayoutParams(getWrapLayoutParams());
        addView(priceAtomView);
        this.topPrice = priceAtomView;
        PriceAtomView priceAtomView2 = new PriceAtomView(context, null, 0, 6, null);
        priceAtomView2.setLayoutParams(getWrapLayoutParams());
        addView(priceAtomView2);
        this.bottomPrice = priceAtomView2;
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        ViewGroup.MarginLayoutParams wrapLayoutParams = getWrapLayoutParams();
        wrapLayoutParams.leftMargin = dp8;
        buttonV3View.setLayoutParams(wrapLayoutParams);
        addView(buttonV3View);
        this.button = buttonV3View;
    }
}
