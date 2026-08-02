package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation.PricesHistogramViewModel;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PricesHistogramWidgetViewHolder$observeAction$6 extends AbstractC7737t implements Function1<PricesHistogramViewModel.Action, Unit> {
    final /* synthetic */ PricesHistogramWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PricesHistogramWidgetViewHolder$observeAction$6(PricesHistogramWidgetViewHolder pricesHistogramWidgetViewHolder) {
        super(1);
        this.this$0 = pricesHistogramWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PricesHistogramViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PricesHistogramViewModel.Action action) {
        Function1 function1;
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        if (!Intrinsics.d(action, PricesHistogramViewModel.Action.Error.INSTANCE)) {
            if (action instanceof PricesHistogramViewModel.Action.Success) {
                function1 = this.this$0.actionHandler;
                function1.invoke(((PricesHistogramViewModel.Action.Success) action).getAtomAction());
                return;
            }
            return;
        }
        composerReferences = this.this$0.references;
        ViewGroup rootView = ContextExtKt.getRootView(composerReferences.getContainer().c());
        if (rootView != null) {
            PricesHistogramWidgetViewHolder pricesHistogramWidgetViewHolder = this.this$0;
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            composerReferences2 = pricesHistogramWidgetViewHolder.references;
            FlashbarFactory.createDefaultError$default(flashbarFactory, rootView, null, null, null, null, null, composerReferences2.getContainer().g(), 62, null).show();
        }
    }
}
