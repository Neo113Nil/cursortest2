package ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation.CellHorizontalListEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation.CellHorizontalListViewModel$onView$1", f = "CellHorizontalListViewModel.kt", l = {TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CellHorizontalListViewModel$onView$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $atomAction;
    int label;
    final /* synthetic */ CellHorizontalListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CellHorizontalListViewModel$onView$1(CellHorizontalListViewModel cellHorizontalListViewModel, AtomAction atomAction, d<? super CellHorizontalListViewModel$onView$1> dVar) {
        super(2, dVar);
        this.this$0 = cellHorizontalListViewModel;
        this.$atomAction = atomAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CellHorizontalListViewModel$onView$1(this.this$0, this.$atomAction, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            w0Var = this.this$0.eventFlow;
            CellHorizontalListEvent.OnViewEvent onViewEvent = new CellHorizontalListEvent.OnViewEvent(this.$atomAction);
            this.label = 1;
            if (w0Var.emit(onViewEvent, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CellHorizontalListViewModel$onView$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
