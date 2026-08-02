package ru.ozon.debugMenu.internal.core.ui.widgets.radio;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import m0.D0;
import m0.H;
import m0.T0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/D0$b;", "", "Lm0/H;", "Ll1/Z;", "invoke", "(Lm0/D0$b;LS0/k;I)Lm0/H;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class DebugMenuRadioKt$DebugMenuRadio$backgroundColor$2 extends AbstractC7737t implements InterfaceC6511n<D0.b<Boolean>, InterfaceC3967k, Integer, H<C7807Z>> {
    final /* synthetic */ T0<C7807Z> $animateBackground;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugMenuRadioKt$DebugMenuRadio$backgroundColor$2(T0<C7807Z> t02) {
        super(3);
        this.$animateBackground = t02;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ H<C7807Z> invoke(D0.b<Boolean> bVar, InterfaceC3967k interfaceC3967k, Integer num) {
        return invoke(bVar, interfaceC3967k, num.intValue());
    }

    public final H<C7807Z> invoke(D0.b<Boolean> animateColor, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
        interfaceC3967k.o(-867266764);
        T0<C7807Z> t02 = this.$animateBackground;
        interfaceC3967k.k();
        return t02;
    }
}
