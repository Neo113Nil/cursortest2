package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.adapter.input;

import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "inputId", "", "oldValue", "", "inputValue", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TextInputV2ViewHolder$bind$4 extends AbstractC7737t implements InterfaceC6511n<Integer, String, CharSequence, Unit> {
    final /* synthetic */ TextInputV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextInputV2ViewHolder$bind$4(TextInputV2ViewHolder textInputV2ViewHolder) {
        super(3);
        this.this$0 = textInputV2ViewHolder;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str, CharSequence charSequence) {
        invoke(num.intValue(), str, charSequence);
        return Unit.f71690a;
    }

    public final void invoke(int i11, String oldValue, CharSequence charSequence) {
        InterfaceC6511n interfaceC6511n;
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        interfaceC6511n = this.this$0.onTextInputFocusLost;
        if (interfaceC6511n != null) {
            interfaceC6511n.invoke(Integer.valueOf(i11), oldValue, charSequence);
        }
    }
}
