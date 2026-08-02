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

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "branch", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation.AddConsigneeViewHolder$observeChangeBranchName$1", f = "AddConsigneeViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AddConsigneeViewHolder$observeChangeBranchName$1 extends j implements Function2<String, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddConsigneeViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddConsigneeViewHolder$observeChangeBranchName$1(AddConsigneeViewHolder addConsigneeViewHolder, d<? super AddConsigneeViewHolder$observeChangeBranchName$1> dVar) {
        super(2, dVar);
        this.this$0 = addConsigneeViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AddConsigneeViewHolder$observeChangeBranchName$1 addConsigneeViewHolder$observeChangeBranchName$1 = new AddConsigneeViewHolder$observeChangeBranchName$1(this.this$0, dVar);
        addConsigneeViewHolder$observeChangeBranchName$1.L$0 = obj;
        return addConsigneeViewHolder$observeChangeBranchName$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AddConsigneeVO.AdditionalFields additionalFields;
        AddConsigneeVO.InputField branchNameField;
        AddConsigneeVO.InputField copy$default;
        WidgetAddConsigneeBinding widgetAddConsigneeBinding;
        String inputText;
        WidgetAddConsigneeBinding widgetAddConsigneeBinding2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        String str = (String) this.L$0;
        AddConsigneeVO boundData = this.this$0.getBoundData();
        if (boundData != null && (additionalFields = boundData.getAdditionalFields()) != null && (branchNameField = additionalFields.getBranchNameField()) != null && (copy$default = AddConsigneeVO.InputField.copy$default(branchNameField, null, str, null, null, false, null, 61, null)) != null) {
            AddConsigneeViewHolder addConsigneeViewHolder = this.this$0;
            widgetAddConsigneeBinding = addConsigneeViewHolder.binding;
            TextFieldCellView branchNameInput = widgetAddConsigneeBinding.branchNameInput;
            Intrinsics.checkNotNullExpressionValue(branchNameInput, "branchNameInput");
            inputText = addConsigneeViewHolder.getInputText(branchNameInput);
            if (inputText.length() == 0) {
                widgetAddConsigneeBinding2 = addConsigneeViewHolder.binding;
                TextFieldCellView branchNameInput2 = widgetAddConsigneeBinding2.branchNameInput;
                Intrinsics.checkNotNullExpressionValue(branchNameInput2, "branchNameInput");
                addConsigneeViewHolder.bindInputField(branchNameInput2, copy$default);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, d<? super Unit> dVar) {
        return ((AddConsigneeViewHolder$observeChangeBranchName$1) create(str, dVar)).invokeSuspend(Unit.f71690a);
    }
}
