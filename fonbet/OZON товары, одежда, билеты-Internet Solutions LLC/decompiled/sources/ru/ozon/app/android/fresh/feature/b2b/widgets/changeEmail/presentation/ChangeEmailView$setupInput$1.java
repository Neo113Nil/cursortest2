package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "otpValue", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ChangeEmailView$setupInput$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ Function1<String, Unit> $onOtpCompleted;
    final /* synthetic */ ChangeEmailView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChangeEmailView$setupInput$1(ChangeEmailView changeEmailView, Function1<? super String, Unit> function1) {
        super(1);
        this.this$0 = changeEmailView;
        this.$onOtpCompleted = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String otpValue) {
        Intrinsics.checkNotNullParameter(otpValue, "otpValue");
        this.this$0.clearError();
        this.$onOtpCompleted.invoke(otpValue);
    }
}
