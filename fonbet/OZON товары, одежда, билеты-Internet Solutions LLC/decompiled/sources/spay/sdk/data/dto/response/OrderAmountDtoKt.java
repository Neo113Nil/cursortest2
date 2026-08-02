package spay.sdk.data.dto.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.response.OrderAmount;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toDto", "Lspay/sdk/data/dto/response/OrderAmountDto;", "Lspay/sdk/domain/model/response/OrderAmount;", "SPaySDK_baseRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderAmountDtoKt {
    @NotNull
    public static final OrderAmountDto toDto(@NotNull OrderAmount orderAmount) {
        String str;
        Intrinsics.checkNotNullParameter(orderAmount, "<this>");
        Integer amount = orderAmount.getAmount();
        String currency = orderAmount.getCurrency();
        if (currency != null) {
            Intrinsics.checkNotNullParameter(currency, "<this>");
            str = currency.equals("₽") ? "643" : "";
        } else {
            str = null;
        }
        return new OrderAmountDto(amount, str);
    }
}
