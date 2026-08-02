package ru.ozon.uni.ozi.components.navBar.addons;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import t0.q;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarTopStartScope;", "", "invoke", "(Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarTopStartScope;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class OziNavBarTopKt$OziNavBarTop$5 extends AbstractC7737t implements InterfaceC6511n<OziNavBarTopStartScope, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ boolean $backButtonEnabled;
    final /* synthetic */ q $backButtonInteractionSource;
    final /* synthetic */ Function0<Unit> $onBackButtonClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziNavBarTopKt$OziNavBarTop$5(Function0<Unit> function0, boolean z11, q qVar) {
        super(3);
        this.$onBackButtonClick = function0;
        this.$backButtonEnabled = z11;
        this.$backButtonInteractionSource = qVar;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(OziNavBarTopStartScope oziNavBarTopStartScope, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(oziNavBarTopStartScope, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(OziNavBarTopStartScope OziNavBarTop, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(OziNavBarTop, "$this$OziNavBarTop");
        if ((i11 & 17) == 16 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        if (this.$onBackButtonClick != null) {
            interfaceC3967k.o(-1818394938);
            OziNavBarTopStartScope.INSTANCE.getINSTANCE$uni_release().BackIconButton(this.$onBackButtonClick, null, this.$backButtonEnabled, this.$backButtonInteractionSource, interfaceC3967k, 24576, 2);
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(-1818133050);
            OziNavBarTopStartScope.INSTANCE.getINSTANCE$uni_release().Filler$uni_release(interfaceC3967k, 6);
            interfaceC3967k.k();
        }
    }
}
