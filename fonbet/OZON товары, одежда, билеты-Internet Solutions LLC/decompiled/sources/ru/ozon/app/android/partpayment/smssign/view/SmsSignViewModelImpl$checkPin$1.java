package ru.ozon.app.android.partpayment.smssign.view;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.app.android.partpayment.formpage.view.vo.VerifySmsVO;
import ru.ozon.app.android.partpayment.smssign.view.SmsSignViewModel;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lru/ozon/app/android/partpayment/formpage/view/vo/VerifySmsVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SmsSignViewModelImpl$checkPin$1 extends AbstractC7737t implements Function1<VerifySmsVO, Unit> {
    final /* synthetic */ SmsSignViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SmsSignViewModelImpl$checkPin$1(SmsSignViewModelImpl smsSignViewModelImpl) {
        super(1);
        this.this$0 = smsSignViewModelImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(VerifySmsVO verifySmsVO) {
        invoke2(verifySmsVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(VerifySmsVO result) {
        String deeplink;
        Intrinsics.checkNotNullParameter(result, "result");
        Map<String, String> fields = result.getFields();
        if ((fields != null && fields.containsKey("code")) || (deeplink = result.getDeeplink()) == null || h.K(deeplink)) {
            this.this$0.getAction().setValue(SmsSignViewModel.Action.WrongPin.INSTANCE);
        } else {
            this.this$0.getNoUiAction().setValue(new SmsSignViewModel.NoUiAction.PinSuccess(result.getDeeplink(), result.getIsCompleted()));
        }
    }
}
