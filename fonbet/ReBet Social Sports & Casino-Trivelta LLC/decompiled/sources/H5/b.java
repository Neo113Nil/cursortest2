package H5;

import I5.LogEntry;
import I5.i;
import I5.p;
import Ph.AbstractC1459k;
import Ph.P;
import Q5.UserContext;
import Q5.ViewContext;
import Q5.k;
import Q5.x;
import a5.C1919a;
import a5.C1920b;
import android.app.Application;
import d5.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n5.InterfaceC5670a;
import q5.C6118a;
import s5.C6339a;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static M5.a f4802b;

    /* renamed from: d, reason: collision with root package name */
    public static Application f4804d;

    /* renamed from: e, reason: collision with root package name */
    public static InterfaceC5670a f4805e;

    /* renamed from: a, reason: collision with root package name */
    public static final b f4801a = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final P f4803c = C6339a.f64787a.a();

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f4806n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Q5.b f4807o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f4808p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Map f4809q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Map f4810r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Q5.b bVar, String str, Map map, Map map2, Continuation continuation) {
            super(2, continuation);
            this.f4807o = bVar;
            this.f4808p = str;
            this.f4809q = map;
            this.f4810r = map2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f4807o, this.f4808p, this.f4809q, this.f4810r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f4806n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                X4.b bVar = (X4.b) S4.c.f10591a.g(i.c.f5422b);
                if (bVar != null) {
                    X4.a aVar = new X4.a(this.f4807o, this.f4808p, this.f4809q, this.f4810r);
                    this.f4806n = 1;
                    if (bVar.a(aVar, this) == coroutine_suspended) {
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

    /* renamed from: H5.b$b, reason: collision with other inner class name */
    public static final class C0100b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f4811n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ U4.a f4812o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0100b(U4.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f4812o = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C0100b(this.f4812o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((C0100b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f4811n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                U4.c cVar = (U4.c) S4.c.f10591a.g(i.e.f5423b);
                if (cVar != null) {
                    U4.a aVar = this.f4812o;
                    this.f4811n = 1;
                    if (cVar.w0(aVar, this) == coroutine_suspended) {
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

    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f4813n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ C1920b f4814o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C1920b c1920b, Continuation continuation) {
            super(2, continuation);
            this.f4814o = c1920b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f4814o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f4813n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C1919a c1919a = (C1919a) S4.c.f10591a.g(i.k.f5429b);
                if (c1919a != null) {
                    C1920b c1920b = this.f4814o;
                    this.f4813n = 1;
                    if (c1919a.d(c1920b, this) == coroutine_suspended) {
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

    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f4815n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ x f4816o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(x xVar, Continuation continuation) {
            super(2, continuation);
            this.f4816o = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f4816o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f4815n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            h hVar = (h) S4.c.f10591a.g(i.m.f5431b);
            if (hVar != null) {
                hVar.J(this.f4816o);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f4817n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f4818o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ long f4819p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, long j10, Continuation continuation) {
            super(2, continuation);
            this.f4818o = str;
            this.f4819p = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.f4818o, this.f4819p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((e) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f4817n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Y4.b bVar = (Y4.b) S4.c.f10591a.g(i.h.f5426b);
                if (bVar != null) {
                    Y4.a aVar = new Y4.a(this.f4818o, this.f4819p);
                    this.f4817n = 1;
                    if (bVar.a(aVar, this) == coroutine_suspended) {
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

    public static final class f extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f4820n;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((f) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f4820n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                V4.d dVar = (V4.d) S4.c.f10591a.g(i.f.f5424b);
                if (dVar != null) {
                    V4.c cVar = new V4.c(V4.b.f12504c);
                    this.f4820n = 1;
                    if (dVar.a(cVar, this) == coroutine_suspended) {
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

    public Map a() {
        p k10;
        Q5.c c10;
        Map m10;
        M5.a d10 = d();
        return (d10 == null || (k10 = d10.k()) == null || (c10 = k10.c()) == null || (m10 = c10.m()) == null) ? MapsKt.emptyMap() : m10;
    }

    public P b() {
        return f4803c;
    }

    public String c() {
        String f10;
        M5.a d10 = d();
        return (d10 == null || (f10 = d10.f()) == null) ? "" : f10;
    }

    public M5.a d() {
        return f4802b;
    }

    public UserContext e() {
        UserContext g10;
        M5.a d10 = d();
        return (d10 == null || (g10 = d10.g()) == null) ? new UserContext((String) null, (String) null, (String) null, (Map) null, 15, (DefaultConstructorMarker) null) : g10;
    }

    public void f(Application application, Q5.c options, k framework) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(framework, "framework");
        f4804d = application;
        H5.a.f4799a.e(framework);
        E5.b.f3006a.i(options.h());
        B5.a.f796a.d(application);
        D5.c.f2548a.d(application);
        t5.c.f65680a.g(application);
        C5.d.f1144a.w();
        M5.c cVar = new M5.c(options, null, null, 6, null);
        cVar.n();
        f4805e = new n5.c(cVar, 0L, null, 6, null);
        S4.c cVar2 = S4.c.f10591a;
        InterfaceC5670a interfaceC5670a = f4805e;
        if (interfaceC5670a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("openTelemetry");
            interfaceC5670a = null;
        }
        cVar2.j(application, interfaceC5670a.b(), cVar);
        Unit unit = Unit.INSTANCE;
        f4801a.m();
        O5.b.f8334a.g(cVar);
        p(cVar);
    }

    public void g(Q5.b severity, String message, Map map, Map map2) {
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC1459k.d(b(), null, null, new a(severity, message, map, map2, null), 3, null);
    }

    public void h(U4.a errorDecorator) {
        Intrinsics.checkNotNullParameter(errorDecorator, "errorDecorator");
        AbstractC1459k.d(b(), null, null, new C0100b(errorDecorator, null), 3, null);
    }

    public void i(C1920b details) {
        Intrinsics.checkNotNullParameter(details, "details");
        AbstractC1459k.d(b(), null, null, new c(details, null), 3, null);
    }

    public void j(x details) {
        Intrinsics.checkNotNullParameter(details, "details");
        AbstractC1459k.d(b(), null, null, new d(details, null), 3, null);
    }

    public void k(String name, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        AbstractC1459k.d(b(), null, null, new e(name, j10, null), 3, null);
    }

    public void l(List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        List list = data;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((LogEntry) F5.b.b().c(LogEntry.INSTANCE.serializer(), F5.b.e((Map) it.next())));
        }
        InterfaceC5670a interfaceC5670a = f4805e;
        if (interfaceC5670a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("openTelemetry");
            interfaceC5670a = null;
        }
        interfaceC5670a.a().m1(arrayList);
    }

    public final void m() {
        AbstractC1459k.d(b(), null, null, new f(null), 3, null);
    }

    public void n(String appName, String appVersion) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        M5.a d10 = d();
        if (d10 != null) {
            d10.c(appName, appVersion);
        }
    }

    public void o(Map labels) {
        Intrinsics.checkNotNullParameter(labels, "labels");
        M5.a d10 = d();
        if (d10 != null) {
            d10.h(labels);
        }
    }

    public void p(M5.a aVar) {
        f4802b = aVar;
    }

    public void q(UserContext userContext) {
        Intrinsics.checkNotNullParameter(userContext, "userContext");
        M5.a d10 = d();
        if (d10 != null) {
            d10.d(userContext);
        }
    }

    public void r(String viewName) {
        Intrinsics.checkNotNullParameter(viewName, "viewName");
        M5.a d10 = d();
        if (d10 != null) {
            d10.j(ViewContext.b(d10.k().c().w(), viewName, null, null, 6, null));
        }
    }

    public void s() {
        M5.a d10 = d();
        if (d10 != null) {
            d10.shutdown();
        }
        Application application = null;
        p(null);
        InterfaceC5670a interfaceC5670a = f4805e;
        if (interfaceC5670a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("openTelemetry");
            interfaceC5670a = null;
        }
        interfaceC5670a.shutdown();
        S4.c.f10591a.n();
        D5.c cVar = D5.c.f2548a;
        Application application2 = f4804d;
        if (application2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("application");
            application2 = null;
        }
        cVar.h(application2);
        t5.c cVar2 = t5.c.f65680a;
        Application application3 = f4804d;
        if (application3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("application");
        } else {
            application = application3;
        }
        cVar2.h(application);
        C6118a.f63407a.a();
        C5.d.f1144a.A();
    }
}
