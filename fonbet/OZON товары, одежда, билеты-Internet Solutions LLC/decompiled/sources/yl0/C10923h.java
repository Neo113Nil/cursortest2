package yl0;

import Bl0.j0;
import Sc.r;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: yl0.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10923h<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f106778a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f106779b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Sc.r<? extends T> f106780c;

    /* renamed from: yl0.h$a */
    public final class a {
        public a() {
        }

        public final void a(@NotNull Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            C10923h.c(C10923h.this, error);
        }

        public final void b(T t2) {
            C10923h.b(C10923h.this, t2);
        }
    }

    public /* synthetic */ C10923h(int i11) {
        this();
    }

    public static final /* synthetic */ void a(C10923h c10923h, Executor executor, Function0 function0) {
        c10923h.getClass();
        k(executor, function0);
    }

    public static final void b(C10923h c10923h, Object obj) {
        synchronized (c10923h) {
            if (c10923h.f106780c != null) {
                return;
            }
            c10923h.f106780c = Sc.r.a(obj);
            j0.c(c10923h.f106778a, new C10930o(c10923h, obj));
            j0.c(c10923h.f106779b, new C10928m(c10923h, null));
            Unit unit = Unit.f71690a;
        }
    }

    public static final void c(C10923h c10923h, Throwable th2) {
        synchronized (c10923h) {
            if (c10923h.f106780c != null) {
                return;
            }
            r.Companion companion = Sc.r.INSTANCE;
            c10923h.f106780c = Sc.r.a(Sc.s.a(th2));
            j0.c(c10923h.f106778a, new C10932q(c10923h, th2));
            j0.c(c10923h.f106779b, new C10928m(c10923h, th2));
            Unit unit = Unit.f71690a;
        }
    }

    private final void d(Executor executor, InterfaceC10918c interfaceC10918c) {
        synchronized (this) {
            try {
                Sc.r<? extends T> rVar = this.f106780c;
                if (rVar == null) {
                    this.f106779b.add(new C10916a(executor, interfaceC10918c));
                } else {
                    k(executor, new C10924i(interfaceC10918c, Sc.r.b(rVar.getF26106a())));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void e(InterfaceC10920e interfaceC10920e, InterfaceC10919d interfaceC10919d) {
        synchronized (this) {
            try {
                Sc.r<? extends T> rVar = this.f106780c;
                if (rVar == null) {
                    this.f106778a.add(new C10917b(interfaceC10920e, interfaceC10919d));
                } else {
                    Object f26106a = rVar.getF26106a();
                    if (f26106a instanceof r.b) {
                        f26106a = null;
                    }
                    Throwable b11 = Sc.r.b(rVar.getF26106a());
                    if (f26106a != null && interfaceC10920e != null) {
                        k(null, new C10925j(interfaceC10920e, f26106a));
                    }
                    if (b11 != null && interfaceC10919d != null) {
                        k(null, new C10926k(interfaceC10919d, b11));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void k(Executor executor, final Function0 function0) {
        if (executor != null) {
            executor.execute(new NJ.a(function0));
        } else {
            t.b().post(new Runnable(function0) { // from class: yl0.f

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ AbstractC7737t f106776a;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f106776a = (AbstractC7737t) function0;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
                @Override // java.lang.Runnable
                public final void run() {
                    this.f106776a.invoke();
                }
            });
        }
    }

    @NotNull
    public final void f(@NotNull Executor executor, @NotNull InterfaceC10918c onCompletionListener) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(onCompletionListener, "onCompletionListener");
        d(executor, onCompletionListener);
    }

    @NotNull
    public final void g(@NotNull InterfaceC10918c onCompletionListener) {
        Intrinsics.checkNotNullParameter(onCompletionListener, "onCompletionListener");
        d(null, onCompletionListener);
    }

    @NotNull
    public final void h(@NotNull InterfaceC10919d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        e(null, listener);
    }

    @NotNull
    public final void i(@NotNull InterfaceC10920e listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        e(listener, null);
    }

    public final T j() {
        TimeUnit unit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (this.f106780c != null) {
            countDownLatch.countDown();
        } else {
            d(t.a(), new InterfaceC10918c() { // from class: yl0.g
                @Override // yl0.InterfaceC10918c
                public final void onComplete() {
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();
        Sc.r<? extends T> rVar = this.f106780c;
        if (rVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        T t2 = (T) rVar.getF26106a();
        Sc.s.b(t2);
        return t2;
    }

    private C10923h() {
        this.f106778a = new ArrayList();
        this.f106779b = new ArrayList();
    }
}
