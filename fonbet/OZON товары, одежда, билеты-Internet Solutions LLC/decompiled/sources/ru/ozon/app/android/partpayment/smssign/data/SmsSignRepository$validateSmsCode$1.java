package ru.ozon.app.android.partpayment.smssign.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.partpayment.formpage.data.validation.VerifySmsDTO;
import ru.ozon.app.android.partpayment.formpage.view.FormPageViewMapperKt;
import ru.ozon.app.android.partpayment.formpage.view.vo.VerifySmsVO;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/partpayment/formpage/view/vo/VerifySmsVO;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/partpayment/formpage/data/validation/VerifySmsDTO;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/partpayment/formpage/data/validation/VerifySmsDTO;)Lru/ozon/app/android/partpayment/formpage/view/vo/VerifySmsVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SmsSignRepository$validateSmsCode$1 extends AbstractC7737t implements Function1<VerifySmsDTO, VerifySmsVO> {
    public static final SmsSignRepository$validateSmsCode$1 INSTANCE = new SmsSignRepository$validateSmsCode$1();

    SmsSignRepository$validateSmsCode$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final VerifySmsVO invoke(VerifySmsDTO it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FormPageViewMapperKt.toVO(it);
    }
}
