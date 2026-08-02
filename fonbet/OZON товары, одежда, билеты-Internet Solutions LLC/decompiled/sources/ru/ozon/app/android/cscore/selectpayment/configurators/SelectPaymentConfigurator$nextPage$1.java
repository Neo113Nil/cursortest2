package ru.ozon.app.android.cscore.selectpayment.configurators;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cscore.buttonv2.viewmodel.ActionButtonViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/content/Intent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SelectPaymentConfigurator$nextPage$1 extends AbstractC7737t implements Function1<Intent, Unit> {
    final /* synthetic */ ActionButtonViewModel.Action $action;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectPaymentConfigurator$nextPage$1(ActionButtonViewModel.Action action) {
        super(1);
        this.$action = action;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
        invoke2(intent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Intent setResultWithTargetRequestCode) {
        Intrinsics.checkNotNullParameter(setResultWithTargetRequestCode, "$this$setResultWithTargetRequestCode");
        setResultWithTargetRequestCode.putExtra("key_message", this.$action.getMessage());
    }
}
