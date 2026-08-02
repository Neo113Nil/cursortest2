package Tg;

import Ph.AbstractC1440a0;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.F0;
import Ph.P;
import ah.M;
import ch.C2924a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.LongCompanionObject;
import zi.InterfaceC7015a;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final b f11967d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    public static final C2924a f11968e = new C2924a("TimeoutPlugin");

    /* renamed from: a, reason: collision with root package name */
    public final Long f11969a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f11970b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f11971c;

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        public static final C0241a f11972d = new C0241a(null);

        /* renamed from: e, reason: collision with root package name */
        public static final C2924a f11973e = new C2924a("TimeoutConfiguration");

        /* renamed from: a, reason: collision with root package name */
        public Long f11974a;

        /* renamed from: b, reason: collision with root package name */
        public Long f11975b;

        /* renamed from: c, reason: collision with root package name */
        public Long f11976c;

        /* renamed from: Tg.u$a$a, reason: collision with other inner class name */
        public static final class C0241a {
            public /* synthetic */ C0241a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C0241a() {
            }
        }

        public /* synthetic */ a(Long l10, Long l11, Long l12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? null : l11, (i10 & 4) != 0 ? null : l12);
        }

        public final u a() {
            return new u(d(), c(), e(), null);
        }

        public final Long b(Long l10) {
            if (l10 == null || l10.longValue() > 0) {
                return l10;
            }
            throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS");
        }

        public final Long c() {
            return this.f11975b;
        }

        public final Long d() {
            return this.f11974a;
        }

        public final Long e() {
            return this.f11976c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f11974a, aVar.f11974a) && Intrinsics.areEqual(this.f11975b, aVar.f11975b) && Intrinsics.areEqual(this.f11976c, aVar.f11976c);
        }

        public final void f(Long l10) {
            this.f11975b = b(l10);
        }

        public final void g(Long l10) {
            this.f11974a = b(l10);
        }

        public final void h(Long l10) {
            this.f11976c = b(l10);
        }

        public int hashCode() {
            Long l10 = this.f11974a;
            int hashCode = (l10 != null ? l10.hashCode() : 0) * 31;
            Long l11 = this.f11975b;
            int hashCode2 = (hashCode + (l11 != null ? l11.hashCode() : 0)) * 31;
            Long l12 = this.f11976c;
            return hashCode2 + (l12 != null ? l12.hashCode() : 0);
        }

        public a(Long l10, Long l11, Long l12) {
            this.f11974a = 0L;
            this.f11975b = 0L;
            this.f11976c = 0L;
            g(l10);
            f(l11);
            h(l12);
        }
    }

    public static final class b implements k, Qg.e {

        public static final class a extends SuspendLambda implements Function3 {

            /* renamed from: n, reason: collision with root package name */
            public int f11977n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f11978o;

            /* renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f11979p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ u f11980q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ Ng.a f11981r;

            /* renamed from: Tg.u$b$a$a, reason: collision with other inner class name */
            public static final class C0242a extends Lambda implements Function1 {

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ C0 f11982d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0242a(C0 c02) {
                    super(1);
                    this.f11982d = c02;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(Throwable th2) {
                    C0.a.b(this.f11982d, null, 1, null);
                }
            }

            /* renamed from: Tg.u$b$a$b, reason: collision with other inner class name */
            public static final class C0243b extends SuspendLambda implements Function2 {

                /* renamed from: n, reason: collision with root package name */
                public int f11983n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ Long f11984o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ Wg.c f11985p;

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ C0 f11986q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0243b(Long l10, Wg.c cVar, C0 c02, Continuation continuation) {
                    super(2, continuation);
                    this.f11984o = l10;
                    this.f11985p = cVar;
                    this.f11986q = c02;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0243b(this.f11984o, this.f11985p, this.f11986q, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(P p10, Continuation continuation) {
                    return ((C0243b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    InterfaceC7015a interfaceC7015a;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i10 = this.f11983n;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        long longValue = this.f11984o.longValue();
                        this.f11983n = 1;
                        if (AbstractC1440a0.a(longValue, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    s sVar = new s(this.f11985p);
                    interfaceC7015a = v.f11987a;
                    interfaceC7015a.b("Request timeout: " + this.f11985p.i());
                    C0 c02 = this.f11986q;
                    String message = sVar.getMessage();
                    Intrinsics.checkNotNull(message);
                    F0.c(c02, message, sVar);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(u uVar, Ng.a aVar, Continuation continuation) {
                super(3, continuation);
                this.f11980q = uVar;
                this.f11981r = aVar;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(z zVar, Wg.c cVar, Continuation continuation) {
                a aVar = new a(this.f11980q, this.f11981r, continuation);
                aVar.f11978o = zVar;
                aVar.f11979p = cVar;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                C0 d10;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f11977n;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                z zVar = (z) this.f11978o;
                Wg.c cVar = (Wg.c) this.f11979p;
                if (M.b(cVar.i().o())) {
                    this.f11978o = null;
                    this.f11977n = 1;
                    Object a10 = zVar.a(cVar, this);
                    if (a10 != coroutine_suspended) {
                        return a10;
                    }
                } else {
                    cVar.d();
                    b bVar = u.f11967d;
                    a aVar = (a) cVar.f(bVar);
                    if (aVar == null && this.f11980q.f()) {
                        a aVar2 = new a(null, null, null, 7, null);
                        cVar.l(bVar, aVar2);
                        aVar = aVar2;
                    }
                    if (aVar != null) {
                        u uVar = this.f11980q;
                        Ng.a aVar3 = this.f11981r;
                        Long c10 = aVar.c();
                        if (c10 == null) {
                            c10 = uVar.f11970b;
                        }
                        aVar.f(c10);
                        Long e10 = aVar.e();
                        if (e10 == null) {
                            e10 = uVar.f11971c;
                        }
                        aVar.h(e10);
                        Long d11 = aVar.d();
                        if (d11 == null) {
                            d11 = uVar.f11969a;
                        }
                        aVar.g(d11);
                        Long d12 = aVar.d();
                        if (d12 == null) {
                            d12 = uVar.f11969a;
                        }
                        if (d12 != null && d12.longValue() != LongCompanionObject.MAX_VALUE) {
                            d10 = AbstractC1459k.d(aVar3, null, null, new C0243b(d12, cVar, cVar.g(), null), 3, null);
                            cVar.g().invokeOnCompletion(new C0242a(d10));
                        }
                    }
                    this.f11978o = null;
                    this.f11977n = 2;
                    Object a11 = zVar.a(cVar, this);
                    if (a11 != coroutine_suspended) {
                        return a11;
                    }
                }
                return coroutine_suspended;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Tg.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(u plugin, Ng.a scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            ((t) l.b(scope, t.f11947c)).d(new a(plugin, scope, null));
        }

        @Override // Tg.k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public u a(Function1 block) {
            Intrinsics.checkNotNullParameter(block, "block");
            a aVar = new a(null, null, null, 7, null);
            block.invoke(aVar);
            return aVar.a();
        }

        @Override // Tg.k
        public C2924a getKey() {
            return u.f11968e;
        }

        public b() {
        }
    }

    public /* synthetic */ u(Long l10, Long l11, Long l12, DefaultConstructorMarker defaultConstructorMarker) {
        this(l10, l11, l12);
    }

    public final boolean f() {
        return (this.f11969a == null && this.f11970b == null && this.f11971c == null) ? false : true;
    }

    public u(Long l10, Long l11, Long l12) {
        this.f11969a = l10;
        this.f11970b = l11;
        this.f11971c = l12;
    }
}
