package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import WZ.t;
import android.net.Uri;
import fd.InterfaceC6511n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AppOnboardingWidgetKt$AppOnboardingWidget$7 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ AppOnboardingViewModel $appOnboardingViewModel;
    final /* synthetic */ Function0<Unit> $closeFlow;
    final /* synthetic */ Function2<Uri, Uri, Unit> $closeFlowWithRedirect;
    final /* synthetic */ InterfaceC6511n<AtomActionDTO, Map<String, TokenizedTrackingInfo>, Integer, Unit> $onSkipClick;
    final /* synthetic */ Function1<t, Unit> $processBackEvents;
    final /* synthetic */ Function1<t, Unit> $processCustomViewEvents;
    final /* synthetic */ AppOnboardingVI $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AppOnboardingWidgetKt$AppOnboardingWidget$7(AppOnboardingVI appOnboardingVI, AppOnboardingViewModel appOnboardingViewModel, InterfaceC6511n<? super AtomActionDTO, ? super Map<String, TokenizedTrackingInfo>, ? super Integer, Unit> interfaceC6511n, Function1<? super t, Unit> function1, Function1<? super t, Unit> function12, Function1<? super AtomAction, Unit> function13, Function0<Unit> function0, Function2<? super Uri, ? super Uri, Unit> function2, int i11, int i12) {
        super(2);
        this.$state = appOnboardingVI;
        this.$appOnboardingViewModel = appOnboardingViewModel;
        this.$onSkipClick = interfaceC6511n;
        this.$processCustomViewEvents = function1;
        this.$processBackEvents = function12;
        this.$actionHandler = function13;
        this.$closeFlow = function0;
        this.$closeFlowWithRedirect = function2;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        AppOnboardingWidgetKt.AppOnboardingWidget(this.$state, this.$appOnboardingViewModel, this.$onSkipClick, this.$processCustomViewEvents, this.$processBackEvents, this.$actionHandler, this.$closeFlow, this.$closeFlowWithRedirect, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
