package Qg;

import Ph.AbstractC1459k;
import Ph.C0;
import Ph.F0;
import Ph.L;
import Ph.P;
import Ph.X;
import bh.AbstractC2423b;
import bh.C2422a;
import gh.AbstractC4384e;
import hh.AbstractC4509b;
import java.io.Closeable;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;

/* loaded from: classes3.dex */
public interface b extends P, Closeable {

    public static final class a {

        /* renamed from: Qg.b$a$a, reason: collision with other inner class name */
        public static final class C0188a extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public Object f9715n;

            /* renamed from: o, reason: collision with root package name */
            public Object f9716o;

            /* renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f9717p;

            /* renamed from: q, reason: collision with root package name */
            public int f9718q;

            public C0188a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f9717p = obj;
                this.f9718q |= Integer.MIN_VALUE;
                return a.e(null, null, this);
            }
        }

        /* renamed from: Qg.b$a$b, reason: collision with other inner class name */
        public static final class C0189b extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f9719n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ b f9720o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Wg.d f9721p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0189b(b bVar, Wg.d dVar, Continuation continuation) {
                super(2, continuation);
                this.f9720o = bVar;
                this.f9721p = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0189b(this.f9720o, this.f9721p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((C0189b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f9719n;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                if (a.f(this.f9720o)) {
                    throw new Qg.a(null, 1, null);
                }
                b bVar = this.f9720o;
                Wg.d dVar = this.f9721p;
                this.f9719n = 1;
                Object Q12 = bVar.Q1(dVar, this);
                return Q12 == coroutine_suspended ? coroutine_suspended : Q12;
            }
        }

        public static final class c extends SuspendLambda implements Function3 {

            /* renamed from: n, reason: collision with root package name */
            public int f9722n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f9723o;

            /* renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f9724p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ Ng.a f9725q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ b f9726r;

            /* renamed from: Qg.b$a$c$a, reason: collision with other inner class name */
            public static final class C0190a extends Lambda implements Function1 {

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Ng.a f9727d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Xg.c f9728e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0190a(Ng.a aVar, Xg.c cVar) {
                    super(1);
                    this.f9727d = aVar;
                    this.f9728e = cVar;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(Throwable th2) {
                    if (th2 != null) {
                        this.f9727d.U().a(Yg.b.c(), this.f9728e);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Ng.a aVar, b bVar, Continuation continuation) {
                super(3, continuation);
                this.f9725q = aVar;
                this.f9726r = bVar;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC4384e abstractC4384e, Object obj, Continuation continuation) {
                c cVar = new c(this.f9725q, this.f9726r, continuation);
                cVar.f9723o = abstractC4384e;
                cVar.f9724p = obj;
                return cVar.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x00f0, code lost:
            
                if (r3.e(r5, r9) == r0) goto L23;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Wg.d b10;
                AbstractC4384e abstractC4384e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f9722n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC4384e abstractC4384e2 = (AbstractC4384e) this.f9723o;
                    Object obj2 = this.f9724p;
                    Wg.c cVar = new Wg.c();
                    cVar.p((Wg.c) abstractC4384e2.b());
                    if (obj2 == null) {
                        cVar.j(C2422a.f25189a);
                        KType typeOf = Reflection.typeOf(Object.class);
                        cVar.k(AbstractC4509b.b(TypesJVMKt.getJavaType(typeOf), Reflection.getOrCreateKotlinClass(Object.class), typeOf));
                    } else if (obj2 instanceof AbstractC2423b) {
                        cVar.j(obj2);
                        cVar.k(null);
                    } else {
                        cVar.j(obj2);
                        KType typeOf2 = Reflection.typeOf(Object.class);
                        cVar.k(AbstractC4509b.b(TypesJVMKt.getJavaType(typeOf2), Reflection.getOrCreateKotlinClass(Object.class), typeOf2));
                    }
                    this.f9725q.U().a(Yg.b.b(), cVar);
                    b10 = cVar.b();
                    b10.a().b(i.c(), this.f9725q.B());
                    i.d(b10);
                    a.d(this.f9726r, b10);
                    b bVar = this.f9726r;
                    this.f9723o = abstractC4384e2;
                    this.f9724p = b10;
                    this.f9722n = 1;
                    Object e10 = a.e(bVar, b10, this);
                    if (e10 != coroutine_suspended) {
                        abstractC4384e = abstractC4384e2;
                        obj = e10;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                b10 = (Wg.d) this.f9724p;
                abstractC4384e = (AbstractC4384e) this.f9723o;
                ResultKt.throwOnFailure(obj);
                Og.b bVar2 = new Og.b(this.f9725q, b10, (Wg.g) obj);
                Xg.c f10 = bVar2.f();
                this.f9725q.U().a(Yg.b.e(), f10);
                F0.n(f10.getCoroutineContext()).invokeOnCompletion(new C0190a(this.f9725q, f10));
                this.f9723o = null;
                this.f9724p = null;
                this.f9722n = 2;
            }
        }

        public static void d(b bVar, Wg.d dVar) {
            for (e eVar : dVar.g()) {
                if (!bVar.Z0().contains(eVar)) {
                    throw new IllegalArgumentException(("Engine doesn't support " + eVar).toString());
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        
            if (r12 == r1) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x007a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object e(b bVar, Wg.d dVar, Continuation continuation) {
            C0188a c0188a;
            int i10;
            X b10;
            if (continuation instanceof C0188a) {
                c0188a = (C0188a) continuation;
                int i11 = c0188a.f9718q;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c0188a.f9718q = i11 - Integer.MIN_VALUE;
                    Object obj = c0188a.f9717p;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = c0188a.f9718q;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        C0 d10 = dVar.d();
                        c0188a.f9715n = bVar;
                        c0188a.f9716o = dVar;
                        c0188a.f9718q = 1;
                        obj = i.b(bVar, d10, c0188a);
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        dVar = (Wg.d) c0188a.f9716o;
                        bVar = (b) c0188a.f9715n;
                        ResultKt.throwOnFailure(obj);
                    }
                    b bVar2 = bVar;
                    CoroutineContext coroutineContext = (CoroutineContext) obj;
                    b10 = AbstractC1459k.b(bVar2, coroutineContext.plus(new j(coroutineContext)), null, new C0189b(bVar2, dVar, null), 2, null);
                    c0188a.f9715n = null;
                    c0188a.f9716o = null;
                    c0188a.f9718q = 2;
                    Object await = b10.await(c0188a);
                    return await != coroutine_suspended ? coroutine_suspended : await;
                }
            }
            c0188a = new C0188a(continuation);
            Object obj2 = c0188a.f9717p;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = c0188a.f9718q;
            if (i10 != 0) {
            }
            b bVar22 = bVar;
            CoroutineContext coroutineContext2 = (CoroutineContext) obj2;
            b10 = AbstractC1459k.b(bVar22, coroutineContext2.plus(new j(coroutineContext2)), null, new C0189b(bVar22, dVar, null), 2, null);
            c0188a.f9715n = null;
            c0188a.f9716o = null;
            c0188a.f9718q = 2;
            Object await2 = b10.await(c0188a);
            if (await2 != coroutine_suspended2) {
            }
        }

        public static boolean f(b bVar) {
            return !(((C0) bVar.getCoroutineContext().get(C0.f9001U2)) != null ? r1.isActive() : false);
        }

        public static Set g(b bVar) {
            return SetsKt.emptySet();
        }

        public static void h(b bVar, Ng.a client) {
            Intrinsics.checkNotNullParameter(client, "client");
            client.D0().l(Wg.h.f13274g.a(), new c(client, bVar, null));
        }
    }

    g N();

    Object Q1(Wg.d dVar, Continuation continuation);

    L R1();

    Set Z0();

    void k0(Ng.a aVar);
}
