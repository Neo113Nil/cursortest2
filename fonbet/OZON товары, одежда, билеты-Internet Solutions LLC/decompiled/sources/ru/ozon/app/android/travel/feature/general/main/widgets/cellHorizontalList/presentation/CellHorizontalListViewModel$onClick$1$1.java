package ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation.CellHorizontalListEvent;
import ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation.CellHorizontalListVI;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation.CellHorizontalListViewModel$onClick$1$1", f = "CellHorizontalListViewModel.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CellHorizontalListViewModel$onClick$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ List<CellHorizontalListVI.CellVO> $cells;
    final /* synthetic */ int $position;
    int label;
    final /* synthetic */ CellHorizontalListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CellHorizontalListViewModel$onClick$1$1(CellHorizontalListViewModel cellHorizontalListViewModel, List<CellHorizontalListVI.CellVO> list, int i11, d<? super CellHorizontalListViewModel$onClick$1$1> dVar) {
        super(2, dVar);
        this.this$0 = cellHorizontalListViewModel;
        this.$cells = list;
        this.$position = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CellHorizontalListViewModel$onClick$1$1(this.this$0, this.$cells, this.$position, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        List updatedCells;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            w0Var = this.this$0.eventFlow;
            updatedCells = this.this$0.getUpdatedCells(this.$cells, this.$position);
            CellHorizontalListEvent.OnClickEvent onClickEvent = new CellHorizontalListEvent.OnClickEvent(updatedCells);
            this.label = 1;
            if (w0Var.emit(onClickEvent, this) == aVar) {
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
        return ((CellHorizontalListViewModel$onClick$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
