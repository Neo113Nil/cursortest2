package ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation;

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
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3WidgetViewHolder;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TravelCellListV3ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TravelCellListV3WidgetViewHolder> {
    final /* synthetic */ TravelCellListV3ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelCellListV3ViewMapper$holderProducer$1(TravelCellListV3ViewMapper travelCellListV3ViewMapper) {
        super(2);
        this.this$0 = travelCellListV3ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TravelCellListV3WidgetViewHolder invoke(View view, ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        d customActionHandlersStoreFactory = this.this$0.component().getCustomActionHandlersStoreFactory();
        h viewModelOwnerProvider = references.getViewModelOwnerProvider();
        final TravelCellListV3ViewMapper travelCellListV3ViewMapper = this.this$0;
        BaseOnBoardingViewModel baseOnBoardingViewModel = (BaseOnBoardingViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation.TravelCellListV3ViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                BaseOnBoardingViewModel onboardingViewModel = TravelCellListV3ViewMapper.this.component().getOnboardingViewModel();
                Intrinsics.g(onboardingViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return onboardingViewModel;
            }
        }).a(BaseOnBoardingViewModel.class);
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        h viewModelOwnerProvider2 = references.getViewModelOwnerProvider();
        final TravelCellListV3ViewMapper travelCellListV3ViewMapper2 = this.this$0;
        return new TravelCellListV3WidgetViewHolder(view, references, customActionHandlersStoreFactory, baseOnBoardingViewModel, tokenizedAnalytics, (TravelCellListV3ViewModel) new z0(viewModelOwnerProvider2.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation.TravelCellListV3ViewMapper$holderProducer$1$invoke$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                TravelCellListV3ViewModel travelCellListV3ViewModel = TravelCellListV3ViewMapper.this.component().getTravelCellListV3ViewModel();
                Intrinsics.g(travelCellListV3ViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return travelCellListV3ViewModel;
            }
        }).a(TravelCellListV3ViewModel.class));
    }
}
