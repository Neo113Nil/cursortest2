package ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets.billboard;

import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "<unused var>", "", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class RichContentBillboardWidgetViewHolder$bindSubWidget$1$2 extends AbstractC7737t implements Function2<AtomAction, t, Unit> {
    final /* synthetic */ RichContentBillboardWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RichContentBillboardWidgetViewHolder$bindSubWidget$1$2(RichContentBillboardWidgetViewHolder richContentBillboardWidgetViewHolder) {
        super(2);
        this.this$0 = richContentBillboardWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction, t tVar) {
        invoke2(atomAction, tVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action, t tVar) {
        Function1 actionHandler;
        Intrinsics.checkNotNullParameter(action, "action");
        actionHandler = this.this$0.getActionHandler();
        actionHandler.invoke(action);
    }
}
