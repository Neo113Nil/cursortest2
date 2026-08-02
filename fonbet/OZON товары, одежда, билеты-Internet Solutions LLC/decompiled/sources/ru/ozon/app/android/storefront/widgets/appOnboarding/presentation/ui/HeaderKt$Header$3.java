package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingVI;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class HeaderKt$Header$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function2<AtomActionDTO, Map<String, TokenizedTrackingInfo>, Unit> $onSkipClick;
    final /* synthetic */ AppOnboardingVI.Header $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HeaderKt$Header$3(AppOnboardingVI.Header header, Function2<? super AtomActionDTO, ? super Map<String, TokenizedTrackingInfo>, Unit> function2, int i11, int i12) {
        super(2);
        this.$state = header;
        this.$onSkipClick = function2;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        HeaderKt.Header(this.$state, this.$onSkipClick, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
