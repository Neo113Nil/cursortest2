package ru.ozon.app.android.checkoutcomposer.paymentschedule;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.paymentschedule.PaymentScheduleDTO;
import ru.ozon.app.android.checkoutcomposer.paymentschedule.PaymentScheduleVO;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleDTO;", "Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO;", "toVO", "(Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleDTO;)Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO;", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentScheduleModelsKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.collections.K] */
    @NotNull
    public static final PaymentScheduleVO toVO(@NotNull PaymentScheduleDTO paymentScheduleDTO) {
        List list;
        Intrinsics.checkNotNullParameter(paymentScheduleDTO, "<this>");
        long j11 = 1034567781;
        String icon = paymentScheduleDTO.getIcon();
        String title = paymentScheduleDTO.getTitle();
        String subtitle = paymentScheduleDTO.getSubtitle();
        List<PaymentScheduleDTO.PaymentDTO> payments = paymentScheduleDTO.getPayments();
        ArrayList arrayList = new ArrayList(C7714v.z(payments, 10));
        for (PaymentScheduleDTO.PaymentDTO paymentDTO : payments) {
            arrayList.add(new PaymentScheduleVO.PaymentItem.Payment(paymentDTO.getDate(), paymentDTO.getAmount()));
        }
        PaymentScheduleVO.PaymentItem.PaymentTotal paymentTotal = new PaymentScheduleVO.PaymentItem.PaymentTotal(paymentScheduleDTO.getTotalTitle(), paymentScheduleDTO.getTotalSubtitle(), paymentScheduleDTO.getTotalAmount());
        List<PaymentScheduleDTO.TotalPriceDTO> totalPrices = paymentScheduleDTO.getTotalPrices();
        if (totalPrices != null) {
            List<PaymentScheduleDTO.TotalPriceDTO> list2 = totalPrices;
            list = new ArrayList(C7714v.z(list2, 10));
            for (PaymentScheduleDTO.TotalPriceDTO totalPriceDTO : list2) {
                list.add(new PaymentScheduleVO.PaymentItem.TotalPrice(totalPriceDTO.getText(), totalPriceDTO.getAmount()));
            }
        } else {
            list = 0;
        }
        if (list == 0) {
            list = K.f71697a;
        }
        return new PaymentScheduleVO(j11, icon, title, subtitle, arrayList, paymentTotal, list);
    }
}
