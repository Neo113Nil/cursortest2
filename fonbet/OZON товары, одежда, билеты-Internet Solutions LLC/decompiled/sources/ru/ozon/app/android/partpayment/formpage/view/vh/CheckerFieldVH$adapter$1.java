package ru.ozon.app.android.partpayment.formpage.view.vh;

import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "option", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Checker;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CheckerFieldVH$adapter$1 extends AbstractC7737t implements Function1<FormPageVO.Field.Options.Checker, Unit> {
    final /* synthetic */ Function1<String, Unit> $onNewPaymentMethodSelected;
    final /* synthetic */ CheckerFieldVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CheckerFieldVH$adapter$1(CheckerFieldVH checkerFieldVH, Function1<? super String, Unit> function1) {
        super(1);
        this.this$0 = checkerFieldVH;
        this.$onNewPaymentMethodSelected = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FormPageVO.Field.Options.Checker checker) {
        invoke2(checker);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FormPageVO.Field.Options.Checker option) {
        InterfaceC6511n interfaceC6511n;
        Intrinsics.checkNotNullParameter(option, "option");
        String deeplink = option.getDeeplink();
        if (deeplink != null) {
            this.$onNewPaymentMethodSelected.invoke(deeplink);
            return;
        }
        FormPageVO.Field field = this.this$0.getField();
        if (field != null) {
            CheckerFieldVH checkerFieldVH = this.this$0;
            interfaceC6511n = checkerFieldVH.onFieldsChanged;
            interfaceC6511n.invoke(checkerFieldVH, new FormPageVO.Field.Hidden(field.getName(), option.getValue(), option.getDisplayValue(), null, 8, null), Boolean.TRUE);
        }
    }
}
