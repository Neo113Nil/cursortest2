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
import ru.ozon.uni.android.cell.text.TextFieldCellView;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "hasError", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation.AddConsigneeViewHolder$observeInputErrors$4", f = "AddConsigneeViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AddConsigneeViewHolder$observeInputErrors$4 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    final /* synthetic */ AddConsigneeVO.AdditionalFields $additionalFields;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ AddConsigneeViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddConsigneeViewHolder$observeInputErrors$4(AddConsigneeViewHolder addConsigneeViewHolder, AddConsigneeVO.AdditionalFields additionalFields, d<? super AddConsigneeViewHolder$observeInputErrors$4> dVar) {
        super(2, dVar);
        this.this$0 = addConsigneeViewHolder;
        this.$additionalFields = additionalFields;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AddConsigneeViewHolder$observeInputErrors$4 addConsigneeViewHolder$observeInputErrors$4 = new AddConsigneeViewHolder$observeInputErrors$4(this.this$0, this.$additionalFields, dVar);
        addConsigneeViewHolder$observeInputErrors$4.Z$0 = ((Boolean) obj).booleanValue();
        return addConsigneeViewHolder$observeInputErrors$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WidgetAddConsigneeBinding widgetAddConsigneeBinding;
        String str;
        AddConsigneeVO.InputField addressField;
        AddConsigneeVO.InputFieldErrors inputFieldErrors;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (this.Z$0) {
            AddConsigneeViewHolder addConsigneeViewHolder = this.this$0;
            widgetAddConsigneeBinding = addConsigneeViewHolder.binding;
            TextFieldCellView addressInput = widgetAddConsigneeBinding.addressInput;
            Intrinsics.checkNotNullExpressionValue(addressInput, "addressInput");
            AddConsigneeVO.AdditionalFields additionalFields = this.$additionalFields;
            if (additionalFields == null || (addressField = additionalFields.getAddressField()) == null || (inputFieldErrors = addressField.getInputFieldErrors()) == null || (str = inputFieldErrors.getEmptyFieldError()) == null) {
                str = "";
            }
            addConsigneeViewHolder.showError(addressInput, str);
        }
        return Unit.f71690a;
    }

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        return ((AddConsigneeViewHolder$observeInputErrors$4) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
    }
}
