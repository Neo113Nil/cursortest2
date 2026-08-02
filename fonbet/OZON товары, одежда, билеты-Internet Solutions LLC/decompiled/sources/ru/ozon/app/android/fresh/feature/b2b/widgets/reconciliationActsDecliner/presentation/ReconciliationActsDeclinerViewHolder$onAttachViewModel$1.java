package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation;

import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.ReconciliationActsDeclinerVO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$TextField;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.ReconciliationActsDeclinerViewHolder$onAttachViewModel$1", f = "ReconciliationActsDeclinerViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ReconciliationActsDeclinerViewHolder$onAttachViewModel$1 extends j implements Function2<List<? extends ReconciliationActsDeclinerVO.TextField>, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ReconciliationActsDeclinerViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReconciliationActsDeclinerViewHolder$onAttachViewModel$1(ReconciliationActsDeclinerViewHolder reconciliationActsDeclinerViewHolder, d<? super ReconciliationActsDeclinerViewHolder$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = reconciliationActsDeclinerViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ReconciliationActsDeclinerViewHolder$onAttachViewModel$1 reconciliationActsDeclinerViewHolder$onAttachViewModel$1 = new ReconciliationActsDeclinerViewHolder$onAttachViewModel$1(this.this$0, dVar);
        reconciliationActsDeclinerViewHolder$onAttachViewModel$1.L$0 = obj;
        return reconciliationActsDeclinerViewHolder$onAttachViewModel$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends ReconciliationActsDeclinerVO.TextField> list, d<? super Unit> dVar) {
        return invoke2((List<ReconciliationActsDeclinerVO.TextField>) list, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TextFieldsAdapter textFieldsAdapter;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        List list = (List) this.L$0;
        textFieldsAdapter = this.this$0.textFieldsAdapter;
        textFieldsAdapter.submitList(list);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<ReconciliationActsDeclinerVO.TextField> list, d<? super Unit> dVar) {
        return ((ReconciliationActsDeclinerViewHolder$onAttachViewModel$1) create(list, dVar)).invokeSuspend(Unit.f71690a);
    }
}
