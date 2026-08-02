package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone;

import WZ.l;
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
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.di.AviaSearchResultV4Component;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.multiFrameBinding.AviaSearchResultV4MultiFrameBindDelegate;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.multiFrameBinding.AviaSearchResultV4ViewStateBinder;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view.AviaSearchResultV4FlightView;
import ru.ozon.app.android.travel.utils.onboarding.presentation.TravelOnboardingViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/allDone/AviaSearchResultV4AllDoneWidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultV4AllDoneViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, AviaSearchResultV4AllDoneWidgetViewHolder> {
    final /* synthetic */ AviaSearchResultV4AllDoneViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultV4AllDoneViewMapper$holderProducer$1(AviaSearchResultV4AllDoneViewMapper aviaSearchResultV4AllDoneViewMapper) {
        super(2);
        this.this$0 = aviaSearchResultV4AllDoneViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final AviaSearchResultV4AllDoneWidgetViewHolder invoke(View view, ComposerReferences refs) {
        AviaSearchResultV4Component aviaSearchResultV4Component;
        AviaSearchResultV4Component aviaSearchResultV4Component2;
        AviaSearchResultV4Component aviaSearchResultV4Component3;
        AviaSearchResultV4Component aviaSearchResultV4Component4;
        View view2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        aviaSearchResultV4Component = this.this$0.component;
        l tokenizedAnalytics = aviaSearchResultV4Component.getTokenizedAnalytics();
        aviaSearchResultV4Component2 = this.this$0.component;
        AviaSearchResultV4ViewStateBinder aviaSearchResultV4ViewStateBinder = aviaSearchResultV4Component2.getAviaSearchResultV4ViewStateBinder();
        aviaSearchResultV4Component3 = this.this$0.component;
        FrameBinder frameBinder = aviaSearchResultV4Component3.getFrameBinder();
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        AviaSearchResultV4MultiFrameBindDelegate aviaSearchResultV4MultiFrameBindDelegate = new AviaSearchResultV4MultiFrameBindDelegate(aviaSearchResultV4ViewStateBinder, frameBinder, (c11 == null || (view2 = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerView(view2), (AviaSearchResultV4FlightView) view);
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final AviaSearchResultV4AllDoneViewMapper aviaSearchResultV4AllDoneViewMapper = this.this$0;
        BaseOnBoardingViewModel baseOnBoardingViewModel = (BaseOnBoardingViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.AviaSearchResultV4AllDoneViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                AviaSearchResultV4Component aviaSearchResultV4Component5;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aviaSearchResultV4Component5 = AviaSearchResultV4AllDoneViewMapper.this.component;
                TravelOnboardingViewModel onBoardingViewModel = aviaSearchResultV4Component5.getOnBoardingViewModel();
                Intrinsics.g(onBoardingViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return onBoardingViewModel;
            }
        }).a(TravelOnboardingViewModel.class);
        h viewModelOwnerProvider2 = refs.getViewModelOwnerProvider();
        final AviaSearchResultV4AllDoneViewMapper aviaSearchResultV4AllDoneViewMapper2 = this.this$0;
        AviaSearchResultV4AllDoneViewModel aviaSearchResultV4AllDoneViewModel = (AviaSearchResultV4AllDoneViewModel) new z0(viewModelOwnerProvider2.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.AviaSearchResultV4AllDoneViewMapper$holderProducer$1$invoke$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                AviaSearchResultV4Component aviaSearchResultV4Component5;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aviaSearchResultV4Component5 = AviaSearchResultV4AllDoneViewMapper.this.component;
                AviaSearchResultV4AllDoneViewModel aviaSearchResultV4AllDoneViewModel2 = aviaSearchResultV4Component5.getAviaSearchResultV4AllDoneViewModel();
                Intrinsics.g(aviaSearchResultV4AllDoneViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return aviaSearchResultV4AllDoneViewModel2;
            }
        }).a(AviaSearchResultV4AllDoneViewModel.class);
        aviaSearchResultV4Component4 = this.this$0.component;
        return new AviaSearchResultV4AllDoneWidgetViewHolder(view, refs, tokenizedAnalytics, aviaSearchResultV4MultiFrameBindDelegate, baseOnBoardingViewModel, aviaSearchResultV4AllDoneViewModel, aviaSearchResultV4Component4.getActionHandlersStoreFactory());
    }
}
