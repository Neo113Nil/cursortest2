package ru.ozon.app.android.pdp.widgets.installmentPurchase.core.purchase;

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
import ru.ozon.app.android.pdp.view.animationsaleblock.SaleBlockViewModel;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.purchase.InstallmentPurchaseView;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.purchase.InstallmentPurchaseWidgetViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/purchase/InstallmentPurchaseWidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class InstallmentPurchaseViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, InstallmentPurchaseWidgetViewHolder> {
    final /* synthetic */ InstallmentPurchaseViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstallmentPurchaseViewMapper$holderProducer$1(InstallmentPurchaseViewMapper installmentPurchaseViewMapper) {
        super(2);
        this.this$0 = installmentPurchaseViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final InstallmentPurchaseWidgetViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        InstallmentPurchaseView installmentPurchaseView = (InstallmentPurchaseView) view;
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final InstallmentPurchaseViewMapper installmentPurchaseViewMapper = this.this$0;
        BaseOnBoardingViewModel.Default r32 = (BaseOnBoardingViewModel.Default) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.installmentPurchase.core.purchase.InstallmentPurchaseViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                BaseOnBoardingViewModel.Default onboardingViewModel = InstallmentPurchaseViewMapper.this.component().getOnboardingViewModel();
                Intrinsics.g(onboardingViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return onboardingViewModel;
            }
        }).a(BaseOnBoardingViewModel.Default.class);
        h viewModelOwnerProvider2 = refs.getViewModelOwnerProvider();
        final InstallmentPurchaseViewMapper installmentPurchaseViewMapper2 = this.this$0;
        return new InstallmentPurchaseWidgetViewHolder(installmentPurchaseView, r32, (SaleBlockViewModel) new z0(viewModelOwnerProvider2.a(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.installmentPurchase.core.purchase.InstallmentPurchaseViewMapper$holderProducer$1$invoke$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                SaleBlockViewModel saleBlockViewModel = InstallmentPurchaseViewMapper.this.component().getSaleBlockViewModel();
                Intrinsics.g(saleBlockViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return saleBlockViewModel;
            }
        }).a(SaleBlockViewModel.class), refs, this.this$0.component().getTokenizedAnalytics());
    }
}
