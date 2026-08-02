package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation;

import Ae.InterfaceC2395h;
import Bl0.C2652m;
import S0.InterfaceC3967k;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AppOnboardingWidgetKt$HandleOnboardingStateEffect$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0<Unit> $closeFlow;
    final /* synthetic */ Function2<Uri, Uri, Unit> $closeFlowWithRedirect;
    final /* synthetic */ InterfaceC2395h<AppOnboardingViewModel.Event> $events;
    final /* synthetic */ Function0<Unit> $onFinished;
    final /* synthetic */ Function1<d<? super Unit>, Object> $scrollToPage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AppOnboardingWidgetKt$HandleOnboardingStateEffect$2(InterfaceC2395h<? extends AppOnboardingViewModel.Event> interfaceC2395h, Function0<Unit> function0, Function2<? super Uri, ? super Uri, Unit> function2, Function0<Unit> function02, Function1<? super d<? super Unit>, ? extends Object> function1, int i11) {
        super(2);
        this.$events = interfaceC2395h;
        this.$closeFlow = function0;
        this.$closeFlowWithRedirect = function2;
        this.$onFinished = function02;
        this.$scrollToPage = function1;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        AppOnboardingWidgetKt.HandleOnboardingStateEffect(this.$events, this.$closeFlow, this.$closeFlowWithRedirect, this.$onFinished, this.$scrollToPage, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
