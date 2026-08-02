package ru.ozon.app.android.checkoutcomposer.total.presentation.main;

import Vg.d;
import a00.h;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.checkout.databinding.WidgetTotalCommonBinding;
import ru.ozon.app.android.checkoutcomposer.total.di.TotalWidgetComponent;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.network.referrer.ReferrerValueController;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.partnerBanks.presentation.view.PartnerBanksDelegate;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/checkoutcomposer/total/presentation/main/TotalVH;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TotalViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TotalVH> {
    final /* synthetic */ TotalViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TotalViewMapper$holderProducer$1(TotalViewMapper totalViewMapper) {
        super(2);
        this.this$0 = totalViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TotalVH invoke(View view, ComposerReferences refs) {
        TotalWidgetComponent totalWidgetComponent;
        TotalWidgetComponent totalWidgetComponent2;
        TotalWidgetComponent totalWidgetComponent3;
        TotalWidgetComponent totalWidgetComponent4;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        WidgetTotalCommonBinding bind = WidgetTotalCommonBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        B0 a11 = refs.getViewModelOwnerProvider().a();
        final TotalViewMapper totalViewMapper = this.this$0;
        CreateAndPayViewModel createAndPayViewModel = (CreateAndPayViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.checkoutcomposer.total.presentation.main.TotalViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                TotalWidgetComponent totalWidgetComponent5;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                totalWidgetComponent5 = TotalViewMapper.this.component;
                CreateAndPayViewModel createAndPayViewModel2 = totalWidgetComponent5.getCreateAndPayViewModel();
                Intrinsics.g(createAndPayViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return createAndPayViewModel2;
            }
        }).a(CreateAndPayViewModel.class);
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final TotalViewMapper totalViewMapper2 = this.this$0;
        TotalVisibilityViewModel totalVisibilityViewModel = (TotalVisibilityViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.checkoutcomposer.total.presentation.main.TotalViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                TotalWidgetComponent totalWidgetComponent5;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                totalWidgetComponent5 = TotalViewMapper.this.component;
                TotalVisibilityViewModel totalVisibilityViewModel2 = totalWidgetComponent5.getTotalVisibilityViewModel();
                Intrinsics.g(totalVisibilityViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return totalVisibilityViewModel2;
            }
        }).a(TotalVisibilityViewModel.class);
        totalWidgetComponent = this.this$0.component;
        d customActionHandlersStoreFactory = totalWidgetComponent.getCustomActionHandlersStoreFactory();
        totalWidgetComponent2 = this.this$0.component;
        ReferrerValueController referrerValueController = totalWidgetComponent2.getReferrerValueController();
        FrameBinder frameBinder = refs.getFrameBinderProvider().get();
        totalWidgetComponent3 = this.this$0.component;
        PartnerBanksDelegate partnerBanksDelegate = totalWidgetComponent3.getPartnerBanksDelegate();
        totalWidgetComponent4 = this.this$0.component;
        return new TotalVH(bind, refs, createAndPayViewModel, customActionHandlersStoreFactory, totalVisibilityViewModel, referrerValueController, frameBinder, partnerBanksDelegate, totalWidgetComponent4.getAsyncCartViewModelProvider().get(refs));
    }
}
