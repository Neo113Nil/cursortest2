package ru.ozon.app.android.cart.totalV3.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.totalV3.presentation.TotalVO;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/views/PriceLinePartView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "hasWeight", "", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;ZLandroid/util/AttributeSet;I)V", "priceAV", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "textAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "dp4", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/Function1;", "", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "setActionHandler", "(Lkotlin/jvm/functions/Function1;)V", "bind", "priceLinePart", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceLineVO$PriceLinePartVO;", "bindOrGone", "setupMargins", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PriceLinePartView extends LinearLayout {
    private AtomAction action;
    private Function1<? super AtomAction, Unit> actionHandler;
    private final int dp4;

    @NotNull
    private final PriceAtomView priceAV;

    @NotNull
    private final TextAtomV2View textAV;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.cart.totalV3.presentation.views.PriceLinePartView$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            Function1<AtomAction, Unit> actionHandler;
            Intrinsics.checkNotNullParameter(it, "it");
            AtomAction atomAction = PriceLinePartView.this.action;
            if (atomAction == null || (actionHandler = PriceLinePartView.this.getActionHandler()) == null) {
                return;
            }
            actionHandler.invoke(atomAction);
        }
    }

    public /* synthetic */ PriceLinePartView(Context context, boolean z11, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? false : z11, (i12 & 4) != 0 ? null : attributeSet, (i12 & 8) != 0 ? 0 : i11);
    }

    private final void setupMargins(TotalVO.TotalItemVO.PriceLineVO.PriceLinePartVO priceLinePart) {
        if (priceLinePart.getText() == null && priceLinePart.getPriceWithCommon() != null) {
            ViewGroup.LayoutParams layoutParams = this.priceAV.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if ((marginLayoutParams != null ? marginLayoutParams.leftMargin : 0) != 0) {
                PriceAtomView priceAtomView = this.priceAV;
                ViewGroup.LayoutParams layoutParams2 = priceAtomView.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.leftMargin = 0;
                priceAtomView.setLayoutParams(marginLayoutParams2);
                return;
            }
        }
        if (priceLinePart.getText() == null || priceLinePart.getPriceWithCommon() == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = this.priceAV.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if ((marginLayoutParams3 != null ? marginLayoutParams3.leftMargin : 0) != this.dp4) {
            PriceAtomView priceAtomView2 = this.priceAV;
            ViewGroup.LayoutParams layoutParams4 = priceAtomView2.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
            marginLayoutParams4.leftMargin = this.dp4;
            priceAtomView2.setLayoutParams(marginLayoutParams4);
        }
    }

    public final void bind(@NotNull TotalVO.TotalItemVO.PriceLineVO.PriceLinePartVO priceLinePart) {
        Intrinsics.checkNotNullParameter(priceLinePart, "priceLinePart");
        TotalVO.TotalItemVO.PriceLineVO.PriceWithCommonVO priceWithCommon = priceLinePart.getPriceWithCommon();
        this.action = priceWithCommon != null ? priceWithCommon.getAction() : null;
        TextHolderKt.bindOrGone$default(this.textAV, priceLinePart.getText(), null, 2, null);
        PriceAtomView priceAtomView = this.priceAV;
        TotalVO.TotalItemVO.PriceLineVO.PriceWithCommonVO priceWithCommon2 = priceLinePart.getPriceWithCommon();
        PriceAtomHolderKt.bindOrGone(priceAtomView, priceWithCommon2 != null ? priceWithCommon2.getPrice() : null, this.actionHandler);
        setupMargins(priceLinePart);
    }

    public final void bindOrGone(TotalVO.TotalItemVO.PriceLineVO.PriceLinePartVO priceLinePart) {
        if (priceLinePart == null) {
            ViewExtKt.gone(this);
        } else {
            bind(priceLinePart);
            ViewExtKt.show(this);
        }
    }

    public final Function1<AtomAction, Unit> getActionHandler() {
        return this.actionHandler;
    }

    public final void setActionHandler(Function1<? super AtomAction, Unit> function1) {
        this.actionHandler = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceLinePartView(@NotNull Context context, boolean z11, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        PriceAtomView priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        this.priceAV = priceAtomView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        this.textAV = textAtomV2View;
        this.dp4 = ResourceExtKt.toPx(4, context);
        setOrientation(0);
        setGravity(16);
        ViewExtKt.gone(priceAtomView);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (z11) {
            layoutParams.weight = 1.0f;
        }
        Unit unit = Unit.f71690a;
        addView(textAtomV2View, layoutParams);
        addView(priceAtomView, new ViewGroup.MarginLayoutParams(-2, -2));
        ViewExtKt.setOnClickListenerThrottle$default(priceAtomView, 0L, new AnonymousClass2(), 1, null);
    }
}
