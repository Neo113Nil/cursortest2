package ru.ozon.app.android.utils.rx;

import EC.a;
import Ty.C4052c;
import Ty.C4054e;
import Ty.f;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003BO\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/utils/rx/RepeatLifeCycleObserver;", "T", "Lru/ozon/app/android/utils/rx/DisposableLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lio/reactivex/p;", "observable", "Lkotlin/Function1;", "", "onNext", "", "onError", "Lkotlin/Function0;", "onComplete", "<init>", "(Lio/reactivex/p;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "", "isDisposed", "()Z", "dispose", "()V", "Landroidx/lifecycle/J;", "owner", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "onDestroy", "Lio/reactivex/p;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "Lnc/b;", "disposable", "Lnc/b;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RepeatLifeCycleObserver<T> implements DisposableLifecycleObserver, DefaultLifecycleObserver {
    private InterfaceC8487b disposable;

    @NotNull
    private final p<T> observable;
    private final Function0<Unit> onComplete;

    @NotNull
    private final Function1<Throwable, Unit> onError;

    @NotNull
    private final Function1<T, Unit> onNext;

    /* JADX WARN: Multi-variable type inference failed */
    public RepeatLifeCycleObserver(@NotNull p<T> observable, @NotNull Function1<? super T, Unit> onNext, @NotNull Function1<? super Throwable, Unit> onError, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(observable, "observable");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.observable = observable;
        this.onNext = onNext;
        this.onError = onError;
        this.onComplete = function0;
    }

    @Override // nc.InterfaceC8487b
    public void dispose() {
        InterfaceC8487b interfaceC8487b = this.disposable;
        if (interfaceC8487b != null) {
            if (interfaceC8487b.isDisposed()) {
                interfaceC8487b = null;
            }
            if (interfaceC8487b != null) {
                interfaceC8487b.dispose();
            }
        }
        this.disposable = null;
    }

    @Override // nc.InterfaceC8487b
    public boolean isDisposed() {
        InterfaceC8487b interfaceC8487b = this.disposable;
        boolean z11 = false;
        if (interfaceC8487b != null && !interfaceC8487b.isDisposed()) {
            z11 = true;
        }
        return !z11;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        dispose();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        InterfaceC8487b interfaceC8487b = this.disposable;
        if (interfaceC8487b == null || interfaceC8487b.isDisposed()) {
            final Function0<Unit> function0 = this.onComplete;
            this.disposable = function0 != null ? this.observable.subscribe(new C4052c(this.onNext, 2), new a(this.onError, 2), new InterfaceC9019a() { // from class: yY.a
                @Override // qc.InterfaceC9019a
                public final void run() {
                    Function0.this.invoke();
                }
            }) : this.observable.subscribe(new C4054e(this.onNext), new f(this.onError, 2));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        dispose();
    }
}
