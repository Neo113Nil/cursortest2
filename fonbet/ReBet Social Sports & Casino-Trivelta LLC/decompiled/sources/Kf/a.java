package Kf;

import Ge.h;
import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.M0;
import Ph.P;
import com.zoho.salesiqembed.ZohoSalesIQ;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.C5582a;
import og.i;
import td.C6461a;
import ve.InterfaceC6686a;
import we.e;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6632a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f6633b = LazyKt.lazy(d.f6645d);

    /* renamed from: c, reason: collision with root package name */
    public static final Lazy f6634c = LazyKt.lazy(C0138a.f6636d);

    /* renamed from: d, reason: collision with root package name */
    public static final Lazy f6635d = LazyKt.lazy(c.f6644d);

    /* renamed from: Kf.a$a, reason: collision with other inner class name */
    public static final class C0138a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C0138a f6636d = new C0138a();

        public C0138a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Jf.a invoke() {
            return new Jf.a(a.f6632a.g());
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f6637n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Map f6638o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f6639p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6686a f6640q;

        /* renamed from: Kf.a$b$a, reason: collision with other inner class name */
        public static final class C0139a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f6641n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ C5582a f6642o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ InterfaceC6686a f6643p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0139a(C5582a c5582a, InterfaceC6686a interfaceC6686a, Continuation continuation) {
                super(2, continuation);
                this.f6642o = c5582a;
                this.f6643p = interfaceC6686a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0139a(this.f6642o, this.f6643p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((C0139a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f6641n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C5582a c5582a = this.f6642o;
                InterfaceC6686a interfaceC6686a = this.f6643p;
                if (c5582a.d()) {
                    interfaceC6686a.a(e.f67680b.b(c5582a.b()));
                }
                C5582a c5582a2 = this.f6642o;
                InterfaceC6686a interfaceC6686a2 = this.f6643p;
                if (!c5582a2.d()) {
                    Intrinsics.checkNotNull(c5582a2.c(), "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                    interfaceC6686a2.a(e.f67680b.a(we.d.f67632N));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map map, boolean z10, InterfaceC6686a interfaceC6686a, Continuation continuation) {
            super(2, continuation);
            this.f6638o = map;
            this.f6639p = z10;
            this.f6640q = interfaceC6686a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f6638o, this.f6639p, this.f6640q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        
            if (Ph.AbstractC1455i.g(r1, r3, r6) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
        
            if (r7 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f6637n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Jf.b f10 = a.f6632a.f();
                Map map = this.f6638o;
                boolean z10 = this.f6639p;
                this.f6637n = 1;
                obj = f10.a(map, z10, this);
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
            M0 c10 = C1452g0.c();
            C0139a c0139a = new C0139a((C5582a) obj, this.f6640q, null);
            this.f6637n = 2;
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f6644d = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Jf.b invoke() {
            return new Jf.b(a.f6632a.g());
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final d f6645d = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ef.a invoke() {
            return Ef.a.f3087a.b();
        }
    }

    public static final int d() {
        return i.m((Number) f6632a.e().a().b());
    }

    public static final void h(Map map, boolean z10, InterfaceC6686a callback) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC1459k.d(f6632a.c(), null, null, new b(map, z10, callback, null), 3, null);
    }

    public static final boolean i() {
        De.a aVar = De.a.NotificationClickActionSource;
        ZohoSalesIQ.e eVar = ZohoSalesIQ.e.SDK;
        return Intrinsics.areEqual(Ye.d.l(aVar, eVar.name()), eVar.name());
    }

    public static final void j(ZohoSalesIQ.e actionSource) {
        Intrinsics.checkNotNullParameter(actionSource, "actionSource");
        h.c(Ye.d.r(De.a.NotificationClickActionSource, actionSource.name()), false, 1, null);
    }

    public final P c() {
        return C6461a.f65810a.e();
    }

    public final Jf.a e() {
        return (Jf.a) f6634c.getValue();
    }

    public final Jf.b f() {
        return (Jf.b) f6635d.getValue();
    }

    public final Ef.a g() {
        return (Ef.a) f6633b.getValue();
    }
}
