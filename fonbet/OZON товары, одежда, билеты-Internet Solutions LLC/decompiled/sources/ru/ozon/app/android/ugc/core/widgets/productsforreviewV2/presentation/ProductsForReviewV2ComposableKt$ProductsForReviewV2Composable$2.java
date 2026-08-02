package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductVI;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductsForReviewV2ComposableKt$ProductsForReviewV2Composable$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<AtomAction, Unit> $onCardClick;
    final /* synthetic */ Function0<Unit> $onOnboardingShown;
    final /* synthetic */ Function1<ProductVI.SwipeAction, Unit> $onSwipeActionClick;
    final /* synthetic */ Function0<Unit> $onSwipeStarted;
    final /* synthetic */ Function0<Unit> $onTimerFinish;
    final /* synthetic */ Function1<t, Unit> $onView;
    final /* synthetic */ boolean $shouldShowOnboarding;
    final /* synthetic */ ProductForReviewV2VI $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ProductsForReviewV2ComposableKt$ProductsForReviewV2Composable$2(ProductForReviewV2VI productForReviewV2VI, boolean z11, Function1<? super t, Unit> function1, Function1<? super AtomAction, Unit> function12, Function0<Unit> function0, Function1<? super ProductVI.SwipeAction, Unit> function13, Function0<Unit> function02, Function0<Unit> function03, int i11) {
        super(2);
        this.$state = productForReviewV2VI;
        this.$shouldShowOnboarding = z11;
        this.$onView = function1;
        this.$onCardClick = function12;
        this.$onTimerFinish = function0;
        this.$onSwipeActionClick = function13;
        this.$onSwipeStarted = function02;
        this.$onOnboardingShown = function03;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ProductsForReviewV2ComposableKt.ProductsForReviewV2Composable(this.$state, this.$shouldShowOnboarding, this.$onView, this.$onCardClick, this.$onTimerFinish, this.$onSwipeActionClick, this.$onSwipeStarted, this.$onOnboardingShown, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
