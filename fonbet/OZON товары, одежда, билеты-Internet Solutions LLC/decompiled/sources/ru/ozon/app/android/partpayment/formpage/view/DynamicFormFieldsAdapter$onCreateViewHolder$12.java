package ru.ozon.app.android.partpayment.formpage.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "deeplink", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DynamicFormFieldsAdapter$onCreateViewHolder$12 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ DynamicFormFieldsAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DynamicFormFieldsAdapter$onCreateViewHolder$12(DynamicFormFieldsAdapter dynamicFormFieldsAdapter) {
        super(1);
        this.this$0 = dynamicFormFieldsAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Function1<String, Unit> onNewPaymentMethodSelected = this.this$0.getOnNewPaymentMethodSelected();
        if (onNewPaymentMethodSelected != null) {
            onNewPaymentMethodSelected.invoke(deeplink);
        }
    }
}
