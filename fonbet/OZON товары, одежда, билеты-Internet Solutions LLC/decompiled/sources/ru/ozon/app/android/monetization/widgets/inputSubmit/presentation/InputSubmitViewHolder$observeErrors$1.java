package ru.ozon.app.android.monetization.widgets.inputSubmit.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.monetization.widgets.inputSubmit.presentation.InputSubmitVO;
import ru.ozon.app.android.monetization.widgets.inputSubmit.presentation.InputSubmitViewModel;
import ru.ozon.app.android.pdp.ui.configurators.NotificationsKt;
import ru.ozon.app.android.uikit.utils.NotificationBarHelperKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "error", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$Error;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.monetization.widgets.inputSubmit.presentation.InputSubmitViewHolder$observeErrors$1", f = "InputSubmitViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class InputSubmitViewHolder$observeErrors$1 extends j implements Function2<InputSubmitViewModel.Error, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InputSubmitViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InputSubmitViewHolder$observeErrors$1(InputSubmitViewHolder inputSubmitViewHolder, d<? super InputSubmitViewHolder$observeErrors$1> dVar) {
        super(2, dVar);
        this.this$0 = inputSubmitViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        InputSubmitViewHolder$observeErrors$1 inputSubmitViewHolder$observeErrors$1 = new InputSubmitViewHolder$observeErrors$1(this.this$0, dVar);
        inputSubmitViewHolder$observeErrors$1.L$0 = obj;
        return inputSubmitViewHolder$observeErrors$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InputSubmitVO boundData;
        InputSubmitVO.TextArea textArea;
        String errorRequiredText;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        InputSubmitViewModel.Error error = (InputSubmitViewModel.Error) this.L$0;
        if (error instanceof InputSubmitViewModel.Error.InputFieldError) {
            this.this$0.inputSubmitView.showError(((InputSubmitViewModel.Error.InputFieldError) error).getErrorMessage());
        } else if (error instanceof InputSubmitViewModel.Error.ResponseFailed) {
            this.this$0.showErrorNotification(((InputSubmitViewModel.Error.ResponseFailed) error).getIsNetworkError() ? NotificationBarHelperKt.createNetworkErrorNotificationDTO$default(false, 1, null) : NotificationsKt.createUnknownErrorNotification());
        } else if ((error instanceof InputSubmitViewModel.Error.TextRequiredError) && (boundData = this.this$0.getBoundData()) != null && (textArea = boundData.getTextArea()) != null && (errorRequiredText = textArea.getErrorRequiredText()) != null) {
            this.this$0.inputSubmitView.showError(errorRequiredText);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InputSubmitViewModel.Error error, d<? super Unit> dVar) {
        return ((InputSubmitViewHolder$observeErrors$1) create(error, dVar)).invokeSuspend(Unit.f71690a);
    }
}
