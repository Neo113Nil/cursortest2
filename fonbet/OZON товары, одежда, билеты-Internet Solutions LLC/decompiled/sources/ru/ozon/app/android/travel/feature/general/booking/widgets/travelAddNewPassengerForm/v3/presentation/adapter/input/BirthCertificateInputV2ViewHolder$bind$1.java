package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.adapter.input;

import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "inputId", "", "oldValue", "", "newValue", "", "shouldInvokeAction", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class BirthCertificateInputV2ViewHolder$bind$1 extends AbstractC7737t implements InterfaceC6512o<Integer, String, CharSequence, Boolean, Unit> {
    final /* synthetic */ BirthCertificateInputV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BirthCertificateInputV2ViewHolder$bind$1(BirthCertificateInputV2ViewHolder birthCertificateInputV2ViewHolder) {
        super(4);
        this.this$0 = birthCertificateInputV2ViewHolder;
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str, CharSequence charSequence, Boolean bool) {
        invoke(num.intValue(), str, charSequence, bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11, String oldValue, CharSequence charSequence, boolean z11) {
        InterfaceC6512o interfaceC6512o;
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        interfaceC6512o = this.this$0.onTextInputChanged;
        if (interfaceC6512o != null) {
            interfaceC6512o.invoke(Integer.valueOf(i11), oldValue, charSequence, Boolean.valueOf(z11));
        }
    }
}
