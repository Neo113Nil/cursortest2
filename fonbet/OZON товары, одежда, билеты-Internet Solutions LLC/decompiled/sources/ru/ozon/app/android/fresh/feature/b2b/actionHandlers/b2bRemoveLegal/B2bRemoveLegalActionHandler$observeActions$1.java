package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal;

import Sc.o;
import Sc.s;
import Wc.a;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.B2bRemoveLegalViewModel;
import ru.ozon.app.android.navigation.newrouter.destinations.tabs.switchs.ClearToRootTabDestination;
import ru.ozon.app.android.tabbar.domain.TabConfigUpdateDelegate;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/B2bRemoveLegalViewModel$ScreenState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.B2bRemoveLegalActionHandler$observeActions$1", f = "B2bRemoveLegalActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class B2bRemoveLegalActionHandler$observeActions$1 extends j implements Function2<B2bRemoveLegalViewModel.ScreenState, d<? super Unit>, Object> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ B2bRemoveLegalViewModel $viewModel;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ B2bRemoveLegalActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bRemoveLegalActionHandler$observeActions$1(CustomActionHandler.HandlerReferences handlerReferences, B2bRemoveLegalActionHandler b2bRemoveLegalActionHandler, B2bRemoveLegalViewModel b2bRemoveLegalViewModel, d<? super B2bRemoveLegalActionHandler$observeActions$1> dVar) {
        super(2, dVar);
        this.$handlerRefs = handlerReferences;
        this.this$0 = b2bRemoveLegalActionHandler;
        this.$viewModel = b2bRemoveLegalViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        B2bRemoveLegalActionHandler$observeActions$1 b2bRemoveLegalActionHandler$observeActions$1 = new B2bRemoveLegalActionHandler$observeActions$1(this.$handlerRefs, this.this$0, this.$viewModel, dVar);
        b2bRemoveLegalActionHandler$observeActions$1.L$0 = obj;
        return b2bRemoveLegalActionHandler$observeActions$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function0 function0;
        TabConfigUpdateDelegate tabConfigUpdateDelegate;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        B2bRemoveLegalViewModel.ScreenState screenState = (B2bRemoveLegalViewModel.ScreenState) this.L$0;
        if (Intrinsics.d(screenState, B2bRemoveLegalViewModel.ScreenState.Idle.INSTANCE)) {
            this.$handlerRefs.getRefs().getController().hideLoader();
        } else if (Intrinsics.d(screenState, B2bRemoveLegalViewModel.ScreenState.Loading.INSTANCE)) {
            this.$handlerRefs.getRefs().getController().e(new l.a.C1079a(0L, null, 3));
        } else if (screenState instanceof B2bRemoveLegalViewModel.ScreenState.Error) {
            this.$handlerRefs.getRefs().getController().hideLoader();
            this.this$0.showError(((B2bRemoveLegalViewModel.ScreenState.Error) screenState).getErrorMessage(), this.$handlerRefs);
            this.$viewModel.discardScreenState();
            this.this$0.releaseStateListenerJob();
            this.this$0.releaseAdditionalAction();
        } else if (screenState instanceof B2bRemoveLegalViewModel.ScreenState.RemoveError) {
            this.$handlerRefs.getRefs().getController().hideLoader();
            this.this$0.showRemoveUnavailableDialog(((B2bRemoveLegalViewModel.ScreenState.RemoveError) screenState).getData(), this.$handlerRefs);
            this.$viewModel.discardScreenState();
            this.this$0.releaseStateListenerJob();
            this.this$0.releaseAdditionalAction();
        } else {
            if (!(screenState instanceof B2bRemoveLegalViewModel.ScreenState.Success)) {
                throw new o();
            }
            B2bRemoveLegalViewModel.ScreenState.Success success = (B2bRemoveLegalViewModel.ScreenState.Success) screenState;
            String successMessage = success.getSuccessMessage();
            if (successMessage != null) {
                this.this$0.showSuccess(successMessage, this.$handlerRefs);
            }
            this.$handlerRefs.getRefs().getController().hideLoader();
            if (!success.getShouldPopToRoot()) {
                function0 = this.this$0.additionalSuccessAction;
                if (function0 != null) {
                    function0.invoke();
                } else {
                    CustomActionHandler.HandlerReferences handlerReferences = this.$handlerRefs;
                    handlerReferences.getRefs().getNavigator().popBackStack();
                    ComposerExtKt.sendRefreshToTargetFragment$default(handlerReferences.getRefs().getContainer(), null, null, null, null, 15, null);
                }
            } else if (ComposerExtKt.isFlow(this.$handlerRefs.getRefs().getContainer())) {
                ComposerExtKt.closeFlow(this.$handlerRefs.getRefs().getContainer());
            } else {
                this.$handlerRefs.getRefs().getNavigator().navigate(new ClearToRootTabDestination(null, 1, null), null);
            }
            this.$viewModel.discardScreenState();
            this.this$0.releaseStateListenerJob();
            this.this$0.releaseAdditionalAction();
            tabConfigUpdateDelegate = this.this$0.tabConfigUpdateDelegate;
            tabConfigUpdateDelegate.updateTabConfig("main");
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(B2bRemoveLegalViewModel.ScreenState screenState, d<? super Unit> dVar) {
        return ((B2bRemoveLegalActionHandler$observeActions$1) create(screenState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
