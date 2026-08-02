package ru.ozon.app.android.ugc.widgets.selectionsList.presentation;

import A00.a;
import Sc.s;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "event", "", "<anonymous>", "(LA00/a;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.selectionsList.presentation.SelectionsHorizontalListVH$onAttachViewModel$1", f = "SelectionsHorizontalListVH.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SelectionsHorizontalListVH$onAttachViewModel$1 extends j implements Function2<a, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SelectionsHorizontalListVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionsHorizontalListVH$onAttachViewModel$1(SelectionsHorizontalListVH selectionsHorizontalListVH, d<? super SelectionsHorizontalListVH$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = selectionsHorizontalListVH;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SelectionsHorizontalListVH$onAttachViewModel$1 selectionsHorizontalListVH$onAttachViewModel$1 = new SelectionsHorizontalListVH$onAttachViewModel$1(this.this$0, dVar);
        selectionsHorizontalListVH$onAttachViewModel$1.L$0 = obj;
        return selectionsHorizontalListVH$onAttachViewModel$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, d<? super Unit> dVar) {
        return ((SelectionsHorizontalListVH$onAttachViewModel$1) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        RecyclerView recyclerView;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        a aVar2 = (a) this.L$0;
        if (aVar2 instanceof a.u.c) {
            SelectionsListVI boundData = this.this$0.getBoundData();
            if (boundData != null) {
                boundData.setScrollState(null);
            }
        } else if (aVar2 instanceof a.C2370k) {
            SelectionsListVI boundData2 = this.this$0.getBoundData();
            if ((boundData2 != null ? boundData2.getScrollState() : null) == null) {
                recyclerView = this.this$0.recyclerView;
                recyclerView.scrollToPosition(0);
            }
        }
        return Unit.f71690a;
    }
}
