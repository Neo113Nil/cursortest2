package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation;

import B0.C2454a;
import io.reactivex.C;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.feature.b2b.domain.DocsDeliveryAddressResponse;
import ru.ozon.app.android.fresh.feature.b2b.domain.DocsDeliveryResponse;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModel;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModelImpl;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryAddressResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "response", "Lio/reactivex/C;", "Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryAddressResponse;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class DocsDeliveryFormViewModelImpl$onDeliverySubmitted$1$1 extends AbstractC7737t implements Function1<DocsDeliveryAddressResponse, C<? extends DocsDeliveryResponse>> {
    final /* synthetic */ DocsDeliveryFormViewModel.DeliveryFormData $deliveryFormData;
    final /* synthetic */ DocsDeliveryFormViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocsDeliveryFormViewModelImpl$onDeliverySubmitted$1$1(DocsDeliveryFormViewModelImpl docsDeliveryFormViewModelImpl, DocsDeliveryFormViewModel.DeliveryFormData deliveryFormData) {
        super(1);
        this.this$0 = docsDeliveryFormViewModelImpl;
        this.$deliveryFormData = deliveryFormData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C<? extends DocsDeliveryResponse> invoke(DocsDeliveryAddressResponse response) {
        y requestDelivery;
        Intrinsics.checkNotNullParameter(response, "response");
        if (!Intrinsics.d(response.isFinal(), Boolean.TRUE)) {
            return y.f(new DocsDeliveryResponse(false, null, C2454a.b(DocsDeliveryFormViewModelImpl.FormField.ADDRESS.getFieldName(), response.getMessage())));
        }
        requestDelivery = this.this$0.requestDelivery(this.$deliveryFormData);
        return requestDelivery;
    }
}
