package ru.ozon.app.android.action.sheet;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nc.C8488c;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import sc.C9653a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u000fR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/action/sheet/DisposableActionHandlerImpl;", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "handler", "", "requestId", "Landroidx/lifecycle/v;", "lifecycle", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "actionSheetEventHandler", "<init>", "(Lkotlin/jvm/functions/Function1;JLandroidx/lifecycle/v;Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;)V", "start", "()V", "cancel", "Lkotlin/jvm/functions/Function1;", "getHandler", "()Lkotlin/jvm/functions/Function1;", "J", "Landroidx/lifecycle/v;", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "Lnc/b;", "disposable", "Lnc/b;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "observer", "Landroidx/lifecycle/DefaultLifecycleObserver;", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DisposableActionHandlerImpl implements DisposableActionHandler {

    @NotNull
    private final ActionSheetEventHandler actionSheetEventHandler;

    @NotNull
    private InterfaceC8487b disposable;

    @NotNull
    private final Function1<AtomAction, Unit> handler;

    @NotNull
    private final AbstractC5434v lifecycle;

    @NotNull
    private DefaultLifecycleObserver observer;
    private final long requestId;

    /* JADX WARN: Multi-variable type inference failed */
    public DisposableActionHandlerImpl(@NotNull Function1<? super AtomAction, Unit> handler, long j11, @NotNull AbstractC5434v lifecycle, @NotNull ActionSheetEventHandler actionSheetEventHandler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(actionSheetEventHandler, "actionSheetEventHandler");
        this.handler = handler;
        this.requestId = j11;
        this.lifecycle = lifecycle;
        this.actionSheetEventHandler = actionSheetEventHandler;
        InterfaceC8487b a11 = C8488c.a(C9653a.f98522b);
        Intrinsics.checkNotNullExpressionValue(a11, "empty(...)");
        this.disposable = a11;
        DefaultLifecycleObserver defaultLifecycleObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.action.sheet.DisposableActionHandlerImpl.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                DisposableActionHandlerImpl.this.lifecycle.e(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                DisposableActionHandlerImpl.this.start();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                DisposableActionHandlerImpl.this.disposable.dispose();
            }
        };
        lifecycle.a(defaultLifecycleObserver);
        this.observer = defaultLifecycleObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void start() {
        this.disposable = this.actionSheetEventHandler.handle(getHandler(), this.requestId);
    }

    @Override // ru.ozon.app.android.action.sheet.DisposableActionHandler
    public void cancel() {
        this.disposable.dispose();
        this.lifecycle.e(this.observer);
    }

    @Override // ru.ozon.app.android.action.sheet.DisposableActionHandler
    @NotNull
    public Function1<AtomAction, Unit> getHandler() {
        return this.handler;
    }
}
