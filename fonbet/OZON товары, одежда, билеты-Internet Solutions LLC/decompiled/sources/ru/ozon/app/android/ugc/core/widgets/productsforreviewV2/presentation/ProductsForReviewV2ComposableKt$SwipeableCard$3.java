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

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductsForReviewV2ComposableKt$SwipeableCard$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $content;
    final /* synthetic */ Function0<Unit> $onOnboardingShown;
    final /* synthetic */ Function1<ProductVI.SwipeAction, Unit> $onSwipeActionClick;
    final /* synthetic */ Function0<Unit> $onSwipeStarted;
    final /* synthetic */ Function1<t, Unit> $onView;
    final /* synthetic */ boolean $shouldShowOnboarding;
    final /* synthetic */ ProductVI.SwipeActionsVI $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ProductsForReviewV2ComposableKt$SwipeableCard$3(ProductVI.SwipeActionsVI swipeActionsVI, boolean z11, Function1<? super ProductVI.SwipeAction, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function1<? super t, Unit> function12, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, int i11) {
        super(2);
        this.$state = swipeActionsVI;
        this.$shouldShowOnboarding = z11;
        this.$onSwipeActionClick = function1;
        this.$onSwipeStarted = function0;
        this.$onOnboardingShown = function02;
        this.$onView = function12;
        this.$content = function2;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ProductsForReviewV2ComposableKt.SwipeableCard(this.$state, this.$shouldShowOnboarding, this.$onSwipeActionClick, this.$onSwipeStarted, this.$onOnboardingShown, this.$onView, this.$content, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
