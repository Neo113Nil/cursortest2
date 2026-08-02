package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.adapter.input;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "inputId", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class BirthCertificateInputV2ViewHolder$bind$2 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ BirthCertificateInputV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BirthCertificateInputV2ViewHolder$bind$2(BirthCertificateInputV2ViewHolder birthCertificateInputV2ViewHolder) {
        super(1);
        this.this$0 = birthCertificateInputV2ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        Function1 function1;
        function1 = this.this$0.onSelectorClicked;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i11));
        }
    }
}
