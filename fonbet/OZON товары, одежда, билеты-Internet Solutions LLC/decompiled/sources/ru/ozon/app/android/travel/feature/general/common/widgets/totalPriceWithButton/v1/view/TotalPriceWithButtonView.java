package ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v1.view;

import B90.C2618u;
import Bi.b;
import De.C2860c;
import android.content.Context;
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
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v1.presentation.TotalPriceWithButtonVO;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u0016J\b\u0010\u0018\u001a\u00020\nH\u0002J\b\u0010\u0019\u001a\u00020\nH\u0002J\b\u0010\u001a\u001a\u00020\rH\u0002J\b\u0010\u001b\u001a\u00020\rH\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0002J\b\u0010\u001d\u001a\u00020\u0012H\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v1/view/TotalPriceWithButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp4", "", "dp12", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleView", "priceView", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "subtitlePriceView", "buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v1/presentation/TotalPriceWithButtonVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "createTitleView", "createSubtitleView", "createPriceView", "createSubtitlePriceView", "createButtonView", "addChildren", "createTitleBarrier", "Landroidx/constraintlayout/widget/Barrier;", "createSubtitleBarrier", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TotalPriceWithButtonView extends ConstraintLayout {
    public static final int $stable;

    @NotNull
    private final ButtonV3View buttonView;
    private final int dp12;
    private final int dp4;

    @NotNull
    private final PriceAtomView priceView;

    @NotNull
    private final PriceAtomView subtitlePriceView;

    @NotNull
    private final TextAtomV2View subtitleView;

    @NotNull
    private final TextAtomV2View titleView;

    static {
        int i11 = ButtonV3View.$stable;
        int i12 = PriceAtomView.$stable;
        int i13 = i11 | i12 | i12;
        int i14 = TextAtomV2View.$stable;
        $stable = i13 | i14 | i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotalPriceWithButtonView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp12 = ResourceExtKt.toPx(12, context);
        this.titleView = createTitleView();
        this.subtitleView = createSubtitleView();
        this.priceView = createPriceView();
        this.subtitlePriceView = createSubtitlePriceView();
        this.buttonView = createButtonView();
        addChildren();
    }

    private final void addChildren() {
        addView(this.titleView);
        addView(this.priceView);
        addView(createTitleBarrier());
        addView(this.subtitleView);
        addView(this.subtitlePriceView);
        addView(createSubtitleBarrier());
        addView(this.buttonView);
    }

    private final ButtonV3View createButtonView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b e11 = C2618u.e(buttonV3View, 11, 0, -2);
        e11.f41656t = 0;
        e11.f41658v = 0;
        e11.f41638j = 43;
        e11.f41642l = 0;
        ((ViewGroup.MarginLayoutParams) e11).topMargin = this.dp12;
        buttonV3View.setLayoutParams(e11);
        return buttonV3View;
    }

    private final PriceAtomView createPriceView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PriceAtomView priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        ConstraintLayout.b b11 = C2860c.b(priceAtomView, 7, -2, -2);
        b11.f41658v = 0;
        b11.f41636i = 3;
        b11.f41642l = 3;
        b11.f41655s = 3;
        b11.f41616W = true;
        priceAtomView.setLayoutParams(b11);
        return priceAtomView;
    }

    private final Barrier createSubtitleBarrier() {
        Barrier barrier = new Barrier(getContext());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        barrier.setId(43);
        barrier.f(3);
        barrier.setReferencedIds(new int[]{37, 31});
        barrier.setLayoutParams(bVar);
        return barrier;
    }

    private final PriceAtomView createSubtitlePriceView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PriceAtomView priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        ConstraintLayout.b b11 = C2860c.b(priceAtomView, 31, -2, -2);
        b11.f41655s = 37;
        b11.f41636i = 37;
        b11.f41642l = 37;
        b11.f41658v = 0;
        ((ViewGroup.MarginLayoutParams) b11).topMargin = this.dp4;
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
        ConstraintLayout.b d11 = b.d(textAtomV2View, 37, -2, -2);
        d11.f41656t = 0;
        d11.f41638j = 17;
        d11.f41657u = 31;
        Context context2 = textAtomV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        d11.setMarginEnd(ResourceExtKt.toPx(32, context2));
        Context context3 = textAtomV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        ((ViewGroup.MarginLayoutParams) d11).topMargin = ResourceExtKt.toPx(4, context3);
        d11.f41603J = 1;
        d11.f41598E = 0.0f;
        d11.f41616W = true;
        textAtomV2View.setLayoutParams(d11);
        return textAtomV2View;
    }

    private final Barrier createTitleBarrier() {
        Barrier barrier = new Barrier(getContext());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        barrier.setId(17);
        barrier.f(3);
        barrier.setReferencedIds(new int[]{3, 7});
        barrier.setLayoutParams(bVar);
        return barrier;
    }

    private final TextAtomV2View createTitleView() {
        q qVar = q.f64554a;
        d b11 = N.b(TextAtomV2View.class);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(b11, context);
        ConstraintLayout.b d11 = b.d(textAtomV2View, 3, -2, -2);
        d11.f41656t = 0;
        d11.f41636i = 0;
        d11.f41657u = 7;
        d11.f41603J = 1;
        d11.f41616W = true;
        d11.setMarginEnd(this.dp12);
        textAtomV2View.setLayoutParams(d11);
        return textAtomV2View;
    }

    public final void bind(@NotNull TotalPriceWithButtonVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextHolderKt.bind$default(this.titleView, item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleView, item.getSubtitle(), null, 2, null);
        PriceAtomHolderKt.bind(this.priceView, item.getPrice(), actionHandler);
        PriceAtomHolderKt.bindOrGone(this.subtitlePriceView, item.getSubtitlePrice(), actionHandler);
        ButtonV3HolderKt.bind(this.buttonView, item.getButton(), actionHandler);
    }
}
