package Xg;

import Ph.A;
import Ph.C0;
import Tg.k;
import Tg.l;
import io.ktor.utils.io.h;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Wg.c f13851a;

    /* renamed from: b, reason: collision with root package name */
    public final Ng.a f13852b;

    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f13853n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f13854o;

        /* renamed from: q, reason: collision with root package name */
        public int f13856q;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13854o = obj;
            this.f13856q |= Integer.MIN_VALUE;
            return g.this.b(null, this);
        }
    }

    public static final class b extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f13857n;

        /* renamed from: o, reason: collision with root package name */
        public Object f13858o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f13859p;

        /* renamed from: r, reason: collision with root package name */
        public int f13861r;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13859p = obj;
            this.f13861r |= Integer.MIN_VALUE;
            return g.this.d(null, this);
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f13862n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f13863o;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(continuation);
            cVar.f13863o = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Xg.c cVar, Continuation continuation) {
            return ((c) create(cVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f13862n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Og.b r10 = ((Xg.c) this.f13863o).r();
                this.f13862n = 1;
                obj = Og.d.a(r10, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((Og.b) obj).f();
        }
    }

    public static final class d extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f13864n;

        /* renamed from: p, reason: collision with root package name */
        public int f13866p;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13864n = obj;
            this.f13866p |= Integer.MIN_VALUE;
            return g.this.e(this);
        }
    }

    public g(Wg.c builder, Ng.a client) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(client, "client");
        this.f13851a = builder;
        this.f13852b = client;
        a();
    }

    public final void a() {
        Set keySet;
        Map map = (Map) this.f13851a.c().f(Qg.f.a());
        if (map == null || (keySet = map.keySet()) == null) {
            return;
        }
        ArrayList<k> arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (obj instanceof k) {
                arrayList.add(obj);
            }
        }
        for (k kVar : arrayList) {
            if (l.c(this.f13852b, kVar) == null) {
                throw new IllegalArgumentException(("Consider installing " + kVar + " plugin because the request requires it to be installed").toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Xg.c cVar, Continuation continuation) {
        a aVar;
        int i10;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f13856q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f13856q = i11 - Integer.MIN_VALUE;
                Object obj = aVar.f13854o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = aVar.f13856q;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext.Element element = cVar.getCoroutineContext().get(C0.f9001U2);
                    Intrinsics.checkNotNull(element);
                    A a10 = (A) element;
                    a10.y1();
                    try {
                        h.a(cVar.b());
                    } catch (Throwable unused) {
                    }
                    aVar.f13853n = a10;
                    aVar.f13856q = 1;
                    if (a10.join(aVar) == coroutine_suspended) {
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
        aVar = new a(continuation);
        Object obj2 = aVar.f13854o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar.f13856q;
        if (i10 != 0) {
        }
        return Unit.INSTANCE;
    }

    public final Object c(Continuation continuation) {
        return d(new c(null), continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(1:(2:13|14)(3:16|17|18))(3:19|20|21))(5:22|23|24|25|(2:27|28)(1:29)))(2:35|36))(3:44|45|(2:47|28)(1:48))|37|38|39|(3:41|25|(0)(0))|28))|52|6|7|(0)(0)|37|38|39|(0)|28|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
    
        if (r2.b(r11, r0) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Function2 function2, Continuation continuation) {
        b bVar;
        Object coroutine_suspended;
        int i10;
        g gVar;
        Xg.c cVar;
        Object invoke;
        Xg.c cVar2;
        try {
            if (continuation instanceof b) {
                bVar = (b) continuation;
                int i11 = bVar.f13861r;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    bVar.f13861r = i11 - Integer.MIN_VALUE;
                    Object obj = bVar.f13859p;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = bVar.f13861r;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        bVar.f13857n = this;
                        bVar.f13858o = function2;
                        bVar.f13861r = 1;
                        obj = e(bVar);
                        if (obj != coroutine_suspended) {
                            gVar = this;
                        }
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 == 3) {
                                    Object obj2 = bVar.f13857n;
                                    ResultKt.throwOnFailure(obj);
                                    return obj2;
                                }
                                if (i10 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                th = (Throwable) bVar.f13857n;
                                ResultKt.throwOnFailure(obj);
                                throw th;
                            }
                            cVar2 = (Xg.c) bVar.f13858o;
                            gVar = (g) bVar.f13857n;
                            try {
                                ResultKt.throwOnFailure(obj);
                                bVar.f13857n = obj;
                                bVar.f13858o = null;
                                bVar.f13861r = 3;
                            } catch (Throwable th2) {
                                cVar = cVar2;
                                th = th2;
                                bVar.f13857n = th;
                                bVar.f13858o = null;
                                bVar.f13861r = 4;
                            }
                            return gVar.b(cVar2, bVar) != coroutine_suspended ? coroutine_suspended : obj;
                        }
                        function2 = (Function2) bVar.f13858o;
                        gVar = (g) bVar.f13857n;
                        ResultKt.throwOnFailure(obj);
                    }
                    cVar = (Xg.c) obj;
                    bVar.f13857n = gVar;
                    bVar.f13858o = cVar;
                    bVar.f13861r = 2;
                    invoke = function2.invoke(cVar, bVar);
                    if (invoke != coroutine_suspended) {
                        obj = invoke;
                        cVar2 = cVar;
                        bVar.f13857n = obj;
                        bVar.f13858o = null;
                        bVar.f13861r = 3;
                        if (gVar.b(cVar2, bVar) != coroutine_suspended) {
                        }
                    }
                }
            }
            if (i10 != 0) {
            }
            cVar = (Xg.c) obj;
            bVar.f13857n = gVar;
            bVar.f13858o = cVar;
            bVar.f13861r = 2;
            invoke = function2.invoke(cVar, bVar);
            if (invoke != coroutine_suspended) {
            }
        } catch (CancellationException e10) {
            throw Yg.e.a(e10);
        }
        bVar = new b(continuation);
        Object obj3 = bVar.f13859p;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = bVar.f13861r;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Continuation continuation) {
        d dVar;
        int i10;
        try {
            if (continuation instanceof d) {
                dVar = (d) continuation;
                int i11 = dVar.f13866p;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    dVar.f13866p = i11 - Integer.MIN_VALUE;
                    Object obj = dVar.f13864n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = dVar.f13866p;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        Wg.c p10 = new Wg.c().p(this.f13851a);
                        Ng.a aVar = this.f13852b;
                        dVar.f13866p = 1;
                        obj = aVar.k(p10, dVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return ((Og.b) obj).f();
                }
            }
            if (i10 != 0) {
            }
            return ((Og.b) obj).f();
        } catch (CancellationException e10) {
            throw Yg.e.a(e10);
        }
        dVar = new d(continuation);
        Object obj2 = dVar.f13864n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = dVar.f13866p;
    }

    public String toString() {
        return "HttpStatement[" + this.f13851a.i() + ']';
    }
}
