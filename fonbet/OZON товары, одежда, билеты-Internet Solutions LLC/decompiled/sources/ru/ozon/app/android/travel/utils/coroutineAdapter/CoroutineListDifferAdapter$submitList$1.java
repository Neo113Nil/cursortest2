package ru.ozon.app.android.travel.utils.coroutineAdapter;

import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.utils.coroutineAdapter.CoroutineListDifferAdapter$submitList$1", f = "CoroutineListDifferAdapter.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CoroutineListDifferAdapter$submitList$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ List<T> $newList;
    final /* synthetic */ Function0<Unit> $postAction;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CoroutineListDifferAdapter<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CoroutineListDifferAdapter$submitList$1(CoroutineListDifferAdapter<T> coroutineListDifferAdapter, List<? extends T> list, Function0<Unit> function0, d<? super CoroutineListDifferAdapter$submitList$1> dVar) {
        super(2, dVar);
        this.this$0 = coroutineListDifferAdapter;
        this.$newList = list;
        this.$postAction = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CoroutineListDifferAdapter$submitList$1 coroutineListDifferAdapter$submitList$1 = new CoroutineListDifferAdapter$submitList$1(this.this$0, this.$newList, this.$postAction, dVar);
        coroutineListDifferAdapter$submitList$1.L$0 = obj;
        return coroutineListDifferAdapter$submitList$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List list;
        Object calculateListDiff;
        M m11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                M m12 = (M) this.L$0;
                CoroutineListDifferAdapter<T> coroutineListDifferAdapter = this.this$0;
                list = ((CoroutineListDifferAdapter) coroutineListDifferAdapter).list;
                List<T> list2 = this.$newList;
                this.L$0 = m12;
                this.label = 1;
                calculateListDiff = coroutineListDifferAdapter.calculateListDiff(list, list2, this);
                if (calculateListDiff == aVar) {
                    return aVar;
                }
                m11 = m12;
                obj = calculateListDiff;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m11 = (M) this.L$0;
                s.b(obj);
            }
            i.c cVar = (i.c) obj;
            if (N.f(m11)) {
                this.this$0.updateData(this.$newList);
                this.this$0.updateUi(cVar);
                Function0<Unit> function0 = this.$postAction;
                if (function0 != null) {
                    function0.invoke();
                }
            }
            ((CoroutineListDifferAdapter) this.this$0).diffUtilJob = null;
            return Unit.f71690a;
        } catch (Throwable th2) {
            ((CoroutineListDifferAdapter) this.this$0).diffUtilJob = null;
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CoroutineListDifferAdapter$submitList$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
