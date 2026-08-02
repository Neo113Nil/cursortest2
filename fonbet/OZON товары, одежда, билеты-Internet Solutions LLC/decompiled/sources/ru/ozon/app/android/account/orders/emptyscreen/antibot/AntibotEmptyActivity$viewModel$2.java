package ru.ozon.app.android.account.orders.emptyscreen.antibot;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.orders.commonBarcodeV2.presentation.CommonBarcodeV2ViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2ViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AntibotEmptyActivity$viewModel$2 extends AbstractC7737t implements Function0<CommonBarcodeV2ViewModel> {
    final /* synthetic */ AntibotEmptyActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AntibotEmptyActivity$viewModel$2(AntibotEmptyActivity antibotEmptyActivity) {
        super(0);
        this.this$0 = antibotEmptyActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CommonBarcodeV2ViewModel invoke() {
        return (CommonBarcodeV2ViewModel) new z0(this.this$0, new z0.c() { // from class: ru.ozon.app.android.account.orders.emptyscreen.antibot.AntibotEmptyActivity$viewModel$2$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                return new CommonBarcodeV2ViewModel();
            }
        }).a(CommonBarcodeV2ViewModel.class);
    }
}
