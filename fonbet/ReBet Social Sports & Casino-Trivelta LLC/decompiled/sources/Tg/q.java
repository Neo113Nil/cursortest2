package Tg;

import Ph.C0;
import Ph.X0;
import ch.C2924a;
import gh.AbstractC4384e;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final a f11939a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final C2924a f11940b = new C2924a("RequestLifecycle");

    public static final class a implements k {

        /* renamed from: Tg.q$a$a, reason: collision with other inner class name */
        public static final class C0240a extends SuspendLambda implements Function3 {

            /* renamed from: n, reason: collision with root package name */
            public int f11941n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f11942o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Ng.a f11943p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0240a(Ng.a aVar, Continuation continuation) {
                super(3, continuation);
                this.f11943p = aVar;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC4384e abstractC4384e, Object obj, Continuation continuation) {
                C0240a c0240a = new C0240a(this.f11943p, continuation);
                c0240a.f11942o = abstractC4384e;
                return c0240a.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Ph.A a10;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f11941n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC4384e abstractC4384e = (AbstractC4384e) this.f11942o;
                    Ph.A a11 = X0.a(((Wg.c) abstractC4384e.b()).g());
                    CoroutineContext.Element element = this.f11943p.getCoroutineContext().get(C0.f9001U2);
                    Intrinsics.checkNotNull(element);
                    r.c(a11, (C0) element);
                    try {
                        ((Wg.c) abstractC4384e.b()).m(a11);
                        this.f11942o = a11;
                        this.f11941n = 1;
                        if (abstractC4384e.c(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        a10 = a11;
                    } catch (Throwable th2) {
                        th = th2;
                        a10 = a11;
                        a10.k(th);
                        throw th;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a10 = (Ph.A) this.f11942o;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            a10.k(th);
                            throw th;
                        } catch (Throwable th4) {
                            a10.y1();
                            throw th4;
                        }
                    }
                }
                a10.y1();
                return Unit.INSTANCE;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Tg.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(q plugin, Ng.a scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.z0().l(Wg.f.f13260g.a(), new C0240a(scope, null));
        }

        @Override // Tg.k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public q a(Function1 block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return new q(null);
        }

        @Override // Tg.k
        public C2924a getKey() {
            return q.f11940b;
        }

        public a() {
        }
    }

    public /* synthetic */ q(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public q() {
    }
}
