package ru.ozon.app.android.partpayment.landing.limit.view;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.partpayment.landing.limit.view.FormPageLandingLimitUiViewMapper;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$J$a;", "update", "Lru/ozon/app/android/partpayment/landing/limit/view/FormPageLandingLimitVO;", "oldVO", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/partpayment/landing/limit/view/FormPageLandingLimitVO;)Lru/ozon/app/android/partpayment/landing/limit/view/FormPageLandingLimitVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class FormPageLandingLimitUiViewMapper$updateConsumer$1 extends AbstractC7737t implements Function2<a.J.InterfaceC0007a, FormPageLandingLimitVO, FormPageLandingLimitVO> {
    public static final FormPageLandingLimitUiViewMapper$updateConsumer$1 INSTANCE = new FormPageLandingLimitUiViewMapper$updateConsumer$1();

    FormPageLandingLimitUiViewMapper$updateConsumer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final FormPageLandingLimitVO invoke(a.J.InterfaceC0007a update, FormPageLandingLimitVO oldVO) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        return FormPageLandingLimitVO.copy$default(oldVO, null, null, ((FormPageLandingLimitUiViewMapper.FormPageLandingLimitUpdate) update).getLimitText(), null, null, null, null, null, 251, null);
    }
}
