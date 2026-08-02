package ru.ozon.app.android.cart.totalV3.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.totalV3.presentation.TotalVO;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001c\u0010\u0013\u001a\u00020\u00102\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0015R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/views/TotalPriceBlockView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "leftTotalPriceCardView", "Lru/ozon/app/android/cart/totalV3/presentation/views/TotalPriceCardView;", "rightTotalPriceCardView", "divider", "Lru/ozon/app/android/cart/totalV3/presentation/views/TotalPriceCardDivider;", "bind", "", "priceBlock", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO;", "setActionHandler", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalPriceBlockView extends LinearLayout {

    @NotNull
    private final TotalPriceCardDivider divider;

    @NotNull
    private final TotalPriceCardView leftTotalPriceCardView;

    @NotNull
    private final TotalPriceCardView rightTotalPriceCardView;

    public /* synthetic */ TotalPriceBlockView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull TotalVO.TotalItemVO.PriceBlockVO priceBlock) {
        Intrinsics.checkNotNullParameter(priceBlock, "priceBlock");
        this.leftTotalPriceCardView.bind(priceBlock.getLeftPriceCart());
        this.divider.bindOrGone(priceBlock.getDivider());
        this.rightTotalPriceCardView.bindOrGone(priceBlock.getRightPriceCart());
    }

    public final void setActionHandler(Function1<? super AtomAction, Unit> actionHandler) {
        this.leftTotalPriceCardView.setActionHandler(actionHandler);
        this.rightTotalPriceCardView.setActionHandler(actionHandler);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotalPriceBlockView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        AttributeSet attributeSet2 = null;
        int i12 = 0;
        int i13 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        TotalPriceCardView totalPriceCardView = new TotalPriceCardView(context, attributeSet2, i12, i13, defaultConstructorMarker);
        this.leftTotalPriceCardView = totalPriceCardView;
        TotalPriceCardView totalPriceCardView2 = new TotalPriceCardView(context, attributeSet2, i12, i13, defaultConstructorMarker);
        this.rightTotalPriceCardView = totalPriceCardView2;
        TotalPriceCardDivider totalPriceCardDivider = new TotalPriceCardDivider(context, attributeSet2, i12, i13, defaultConstructorMarker);
        this.divider = totalPriceCardDivider;
        setOrientation(0);
        setGravity(16);
        ViewExtKt.gone(totalPriceCardDivider);
        ViewExtKt.gone(totalPriceCardView2);
        addView(totalPriceCardView);
        addView(totalPriceCardDivider);
        addView(totalPriceCardView2);
    }
}
