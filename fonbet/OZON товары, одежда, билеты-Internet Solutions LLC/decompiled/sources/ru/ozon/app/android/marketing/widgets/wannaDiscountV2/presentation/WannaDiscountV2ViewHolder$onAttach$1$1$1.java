package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.model.WannaDiscountV2Result;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class WannaDiscountV2ViewHolder$onAttach$1$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ WannaDiscountV2Result $event;
    final /* synthetic */ WannaDiscountV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WannaDiscountV2ViewHolder$onAttach$1$1$1(WannaDiscountV2ViewHolder wannaDiscountV2ViewHolder, WannaDiscountV2Result wannaDiscountV2Result) {
        super(0);
        this.this$0 = wannaDiscountV2ViewHolder;
        this.$event = wannaDiscountV2Result;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function1 function1;
        function1 = this.this$0.actionHandler;
        function1.invoke(((WannaDiscountV2Result.SendDiscountSuccess) this.$event).getNotificationButton().getAction());
    }
}
