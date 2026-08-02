package ru.ozon.app.android.travel.feature.general.order.widgets.paymentDetails.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.order.widgets.paymentDetails.data.PaymentDetailsDTO;
import ru.ozon.app.android.travel.feature.general.order.widgets.paymentDetails.presentation.PaymentDetailsVO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0003j\u0002`\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/data/PaymentDetailsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/data/PaymentDetailsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/data/PaymentDetailsDTO$PaymentStatus;", "item", "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO$PaymentStatus;", "mapPaymentStatus", "(Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/data/PaymentDetailsDTO$PaymentStatus;)Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO$PaymentStatus;", "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/data/PaymentDetailsDTO$PaymentDetail;", "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO$PaymentDetail;", "mapPaymentDetail", "(Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/data/PaymentDetailsDTO$PaymentDetail;)Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO$PaymentDetail;", "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/data/PaymentDetailsDTO$StatusIcon;", "Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO$StatusIcon;", "mapStatusIcon", "(Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/data/PaymentDetailsDTO$StatusIcon;)Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/presentation/PaymentDetailsVO$StatusIcon;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/order/widgets/paymentDetails/data/PaymentDetailsDTO;Ll20/d;)Ljava/util/List;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentDetailsMapper implements Function2<PaymentDetailsDTO, d, List<? extends PaymentDetailsVO>> {
    private final PaymentDetailsVO.PaymentDetail mapPaymentDetail(PaymentDetailsDTO.PaymentDetail item) {
        return new PaymentDetailsVO.PaymentDetail(item.getTitle().getText().hashCode(), item.getIcon(), item.getTitle(), item.getDescription(), item.getInformer(), item.getDescriptionIconButton());
    }

    private final PaymentDetailsVO.PaymentStatus mapPaymentStatus(PaymentDetailsDTO.PaymentStatus item) {
        return new PaymentDetailsVO.PaymentStatus(item.getTitle(), mapStatusIcon(item.getStatusIcon()), item.getErrorMessage(), item.getPaymentButton());
    }

    private final PaymentDetailsVO.StatusIcon mapStatusIcon(PaymentDetailsDTO.StatusIcon item) {
        return new PaymentDetailsVO.StatusIcon(item.getIcon(), item.getBgColor());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PaymentDetailsVO> invoke(@NotNull PaymentDetailsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        PaymentDetailsVO.PaymentStatus mapPaymentStatus = mapPaymentStatus(state.getPaymentStatus());
        boolean z11 = !state.getPaymentDetailsList().isEmpty();
        List<PaymentDetailsDTO.PaymentDetail> paymentDetailsList = state.getPaymentDetailsList();
        ArrayList arrayList = new ArrayList(C7714v.z(paymentDetailsList, 10));
        Iterator<T> it = paymentDetailsList.iterator();
        while (it.hasNext()) {
            arrayList.add(mapPaymentDetail((PaymentDetailsDTO.PaymentDetail) it.next()));
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new PaymentDetailsVO(hashCode, mapPaymentStatus, z11, arrayList, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
