package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import m0.C7980b;
import m0.C8008p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductsForReviewV2ComposableKt$ShowOnboardingIfNeeded$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ float $actionsWidthPx;
    final /* synthetic */ C7980b<Float, C8008p> $offsetX;
    final /* synthetic */ Function0<Unit> $onOnboardingShown;
    final /* synthetic */ boolean $shouldShowOnboarding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductsForReviewV2ComposableKt$ShowOnboardingIfNeeded$2(boolean z11, C7980b<Float, C8008p> c7980b, float f7, Function0<Unit> function0, int i11) {
        super(2);
        this.$shouldShowOnboarding = z11;
        this.$offsetX = c7980b;
        this.$actionsWidthPx = f7;
        this.$onOnboardingShown = function0;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ProductsForReviewV2ComposableKt.ShowOnboardingIfNeeded(this.$shouldShowOnboarding, this.$offsetX, this.$actionsWidthPx, this.$onOnboardingShown, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
