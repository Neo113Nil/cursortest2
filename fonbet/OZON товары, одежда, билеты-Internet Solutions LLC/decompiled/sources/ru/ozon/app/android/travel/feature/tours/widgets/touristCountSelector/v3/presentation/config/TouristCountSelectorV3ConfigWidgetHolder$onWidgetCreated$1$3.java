package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.config;

import Sc.o;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3ViewModel;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TouristCountSelectorV3ConfigWidgetHolder$onWidgetCreated$1$3 extends AbstractC7737t implements Function1<TouristCountSelectorV3ViewModel.Action, Unit> {
    final /* synthetic */ TouristCountSelectorV3ConfigWidgetHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TouristCountSelectorV3ConfigWidgetHolder$onWidgetCreated$1$3(TouristCountSelectorV3ConfigWidgetHolder touristCountSelectorV3ConfigWidgetHolder) {
        super(1);
        this.this$0 = touristCountSelectorV3ConfigWidgetHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TouristCountSelectorV3ViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TouristCountSelectorV3ViewModel.Action action) {
        ComponentCallbacksC5392m componentCallbacksC5392m;
        J j11;
        InterfaceC7851b interfaceC7851b;
        Function1 function1;
        if (action instanceof TouristCountSelectorV3ViewModel.Action.HandleAction) {
            function1 = this.this$0.actionHandler;
            function1.invoke(((TouristCountSelectorV3ViewModel.Action.HandleAction) action).getAtomAction());
            return;
        }
        if (action instanceof TouristCountSelectorV3ViewModel.Action.RefreshAction) {
            interfaceC7851b = this.this$0.composerController;
            TouristCountSelectorV3ViewModel.Action.RefreshAction refreshAction = (TouristCountSelectorV3ViewModel.Action.RefreshAction) action;
            InterfaceC7851b.a.a(interfaceC7851b, refreshAction.getLink(), refreshAction.getParams(), null, null, 12);
        } else {
            if (!(action instanceof TouristCountSelectorV3ViewModel.Action.Error)) {
                throw new o();
            }
            componentCallbacksC5392m = this.this$0.composerFragment;
            ViewGroup rootView = ContextExtKt.getRootView(componentCallbacksC5392m);
            if (rootView != null) {
                TouristCountSelectorV3ConfigWidgetHolder touristCountSelectorV3ConfigWidgetHolder = this.this$0;
                FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
                j11 = touristCountSelectorV3ConfigWidgetHolder.viewOwner;
                FlashbarFactory.createDefaultError$default(flashbarFactory, rootView, null, null, null, null, null, j11, 62, null).show();
            }
        }
    }
}
