package ru.ozon.app.android.ugc.core.widgets.timerButton.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import Tg.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TimerButtonKt$TimerButton$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1<b, Unit> $actionHandler;
    final /* synthetic */ Function2<TimerButtonVO, t, Unit> $onView;
    final /* synthetic */ int $secondsLeft;
    final /* synthetic */ TimerButtonVO $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TimerButtonKt$TimerButton$3(TimerButtonVO timerButtonVO, int i11, Function2<? super TimerButtonVO, ? super t, Unit> function2, Function1<? super b, Unit> function1, int i12, int i13) {
        super(2);
        this.$state = timerButtonVO;
        this.$secondsLeft = i11;
        this.$onView = function2;
        this.$actionHandler = function1;
        this.$$changed = i12;
        this.$$default = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        TimerButtonKt.TimerButton(this.$state, this.$secondsLeft, this.$onView, this.$actionHandler, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
