package Tg;

import Ph.C0;
import Ph.F0;
import Ph.Q;
import ah.AbstractC2026s;
import ah.C2011c;
import ah.C2020l;
import ah.C2023o;
import ah.C2027t;
import bh.AbstractC2423b;
import bh.C2424c;
import fh.AbstractC4283a;
import gh.AbstractC4384e;
import hh.C4508a;
import io.ktor.utils.io.f;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import zi.InterfaceC7015a;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC7015a f11826a = AbstractC4283a.a("io.ktor.client.plugins.defaultTransformers");

    public static final class a extends SuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public int f11827n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f11828o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f11829p;

        /* renamed from: Tg.g$a$a, reason: collision with other inner class name */
        public static final class C0234a extends AbstractC2423b.a {

            /* renamed from: a, reason: collision with root package name */
            public final C2011c f11830a;

            /* renamed from: b, reason: collision with root package name */
            public final long f11831b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f11832c;

            public C0234a(C2011c c2011c, Object obj) {
                this.f11832c = obj;
                this.f11830a = c2011c == null ? C2011c.a.f16016a.a() : c2011c;
                this.f11831b = ((byte[]) obj).length;
            }

            @Override // bh.AbstractC2423b
            public Long a() {
                return Long.valueOf(this.f11831b);
            }

            @Override // bh.AbstractC2423b
            public C2011c b() {
                return this.f11830a;
            }

            @Override // bh.AbstractC2423b.a
            public byte[] d() {
                return (byte[]) this.f11832c;
            }
        }

        public static final class b extends AbstractC2423b.c {

            /* renamed from: a, reason: collision with root package name */
            public final Long f11833a;

            /* renamed from: b, reason: collision with root package name */
            public final C2011c f11834b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f11835c;

            public b(AbstractC4384e abstractC4384e, C2011c c2011c, Object obj) {
                this.f11835c = obj;
                String j10 = ((Wg.c) abstractC4384e.b()).a().j(C2023o.f16113a.g());
                this.f11833a = j10 != null ? Long.valueOf(Long.parseLong(j10)) : null;
                this.f11834b = c2011c == null ? C2011c.a.f16016a.a() : c2011c;
            }

            @Override // bh.AbstractC2423b
            public Long a() {
                return this.f11833a;
            }

            @Override // bh.AbstractC2423b
            public C2011c b() {
                return this.f11834b;
            }

            @Override // bh.AbstractC2423b.c
            public io.ktor.utils.io.f d() {
                return (io.ktor.utils.io.f) this.f11835c;
            }
        }

        public a(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC4384e abstractC4384e, Object obj, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f11828o = abstractC4384e;
            aVar.f11829p = obj;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AbstractC2423b c0234a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f11827n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC4384e abstractC4384e = (AbstractC4384e) this.f11828o;
                Object obj2 = this.f11829p;
                C2020l a10 = ((Wg.c) abstractC4384e.b()).a();
                C2023o c2023o = C2023o.f16113a;
                if (a10.j(c2023o.c()) == null) {
                    ((Wg.c) abstractC4384e.b()).a().f(c2023o.c(), "*/*");
                }
                C2011c d10 = AbstractC2026s.d((ah.r) abstractC4384e.b());
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (d10 == null) {
                        d10 = C2011c.C0334c.f16038a.a();
                    }
                    c0234a = new C2424c(str, d10, null, 4, null);
                } else {
                    c0234a = obj2 instanceof byte[] ? new C0234a(d10, obj2) : obj2 instanceof io.ktor.utils.io.f ? new b(abstractC4384e, d10, obj2) : obj2 instanceof AbstractC2423b ? (AbstractC2423b) obj2 : h.a(d10, (Wg.c) abstractC4384e.b(), obj2);
                }
                if ((c0234a != null ? c0234a.b() : null) != null) {
                    ((Wg.c) abstractC4384e.b()).a().l(c2023o.h());
                    g.f11826a.b("Transformed with default transformers request body for " + ((Wg.c) abstractC4384e.b()).i() + " from " + Reflection.getOrCreateKotlinClass(obj2.getClass()));
                    this.f11828o = null;
                    this.f11827n = 1;
                    if (abstractC4384e.e(c0234a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public static final class b extends SuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public Object f11836n;

        /* renamed from: o, reason: collision with root package name */
        public Object f11837o;

        /* renamed from: p, reason: collision with root package name */
        public int f11838p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f11839q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f11840r;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f11841n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f11842o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Object f11843p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ Xg.c f11844q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, Xg.c cVar, Continuation continuation) {
                super(2, continuation);
                this.f11843p = obj;
                this.f11844q = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(this.f11843p, this.f11844q, continuation);
                aVar.f11842o = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(io.ktor.utils.io.r rVar, Continuation continuation) {
                return ((a) create(rVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f11841n;
                try {
                    if (i10 != 0) {
                        try {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th2) {
                            Xg.e.c(this.f11844q);
                            throw th2;
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        io.ktor.utils.io.r rVar = (io.ktor.utils.io.r) this.f11842o;
                        io.ktor.utils.io.f fVar = (io.ktor.utils.io.f) this.f11843p;
                        io.ktor.utils.io.i d10 = rVar.d();
                        this.f11841n = 1;
                        if (io.ktor.utils.io.g.b(fVar, d10, LongCompanionObject.MAX_VALUE, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    Xg.e.c(this.f11844q);
                    return Unit.INSTANCE;
                } catch (CancellationException e10) {
                    Q.d(this.f11844q, e10);
                    throw e10;
                } catch (Throwable th3) {
                    Q.c(this.f11844q, "Receive failed", th3);
                    throw th3;
                }
            }
        }

        /* renamed from: Tg.g$b$b, reason: collision with other inner class name */
        public static final class C0235b extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Ph.A f11845d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0235b(Ph.A a10) {
                super(1);
                this.f11845d = a10;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(Throwable th2) {
                this.f11845d.y1();
            }
        }

        public b(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC4384e abstractC4384e, Xg.d dVar, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.f11839q = abstractC4384e;
            bVar.f11840r = dVar;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x02f1  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x022a  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x022e  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0268  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01b4  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x015e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AbstractC4384e abstractC4384e;
            C4508a a10;
            Xg.c f10;
            Object e10;
            AbstractC4384e abstractC4384e2;
            Object e11;
            Object a11;
            AbstractC4384e abstractC4384e3;
            Object a12;
            AbstractC4384e abstractC4384e4;
            AbstractC4384e abstractC4384e5;
            C4508a c4508a;
            Object a13;
            AbstractC4384e abstractC4384e6;
            AbstractC4384e abstractC4384e7;
            Object e12;
            Object e13;
            AbstractC4384e abstractC4384e8;
            Object e14;
            byte[] bArr;
            Long b10;
            boolean z10;
            Object e15;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            Xg.d dVar = null;
            switch (this.f11838p) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    abstractC4384e = (AbstractC4384e) this.f11839q;
                    Xg.d dVar2 = (Xg.d) this.f11840r;
                    a10 = dVar2.a();
                    Object b11 = dVar2.b();
                    if (!(b11 instanceof io.ktor.utils.io.f)) {
                        return Unit.INSTANCE;
                    }
                    f10 = ((Og.b) abstractC4384e.b()).f();
                    KClass a14 = a10.a();
                    if (Intrinsics.areEqual(a14, Reflection.getOrCreateKotlinClass(Unit.class))) {
                        io.ktor.utils.io.h.a((io.ktor.utils.io.f) b11);
                        Xg.d dVar3 = new Xg.d(a10, Unit.INSTANCE);
                        this.f11839q = abstractC4384e;
                        this.f11840r = a10;
                        this.f11838p = 1;
                        e12 = abstractC4384e.e(dVar3, this);
                        if (e12 != coroutine_suspended) {
                            abstractC4384e2 = abstractC4384e;
                            dVar = (Xg.d) e12;
                            abstractC4384e = abstractC4384e2;
                            if (dVar != null) {
                                g.f11826a.b("Transformed with default transformers response body for " + ((Og.b) abstractC4384e.b()).e().getUrl() + " to " + a10.a());
                            }
                            return Unit.INSTANCE;
                        }
                    } else if (Intrinsics.areEqual(a14, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                        this.f11839q = abstractC4384e;
                        this.f11840r = a10;
                        this.f11836n = abstractC4384e;
                        this.f11837o = a10;
                        this.f11838p = 2;
                        a13 = f.b.a((io.ktor.utils.io.f) b11, 0L, this, 1, null);
                        if (a13 != coroutine_suspended) {
                            abstractC4384e6 = abstractC4384e;
                            abstractC4384e7 = abstractC4384e6;
                            c4508a = a10;
                            Xg.d dVar4 = new Xg.d(a10, Boxing.boxInt(Integer.parseInt(kh.n.p2((kh.n) a13, 0, 0, 3, null))));
                            this.f11839q = abstractC4384e7;
                            this.f11840r = c4508a;
                            this.f11836n = null;
                            this.f11837o = null;
                            this.f11838p = 3;
                            e13 = abstractC4384e6.e(dVar4, this);
                            if (e13 != coroutine_suspended) {
                                abstractC4384e8 = abstractC4384e7;
                                dVar = (Xg.d) e13;
                                abstractC4384e = abstractC4384e8;
                                a10 = c4508a;
                                if (dVar != null) {
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    } else {
                        if (Intrinsics.areEqual(a14, Reflection.getOrCreateKotlinClass(kh.l.class)) ? true : Intrinsics.areEqual(a14, Reflection.getOrCreateKotlinClass(kh.n.class))) {
                            this.f11839q = abstractC4384e;
                            this.f11840r = a10;
                            this.f11836n = abstractC4384e;
                            this.f11837o = a10;
                            this.f11838p = 4;
                            a12 = f.b.a((io.ktor.utils.io.f) b11, 0L, this, 1, null);
                            if (a12 != coroutine_suspended) {
                                abstractC4384e4 = abstractC4384e;
                                abstractC4384e5 = abstractC4384e4;
                                c4508a = a10;
                                Xg.d dVar5 = new Xg.d(a10, a12);
                                this.f11839q = abstractC4384e5;
                                this.f11840r = c4508a;
                                this.f11836n = null;
                                this.f11837o = null;
                                this.f11838p = 5;
                                e14 = abstractC4384e4.e(dVar5, this);
                                if (e14 != coroutine_suspended) {
                                    abstractC4384e8 = abstractC4384e5;
                                    dVar = (Xg.d) e14;
                                    abstractC4384e = abstractC4384e8;
                                    a10 = c4508a;
                                    if (dVar != null) {
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        } else if (Intrinsics.areEqual(a14, Reflection.getOrCreateKotlinClass(byte[].class))) {
                            this.f11839q = abstractC4384e;
                            this.f11840r = a10;
                            this.f11836n = f10;
                            this.f11838p = 6;
                            a11 = ch.g.a((io.ktor.utils.io.f) b11, this);
                            if (a11 != coroutine_suspended) {
                                abstractC4384e3 = abstractC4384e;
                                bArr = (byte[]) a11;
                                b10 = AbstractC2026s.b(f10);
                                z10 = ch.u.f27846a.a() && f10.a().get(C2023o.f16113a.f()) == null;
                                boolean areEqual = Intrinsics.areEqual(((Og.b) abstractC4384e3.b()).e().getMethod(), C2027t.f16165b.b());
                                if (z10 && !areEqual && b10 != null && b10.longValue() > 0) {
                                    if (!(bArr.length == ((int) b10.longValue()))) {
                                        throw new IllegalStateException(("Expected " + b10 + ", actual " + bArr.length).toString());
                                    }
                                }
                                Xg.d dVar6 = new Xg.d(a10, bArr);
                                this.f11839q = abstractC4384e3;
                                this.f11840r = a10;
                                this.f11836n = null;
                                this.f11838p = 7;
                                e15 = abstractC4384e3.e(dVar6, this);
                                if (e15 != coroutine_suspended) {
                                    abstractC4384e2 = abstractC4384e3;
                                    dVar = (Xg.d) e15;
                                    abstractC4384e = abstractC4384e2;
                                    if (dVar != null) {
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        } else {
                            if (!Intrinsics.areEqual(a14, Reflection.getOrCreateKotlinClass(io.ktor.utils.io.f.class))) {
                                if (Intrinsics.areEqual(a14, Reflection.getOrCreateKotlinClass(ah.v.class))) {
                                    io.ktor.utils.io.h.a((io.ktor.utils.io.f) b11);
                                    Xg.d dVar7 = new Xg.d(a10, f10.f());
                                    this.f11839q = abstractC4384e;
                                    this.f11840r = a10;
                                    this.f11838p = 9;
                                    e10 = abstractC4384e.e(dVar7, this);
                                    if (e10 != coroutine_suspended) {
                                        abstractC4384e2 = abstractC4384e;
                                        dVar = (Xg.d) e10;
                                        abstractC4384e = abstractC4384e2;
                                    }
                                }
                                if (dVar != null) {
                                }
                                return Unit.INSTANCE;
                            }
                            Ph.A a15 = F0.a((C0) f10.getCoroutineContext().get(C0.f9001U2));
                            io.ktor.utils.io.q c10 = io.ktor.utils.io.n.c(abstractC4384e, f10.getCoroutineContext(), false, new a(b11, f10, null), 2, null);
                            c10.invokeOnCompletion(new C0235b(a15));
                            Xg.d dVar8 = new Xg.d(a10, c10.d());
                            this.f11839q = abstractC4384e;
                            this.f11840r = a10;
                            this.f11838p = 8;
                            e11 = abstractC4384e.e(dVar8, this);
                            if (e11 != coroutine_suspended) {
                                abstractC4384e2 = abstractC4384e;
                                dVar = (Xg.d) e11;
                                abstractC4384e = abstractC4384e2;
                                if (dVar != null) {
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    C4508a c4508a2 = (C4508a) this.f11840r;
                    abstractC4384e2 = (AbstractC4384e) this.f11839q;
                    ResultKt.throwOnFailure(obj);
                    a10 = c4508a2;
                    e12 = obj;
                    dVar = (Xg.d) e12;
                    abstractC4384e = abstractC4384e2;
                    if (dVar != null) {
                    }
                    return Unit.INSTANCE;
                case 2:
                    C4508a c4508a3 = (C4508a) this.f11837o;
                    abstractC4384e6 = (AbstractC4384e) this.f11836n;
                    c4508a = (C4508a) this.f11840r;
                    abstractC4384e7 = (AbstractC4384e) this.f11839q;
                    ResultKt.throwOnFailure(obj);
                    a10 = c4508a3;
                    a13 = obj;
                    Xg.d dVar42 = new Xg.d(a10, Boxing.boxInt(Integer.parseInt(kh.n.p2((kh.n) a13, 0, 0, 3, null))));
                    this.f11839q = abstractC4384e7;
                    this.f11840r = c4508a;
                    this.f11836n = null;
                    this.f11837o = null;
                    this.f11838p = 3;
                    e13 = abstractC4384e6.e(dVar42, this);
                    if (e13 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 3:
                    C4508a c4508a4 = (C4508a) this.f11840r;
                    abstractC4384e8 = (AbstractC4384e) this.f11839q;
                    ResultKt.throwOnFailure(obj);
                    c4508a = c4508a4;
                    e13 = obj;
                    dVar = (Xg.d) e13;
                    abstractC4384e = abstractC4384e8;
                    a10 = c4508a;
                    if (dVar != null) {
                    }
                    return Unit.INSTANCE;
                case 4:
                    C4508a c4508a5 = (C4508a) this.f11837o;
                    abstractC4384e4 = (AbstractC4384e) this.f11836n;
                    c4508a = (C4508a) this.f11840r;
                    abstractC4384e5 = (AbstractC4384e) this.f11839q;
                    ResultKt.throwOnFailure(obj);
                    a10 = c4508a5;
                    a12 = obj;
                    Xg.d dVar52 = new Xg.d(a10, a12);
                    this.f11839q = abstractC4384e5;
                    this.f11840r = c4508a;
                    this.f11836n = null;
                    this.f11837o = null;
                    this.f11838p = 5;
                    e14 = abstractC4384e4.e(dVar52, this);
                    if (e14 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 5:
                    C4508a c4508a6 = (C4508a) this.f11840r;
                    abstractC4384e8 = (AbstractC4384e) this.f11839q;
                    ResultKt.throwOnFailure(obj);
                    c4508a = c4508a6;
                    e14 = obj;
                    dVar = (Xg.d) e14;
                    abstractC4384e = abstractC4384e8;
                    a10 = c4508a;
                    if (dVar != null) {
                    }
                    return Unit.INSTANCE;
                case 6:
                    Xg.c cVar = (Xg.c) this.f11836n;
                    C4508a c4508a7 = (C4508a) this.f11840r;
                    abstractC4384e3 = (AbstractC4384e) this.f11839q;
                    ResultKt.throwOnFailure(obj);
                    a10 = c4508a7;
                    f10 = cVar;
                    a11 = obj;
                    bArr = (byte[]) a11;
                    b10 = AbstractC2026s.b(f10);
                    if (ch.u.f27846a.a()) {
                        break;
                    }
                    boolean areEqual2 = Intrinsics.areEqual(((Og.b) abstractC4384e3.b()).e().getMethod(), C2027t.f16165b.b());
                    if (z10) {
                        if (!(bArr.length == ((int) b10.longValue()))) {
                        }
                        break;
                    }
                    Xg.d dVar62 = new Xg.d(a10, bArr);
                    this.f11839q = abstractC4384e3;
                    this.f11840r = a10;
                    this.f11836n = null;
                    this.f11838p = 7;
                    e15 = abstractC4384e3.e(dVar62, this);
                    if (e15 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 7:
                    C4508a c4508a8 = (C4508a) this.f11840r;
                    abstractC4384e2 = (AbstractC4384e) this.f11839q;
                    ResultKt.throwOnFailure(obj);
                    a10 = c4508a8;
                    e15 = obj;
                    dVar = (Xg.d) e15;
                    abstractC4384e = abstractC4384e2;
                    if (dVar != null) {
                    }
                    return Unit.INSTANCE;
                case 8:
                    C4508a c4508a9 = (C4508a) this.f11840r;
                    abstractC4384e2 = (AbstractC4384e) this.f11839q;
                    ResultKt.throwOnFailure(obj);
                    a10 = c4508a9;
                    e11 = obj;
                    dVar = (Xg.d) e11;
                    abstractC4384e = abstractC4384e2;
                    if (dVar != null) {
                    }
                    return Unit.INSTANCE;
                case 9:
                    C4508a c4508a10 = (C4508a) this.f11840r;
                    abstractC4384e2 = (AbstractC4384e) this.f11839q;
                    ResultKt.throwOnFailure(obj);
                    a10 = c4508a10;
                    e10 = obj;
                    dVar = (Xg.d) e10;
                    abstractC4384e = abstractC4384e2;
                    if (dVar != null) {
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static final void b(Ng.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.z0().l(Wg.f.f13260g.b(), new a(null));
        aVar.A0().l(Xg.f.f13844g.a(), new b(null));
        h.b(aVar);
    }
}
