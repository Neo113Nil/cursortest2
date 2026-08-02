package ru.ozon.app.android.fresh.unsorted.widgets.swapButton.presentation;

import Ae.x0;
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
import ru.ozon.app.android.fresh.unsorted.widgets.swapButton.data.FreshSubscribeRepository;
import ru.ozon.app.android.fresh.unsorted.widgets.swapButton.presentation.SwapButtonViewModel;
import ru.ozon.app.android.utils.Result;
import xe.M;
import ze.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.swapButton.presentation.SwapButtonViewModel$subscribeAction$1", f = "SwapButtonViewModel.kt", l = {55, 59, 61, 67, 70}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SwapButtonViewModel$subscribeAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionId;
    final /* synthetic */ long $productId;
    int label;
    final /* synthetic */ SwapButtonViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwapButtonViewModel$subscribeAction$1(SwapButtonViewModel swapButtonViewModel, String str, long j11, d<? super SwapButtonViewModel$subscribeAction$1> dVar) {
        super(2, dVar);
        this.this$0 = swapButtonViewModel;
        this.$actionId = str;
        this.$productId = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SwapButtonViewModel$subscribeAction$1(this.this$0, this.$actionId, this.$productId, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e2, code lost:
    
        if (r13.n(r1, r12) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f7, code lost:
    
        if (r13.n(r1, r12) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r13 == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
    
        if (r13 == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0048, code lost:
    
        if (r13.n(r1, r12) == r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e5  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        h hVar;
        x0 x0Var;
        x0 x0Var2;
        FreshSubscribeRepository freshSubscribeRepository;
        FreshSubscribeRepository freshSubscribeRepository2;
        Result result;
        h hVar2;
        x0 x0Var3;
        x0 x0Var4;
        x0 x0Var5;
        h hVar3;
        x0 x0Var6;
        x0 x0Var7;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            hVar = this.this$0._actions;
            SwapButtonViewModel.Action.SubscriptionInProgress subscriptionInProgress = SwapButtonViewModel.Action.SubscriptionInProgress.INSTANCE;
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    s.b(obj);
                    result = (Result) obj;
                    if (!(result instanceof Result.Success)) {
                    }
                    return aVar;
                }
                if (i11 != 3) {
                    if (i11 == 4) {
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    if (i11 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    x0Var6 = this.this$0._state;
                    x0Var7 = this.this$0._state;
                    x0Var6.setValue(SwapButtonViewModel.UiState.copy$default((SwapButtonViewModel.UiState) x0Var7.getValue(), false, true, 1, null));
                    return Unit.f71690a;
                }
                s.b(obj);
                result = (Result) obj;
                if (!(result instanceof Result.Success)) {
                    x0Var3 = this.this$0._state;
                    x0Var4 = this.this$0._state;
                    SwapButtonViewModel.UiState uiState = (SwapButtonViewModel.UiState) x0Var4.getValue();
                    x0Var5 = this.this$0._state;
                    x0Var3.setValue(uiState.copy(!((SwapButtonViewModel.UiState) x0Var5.getValue()).getIsSwapped(), true));
                    hVar3 = this.this$0._actions;
                    SwapButtonViewModel.Action.SubscriptionSuccess subscriptionSuccess = new SwapButtonViewModel.Action.SubscriptionSuccess(Intrinsics.d(this.$actionId, "subscriptionsSubscribeToStock"));
                    this.label = 4;
                } else {
                    if (!(result instanceof Result.Failure)) {
                        throw new o();
                    }
                    hVar2 = this.this$0._actions;
                    SwapButtonViewModel.Action.SubscriptionError subscriptionError = SwapButtonViewModel.Action.SubscriptionError.INSTANCE;
                    this.label = 5;
                }
                return aVar;
            }
            s.b(obj);
        }
        x0Var = this.this$0._state;
        x0Var2 = this.this$0._state;
        x0Var.setValue(SwapButtonViewModel.UiState.copy$default((SwapButtonViewModel.UiState) x0Var2.getValue(), false, false, 1, null));
        String str = this.$actionId;
        if (Intrinsics.d(str, "subscriptionsSubscribeToStock")) {
            freshSubscribeRepository2 = this.this$0.freshSubscribeRepository;
            long j11 = this.$productId;
            this.label = 2;
            obj = freshSubscribeRepository2.subscribeToItemAvailabilityChange(j11, this);
        } else {
            if (!Intrinsics.d(str, "subscriptionsUnsubscribeFromStock")) {
                return Unit.f71690a;
            }
            freshSubscribeRepository = this.this$0.freshSubscribeRepository;
            long j12 = this.$productId;
            this.label = 3;
            obj = freshSubscribeRepository.unsubscribeFromItemAvailabilityChange(j12, this);
        }
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SwapButtonViewModel$subscribeAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
