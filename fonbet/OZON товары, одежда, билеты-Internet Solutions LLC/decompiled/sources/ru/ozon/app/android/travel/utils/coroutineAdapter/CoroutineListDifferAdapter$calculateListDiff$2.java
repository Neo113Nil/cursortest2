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
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Landroidx/recyclerview/widget/i$c;", "<anonymous>", "(Lxe/M;)Landroidx/recyclerview/widget/i$c;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.utils.coroutineAdapter.CoroutineListDifferAdapter$calculateListDiff$2", f = "CoroutineListDifferAdapter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CoroutineListDifferAdapter$calculateListDiff$2 extends j implements Function2<M, d<? super i.c>, Object> {
    final /* synthetic */ List<T> $newList;
    final /* synthetic */ List<T> $oldList;
    int label;
    final /* synthetic */ CoroutineListDifferAdapter<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CoroutineListDifferAdapter$calculateListDiff$2(List<? extends T> list, List<? extends T> list2, CoroutineListDifferAdapter<T> coroutineListDifferAdapter, d<? super CoroutineListDifferAdapter$calculateListDiff$2> dVar) {
        super(2, dVar);
        this.$oldList = list;
        this.$newList = list2;
        this.this$0 = coroutineListDifferAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CoroutineListDifferAdapter$calculateListDiff$2(this.$oldList, this.$newList, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        try {
            final List<T> list = this.$oldList;
            final List<T> list2 = this.$newList;
            final CoroutineListDifferAdapter<T> coroutineListDifferAdapter = this.this$0;
            return i.a(new i.b() { // from class: ru.ozon.app.android.travel.utils.coroutineAdapter.CoroutineListDifferAdapter$calculateListDiff$2.1
                @Override // androidx.recyclerview.widget.i.b
                public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
                    i.d dVar;
                    dVar = ((CoroutineListDifferAdapter) coroutineListDifferAdapter).diffItemCallback;
                    return dVar.areContentsTheSame(list.get(oldItemPosition), list2.get(newItemPosition));
                }

                @Override // androidx.recyclerview.widget.i.b
                public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
                    i.d dVar;
                    dVar = ((CoroutineListDifferAdapter) coroutineListDifferAdapter).diffItemCallback;
                    return dVar.areItemsTheSame(list.get(oldItemPosition), list2.get(newItemPosition));
                }

                @Override // androidx.recyclerview.widget.i.b
                public int getNewListSize() {
                    return list2.size();
                }

                @Override // androidx.recyclerview.widget.i.b
                public int getOldListSize() {
                    return list.size();
                }
            }, true);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super i.c> dVar) {
        return ((CoroutineListDifferAdapter$calculateListDiff$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
