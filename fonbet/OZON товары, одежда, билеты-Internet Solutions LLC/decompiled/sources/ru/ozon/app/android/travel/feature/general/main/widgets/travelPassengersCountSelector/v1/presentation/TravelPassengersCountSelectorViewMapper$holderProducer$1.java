package ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation;

import El.C2971a;
import a00.h;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.actionhandler.travelResultAction.ModalParentRefreshSharedViewModel;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.views.TravelPassengersCountSelectorView;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorWidgetViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TravelPassengersCountSelectorViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TravelPassengersCountSelectorWidgetViewHolder> {
    final /* synthetic */ TravelPassengersCountSelectorViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPassengersCountSelectorViewMapper$holderProducer$1(TravelPassengersCountSelectorViewMapper travelPassengersCountSelectorViewMapper) {
        super(2);
        this.this$0 = travelPassengersCountSelectorViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TravelPassengersCountSelectorWidgetViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        TravelPassengersCountSelectorView travelPassengersCountSelectorView = (TravelPassengersCountSelectorView) view;
        ViewGroup b11 = C2971a.b(ref);
        h viewModelOwnerProvider = ref.getViewModelOwnerProvider();
        final TravelPassengersCountSelectorViewMapper travelPassengersCountSelectorViewMapper = this.this$0;
        TravelPassengersSelectorViewModel travelPassengersSelectorViewModel = (TravelPassengersSelectorViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation.TravelPassengersCountSelectorViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                TravelPassengersSelectorViewModel selectorViewModel = TravelPassengersCountSelectorViewMapper.this.component().getSelectorViewModel();
                Intrinsics.g(selectorViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return selectorViewModel;
            }
        }).a(TravelPassengersSelectorViewModel.class);
        h viewModelOwnerProvider2 = ref.getViewModelOwnerProvider();
        final TravelPassengersCountSelectorViewMapper travelPassengersCountSelectorViewMapper2 = this.this$0;
        return new TravelPassengersCountSelectorWidgetViewHolder(travelPassengersCountSelectorView, b11, ref, travelPassengersSelectorViewModel, (ModalParentRefreshSharedViewModel) new z0(viewModelOwnerProvider2.b(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation.TravelPassengersCountSelectorViewMapper$holderProducer$1$invoke$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ModalParentRefreshSharedViewModel sharedRefreshViewModel = TravelPassengersCountSelectorViewMapper.this.component().getSharedRefreshViewModel();
                Intrinsics.g(sharedRefreshViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return sharedRefreshViewModel;
            }
        }).a(ModalParentRefreshSharedViewModel.class), this.this$0.component().getCustomActionHandlersStoreFactory());
    }
}
