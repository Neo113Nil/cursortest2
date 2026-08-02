package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.skeleton;

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
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.di.AviaSearchResultV4Component;
import ru.ozon.app.android.travel.utils.onboarding.presentation.TravelOnboardingViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/skeleton/AviaSearchResultV4LoadingWidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultV4LoadingViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, AviaSearchResultV4LoadingWidgetViewHolder> {
    final /* synthetic */ AviaSearchResultV4LoadingViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultV4LoadingViewMapper$holderProducer$1(AviaSearchResultV4LoadingViewMapper aviaSearchResultV4LoadingViewMapper) {
        super(2);
        this.this$0 = aviaSearchResultV4LoadingViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final AviaSearchResultV4LoadingWidgetViewHolder invoke(View view, ComposerReferences refs) {
        AviaSearchResultV4Component aviaSearchResultV4Component;
        AviaSearchResultV4Component aviaSearchResultV4Component2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        aviaSearchResultV4Component = this.this$0.component;
        l tokenizedAnalytics = aviaSearchResultV4Component.getTokenizedAnalytics();
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final AviaSearchResultV4LoadingViewMapper aviaSearchResultV4LoadingViewMapper = this.this$0;
        BaseOnBoardingViewModel baseOnBoardingViewModel = (BaseOnBoardingViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.skeleton.AviaSearchResultV4LoadingViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                AviaSearchResultV4Component aviaSearchResultV4Component3;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aviaSearchResultV4Component3 = AviaSearchResultV4LoadingViewMapper.this.component;
                TravelOnboardingViewModel onBoardingViewModel = aviaSearchResultV4Component3.getOnBoardingViewModel();
                Intrinsics.g(onBoardingViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return onBoardingViewModel;
            }
        }).a(TravelOnboardingViewModel.class);
        aviaSearchResultV4Component2 = this.this$0.component;
        return new AviaSearchResultV4LoadingWidgetViewHolder(view, refs, tokenizedAnalytics, baseOnBoardingViewModel, aviaSearchResultV4Component2.getActionHandlersStoreFactory());
    }
}
