package ru.ozon.app.android.common.serviceCarousel.core;

import B0.C2454a;
import Vg.d;
import WZ.l;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselViewHolder;
import ru.ozon.app.android.common.serviceCarousel.presentation.onboarding.ServiceCarouselOnboardingViewModel;
import ru.ozon.app.android.commonvertical.sharedCarouselViewModel.SharedCarouselViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.domain.flags.CategoryMainPageFreshPreCreateWidgetsNewConfiguration;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselViewHolder;", "view", "Landroid/view/View;", "composerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ServiceCarouselViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ServiceCarouselViewHolder> {
    final /* synthetic */ ServiceCarouselViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServiceCarouselViewMapper$holderProducer$1(ServiceCarouselViewMapper serviceCarouselViewMapper) {
        super(2);
        this.this$0 = serviceCarouselViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ServiceCarouselViewHolder invoke(View view, ComposerReferences composerReferences) {
        Object obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        d customActionHandlersStoreFactory = this.this$0.component().getCustomActionHandlersStoreFactory();
        B0 b11 = composerReferences.getViewModelOwnerProvider().b();
        final ServiceCarouselViewMapper serviceCarouselViewMapper = this.this$0;
        w0 a11 = new z0(b11, new z0.c() { // from class: ru.ozon.app.android.common.serviceCarousel.core.ServiceCarouselViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                SharedCarouselViewModel sharedCarouselViewModel = ServiceCarouselViewMapper.this.component().getSharedViewModel().get();
                Intrinsics.g(sharedCarouselViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return sharedCarouselViewModel;
            }
        }).a(SharedCarouselViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        SharedCarouselViewModel sharedCarouselViewModel = (SharedCarouselViewModel) a11;
        l tokenizedAnalytics = composerReferences.getTokenizedAnalytics();
        B0 a12 = composerReferences.getViewModelOwnerProvider().a();
        final ServiceCarouselViewMapper serviceCarouselViewMapper2 = this.this$0;
        w0 a13 = new z0(a12, new z0.c() { // from class: ru.ozon.app.android.common.serviceCarousel.core.ServiceCarouselViewMapper$holderProducer$1$invoke$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ServiceCarouselOnboardingViewModel serviceCarouselOnboardingViewModel = ServiceCarouselViewMapper.this.component().getOnBoardingViewModel().get();
                Intrinsics.g(serviceCarouselOnboardingViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return serviceCarouselOnboardingViewModel;
            }
        }).a(ServiceCarouselOnboardingViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a13, "viewModel(...)");
        BaseOnBoardingViewModel baseOnBoardingViewModel = (BaseOnBoardingViewModel) a13;
        CoroutineDispatcherProvider coroutineDispatchersProvider = this.this$0.component().getCoroutineDispatchersProvider();
        List m11 = h.m(this.this$0.component().getFeatureService().getStringKey(CategoryMainPageFreshPreCreateWidgetsNewConfiguration.INSTANCE), new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(C7714v.z(m11, 10));
        Iterator it = m11.iterator();
        while (it.hasNext()) {
            C2454a.g((String) it.next(), arrayList);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (Intrinsics.d((String) obj, "serviceCarousel")) {
                break;
            }
        }
        return new ServiceCarouselViewHolder(view, composerReferences, customActionHandlersStoreFactory, sharedCarouselViewModel, tokenizedAnalytics, baseOnBoardingViewModel, coroutineDispatchersProvider, obj != null);
    }
}
