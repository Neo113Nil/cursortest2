package ru.ozon.uni.ozi.components.navBar.addons;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class OziNavBarTopKt$OziNavBarTop$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ InterfaceC6511n<OziNavBarTopEndScope, InterfaceC3967k, Integer, Unit> $endContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OziNavBarTopKt$OziNavBarTop$3(InterfaceC6511n<? super OziNavBarTopEndScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n) {
        super(2);
        this.$endContent = interfaceC6511n;
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
        OziNavBarTopEndScope iNSTANCE$uni_release = OziNavBarTopEndScope.INSTANCE.getINSTANCE$uni_release();
        if (this.$endContent != null) {
            interfaceC3967k.o(1326729952);
            this.$endContent.invoke(iNSTANCE$uni_release, interfaceC3967k, 6);
        } else {
            interfaceC3967k.o(1326730812);
            iNSTANCE$uni_release.Filler$uni_release(interfaceC3967k, 6);
        }
        interfaceC3967k.k();
    }
}
