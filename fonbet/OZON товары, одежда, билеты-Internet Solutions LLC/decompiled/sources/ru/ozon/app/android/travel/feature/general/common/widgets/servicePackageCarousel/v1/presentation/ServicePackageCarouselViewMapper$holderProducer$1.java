package ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation;

import Pc.a;
import Vg.d;
import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.view.ServicePackageCarouselView;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselWidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ServicePackageCarouselViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ServicePackageCarouselWidgetViewHolder> {
    final /* synthetic */ ServicePackageCarouselViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServicePackageCarouselViewMapper$holderProducer$1(ServicePackageCarouselViewMapper servicePackageCarouselViewMapper) {
        super(2);
        this.this$0 = servicePackageCarouselViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ServicePackageCarouselWidgetViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        d customActionHandlersStoreFactory = this.this$0.component().getCustomActionHandlersStoreFactory();
        ServicePackageCarouselView servicePackageCarouselView = (ServicePackageCarouselView) view;
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final a<ServicePackageCarouselViewModel> viewModelProvider = this.this$0.component().getViewModelProvider();
        w0 a11 = new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.ServicePackageCarouselViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ServicePackageCarouselViewModel servicePackageCarouselViewModel = (ServicePackageCarouselViewModel) a.this.get();
                Intrinsics.g(servicePackageCarouselViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return servicePackageCarouselViewModel;
            }
        }).a(ServicePackageCarouselViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new ServicePackageCarouselWidgetViewHolder(refs, customActionHandlersStoreFactory, servicePackageCarouselView, (ServicePackageCarouselViewModel) a11, this.this$0.component().getTokenizedAnalytics());
    }
}
