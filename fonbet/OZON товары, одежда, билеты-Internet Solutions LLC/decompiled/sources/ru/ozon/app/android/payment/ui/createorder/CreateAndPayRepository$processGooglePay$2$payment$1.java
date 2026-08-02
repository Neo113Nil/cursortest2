package ru.ozon.app.android.payment.ui.createorder;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.AuthorizePaymentDTO;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/AuthorizePaymentDTO;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)Lru/ozon/app/android/checkoutgeo/payment/sberpay/AuthorizePaymentDTO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CreateAndPayRepository$processGooglePay$2$payment$1 extends AbstractC7737t implements Function1<ActionV2Response<AuthorizePaymentDTO>, AuthorizePaymentDTO> {
    public static final CreateAndPayRepository$processGooglePay$2$payment$1 INSTANCE = new CreateAndPayRepository$processGooglePay$2$payment$1();

    CreateAndPayRepository$processGooglePay$2$payment$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final AuthorizePaymentDTO invoke(ActionV2Response<AuthorizePaymentDTO> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AuthorizePaymentDTO data = it.getData();
        if (data != null) {
            return data;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
