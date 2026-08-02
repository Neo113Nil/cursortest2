package ru.ozon.app.android.travel.feature.avia.widgets.flightRouteDetails.presentation.flight;

import Vg.d;
import WZ.l;
import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.travel.feature.avia.shared.favorites.AddToFavoritesViewModel;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.FlightDetailsView;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/flightRouteDetails/presentation/flight/FlightRouteDetailsWidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class FlightRouteDetailsViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, FlightRouteDetailsWidgetViewHolder> {
    final /* synthetic */ FlightRouteDetailsViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightRouteDetailsViewMapper$holderProducer$1(FlightRouteDetailsViewMapper flightRouteDetailsViewMapper) {
        super(2);
        this.this$0 = flightRouteDetailsViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final FlightRouteDetailsWidgetViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        FlightDetailsView flightDetailsView = (FlightDetailsView) view;
        d customActionHandlersStoreFactory = this.this$0.component().getCustomActionHandlersStoreFactory();
        ProductFavoriteDelegateProvider productFavoriteDelegateProvider = this.this$0.component().getProductFavoriteDelegateProvider();
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final FlightRouteDetailsViewMapper flightRouteDetailsViewMapper = this.this$0;
        return new FlightRouteDetailsWidgetViewHolder(flightDetailsView, customActionHandlersStoreFactory, refs, productFavoriteDelegateProvider, (AddToFavoritesViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.flightRouteDetails.presentation.flight.FlightRouteDetailsViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                AddToFavoritesViewModel viewModel = FlightRouteDetailsViewMapper.this.component().getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(AddToFavoritesViewModel.class), tokenizedAnalytics, this.this$0.component().getFavoriteManager());
    }
}
