package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card;

import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.di.HotelsSearchResultsV5Component;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.multiFrameBinding.HotelsSearchResultsV5MultiFrameBindDelegate;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.view.HotelsSearchResultsV5CardView;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardWidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class HotelsSearchResultsV5CardViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, HotelsSearchResultsV5CardWidgetViewHolder> {
    final /* synthetic */ HotelsSearchResultsV5CardViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsSearchResultsV5CardViewMapper$holderProducer$1(HotelsSearchResultsV5CardViewMapper hotelsSearchResultsV5CardViewMapper) {
        super(2);
        this.this$0 = hotelsSearchResultsV5CardViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final HotelsSearchResultsV5CardWidgetViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        HotelsSearchResultsV5Component component = this.this$0.component();
        HotelsSearchResultsV5CardViewMapper hotelsSearchResultsV5CardViewMapper = this.this$0;
        final HotelsSearchResultsV5Component hotelsSearchResultsV5Component = component;
        HotelsSearchResultsV5CardView hotelsSearchResultsV5CardView = (HotelsSearchResultsV5CardView) view;
        return new HotelsSearchResultsV5CardWidgetViewHolder(hotelsSearchResultsV5CardView, refs, new HotelsSearchResultsV5MultiFrameBindDelegate(hotelsSearchResultsV5CardView, refs, hotelsSearchResultsV5CardViewMapper.component().getStateBinder(), hotelsSearchResultsV5CardViewMapper.component().getFrameBinder()), hotelsSearchResultsV5Component.getCustomActionHandlersStoreFactory(), (HotelsSearchResultsV5CardViewModel) new z0(refs.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardViewMapper$holderProducer$1$invoke$lambda$2$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                HotelsSearchResultsV5CardViewModel hotelsSearchResultsV5CardViewModel = HotelsSearchResultsV5Component.this.getHotelsSearchResultsV5CardViewModel();
                Intrinsics.g(hotelsSearchResultsV5CardViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return hotelsSearchResultsV5CardViewModel;
            }
        }).a(HotelsSearchResultsV5CardViewModel.class), hotelsSearchResultsV5Component.getProductFavoriteDelegateProvider().get(refs), hotelsSearchResultsV5Component.getTokenizedAnalytics(), (BaseOnBoardingViewModel) new z0(refs.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardViewMapper$holderProducer$1$invoke$lambda$2$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                BaseOnBoardingViewModel onboardingViewModel = HotelsSearchResultsV5Component.this.getOnboardingViewModel();
                Intrinsics.g(onboardingViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return onboardingViewModel;
            }
        }).a(BaseOnBoardingViewModel.class), hotelsSearchResultsV5CardViewMapper.component().getFeatureChecker(), hotelsSearchResultsV5CardViewMapper.component().getAuthStateStorage(), hotelsSearchResultsV5CardViewMapper.component().getFavoriteUnauthorizedAnalytics());
    }
}
