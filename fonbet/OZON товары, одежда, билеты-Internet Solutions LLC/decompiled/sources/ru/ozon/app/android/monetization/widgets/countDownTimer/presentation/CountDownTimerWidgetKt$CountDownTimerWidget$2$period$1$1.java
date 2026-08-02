package ru.ozon.app.android.monetization.widgets.countDownTimer.presentation;

import Tg.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.app.android.pdp.ui.configurators.ugc.common.SubmitButtonAvailabilityUpdate;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CountDownTimerWidgetKt$CountDownTimerWidget$2$period$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function1<b, Unit> $actionHandler;
    final /* synthetic */ InterfaceC7851b $composerController;
    final /* synthetic */ CountDownTimerVI $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CountDownTimerWidgetKt$CountDownTimerWidget$2$period$1$1(InterfaceC7851b interfaceC7851b, CountDownTimerVI countDownTimerVI, Function1<? super b, Unit> function1) {
        super(0);
        this.$composerController = interfaceC7851b;
        this.$state = countDownTimerVI;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$composerController.update(new SubmitButtonAvailabilityUpdate(false));
        b action = this.$state.getAction();
        if (action != null) {
            this.$actionHandler.invoke(action);
        }
    }
}
