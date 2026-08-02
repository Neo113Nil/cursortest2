package ru.ozon.app.android.checkoutgeo.payment.sberpay;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.OrderDO;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.OrderDTO;
import ru.ozon.uni.android.flashbar.model.Restriction;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0007*\u00020\bH\u0002¨\u0006\t"}, d2 = {"toDO", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByNative$NativePaymentInfo;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$NativePaymentInfo;", "authorizeComposerActionName", "", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayBySberPay$SberPayInfo;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$SberPayInfo;", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CreateAndPayModelsKt {
    @NotNull
    public static final OrderDO toDO(@NotNull OrderDTO orderDTO) {
        Long l11;
        OrderDO.OrderError.TYPE type;
        Intrinsics.checkNotNullParameter(orderDTO, "<this>");
        int i11 = 0;
        if (orderDTO.getError() == null) {
            if (orderDTO.getAction() != null) {
                return new OrderDO.WithAction(orderDTO.getAction());
            }
            if (orderDTO.getSberPayInfo() != null) {
                return new OrderDO.PayBySberPay(orderDTO.getLink(), orderDTO.getCancelLink(), orderDTO.getRedirectLink(), toDO(orderDTO.getSberPayInfo()));
            }
            if (orderDTO.getRedirectLink() != null) {
                return new OrderDO.OrderRedirect(orderDTO.getRedirectLink());
            }
            if (orderDTO.getNativePaymentInfo() != null) {
                return new OrderDO.PayByNative(orderDTO.getAuthorizePaymentUrl(), orderDTO.getCancelLink(), toDO(orderDTO.getNativePaymentInfo(), orderDTO.getAuthorizeComposerActionName()));
            }
            if (orderDTO.getFastPayInfo() == null) {
                return new OrderDO.PayByOther(orderDTO.getLink(), orderDTO.getCancelLink());
            }
            String link = orderDTO.getFastPayInfo().getLink();
            String cancelLink = orderDTO.getCancelLink();
            if (cancelLink == null) {
                cancelLink = orderDTO.getLink();
            }
            Boolean isRedirectBank = orderDTO.getFastPayInfo().isRedirectBank();
            return new OrderDO.PayByFastPay(link, cancelLink, isRedirectBank != null ? isRedirectBank.booleanValue() : false);
        }
        OrderDO.OrderError.TYPE[] values = OrderDO.OrderError.TYPE.values();
        int length = values.length;
        while (true) {
            l11 = null;
            if (i11 >= length) {
                type = null;
                break;
            }
            type = values[i11];
            if (Intrinsics.d(type.getKey(), orderDTO.getError().getType())) {
                break;
            }
            i11++;
        }
        if (type == null) {
            type = OrderDO.OrderError.TYPE.DEFAULT;
        }
        String title = orderDTO.getError().getTitle();
        String message = orderDTO.getError().getMessage();
        String lifetime = orderDTO.getError().getLifetime();
        if (Intrinsics.d(lifetime, Restriction.Lifetime.INFINITE.getValue())) {
            l11 = 10000L;
        } else if (Intrinsics.d(lifetime, Restriction.Lifetime.LONG.getValue())) {
            l11 = 6000L;
        } else if (Intrinsics.d(lifetime, Restriction.Lifetime.SHORT.getValue())) {
            l11 = 3000L;
        }
        return new OrderDO.OrderError(type, title, message, l11);
    }

    private static final OrderDO.PayByNative.NativePaymentInfo toDO(OrderDTO.NativePaymentInfo nativePaymentInfo, String str) {
        return new OrderDO.PayByNative.NativePaymentInfo(nativePaymentInfo.getOrderNumber(), nativePaymentInfo.getFullOrderSum(), nativePaymentInfo.getOrderSum(), nativePaymentInfo.getPaymentToken(), nativePaymentInfo.getProvider(), nativePaymentInfo.getMerchant(), nativePaymentInfo.getGateway(), str);
    }

    private static final OrderDO.PayBySberPay.SberPayInfo toDO(OrderDTO.SberPayInfo sberPayInfo) {
        return new OrderDO.PayBySberPay.SberPayInfo(sberPayInfo.getApiKey(), sberPayInfo.getMerchant(), sberPayInfo.getBankInvoiceId(), sberPayInfo.getOrderNumber());
    }
}
