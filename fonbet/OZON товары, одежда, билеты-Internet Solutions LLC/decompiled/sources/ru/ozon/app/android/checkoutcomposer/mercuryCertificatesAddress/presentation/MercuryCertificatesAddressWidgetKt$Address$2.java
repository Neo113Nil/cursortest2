package ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class MercuryCertificatesAddressWidgetKt$Address$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ CommonAtomIconDTO $icon;
    final /* synthetic */ TextDTO $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MercuryCertificatesAddressWidgetKt$Address$2(TextDTO textDTO, AtomAction atomAction, CommonAtomIconDTO commonAtomIconDTO, Function1<? super AtomAction, Unit> function1, int i11) {
        super(2);
        this.$title = textDTO;
        this.$action = atomAction;
        this.$icon = commonAtomIconDTO;
        this.$actionHandler = function1;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        MercuryCertificatesAddressWidgetKt.Address(this.$title, this.$action, this.$icon, this.$actionHandler, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
