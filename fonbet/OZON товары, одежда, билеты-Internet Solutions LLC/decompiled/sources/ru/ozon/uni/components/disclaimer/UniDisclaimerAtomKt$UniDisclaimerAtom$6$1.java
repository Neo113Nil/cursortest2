package ru.ozon.uni.components.disclaimer;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.components.disclaimer.addons.UniDisclaimerAdditionalButtonScope;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/ozon/uni/components/disclaimer/addons/UniDisclaimerAdditionalButtonScope;", "", "invoke", "(Lru/ozon/uni/components/disclaimer/addons/UniDisclaimerAdditionalButtonScope;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class UniDisclaimerAtomKt$UniDisclaimerAtom$6$1 extends AbstractC7737t implements InterfaceC6511n<UniDisclaimerAdditionalButtonScope, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ DisclaimerDTO.AdditionalButton $additionalButtonDTO;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UniDisclaimerAtomKt$UniDisclaimerAtom$6$1(DisclaimerDTO.AdditionalButton additionalButton, Function1<? super AtomAction, Unit> function1) {
        super(3);
        this.$additionalButtonDTO = additionalButton;
        this.$onAction = function1;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(UniDisclaimerAdditionalButtonScope uniDisclaimerAdditionalButtonScope, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(uniDisclaimerAdditionalButtonScope, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(UniDisclaimerAdditionalButtonScope let, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(let, "$this$let");
        if ((i11 & 6) == 0) {
            i11 |= interfaceC3967k.n(let) ? 4 : 2;
        }
        if ((i11 & 19) == 18 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        String title = this.$additionalButtonDTO.getTitle();
        interfaceC3967k.o(-115191724);
        boolean n11 = interfaceC3967k.n(this.$additionalButtonDTO) | interfaceC3967k.n(this.$onAction);
        DisclaimerDTO.AdditionalButton additionalButton = this.$additionalButtonDTO;
        Function1<AtomAction, Unit> function1 = this.$onAction;
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new UniDisclaimerAtomKt$UniDisclaimerAtom$6$1$1$1(additionalButton, function1);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        let.UniDisclaimerAdditionalButton(title, (Function0) C11, null, interfaceC3967k, (i11 << 9) & 7168, 4);
    }
}
