package androidx.room;

import Ph.AbstractC1455i;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.C1469p;
import Ph.C1483w0;
import Ph.InterfaceC1465n;
import Ph.P;
import Ph.Q;
import android.os.CancellationSignal;
import androidx.room.q;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;

/* renamed from: androidx.room.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2268f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23330a = new a(null);

    /* renamed from: androidx.room.f$a */
    public static final class a {

        /* renamed from: androidx.room.f$a$a, reason: collision with other inner class name */
        public static final class C0403a extends SuspendLambda implements Function2 {
            final /* synthetic */ String[] $tableNames;

            /* renamed from: n, reason: collision with root package name */
            public int f23331n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f23332o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ boolean f23333p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ w f23334q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ Callable f23335r;

            /* renamed from: androidx.room.f$a$a$a, reason: collision with other inner class name */
            public static final class C0404a extends SuspendLambda implements Function2 {
                final /* synthetic */ String[] $tableNames;

                /* renamed from: n, reason: collision with root package name */
                public int f23336n;

                /* renamed from: o, reason: collision with root package name */
                public /* synthetic */ Object f23337o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ boolean f23338p;

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ w f23339q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ InterfaceC5322g f23340r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ Callable f23341s;

                /* renamed from: androidx.room.f$a$a$a$a, reason: collision with other inner class name */
                public static final class C0405a extends SuspendLambda implements Function2 {

                    /* renamed from: n, reason: collision with root package name */
                    public Object f23342n;

                    /* renamed from: o, reason: collision with root package name */
                    public int f23343o;

                    /* renamed from: p, reason: collision with root package name */
                    public final /* synthetic */ w f23344p;

                    /* renamed from: q, reason: collision with root package name */
                    public final /* synthetic */ b f23345q;

                    /* renamed from: r, reason: collision with root package name */
                    public final /* synthetic */ Rh.j f23346r;

                    /* renamed from: s, reason: collision with root package name */
                    public final /* synthetic */ Callable f23347s;

                    /* renamed from: t, reason: collision with root package name */
                    public final /* synthetic */ Rh.j f23348t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0405a(w wVar, b bVar, Rh.j jVar, Callable callable, Rh.j jVar2, Continuation continuation) {
                        super(2, continuation);
                        this.f23344p = wVar;
                        this.f23345q = bVar;
                        this.f23346r = jVar;
                        this.f23347s = callable;
                        this.f23348t = jVar2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C0405a(this.f23344p, this.f23345q, this.f23346r, this.f23347s, this.f23348t, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(P p10, Continuation continuation) {
                        return ((C0405a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
                    
                        if (r4.o(r7, r6) == r0) goto L26;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:9:0x003d, B:15:0x004b, B:17:0x0053, B:25:0x0025, B:27:0x0037), top: B:2:0x0008 }] */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0066 -> B:8:0x0015). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(Object obj) {
                        Rh.l it;
                        Rh.l lVar;
                        Object b10;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i10 = this.f23343o;
                        try {
                            if (i10 == 0) {
                                ResultKt.throwOnFailure(obj);
                                this.f23344p.getInvalidationTracker().c(this.f23345q);
                                it = this.f23346r.iterator();
                                this.f23342n = it;
                                this.f23343o = 1;
                                b10 = it.b(this);
                                if (b10 != coroutine_suspended) {
                                }
                            } else if (i10 == 1) {
                                lVar = (Rh.l) this.f23342n;
                                ResultKt.throwOnFailure(obj);
                                if (((Boolean) obj).booleanValue()) {
                                }
                            } else {
                                if (i10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                lVar = (Rh.l) this.f23342n;
                                ResultKt.throwOnFailure(obj);
                                it = lVar;
                                this.f23342n = it;
                                this.f23343o = 1;
                                b10 = it.b(this);
                                if (b10 != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                lVar = it;
                                obj = b10;
                                if (((Boolean) obj).booleanValue()) {
                                    this.f23344p.getInvalidationTracker().p(this.f23345q);
                                    return Unit.INSTANCE;
                                }
                                lVar.next();
                                Object call = this.f23347s.call();
                                Rh.j jVar = this.f23348t;
                                this.f23342n = lVar;
                                this.f23343o = 2;
                            }
                        } catch (Throwable th2) {
                            this.f23344p.getInvalidationTracker().p(this.f23345q);
                            throw th2;
                        }
                    }
                }

                /* renamed from: androidx.room.f$a$a$a$b */
                public static final class b extends q.c {

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ Rh.j f23349a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(String[] strArr, Rh.j jVar) {
                        super(strArr);
                        this.f23349a = jVar;
                    }

                    @Override // androidx.room.q.c
                    public void c(Set set) {
                        this.f23349a.h(Unit.INSTANCE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0404a(boolean z10, w wVar, InterfaceC5322g interfaceC5322g, String[] strArr, Callable callable, Continuation continuation) {
                    super(2, continuation);
                    this.f23338p = z10;
                    this.f23339q = wVar;
                    this.f23340r = interfaceC5322g;
                    this.$tableNames = strArr;
                    this.f23341s = callable;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    C0404a c0404a = new C0404a(this.f23338p, this.f23339q, this.f23340r, this.$tableNames, this.f23341s, continuation);
                    c0404a.f23337o = obj;
                    return c0404a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(P p10, Continuation continuation) {
                    return ((C0404a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    ContinuationInterceptor b10;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i10 = this.f23336n;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        P p10 = (P) this.f23337o;
                        Rh.j b11 = Rh.m.b(-1, null, null, 6, null);
                        b bVar = new b(this.$tableNames, b11);
                        b11.h(Unit.INSTANCE);
                        H h10 = (H) p10.getCoroutineContext().get(H.f23274c);
                        if (h10 == null || (b10 = h10.b()) == null) {
                            b10 = this.f23338p ? AbstractC2269g.b(this.f23339q) : AbstractC2269g.a(this.f23339q);
                        }
                        Rh.j b12 = Rh.m.b(0, null, null, 7, null);
                        AbstractC1459k.d(p10, b10, null, new C0405a(this.f23339q, bVar, b11, this.f23341s, b12, null), 2, null);
                        InterfaceC5322g interfaceC5322g = this.f23340r;
                        this.f23336n = 1;
                        if (AbstractC5323h.o(interfaceC5322g, b12, this) == coroutine_suspended) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0403a(boolean z10, w wVar, String[] strArr, Callable callable, Continuation continuation) {
                super(2, continuation);
                this.f23333p = z10;
                this.f23334q = wVar;
                this.$tableNames = strArr;
                this.f23335r = callable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0403a c0403a = new C0403a(this.f23333p, this.f23334q, this.$tableNames, this.f23335r, continuation);
                c0403a.f23332o = obj;
                return c0403a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC5322g interfaceC5322g, Continuation continuation) {
                return ((C0403a) create(interfaceC5322g, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f23331n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C0404a c0404a = new C0404a(this.f23333p, this.f23334q, (InterfaceC5322g) this.f23332o, this.$tableNames, this.f23335r, null);
                    this.f23331n = 1;
                    if (Q.g(c0404a, this) == coroutine_suspended) {
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

        /* renamed from: androidx.room.f$a$b */
        public static final class b extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f23350n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ Callable f23351o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Callable callable, Continuation continuation) {
                super(2, continuation);
                this.f23351o = callable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.f23351o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f23350n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return this.f23351o.call();
            }
        }

        /* renamed from: androidx.room.f$a$c */
        public static final class c extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ CancellationSignal f23352d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C0 f23353e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(CancellationSignal cancellationSignal, C0 c02) {
                super(1);
                this.f23352d = cancellationSignal;
                this.f23353e = c02;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(Throwable th2) {
                CancellationSignal cancellationSignal = this.f23352d;
                if (cancellationSignal != null) {
                    E2.b.a(cancellationSignal);
                }
                C0.a.b(this.f23353e, null, 1, null);
            }
        }

        /* renamed from: androidx.room.f$a$d */
        public static final class d extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f23354n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ Callable f23355o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ InterfaceC1465n f23356p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Callable callable, InterfaceC1465n interfaceC1465n, Continuation continuation) {
                super(2, continuation);
                this.f23355o = callable;
                this.f23356p = interfaceC1465n;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new d(this.f23355o, this.f23356p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f23354n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                try {
                    this.f23356p.resumeWith(Result.m147constructorimpl(this.f23355o.call()));
                } catch (Throwable th2) {
                    InterfaceC1465n interfaceC1465n = this.f23356p;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC1465n.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(th2)));
                }
                return Unit.INSTANCE;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC5321f a(w wVar, boolean z10, String[] strArr, Callable callable) {
            return AbstractC5323h.x(new C0403a(z10, wVar, strArr, callable, null));
        }

        public final Object b(w wVar, boolean z10, CancellationSignal cancellationSignal, Callable callable, Continuation continuation) {
            ContinuationInterceptor b10;
            C0 d10;
            if (wVar.isOpenInternal() && wVar.inTransaction()) {
                return callable.call();
            }
            H h10 = (H) continuation.get$context().get(H.f23274c);
            if (h10 == null || (b10 = h10.b()) == null) {
                b10 = z10 ? AbstractC2269g.b(wVar) : AbstractC2269g.a(wVar);
            }
            ContinuationInterceptor continuationInterceptor = b10;
            C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(continuation), 1);
            c1469p.F();
            d10 = AbstractC1459k.d(C1483w0.f9135a, continuationInterceptor, null, new d(callable, c1469p, null), 2, null);
            c1469p.c(new c(cancellationSignal, d10));
            Object z11 = c1469p.z();
            if (z11 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return z11;
        }

        public final Object c(w wVar, boolean z10, Callable callable, Continuation continuation) {
            ContinuationInterceptor b10;
            if (wVar.isOpenInternal() && wVar.inTransaction()) {
                return callable.call();
            }
            H h10 = (H) continuation.get$context().get(H.f23274c);
            if (h10 == null || (b10 = h10.b()) == null) {
                b10 = z10 ? AbstractC2269g.b(wVar) : AbstractC2269g.a(wVar);
            }
            return AbstractC1455i.g(b10, new b(callable, null), continuation);
        }

        public a() {
        }
    }

    public static final InterfaceC5321f a(w wVar, boolean z10, String[] strArr, Callable callable) {
        return f23330a.a(wVar, z10, strArr, callable);
    }

    public static final Object b(w wVar, boolean z10, CancellationSignal cancellationSignal, Callable callable, Continuation continuation) {
        return f23330a.b(wVar, z10, cancellationSignal, callable, continuation);
    }

    public static final Object c(w wVar, boolean z10, Callable callable, Continuation continuation) {
        return f23330a.c(wVar, z10, callable, continuation);
    }
}
