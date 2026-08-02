package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train;

import Vg.d;
import a00.h;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.di.TravelRailwaySearchResultsV3Component;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.multiFrameBinding.TravelRailwaySearchResultsV3MultiFrameBindDelegate;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.multiFrameBinding.TravelRailwaySearchResultsV3ViewStateBinder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.view.RailwaySearchResultsV3TrainView;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainProWidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelRailwaySearchResultsV3TrainProViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TravelRailwaySearchResultsV3TrainProWidgetViewHolder> {
    final /* synthetic */ TravelRailwaySearchResultsV3TrainProViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelRailwaySearchResultsV3TrainProViewMapper$holderProducer$1(TravelRailwaySearchResultsV3TrainProViewMapper travelRailwaySearchResultsV3TrainProViewMapper) {
        super(2);
        this.this$0 = travelRailwaySearchResultsV3TrainProViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TravelRailwaySearchResultsV3TrainProWidgetViewHolder invoke(View view, ComposerReferences refs) {
        TravelRailwaySearchResultsV3Component travelRailwaySearchResultsV3Component;
        TravelRailwaySearchResultsV3Component travelRailwaySearchResultsV3Component2;
        TravelRailwaySearchResultsV3Component travelRailwaySearchResultsV3Component3;
        TravelRailwaySearchResultsV3Component travelRailwaySearchResultsV3Component4;
        View view2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        RailwaySearchResultsV3TrainView railwaySearchResultsV3TrainView = (RailwaySearchResultsV3TrainView) view;
        travelRailwaySearchResultsV3Component = this.this$0.component;
        TravelRailwaySearchResultsV3ViewStateBinder travelRailwaySearchResultsV3ViewStateBinder = travelRailwaySearchResultsV3Component.getTravelRailwaySearchResultsV3ViewStateBinder();
        travelRailwaySearchResultsV3Component2 = this.this$0.component;
        FrameBinder frameBinder = travelRailwaySearchResultsV3Component2.getFrameBinder();
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        TravelRailwaySearchResultsV3MultiFrameBindDelegate travelRailwaySearchResultsV3MultiFrameBindDelegate = new TravelRailwaySearchResultsV3MultiFrameBindDelegate(travelRailwaySearchResultsV3ViewStateBinder, frameBinder, (c11 == null || (view2 = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerView(view2), railwaySearchResultsV3TrainView);
        travelRailwaySearchResultsV3Component3 = this.this$0.component;
        d customActionHandlersStoreFactory = travelRailwaySearchResultsV3Component3.getCustomActionHandlersStoreFactory();
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final TravelRailwaySearchResultsV3TrainProViewMapper travelRailwaySearchResultsV3TrainProViewMapper = this.this$0;
        BaseOnBoardingViewModel baseOnBoardingViewModel = (BaseOnBoardingViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.TravelRailwaySearchResultsV3TrainProViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                TravelRailwaySearchResultsV3Component travelRailwaySearchResultsV3Component5;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                travelRailwaySearchResultsV3Component5 = TravelRailwaySearchResultsV3TrainProViewMapper.this.component;
                BaseOnBoardingViewModel onBoardingViewModel = travelRailwaySearchResultsV3Component5.getOnBoardingViewModel();
                Intrinsics.g(onBoardingViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return onBoardingViewModel;
            }
        }).a(BaseOnBoardingViewModel.class);
        travelRailwaySearchResultsV3Component4 = this.this$0.component;
        return new TravelRailwaySearchResultsV3TrainProWidgetViewHolder(railwaySearchResultsV3TrainView, refs, travelRailwaySearchResultsV3MultiFrameBindDelegate, customActionHandlersStoreFactory, baseOnBoardingViewModel, travelRailwaySearchResultsV3Component4.getTokenizedAnalytics());
    }
}
