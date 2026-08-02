package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation;

import Sc.o;
import Sc.s;
import Wc.a;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.PricesHistogramV2ViewModel;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2ViewModel$Action;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.PricesHistogramV2WidgetViewHolder$observeAction$3", f = "PricesHistogramV2WidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PricesHistogramV2WidgetViewHolder$observeAction$3 extends j implements Function2<PricesHistogramV2ViewModel.Action, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PricesHistogramV2WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PricesHistogramV2WidgetViewHolder$observeAction$3(PricesHistogramV2WidgetViewHolder pricesHistogramV2WidgetViewHolder, d<? super PricesHistogramV2WidgetViewHolder$observeAction$3> dVar) {
        super(2, dVar);
        this.this$0 = pricesHistogramV2WidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        PricesHistogramV2WidgetViewHolder$observeAction$3 pricesHistogramV2WidgetViewHolder$observeAction$3 = new PricesHistogramV2WidgetViewHolder$observeAction$3(this.this$0, dVar);
        pricesHistogramV2WidgetViewHolder$observeAction$3.L$0 = obj;
        return pricesHistogramV2WidgetViewHolder$observeAction$3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        PricesHistogramV2ViewModel.Action action = (PricesHistogramV2ViewModel.Action) this.L$0;
        if (action instanceof PricesHistogramV2ViewModel.Action.Error) {
            composerReferences = this.this$0.references;
            ViewGroup rootView = ContextExtKt.getRootView(composerReferences.getContainer().c());
            if (rootView != null) {
                PricesHistogramV2WidgetViewHolder pricesHistogramV2WidgetViewHolder = this.this$0;
                FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
                composerReferences2 = pricesHistogramV2WidgetViewHolder.references;
                FlashbarFactory.createDefaultError$default(flashbarFactory, rootView, null, null, null, null, null, composerReferences2.getContainer().g(), 62, null).show();
            }
        } else {
            if (!(action instanceof PricesHistogramV2ViewModel.Action.Success)) {
                throw new o();
            }
            function1 = this.this$0.actionHandler;
            function1.invoke(((PricesHistogramV2ViewModel.Action.Success) action).getAtomAction());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PricesHistogramV2ViewModel.Action action, d<? super Unit> dVar) {
        return ((PricesHistogramV2WidgetViewHolder$observeAction$3) create(action, dVar)).invokeSuspend(Unit.f71690a);
    }
}
