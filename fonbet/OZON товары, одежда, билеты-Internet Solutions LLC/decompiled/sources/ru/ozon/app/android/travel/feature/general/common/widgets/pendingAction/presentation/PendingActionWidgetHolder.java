package ru.ozon.app.android.travel.feature.general.common.widgets.pendingAction.presentation;

import Vg.d;
import android.os.CountDownTimer;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l10.t;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pendingAction/presentation/PendingActionWidgetHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pendingAction/presentation/PendingActionVO;", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Ll10/i;LVg/d;)V", "item", "", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pendingAction/presentation/PendingActionVO;)V", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Ll10/t;", "ownerContainer", "Ll10/t;", "Landroid/os/CountDownTimer;", DynamicElementDTO.TIMER, "Landroid/os/CountDownTimer;", "", "isTimerExpired", "Z", "timerAction", "Lru/ozon/uni/atoms/af/AtomAction;", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PendingActionWidgetHolder extends AbstractC6065b<PendingActionVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private boolean isTimerExpired;
    private final View metricView;

    @NotNull
    private final t ownerContainer;
    private CountDownTimer timer;
    private AtomAction timerAction;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pendingAction/presentation/PendingActionWidgetHolder$Companion;", "", "<init>", "()V", "DEF_UPDATE_INTERVAL", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PendingActionWidgetHolder(@NotNull i container, @NotNull d customActionHandlersStoreFactory) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new PendingActionWidgetHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.ownerContainer = container.K();
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull PendingActionVO item) {
        AbstractC5434v lifecycle;
        Intrinsics.checkNotNullParameter(item, "item");
        this.timerAction = item.getAction();
        if (item.getMillis() > 0 && !this.isTimerExpired && this.timer == null) {
            ComponentCallbacksC5392m b11 = this.ownerContainer.b();
            if (b11 != null && (lifecycle = b11.getLifecycle()) != null) {
                lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.pendingAction.presentation.PendingActionWidgetHolder$bind$1$1
                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public void onDestroy(J owner) {
                        CountDownTimer countDownTimer;
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        PendingActionWidgetHolder.this.isTimerExpired = false;
                        countDownTimer = PendingActionWidgetHolder.this.timer;
                        if (countDownTimer != null) {
                            countDownTimer.cancel();
                        }
                        PendingActionWidgetHolder.this.timer = null;
                        PendingActionWidgetHolder.this.timerAction = null;
                        owner.getLifecycle().e(this);
                    }

                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public void onResume(J owner) {
                        boolean z11;
                        AtomAction atomAction;
                        Function1 function1;
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        z11 = PendingActionWidgetHolder.this.isTimerExpired;
                        if (z11) {
                            atomAction = PendingActionWidgetHolder.this.timerAction;
                            if (atomAction != null) {
                                function1 = PendingActionWidgetHolder.this.actionHandler;
                                function1.invoke(atomAction);
                            }
                            PendingActionWidgetHolder.this.isTimerExpired = false;
                        }
                    }
                });
            }
            final long millis = item.getMillis();
            CountDownTimer countDownTimer = new CountDownTimer(millis) { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.pendingAction.presentation.PendingActionWidgetHolder$bind$1$2
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    CountDownTimer countDownTimer2;
                    AtomAction atomAction;
                    Function1 function1;
                    PendingActionWidgetHolder.this.isTimerExpired = true;
                    countDownTimer2 = PendingActionWidgetHolder.this.timer;
                    if (countDownTimer2 != null) {
                        countDownTimer2.cancel();
                    }
                    PendingActionWidgetHolder.this.timer = null;
                    if (PendingActionWidgetHolder.this.getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
                        atomAction = PendingActionWidgetHolder.this.timerAction;
                        if (atomAction != null) {
                            function1 = PendingActionWidgetHolder.this.actionHandler;
                            function1.invoke(atomAction);
                        }
                        PendingActionWidgetHolder.this.isTimerExpired = false;
                    }
                }

                @Override // android.os.CountDownTimer
                public void onTick(long millisUntilFinished) {
                }
            };
            this.timer = countDownTimer;
            countDownTimer.start();
        }
    }
}
