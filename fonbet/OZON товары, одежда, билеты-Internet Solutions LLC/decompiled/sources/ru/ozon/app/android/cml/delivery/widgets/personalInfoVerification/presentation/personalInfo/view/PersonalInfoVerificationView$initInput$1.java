package ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.personalInfo.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "text", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class PersonalInfoVerificationView$initInput$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ String $inputType;
    final /* synthetic */ PersonalInfoVerificationView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalInfoVerificationView$initInput$1(PersonalInfoVerificationView personalInfoVerificationView, String str) {
        super(1);
        this.this$0 = personalInfoVerificationView;
        this.$inputType = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        Function2<String, String, Unit> onInputValueChange = this.this$0.getOnInputValueChange();
        if (onInputValueChange != null) {
            onInputValueChange.invoke(this.$inputType, text);
        }
    }
}
