package Tg;

import Tg.j;
import ch.C2924a;
import gh.AbstractC4384e;
import gh.C4387h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import zi.InterfaceC7015a;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final a f11854d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final C2924a f11855e = new C2924a("HttpResponseValidator");

    /* renamed from: a, reason: collision with root package name */
    public final List f11856a;

    /* renamed from: b, reason: collision with root package name */
    public final List f11857b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11858c;

    public static final class a implements k {

        /* renamed from: Tg.i$a$a, reason: collision with other inner class name */
        public static final class C0236a extends SuspendLambda implements Function3 {

            /* renamed from: n, reason: collision with root package name */
            public int f11859n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f11860o;

            /* renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f11861p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ i f11862q;

            /* renamed from: Tg.i$a$a$a, reason: collision with other inner class name */
            public static final class C0237a extends Lambda implements Function0 {

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ i f11863d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0237a(i iVar) {
                    super(0);
                    this.f11863d = iVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.valueOf(this.f11863d.f11858c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0236a(i iVar, Continuation continuation) {
                super(3, continuation);
                this.f11862q = iVar;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC4384e abstractC4384e, Object obj, Continuation continuation) {
                C0236a c0236a = new C0236a(this.f11862q, continuation);
                c0236a.f11860o = abstractC4384e;
                c0236a.f11861p = obj;
                return c0236a.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
            
                if (r9 == r0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
            
                return r0;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [gh.e] */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v8 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                j.a a10;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ?? r12 = this.f11859n;
                try {
                    if (r12 == 0) {
                        ResultKt.throwOnFailure(obj);
                        AbstractC4384e abstractC4384e = (AbstractC4384e) this.f11860o;
                        Object obj2 = this.f11861p;
                        ((Wg.c) abstractC4384e.b()).c().c(j.e(), new C0237a(this.f11862q));
                        this.f11860o = abstractC4384e;
                        this.f11859n = 1;
                        Object e10 = abstractC4384e.e(obj2, this);
                        r12 = abstractC4384e;
                    } else {
                        if (r12 != 1) {
                            if (r12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th2 = (Throwable) this.f11860o;
                            ResultKt.throwOnFailure(obj);
                            throw th2;
                        }
                        AbstractC4384e abstractC4384e2 = (AbstractC4384e) this.f11860o;
                        ResultKt.throwOnFailure(obj);
                        r12 = abstractC4384e2;
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    Throwable a11 = Yg.e.a(th3);
                    i iVar = this.f11862q;
                    a10 = j.a((Wg.c) r12.b());
                    this.f11860o = a11;
                    this.f11859n = 2;
                    if (iVar.e(a11, a10, this) != coroutine_suspended) {
                        throw a11;
                    }
                }
            }
        }

        public static final class b extends SuspendLambda implements Function3 {

            /* renamed from: n, reason: collision with root package name */
            public int f11864n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f11865o;

            /* renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f11866p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ i f11867q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(i iVar, Continuation continuation) {
                super(3, continuation);
                this.f11867q = iVar;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC4384e abstractC4384e, Xg.d dVar, Continuation continuation) {
                b bVar = new b(this.f11867q, continuation);
                bVar.f11865o = abstractC4384e;
                bVar.f11866p = dVar;
                return bVar.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
            
                if (r5 == r0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
            
                return r0;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [gh.e] */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v8 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ?? r12 = this.f11864n;
                try {
                    if (r12 == 0) {
                        ResultKt.throwOnFailure(obj);
                        AbstractC4384e abstractC4384e = (AbstractC4384e) this.f11865o;
                        Xg.d dVar = (Xg.d) this.f11866p;
                        this.f11865o = abstractC4384e;
                        this.f11864n = 1;
                        Object e10 = abstractC4384e.e(dVar, this);
                        r12 = abstractC4384e;
                    } else {
                        if (r12 != 1) {
                            if (r12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th2 = (Throwable) this.f11865o;
                            ResultKt.throwOnFailure(obj);
                            throw th2;
                        }
                        AbstractC4384e abstractC4384e2 = (AbstractC4384e) this.f11865o;
                        ResultKt.throwOnFailure(obj);
                        r12 = abstractC4384e2;
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    Throwable a10 = Yg.e.a(th3);
                    i iVar = this.f11867q;
                    Wg.b e11 = ((Og.b) r12.b()).e();
                    this.f11865o = a10;
                    this.f11864n = 2;
                    if (iVar.e(a10, e11, this) != coroutine_suspended) {
                        throw a10;
                    }
                }
            }
        }

        public static final class c extends SuspendLambda implements Function3 {

            /* renamed from: n, reason: collision with root package name */
            public int f11868n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f11869o;

            /* renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f11870p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ i f11871q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(i iVar, Continuation continuation) {
                super(3, continuation);
                this.f11871q = iVar;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(z zVar, Wg.c cVar, Continuation continuation) {
                c cVar2 = new c(this.f11871q, continuation);
                cVar2.f11869o = zVar;
                cVar2.f11870p = cVar;
                return cVar2.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
            
                if (r6 == r0) goto L16;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f11868n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    z zVar = (z) this.f11869o;
                    Wg.c cVar = (Wg.c) this.f11870p;
                    this.f11869o = null;
                    this.f11868n = 1;
                    obj = zVar.a(cVar, this);
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Og.b bVar = (Og.b) this.f11869o;
                        ResultKt.throwOnFailure(obj);
                        return bVar;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Og.b bVar2 = (Og.b) obj;
                i iVar = this.f11871q;
                Xg.c f10 = bVar2.f();
                this.f11869o = bVar2;
                this.f11868n = 2;
                return iVar.f(f10, this) == coroutine_suspended ? coroutine_suspended : bVar2;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Tg.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(i plugin, Ng.a scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.z0().l(Wg.f.f13260g.a(), new C0236a(plugin, null));
            C4387h c4387h = new C4387h("BeforeReceive");
            scope.A0().k(Xg.f.f13844g.b(), c4387h);
            scope.A0().l(c4387h, new b(plugin, null));
            ((t) l.b(scope, t.f11947c)).d(new c(plugin, null));
        }

        @Override // Tg.k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public i a(Function1 block) {
            Intrinsics.checkNotNullParameter(block, "block");
            b bVar = new b();
            block.invoke(bVar);
            return new i(CollectionsKt.reversed(bVar.c()), CollectionsKt.reversed(bVar.b()), bVar.a());
        }

        @Override // Tg.k
        public C2924a getKey() {
            return i.f11855e;
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final List f11872a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final List f11873b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public boolean f11874c = true;

        public final boolean a() {
            return this.f11874c;
        }

        public final List b() {
            return this.f11873b;
        }

        public final List c() {
            return this.f11872a;
        }

        public final void d(boolean z10) {
            this.f11874c = z10;
        }

        public final void e(Function2 block) {
            Intrinsics.checkNotNullParameter(block, "block");
            this.f11872a.add(block);
        }
    }

    public static final class c extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f11875n;

        /* renamed from: o, reason: collision with root package name */
        public Object f11876o;

        /* renamed from: p, reason: collision with root package name */
        public Object f11877p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f11878q;

        /* renamed from: s, reason: collision with root package name */
        public int f11880s;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11878q = obj;
            this.f11880s |= Integer.MIN_VALUE;
            return i.this.e(null, null, this);
        }
    }

    public static final class d extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f11881n;

        /* renamed from: o, reason: collision with root package name */
        public Object f11882o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f11883p;

        /* renamed from: r, reason: collision with root package name */
        public int f11885r;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11883p = obj;
            this.f11885r |= Integer.MIN_VALUE;
            return i.this.f(null, this);
        }
    }

    public i(List responseValidators, List callExceptionHandlers, boolean z10) {
        Intrinsics.checkNotNullParameter(responseValidators, "responseValidators");
        Intrinsics.checkNotNullParameter(callExceptionHandlers, "callExceptionHandlers");
        this.f11856a = responseValidators;
        this.f11857b = callExceptionHandlers;
        this.f11858c = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[LOOP:0: B:17:0x006e->B:19:0x0074, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Throwable th2, Wg.b bVar, Continuation continuation) {
        c cVar;
        int i10;
        InterfaceC7015a interfaceC7015a;
        Iterator it;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f11880s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f11880s = i11 - Integer.MIN_VALUE;
                Object obj = cVar.f11878q;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = cVar.f11880s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    interfaceC7015a = j.f11886a;
                    interfaceC7015a.b("Processing exception " + th2 + " for request " + bVar.getUrl());
                    it = this.f11857b.iterator();
                } else {
                    if (i10 != 1 && i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) cVar.f11877p;
                    ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                }
                return Unit.INSTANCE;
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.f11878q;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = cVar.f11880s;
        if (i10 != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Xg.c cVar, Continuation continuation) {
        d dVar;
        int i10;
        InterfaceC7015a interfaceC7015a;
        Xg.c cVar2;
        Iterator it;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f11885r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f11885r = i11 - Integer.MIN_VALUE;
                Object obj = dVar.f11883p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = dVar.f11885r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    interfaceC7015a = j.f11886a;
                    interfaceC7015a.b("Validating response for request " + cVar.r().e().getUrl());
                    cVar2 = cVar;
                    it = this.f11856a.iterator();
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) dVar.f11882o;
                    Xg.c cVar3 = (Xg.c) dVar.f11881n;
                    ResultKt.throwOnFailure(obj);
                    cVar2 = cVar3;
                }
                while (it.hasNext()) {
                    Function2 function2 = (Function2) it.next();
                    dVar.f11881n = cVar2;
                    dVar.f11882o = it;
                    dVar.f11885r = 1;
                    if (function2.invoke(cVar2, dVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        dVar = new d(continuation);
        Object obj2 = dVar.f11883p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = dVar.f11885r;
        if (i10 != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
