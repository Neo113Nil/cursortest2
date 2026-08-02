package ru.ozon.app.android.pdp.ui.configurators.comparison.viewModel;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.pdp.ui.configurators.comparison.RefreshObject;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.ui.configurators.comparison.viewModel.ComparisonRefreshViewModel$setRefreshState$1", f = "ComparisonRefreshViewModel.kt", l = {13}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ComparisonRefreshViewModel$setRefreshState$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ boolean $isInComparison;
    final /* synthetic */ Long $sku;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComparisonRefreshViewModel$setRefreshState$1(Long l11, boolean z11, d<? super ComparisonRefreshViewModel$setRefreshState$1> dVar) {
        super(2, dVar);
        this.$sku = l11;
        this.$isInComparison = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ComparisonRefreshViewModel$setRefreshState$1(this.$sku, this.$isInComparison, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            RefreshObject refreshObject = RefreshObject.INSTANCE;
            Long l11 = this.$sku;
            boolean z11 = this.$isInComparison;
            this.label = 1;
            if (refreshObject.setRefreshComparisonState(l11, z11, this) == aVar) {
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
        return ((ComparisonRefreshViewModel$setRefreshState$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
