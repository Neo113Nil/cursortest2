package ru.ozon.app.android.account.orders.cancel.presentation;

import Ge.f;
import Sc.r;
import Sc.s;
import Wc.a;
import androidx.lifecycle.V;
import io.reactivex.AbstractC7094b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.account.orders.cancel.CancelReasonState;
import ru.ozon.app.android.account.orders.cancel.CancelReasonStateStore;
import ru.ozon.app.android.account.orders.cancel.data.CancelOrderResponse;
import ru.ozon.app.android.cart.common.data.prefetch.CartPrefetchController;
import ru.ozon.app.android.cart.common.domain.CartRefreshReason;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonViewModelImpl$handleSuccessComposerAction$1", f = "CancelReasonVM.kt", l = {238, 241}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CancelReasonViewModelImpl$handleSuccessComposerAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ CancelOrderResponse $data;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CancelReasonViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CancelReasonViewModelImpl$handleSuccessComposerAction$1(CancelReasonViewModelImpl cancelReasonViewModelImpl, CancelOrderResponse cancelOrderResponse, d<? super CancelReasonViewModelImpl$handleSuccessComposerAction$1> dVar) {
        super(2, dVar);
        this.this$0 = cancelReasonViewModelImpl;
        this.$data = cancelOrderResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CancelReasonViewModelImpl$handleSuccessComposerAction$1 cancelReasonViewModelImpl$handleSuccessComposerAction$1 = new CancelReasonViewModelImpl$handleSuccessComposerAction$1(this.this$0, this.$data, dVar);
        cancelReasonViewModelImpl$handleSuccessComposerAction$1.L$0 = obj;
        return cancelReasonViewModelImpl$handleSuccessComposerAction$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (r8 != r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        ScreenState screenStateWithOrderError;
        CancelReasonViewModelImpl cancelReasonViewModelImpl;
        CancelOrderResponse cancelOrderResponse;
        CancelReasonStateStore cancelReasonStateStore;
        CartPrefetchController cartPrefetchController;
        CartEventsController cartEventsController;
        CartService cartService;
        CancelReasonViewModelImpl cancelReasonViewModelImpl2;
        Object handleCompletion;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            cancelReasonViewModelImpl = this.this$0;
            cancelOrderResponse = this.$data;
            r.Companion companion2 = r.INSTANCE;
            cancelReasonStateStore = cancelReasonViewModelImpl.stateStore;
            if (cancelReasonStateStore.getCheckbox().isCheckedAndEnabled()) {
                cartPrefetchController = cancelReasonViewModelImpl.cacheHandler;
                cartPrefetchController.clearCache(CartPrefetchController.ClearCacheReason.CANCEL_ORDER);
                cartEventsController = cancelReasonViewModelImpl.cartEventsController;
                cartEventsController.setEvent(CartRefreshReason.CancelOrder.INSTANCE);
                cartService = cancelReasonViewModelImpl.cartService;
                AbstractC7094b updateCart$default = CartService.DefaultImpls.updateCart$default(cartService, null, null, 3, null);
                this.L$0 = cancelReasonViewModelImpl;
                this.L$1 = cancelOrderResponse;
                this.label = 1;
                if (f.a(updateCart$default, this) == aVar) {
                    return aVar;
                }
                cancelReasonViewModelImpl2 = cancelReasonViewModelImpl;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            handleCompletion = cancelReasonViewModelImpl.handleCompletion(cancelOrderResponse, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                a11 = Unit.f71690a;
                r.Companion companion3 = r.INSTANCE;
                CancelReasonViewModelImpl cancelReasonViewModelImpl3 = this.this$0;
                Throwable b11 = r.b(a11);
                if (b11 != null) {
                    Lm0.a.f17149a.e(b11);
                    V<CancelReasonState<String>> cancelState = cancelReasonViewModelImpl3.getCancelState();
                    screenStateWithOrderError = cancelReasonViewModelImpl3.toScreenStateWithOrderError(b11);
                    cancelState.setValue(new CancelReasonState.Error(screenStateWithOrderError, null, 2, null));
                }
                return Unit.f71690a;
            }
            cancelOrderResponse = (CancelOrderResponse) this.L$1;
            cancelReasonViewModelImpl2 = (CancelReasonViewModelImpl) this.L$0;
            s.b(obj);
        }
        cancelReasonViewModelImpl = cancelReasonViewModelImpl2;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        handleCompletion = cancelReasonViewModelImpl.handleCompletion(cancelOrderResponse, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CancelReasonViewModelImpl$handleSuccessComposerAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
