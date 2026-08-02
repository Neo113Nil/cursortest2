package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingVI;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FooterKt$Footer$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<AtomAction, Unit> $onButtonClick;
    final /* synthetic */ int $pageIndex;
    final /* synthetic */ AppOnboardingVI.Footer $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FooterKt$Footer$2(AppOnboardingVI.Footer footer, int i11, Function1<? super AtomAction, Unit> function1, int i12) {
        super(2);
        this.$state = footer;
        this.$pageIndex = i11;
        this.$onButtonClick = function1;
        this.$$changed = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        FooterKt.Footer(this.$state, this.$pageIndex, this.$onButtonClick, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
