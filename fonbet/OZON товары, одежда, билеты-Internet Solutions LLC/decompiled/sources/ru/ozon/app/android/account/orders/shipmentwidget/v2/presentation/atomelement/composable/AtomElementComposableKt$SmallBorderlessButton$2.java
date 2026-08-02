package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.atomelement.composable;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AtomElementComposableKt$SmallBorderlessButton$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ButtonV3Atom.SmallBorderlessButton $button;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AtomElementComposableKt$SmallBorderlessButton$2(ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, Function1<? super AtomAction, Unit> function1, int i11) {
        super(2);
        this.$button = smallBorderlessButton;
        this.$onAction = function1;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        AtomElementComposableKt.SmallBorderlessButton(this.$button, this.$onAction, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
