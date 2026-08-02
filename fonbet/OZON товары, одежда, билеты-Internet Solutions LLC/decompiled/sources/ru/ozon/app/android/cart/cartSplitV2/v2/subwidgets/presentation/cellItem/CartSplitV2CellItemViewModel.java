package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.s;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.viewHolder.timer.TimerState;
import ru.ozon.app.android.cart.common.domain.CartRefreshReason;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import xe.B0;
import xe.C10727i;
import xe.J;
import xe.Y;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u000fJ\r\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u000fR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/CartSplitV2CellItemViewModel;", "Landroidx/lifecycle/w0;", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "composerController", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "cartEventsController", "<init>", "(Ll10/b;Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;)V", "", "animationDuration", "", "onTimerCompleted", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "onCleared", "()V", "durationMs", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/CartSplitV2CellItemVO;", "item", "setupTimer", "(JLru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/CartSplitV2CellItemVO;J)V", "startTimerIfNotStarted", "stopTimer", "Ll10/b;", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "Lxe/J;", "coroutineExceptionHandler", "Lxe/J;", "getCoroutineExceptionHandler", "()Lxe/J;", "LAe/x0;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/viewHolder/timer/TimerState;", "_timerState", "LAe/x0;", "LAe/M0;", "timerState", "LAe/M0;", "getTimerState", "()LAe/M0;", "Lxe/B0;", "activeTimer", "Lxe/B0;", "currentVO", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/CartSplitV2CellItemVO;", "configuredTimerDurationMs", "J", "configuredAnimationDuration", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2CellItemViewModel extends w0 {

    @NotNull
    private final x0<TimerState> _timerState;
    private B0 activeTimer;

    @NotNull
    private final CartEventsController cartEventsController;

    @NotNull
    private final InterfaceC7851b composerController;
    private long configuredAnimationDuration;
    private long configuredTimerDurationMs;

    @NotNull
    private final J coroutineExceptionHandler;
    private CartSplitV2CellItemVO currentVO;

    @NotNull
    private final M0<TimerState> timerState;

    public CartSplitV2CellItemViewModel(@NotNull InterfaceC7851b composerController, @NotNull CartEventsController cartEventsController) {
        Intrinsics.checkNotNullParameter(composerController, "composerController");
        Intrinsics.checkNotNullParameter(cartEventsController, "cartEventsController");
        this.composerController = composerController;
        this.cartEventsController = cartEventsController;
        this.coroutineExceptionHandler = new CartSplitV2CellItemViewModel$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);
        x0<TimerState> a11 = O0.a(TimerState.Idle.INSTANCE);
        this._timerState = a11;
        this.timerState = C2399j.b(a11);
        this.configuredTimerDurationMs = 5000L;
        this.configuredAnimationDuration = 300L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062 A[Catch: all -> 0x002d, TRY_ENTER, TryCatch #1 {all -> 0x002d, blocks: (B:11:0x0029, B:13:0x0062, B:17:0x006a, B:19:0x006e), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:11:0x0029, B:13:0x0062, B:17:0x006a, B:19:0x006e), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onTimerCompleted(long j11, d<? super Unit> dVar) {
        CartSplitV2CellItemViewModel$onTimerCompleted$1 cartSplitV2CellItemViewModel$onTimerCompleted$1;
        int i11;
        CartSplitV2CellItemViewModel cartSplitV2CellItemViewModel;
        int i12;
        if (dVar instanceof CartSplitV2CellItemViewModel$onTimerCompleted$1) {
            cartSplitV2CellItemViewModel$onTimerCompleted$1 = (CartSplitV2CellItemViewModel$onTimerCompleted$1) dVar;
            int i13 = cartSplitV2CellItemViewModel$onTimerCompleted$1.label;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cartSplitV2CellItemViewModel$onTimerCompleted$1.label = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cartSplitV2CellItemViewModel$onTimerCompleted$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = cartSplitV2CellItemViewModel$onTimerCompleted$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    try {
                        CartSplitV2CellItemVO cartSplitV2CellItemVO = this.currentVO;
                        ?? isLast = cartSplitV2CellItemVO != null ? cartSplitV2CellItemVO.getIsLast() : 0;
                        this._timerState.setValue(new TimerState.AnimationRequested(isLast));
                        cartSplitV2CellItemViewModel$onTimerCompleted$1.L$0 = this;
                        cartSplitV2CellItemViewModel$onTimerCompleted$1.I$0 = isLast;
                        cartSplitV2CellItemViewModel$onTimerCompleted$1.label = 1;
                        if (Y.b(j11, cartSplitV2CellItemViewModel$onTimerCompleted$1) == aVar) {
                            return aVar;
                        }
                        cartSplitV2CellItemViewModel = this;
                        i12 = isLast;
                    } catch (Throwable th2) {
                        th = th2;
                        cartSplitV2CellItemViewModel = this;
                        cartSplitV2CellItemViewModel._timerState.setValue(TimerState.Idle.INSTANCE);
                        throw th;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i12 = cartSplitV2CellItemViewModel$onTimerCompleted$1.I$0;
                    cartSplitV2CellItemViewModel = (CartSplitV2CellItemViewModel) cartSplitV2CellItemViewModel$onTimerCompleted$1.L$0;
                    try {
                        s.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        cartSplitV2CellItemViewModel._timerState.setValue(TimerState.Idle.INSTANCE);
                        throw th;
                    }
                }
                if (i12 == 0) {
                    cartSplitV2CellItemViewModel.cartEventsController.handleEvent(CartRefreshReason.RemoveRestoreCartSplit.INSTANCE);
                } else {
                    CartSplitV2CellItemVO cartSplitV2CellItemVO2 = cartSplitV2CellItemViewModel.currentVO;
                    if (cartSplitV2CellItemVO2 != null) {
                        cartSplitV2CellItemViewModel.composerController.m(cartSplitV2CellItemVO2.getId());
                    }
                }
                cartSplitV2CellItemViewModel._timerState.setValue(TimerState.Idle.INSTANCE);
                return Unit.f71690a;
            }
        }
        cartSplitV2CellItemViewModel$onTimerCompleted$1 = new CartSplitV2CellItemViewModel$onTimerCompleted$1(this, dVar);
        Object obj2 = cartSplitV2CellItemViewModel$onTimerCompleted$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = cartSplitV2CellItemViewModel$onTimerCompleted$1.label;
        if (i11 != 0) {
        }
        if (i12 == 0) {
        }
        cartSplitV2CellItemViewModel._timerState.setValue(TimerState.Idle.INSTANCE);
        return Unit.f71690a;
    }

    @NotNull
    public final M0<TimerState> getTimerState() {
        return this.timerState;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        stopTimer();
    }

    public final void setupTimer(long durationMs, @NotNull CartSplitV2CellItemVO item, long animationDuration) {
        Intrinsics.checkNotNullParameter(item, "item");
        CartSplitV2CellItemVO cartSplitV2CellItemVO = this.currentVO;
        if (cartSplitV2CellItemVO == null || cartSplitV2CellItemVO == null || cartSplitV2CellItemVO.getId() != item.getId()) {
            stopTimer();
            this.currentVO = item;
            this.configuredTimerDurationMs = durationMs;
            this.configuredAnimationDuration = animationDuration;
        }
    }

    public final void startTimerIfNotStarted() {
        B0 b02 = this.activeTimer;
        if (b02 == null || !b02.isActive()) {
            this.activeTimer = C10727i.c(androidx.lifecycle.x0.a(this), this.coroutineExceptionHandler, null, new CartSplitV2CellItemViewModel$startTimerIfNotStarted$timerJob$1(this, null), 2);
        }
    }

    public final void stopTimer() {
        B0 b02 = this.activeTimer;
        if (b02 != null) {
            b02.j(null);
        }
        this.activeTimer = null;
        this._timerState.setValue(TimerState.Idle.INSTANCE);
    }
}
