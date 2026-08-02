package ru.ozon.app.android.partpayment.smssign.view;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.partpayment.smssign.view.SmsSignViewMapper;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$J$a;", "update", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignVO;", "oldVO", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/partpayment/smssign/view/SmsSignVO;)Lru/ozon/app/android/partpayment/smssign/view/SmsSignVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class SmsSignViewMapper$updateConsumer$1 extends AbstractC7737t implements Function2<a.J.InterfaceC0007a, SmsSignVO, SmsSignVO> {
    public static final SmsSignViewMapper$updateConsumer$1 INSTANCE = new SmsSignViewMapper$updateConsumer$1();

    SmsSignViewMapper$updateConsumer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final SmsSignVO invoke(a.J.InterfaceC0007a update, SmsSignVO oldVO) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        if (update instanceof SmsSignViewMapper.TimerStateUpdate) {
            return SmsSignVO.copy$default(oldVO, null, 0, null, null, null, ((SmsSignViewMapper.TimerStateUpdate) update).getIsStarted(), null, null, 223, null);
        }
        if (update instanceof SmsSignViewMapper.PinUpdate) {
            return SmsSignVO.copy$default(oldVO, null, 0, null, null, null, false, ((SmsSignViewMapper.PinUpdate) update).getTypedPin(), null, 191, null);
        }
        return null;
    }
}
