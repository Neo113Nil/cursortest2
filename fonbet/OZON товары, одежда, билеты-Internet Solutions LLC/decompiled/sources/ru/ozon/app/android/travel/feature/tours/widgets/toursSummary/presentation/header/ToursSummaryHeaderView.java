package ru.ozon.app.android.travel.feature.tours.widgets.toursSummary.presentation.header;

import Am.C2438a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.molecules.view.timer.TimerView;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import xe.M;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0018\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u0015¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSummary/presentation/header/ToursSummaryHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSummary/presentation/header/ToursSummaryHeaderVO;", "item", "", "updateTitleTopMarginIfNecessary", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursSummary/presentation/header/ToursSummaryHeaderVO;)V", "", "isTitleOnTop", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursSummary/presentation/header/ToursSummaryHeaderVO;)Z", "Lxe/M;", "timerScope", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursSummary/presentation/header/ToursSummaryHeaderVO;Lxe/M;Lkotlin/jvm/functions/Function1;)V", "dp20", "I", "dp16", "dp12", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "timerShimmer", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTav", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "Landroidx/appcompat/widget/AppCompatImageView;", "logoAciv", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/app/android/travel/molecules/view/timer/TimerView;", "timerTv", "Lru/ozon/app/android/travel/molecules/view/timer/TimerView;", "Landroidx/constraintlayout/widget/Barrier;", "timerBarrier", "Landroidx/constraintlayout/widget/Barrier;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursSummaryHeaderView extends ConstraintLayout {
    private final int dp12;
    private final int dp16;
    private final int dp20;

    @NotNull
    private final AppCompatImageView logoAciv;

    @NotNull
    private final Barrier timerBarrier;

    @NotNull
    private final RoundedShimmerView timerShimmer;

    @NotNull
    private final TimerView timerTv;

    @NotNull
    private final TextAtomView titleTav;

    public /* synthetic */ ToursSummaryHeaderView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final boolean isTitleOnTop(ToursSummaryHeaderVO item) {
        return item.getPayUntilBadge() == null && !item.getShouldShowPayUntilShimmer();
    }

    private final void updateTitleTopMarginIfNecessary(ToursSummaryHeaderVO item) {
        ViewExtensionsKt.safeUpdateMargins$default(this.titleTav, Integer.valueOf(isTitleOnTop(item) ? this.dp16 : this.dp12), null, null, null, 14, null);
    }

    public final void bind(@NotNull ToursSummaryHeaderVO item, @NotNull M timerScope, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(timerScope, "timerScope");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextAtomHolderKt.bindOrGone$default(this.titleTav, item.getTitle(), null, 2, null);
        this.logoAciv.setVisibility(item.getIsLogoVisible() ? 0 : 8);
        String logoUrl = item.getLogoUrl();
        if (logoUrl != null) {
            ImageViewExtKt.load$default(this.logoAciv, logoUrl, null, null, null, null, false, null, 126, null);
        }
        if (item.getShouldShowPayUntilShimmer()) {
            this.timerTv.destroyTimer();
            ViewExtKt.gone(this.timerTv);
            ViewExtKt.show(this.timerShimmer);
        } else {
            ViewExtKt.gone(this.timerShimmer);
            this.timerTv.bindOrGone(item.getPayUntilBadge(), timerScope, actionHandler);
        }
        updateTitleTopMarginIfNecessary(item);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursSummaryHeaderView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(20, context);
        this.dp20 = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        int px3 = ResourceExtKt.toPx(12, context);
        this.dp12 = px3;
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView.setId(123124);
        roundedShimmerView.setLayoutParams(new ConstraintLayout.b(ResourceExtKt.toPx(218, context), px));
        roundedShimmerView.setCornerRadius(ResourceExtKt.toPxF(6, context));
        this.timerShimmer = roundedShimmerView;
        TextAtomView textAtomView = (TextAtomView) q.f64554a.g(N.b(TextAtomView.class), context);
        C2438a.e(textAtomView, 267682, 0, -2);
        this.titleTav = textAtomView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(8173981);
        appCompatImageView.setLayoutParams(new ConstraintLayout.b(ResourceExtKt.toPx(68, context), ResourceExtKt.toPx(18, context)));
        this.logoAciv = appCompatImageView;
        TimerView timerView = new TimerView(context, null, 0, 6, null);
        timerView.setId(713616);
        timerView.setLayoutParams(new ConstraintLayout.b(-2, px));
        this.timerTv = timerView;
        Barrier barrier = new Barrier(context);
        barrier.setId(21983718);
        barrier.setLayoutParams(new ConstraintLayout.b(-2, -2));
        barrier.setReferencedIds(new int[]{roundedShimmerView.getId(), timerView.getId()});
        barrier.f(3);
        this.timerBarrier = barrier;
        addView(textAtomView);
        addView(appCompatImageView);
        addView(timerView);
        addView(roundedShimmerView);
        addView(barrier);
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.topToTop(dVar, timerView.getId(), 0, px2);
        ConstraintSetExtKt.startToStart(dVar, timerView.getId(), 0, px2);
        ConstraintSetExtKt.endToEnd(dVar, timerView.getId(), 0, px2);
        dVar.c0(0.0f, timerView.getId());
        dVar.C(timerView.getId(), true);
        ConstraintSetExtKt.topToBottom(dVar, textAtomView.getId(), barrier.getId(), px3);
        ConstraintSetExtKt.startToStart(dVar, textAtomView.getId(), 0, px2);
        ConstraintSetExtKt.endToStart(dVar, textAtomView.getId(), appCompatImageView.getId(), px);
        ConstraintSetExtKt.topToTop$default(dVar, appCompatImageView.getId(), textAtomView.getId(), 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, appCompatImageView.getId(), textAtomView.getId(), 0, 4, null);
        ConstraintSetExtKt.endToEnd(dVar, appCompatImageView.getId(), 0, px2);
        ConstraintSetExtKt.topToTop(dVar, roundedShimmerView.getId(), 0, px2);
        ConstraintSetExtKt.startToStart(dVar, roundedShimmerView.getId(), 0, px2);
        ConstraintSetExtKt.endToEnd(dVar, roundedShimmerView.getId(), 0, px2);
        dVar.c0(0.0f, roundedShimmerView.getId());
        dVar.f(this);
    }
}
