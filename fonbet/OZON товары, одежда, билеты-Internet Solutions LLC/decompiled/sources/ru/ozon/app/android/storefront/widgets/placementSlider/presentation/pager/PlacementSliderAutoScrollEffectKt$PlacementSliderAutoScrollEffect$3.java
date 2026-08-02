package ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import y0.b0;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PlacementSliderAutoScrollEffectKt$PlacementSliderAutoScrollEffect$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isPaused;
    final /* synthetic */ Function1<Integer, Integer> $nextPage;
    final /* synthetic */ b0 $pagerState;
    final /* synthetic */ long $scrollInterval;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PlacementSliderAutoScrollEffectKt$PlacementSliderAutoScrollEffect$3(b0 b0Var, long j11, boolean z11, boolean z12, Function1<? super Integer, Integer> function1, int i11) {
        super(2);
        this.$pagerState = b0Var;
        this.$scrollInterval = j11;
        this.$isEnabled = z11;
        this.$isPaused = z12;
        this.$nextPage = function1;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        PlacementSliderAutoScrollEffectKt.PlacementSliderAutoScrollEffect(this.$pagerState, this.$scrollInterval, this.$isEnabled, this.$isPaused, this.$nextPage, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
