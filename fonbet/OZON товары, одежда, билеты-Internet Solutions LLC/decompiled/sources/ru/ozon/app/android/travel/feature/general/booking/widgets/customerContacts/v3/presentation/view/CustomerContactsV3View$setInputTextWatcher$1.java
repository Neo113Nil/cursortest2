package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation.view;

import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newValue", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class CustomerContactsV3View$setInputTextWatcher$1 extends AbstractC7737t implements Function1<CharSequence, Unit> {
    final /* synthetic */ InterfaceC6511n<Integer, String, CharSequence, Unit> $onTextInputChanged;
    final /* synthetic */ CustomerContactsV3View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CustomerContactsV3View$setInputTextWatcher$1(CustomerContactsV3View customerContactsV3View, InterfaceC6511n<? super Integer, ? super String, ? super CharSequence, Unit> interfaceC6511n) {
        super(1);
        this.this$0 = customerContactsV3View;
        this.$onTextInputChanged = interfaceC6511n;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CharSequence charSequence) {
        CommonInputV2VO.TextInputV2 textInputV2 = this.this$0.cashedPhoneNumberVO;
        if (textInputV2 == null) {
            return;
        }
        this.$onTextInputChanged.invoke(Integer.valueOf(textInputV2.getId()), textInputV2.getValue(), charSequence);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
        invoke2(charSequence);
        return Unit.f71690a;
    }
}
