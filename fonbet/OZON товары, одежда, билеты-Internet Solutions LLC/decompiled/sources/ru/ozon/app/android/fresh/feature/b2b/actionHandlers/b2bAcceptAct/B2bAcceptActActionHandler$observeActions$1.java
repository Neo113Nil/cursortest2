package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct;

import An.C2439a;
import Sc.o;
import Sc.s;
import Wc.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct.B2bAcceptActViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/B2bAcceptActViewModel$ScreenState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct.B2bAcceptActActionHandler$observeActions$1", f = "B2bAcceptActActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class B2bAcceptActActionHandler$observeActions$1 extends j implements Function2<B2bAcceptActViewModel.ScreenState, d<? super Unit>, Object> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ B2bAcceptActViewModel $viewModel;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ B2bAcceptActActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bAcceptActActionHandler$observeActions$1(CustomActionHandler.HandlerReferences handlerReferences, B2bAcceptActActionHandler b2bAcceptActActionHandler, B2bAcceptActViewModel b2bAcceptActViewModel, d<? super B2bAcceptActActionHandler$observeActions$1> dVar) {
        super(2, dVar);
        this.$handlerRefs = handlerReferences;
        this.this$0 = b2bAcceptActActionHandler;
        this.$viewModel = b2bAcceptActViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        B2bAcceptActActionHandler$observeActions$1 b2bAcceptActActionHandler$observeActions$1 = new B2bAcceptActActionHandler$observeActions$1(this.$handlerRefs, this.this$0, this.$viewModel, dVar);
        b2bAcceptActActionHandler$observeActions$1.L$0 = obj;
        return b2bAcceptActActionHandler$observeActions$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        B2bAcceptActViewModel.ScreenState screenState = (B2bAcceptActViewModel.ScreenState) this.L$0;
        if (Intrinsics.d(screenState, B2bAcceptActViewModel.ScreenState.Idle.INSTANCE)) {
            this.$handlerRefs.getRefs().getController().hideLoader();
        } else if (Intrinsics.d(screenState, B2bAcceptActViewModel.ScreenState.Loading.INSTANCE)) {
            C2439a.b(0L, null, 3, this.$handlerRefs.getRefs().getController());
        } else if (Intrinsics.d(screenState, B2bAcceptActViewModel.ScreenState.Error.INSTANCE)) {
            this.$handlerRefs.getRefs().getController().hideLoader();
            this.this$0.showError(this.$handlerRefs);
            this.$viewModel.discardScreenState();
            this.this$0.releaseStateListenerJob();
        } else {
            if (!(screenState instanceof B2bAcceptActViewModel.ScreenState.Success)) {
                throw new o();
            }
            this.$handlerRefs.getRefs().getController().hideLoader();
            this.$viewModel.discardScreenState();
            this.this$0.releaseStateListenerJob();
            B2bAcceptActViewModel.ScreenState.Success success = (B2bAcceptActViewModel.ScreenState.Success) screenState;
            String successMessage = success.getParams().getSuccessMessage();
            if (successMessage != null && successMessage.length() != 0) {
                this.this$0.showSuccess(successMessage, this.$handlerRefs);
            }
            if (success.getParams().getShouldPopToRoot()) {
                ComponentCallbacksC5392m b11 = Sh.a.b(this.$handlerRefs);
                if (b11 != null) {
                    b11.getParentFragmentManager().m1(androidx.core.os.d.b(new Pair("b2b_accept_act_key_refresh_flag", Boolean.TRUE)), "b2b_accept_act_request_key_refresh");
                }
                this.$handlerRefs.getRefs().getNavigator().popBackStack();
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(B2bAcceptActViewModel.ScreenState screenState, d<? super Unit> dVar) {
        return ((B2bAcceptActActionHandler$observeActions$1) create(screenState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
