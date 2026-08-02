package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train;

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
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.di.TravelRailwaySearchResultsV4Component;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.multiFrameBinding.TravelRailwaySearchResultsV4MultiFrameBindDelegate;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.multiFrameBinding.TravelRailwaySearchResultsV4ViewStateBinder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.view.TravelRailwaySearchResultsV4TrainView;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainWidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelRailwaySearchResultsV4TrainViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TravelRailwaySearchResultsV4TrainWidgetViewHolder> {
    final /* synthetic */ TravelRailwaySearchResultsV4TrainViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelRailwaySearchResultsV4TrainViewMapper$holderProducer$1(TravelRailwaySearchResultsV4TrainViewMapper travelRailwaySearchResultsV4TrainViewMapper) {
        super(2);
        this.this$0 = travelRailwaySearchResultsV4TrainViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TravelRailwaySearchResultsV4TrainWidgetViewHolder invoke(View view, ComposerReferences refs) {
        TravelRailwaySearchResultsV4Component travelRailwaySearchResultsV4Component;
        TravelRailwaySearchResultsV4Component travelRailwaySearchResultsV4Component2;
        TravelRailwaySearchResultsV4Component travelRailwaySearchResultsV4Component3;
        TravelRailwaySearchResultsV4Component travelRailwaySearchResultsV4Component4;
        View view2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        TravelRailwaySearchResultsV4TrainView travelRailwaySearchResultsV4TrainView = (TravelRailwaySearchResultsV4TrainView) view;
        travelRailwaySearchResultsV4Component = this.this$0.component;
        TravelRailwaySearchResultsV4ViewStateBinder travelRailwaySearchResultsV4ViewStateBinder = travelRailwaySearchResultsV4Component.getTravelRailwaySearchResultsV4ViewStateBinder();
        travelRailwaySearchResultsV4Component2 = this.this$0.component;
        FrameBinder frameBinder = travelRailwaySearchResultsV4Component2.getFrameBinder();
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        TravelRailwaySearchResultsV4MultiFrameBindDelegate travelRailwaySearchResultsV4MultiFrameBindDelegate = new TravelRailwaySearchResultsV4MultiFrameBindDelegate(travelRailwaySearchResultsV4ViewStateBinder, frameBinder, (c11 == null || (view2 = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerView(view2), travelRailwaySearchResultsV4TrainView);
        travelRailwaySearchResultsV4Component3 = this.this$0.component;
        d customActionHandlersStoreFactory = travelRailwaySearchResultsV4Component3.getCustomActionHandlersStoreFactory();
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final TravelRailwaySearchResultsV4TrainViewMapper travelRailwaySearchResultsV4TrainViewMapper = this.this$0;
        BaseOnBoardingViewModel baseOnBoardingViewModel = (BaseOnBoardingViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.TravelRailwaySearchResultsV4TrainViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                TravelRailwaySearchResultsV4Component travelRailwaySearchResultsV4Component5;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                travelRailwaySearchResultsV4Component5 = TravelRailwaySearchResultsV4TrainViewMapper.this.component;
                BaseOnBoardingViewModel onBoardingViewModel = travelRailwaySearchResultsV4Component5.getOnBoardingViewModel();
                Intrinsics.g(onBoardingViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return onBoardingViewModel;
            }
        }).a(BaseOnBoardingViewModel.class);
        travelRailwaySearchResultsV4Component4 = this.this$0.component;
        return new TravelRailwaySearchResultsV4TrainWidgetViewHolder(travelRailwaySearchResultsV4TrainView, refs, travelRailwaySearchResultsV4MultiFrameBindDelegate, customActionHandlersStoreFactory, baseOnBoardingViewModel, travelRailwaySearchResultsV4Component4.getTokenizedAnalytics());
    }
}
