package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class DisclaimerV2ComposableKt$DisclaimerTimerWrapper$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ DisclaimerDTO $dto;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;
    final /* synthetic */ Function0<Unit> $onTimerComplete;
    final /* synthetic */ boolean $staticTimerEnabled;
    final /* synthetic */ TimerVI $timer;
    final /* synthetic */ int $timerColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DisclaimerV2ComposableKt$DisclaimerTimerWrapper$1(e eVar, DisclaimerDTO disclaimerDTO, Function1<? super AtomAction, Unit> function1, TimerVI timerVI, Function0<Unit> function0, int i11, boolean z11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$dto = disclaimerDTO;
        this.$onAction = function1;
        this.$timer = timerVI;
        this.$onTimerComplete = function0;
        this.$timerColor = i11;
        this.$staticTimerEnabled = z11;
        this.$$changed = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DisclaimerV2ComposableKt.DisclaimerTimerWrapper(this.$modifier, this.$dto, this.$onAction, this.$timer, this.$onTimerComplete, this.$timerColor, this.$staticTimerEnabled, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
