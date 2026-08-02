package ru.ozon.app.android.travel.feature.general.common.widgets.invisibleRefresher.presentation;

import Sc.o;
import Vg.d;
import android.os.CountDownTimer;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.travel.feature.general.common.widgets.invisibleRefresher.presentation.InvisibleRefresherViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0004*\u00013\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0012J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000e0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/invisibleRefresher/presentation/InvisibleRefresherWidgetHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/general/common/widgets/invisibleRefresher/presentation/InvisibleRefresherVO;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/general/common/widgets/invisibleRefresher/presentation/InvisibleRefresherViewModel;", "invisibleRefresherViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/travel/feature/general/common/widgets/invisibleRefresher/presentation/InvisibleRefresherViewModel;LVg/d;)V", "", "startTime", "", "startTimer", "(J)V", "observeLiveData", "()V", "Lru/ozon/app/android/travel/feature/general/common/widgets/invisibleRefresher/presentation/InvisibleRefresherViewModel$ActionResult;", "result", "handleResult", "(Lru/ozon/app/android/travel/feature/general/common/widgets/invisibleRefresher/presentation/InvisibleRefresherViewModel$ActionResult;)V", "stopTimer", "onRefresh", "onWidgetCreated", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/invisibleRefresher/presentation/InvisibleRefresherVO;)V", "Ll10/i;", "Lru/ozon/app/android/travel/feature/general/common/widgets/invisibleRefresher/presentation/InvisibleRefresherViewModel;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/os/CountDownTimer;", "countDownTimer", "Landroid/os/CountDownTimer;", "timerAction", "Lru/ozon/uni/atoms/af/AtomAction;", "remainingTime", "J", "", "isTimerRunning", "Z", "isRefreshActionInvoked", "ru/ozon/app/android/travel/feature/general/common/widgets/invisibleRefresher/presentation/InvisibleRefresherWidgetHolder$lifecycleObserver$1", "lifecycleObserver", "Lru/ozon/app/android/travel/feature/general/common/widgets/invisibleRefresher/presentation/InvisibleRefresherWidgetHolder$lifecycleObserver$1;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InvisibleRefresherWidgetHolder extends AbstractC6065b<InvisibleRefresherVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;
    private CountDownTimer countDownTimer;

    @NotNull
    private final InvisibleRefresherViewModel invisibleRefresherViewModel;
    private boolean isRefreshActionInvoked;
    private boolean isTimerRunning;

    @NotNull
    private final InvisibleRefresherWidgetHolder$lifecycleObserver$1 lifecycleObserver;
    private final View metricView;
    private long remainingTime;
    private AtomAction timerAction;

    /* JADX WARN: Type inference failed for: r2v4, types: [ru.ozon.app.android.travel.feature.general.common.widgets.invisibleRefresher.presentation.InvisibleRefresherWidgetHolder$lifecycleObserver$1] */
    public InvisibleRefresherWidgetHolder(@NotNull i container, @NotNull InvisibleRefresherViewModel invisibleRefresherViewModel, @NotNull d customActionHandlersStoreFactory) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(invisibleRefresherViewModel, "invisibleRefresherViewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.container = container;
        this.invisibleRefresherViewModel = invisibleRefresherViewModel;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new InvisibleRefresherWidgetHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.lifecycleObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.invisibleRefresher.presentation.InvisibleRefresherWidgetHolder$lifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                owner.getLifecycle().e(this);
                super.onDestroy(owner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                long j11;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onStart(owner);
                InvisibleRefresherWidgetHolder invisibleRefresherWidgetHolder = InvisibleRefresherWidgetHolder.this;
                j11 = invisibleRefresherWidgetHolder.remainingTime;
                invisibleRefresherWidgetHolder.startTimer(j11);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                InvisibleRefresherWidgetHolder.this.stopTimer();
                super.onStop(owner);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleResult(InvisibleRefresherViewModel.ActionResult result) {
        InvisibleRefresherVO boundData;
        if (!(result instanceof InvisibleRefresherViewModel.ActionResult.Action)) {
            if (!Intrinsics.d(result, InvisibleRefresherViewModel.ActionResult.StartTimer.INSTANCE)) {
                throw new o();
            }
            InvisibleRefresherVO boundData2 = getBoundData();
            if (boundData2 != null) {
                startTimer(boundData2.getMillis());
                return;
            }
            return;
        }
        this.isRefreshActionInvoked = true;
        InvisibleRefresherViewModel.ActionResult.Action action = (InvisibleRefresherViewModel.ActionResult.Action) result;
        if ((action.getAction() instanceof AtomAction.Refresh) && (boundData = getBoundData()) != null && boundData.getIsSilentRefresh()) {
            InterfaceC7851b.a.e(this.container.M(), ((AtomAction.Refresh) action.getAction()).getLink(), null, null, 6);
        } else {
            this.actionHandler.invoke(action.getAction());
        }
    }

    private final void observeLiveData() {
        this.invisibleRefresherViewModel.getResultLiveData().observe(this, new InvisibleRefresherWidgetHolderKt$sam$androidx_lifecycle_Observer$0(new InvisibleRefresherWidgetHolder$observeLiveData$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startTimer(long startTime) {
        if (this.isTimerRunning) {
            return;
        }
        this.isTimerRunning = true;
        this.remainingTime = startTime;
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        final long j11 = this.remainingTime;
        this.countDownTimer = new CountDownTimer(j11) { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.invisibleRefresher.presentation.InvisibleRefresherWidgetHolder$startTimer$1
            @Override // android.os.CountDownTimer
            public void onFinish() {
                InvisibleRefresherViewModel invisibleRefresherViewModel;
                AtomAction atomAction;
                invisibleRefresherViewModel = InvisibleRefresherWidgetHolder.this.invisibleRefresherViewModel;
                atomAction = InvisibleRefresherWidgetHolder.this.timerAction;
                invisibleRefresherViewModel.performAction(atomAction, InvisibleRefresherWidgetHolder.this.getTrackingData());
                InvisibleRefresherWidgetHolder.this.isTimerRunning = false;
            }

            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
                InvisibleRefresherWidgetHolder.this.remainingTime = millisUntilFinished;
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopTimer() {
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.countDownTimer = null;
        this.isTimerRunning = false;
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onRefresh() {
        if (!this.isRefreshActionInvoked) {
            stopTimer();
            InvisibleRefresherVO boundData = getBoundData();
            if (boundData != null) {
                startTimer(boundData.getMillis());
            }
        }
        super.onRefresh();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        getLifecycle().a(this.lifecycleObserver);
        observeLiveData();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull InvisibleRefresherVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.timerAction = item.getAction();
        startTimer(item.getMillis());
        this.isRefreshActionInvoked = false;
    }
}
