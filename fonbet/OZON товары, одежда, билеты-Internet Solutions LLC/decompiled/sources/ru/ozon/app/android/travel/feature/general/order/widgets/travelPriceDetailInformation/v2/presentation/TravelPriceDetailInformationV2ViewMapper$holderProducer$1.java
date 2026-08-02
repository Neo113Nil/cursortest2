package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation;

import Pc.a;
import Vg.d;
import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.view.TravelPriceDetailInformationV2View;
import ru.ozon.app.android.travel.molecules.utils.travelPriceDetailInformation.WidgetVisibilityObserver;
import ru.ozon.app.android.travel.molecules.viewModel.ButtonWithInformationIsVisibleViewModel;
import ru.ozon.app.android.travel.molecules.viewModel.ButtonWithInformationV2IsVisibleViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2WidgetViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TravelPriceDetailInformationV2ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TravelPriceDetailInformationV2WidgetViewHolder> {
    final /* synthetic */ TravelPriceDetailInformationV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPriceDetailInformationV2ViewMapper$holderProducer$1(TravelPriceDetailInformationV2ViewMapper travelPriceDetailInformationV2ViewMapper) {
        super(2);
        this.this$0 = travelPriceDetailInformationV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TravelPriceDetailInformationV2WidgetViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        TravelPriceDetailInformationV2View travelPriceDetailInformationV2View = (TravelPriceDetailInformationV2View) view;
        WidgetVisibilityObserver widgetVisibilityObserver = this.this$0.component().getWidgetVisibilityObserver();
        HandlersInhibitor handlersInhibitor = this.this$0.component().getHandlersInhibitor();
        d customActionHandlersStoreFactory = this.this$0.component().getCustomActionHandlersStoreFactory();
        h viewModelOwnerProvider = ref.getViewModelOwnerProvider();
        final a<ButtonWithInformationIsVisibleViewModel> viewModelProvider = this.this$0.component().getViewModelProvider();
        w0 a11 = new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.TravelPriceDetailInformationV2ViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ButtonWithInformationIsVisibleViewModel buttonWithInformationIsVisibleViewModel = (ButtonWithInformationIsVisibleViewModel) a.this.get();
                Intrinsics.g(buttonWithInformationIsVisibleViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return buttonWithInformationIsVisibleViewModel;
            }
        }).a(ButtonWithInformationIsVisibleViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        ButtonWithInformationIsVisibleViewModel buttonWithInformationIsVisibleViewModel = (ButtonWithInformationIsVisibleViewModel) a11;
        h viewModelOwnerProvider2 = ref.getViewModelOwnerProvider();
        final a<ButtonWithInformationV2IsVisibleViewModel> viewModelV2Provider = this.this$0.component().getViewModelV2Provider();
        w0 a12 = new z0(viewModelOwnerProvider2.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.TravelPriceDetailInformationV2ViewMapper$holderProducer$1$invoke$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ButtonWithInformationV2IsVisibleViewModel buttonWithInformationV2IsVisibleViewModel = (ButtonWithInformationV2IsVisibleViewModel) a.this.get();
                Intrinsics.g(buttonWithInformationV2IsVisibleViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return buttonWithInformationV2IsVisibleViewModel;
            }
        }).a(ButtonWithInformationV2IsVisibleViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a12, "viewModel(...)");
        return new TravelPriceDetailInformationV2WidgetViewHolder(travelPriceDetailInformationV2View, ref, handlersInhibitor, customActionHandlersStoreFactory, widgetVisibilityObserver, buttonWithInformationIsVisibleViewModel, (ButtonWithInformationV2IsVisibleViewModel) a12, this.this$0.component().getTokenizedAnalytics());
    }
}
