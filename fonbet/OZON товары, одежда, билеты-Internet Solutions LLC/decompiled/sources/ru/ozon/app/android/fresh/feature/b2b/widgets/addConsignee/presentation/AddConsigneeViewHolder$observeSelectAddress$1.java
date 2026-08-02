package ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetAddConsigneeBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation.AddConsigneeVO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.android.cell.text.TextFieldCellView;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", FormPageDTO.Field.FIELD_TYPE_ADDRESS, ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation.AddConsigneeViewHolder$observeSelectAddress$1", f = "AddConsigneeViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AddConsigneeViewHolder$observeSelectAddress$1 extends j implements Function2<String, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddConsigneeViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddConsigneeViewHolder$observeSelectAddress$1(AddConsigneeViewHolder addConsigneeViewHolder, d<? super AddConsigneeViewHolder$observeSelectAddress$1> dVar) {
        super(2, dVar);
        this.this$0 = addConsigneeViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AddConsigneeViewHolder$observeSelectAddress$1 addConsigneeViewHolder$observeSelectAddress$1 = new AddConsigneeViewHolder$observeSelectAddress$1(this.this$0, dVar);
        addConsigneeViewHolder$observeSelectAddress$1.L$0 = obj;
        return addConsigneeViewHolder$observeSelectAddress$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WidgetAddConsigneeBinding widgetAddConsigneeBinding;
        AddConsigneeVO.AdditionalFields additionalFields;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        String str = (String) this.L$0;
        AddConsigneeVO boundData = this.this$0.getBoundData();
        AddConsigneeVO.InputField addressField = (boundData == null || (additionalFields = boundData.getAdditionalFields()) == null) ? null : additionalFields.getAddressField();
        if (str != null && addressField != null) {
            widgetAddConsigneeBinding = this.this$0.binding;
            TextFieldCellView textFieldCellView = widgetAddConsigneeBinding.addressInput;
            AddConsigneeViewHolder addConsigneeViewHolder = this.this$0;
            Intrinsics.f(textFieldCellView);
            addConsigneeViewHolder.bindInputField(textFieldCellView, AddConsigneeVO.InputField.copy$default(addressField, null, str, null, null, false, null, 61, null));
            textFieldCellView.setTruncateOnLostFocus(true);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, d<? super Unit> dVar) {
        return ((AddConsigneeViewHolder$observeSelectAddress$1) create(str, dVar)).invokeSuspend(Unit.f71690a);
    }
}
