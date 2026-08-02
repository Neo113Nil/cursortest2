package td;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import Ph.P;
import Ph.Q;
import Ph.X0;
import Wh.g;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: td.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6461a {

    /* renamed from: a, reason: collision with root package name */
    public static final C6461a f65810a = new C6461a();

    /* renamed from: b, reason: collision with root package name */
    public static P f65811b = Q.a(X0.b(null, 1, null).plus(C1452g0.b()));

    /* renamed from: c, reason: collision with root package name */
    public static P f65812c = Q.a(X0.b(null, 1, null).plus(C1452g0.c()));

    /* renamed from: d, reason: collision with root package name */
    public static P f65813d = Q.a(X0.b(null, 1, null).plus(C1452g0.c()));

    /* renamed from: td.a$a, reason: collision with other inner class name */
    public static final class C0913a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0914a f65814a = new C0914a(null);

        /* renamed from: b, reason: collision with root package name */
        public static final Wh.a f65815b = g.b(false, 1, null);

        /* renamed from: c, reason: collision with root package name */
        public static final Wh.a f65816c = g.b(false, 1, null);

        /* renamed from: d, reason: collision with root package name */
        public static final Wh.a f65817d = g.b(false, 1, null);

        /* renamed from: e, reason: collision with root package name */
        public static final Wh.a f65818e = g.b(false, 1, null);

        /* renamed from: f, reason: collision with root package name */
        public static final Wh.a f65819f = g.b(false, 1, null);

        /* renamed from: td.a$a$a, reason: collision with other inner class name */
        public static final class C0914a {
            public /* synthetic */ C0914a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Wh.a a() {
                return C0913a.f65815b;
            }

            public final Wh.a b() {
                return C0913a.f65818e;
            }

            public final Wh.a c() {
                return C0913a.f65819f;
            }

            public final Wh.a d() {
                return C0913a.f65816c;
            }

            public C0914a() {
            }
        }
    }

    /* renamed from: td.a$b */
    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f65820n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Function1 f65821o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f65821o = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f65821o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f65820n;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Function1 function1 = this.f65821o;
            this.f65820n = 1;
            Object invoke = function1.invoke(this);
            return invoke == coroutine_suspended ? coroutine_suspended : invoke;
        }
    }

    /* renamed from: td.a$c */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f65822n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Function1 f65823o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f65823o = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f65823o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f65822n;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Function1 function1 = this.f65823o;
            this.f65822n = 1;
            Object invoke = function1.invoke(this);
            return invoke == coroutine_suspended ? coroutine_suspended : invoke;
        }
    }

    public final void a() {
        Q.f(f65811b, null, 1, null);
        f65811b = Q.a(X0.a(null).plus(C1452g0.b()));
        Q.f(f65812c, null, 1, null);
        f65812c = Q.a(X0.a(null).plus(C1452g0.c()));
    }

    public final Object b(Function1 function1, Continuation continuation) {
        return AbstractC1455i.g(C1452g0.b(), new b(function1, null), continuation);
    }

    public final Object c(Function1 function1, Continuation continuation) {
        return AbstractC1455i.g(C1452g0.c(), new c(function1, null), continuation);
    }

    public final P d() {
        return f65812c;
    }

    public final P e() {
        return f65811b;
    }

    public final P f() {
        return f65813d;
    }
}
