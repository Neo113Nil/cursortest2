package ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarBehavior;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarState;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarStyle;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PlayerShowcaseV2CustomizationsSlots$CustomizationTimeBar$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ SlimTimeBarBehavior $behavior;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function2<Long, Boolean, Unit> $onEnd;
    final /* synthetic */ Function1<Long, Unit> $onMove;
    final /* synthetic */ Function1<Long, Unit> $onStart;
    final /* synthetic */ SlimTimeBarState $slotState;
    final /* synthetic */ SlimTimeBarStyle $style;
    final /* synthetic */ PlayerShowcaseV2CustomizationsSlots $tmp3_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PlayerShowcaseV2CustomizationsSlots$CustomizationTimeBar$4(PlayerShowcaseV2CustomizationsSlots playerShowcaseV2CustomizationsSlots, SlimTimeBarState slimTimeBarState, e eVar, SlimTimeBarStyle slimTimeBarStyle, SlimTimeBarBehavior slimTimeBarBehavior, Function1<? super Long, Unit> function1, Function1<? super Long, Unit> function12, Function2<? super Long, ? super Boolean, Unit> function2, int i11, int i12) {
        super(2);
        this.$tmp3_rcvr = playerShowcaseV2CustomizationsSlots;
        this.$slotState = slimTimeBarState;
        this.$modifier = eVar;
        this.$style = slimTimeBarStyle;
        this.$behavior = slimTimeBarBehavior;
        this.$onStart = function1;
        this.$onMove = function12;
        this.$onEnd = function2;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        this.$tmp3_rcvr.CustomizationTimeBar(this.$slotState, this.$modifier, this.$style, this.$behavior, this.$onStart, this.$onMove, this.$onEnd, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
