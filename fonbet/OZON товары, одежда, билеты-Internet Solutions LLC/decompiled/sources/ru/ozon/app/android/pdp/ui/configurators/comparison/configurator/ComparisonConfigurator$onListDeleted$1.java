package ru.ozon.app.android.pdp.ui.configurators.comparison.configurator;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.pdp.ui.configurators.comparison.viewModel.ComparisonRefreshViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.pdp.ui.configurators.comparison.configurator.ComparisonConfigurator$onListDeleted$1", f = "ComparisonConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ComparisonConfigurator$onListDeleted$1 extends j implements Function2<Unit, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ ComparisonConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComparisonConfigurator$onListDeleted$1(ComparisonConfigurator comparisonConfigurator, d<? super ComparisonConfigurator$onListDeleted$1> dVar) {
        super(2, dVar);
        this.this$0 = comparisonConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ComparisonConfigurator$onListDeleted$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComparisonRefreshViewModel comparisonRefreshViewModel;
        InterfaceC7851b controller;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        comparisonRefreshViewModel = this.this$0.refreshViewModel;
        if (comparisonRefreshViewModel == null) {
            Intrinsics.n("refreshViewModel");
            throw null;
        }
        comparisonRefreshViewModel.setRefreshState(null, true);
        ConfiguratorReferences references = this.this$0.getReferences();
        if (references != null && (controller = references.getController()) != null) {
            InterfaceC7851b.a.e(controller, null, null, null, 7);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, d<? super Unit> dVar) {
        return ((ComparisonConfigurator$onListDeleted$1) create(unit, dVar)).invokeSuspend(Unit.f71690a);
    }
}
