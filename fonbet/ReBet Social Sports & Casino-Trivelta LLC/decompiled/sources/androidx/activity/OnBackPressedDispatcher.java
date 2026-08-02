package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.InterfaceC2191p;
import androidx.lifecycle.InterfaceC2193s;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import x0.InterfaceC6772a;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f16366a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC6772a f16367b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f16368c;

    /* renamed from: d, reason: collision with root package name */
    public F f16369d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedCallback f16370e;

    /* renamed from: f, reason: collision with root package name */
    public OnBackInvokedDispatcher f16371f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16372g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16373h;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/p;", "Landroidx/activity/c;", "Landroidx/lifecycle/j;", "lifecycle", "Landroidx/activity/F;", "onBackPressedCallback", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/j;Landroidx/activity/F;)V", "Landroidx/lifecycle/s;", "source", "Landroidx/lifecycle/j$a;", "event", "", "k", "(Landroidx/lifecycle/s;Landroidx/lifecycle/j$a;)V", "cancel", "()V", "a", "Landroidx/lifecycle/j;", com.google.crypto.tink.integration.android.b.f37029b, "Landroidx/activity/F;", "c", "Landroidx/activity/c;", "currentCancellable", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class LifecycleOnBackPressedCancellable implements InterfaceC2191p, InterfaceC2036c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final AbstractC2185j lifecycle;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final F onBackPressedCallback;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public InterfaceC2036c currentCancellable;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f16377d;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, AbstractC2185j lifecycle, F onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f16377d = onBackPressedDispatcher;
            this.lifecycle = lifecycle;
            this.onBackPressedCallback = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // androidx.activity.InterfaceC2036c
        public void cancel() {
            this.lifecycle.d(this);
            this.onBackPressedCallback.removeCancellable(this);
            InterfaceC2036c interfaceC2036c = this.currentCancellable;
            if (interfaceC2036c != null) {
                interfaceC2036c.cancel();
            }
            this.currentCancellable = null;
        }

        @Override // androidx.lifecycle.InterfaceC2191p
        public void k(InterfaceC2193s source, AbstractC2185j.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == AbstractC2185j.a.ON_START) {
                this.currentCancellable = this.f16377d.j(this.onBackPressedCallback);
                return;
            }
            if (event != AbstractC2185j.a.ON_STOP) {
                if (event == AbstractC2185j.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC2036c interfaceC2036c = this.currentCancellable;
                if (interfaceC2036c != null) {
                    interfaceC2036c.cancel();
                }
            }
        }
    }

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(C2035b backEvent) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            OnBackPressedDispatcher.this.n(backEvent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2035b) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(C2035b backEvent) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            OnBackPressedDispatcher.this.m(backEvent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2035b) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m37invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m37invoke() {
            OnBackPressedDispatcher.this.l();
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m38invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m38invoke() {
            OnBackPressedDispatcher.this.k();
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m39invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m39invoke() {
            OnBackPressedDispatcher.this.l();
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f16383a = new f();

        public static final void c(Function0 function0) {
            function0.invoke();
        }

        public final OnBackInvokedCallback b(final Function0 onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.G
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.f.c(Function0.this);
                }
            };
        }

        public final void d(Object dispatcher, int i10, Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) callback);
        }

        public final void e(Object dispatcher, Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public static final g f16384a = new g();

        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function1 f16385a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Function1 f16386b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Function0 f16387c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Function0 f16388d;

            public a(Function1 function1, Function1 function12, Function0 function0, Function0 function02) {
                this.f16385a = function1;
                this.f16386b = function12;
                this.f16387c = function0;
                this.f16388d = function02;
            }

            public void onBackCancelled() {
                this.f16388d.invoke();
            }

            public void onBackInvoked() {
                this.f16387c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                this.f16386b.invoke(new C2035b(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                this.f16385a.invoke(new C2035b(backEvent));
            }
        }

        public final OnBackInvokedCallback a(Function1 onBackStarted, Function1 onBackProgressed, Function0 onBackInvoked, Function0 onBackCancelled) {
            Intrinsics.checkNotNullParameter(onBackStarted, "onBackStarted");
            Intrinsics.checkNotNullParameter(onBackProgressed, "onBackProgressed");
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            Intrinsics.checkNotNullParameter(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    public final class h implements InterfaceC2036c {

        /* renamed from: a, reason: collision with root package name */
        public final F f16389a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f16390b;

        public h(OnBackPressedDispatcher onBackPressedDispatcher, F onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f16390b = onBackPressedDispatcher;
            this.f16389a = onBackPressedCallback;
        }

        @Override // androidx.activity.InterfaceC2036c
        public void cancel() {
            this.f16390b.f16368c.remove(this.f16389a);
            if (Intrinsics.areEqual(this.f16390b.f16369d, this.f16389a)) {
                this.f16389a.handleOnBackCancelled();
                this.f16390b.f16369d = null;
            }
            this.f16389a.removeCancellable(this);
            Function0<Unit> enabledChangedCallback$activity_release = this.f16389a.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.f16389a.setEnabledChangedCallback$activity_release(null);
        }
    }

    public /* synthetic */ class i extends FunctionReferenceImpl implements Function0 {
        public i(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m40invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m40invoke() {
            ((OnBackPressedDispatcher) this.receiver).q();
        }
    }

    public /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {
        public j(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m41invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m41invoke() {
            ((OnBackPressedDispatcher) this.receiver).q();
        }
    }

    public OnBackPressedDispatcher(Runnable runnable, InterfaceC6772a interfaceC6772a) {
        this.f16366a = runnable;
        this.f16367b = interfaceC6772a;
        this.f16368c = new ArrayDeque();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f16370e = i10 >= 34 ? g.f16384a.a(new a(), new b(), new c(), new d()) : f.f16383a.b(new e());
        }
    }

    public final void h(F onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        j(onBackPressedCallback);
    }

    public final void i(InterfaceC2193s owner, F onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        AbstractC2185j lifecycle = owner.getLifecycle();
        if (lifecycle.b() == AbstractC2185j.b.f20390a) {
            return;
        }
        onBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        q();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new i(this));
    }

    public final InterfaceC2036c j(F onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f16368c.add(onBackPressedCallback);
        h hVar = new h(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(hVar);
        q();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new j(this));
        return hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void k() {
        F f10;
        F f11 = this.f16369d;
        if (f11 == null) {
            ArrayDeque arrayDeque = this.f16368c;
            ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    f10 = 0;
                    break;
                } else {
                    f10 = listIterator.previous();
                    if (((F) f10).isEnabled()) {
                        break;
                    }
                }
            }
            f11 = f10;
        }
        this.f16369d = null;
        if (f11 != null) {
            f11.handleOnBackCancelled();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void l() {
        F f10;
        F f11 = this.f16369d;
        if (f11 == null) {
            ArrayDeque arrayDeque = this.f16368c;
            ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    f10 = 0;
                    break;
                } else {
                    f10 = listIterator.previous();
                    if (((F) f10).isEnabled()) {
                        break;
                    }
                }
            }
            f11 = f10;
        }
        this.f16369d = null;
        if (f11 != null) {
            f11.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.f16366a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public final void m(C2035b c2035b) {
        F f10;
        F f11 = this.f16369d;
        if (f11 == null) {
            ArrayDeque arrayDeque = this.f16368c;
            ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    f10 = 0;
                    break;
                } else {
                    f10 = listIterator.previous();
                    if (((F) f10).isEnabled()) {
                        break;
                    }
                }
            }
            f11 = f10;
        }
        if (f11 != null) {
            f11.handleOnBackProgressed(c2035b);
        }
    }

    public final void n(C2035b c2035b) {
        Object obj;
        ArrayDeque arrayDeque = this.f16368c;
        ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            } else {
                obj = listIterator.previous();
                if (((F) obj).isEnabled()) {
                    break;
                }
            }
        }
        F f10 = (F) obj;
        if (this.f16369d != null) {
            k();
        }
        this.f16369d = f10;
        if (f10 != null) {
            f10.handleOnBackStarted(c2035b);
        }
    }

    public final void o(OnBackInvokedDispatcher invoker) {
        Intrinsics.checkNotNullParameter(invoker, "invoker");
        this.f16371f = invoker;
        p(this.f16373h);
    }

    public final void p(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f16371f;
        OnBackInvokedCallback onBackInvokedCallback = this.f16370e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z10 && !this.f16372g) {
            f.f16383a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f16372g = true;
        } else {
            if (z10 || !this.f16372g) {
                return;
            }
            f.f16383a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f16372g = false;
        }
    }

    public final void q() {
        boolean z10 = this.f16373h;
        ArrayDeque arrayDeque = this.f16368c;
        boolean z11 = false;
        if (arrayDeque == null || !arrayDeque.isEmpty()) {
            Iterator<E> it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((F) it.next()).isEnabled()) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f16373h = z11;
        if (z11 != z10) {
            InterfaceC6772a interfaceC6772a = this.f16367b;
            if (interfaceC6772a != null) {
                interfaceC6772a.accept(Boolean.valueOf(z11));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                p(z11);
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, null);
    }
}
