package ru.ozon.app.android.account.orders.barcode.presentation;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.orders.barcode.presentation.viewmodel.BarcodeViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.cs_orders.databinding.WidgetBarcodeBinding;
import ru.ozon.app.android.delivery.customActionsHandlers.sharebarcode.ShareBarcodeActionHandler;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BarcodeViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, BarcodeViewHolder> {
    final /* synthetic */ BarcodeViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BarcodeViewMapper$holderProducer$1(BarcodeViewMapper barcodeViewMapper) {
        super(2);
        this.this$0 = barcodeViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final BarcodeViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        WidgetBarcodeBinding bind = WidgetBarcodeBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        B0 a11 = refs.getViewModelOwnerProvider().a();
        final BarcodeViewMapper barcodeViewMapper = this.this$0;
        BarcodeViewModel barcodeViewModel = (BarcodeViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.account.orders.barcode.presentation.BarcodeViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                BarcodeViewModel viewModel = BarcodeViewMapper.this.component().getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(BarcodeViewModel.class);
        B0 a12 = refs.getViewModelOwnerProvider().a();
        final BarcodeViewMapper barcodeViewMapper2 = this.this$0;
        return new BarcodeViewHolder(bind, refs, barcodeViewModel, (BaseOnBoardingViewModel) new z0(a12, new z0.c() { // from class: ru.ozon.app.android.account.orders.barcode.presentation.BarcodeViewMapper$holderProducer$1$invoke$$inlined$createViewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                BaseOnBoardingViewModel.Default onboardingViewModel = BarcodeViewMapper.this.component().getOnboardingViewModel();
                Intrinsics.g(onboardingViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return onboardingViewModel;
            }
        }).a(BaseOnBoardingViewModel.Default.class), this.this$0.component().getBarcodeDrawableCache(), this.this$0.component().getCustomActionHandlersStoreFactory().create(ShareBarcodeActionHandler.class), this.this$0.component().getHandlersInhibitor());
    }
}
