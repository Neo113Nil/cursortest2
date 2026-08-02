package spay.sdk.data.dto.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.response.PaymentOrderResponseBody;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toDto", "Lspay/sdk/data/dto/response/PaymentOrderResponseBodyDto;", "Lspay/sdk/domain/model/response/PaymentOrderResponseBody;", "SPaySDK_baseRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentOrderResponseBodyDtoKt {
    @NotNull
    public static final PaymentOrderResponseBodyDto toDto(@NotNull PaymentOrderResponseBody paymentOrderResponseBody) {
        Intrinsics.checkNotNullParameter(paymentOrderResponseBody, "<this>");
        return new PaymentOrderResponseBodyDto(paymentOrderResponseBody.getOperationId(), paymentOrderResponseBody.getErrorCode(), paymentOrderResponseBody.getDescription(), paymentOrderResponseBody.getInfo(), paymentOrderResponseBody.getFormUrl(), paymentOrderResponseBody.getRedirect(), paymentOrderResponseBody.getTermUrl(), paymentOrderResponseBody.getAcsUrl(), paymentOrderResponseBody.getPaReq(), paymentOrderResponseBody.getCReq(), paymentOrderResponseBody.getThreeDSMethodUrl(), paymentOrderResponseBody.getThreeDSMethodNotificationUrl(), paymentOrderResponseBody.getThreeDSServerTransId(), paymentOrderResponseBody.getThreeDSMethodData(), paymentOrderResponseBody.getAcsRenderingType(), paymentOrderResponseBody.getAcsSignedContent());
    }
}
