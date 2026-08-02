package ru.ozon.app.android.monetization.widgets.inputSubmit.presentation;

import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.monetization.widgets.inputSubmit.presentation.InputSubmitViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$ScreenState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.monetization.widgets.inputSubmit.presentation.InputSubmitViewHolder$observeScreenState$1", f = "InputSubmitViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class InputSubmitViewHolder$observeScreenState$1 extends j implements Function2<InputSubmitViewModel.ScreenState, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InputSubmitViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InputSubmitViewHolder$observeScreenState$1(InputSubmitViewHolder inputSubmitViewHolder, d<? super InputSubmitViewHolder$observeScreenState$1> dVar) {
        super(2, dVar);
        this.this$0 = inputSubmitViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        InputSubmitViewHolder$observeScreenState$1 inputSubmitViewHolder$observeScreenState$1 = new InputSubmitViewHolder$observeScreenState$1(this.this$0, dVar);
        inputSubmitViewHolder$observeScreenState$1.L$0 = obj;
        return inputSubmitViewHolder$observeScreenState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        Function1 function12;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        InputSubmitViewModel.ScreenState screenState = (InputSubmitViewModel.ScreenState) this.L$0;
        if (!Intrinsics.d(screenState, InputSubmitViewModel.ScreenState.Idle.INSTANCE)) {
            if (screenState instanceof InputSubmitViewModel.ScreenState.SuccessWithNotification) {
                this.this$0.inputSubmitView.clearFocus();
                InputSubmitViewModel.ScreenState.SuccessWithNotification successWithNotification = (InputSubmitViewModel.ScreenState.SuccessWithNotification) screenState;
                this.this$0.showSuccessNotification(successWithNotification.getNotification());
                function12 = this.this$0.actionHandler;
                function12.invoke(successWithNotification.getSuccessAction());
            } else {
                if (!(screenState instanceof InputSubmitViewModel.ScreenState.SuccessWithRefreshRequests)) {
                    throw new o();
                }
                this.this$0.inputSubmitView.clearFocus();
                InputSubmitViewModel.ScreenState.SuccessWithRefreshRequests successWithRefreshRequests = (InputSubmitViewModel.ScreenState.SuccessWithRefreshRequests) screenState;
                this.this$0.refreshPages(successWithRefreshRequests.getRefreshRequests());
                function1 = this.this$0.actionHandler;
                function1.invoke(successWithRefreshRequests.getSuccessAction());
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InputSubmitViewModel.ScreenState screenState, d<? super Unit> dVar) {
        return ((InputSubmitViewHolder$observeScreenState$1) create(screenState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
