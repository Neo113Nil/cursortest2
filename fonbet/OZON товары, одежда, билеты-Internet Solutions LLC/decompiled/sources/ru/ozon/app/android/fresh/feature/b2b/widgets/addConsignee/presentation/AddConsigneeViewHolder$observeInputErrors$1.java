package ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation;

import Sc.o;
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
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation.AddConsigneeViewModel;
import ru.ozon.uni.android.cell.text.TextFieldCellView;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "error", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$InputFieldError;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation.AddConsigneeViewHolder$observeInputErrors$1", f = "AddConsigneeViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AddConsigneeViewHolder$observeInputErrors$1 extends j implements Function2<AddConsigneeViewModel.InputFieldError, d<? super Unit>, Object> {
    final /* synthetic */ AddConsigneeVO.InputFieldErrors $kppFieldErrors;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddConsigneeViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddConsigneeViewHolder$observeInputErrors$1(AddConsigneeViewHolder addConsigneeViewHolder, AddConsigneeVO.InputFieldErrors inputFieldErrors, d<? super AddConsigneeViewHolder$observeInputErrors$1> dVar) {
        super(2, dVar);
        this.this$0 = addConsigneeViewHolder;
        this.$kppFieldErrors = inputFieldErrors;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AddConsigneeViewHolder$observeInputErrors$1 addConsigneeViewHolder$observeInputErrors$1 = new AddConsigneeViewHolder$observeInputErrors$1(this.this$0, this.$kppFieldErrors, dVar);
        addConsigneeViewHolder$observeInputErrors$1.L$0 = obj;
        return addConsigneeViewHolder$observeInputErrors$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WidgetAddConsigneeBinding widgetAddConsigneeBinding;
        WidgetAddConsigneeBinding widgetAddConsigneeBinding2;
        WidgetAddConsigneeBinding widgetAddConsigneeBinding3;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        AddConsigneeViewModel.InputFieldError inputFieldError = (AddConsigneeViewModel.InputFieldError) this.L$0;
        if (Intrinsics.d(inputFieldError, AddConsigneeViewModel.InputFieldError.EmptyFieldError.INSTANCE)) {
            AddConsigneeViewHolder addConsigneeViewHolder = this.this$0;
            widgetAddConsigneeBinding3 = addConsigneeViewHolder.binding;
            TextFieldCellView kppInput = widgetAddConsigneeBinding3.kppInput;
            Intrinsics.checkNotNullExpressionValue(kppInput, "kppInput");
            addConsigneeViewHolder.showError(kppInput, this.$kppFieldErrors.getEmptyFieldError());
        } else {
            if (Intrinsics.d(inputFieldError, AddConsigneeViewModel.InputFieldError.IncorrectFieldError.INSTANCE)) {
                AddConsigneeViewHolder addConsigneeViewHolder2 = this.this$0;
                widgetAddConsigneeBinding2 = addConsigneeViewHolder2.binding;
                TextFieldCellView kppInput2 = widgetAddConsigneeBinding2.kppInput;
                Intrinsics.checkNotNullExpressionValue(kppInput2, "kppInput");
                String incorrectFieldError = this.$kppFieldErrors.getIncorrectFieldError();
                addConsigneeViewHolder2.showError(kppInput2, incorrectFieldError != null ? incorrectFieldError : "");
            } else if (Intrinsics.d(inputFieldError, AddConsigneeViewModel.InputFieldError.AnotherFieldError.INSTANCE)) {
                AddConsigneeViewHolder addConsigneeViewHolder3 = this.this$0;
                widgetAddConsigneeBinding = addConsigneeViewHolder3.binding;
                TextFieldCellView kppInput3 = widgetAddConsigneeBinding.kppInput;
                Intrinsics.checkNotNullExpressionValue(kppInput3, "kppInput");
                String anotherFieldError = this.$kppFieldErrors.getAnotherFieldError();
                addConsigneeViewHolder3.showError(kppInput3, anotherFieldError != null ? anotherFieldError : "");
            } else if (!Intrinsics.d(inputFieldError, AddConsigneeViewModel.InputFieldError.None.INSTANCE)) {
                throw new o();
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AddConsigneeViewModel.InputFieldError inputFieldError, d<? super Unit> dVar) {
        return ((AddConsigneeViewHolder$observeInputErrors$1) create(inputFieldError, dVar)).invokeSuspend(Unit.f71690a);
    }
}
