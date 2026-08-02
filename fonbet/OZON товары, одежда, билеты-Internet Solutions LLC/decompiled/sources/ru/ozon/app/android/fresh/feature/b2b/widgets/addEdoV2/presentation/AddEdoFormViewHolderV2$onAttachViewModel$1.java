package ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation;

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
import kotlin.text.h;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetAddEdoV2FormBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoViewModelV2;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$SingleEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoFormViewHolderV2$onAttachViewModel$1", f = "AddEdoFormViewHolderV2.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AddEdoFormViewHolderV2$onAttachViewModel$1 extends j implements Function2<AddEdoViewModelV2.SingleEvent, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddEdoFormViewHolderV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddEdoFormViewHolderV2$onAttachViewModel$1(AddEdoFormViewHolderV2 addEdoFormViewHolderV2, d<? super AddEdoFormViewHolderV2$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = addEdoFormViewHolderV2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AddEdoFormViewHolderV2$onAttachViewModel$1 addEdoFormViewHolderV2$onAttachViewModel$1 = new AddEdoFormViewHolderV2$onAttachViewModel$1(this.this$0, dVar);
        addEdoFormViewHolderV2$onAttachViewModel$1.L$0 = obj;
        return addEdoFormViewHolderV2$onAttachViewModel$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WidgetAddEdoV2FormBinding widgetAddEdoV2FormBinding;
        WidgetAddEdoV2FormBinding widgetAddEdoV2FormBinding2;
        AddEdoViewModelV2 addEdoViewModelV2;
        WidgetAddEdoV2FormBinding widgetAddEdoV2FormBinding3;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        AddEdoViewModelV2.SingleEvent singleEvent = (AddEdoViewModelV2.SingleEvent) this.L$0;
        if (Intrinsics.d(singleEvent, AddEdoViewModelV2.SingleEvent.SuccessRefresh.INSTANCE)) {
            this.this$0.successGoBackRefresh();
        } else if (singleEvent instanceof AddEdoViewModelV2.SingleEvent.GetInputAfterButtonClick) {
            widgetAddEdoV2FormBinding = this.this$0.binding;
            String valueOf = String.valueOf(widgetAddEdoV2FormBinding.addEdoTextFieldCellView.getInputText());
            widgetAddEdoV2FormBinding2 = this.this$0.binding;
            widgetAddEdoV2FormBinding2.addEdoTextFieldCellView.setInputState(OzonTextInputLayoutModel.State.DEFAULT);
            if (h.K(valueOf)) {
                AddEdoFormViewHolderV2 addEdoFormViewHolderV2 = this.this$0;
                widgetAddEdoV2FormBinding3 = addEdoFormViewHolderV2.binding;
                TextFieldCellView addEdoTextFieldCellView = widgetAddEdoV2FormBinding3.addEdoTextFieldCellView;
                Intrinsics.checkNotNullExpressionValue(addEdoTextFieldCellView, "addEdoTextFieldCellView");
                addEdoFormViewHolderV2.showError(addEdoTextFieldCellView);
            } else {
                addEdoViewModelV2 = this.this$0.viewModel;
                AddEdoViewModelV2.SingleEvent.GetInputAfterButtonClick getInputAfterButtonClick = (AddEdoViewModelV2.SingleEvent.GetInputAfterButtonClick) singleEvent;
                addEdoViewModelV2.onViewIntent(new AddEdoViewModelV2.ViewIntent.AddEdo(getInputAfterButtonClick.getActionName(), getInputAfterButtonClick.getClientId(), valueOf));
            }
        } else if (singleEvent instanceof AddEdoViewModelV2.SingleEvent.SuccessRedirect) {
            this.this$0.references.getNavigator().popBackStack();
            ComposerExtKt.sendRefreshToTargetFragment$default(this.this$0.references.getContainer(), null, null, null, null, 15, null);
            this.this$0.openNestedPage(((AddEdoViewModelV2.SingleEvent.SuccessRedirect) singleEvent).getDeeplink());
        } else if (singleEvent instanceof AddEdoViewModelV2.SingleEvent.ShowError) {
            this.this$0.showErrorMessage(((AddEdoViewModelV2.SingleEvent.ShowError) singleEvent).getErrorMessage());
        } else if (!Intrinsics.d(singleEvent, AddEdoViewModelV2.SingleEvent.ShowLoader.INSTANCE)) {
            throw new o();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AddEdoViewModelV2.SingleEvent singleEvent, d<? super Unit> dVar) {
        return ((AddEdoFormViewHolderV2$onAttachViewModel$1) create(singleEvent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
