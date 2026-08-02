package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.atomelement.composable;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import u0.InterfaceC9904m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/m;", "", "invoke", "(Lu0/m;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class AtomElementComposableKt$DisclaimerComposable$1$1$1$2$1 extends AbstractC7737t implements InterfaceC6511n<InterfaceC9904m, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ List<ButtonV3Atom.SmallBorderlessButton> $buttons;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AtomElementComposableKt$DisclaimerComposable$1$1$1$2$1(List<ButtonV3Atom.SmallBorderlessButton> list, Function1<? super AtomAction, Unit> function1) {
        super(3);
        this.$buttons = list;
        this.$onAction = function1;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC9904m interfaceC9904m, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC9904m, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC9904m FlowRow, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if ((i11 & 17) == 16 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        List<ButtonV3Atom.SmallBorderlessButton> list = this.$buttons;
        Function1<AtomAction, Unit> function1 = this.$onAction;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AtomElementComposableKt.SmallBorderlessButton((ButtonV3Atom.SmallBorderlessButton) it.next(), function1, interfaceC3967k, ButtonV3Atom.SmallBorderlessButton.$stable);
        }
    }
}
