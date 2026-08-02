package ru.ozon.debugMenu.internal.core.ui.widgets.input;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "it", "invoke", "(Lkotlin/jvm/functions/Function2;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class BasicInputKt$InputBody$4 extends AbstractC7737t implements InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit>, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, Unit>, InterfaceC3967k, Integer, Unit> $decorationBox;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BasicInputKt$InputBody$4(InterfaceC6511n<? super Function2<? super InterfaceC3967k, ? super Integer, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n) {
        super(3);
        this.$decorationBox = interfaceC6511n;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit> function2, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke((Function2<? super InterfaceC3967k, ? super Integer, Unit>) function2, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(Function2<? super InterfaceC3967k, ? super Integer, Unit> it, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i11 & 6) == 0) {
            i11 |= interfaceC3967k.F(it) ? 4 : 2;
        }
        if ((i11 & 19) == 18 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            this.$decorationBox.invoke(it, interfaceC3967k, Integer.valueOf(i11 & 14));
        }
    }
}
