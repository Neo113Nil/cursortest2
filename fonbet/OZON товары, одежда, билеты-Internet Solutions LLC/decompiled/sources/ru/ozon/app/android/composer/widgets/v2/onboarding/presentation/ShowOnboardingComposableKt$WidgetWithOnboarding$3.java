package ru.ozon.app.android.composer.widgets.v2.onboarding.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ShowOnboardingComposableKt$WidgetWithOnboarding$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC6512o<String, e, InterfaceC3967k, Integer, Unit> $content;
    final /* synthetic */ OnBoardingCutConfig $cutConfig;
    final /* synthetic */ OnBoardingDTO $onBoardingDto;
    final /* synthetic */ Function0<Unit> $onCropAreaClick;
    final /* synthetic */ BaseOnBoardingViewModel $viewModel;
    final /* synthetic */ String $widgetKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ShowOnboardingComposableKt$WidgetWithOnboarding$3(OnBoardingDTO onBoardingDTO, String str, BaseOnBoardingViewModel baseOnBoardingViewModel, OnBoardingCutConfig onBoardingCutConfig, Function0<Unit> function0, InterfaceC6512o<? super String, ? super e, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6512o, int i11, int i12) {
        super(2);
        this.$onBoardingDto = onBoardingDTO;
        this.$widgetKey = str;
        this.$viewModel = baseOnBoardingViewModel;
        this.$cutConfig = onBoardingCutConfig;
        this.$onCropAreaClick = function0;
        this.$content = interfaceC6512o;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ShowOnboardingComposableKt.WidgetWithOnboarding(this.$onBoardingDto, this.$widgetKey, this.$viewModel, this.$cutConfig, this.$onCropAreaClick, this.$content, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
