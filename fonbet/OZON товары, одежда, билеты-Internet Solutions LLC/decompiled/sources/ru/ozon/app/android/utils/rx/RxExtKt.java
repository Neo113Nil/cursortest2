package ru.ozon.app.android.utils.rx;

import AY.a;
import Fl.d;
import Gy.b;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import io.reactivex.AbstractC7094b;
import io.reactivex.p;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import uc.i;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a;\u0010\u000e\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b\u000e\u0010\u000f\u001a_\u0010\u0013\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\u0004\b\u0013\u0010\u0014\u001aM\u0010\u0015\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b\u0015\u0010\u0016\u001a_\u0010\u000e\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u0017\u001aM\u0010\u000e\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b\u000e\u0010\u001a\u001a7\u0010\u001b\u001a\u00020\u0001*\u00020\u00062\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lnc/a;", "Lnc/b;", "disposable", "", "plusAssign", "(Lnc/a;Lnc/b;)V", "Lio/reactivex/b;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function0;", "onComplete", "Lkotlin/Function1;", "", "onError", "subscribe", "(Lio/reactivex/b;Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "T", "Lio/reactivex/p;", "onNext", "observe", "(Lio/reactivex/p;Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lnc/b;", "observeRoute", "(Lio/reactivex/p;Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "(Lio/reactivex/p;Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Lio/reactivex/y;", "onSuccess", "(Lio/reactivex/y;Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "subscribeBy", "(Lio/reactivex/b;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lnc/b;", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RxExtKt {
    @NotNull
    public static final <T> InterfaceC8487b observe(@NotNull p<T> pVar, @NotNull J lifecycleOwner, @NotNull Function1<? super T, Unit> onNext, @NotNull Function1<? super Throwable, Unit> onError, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(onError, "onError");
        RepeatLifeCycleObserver repeatLifeCycleObserver = new RepeatLifeCycleObserver(pVar, onNext, onError, function0);
        lifecycleOwner.getLifecycle().a(repeatLifeCycleObserver);
        return new RepeatLifecycleDisposable(repeatLifeCycleObserver, lifecycleOwner);
    }

    public static /* synthetic */ InterfaceC8487b observe$default(p pVar, J j11, Function1 function1, Function1 function12, Function0 function0, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            function0 = null;
        }
        return observe(pVar, j11, function1, function12, function0);
    }

    public static final <T> void observeRoute(@NotNull p<T> pVar, @NotNull J lifecycleOwner, @NotNull Function1<? super T, Unit> onNext, @NotNull Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(onError, "onError");
        final InterfaceC8487b subscribe = pVar.subscribe(new d(onNext, 3), new a(onError));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        lifecycleOwner.getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.utils.rx.RxExtKt$observeRoute$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                InterfaceC8487b interfaceC8487b = InterfaceC8487b.this;
                if (interfaceC8487b.isDisposed()) {
                    interfaceC8487b = null;
                }
                if (interfaceC8487b != null) {
                    interfaceC8487b.dispose();
                }
            }
        });
    }

    public static final void plusAssign(@NotNull C8486a c8486a, @NotNull InterfaceC8487b disposable) {
        Intrinsics.checkNotNullParameter(c8486a, "<this>");
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        c8486a.a(disposable);
    }

    public static final void subscribe(@NotNull AbstractC7094b abstractC7094b, @NotNull final J lifecycleOwner, @NotNull final Function0<Unit> onComplete, @NotNull Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(abstractC7094b, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onError, "onError");
        InterfaceC9019a interfaceC9019a = new InterfaceC9019a() { // from class: yY.d
            @Override // qc.InterfaceC9019a
            public final void run() {
                Function0.this.invoke();
            }
        };
        NX.a aVar = new NX.a(onError, 5);
        abstractC7094b.getClass();
        final i iVar = new i(aVar, interfaceC9019a);
        abstractC7094b.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        lifecycleOwner.getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.utils.rx.RxExtKt$subscribe$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                InterfaceC8487b interfaceC8487b = InterfaceC8487b.this;
                if (interfaceC8487b.isDisposed()) {
                    interfaceC8487b = null;
                }
                if (interfaceC8487b != null) {
                    interfaceC8487b.dispose();
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                InterfaceC8487b interfaceC8487b = InterfaceC8487b.this;
                if (interfaceC8487b.isDisposed()) {
                    interfaceC8487b = null;
                }
                if (interfaceC8487b != null) {
                    interfaceC8487b.dispose();
                }
                lifecycleOwner.getLifecycle().e(this);
            }
        });
    }

    public static /* synthetic */ void subscribe$default(p pVar, J j11, Function1 function1, Function1 function12, Function0 function0, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            function0 = null;
        }
        subscribe(pVar, j11, function1, function12, function0);
    }

    @NotNull
    public static final InterfaceC8487b subscribeBy(@NotNull AbstractC7094b abstractC7094b, @NotNull final Function0<Unit> onSuccess, @NotNull Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(abstractC7094b, "<this>");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        InterfaceC9019a interfaceC9019a = new InterfaceC9019a() { // from class: yY.b
            @Override // qc.InterfaceC9019a
            public final void run() {
                Function0.this.invoke();
            }
        };
        Gy.a aVar = new Gy.a(onError, 13);
        abstractC7094b.getClass();
        i iVar = new i(aVar, interfaceC9019a);
        abstractC7094b.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        return iVar;
    }

    public static /* synthetic */ InterfaceC8487b subscribeBy$default(AbstractC7094b abstractC7094b, Function0 function0, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function0 = RxExtKt$subscribeBy$1.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            function1 = RxExtKt$subscribeBy$2.INSTANCE;
        }
        return subscribeBy(abstractC7094b, function0, function1);
    }

    public static final <T> void subscribe(@NotNull p<T> pVar, @NotNull final J lifecycleOwner, @NotNull Function1<? super T, Unit> onNext, @NotNull Function1<? super Throwable, Unit> onError, final Function0<Unit> function0) {
        final InterfaceC8487b subscribe;
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (function0 != null) {
            subscribe = pVar.subscribe(new DM.i(onNext, 19), new b(onError, 9), new InterfaceC9019a() { // from class: yY.c
                @Override // qc.InterfaceC9019a
                public final void run() {
                    Function0.this.invoke();
                }
            });
            Intrinsics.f(subscribe);
        } else {
            subscribe = pVar.subscribe(new BO.b(onNext, 14), new GJ.a(onError, 11));
            Intrinsics.f(subscribe);
        }
        lifecycleOwner.getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.utils.rx.RxExtKt$subscribe$2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                InterfaceC8487b interfaceC8487b = InterfaceC8487b.this;
                if (interfaceC8487b.isDisposed()) {
                    interfaceC8487b = null;
                }
                if (interfaceC8487b != null) {
                    interfaceC8487b.dispose();
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                InterfaceC8487b interfaceC8487b = InterfaceC8487b.this;
                if (interfaceC8487b.isDisposed()) {
                    interfaceC8487b = null;
                }
                if (interfaceC8487b != null) {
                    interfaceC8487b.dispose();
                }
                lifecycleOwner.getLifecycle().e(this);
            }
        });
    }

    public static final <T> void subscribe(@NotNull y<T> yVar, @NotNull final J lifecycleOwner, @NotNull Function1<? super T, Unit> onSuccess, @NotNull Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        final InterfaceC8487b h11 = yVar.h(new IJ.a(onSuccess, 13), new HX.a(onError, 9));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        lifecycleOwner.getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.utils.rx.RxExtKt$subscribe$3
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                InterfaceC8487b interfaceC8487b = InterfaceC8487b.this;
                if (interfaceC8487b.isDisposed()) {
                    interfaceC8487b = null;
                }
                if (interfaceC8487b != null) {
                    interfaceC8487b.dispose();
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                InterfaceC8487b interfaceC8487b = InterfaceC8487b.this;
                if (interfaceC8487b.isDisposed()) {
                    interfaceC8487b = null;
                }
                if (interfaceC8487b != null) {
                    interfaceC8487b.dispose();
                }
                lifecycleOwner.getLifecycle().e(this);
            }
        });
    }
}
