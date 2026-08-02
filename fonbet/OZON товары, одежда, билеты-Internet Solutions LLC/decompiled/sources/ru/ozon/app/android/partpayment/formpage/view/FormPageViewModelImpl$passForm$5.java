package ru.ozon.app.android.partpayment.formpage.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;
import ru.ozon.app.android.partpayment.formpage.view.vo.PassFormVO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/partpayment/formpage/view/vo/PassFormVO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/partpayment/formpage/view/vo/PassFormVO;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class FormPageViewModelImpl$passForm$5 extends AbstractC7737t implements Function1<PassFormVO, Unit> {
    final /* synthetic */ FormPageVO.Field.ValidateButton $field;
    final /* synthetic */ FormPageViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FormPageViewModelImpl$passForm$5(FormPageViewModelImpl formPageViewModelImpl, FormPageVO.Field.ValidateButton validateButton) {
        super(1);
        this.this$0 = formPageViewModelImpl;
        this.$field = validateButton;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PassFormVO passFormVO) {
        invoke2(passFormVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PassFormVO passFormVO) {
        FormPageViewModelImpl formPageViewModelImpl = this.this$0;
        Intrinsics.f(passFormVO);
        FormPageViewModelImpl.processPassFormResult$default(formPageViewModelImpl, passFormVO, this.$field.getReturnBack(), null, 4, null);
    }
}
