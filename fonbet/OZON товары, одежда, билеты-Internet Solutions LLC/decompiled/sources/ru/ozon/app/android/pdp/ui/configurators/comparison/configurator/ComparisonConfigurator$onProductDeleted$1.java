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
import ru.ozon.app.android.comparison.RemoveFromComparisonResponse;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.pdp.ui.configurators.addToComparision.AddToComparisonUpdateKey;
import ru.ozon.app.android.pdp.ui.configurators.comparison.viewModel.ComparisonRefreshViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lru/ozon/app/android/comparison/RemoveFromComparisonResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.pdp.ui.configurators.comparison.configurator.ComparisonConfigurator$onProductDeleted$1", f = "ComparisonConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ComparisonConfigurator$onProductDeleted$1 extends j implements Function2<RemoveFromComparisonResponse, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ComparisonConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComparisonConfigurator$onProductDeleted$1(ComparisonConfigurator comparisonConfigurator, d<? super ComparisonConfigurator$onProductDeleted$1> dVar) {
        super(2, dVar);
        this.this$0 = comparisonConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ComparisonConfigurator$onProductDeleted$1 comparisonConfigurator$onProductDeleted$1 = new ComparisonConfigurator$onProductDeleted$1(this.this$0, dVar);
        comparisonConfigurator$onProductDeleted$1.L$0 = obj;
        return comparisonConfigurator$onProductDeleted$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComparisonRefreshViewModel comparisonRefreshViewModel;
        ComparisonRefreshViewModel comparisonRefreshViewModel2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        RemoveFromComparisonResponse removeFromComparisonResponse = (RemoveFromComparisonResponse) this.L$0;
        ConfiguratorReferences references = this.this$0.getReferences();
        if (references != null) {
            ComparisonConfigurator comparisonConfigurator = this.this$0;
            comparisonRefreshViewModel = comparisonConfigurator.refreshViewModel;
            if (comparisonRefreshViewModel == null) {
                Intrinsics.n("refreshViewModel");
                throw null;
            }
            comparisonRefreshViewModel.setRefreshState(new Long(removeFromComparisonResponse.getSku()), false);
            if (removeFromComparisonResponse.getDeeplink() == null) {
                references.getController().update(new AddToComparisonUpdateKey(removeFromComparisonResponse.getSku(), false, false, 4, null));
                comparisonRefreshViewModel2 = comparisonConfigurator.refreshViewModel;
                if (comparisonRefreshViewModel2 == null) {
                    Intrinsics.n("refreshViewModel");
                    throw null;
                }
                comparisonRefreshViewModel2.setRefreshState(new Long(removeFromComparisonResponse.getSku()), true);
                references.getNavigator().popBackStack();
            } else {
                InterfaceC7851b.a.a(references.getController(), removeFromComparisonResponse.getDeeplink(), null, null, null, 14);
            }
            comparisonConfigurator.markPreviousPageToBeRefreshed();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RemoveFromComparisonResponse removeFromComparisonResponse, d<? super Unit> dVar) {
        return ((ComparisonConfigurator$onProductDeleted$1) create(removeFromComparisonResponse, dVar)).invokeSuspend(Unit.f71690a);
    }
}
