package R2;

import Ph.AbstractC1455i;
import Ph.AbstractC1481v0;
import Ph.C0;
import Ph.G0;
import Q2.AbstractC1500k;
import Q2.AbstractC1507s;
import Q2.AbstractC1508t;
import Q2.InterfaceC1491b;
import Q2.InterfaceC1499j;
import Q2.K;
import R2.d0;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import x0.InterfaceC6772a;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final WorkSpec f9985a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f9986b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9987c;

    /* renamed from: d, reason: collision with root package name */
    public final WorkerParameters.a f9988d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.work.c f9989e;

    /* renamed from: f, reason: collision with root package name */
    public final Z2.b f9990f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.work.a f9991g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1491b f9992h;

    /* renamed from: i, reason: collision with root package name */
    public final W2.a f9993i;

    /* renamed from: j, reason: collision with root package name */
    public final WorkDatabase f9994j;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.work.impl.model.c f9995k;

    /* renamed from: l, reason: collision with root package name */
    public final X2.a f9996l;

    /* renamed from: m, reason: collision with root package name */
    public final List f9997m;

    /* renamed from: n, reason: collision with root package name */
    public final String f9998n;

    /* renamed from: o, reason: collision with root package name */
    public final Ph.A f9999o;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.work.a f10000a;

        /* renamed from: b, reason: collision with root package name */
        public final Z2.b f10001b;

        /* renamed from: c, reason: collision with root package name */
        public final W2.a f10002c;

        /* renamed from: d, reason: collision with root package name */
        public final WorkDatabase f10003d;

        /* renamed from: e, reason: collision with root package name */
        public final WorkSpec f10004e;

        /* renamed from: f, reason: collision with root package name */
        public final List f10005f;

        /* renamed from: g, reason: collision with root package name */
        public final Context f10006g;

        /* renamed from: h, reason: collision with root package name */
        public androidx.work.c f10007h;

        /* renamed from: i, reason: collision with root package name */
        public WorkerParameters.a f10008i;

        public a(Context context, androidx.work.a configuration, Z2.b workTaskExecutor, W2.a foregroundProcessor, WorkDatabase workDatabase, WorkSpec workSpec, List tags) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
            Intrinsics.checkNotNullParameter(foregroundProcessor, "foregroundProcessor");
            Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
            Intrinsics.checkNotNullParameter(workSpec, "workSpec");
            Intrinsics.checkNotNullParameter(tags, "tags");
            this.f10000a = configuration;
            this.f10001b = workTaskExecutor;
            this.f10002c = foregroundProcessor;
            this.f10003d = workDatabase;
            this.f10004e = workSpec;
            this.f10005f = tags;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.f10006g = applicationContext;
            this.f10008i = new WorkerParameters.a();
        }

        public final d0 a() {
            return new d0(this);
        }

        public final Context b() {
            return this.f10006g;
        }

        public final androidx.work.a c() {
            return this.f10000a;
        }

        public final W2.a d() {
            return this.f10002c;
        }

        public final WorkerParameters.a e() {
            return this.f10008i;
        }

        public final List f() {
            return this.f10005f;
        }

        public final WorkDatabase g() {
            return this.f10003d;
        }

        public final WorkSpec h() {
            return this.f10004e;
        }

        public final Z2.b i() {
            return this.f10001b;
        }

        public final androidx.work.c j() {
            return this.f10007h;
        }

        public final a k(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f10008i = aVar;
            }
            return this;
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public final c.a f10009a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c.a result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "result");
                this.f10009a = result;
            }

            public final c.a a() {
                return this.f10009a;
            }

            public /* synthetic */ a(c.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? new c.a.C0416a() : aVar);
            }
        }

        /* renamed from: R2.d0$b$b, reason: collision with other inner class name */
        public static final class C0192b extends b {

            /* renamed from: a, reason: collision with root package name */
            public final c.a f10010a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0192b(c.a result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "result");
                this.f10010a = result;
            }

            public final c.a a() {
                return this.f10010a;
            }
        }

        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public final int f10011a;

            public c(int i10) {
                super(null);
                this.f10011a = i10;
            }

            public final int a() {
                return this.f10011a;
            }

            public /* synthetic */ c(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? -256 : i10);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f10012n;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f10014n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ d0 f10015o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d0 d0Var, Continuation continuation) {
                super(2, continuation);
                this.f10015o = d0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f10015o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Ph.P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f10014n;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                d0 d0Var = this.f10015o;
                this.f10014n = 1;
                Object v10 = d0Var.v(this);
                return v10 == coroutine_suspended ? coroutine_suspended : v10;
            }
        }

        public c(Continuation continuation) {
            super(2, continuation);
        }

        public static final Boolean j(b bVar, d0 d0Var) {
            boolean u10;
            if (bVar instanceof b.C0192b) {
                u10 = d0Var.r(((b.C0192b) bVar).a());
            } else if (bVar instanceof b.a) {
                d0Var.x(((b.a) bVar).a());
                u10 = false;
            } else {
                if (!(bVar instanceof b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                u10 = d0Var.u(((b.c) bVar).a());
            }
            return Boolean.valueOf(u10);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return d0.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            final b aVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f10012n;
            int i11 = 1;
            c.a aVar2 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Ph.A a10 = d0.this.f9999o;
                    a aVar3 = new a(d0.this, null);
                    this.f10012n = 1;
                    obj = AbstractC1455i.g(a10, aVar3, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                aVar = (b) obj;
            } catch (a0 e10) {
                aVar = new b.c(e10.a());
            } catch (CancellationException unused) {
                aVar = new b.a(aVar2, i11, objArr3 == true ? 1 : 0);
            } catch (Throwable th2) {
                str = f0.f10032a;
                AbstractC1508t.e().d(str, "Unexpected error in WorkerWrapper", th2);
                aVar = new b.a(objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0);
            }
            WorkDatabase workDatabase = d0.this.f9994j;
            final d0 d0Var = d0.this;
            Object runInTransaction = workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: R2.e0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Boolean j10;
                    j10 = d0.c.j(d0.b.this, d0Var);
                    return j10;
                }
            });
            Intrinsics.checkNotNullExpressionValue(runInTransaction, "workDatabase.runInTransa…          }\n            )");
            return runInTransaction;
        }
    }

    public static final class d extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f10016n;

        /* renamed from: o, reason: collision with root package name */
        public Object f10017o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f10018p;

        /* renamed from: r, reason: collision with root package name */
        public int f10020r;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10018p = obj;
            this.f10020r |= Integer.MIN_VALUE;
            return d0.this.v(this);
        }
    }

    public static final class e extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ androidx.work.c f10021d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f10022e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f10023f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ d0 f10024g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(androidx.work.c cVar, boolean z10, String str, d0 d0Var) {
            super(1);
            this.f10021d = cVar;
            this.f10022e = z10;
            this.f10023f = str;
            this.f10024g = d0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th2) {
            if (th2 instanceof a0) {
                this.f10021d.stop(((a0) th2).a());
            }
            if (!this.f10022e || this.f10023f == null) {
                return;
            }
            this.f10024g.f9991g.n().c(this.f10023f, this.f10024g.m().hashCode());
        }
    }

    public static final class f extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f10025n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ androidx.work.c f10027p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1499j f10028q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(androidx.work.c cVar, InterfaceC1499j interfaceC1499j, Continuation continuation) {
            super(2, continuation);
            this.f10027p = cVar;
            this.f10028q = interfaceC1499j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return d0.this.new f(this.f10027p, this.f10028q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((f) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        
            if (Y2.H.b(r4, r5, r6, r7, r8, r9) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            f fVar;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f10025n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Context context = d0.this.f9986b;
                WorkSpec m10 = d0.this.m();
                androidx.work.c cVar = this.f10027p;
                InterfaceC1499j interfaceC1499j = this.f10028q;
                Z2.b bVar = d0.this.f9990f;
                this.f10025n = 1;
                fVar = this;
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                fVar = this;
            }
            str = f0.f10032a;
            d0 d0Var = d0.this;
            AbstractC1508t.e().a(str, "Starting work for " + d0Var.m().workerClassName);
            Ta.o startWork = fVar.f10027p.startWork();
            Intrinsics.checkNotNullExpressionValue(startWork, "worker.startWork()");
            androidx.work.c cVar2 = fVar.f10027p;
            fVar.f10025n = 2;
            Object d10 = f0.d(startWork, cVar2, this);
            return d10 == coroutine_suspended ? coroutine_suspended : d10;
        }
    }

    public d0(a builder) {
        Ph.A b10;
        Intrinsics.checkNotNullParameter(builder, "builder");
        WorkSpec h10 = builder.h();
        this.f9985a = h10;
        this.f9986b = builder.b();
        this.f9987c = h10.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String;
        this.f9988d = builder.e();
        this.f9989e = builder.j();
        this.f9990f = builder.i();
        androidx.work.a c10 = builder.c();
        this.f9991g = c10;
        this.f9992h = c10.a();
        this.f9993i = builder.d();
        WorkDatabase g10 = builder.g();
        this.f9994j = g10;
        this.f9995k = g10.l();
        this.f9996l = g10.g();
        List f10 = builder.f();
        this.f9997m = f10;
        this.f9998n = k(f10);
        b10 = G0.b(null, 1, null);
        this.f9999o = b10;
    }

    public static final Boolean A(d0 d0Var) {
        boolean z10;
        if (d0Var.f9995k.h(d0Var.f9987c) == K.c.ENQUEUED) {
            d0Var.f9995k.n(K.c.RUNNING, d0Var.f9987c);
            d0Var.f9995k.y(d0Var.f9987c);
            d0Var.f9995k.d(d0Var.f9987c, -256);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public static final Boolean w(d0 d0Var) {
        String str;
        String str2;
        WorkSpec workSpec = d0Var.f9985a;
        if (workSpec.state != K.c.ENQUEUED) {
            str2 = f0.f10032a;
            AbstractC1508t.e().a(str2, d0Var.f9985a.workerClassName + " is not in ENQUEUED state. Nothing more to do");
            return Boolean.TRUE;
        }
        if ((!workSpec.n() && !d0Var.f9985a.m()) || d0Var.f9992h.a() >= d0Var.f9985a.c()) {
            return Boolean.FALSE;
        }
        AbstractC1508t e10 = AbstractC1508t.e();
        str = f0.f10032a;
        e10.a(str, "Delaying execution for " + d0Var.f9985a.workerClassName + " because it is being executed before schedule.");
        return Boolean.TRUE;
    }

    public final String k(List list) {
        return "Work [ id=" + this.f9987c + ", tags={ " + CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null) + " } ]";
    }

    public final X2.h l() {
        return X2.p.a(this.f9985a);
    }

    public final WorkSpec m() {
        return this.f9985a;
    }

    public final boolean n(c.a aVar) {
        String str;
        String str2;
        String str3;
        if (aVar instanceof c.a.C0417c) {
            str3 = f0.f10032a;
            AbstractC1508t.e().f(str3, "Worker result SUCCESS for " + this.f9998n);
            return this.f9985a.n() ? t() : y(aVar);
        }
        if (aVar instanceof c.a.b) {
            str2 = f0.f10032a;
            AbstractC1508t.e().f(str2, "Worker result RETRY for " + this.f9998n);
            return s(-256);
        }
        str = f0.f10032a;
        AbstractC1508t.e().f(str, "Worker result FAILURE for " + this.f9998n);
        if (this.f9985a.n()) {
            return t();
        }
        if (aVar == null) {
            aVar = new c.a.C0416a();
        }
        return x(aVar);
    }

    public final void o(int i10) {
        this.f9999o.cancel((CancellationException) new a0(i10));
    }

    public final void p(String str) {
        List mutableListOf = CollectionsKt.mutableListOf(str);
        while (!mutableListOf.isEmpty()) {
            String str2 = (String) CollectionsKt.removeLast(mutableListOf);
            if (this.f9995k.h(str2) != K.c.CANCELLED) {
                this.f9995k.n(K.c.FAILED, str2);
            }
            mutableListOf.addAll(this.f9996l.b(str2));
        }
    }

    public final Ta.o q() {
        Ph.A b10;
        Ph.L b11 = this.f9990f.b();
        b10 = G0.b(null, 1, null);
        return AbstractC1507s.k(b11.plus(b10), null, new c(null), 2, null);
    }

    public final boolean r(c.a aVar) {
        K.c h10 = this.f9995k.h(this.f9987c);
        this.f9994j.k().a(this.f9987c);
        if (h10 == null) {
            return false;
        }
        if (h10 == K.c.RUNNING) {
            return n(aVar);
        }
        if (h10.b()) {
            return false;
        }
        return s(-512);
    }

    public final boolean s(int i10) {
        this.f9995k.n(K.c.ENQUEUED, this.f9987c);
        this.f9995k.t(this.f9987c, this.f9992h.a());
        this.f9995k.A(this.f9987c, this.f9985a.getNextScheduleTimeOverrideGeneration());
        this.f9995k.o(this.f9987c, -1L);
        this.f9995k.d(this.f9987c, i10);
        return true;
    }

    public final boolean t() {
        this.f9995k.t(this.f9987c, this.f9992h.a());
        this.f9995k.n(K.c.ENQUEUED, this.f9987c);
        this.f9995k.w(this.f9987c);
        this.f9995k.A(this.f9987c, this.f9985a.getNextScheduleTimeOverrideGeneration());
        this.f9995k.b(this.f9987c);
        this.f9995k.o(this.f9987c, -1L);
        return false;
    }

    public final boolean u(int i10) {
        String str;
        String str2;
        K.c h10 = this.f9995k.h(this.f9987c);
        if (h10 == null || h10.b()) {
            str = f0.f10032a;
            AbstractC1508t.e().a(str, "Status for " + this.f9987c + " is " + h10 + " ; not doing any work");
            return false;
        }
        str2 = f0.f10032a;
        AbstractC1508t.e().a(str2, "Status for " + this.f9987c + " is " + h10 + "; not doing any work and rescheduling for later execution");
        this.f9995k.n(K.c.ENQUEUED, this.f9987c);
        this.f9995k.d(this.f9987c, i10);
        this.f9995k.o(this.f9987c, -1L);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Continuation continuation) {
        d dVar;
        int i10;
        androidx.work.b a10;
        String str;
        String str2;
        String str3;
        d0 d0Var;
        WorkerParameters workerParameters;
        String str4;
        InterfaceC6772a p10;
        String str5;
        String str6;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f10020r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f10020r = i11 - Integer.MIN_VALUE;
                Object obj = dVar.f10018p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = dVar.f10020r;
                int i12 = 1;
                DefaultConstructorMarker defaultConstructorMarker = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    boolean isEnabled = this.f9991g.n().isEnabled();
                    String traceTag = this.f9985a.getTraceTag();
                    if (isEnabled && traceTag != null) {
                        this.f9991g.n().d(traceTag, this.f9985a.hashCode());
                    }
                    Boolean shouldExit = (Boolean) this.f9994j.runInTransaction(new Callable() { // from class: R2.b0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Boolean w10;
                            w10 = d0.w(d0.this);
                            return w10;
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(shouldExit, "shouldExit");
                    int i13 = 0;
                    if (shouldExit.booleanValue()) {
                        return new b.c(i13, i12, defaultConstructorMarker);
                    }
                    if (this.f9985a.n()) {
                        a10 = this.f9985a.input;
                    } else {
                        AbstractC1500k b10 = this.f9991g.f().b(this.f9985a.inputMergerClassName);
                        if (b10 == null) {
                            str = f0.f10032a;
                            AbstractC1508t.e().c(str, "Could not create Input Merger " + this.f9985a.inputMergerClassName);
                            return new b.a(objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0);
                        }
                        a10 = b10.a(CollectionsKt.plus((Collection) CollectionsKt.listOf(this.f9985a.input), (Iterable) this.f9995k.k(this.f9987c)));
                    }
                    androidx.work.b bVar = a10;
                    UUID fromString = UUID.fromString(this.f9987c);
                    List list = this.f9997m;
                    WorkerParameters.a aVar = this.f9988d;
                    WorkSpec workSpec = this.f9985a;
                    WorkerParameters workerParameters2 = new WorkerParameters(fromString, bVar, list, aVar, workSpec.runAttemptCount, workSpec.getGeneration(), this.f9991g.d(), this.f9991g.o(), this.f9990f, this.f9991g.q(), new Y2.L(this.f9994j, this.f9990f), new Y2.J(this.f9994j, this.f9993i, this.f9990f));
                    androidx.work.c cVar = this.f9989e;
                    if (cVar == null) {
                        try {
                            cVar = this.f9991g.q().b(this.f9986b, this.f9985a.workerClassName, workerParameters2);
                        } catch (Throwable th2) {
                            str2 = f0.f10032a;
                            AbstractC1508t.e().c(str2, "Could not create Worker " + this.f9985a.workerClassName);
                            InterfaceC6772a r10 = this.f9991g.r();
                            if (r10 != null) {
                                Q2.N n10 = new Q2.N(this.f9985a.workerClassName, workerParameters2, th2);
                                str3 = f0.f10032a;
                                Y2.N.a(r10, n10, str3);
                            }
                            return new b.a(null, 1, 0 == true ? 1 : 0);
                        }
                    }
                    cVar.setUsed();
                    CoroutineContext.Element element = dVar.get$context().get(C0.f9001U2);
                    Intrinsics.checkNotNull(element);
                    C0 c02 = (C0) element;
                    c02.invokeOnCompletion(new e(cVar, isEnabled, traceTag, this));
                    if (!z()) {
                        return new b.c(0, 1, null);
                    }
                    int i14 = 0;
                    int i15 = 1;
                    DefaultConstructorMarker defaultConstructorMarker2 = null;
                    if (c02.isCancelled()) {
                        return new b.c(i14, i15, defaultConstructorMarker2);
                    }
                    InterfaceC1499j b11 = workerParameters2.b();
                    Intrinsics.checkNotNullExpressionValue(b11, "params.foregroundUpdater");
                    Executor a11 = this.f9990f.a();
                    Intrinsics.checkNotNullExpressionValue(a11, "workTaskExecutor.getMainThreadExecutor()");
                    Ph.L b12 = AbstractC1481v0.b(a11);
                    try {
                        f fVar = new f(cVar, b11, null);
                        dVar.f10016n = this;
                        dVar.f10017o = workerParameters2;
                        dVar.f10020r = 1;
                        obj = AbstractC1455i.g(b12, fVar, dVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        d0Var = this;
                        workerParameters = workerParameters2;
                    } catch (CancellationException e10) {
                        e = e10;
                        d0Var = this;
                        str6 = f0.f10032a;
                        AbstractC1508t.e().g(str6, d0Var.f9998n + " was cancelled", e);
                        throw e;
                    } catch (Throwable th3) {
                        th = th3;
                        d0Var = this;
                        workerParameters = workerParameters2;
                        str4 = f0.f10032a;
                        AbstractC1508t.e().d(str4, d0Var.f9998n + " failed because it threw an exception/error", th);
                        p10 = d0Var.f9991g.p();
                        if (p10 != null) {
                            Q2.N n11 = new Q2.N(d0Var.f9985a.workerClassName, workerParameters, th);
                            str5 = f0.f10032a;
                            Y2.N.a(p10, n11, str5);
                        }
                        return new b.a(null, 1, 0 == true ? 1 : 0);
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    workerParameters = (WorkerParameters) dVar.f10017o;
                    d0Var = (d0) dVar.f10016n;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (CancellationException e11) {
                        e = e11;
                        str6 = f0.f10032a;
                        AbstractC1508t.e().g(str6, d0Var.f9998n + " was cancelled", e);
                        throw e;
                    } catch (Throwable th4) {
                        th = th4;
                        str4 = f0.f10032a;
                        AbstractC1508t.e().d(str4, d0Var.f9998n + " failed because it threw an exception/error", th);
                        p10 = d0Var.f9991g.p();
                        if (p10 != null) {
                        }
                        return new b.a(null, 1, 0 == true ? 1 : 0);
                    }
                }
                c.a result = (c.a) obj;
                Intrinsics.checkNotNullExpressionValue(result, "result");
                return new b.C0192b(result);
            }
        }
        dVar = new d(continuation);
        Object obj2 = dVar.f10018p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = dVar.f10020r;
        int i122 = 1;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        Object[] objArr3 = 0;
        Object[] objArr22 = 0;
        if (i10 != 0) {
        }
        c.a result2 = (c.a) obj2;
        Intrinsics.checkNotNullExpressionValue(result2, "result");
        return new b.C0192b(result2);
    }

    public final boolean x(c.a result) {
        Intrinsics.checkNotNullParameter(result, "result");
        p(this.f9987c);
        androidx.work.b e10 = ((c.a.C0416a) result).e();
        Intrinsics.checkNotNullExpressionValue(e10, "failure.outputData");
        this.f9995k.A(this.f9987c, this.f9985a.getNextScheduleTimeOverrideGeneration());
        this.f9995k.s(this.f9987c, e10);
        return false;
    }

    public final boolean y(c.a aVar) {
        String str;
        this.f9995k.n(K.c.SUCCEEDED, this.f9987c);
        Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
        androidx.work.b e10 = ((c.a.C0417c) aVar).e();
        Intrinsics.checkNotNullExpressionValue(e10, "success.outputData");
        this.f9995k.s(this.f9987c, e10);
        long a10 = this.f9992h.a();
        for (String str2 : this.f9996l.b(this.f9987c)) {
            if (this.f9995k.h(str2) == K.c.BLOCKED && this.f9996l.c(str2)) {
                str = f0.f10032a;
                AbstractC1508t.e().f(str, "Setting status to enqueued for " + str2);
                this.f9995k.n(K.c.ENQUEUED, str2);
                this.f9995k.t(str2, a10);
            }
        }
        return false;
    }

    public final boolean z() {
        Object runInTransaction = this.f9994j.runInTransaction((Callable<Object>) new Callable() { // from class: R2.c0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Boolean A10;
                A10 = d0.A(d0.this);
                return A10;
            }
        });
        Intrinsics.checkNotNullExpressionValue(runInTransaction, "workDatabase.runInTransa…e\n            }\n        )");
        return ((Boolean) runInTransaction).booleanValue();
    }
}
