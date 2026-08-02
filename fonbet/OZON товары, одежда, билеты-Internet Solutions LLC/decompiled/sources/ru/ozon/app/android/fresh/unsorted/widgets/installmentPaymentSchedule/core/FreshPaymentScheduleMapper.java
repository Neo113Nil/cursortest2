package ru.ozon.app.android.fresh.unsorted.widgets.installmentPaymentSchedule.core;

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
import ru.ozon.app.android.fresh.unsorted.widgets.installmentPaymentSchedule.data.FreshPaymentScheduleDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.installmentPaymentSchedule.presentation.FreshPaymentScheduleVO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/installmentPaymentSchedule/core/FreshPaymentScheduleMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/installmentPaymentSchedule/data/FreshPaymentScheduleDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/installmentPaymentSchedule/presentation/FreshPaymentScheduleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/unsorted/widgets/installmentPaymentSchedule/data/FreshPaymentScheduleDTO$PaymentDTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/installmentPaymentSchedule/presentation/FreshPaymentScheduleVO$PaymentVO;", "toVO", "(Lru/ozon/app/android/fresh/unsorted/widgets/installmentPaymentSchedule/data/FreshPaymentScheduleDTO$PaymentDTO;)Lru/ozon/app/android/fresh/unsorted/widgets/installmentPaymentSchedule/presentation/FreshPaymentScheduleVO$PaymentVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/unsorted/widgets/installmentPaymentSchedule/data/FreshPaymentScheduleDTO;Ll20/d;)Ljava/util/List;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshPaymentScheduleMapper implements Function2<FreshPaymentScheduleDTO, d, List<? extends FreshPaymentScheduleVO>> {
    private final FreshPaymentScheduleVO.PaymentVO toVO(FreshPaymentScheduleDTO.PaymentDTO paymentDTO) {
        return new FreshPaymentScheduleVO.PaymentVO(paymentDTO.getAmount(), paymentDTO.getDate(), paymentDTO.getBackgroundColor());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<FreshPaymentScheduleVO> invoke(@NotNull FreshPaymentScheduleDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = state.hashCode();
        TextDTO title = state.getTitle();
        TextDTO subtitle = state.getSubtitle();
        List<FreshPaymentScheduleDTO.PaymentDTO> payments = state.getPayments();
        ArrayList arrayList = new ArrayList(C7714v.z(payments, 10));
        Iterator<T> it = payments.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((FreshPaymentScheduleDTO.PaymentDTO) it.next()));
        }
        TextDTO description = state.getDescription();
        Boolean showPaymentsAnimation = state.getShowPaymentsAnimation();
        boolean booleanValue = showPaymentsAnimation != null ? showPaymentsAnimation.booleanValue() : false;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new FreshPaymentScheduleVO(hashCode, title, subtitle, arrayList, description, booleanValue, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
