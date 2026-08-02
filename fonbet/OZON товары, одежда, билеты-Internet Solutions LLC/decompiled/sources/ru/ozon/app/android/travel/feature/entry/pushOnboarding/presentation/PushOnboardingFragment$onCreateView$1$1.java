package ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation;

import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.data.PushOnboardingPageData;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class PushOnboardingFragment$onCreateView$1$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ PushOnboardingPageData $data;
    final /* synthetic */ PushOnboardingFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushOnboardingFragment$onCreateView$1$1(PushOnboardingPageData pushOnboardingPageData, PushOnboardingFragment pushOnboardingFragment) {
        super(2);
        this.$data = pushOnboardingPageData;
        this.this$0 = pushOnboardingFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        PushOnboardingPageData pushOnboardingPageData = this.$data;
        interfaceC3967k.o(1725076290);
        boolean F11 = interfaceC3967k.F(this.this$0) | interfaceC3967k.F(this.$data);
        PushOnboardingFragment pushOnboardingFragment = this.this$0;
        PushOnboardingPageData pushOnboardingPageData2 = this.$data;
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new PushOnboardingFragment$onCreateView$1$1$1$1(pushOnboardingFragment, pushOnboardingPageData2);
            interfaceC3967k.x(C11);
        }
        Function1 function1 = (Function1) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(1725081378);
        boolean F12 = interfaceC3967k.F(this.this$0) | interfaceC3967k.F(this.$data);
        PushOnboardingFragment pushOnboardingFragment2 = this.this$0;
        PushOnboardingPageData pushOnboardingPageData3 = this.$data;
        Object C12 = interfaceC3967k.C();
        if (F12 || C12 == InterfaceC3967k.a.a()) {
            C12 = new PushOnboardingFragment$onCreateView$1$1$2$1(pushOnboardingFragment2, pushOnboardingPageData3);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        PushOnboardingFragmentKt.ShowOnboarding(pushOnboardingPageData, function1, (Function1) C12, interfaceC3967k, 0, 0);
    }
}
