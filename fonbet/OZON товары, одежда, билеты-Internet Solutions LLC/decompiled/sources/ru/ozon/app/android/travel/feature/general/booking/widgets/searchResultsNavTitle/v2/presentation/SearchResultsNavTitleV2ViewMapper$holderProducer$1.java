package ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v2.presentation;

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

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/booking/widgets/searchResultsNavTitle/v2/presentation/SearchResultsNavTitleV2WidgetViewHolder;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SearchResultsNavTitleV2ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, SearchResultsNavTitleV2WidgetViewHolder> {
    final /* synthetic */ SearchResultsNavTitleV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchResultsNavTitleV2ViewMapper$holderProducer$1(SearchResultsNavTitleV2ViewMapper searchResultsNavTitleV2ViewMapper) {
        super(2);
        this.this$0 = searchResultsNavTitleV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final SearchResultsNavTitleV2WidgetViewHolder invoke(View view, ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        h viewModelOwnerProvider = references.getViewModelOwnerProvider();
        final SearchResultsNavTitleV2ViewMapper searchResultsNavTitleV2ViewMapper = this.this$0;
        return new SearchResultsNavTitleV2WidgetViewHolder(view, references, (BaseOnBoardingViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v2.presentation.SearchResultsNavTitleV2ViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                BaseOnBoardingViewModel onBoardingViewModel = SearchResultsNavTitleV2ViewMapper.this.component().getOnBoardingViewModel();
                Intrinsics.g(onBoardingViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return onBoardingViewModel;
            }
        }).a(BaseOnBoardingViewModel.class), this.this$0.component().getTokenizedAnalytics());
    }
}
