package ru.ozon.app.android.pdp.widgets.cartButtonQuant.subscribe;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SubscribeQuantView$bind$1$1$2 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ SubscribeQuantVO $vo;
    final /* synthetic */ SubscribeQuantView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscribeQuantView$bind$1$1$2(SubscribeQuantVO subscribeQuantVO, SubscribeQuantView subscribeQuantView) {
        super(1);
        this.$vo = subscribeQuantVO;
        this.this$0 = subscribeQuantView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        AtomAction atomAction;
        Function1<AtomAction, Unit> actionHandler;
        Intrinsics.checkNotNullParameter(it, "it");
        AtomActionDTO action = this.$vo.getSubscribe().getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, this.$vo.getSubscribe().getTrackingInfo())) == null || (actionHandler = this.this$0.getActionHandler()) == null) {
            return;
        }
        actionHandler.invoke(atomAction);
    }
}
