package ru.ozon.app.android.pdp.ui.configurators.pdp;

import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.pdp.ui.configurators.addToComparision.AddToComparisonUpdateKey;
import ru.ozon.app.android.pdp.ui.configurators.comparison.Refresh;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/pdp/ui/configurators/comparison/Refresh;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.pdp.ui.configurators.pdp.PdpConfigurator$onCreate$2", f = "PdpConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class PdpConfigurator$onCreate$2 extends j implements Function2<Refresh, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PdpConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PdpConfigurator$onCreate$2(PdpConfigurator pdpConfigurator, d<? super PdpConfigurator$onCreate$2> dVar) {
        super(2, dVar);
        this.this$0 = pdpConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        PdpConfigurator$onCreate$2 pdpConfigurator$onCreate$2 = new PdpConfigurator$onCreate$2(this.this$0, dVar);
        pdpConfigurator$onCreate$2.L$0 = obj;
        return pdpConfigurator$onCreate$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean shouldRefresh;
        InterfaceC7851b controller;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Refresh refresh = (Refresh) this.L$0;
        PdpConfigurator pdpConfigurator = this.this$0;
        shouldRefresh = pdpConfigurator.shouldRefresh();
        pdpConfigurator.isRefreshOnResume = shouldRefresh;
        if (!(refresh instanceof Refresh.ComparisonDiff)) {
            throw new o();
        }
        Refresh.ComparisonDiff comparisonDiff = (Refresh.ComparisonDiff) refresh;
        Long sku = comparisonDiff.getSku();
        if (sku != null) {
            PdpConfigurator pdpConfigurator2 = this.this$0;
            long longValue = sku.longValue();
            ConfiguratorReferences references = pdpConfigurator2.getReferences();
            if (references != null && (controller = references.getController()) != null) {
                if (comparisonDiff.getIsInComparison()) {
                    controller.update(new AddToComparisonUpdateKey(longValue, true, false, 4, null));
                } else {
                    InterfaceC7851b.a.e(controller, null, null, null, 7);
                }
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Refresh refresh, d<? super Unit> dVar) {
        return ((PdpConfigurator$onCreate$2) create(refresh, dVar)).invokeSuspend(Unit.f71690a);
    }
}
