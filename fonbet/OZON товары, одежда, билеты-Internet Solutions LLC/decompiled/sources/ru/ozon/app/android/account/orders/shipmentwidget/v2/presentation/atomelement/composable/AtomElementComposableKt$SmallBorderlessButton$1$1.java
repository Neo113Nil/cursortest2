package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.atomelement.composable;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AtomElementComposableKt$SmallBorderlessButton$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ButtonV3Atom.SmallBorderlessButton $button;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AtomElementComposableKt$SmallBorderlessButton$1$1(ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, Function1<? super AtomAction, Unit> function1) {
        super(0);
        this.$button = smallBorderlessButton;
        this.$onAction = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AtomAction atomAction;
        AtomActionDTO action = this.$button.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, this.$button.getTrackingInfo())) == null) {
            return;
        }
        this.$onAction.invoke(atomAction);
    }
}
