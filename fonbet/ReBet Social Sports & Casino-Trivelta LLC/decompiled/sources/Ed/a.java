package Ed;

import Ph.AbstractC1455i;
import Ph.AbstractC1457j;
import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.O0;
import Ph.P;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.modules.authentication.ui.models.SalesIQJWTAuth;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.C5582a;
import td.C6461a;
import ve.InterfaceC6686a;
import we.d;
import we.e;
import yd.C6876a;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3035a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f3036b = LazyKt.lazy(e.f3057d);

    /* renamed from: c, reason: collision with root package name */
    public static final Lazy f3037c = LazyKt.lazy(b.f3048d);

    /* renamed from: d, reason: collision with root package name */
    public static final Lazy f3038d = LazyKt.lazy(p.f3082d);

    /* renamed from: e, reason: collision with root package name */
    public static final Lazy f3039e = LazyKt.lazy(q.f3083d);

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f3040f = LazyKt.lazy(l.f3065d);

    /* renamed from: g, reason: collision with root package name */
    public static final Lazy f3041g = LazyKt.lazy(f.f3058d);

    /* renamed from: h, reason: collision with root package name */
    public static final Lazy f3042h = LazyKt.lazy(k.f3064d);

    /* renamed from: i, reason: collision with root package name */
    public static final Lazy f3043i = LazyKt.lazy(i.f3062d);

    /* renamed from: j, reason: collision with root package name */
    public static final Lazy f3044j = LazyKt.lazy(j.f3063d);

    /* renamed from: k, reason: collision with root package name */
    public static final Lazy f3045k = LazyKt.lazy(m.f3066d);

    /* renamed from: l, reason: collision with root package name */
    public static final Lazy f3046l = LazyKt.lazy(h.f3061d);

    /* renamed from: Ed.a$a, reason: collision with other inner class name */
    public static final class C0069a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f3047n;

        public C0069a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C0069a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((C0069a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f3047n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Dd.c l10 = a.f3035a.l();
                this.f3047n = 1;
                obj = l10.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            String str = (String) ((C5582a) obj).b();
            return str == null ? "" : str;
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f3048d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Dd.a invoke() {
            return new Dd.a(a.f3035a.k());
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f3049n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Bd.b f3050o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Bd.a f3051p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Function0 f3052q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Function1 f3053r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Bd.b bVar, Bd.a aVar, Function0 function0, Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f3050o = bVar;
            this.f3051p = aVar;
            this.f3052q = function0;
            this.f3053r = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f3050o, this.f3051p, this.f3052q, this.f3053r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f3049n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = a.f3035a;
                Bd.b bVar = this.f3050o;
                Bd.a aVar2 = this.f3051p;
                this.f3049n = 1;
                obj = aVar.d(bVar, aVar2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C5582a c5582a = (C5582a) obj;
            Function0 function0 = this.f3052q;
            if (c5582a.d()) {
                if (function0 != null) {
                    function0.invoke();
                }
            }
            Function1 function1 = this.f3053r;
            if (!c5582a.d()) {
                C5582a.b c10 = c5582a.c();
                Intrinsics.checkNotNull(c10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                if (function1 != null) {
                    Integer b10 = c10.b();
                    function1.invoke(new d.b(b10 != null ? b10.intValue() : -1, c10.c()));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f3054n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Bd.b f3055o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Bd.a f3056p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Bd.b bVar, Bd.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f3055o = bVar;
            this.f3056p = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f3055o, this.f3056p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f3054n;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            a aVar = a.f3035a;
            Bd.b bVar = this.f3055o;
            Bd.a aVar2 = this.f3056p;
            this.f3054n = 1;
            Object d10 = aVar.d(bVar, aVar2, this);
            return d10 == coroutine_suspended ? coroutine_suspended : d10;
        }
    }

    public static final class e extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final e f3057d = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6876a invoke() {
            return C6876a.f68336f.a();
        }
    }

    public static final class f extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final f f3058d = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Dd.b invoke() {
            return new Dd.b(a.f3035a.k());
        }
    }

    public static final class g extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f3059n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Function1 f3060o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f3060o = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new g(this.f3060o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((g) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f3059n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Dd.c l10 = a.f3035a.l();
                this.f3059n = 1;
                obj = l10.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.f3060o.invoke((C5582a) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class h extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final h f3061d = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Dd.c invoke() {
            return new Dd.c(a.f3035a.k());
        }
    }

    public static final class i extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final i f3062d = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Dd.d invoke() {
            return new Dd.d(a.f3035a.k());
        }
    }

    public static final class j extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final j f3063d = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Dd.e invoke() {
            return new Dd.e(a.f3035a.k());
        }
    }

    public static final class k extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final k f3064d = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Dd.f invoke() {
            return new Dd.f(a.f3035a.k());
        }
    }

    public static final class l extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final l f3065d = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Dd.g invoke() {
            return new Dd.g(a.f3035a.k());
        }
    }

    public static final class m extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final m f3066d = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Dd.h invoke() {
            return new Dd.h(a.f3035a.k());
        }
    }

    public static final class n extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f3067n;

        /* renamed from: o, reason: collision with root package name */
        public Object f3068o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f3069p;

        /* renamed from: q, reason: collision with root package name */
        public int f3070q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f3071r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Bd.b f3072s;

        /* renamed from: Ed.a$n$a, reason: collision with other inner class name */
        public static final class C0070a extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ boolean f3073d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Continuation f3074e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0070a(boolean z10, Continuation continuation) {
                super(0);
                this.f3073d = z10;
                this.f3074e = continuation;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5invoke() {
                if (!this.f3073d) {
                    Uf.j.f12224n = false;
                }
                Continuation continuation = this.f3074e;
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m147constructorimpl(C5582a.f56502b.d(Boolean.TRUE)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(boolean z10, Bd.b bVar, Continuation continuation) {
            super(2, continuation);
            this.f3071r = z10;
            this.f3072s = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f3071r, this.f3072s, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((n) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0035, code lost:
        
            if (r10 == r0) goto L26;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f3070q;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Dd.i r10 = a.f3035a.r();
                this.f3070q = 1;
                obj = r10.a(this);
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
            }
            C5582a c5582a = (C5582a) obj;
            boolean z10 = this.f3071r;
            Bd.b bVar = this.f3072s;
            this.f3067n = c5582a;
            this.f3068o = bVar;
            this.f3069p = z10;
            this.f3070q = 2;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
            if (c5582a.d()) {
                ZohoLiveChat.clearDataForRegisterVisitor(MobilistenInitProvider.INSTANCE.e(), z10, z10, bVar, null, new C0070a(z10, safeContinuation));
            } else {
                if (c5582a.d()) {
                    c5582a = c5582a.a(Boxing.boxBoolean(false));
                } else {
                    Intrinsics.checkNotNull(c5582a, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult<NewDataType of com.zoho.livechat.android.modules.common.result.SalesIQResult.map>");
                }
                safeContinuation.resumeWith(Result.m147constructorimpl(c5582a));
            }
            Object orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            return orThrow == coroutine_suspended ? coroutine_suspended : orThrow;
        }
    }

    public static final class o extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f3075n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f3076o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Bd.b f3077p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6686a f3078q;

        /* renamed from: Ed.a$o$a, reason: collision with other inner class name */
        public static final class C0071a extends SuspendLambda implements Function1 {

            /* renamed from: n, reason: collision with root package name */
            public int f3079n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ we.e f3080o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ InterfaceC6686a f3081p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0071a(we.e eVar, InterfaceC6686a interfaceC6686a, Continuation continuation) {
                super(1, continuation);
                this.f3080o = eVar;
                this.f3081p = interfaceC6686a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new C0071a(this.f3080o, this.f3081p, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f3079n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Uf.j.f12225o = false;
                if (this.f3080o.d()) {
                    InterfaceC6686a interfaceC6686a = this.f3081p;
                    if (interfaceC6686a != null) {
                        interfaceC6686a.a(we.e.f67680b.b(Unit.INSTANCE));
                    }
                } else {
                    InterfaceC6686a interfaceC6686a2 = this.f3081p;
                    if (interfaceC6686a2 != null) {
                        e.a aVar = we.e.f67680b;
                        we.d c10 = this.f3080o.c();
                        int a10 = c10 != null ? c10.a() : -1;
                        we.d c11 = this.f3080o.c();
                        String b10 = c11 != null ? c11.b() : null;
                        if (b10 == null) {
                            b10 = "";
                        }
                        interfaceC6686a2.a(aVar.a(new d.b(a10, b10)));
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation continuation) {
                return ((C0071a) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(boolean z10, Bd.b bVar, InterfaceC6686a interfaceC6686a, Continuation continuation) {
            super(2, continuation);
            this.f3076o = z10;
            this.f3077p = bVar;
            this.f3078q = interfaceC6686a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new o(this.f3076o, this.f3077p, this.f3078q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((o) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        
            if (r1.c(r3, r6) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        
            if (r7 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f3075n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = a.f3035a;
                boolean z10 = this.f3076o;
                Bd.b bVar = this.f3077p;
                this.f3075n = 1;
                obj = aVar.y(z10, bVar, this);
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            we.e b10 = me.b.b((C5582a) obj);
            C6461a c6461a = C6461a.f65810a;
            C0071a c0071a = new C0071a(b10, this.f3078q, null);
            this.f3075n = 2;
        }
    }

    public static final class p extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final p f3082d = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Dd.i invoke() {
            return new Dd.i(a.f3035a.k());
        }
    }

    public static final class q extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final q f3083d = new q();

        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Dd.j invoke() {
            return new Dd.j(a.f3035a.k());
        }
    }

    public static final void A(boolean z10, Bd.b bVar, InterfaceC6686a interfaceC6686a) {
        AbstractC1459k.d(f3035a.i(), O0.f9045a.plus(C1452g0.b()), null, new o(z10, bVar, interfaceC6686a, null), 2, null);
    }

    public static final void B(Bd.b bVar) {
        if (bVar instanceof SalesIQJWTAuth) {
            f3035a.u().a(bVar);
        }
    }

    public static final void e(Bd.b salesIQAuth, Bd.a authenticationType, Function0 function0, Function1 function1) {
        Intrinsics.checkNotNullParameter(salesIQAuth, "salesIQAuth");
        Intrinsics.checkNotNullParameter(authenticationType, "authenticationType");
        AbstractC1459k.d(f3035a.i(), null, null, new c(salesIQAuth, authenticationType, function0, function1, null), 3, null);
    }

    public static final C5582a f(Bd.b salesIQAuth, Bd.a authenticationType) {
        Object b10;
        Intrinsics.checkNotNullParameter(salesIQAuth, "salesIQAuth");
        Intrinsics.checkNotNullParameter(authenticationType, "authenticationType");
        b10 = AbstractC1457j.b(null, new d(salesIQAuth, authenticationType, null), 1, null);
        return (C5582a) b10;
    }

    public static final void h(Function1 onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        AbstractC1459k.d(f3035a.i(), null, null, new g(onComplete, null), 3, null);
    }

    public static final Bd.b t() {
        return (Bd.b) f3035a.p().a().b();
    }

    public static final boolean v() {
        Boolean bool = (Boolean) f3035a.m().a().b();
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean x() {
        Boolean bool = (Boolean) f3035a.o().a().b();
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static /* synthetic */ Object z(a aVar, boolean z10, Bd.b bVar, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        return aVar.y(z10, bVar, continuation);
    }

    public final Object d(Bd.b bVar, Bd.a aVar, Continuation continuation) {
        return j().a(bVar, aVar, continuation);
    }

    public final String g() {
        Object b10;
        b10 = AbstractC1457j.b(null, new C0069a(null), 1, null);
        return (String) b10;
    }

    public final P i() {
        return C6461a.f65810a.e();
    }

    public final Dd.a j() {
        return (Dd.a) f3037c.getValue();
    }

    public final C6876a k() {
        return (C6876a) f3036b.getValue();
    }

    public final Dd.c l() {
        return (Dd.c) f3046l.getValue();
    }

    public final Dd.d m() {
        return (Dd.d) f3043i.getValue();
    }

    public final Dd.e n() {
        return (Dd.e) f3044j.getValue();
    }

    public final Dd.f o() {
        return (Dd.f) f3042h.getValue();
    }

    public final Dd.g p() {
        return (Dd.g) f3040f.getValue();
    }

    public final Dd.h q() {
        return (Dd.h) f3045k.getValue();
    }

    public final Dd.i r() {
        return (Dd.i) f3038d.getValue();
    }

    public final Object s() {
        String str = (String) q().a().b();
        return str == null ? Boolean.FALSE : str;
    }

    public final Dd.j u() {
        return (Dd.j) f3039e.getValue();
    }

    public final boolean w() {
        Boolean bool = (Boolean) n().a().b();
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final Object y(boolean z10, Bd.b bVar, Continuation continuation) {
        return AbstractC1455i.g(O0.f9045a.plus(C1452g0.b()), new n(z10, bVar, null), continuation);
    }
}
