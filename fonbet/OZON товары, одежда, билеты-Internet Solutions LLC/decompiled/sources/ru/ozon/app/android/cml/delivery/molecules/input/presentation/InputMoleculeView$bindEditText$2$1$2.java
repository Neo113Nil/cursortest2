package ru.ozon.app.android.cml.delivery.molecules.input.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "input", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class InputMoleculeView$bindEditText$2$1$2 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ InputMoleculeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InputMoleculeView$bindEditText$2$1$2(AtomAction atomAction, InputMoleculeView inputMoleculeView) {
        super(1);
        this.$action = atomAction;
        this.this$0 = inputMoleculeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String input) {
        Function2<String, AtomAction, Unit> onDelayedAction;
        String filterIsDigit;
        Intrinsics.checkNotNullParameter(input, "input");
        if (this.$action == null || (onDelayedAction = this.this$0.getOnDelayedAction()) == null) {
            return;
        }
        filterIsDigit = this.this$0.filterIsDigit(input);
        onDelayedAction.invoke(filterIsDigit, this.$action);
    }
}
