package ru.ozon.app.android.ads.widgets.advPageStay.presentation;

import Sc.s;
import Wc.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ads.widgets.advPageStay.presentation.AdvPageStayVO;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ads.widgets.advPageStay.presentation.AdvPageStayViewModel$startTimer$1", f = "AdvPageStayViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AdvPageStayViewModel$startTimer$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ List<AdvPageStayVO.AdvEvent> $filterEvents;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvPageStayViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvPageStayViewModel$startTimer$1(List<AdvPageStayVO.AdvEvent> list, AdvPageStayViewModel advPageStayViewModel, d<? super AdvPageStayViewModel$startTimer$1> dVar) {
        super(2, dVar);
        this.$filterEvents = list;
        this.this$0 = advPageStayViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AdvPageStayViewModel$startTimer$1 advPageStayViewModel$startTimer$1 = new AdvPageStayViewModel$startTimer$1(this.$filterEvents, this.this$0, dVar);
        advPageStayViewModel$startTimer$1.L$0 = obj;
        return advPageStayViewModel$startTimer$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        M m11 = (M) this.L$0;
        List<AdvPageStayVO.AdvEvent> list = this.$filterEvents;
        AdvPageStayViewModel advPageStayViewModel = this.this$0;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C10727i.c(m11, null, null, new AdvPageStayViewModel$startTimer$1$1$1((AdvPageStayVO.AdvEvent) it.next(), advPageStayViewModel, null), 3);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AdvPageStayViewModel$startTimer$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
