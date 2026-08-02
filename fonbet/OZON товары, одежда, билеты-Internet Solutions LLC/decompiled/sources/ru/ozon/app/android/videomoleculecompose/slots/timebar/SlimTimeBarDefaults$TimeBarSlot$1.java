package ru.ozon.app.android.videomoleculecompose.slots.timebar;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SlimTimeBarDefaults$TimeBarSlot$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ SlimTimeBarBehavior $behavior;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function2<Long, Boolean, Unit> $onScrubEnd;
    final /* synthetic */ Function1<Long, Unit> $onScrubMove;
    final /* synthetic */ Function1<Long, Unit> $onScrubStart;
    final /* synthetic */ SlimTimeBarState $state;
    final /* synthetic */ SlimTimeBarStyle $style;
    final /* synthetic */ SlimTimeBarDefaults $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SlimTimeBarDefaults$TimeBarSlot$1(SlimTimeBarDefaults slimTimeBarDefaults, SlimTimeBarState slimTimeBarState, e eVar, SlimTimeBarStyle slimTimeBarStyle, SlimTimeBarBehavior slimTimeBarBehavior, Function1<? super Long, Unit> function1, Function1<? super Long, Unit> function12, Function2<? super Long, ? super Boolean, Unit> function2, int i11) {
        super(2);
        this.$tmp0_rcvr = slimTimeBarDefaults;
        this.$state = slimTimeBarState;
        this.$modifier = eVar;
        this.$style = slimTimeBarStyle;
        this.$behavior = slimTimeBarBehavior;
        this.$onScrubStart = function1;
        this.$onScrubMove = function12;
        this.$onScrubEnd = function2;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        this.$tmp0_rcvr.TimeBarSlot(this.$state, this.$modifier, this.$style, this.$behavior, this.$onScrubStart, this.$onScrubMove, this.$onScrubEnd, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
