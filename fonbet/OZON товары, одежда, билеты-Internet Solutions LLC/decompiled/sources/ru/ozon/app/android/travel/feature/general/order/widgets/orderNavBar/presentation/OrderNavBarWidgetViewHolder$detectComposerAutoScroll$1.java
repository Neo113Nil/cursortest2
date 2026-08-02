package ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.presentation;

import A00.a;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a$C$c;", "event", "", "<anonymous>", "(LA00/a$C$c;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.presentation.OrderNavBarWidgetViewHolder$detectComposerAutoScroll$1", f = "OrderNavBarWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OrderNavBarWidgetViewHolder$detectComposerAutoScroll$1 extends j implements Function2<a.C.c, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OrderNavBarWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderNavBarWidgetViewHolder$detectComposerAutoScroll$1(OrderNavBarWidgetViewHolder orderNavBarWidgetViewHolder, d<? super OrderNavBarWidgetViewHolder$detectComposerAutoScroll$1> dVar) {
        super(2, dVar);
        this.this$0 = orderNavBarWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        OrderNavBarWidgetViewHolder$detectComposerAutoScroll$1 orderNavBarWidgetViewHolder$detectComposerAutoScroll$1 = new OrderNavBarWidgetViewHolder$detectComposerAutoScroll$1(this.this$0, dVar);
        orderNavBarWidgetViewHolder$detectComposerAutoScroll$1.L$0 = obj;
        return orderNavBarWidgetViewHolder$detectComposerAutoScroll$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a.C.c cVar, d<? super Unit> dVar) {
        return ((OrderNavBarWidgetViewHolder$detectComposerAutoScroll$1) create(cVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        a.C.c cVar = (a.C.c) this.L$0;
        this.this$0.scrollTargetWidget = cVar.e();
        return Unit.f71690a;
    }
}
