package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui;

import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingVI;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ContentKt$Page$1$1$titlePlaceable$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ AppOnboardingVI.Content.Page $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentKt$Page$1$1$titlePlaceable$1(AppOnboardingVI.Content.Page page) {
        super(2);
        this.$state = page;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            DsTextAtomKt.DsTextAtom(this.$state.getTitle(), null, interfaceC3967k, 0, 2);
        }
    }
}
