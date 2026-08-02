package d5;

import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.P;
import Ph.Q;
import d5.AbstractC4007c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;
import s5.C6339a;
import y5.C6854a;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final b5.d f44989a;

    /* renamed from: b, reason: collision with root package name */
    public final N5.a f44990b;

    /* renamed from: c, reason: collision with root package name */
    public P f44991c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f44992d;

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44993n;

        /* renamed from: d5.i$a$a, reason: collision with other inner class name */
        public static final class C0653a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f44995a;

            public C0653a(i iVar) {
                this.f44995a = iVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C5.b bVar, Continuation continuation) {
                this.f44995a.d().a(new AbstractC4007c.AbstractC0652c.b(new C6854a(bVar.a(), bVar.b()), this.f44995a.f44990b.k().c().w()));
                return Unit.INSTANCE;
            }
        }

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return i.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44993n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5321f s10 = C5.d.f1144a.s();
                C0653a c0653a = new C0653a(i.this);
                this.f44993n = 1;
                if (s10.collect(c0653a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44996n;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f44998a;

            public a(i iVar) {
                this.f44998a = iVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C5.b bVar, Continuation continuation) {
                this.f44998a.d().a(new AbstractC4007c.AbstractC0652c.a(new C6854a(bVar.a(), bVar.b())));
                return Unit.INSTANCE;
            }
        }

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return i.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44996n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5321f v10 = C5.d.f1144a.v();
                a aVar = new a(i.this);
                this.f44996n = 1;
                if (v10.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44999n;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f45001a;

            public a(i iVar) {
                this.f45001a = iVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C5.c cVar, Continuation continuation) {
                this.f45001a.d().a(new AbstractC4007c.a(this.f45001a.f(cVar.a(), cVar.b()), new C6854a(cVar.c(), cVar.d()), this.f45001a.f44990b.k().c().w()));
                return Unit.INSTANCE;
            }
        }

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return i.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44999n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5321f u10 = C5.d.f1144a.u();
                a aVar = new a(i.this);
                this.f44999n = 1;
                if (u10.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f45002n;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f45004a;

            public a(i iVar) {
                this.f45004a = iVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C5.a aVar, Continuation continuation) {
                this.f45004a.d().a(new AbstractC4007c.b(this.f45004a.e(aVar.a(), aVar.b()), new C6854a(aVar.c(), aVar.d()), this.f45004a.f44990b.k().c().w()));
                return Unit.INSTANCE;
            }
        }

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return i.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f45002n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5321f t10 = C5.d.f1144a.t();
                a aVar = new a(i.this);
                this.f45002n = 1;
                if (t10.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public i(b5.d monitorListener, N5.a configurationsManager) {
        Intrinsics.checkNotNullParameter(monitorListener, "monitorListener");
        Intrinsics.checkNotNullParameter(configurationsManager, "configurationsManager");
        this.f44989a = monitorListener;
        this.f44990b = configurationsManager;
    }

    public b5.d d() {
        return this.f44989a;
    }

    public final EnumC4005a e(float f10, float f11) {
        return Math.abs(f10) > Math.abs(f11) ? f10 > 0.0f ? EnumC4005a.f44963e : EnumC4005a.f44962d : f11 > 0.0f ? EnumC4005a.f44960b : EnumC4005a.f44961c;
    }

    public final EnumC4005a f(float f10, float f11) {
        return Math.abs(f10) > Math.abs(f11) ? f10 > 0.0f ? EnumC4005a.f44962d : EnumC4005a.f44963e : f11 > 0.0f ? EnumC4005a.f44961c : EnumC4005a.f44960b;
    }

    public synchronized void g() {
        P p10;
        P p11;
        P p12;
        try {
            if (this.f44992d) {
                return;
            }
            E5.b.f3006a.a("user interaction monitor started");
            P a10 = C6339a.f64787a.a();
            this.f44991c = a10;
            if (a10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("monitorScope");
                p10 = null;
            } else {
                p10 = a10;
            }
            AbstractC1459k.d(p10, C1452g0.c(), null, new a(null), 2, null);
            P p13 = this.f44991c;
            if (p13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("monitorScope");
                p11 = null;
            } else {
                p11 = p13;
            }
            AbstractC1459k.d(p11, C1452g0.c(), null, new b(null), 2, null);
            P p14 = this.f44991c;
            if (p14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("monitorScope");
                p12 = null;
            } else {
                p12 = p14;
            }
            AbstractC1459k.d(p12, C1452g0.c(), null, new c(null), 2, null);
            P p15 = this.f44991c;
            if (p15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("monitorScope");
                p15 = null;
            }
            AbstractC1459k.d(p15, C1452g0.c(), null, new d(null), 2, null);
            this.f44992d = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void h() {
        try {
            if (this.f44992d) {
                E5.b.f3006a.a("user interaction monitor stopped");
                P p10 = this.f44991c;
                if (p10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("monitorScope");
                    p10 = null;
                }
                Q.f(p10, null, 1, null);
                this.f44992d = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
