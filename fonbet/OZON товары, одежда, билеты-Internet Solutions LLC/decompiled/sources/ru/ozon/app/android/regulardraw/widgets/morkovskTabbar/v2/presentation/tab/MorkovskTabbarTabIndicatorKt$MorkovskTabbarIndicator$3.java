package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.tab;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.MorkovskTabbarVI;
import u0.InterfaceC9893b;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class MorkovskTabbarTabIndicatorKt$MorkovskTabbarIndicator$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $animateAppearance;
    final /* synthetic */ Function0<Unit> $onAppearanceAnimated;
    final /* synthetic */ MorkovskTabbarVI.Tab.Indicator $state;
    final /* synthetic */ InterfaceC9893b $this_MorkovskTabbarIndicator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MorkovskTabbarTabIndicatorKt$MorkovskTabbarIndicator$3(InterfaceC9893b interfaceC9893b, MorkovskTabbarVI.Tab.Indicator indicator, boolean z11, Function0<Unit> function0, int i11) {
        super(2);
        this.$this_MorkovskTabbarIndicator = interfaceC9893b;
        this.$state = indicator;
        this.$animateAppearance = z11;
        this.$onAppearanceAnimated = function0;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        MorkovskTabbarTabIndicatorKt.MorkovskTabbarIndicator(this.$this_MorkovskTabbarIndicator, this.$state, this.$animateAppearance, this.$onAppearanceAnimated, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
