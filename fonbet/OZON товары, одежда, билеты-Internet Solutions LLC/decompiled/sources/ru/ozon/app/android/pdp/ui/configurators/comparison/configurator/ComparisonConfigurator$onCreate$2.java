package ru.ozon.app.android.pdp.ui.configurators.comparison.configurator;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.pdp.ui.configurators.comparison.Refresh;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/pdp/ui/configurators/comparison/Refresh;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.pdp.ui.configurators.comparison.configurator.ComparisonConfigurator$onCreate$2", f = "ComparisonConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ComparisonConfigurator$onCreate$2 extends j implements Function2<Refresh, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ ComparisonConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComparisonConfigurator$onCreate$2(ComparisonConfigurator comparisonConfigurator, d<? super ComparisonConfigurator$onCreate$2> dVar) {
        super(2, dVar);
        this.this$0 = comparisonConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ComparisonConfigurator$onCreate$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean shouldRefresh;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ComparisonConfigurator comparisonConfigurator = this.this$0;
        shouldRefresh = comparisonConfigurator.shouldRefresh();
        comparisonConfigurator.shouldRefresh = shouldRefresh;
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Refresh refresh, d<? super Unit> dVar) {
        return ((ComparisonConfigurator$onCreate$2) create(refresh, dVar)).invokeSuspend(Unit.f71690a);
    }
}
