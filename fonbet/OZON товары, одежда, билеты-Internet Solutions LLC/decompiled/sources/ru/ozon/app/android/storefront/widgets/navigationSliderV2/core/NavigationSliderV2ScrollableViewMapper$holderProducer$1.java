package ru.ozon.app.android.storefront.widgets.navigationSliderV2.core;

import a00.h;
import android.view.View;
import androidx.fragment.app.r;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2OnBoardingViewModel;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2ScrollableWidgetViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2ScrollableWidgetViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class NavigationSliderV2ScrollableViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, NavigationSliderV2ScrollableWidgetViewHolder> {
    final /* synthetic */ NavigationSliderV2ScrollableViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationSliderV2ScrollableViewMapper$holderProducer$1(NavigationSliderV2ScrollableViewMapper navigationSliderV2ScrollableViewMapper) {
        super(2);
        this.this$0 = navigationSliderV2ScrollableViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final NavigationSliderV2ScrollableWidgetViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        AdultHandler adultHandler = this.this$0.component().getAdultHandler();
        r i11 = ref.getContainer().i();
        h viewModelOwnerProvider = ref.getViewModelOwnerProvider();
        final NavigationSliderV2ScrollableViewMapper navigationSliderV2ScrollableViewMapper = this.this$0;
        w0 a11 = new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.storefront.widgets.navigationSliderV2.core.NavigationSliderV2ScrollableViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                NavigationSliderV2OnBoardingViewModel navigationSliderV2OnBoardingViewModel = NavigationSliderV2ScrollableViewMapper.this.component().getOnBoardingViewModelProvider().get();
                Intrinsics.g(navigationSliderV2OnBoardingViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return navigationSliderV2OnBoardingViewModel;
            }
        }).a(NavigationSliderV2OnBoardingViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new NavigationSliderV2ScrollableWidgetViewHolder(view, adultHandler, i11, this.this$0.component().getFeatureChecker(), ref, (NavigationSliderV2OnBoardingViewModel) a11, this.this$0.component().getTokenizedAnalytics(), this.this$0.component().getActionHandlersStore());
    }
}
