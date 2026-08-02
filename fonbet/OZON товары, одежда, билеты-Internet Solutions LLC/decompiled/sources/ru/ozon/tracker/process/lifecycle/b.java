package ru.ozon.tracker.process.lifecycle;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2397i;
import Je.InterfaceC3394a;
import Sc.s;
import fd.InterfaceC6511n;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.tracker.process.lifecycle.ApplicationLifecycleState;
import xe.B0;
import xe.C10727i;
import xe.I;
import xe.M;
import xe.N;

@e(c = "ru.ozon.tracker.process.lifecycle.LifecycleActionExecutor$repeatOnLifecycle$2", f = "LifecycleActionExecutor.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class b extends j implements Function2<M, d<? super B0>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f97838d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ru.ozon.tracker.process.lifecycle.a f97839e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ApplicationLifecycleState f97840f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ j f97841g;

    @e(c = "ru.ozon.tracker.process.lifecycle.LifecycleActionExecutor$repeatOnLifecycle$2$1", f = "LifecycleActionExecutor.kt", l = {}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, d<? super B0>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f97842d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ApplicationLifecycleState f97843e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.tracker.process.lifecycle.a f97844f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ j f97845g;

        @e(c = "ru.ozon.tracker.process.lifecycle.LifecycleActionExecutor$repeatOnLifecycle$2$1$1", f = "LifecycleActionExecutor.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ru.ozon.tracker.process.lifecycle.b$a$a, reason: collision with other inner class name */
        static final class C2150a extends j implements Function2<ApplicationLifecycleState, d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f97846d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ApplicationLifecycleState f97847e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.M<B0> f97848f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ M f97849g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ ApplicationLifecycleState f97850h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Je.d f97851i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ j f97852j;

            @e(c = "ru.ozon.tracker.process.lifecycle.LifecycleActionExecutor$repeatOnLifecycle$2$1$1$1", f = "LifecycleActionExecutor.kt", l = {91, 59}, m = "invokeSuspend")
            /* renamed from: ru.ozon.tracker.process.lifecycle.b$a$a$a, reason: collision with other inner class name */
            static final class C2151a extends j implements Function2<M, d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                InterfaceC3394a f97853d;

                /* renamed from: e, reason: collision with root package name */
                j f97854e;

                /* renamed from: f, reason: collision with root package name */
                kotlin.jvm.internal.M f97855f;

                /* renamed from: g, reason: collision with root package name */
                int f97856g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Je.d f97857h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ j f97858i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.M<B0> f97859j;

                @e(c = "ru.ozon.tracker.process.lifecycle.LifecycleActionExecutor$repeatOnLifecycle$2$1$1$1$1$1", f = "LifecycleActionExecutor.kt", l = {61}, m = "invokeSuspend")
                /* renamed from: ru.ozon.tracker.process.lifecycle.b$a$a$a$a, reason: collision with other inner class name */
                static final class C2152a extends j implements Function2<M, d<? super Unit>, Object> {

                    /* renamed from: d, reason: collision with root package name */
                    int f97860d;

                    /* renamed from: e, reason: collision with root package name */
                    private /* synthetic */ Object f97861e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ Function2<M, d<? super Unit>, Object> f97862f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ kotlin.jvm.internal.M<B0> f97863g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C2152a(Function2<? super M, ? super d<? super Unit>, ? extends Object> function2, kotlin.jvm.internal.M<B0> m11, d<? super C2152a> dVar) {
                        super(2, dVar);
                        this.f97862f = function2;
                        this.f97863g = m11;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final d<Unit> create(Object obj, d<?> dVar) {
                        C2152a c2152a = new C2152a(this.f97862f, this.f97863g, dVar);
                        c2152a.f97861e = obj;
                        return c2152a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(M m11, d<? super Unit> dVar) {
                        return ((C2152a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        int i11 = this.f97860d;
                        try {
                            if (i11 == 0) {
                                s.b(obj);
                                M m11 = (M) this.f97861e;
                                Function2<M, d<? super Unit>, Object> function2 = this.f97862f;
                                this.f97860d = 1;
                                if (function2.invoke(m11, this) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj);
                            }
                        } catch (Throwable th2) {
                            a.a(this.f97863g, th2);
                        }
                        return Unit.f71690a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2151a(Je.d dVar, Function2 function2, kotlin.jvm.internal.M m11, d dVar2) {
                    super(2, dVar2);
                    this.f97857h = dVar;
                    this.f97858i = (j) function2;
                    this.f97859j = m11;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
                @Override // kotlin.coroutines.jvm.internal.a
                public final d<Unit> create(Object obj, d<?> dVar) {
                    return new C2151a(this.f97857h, this.f97858i, this.f97859j, dVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(M m11, d<? super Unit> dVar) {
                    return ((C2151a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v2 */
                /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function2] */
                /* JADX WARN: Type inference failed for: r3v6 */
                /* JADX WARN: Type inference failed for: r5v2, types: [Je.a] */
                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Je.d dVar;
                    ?? r32;
                    kotlin.jvm.internal.M<B0> m11;
                    InterfaceC3394a interfaceC3394a;
                    Throwable th2;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    int i11 = this.f97856g;
                    try {
                        if (i11 == 0) {
                            s.b(obj);
                            dVar = this.f97857h;
                            this.f97853d = dVar;
                            j jVar = this.f97858i;
                            this.f97854e = jVar;
                            kotlin.jvm.internal.M<B0> m12 = this.f97859j;
                            this.f97855f = m12;
                            this.f97856g = 1;
                            if (dVar.a(this) != aVar) {
                                r32 = jVar;
                                m11 = m12;
                            }
                            return aVar;
                        }
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC3394a = this.f97853d;
                            try {
                                s.b(obj);
                                Unit unit = Unit.f71690a;
                                interfaceC3394a.c(null);
                                return Unit.f71690a;
                            } catch (Throwable th3) {
                                th2 = th3;
                                interfaceC3394a.c(null);
                                throw th2;
                            }
                        }
                        m11 = this.f97855f;
                        Function2 function2 = (Function2) this.f97854e;
                        ?? r52 = this.f97853d;
                        s.b(obj);
                        dVar = r52;
                        r32 = function2;
                        C2152a c2152a = new C2152a(r32, m11, null);
                        this.f97853d = dVar;
                        this.f97854e = null;
                        this.f97855f = null;
                        this.f97856g = 2;
                        if (N.d(c2152a, this) != aVar) {
                            interfaceC3394a = dVar;
                            Unit unit2 = Unit.f71690a;
                            interfaceC3394a.c(null);
                            return Unit.f71690a;
                        }
                        return aVar;
                    } catch (Throwable th4) {
                        interfaceC3394a = dVar;
                        th2 = th4;
                        interfaceC3394a.c(null);
                        throw th2;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2150a(ApplicationLifecycleState applicationLifecycleState, kotlin.jvm.internal.M m11, M m12, ApplicationLifecycleState applicationLifecycleState2, Je.d dVar, Function2 function2, d dVar2) {
                super(2, dVar2);
                this.f97847e = applicationLifecycleState;
                this.f97848f = m11;
                this.f97849g = m12;
                this.f97850h = applicationLifecycleState2;
                this.f97851i = dVar;
                this.f97852j = (j) function2;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                Je.d dVar2 = this.f97851i;
                ?? r62 = this.f97852j;
                C2150a c2150a = new C2150a(this.f97847e, this.f97848f, this.f97849g, this.f97850h, dVar2, r62, dVar);
                c2150a.f97846d = obj;
                return c2150a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApplicationLifecycleState applicationLifecycleState, d<? super Unit> dVar) {
                return ((C2150a) create(applicationLifecycleState, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
            /* JADX WARN: Type inference failed for: r5v6, types: [T, xe.B0] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                ApplicationLifecycleState applicationLifecycleState = (ApplicationLifecycleState) this.f97846d;
                kotlin.jvm.internal.M<B0> m11 = this.f97848f;
                if (applicationLifecycleState == this.f97847e) {
                    m11.f71787a = C10727i.c(this.f97849g, null, null, new C2151a(this.f97851i, this.f97852j, m11, null), 3);
                } else {
                    ApplicationLifecycleState applicationLifecycleState2 = this.f97850h;
                    if (applicationLifecycleState == applicationLifecycleState2) {
                        a.a(m11, new Exception("Cancel observing by event: " + applicationLifecycleState2));
                    }
                }
                return Unit.f71690a;
            }
        }

        @e(c = "ru.ozon.tracker.process.lifecycle.LifecycleActionExecutor$repeatOnLifecycle$2$1$2", f = "LifecycleActionExecutor.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ru.ozon.tracker.process.lifecycle.b$a$b, reason: collision with other inner class name */
        static final class C2153b extends j implements InterfaceC6511n<InterfaceC2397i<? super ApplicationLifecycleState>, Throwable, d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Throwable f97864d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.M<B0> f97865e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2153b(kotlin.jvm.internal.M<B0> m11, d<? super C2153b> dVar) {
                super(3, dVar);
                this.f97865e = m11;
            }

            @Override // fd.InterfaceC6511n
            public final Object invoke(InterfaceC2397i<? super ApplicationLifecycleState> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
                C2153b c2153b = new C2153b(this.f97865e, dVar);
                c2153b.f97864d = th2;
                return c2153b.invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                a.a(this.f97865e, this.f97864d);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(d dVar, Function2 function2, ApplicationLifecycleState applicationLifecycleState, ru.ozon.tracker.process.lifecycle.a aVar) {
            super(2, dVar);
            this.f97843e = applicationLifecycleState;
            this.f97844f = aVar;
            this.f97845g = (j) function2;
        }

        public static final void a(kotlin.jvm.internal.M m11, Throwable th2) {
            B0 b02 = (B0) m11.f71787a;
            if (b02 != null) {
                CancellationException cancellationException = new CancellationException(th2 != null ? th2.toString() : null);
                cancellationException.initCause(th2);
                b02.j(cancellationException);
            }
            m11.f71787a = null;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            a aVar = new a(dVar, this.f97845g, this.f97843e, this.f97844f);
            aVar.f97842d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super B0> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            M m11 = (M) this.f97842d;
            ApplicationLifecycleState.INSTANCE.getClass();
            ApplicationLifecycleState a11 = ApplicationLifecycleState.Companion.a(this.f97843e);
            Je.d a12 = Je.e.a();
            kotlin.jvm.internal.M m12 = new kotlin.jvm.internal.M();
            return C2399j.C(new C(new C2408n0(ru.ozon.tracker.process.lifecycle.a.b(this.f97844f).getState(), new C2150a(this.f97843e, m12, m11, a11, a12, this.f97845g, null)), new C2153b(m12, null)), m11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    b(d dVar, Function2 function2, ApplicationLifecycleState applicationLifecycleState, ru.ozon.tracker.process.lifecycle.a aVar) {
        super(2, dVar);
        this.f97839e = aVar;
        this.f97840f = applicationLifecycleState;
        this.f97841g = (j) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new b(dVar, this.f97841g, this.f97840f, this.f97839e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super B0> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        I i11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i12 = this.f97838d;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        ru.ozon.tracker.process.lifecycle.a aVar2 = this.f97839e;
        i11 = aVar2.f97835a;
        a aVar3 = new a(null, this.f97841g, this.f97840f, aVar2);
        this.f97838d = 1;
        Object f7 = C10727i.f(i11, aVar3, this);
        return f7 == aVar ? aVar : f7;
    }
}
