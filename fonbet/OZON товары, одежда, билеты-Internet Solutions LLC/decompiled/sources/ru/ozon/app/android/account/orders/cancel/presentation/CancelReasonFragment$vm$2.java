package ru.ozon.app.android.account.orders.cancel.presentation;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonViewModelImpl;", "kotlin.jvm.PlatformType", "invoke", "()Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonViewModelImpl;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CancelReasonFragment$vm$2 extends AbstractC7737t implements Function0<CancelReasonViewModelImpl> {
    final /* synthetic */ CancelReasonFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CancelReasonFragment$vm$2(CancelReasonFragment cancelReasonFragment) {
        super(0);
        this.this$0 = cancelReasonFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CancelReasonViewModelImpl invoke() {
        final CancelReasonFragment cancelReasonFragment = this.this$0;
        return (CancelReasonViewModelImpl) new z0(cancelReasonFragment, new z0.c() { // from class: ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonFragment$vm$2$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CancelReasonViewModelImpl cancelReasonViewModelImpl = CancelReasonFragment.this.getPViewModel$cs_orders_prodGoogleAllVendorsRelease().get();
                Intrinsics.g(cancelReasonViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return cancelReasonViewModelImpl;
            }
        }).a(CancelReasonViewModelImpl.class);
    }
}
