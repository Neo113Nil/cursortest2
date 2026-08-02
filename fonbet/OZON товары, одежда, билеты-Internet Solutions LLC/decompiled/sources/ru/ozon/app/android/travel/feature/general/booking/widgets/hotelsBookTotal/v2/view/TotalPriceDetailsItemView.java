package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.view;

import DN.a;
import DN.b;
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
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.presentation.HotelsBookTotalV2VO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/view/TotalPriceDetailsItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp4", "nameTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "barrier", "Landroidx/constraintlayout/widget/Barrier;", "priceView", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "noteTextView", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "infoIconAction", "clickAction", "bind", "item", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$TotalPriceDetailItemVO;", "addChildren", "setUpIconView", "setUpRoot", "createTextView", "viewId", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TotalPriceDetailsItemView extends ConstraintLayout {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final Barrier barrier;
    private AtomAction clickAction;
    private final int dp4;
    private final int dp8;

    @NotNull
    private final IconView iconView;
    private AtomAction infoIconAction;

    @NotNull
    private final TextAtomV2View nameTextView;

    @NotNull
    private final TextAtomV2View noteTextView;

    @NotNull
    private final PriceAtomView priceView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotalPriceDetailsItemView(@NotNull Context context) {
        super(context);
        int i11;
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(8, context);
        this.dp8 = px;
        int px2 = ResourceExtKt.toPx(4, context);
        this.dp4 = px2;
        TextAtomV2View createTextView = createTextView(591);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41656t = 0;
        bVar.f41657u = 592;
        bVar.f41636i = 0;
        bVar.f41616W = true;
        createTextView.setLayoutParams(bVar);
        this.nameTextView = createTextView;
        q qVar = q.f64554a;
        IconView iconView = (IconView) qVar.i(N.b(IconView.class), context);
        iconView = iconView == null ? new IconView(context, null, 0, 6, null) : iconView;
        ConstraintLayout.b a11 = C3531a.a(iconView, 592, -2, -2);
        a11.f41636i = 591;
        a11.f41655s = 591;
        a11.f41642l = 591;
        a11.setMarginStart(px2);
        iconView.setLayoutParams(a11);
        iconView.setVisibility(8);
        this.iconView = iconView;
        Barrier barrier = new Barrier(context);
        barrier.setId(593);
        barrier.setLayoutParams(new ConstraintLayout.b(-2, -2));
        barrier.setReferencedIds(new int[]{591, 592});
        barrier.f(6);
        this.barrier = barrier;
        PriceAtomView priceAtomView = (PriceAtomView) qVar.i(N.b(PriceAtomView.class), context);
        if (priceAtomView == null) {
            i11 = 593;
            priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        } else {
            i11 = 593;
        }
        ConstraintLayout.b b11 = C2860c.b(priceAtomView, 594, -2, -2);
        b11.f41655s = i11;
        b11.f41658v = 0;
        b11.f41636i = 0;
        b11.setMarginStart(px);
        b11.f41616W = true;
        b11.f41598E = 1.0f;
        priceAtomView.setLayoutParams(b11);
        this.priceView = priceAtomView;
        TextAtomV2View createTextView2 = createTextView(595);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41638j = 591;
        bVar2.f41656t = 0;
        bVar2.f41657u = 594;
        ((ViewGroup.MarginLayoutParams) bVar2).topMargin = px2;
        bVar2.setMarginEnd(px);
        createTextView2.setLayoutParams(bVar2);
        createTextView2.setVisibility(8);
        this.noteTextView = createTextView2;
        addChildren();
        setUpIconView();
        setUpRoot();
    }

    private final void addChildren() {
        addView(this.nameTextView);
        addView(this.iconView);
        addView(this.barrier);
        addView(this.priceView);
        addView(this.noteTextView);
    }

    private final TextAtomV2View createTextView(int viewId) {
        q qVar = q.f64554a;
        d b11 = N.b(TextAtomV2View.class);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(b11, context);
        textAtomV2View.setId(viewId);
        textAtomV2View.setTextIsSelectable(false);
        return textAtomV2View;
    }

    private final void setUpIconView() {
        this.iconView.setOnClickListener(new a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpIconView$lambda$10(TotalPriceDetailsItemView totalPriceDetailsItemView, View view) {
        Function1<? super AtomAction, Unit> function1;
        AtomAction atomAction = totalPriceDetailsItemView.infoIconAction;
        if (atomAction == null || (function1 = totalPriceDetailsItemView.actionHandler) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    private final void setUpRoot() {
        setOnClickListener(new b(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpRoot$lambda$12(TotalPriceDetailsItemView totalPriceDetailsItemView, View view) {
        Function1<? super AtomAction, Unit> function1;
        AtomAction atomAction = totalPriceDetailsItemView.clickAction;
        if (atomAction == null || (function1 = totalPriceDetailsItemView.actionHandler) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    public final void bind(@NotNull HotelsBookTotalV2VO.TotalPriceDetailItemVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        this.infoIconAction = item.getInfoIconAction();
        this.clickAction = item.getClickAction();
        TextHolderKt.bind$default(this.nameTextView, item.getName(), null, 2, null);
        IconHolderKt.bindOrGone$default(this.iconView, item.getInfoIcon(), null, 2, null);
        PriceAtomHolderKt.bind(this.priceView, item.getPrice(), actionHandler);
        TextHolderKt.bindOrGone$default(this.noteTextView, item.getNote(), null, 2, null);
    }
}
