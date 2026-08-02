package ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.view;

import Bl.b;
import Lc.a;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.presentation.RailwayScrollPriceCalendarVO;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.apsect.AspectHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00140\u0018J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/view/RailwayScrollPriceCalendarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp2", "", "dp10", "dp12", "aspectAV", "Lru/ozon/uni/android/atom/aspect/AspectView;", "priceTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "priceIconIV", "Lru/ozon/uni/android/atom/icon/IconView;", "dateTAV", "barrierB", "Landroidx/constraintlayout/widget/Barrier;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$DateTabVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "addViews", "setConstraints", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
public final class RailwayScrollPriceCalendarView extends ConstraintLayout {

    @NotNull
    private final AspectView aspectAV;

    @NotNull
    private final Barrier barrierB;

    @NotNull
    private final TextAtomV2View dateTAV;
    private final int dp10;
    private final int dp12;
    private final int dp2;

    @NotNull
    private final IconView priceIconIV;

    @NotNull
    private final TextAtomV2View priceTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RailwayScrollPriceCalendarView(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp2 = ResourceExtKt.toPx(2, context);
        this.dp10 = ResourceExtKt.toPx(10, context);
        this.dp12 = ResourceExtKt.toPx(12, context);
        q qVar = q.f64554a;
        AspectView aspectView = (AspectView) qVar.g(N.b(AspectView.class), context);
        aspectView.setId(R$id.railwayScrollPriceCalendarAspectAV);
        aspectView.setLayoutParams(new ConstraintLayout.b(0, 0));
        this.aspectAV = aspectView;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        a.d(textAtomV2View, R$id.railwayScrollPriceCalendarPriceTAV, -2, -2, false);
        this.priceTAV = textAtomV2View;
        IconView iconView = (IconView) b.a(IconView.class, "type", qVar, null);
        if (iconView == null) {
            context2 = context;
            iconView = new IconView(context2, null, 0, 6, null);
        } else {
            context2 = context;
        }
        iconView.setId(R$id.railwayScrollPriceCalendarPriceIconIV);
        iconView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.priceIconIV = iconView;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context2);
        a.d(textAtomV2View2, R$id.railwayScrollPriceCalendarDateTAV, -2, -2, false);
        this.dateTAV = textAtomV2View2;
        Barrier barrier = new Barrier(context2);
        barrier.setId(R$id.railwayScrollPriceCalendarBarrierB);
        barrier.f(3);
        barrier.setReferencedIds(new int[]{textAtomV2View.getId(), iconView.getId()});
        this.barrierB = barrier;
        addViews();
        setConstraints();
    }

    private final void addViews() {
        addView(this.aspectAV);
        addView(this.priceTAV);
        addView(this.priceIconIV);
        addView(this.barrierB);
        addView(this.dateTAV);
    }

    private final void setConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new RailwayScrollPriceCalendarView$setConstraints$1(this));
    }

    public final void bind(@NotNull RailwayScrollPriceCalendarVO.DateTabVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        AspectHolderKt.bind(this.aspectAV, item.getAspect(), actionHandler);
        TextHolderKt.bindOrGone$default(this.priceTAV, item.getPriceText(), null, 2, null);
        IconHolderKt.bindOrGone$default(this.priceIconIV, item.getPriceIcon(), null, 2, null);
        TextHolderKt.bind$default(this.dateTAV, item.getDate(), null, 2, null);
    }
}
