package ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.view;

import B90.C2618u;
import BP.a;
import Bi.b;
import De.C2860c;
import Kk.C3531a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.TotalPriceWithButtonV2VO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.extensions.TextDTOExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\"0&j\u0002`(2\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\"0&j\u0002`(J\u0006\u0010*\u001a\u00020\u0007J\u0006\u0010+\u001a\u00020\u0007J\u000e\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020.J\u0006\u0010/\u001a\u00020\"J\b\u00100\u001a\u00020\u0010H\u0002J\b\u00101\u001a\u00020\u0012H\u0002J\b\u00102\u001a\u00020\u0014H\u0002J\b\u00103\u001a\u00020\u0016H\u0002J\b\u00104\u001a\u00020\u0014H\u0002J\b\u00105\u001a\u00020\u0019H\u0002J\b\u00106\u001a\u00020\u0019H\u0002J\b\u00107\u001a\u00020\u001cH\u0002J\b\u00108\u001a\u00020\u0014H\u0002J\b\u00109\u001a\u00020\"H\u0002J\b\u0010:\u001a\u00020\u001fH\u0002J\b\u0010;\u001a\u00020\u001fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/view/TotalPriceWithButtonV2View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp2", "", "dp4", "dp8", "dp12", "dp16", "dp32", "dpF20", "", "titleClickAreaView", "Landroid/view/View;", "timerView", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/view/TotalPriceWithButtonV2TimerView;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleIconView", "Lru/ozon/uni/android/atom/icon/IconView;", "subtitleView", "priceView", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "subtitlePriceView", "buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "agreementView", "titleBarrier", "Landroidx/constraintlayout/widget/Barrier;", "subtitleBarrier", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2VO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "processedActionHandler", "getTopOfButton", "getHeightOfButton", "updateTimerText", "newText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "hideTimer", "createTitleClickAreaView", "createTimerView", "createTitleView", "createTitleIconView", "createSubtitleView", "createPriceView", "createSubtitlePriceView", "createButtonView", "createAgreementView", "addChildren", "createTitleBarrier", "createSubtitleBarrier", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TotalPriceWithButtonV2View extends ConstraintLayout {

    @NotNull
    private final TextAtomV2View agreementView;

    @NotNull
    private final ButtonV3View buttonView;
    private final int dp12;
    private final int dp16;
    private final int dp2;
    private final int dp32;
    private final int dp4;
    private final int dp8;
    private final float dpF20;

    @NotNull
    private final PriceAtomView priceView;

    @NotNull
    private final Barrier subtitleBarrier;

    @NotNull
    private final PriceAtomView subtitlePriceView;

    @NotNull
    private final TextAtomV2View subtitleView;

    @NotNull
    private final TotalPriceWithButtonV2TimerView timerView;

    @NotNull
    private final Barrier titleBarrier;

    @NotNull
    private final View titleClickAreaView;

    @NotNull
    private final IconView titleIconView;

    @NotNull
    private final TextAtomV2View titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotalPriceWithButtonV2View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp2 = ResourceExtKt.toPx(2, context);
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp12 = ResourceExtKt.toPx(12, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.dp32 = ResourceExtKt.toPx(32, context);
        float pxF = ResourceExtKt.toPxF(20, context);
        this.dpF20 = pxF;
        this.titleClickAreaView = createTitleClickAreaView();
        this.timerView = createTimerView();
        this.titleView = createTitleView();
        this.titleIconView = createTitleIconView();
        this.subtitleView = createSubtitleView();
        this.priceView = createPriceView();
        this.subtitlePriceView = createSubtitlePriceView();
        this.buttonView = createButtonView();
        this.agreementView = createAgreementView();
        this.titleBarrier = createTitleBarrier();
        this.subtitleBarrier = createSubtitleBarrier();
        addChildren();
        setBackground(new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.layerFloor1), pxF, pxF, 0.0f, 0.0f));
    }

    private final void addChildren() {
        addView(this.timerView);
        addView(this.titleView);
        addView(this.titleIconView);
        addView(this.priceView);
        addView(this.titleBarrier);
        addView(this.subtitleView);
        addView(this.subtitlePriceView);
        addView(this.subtitleBarrier);
        addView(this.buttonView);
        addView(this.agreementView);
        addView(this.titleClickAreaView);
    }

    private final TextAtomV2View createAgreementView() {
        q qVar = q.f64554a;
        d b11 = N.b(TextAtomV2View.class);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(b11, context);
        ConstraintLayout.b d11 = b.d(textAtomV2View, 85, 0, -2);
        d11.f41656t = 0;
        d11.f41638j = 74;
        d11.f41658v = 0;
        ((ViewGroup.MarginLayoutParams) d11).topMargin = this.dp4;
        textAtomV2View.setLayoutParams(d11);
        return textAtomV2View;
    }

    private final ButtonV3View createButtonView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b e11 = C2618u.e(buttonV3View, 74, 0, -2);
        e11.f41656t = 0;
        e11.f41658v = 0;
        e11.f41638j = 102;
        ((ViewGroup.MarginLayoutParams) e11).topMargin = this.dp12;
        buttonV3View.setLayoutParams(e11);
        return buttonV3View;
    }

    private final PriceAtomView createPriceView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PriceAtomView priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        ConstraintLayout.b b11 = C2860c.b(priceAtomView, 13, -2, -2);
        b11.f41636i = 3;
        b11.f41642l = 3;
        b11.f41658v = 0;
        priceAtomView.setLayoutParams(b11);
        return priceAtomView;
    }

    private final Barrier createSubtitleBarrier() {
        Barrier barrier = new Barrier(getContext());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        barrier.setId(102);
        barrier.f(3);
        barrier.setReferencedIds(new int[]{9, 24});
        barrier.setLayoutParams(bVar);
        return barrier;
    }

    private final PriceAtomView createSubtitlePriceView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PriceAtomView priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        ConstraintLayout.b b11 = C2860c.b(priceAtomView, 24, -2, -2);
        b11.f41655s = 9;
        b11.f41636i = 9;
        b11.f41642l = 9;
        b11.f41658v = 0;
        b11.f41616W = true;
        priceAtomView.setLayoutParams(b11);
        return priceAtomView;
    }

    private final TextAtomV2View createSubtitleView() {
        q qVar = q.f64554a;
        d b11 = N.b(TextAtomV2View.class);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(b11, context);
        ConstraintLayout.b d11 = b.d(textAtomV2View, 9, -2, -2);
        d11.f41656t = 0;
        d11.f41638j = 90;
        d11.f41657u = 24;
        d11.setMarginEnd(this.dp8);
        d11.f41603J = 1;
        d11.f41598E = 0.0f;
        d11.f41616W = true;
        textAtomV2View.setLayoutParams(d11);
        return textAtomV2View;
    }

    private final TotalPriceWithButtonV2TimerView createTimerView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TotalPriceWithButtonV2TimerView totalPriceWithButtonV2TimerView = new TotalPriceWithButtonV2TimerView(context);
        totalPriceWithButtonV2TimerView.setId(2);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, this.dp32);
        bVar.f41636i = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        totalPriceWithButtonV2TimerView.setLayoutParams(bVar);
        return totalPriceWithButtonV2TimerView;
    }

    private final Barrier createTitleBarrier() {
        Barrier barrier = new Barrier(getContext());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        barrier.setId(90);
        barrier.f(3);
        barrier.setReferencedIds(new int[]{3, 13});
        barrier.setLayoutParams(bVar);
        return barrier;
    }

    private final View createTitleClickAreaView() {
        View view = new View(getContext());
        view.setId(110);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.f41656t = 3;
        bVar.f41658v = 13;
        bVar.f41636i = 3;
        bVar.f41642l = 3;
        view.setLayoutParams(bVar);
        return view;
    }

    private final IconView createTitleIconView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IconView iconView = new IconView(context, null, 0, 6, null);
        ConstraintLayout.b a11 = C3531a.a(iconView, 5, -2, -2);
        a11.f41636i = 3;
        a11.f41642l = 3;
        a11.f41655s = 3;
        a11.f41657u = 13;
        a11.setMarginStart(this.dp2);
        a11.f41598E = 0.0f;
        iconView.setLayoutParams(a11);
        return iconView;
    }

    private final TextAtomV2View createTitleView() {
        q qVar = q.f64554a;
        d b11 = N.b(TextAtomV2View.class);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(b11, context);
        ConstraintLayout.b d11 = b.d(textAtomV2View, 3, -2, -2);
        d11.f41638j = 2;
        d11.f41656t = 0;
        d11.f41657u = 5;
        d11.f41616W = true;
        d11.f41603J = 2;
        d11.f41598E = 0.0f;
        ((ViewGroup.MarginLayoutParams) d11).topMargin = this.dp16;
        d11.f41660x = 0;
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setFocusable(false);
        textAtomV2View.setClickable(false);
        return textAtomV2View;
    }

    public final void bind(@NotNull TotalPriceWithButtonV2VO item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super AtomAction, Unit> processedActionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(processedActionHandler, "processedActionHandler");
        this.timerView.bindOrGone(item.getTimer());
        TextHolderKt.bindOrGone$default(this.titleView, item.getTitle(), null, 2, null);
        AtomAction titleAction = item.getTitleAction();
        if (titleAction != null) {
            this.titleClickAreaView.setOnClickListener(new a(0, actionHandler, titleAction));
        }
        IconHolderKt.bindOrGone$default(this.titleIconView, item.getTitleIcon(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleView, item.getSubtitle(), null, 2, null);
        PriceAtomHolderKt.bindOrGone(this.priceView, item.getTitlePrice(), actionHandler);
        PriceAtomHolderKt.bindOrGone(this.subtitlePriceView, item.getSubtitlePrice(), actionHandler);
        ButtonV3HolderKt.bind(this.buttonView, item.getNextButton(), processedActionHandler);
        TextAtomV2View textAtomV2View = this.agreementView;
        TextDTO agreement = item.getAgreement();
        TextHolderKt.bindOrGone(textAtomV2View, agreement != null ? TextDTOExtensionsKt.withNavigationLinksHandling(agreement, this.agreementView, actionHandler) : null, actionHandler);
    }

    public final int getHeightOfButton() {
        return this.buttonView.getHeight();
    }

    public final int getTopOfButton() {
        return this.buttonView.getTop();
    }

    public final void hideTimer() {
        ViewExtKt.gone(this.timerView);
    }

    public final void updateTimerText(@NotNull TextDTO newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        this.timerView.updateTimerText(newText);
    }
}
