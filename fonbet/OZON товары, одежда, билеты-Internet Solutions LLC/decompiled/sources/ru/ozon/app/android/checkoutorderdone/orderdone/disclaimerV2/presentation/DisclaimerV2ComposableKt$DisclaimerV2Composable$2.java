package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class DisclaimerV2ComposableKt$DisclaimerV2Composable$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ DisclaimerV2VI $item;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;
    final /* synthetic */ Function0<Unit> $onTimerComplete;
    final /* synthetic */ boolean $staticTimerEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DisclaimerV2ComposableKt$DisclaimerV2Composable$2(DisclaimerV2VI disclaimerV2VI, Function1<? super AtomAction, Unit> function1, Function0<Unit> function0, boolean z11, int i11) {
        super(2);
        this.$item = disclaimerV2VI;
        this.$onAction = function1;
        this.$onTimerComplete = function0;
        this.$staticTimerEnabled = z11;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DisclaimerV2ComposableKt.DisclaimerV2Composable(this.$item, this.$onAction, this.$onTimerComplete, this.$staticTimerEnabled, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
