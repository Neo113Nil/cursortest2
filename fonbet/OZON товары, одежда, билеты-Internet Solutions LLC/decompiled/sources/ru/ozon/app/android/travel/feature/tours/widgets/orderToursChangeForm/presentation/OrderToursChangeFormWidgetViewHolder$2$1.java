package ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.presentation;

import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonTextInputView;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OrderToursChangeFormWidgetViewHolder$2$1 extends AbstractC7737t implements Function1<CharSequence, Unit> {
    final /* synthetic */ CommonTextInputView $this_apply;
    final /* synthetic */ OrderToursChangeFormWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderToursChangeFormWidgetViewHolder$2$1(OrderToursChangeFormWidgetViewHolder orderToursChangeFormWidgetViewHolder, CommonTextInputView commonTextInputView) {
        super(1);
        this.this$0 = orderToursChangeFormWidgetViewHolder;
        this.$this_apply = commonTextInputView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
        invoke2(charSequence);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CharSequence charSequence) {
        OrderToursChangeFormViewModel orderToursChangeFormViewModel;
        int i11;
        String textCounter;
        orderToursChangeFormViewModel = this.this$0.viewModel;
        orderToursChangeFormViewModel.updateMessage(String.valueOf(charSequence));
        AppCompatTextView appCompatTextView = this.$this_apply.getBinding().commonInputTextInputErrorTv;
        OrderToursChangeFormWidgetViewHolder orderToursChangeFormWidgetViewHolder = this.this$0;
        int length = charSequence != null ? charSequence.length() : 0;
        i11 = this.this$0.maxTextLength;
        textCounter = orderToursChangeFormWidgetViewHolder.setTextCounter(length, i11);
        appCompatTextView.setText(textCounter);
    }
}
