package ru.ozon.app.android.cml.delivery.widgets.input.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class InputWidgetViewHolder$bindInput$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ InputWidgetVO $item;
    final /* synthetic */ InputWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InputWidgetViewHolder$bindInput$1$1(InputWidgetVO inputWidgetVO, InputWidgetViewHolder inputWidgetViewHolder) {
        super(0);
        this.$item = inputWidgetVO;
        this.this$0 = inputWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function1 function1;
        AtomAction tooltipAction = this.$item.getTooltipAction();
        if (tooltipAction != null) {
            function1 = this.this$0.actionHandler;
            function1.invoke(tooltipAction);
        }
    }
}
