package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import fI.C6473a;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.presentation.AviaCheckTariffsPriceDetailsVO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/view/AviaCheckTariffsPriceDetailsView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Lxe/M;", "scope", "", "showViewAnimated", "(Landroid/view/View;Lxe/M;)V", "hideViewAnimated", "(Landroid/view/View;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/presentation/AviaCheckTariffsPriceDetailsVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/presentation/AviaCheckTariffsPriceDetailsVO;Lxe/M;Lkotlin/jvm/functions/Function1;)V", "", "dp2", "I", "dp4", "dp16", "", "dpf20", "F", "dpf40", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "cellInterpolator", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "Lru/ozon/uni/android/cell/CellView;", "cellViewCV", "Lru/ozon/uni/android/cell/CellView;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonBV", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "descriptionTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaCheckTariffsPriceDetailsView extends LinearLayout {

    @NotNull
    private final ButtonV3View buttonBV;

    @NotNull
    private final AccelerateDecelerateInterpolator cellInterpolator;

    @NotNull
    private final CellView cellViewCV;

    @NotNull
    private final TextAtomV2View descriptionTAV;
    private final int dp16;
    private final int dp2;
    private final int dp4;
    private final float dpf20;
    private final float dpf40;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaCheckTariffsPriceDetailsView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(2, context);
        this.dp2 = px;
        int px2 = ResourceExtKt.toPx(4, context);
        this.dp4 = px2;
        int px3 = ResourceExtKt.toPx(16, context);
        this.dp16 = px3;
        float pxF = ResourceExtKt.toPxF(20, context);
        this.dpf20 = pxF;
        this.dpf40 = ResourceExtKt.toPxF(40, context);
        this.cellInterpolator = new AccelerateDecelerateInterpolator();
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        cellView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        cellView.setVisibility(8);
        this.cellViewCV = cellView;
        q qVar = q.f64554a;
        ButtonV3View buttonV3View = (ButtonV3View) qVar.i(N.b(ButtonV3View.class), context);
        if (buttonV3View == null) {
            buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(px3, px2, px3, 0);
        buttonV3View.setLayoutParams(layoutParams);
        this.buttonBV = buttonV3View;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(px3, px, px3, 0);
        textAtomV2View.setLayoutParams(layoutParams2);
        this.descriptionTAV = textAtomV2View;
        setOrientation(1);
        setBackground(new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.layerFloor1), pxF, pxF, 0.0f, 0.0f));
        setPadding(0, px2, 0, 0);
        addView(cellView);
        addView(buttonV3View);
        addView(textAtomV2View);
    }

    private final void hideViewAnimated(final View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, view.getHeight());
        ofFloat.setInterpolator(this.cellInterpolator);
        ofFloat.addUpdateListener(new C6473a(view, 2));
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.view.AviaCheckTariffsPriceDetailsView$hideViewAnimated$lambda$8$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                view.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideViewAnimated$lambda$8$lambda$6(View view, ValueAnimator valueAnimator) {
        view.setTranslationY(((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    private final void showViewAnimated(View view, M scope) {
        C10727i.c(scope, null, null, new AviaCheckTariffsPriceDetailsView$showViewAnimated$1(view, this, null), 3);
    }

    public final void bind(@NotNull AviaCheckTariffsPriceDetailsVO item, @NotNull M scope, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (item.getLuggage() != null) {
            CellHolderKt.bindOrGone(this.cellViewCV, item.getLuggage(), actionHandler);
            if (item.getShouldAnimateLuggageAppearance()) {
                this.cellViewCV.setTranslationY(this.dpf40);
                showViewAnimated(this.cellViewCV, scope);
            }
        } else if (item.getShouldAnimateLuggageAppearance() && this.cellViewCV.getVisibility() == 0) {
            hideViewAnimated(this.cellViewCV);
        } else {
            this.cellViewCV.setVisibility(8);
        }
        TextHolderKt.bindOrGone$default(this.descriptionTAV, item.getPriceDescription(), null, 2, null);
        ButtonV3HolderKt.bind(this.buttonBV, (item.getShouldShowContinueButton() || item.getScrollToWidgetButton() == null) ? item.getContinueButton() : item.getScrollToWidgetButton(), actionHandler);
    }
}
