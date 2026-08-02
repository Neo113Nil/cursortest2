package Tg;

import ah.C2023o;
import ah.H;
import ah.InterfaceC2019k;
import ah.K;
import ah.L;
import ah.M;
import ah.T;
import ch.C2924a;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import zi.InterfaceC7015a;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static final b f11912c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final C2924a f11913d = new C2924a("HttpRedirect");

    /* renamed from: e, reason: collision with root package name */
    public static final Zg.a f11914e = new Zg.a();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11915a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11916b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f11917a = true;

        /* renamed from: b, reason: collision with root package name */
        public boolean f11918b;

        public final boolean a() {
            return this.f11918b;
        }

        public final boolean b() {
            return this.f11917a;
        }
    }

    public static final class b implements k {

        public static final class a extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public Object f11919n;

            /* renamed from: o, reason: collision with root package name */
            public Object f11920o;

            /* renamed from: p, reason: collision with root package name */
            public Object f11921p;

            /* renamed from: q, reason: collision with root package name */
            public Object f11922q;

            /* renamed from: r, reason: collision with root package name */
            public Object f11923r;

            /* renamed from: s, reason: collision with root package name */
            public Object f11924s;

            /* renamed from: t, reason: collision with root package name */
            public Object f11925t;

            /* renamed from: u, reason: collision with root package name */
            public Object f11926u;

            /* renamed from: v, reason: collision with root package name */
            public Object f11927v;

            /* renamed from: w, reason: collision with root package name */
            public boolean f11928w;

            /* renamed from: x, reason: collision with root package name */
            public /* synthetic */ Object f11929x;

            /* renamed from: z, reason: collision with root package name */
            public int f11931z;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f11929x = obj;
                this.f11931z |= Integer.MIN_VALUE;
                return b.this.e(null, null, null, false, null, this);
            }
        }

        /* renamed from: Tg.o$b$b, reason: collision with other inner class name */
        public static final class C0239b extends SuspendLambda implements Function3 {

            /* renamed from: n, reason: collision with root package name */
            public int f11932n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f11933o;

            /* renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f11934p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ o f11935q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ Ng.a f11936r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0239b(o oVar, Ng.a aVar, Continuation continuation) {
                super(3, continuation);
                this.f11935q = oVar;
                this.f11936r = aVar;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(z zVar, Wg.c cVar, Continuation continuation) {
                C0239b c0239b = new C0239b(this.f11935q, this.f11936r, continuation);
                c0239b.f11933o = zVar;
                c0239b.f11934p = cVar;
                return c0239b.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Wg.c cVar;
                z zVar;
                Set set;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f11932n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    z zVar2 = (z) this.f11933o;
                    cVar = (Wg.c) this.f11934p;
                    this.f11933o = zVar2;
                    this.f11934p = cVar;
                    this.f11932n = 1;
                    Object a10 = zVar2.a(cVar, this);
                    if (a10 != coroutine_suspended) {
                        zVar = zVar2;
                        obj = a10;
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                cVar = (Wg.c) this.f11934p;
                z zVar3 = (z) this.f11933o;
                ResultKt.throwOnFailure(obj);
                zVar = zVar3;
                Wg.c cVar2 = cVar;
                Og.b bVar = (Og.b) obj;
                if (this.f11935q.f11915a) {
                    set = p.f11937a;
                    if (!set.contains(bVar.e().getMethod())) {
                        return bVar;
                    }
                }
                b bVar2 = o.f11912c;
                boolean z10 = this.f11935q.f11916b;
                Ng.a aVar = this.f11936r;
                this.f11933o = null;
                this.f11934p = null;
                this.f11932n = 2;
                Object e10 = bVar2.e(zVar, cVar2, bVar, z10, aVar, this);
                return e10 == coroutine_suspended ? coroutine_suspended : e10;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Zg.a d() {
            return o.f11914e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x01ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x01ac  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
        /* JADX WARN: Type inference failed for: r3v6, types: [T, Wg.c] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x01ac -> B:10:0x01b2). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object e(z zVar, Wg.c cVar, Og.b bVar, boolean z10, Ng.a aVar, Continuation continuation) {
            a aVar2;
            b bVar2;
            int i10;
            boolean d10;
            String a10;
            b bVar3;
            Ref.ObjectRef objectRef;
            L l10;
            z zVar2;
            Ref.ObjectRef objectRef2;
            a aVar3;
            boolean z11;
            Ng.a aVar4;
            Wg.c cVar2;
            String str;
            InterfaceC7015a interfaceC7015a;
            ?? cVar3;
            Object a11;
            InterfaceC7015a interfaceC7015a2;
            InterfaceC7015a interfaceC7015a3;
            boolean d11;
            if (continuation instanceof a) {
                aVar2 = (a) continuation;
                int i11 = aVar2.f11931z;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar2.f11931z = i11 - Integer.MIN_VALUE;
                    bVar2 = this;
                    Object obj = aVar2.f11929x;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = aVar2.f11931z;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        d10 = p.d(bVar.f().f());
                        if (!d10) {
                            return bVar;
                        }
                        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                        objectRef3.element = bVar;
                        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                        T t10 = cVar;
                        objectRef4.element = t10;
                        L k10 = bVar.e().getUrl().k();
                        a10 = T.a(bVar.e().getUrl());
                        bVar3 = bVar2;
                        objectRef = objectRef4;
                        l10 = k10;
                        zVar2 = zVar;
                        objectRef2 = objectRef3;
                        aVar3 = aVar2;
                        z11 = z10;
                        aVar4 = aVar;
                        cVar2 = t10;
                        aVar4.U().a(bVar3.d(), ((Og.b) objectRef2.element).f());
                        InterfaceC2019k a12 = ((Og.b) objectRef2.element).f().a();
                        C2023o c2023o = C2023o.f16113a;
                        str = a12.get(c2023o.n());
                        interfaceC7015a = p.f11938b;
                        interfaceC7015a.b("Received redirect response to " + str + " for request " + cVar2.i());
                        cVar3 = new Wg.c();
                        cVar3.p((Wg.c) objectRef.element);
                        cVar3.i().k().clear();
                        if (str != null) {
                        }
                        if (z11) {
                        }
                        if (!Intrinsics.areEqual(a10, H.e(cVar3.i()))) {
                        }
                        objectRef.element = cVar3;
                        aVar3.f11919n = bVar3;
                        aVar3.f11920o = zVar2;
                        aVar3.f11921p = cVar2;
                        aVar3.f11922q = aVar4;
                        aVar3.f11923r = objectRef2;
                        aVar3.f11924s = objectRef;
                        aVar3.f11925t = l10;
                        aVar3.f11926u = a10;
                        aVar3.f11927v = objectRef2;
                        aVar3.f11928w = z11;
                        aVar3.f11931z = 1;
                        a11 = zVar2.a(cVar3, aVar3);
                        if (a11 != coroutine_suspended) {
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z12 = aVar2.f11928w;
                        Ref.ObjectRef objectRef5 = (Ref.ObjectRef) aVar2.f11927v;
                        String str2 = (String) aVar2.f11926u;
                        L l11 = (L) aVar2.f11925t;
                        Ref.ObjectRef objectRef6 = (Ref.ObjectRef) aVar2.f11924s;
                        Ref.ObjectRef objectRef7 = (Ref.ObjectRef) aVar2.f11923r;
                        Ng.a aVar5 = (Ng.a) aVar2.f11922q;
                        Wg.c cVar4 = (Wg.c) aVar2.f11921p;
                        z zVar3 = (z) aVar2.f11920o;
                        bVar3 = (b) aVar2.f11919n;
                        ResultKt.throwOnFailure(obj);
                        a10 = str2;
                        Wg.c cVar5 = cVar4;
                        Ref.ObjectRef objectRef8 = objectRef6;
                        l10 = l11;
                        objectRef2 = objectRef7;
                        a aVar6 = aVar2;
                        boolean z13 = z12;
                        z zVar4 = zVar3;
                        T t11 = obj;
                        objectRef5.element = t11;
                        d11 = p.d(((Og.b) objectRef2.element).f().f());
                        if (d11) {
                            return objectRef2.element;
                        }
                        z11 = z13;
                        aVar3 = aVar6;
                        aVar4 = aVar5;
                        objectRef = objectRef8;
                        zVar2 = zVar4;
                        cVar2 = cVar5;
                        aVar4.U().a(bVar3.d(), ((Og.b) objectRef2.element).f());
                        InterfaceC2019k a122 = ((Og.b) objectRef2.element).f().a();
                        C2023o c2023o2 = C2023o.f16113a;
                        str = a122.get(c2023o2.n());
                        interfaceC7015a = p.f11938b;
                        interfaceC7015a.b("Received redirect response to " + str + " for request " + cVar2.i());
                        cVar3 = new Wg.c();
                        cVar3.p((Wg.c) objectRef.element);
                        cVar3.i().k().clear();
                        if (str != null) {
                            K.j(cVar3.i(), str);
                        }
                        if (z11 && M.a(l10) && !M.a(cVar3.i().o())) {
                            interfaceC7015a3 = p.f11938b;
                            interfaceC7015a3.b("Can not redirect " + cVar2.i() + " because of security downgrade");
                            return objectRef2.element;
                        }
                        if (!Intrinsics.areEqual(a10, H.e(cVar3.i()))) {
                            cVar3.a().l(c2023o2.e());
                            interfaceC7015a2 = p.f11938b;
                            interfaceC7015a2.b("Removing Authorization header from redirect for " + cVar2.i());
                        }
                        objectRef.element = cVar3;
                        aVar3.f11919n = bVar3;
                        aVar3.f11920o = zVar2;
                        aVar3.f11921p = cVar2;
                        aVar3.f11922q = aVar4;
                        aVar3.f11923r = objectRef2;
                        aVar3.f11924s = objectRef;
                        aVar3.f11925t = l10;
                        aVar3.f11926u = a10;
                        aVar3.f11927v = objectRef2;
                        aVar3.f11928w = z11;
                        aVar3.f11931z = 1;
                        a11 = zVar2.a(cVar3, aVar3);
                        if (a11 != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef8 = objectRef;
                        aVar5 = aVar4;
                        z13 = z11;
                        t11 = a11;
                        aVar6 = aVar3;
                        objectRef5 = objectRef2;
                        zVar4 = zVar2;
                        cVar5 = cVar2;
                        objectRef5.element = t11;
                        d11 = p.d(((Og.b) objectRef2.element).f().f());
                        if (d11) {
                        }
                    }
                }
            }
            bVar2 = this;
            aVar2 = bVar2.new a(continuation);
            Object obj2 = aVar2.f11929x;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = aVar2.f11931z;
            if (i10 != 0) {
            }
        }

        @Override // Tg.k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(o plugin, Ng.a scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            ((t) l.b(scope, t.f11947c)).d(new C0239b(plugin, scope, null));
        }

        @Override // Tg.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public o a(Function1 block) {
            Intrinsics.checkNotNullParameter(block, "block");
            a aVar = new a();
            block.invoke(aVar);
            return new o(aVar.b(), aVar.a(), null);
        }

        @Override // Tg.k
        public C2924a getKey() {
            return o.f11913d;
        }

        public b() {
        }
    }

    public /* synthetic */ o(boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11);
    }

    public o(boolean z10, boolean z11) {
        this.f11915a = z10;
        this.f11916b = z11;
    }
}
