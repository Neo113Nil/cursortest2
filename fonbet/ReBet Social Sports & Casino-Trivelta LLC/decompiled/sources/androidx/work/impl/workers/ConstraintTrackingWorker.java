package androidx.work.impl.workers;

import Ph.AbstractC1455i;
import Ph.AbstractC1459k;
import Ph.AbstractC1481v0;
import Ph.C0;
import Ph.L;
import Ph.P;
import Ph.Q;
import Q2.AbstractC1508t;
import Q2.O;
import R2.Y;
import Ta.o;
import V2.n;
import Y2.N;
import a3.AbstractC1916a;
import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.constraints.i;
import androidx.work.impl.model.WorkSpec;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import x0.InterfaceC6772a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\nJ(\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", W9.d.f13160a, "Landroidx/work/c;", "delegate", "Landroidx/work/impl/constraints/i;", "workConstraintsTracker", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "c", "(Landroidx/work/c;Landroidx/work/impl/constraints/i;Landroidx/work/impl/model/WorkSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/work/WorkerParameters;", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConstraintTrackingWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorker\n+ 2 LoggerExt.kt\nandroidx/work/LoggerExtKt\n*L\n1#1,168:1\n29#2:169\n19#2:170\n19#2:171\n19#2:172\n*S KotlinDebug\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorker\n*L\n65#1:169\n75#1:170\n78#1:171\n87#1:172\n*E\n"})
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final WorkerParameters workerParameters;

    public static final class a extends CancellationException {

        /* renamed from: a, reason: collision with root package name */
        public final int f24026a;

        public a(int i10) {
            this.f24026a = i10;
        }

        public final int a() {
            return this.f24026a;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f24027n;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ConstraintTrackingWorker.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f24027n;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            this.f24027n = 1;
            Object d10 = constraintTrackingWorker.d(this);
            return d10 == coroutine_suspended ? coroutine_suspended : d10;
        }
    }

    public static final class c extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f24029n;

        /* renamed from: p, reason: collision with root package name */
        public int f24031p;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f24029n = obj;
            this.f24031p |= Integer.MIN_VALUE;
            return ConstraintTrackingWorker.this.c(null, null, null, this);
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f24032n;

        /* renamed from: o, reason: collision with root package name */
        public Object f24033o;

        /* renamed from: p, reason: collision with root package name */
        public int f24034p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f24035q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ androidx.work.c f24036r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ i f24037s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ WorkSpec f24038t;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f24039n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ i f24040o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ WorkSpec f24041p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ AtomicInteger f24042q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ o f24043r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, WorkSpec workSpec, AtomicInteger atomicInteger, o oVar, Continuation continuation) {
                super(2, continuation);
                this.f24040o = iVar;
                this.f24041p = workSpec;
                this.f24042q = atomicInteger;
                this.f24043r = oVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f24040o, this.f24041p, this.f24042q, this.f24043r, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f24039n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    i iVar = this.f24040o;
                    WorkSpec workSpec = this.f24041p;
                    this.f24039n = 1;
                    obj = AbstractC1916a.c(iVar, workSpec, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.f24042q.set(((Number) obj).intValue());
                this.f24043r.cancel(true);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.work.c cVar, i iVar, WorkSpec workSpec, Continuation continuation) {
            super(2, continuation);
            this.f24036r = cVar;
            this.f24037s = iVar;
            this.f24038t = workSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(this.f24036r, this.f24037s, this.f24038t, continuation);
            dVar.f24035q = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00ec A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #3 {all -> 0x00a9, blocks: (B:28:0x0083, B:29:0x00a8, B:15:0x00ac, B:18:0x00da, B:21:0x00e2, B:22:0x00eb, B:24:0x00ec), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00d9  */
        /* JADX WARN: Type inference failed for: r1v0, types: [Ph.C0, int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C0 d10;
            Throwable th2;
            AtomicInteger atomicInteger;
            o oVar;
            C0 c02;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r12 = this.f24034p;
            try {
                if (r12 == 0) {
                    ResultKt.throwOnFailure(obj);
                    P p10 = (P) this.f24035q;
                    AtomicInteger atomicInteger2 = new AtomicInteger(-256);
                    o startWork = this.f24036r.startWork();
                    Intrinsics.checkNotNullExpressionValue(startWork, "delegate.startWork()");
                    d10 = AbstractC1459k.d(p10, null, null, new a(this.f24037s, this.f24038t, atomicInteger2, startWork, null), 3, null);
                    try {
                        this.f24035q = atomicInteger2;
                        this.f24032n = startWork;
                        this.f24033o = d10;
                        this.f24034p = 1;
                        Object a10 = f0.e.a(startWork, this);
                        if (a10 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        oVar = startWork;
                        obj = a10;
                        atomicInteger = atomicInteger2;
                        c02 = d10;
                    } catch (CancellationException e10) {
                        e = e10;
                        atomicInteger = atomicInteger2;
                        oVar = startWork;
                        CancellationException cancellationException = e;
                        String str = AbstractC1916a.f15032a;
                        androidx.work.c cVar = this.f24036r;
                        AbstractC1508t.e().b(str, "Delegated worker " + cVar.getClass() + " was cancelled", cancellationException);
                        if (atomicInteger.get() == -256) {
                        }
                        if (oVar.isCancelled()) {
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        String str2 = AbstractC1916a.f15032a;
                        androidx.work.c cVar2 = this.f24036r;
                        AbstractC1508t.e().b(str2, "Delegated worker " + cVar2.getClass() + " threw exception in startWork.", th2);
                        throw th2;
                    }
                } else {
                    if (r12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c02 = (C0) this.f24033o;
                    oVar = (o) this.f24032n;
                    atomicInteger = (AtomicInteger) this.f24035q;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (CancellationException e11) {
                        e = e11;
                        CancellationException cancellationException2 = e;
                        String str3 = AbstractC1916a.f15032a;
                        androidx.work.c cVar3 = this.f24036r;
                        AbstractC1508t.e().b(str3, "Delegated worker " + cVar3.getClass() + " was cancelled", cancellationException2);
                        boolean z10 = atomicInteger.get() == -256;
                        if (oVar.isCancelled()) {
                            throw cancellationException2;
                        }
                        if (z10) {
                            throw new a(atomicInteger.get());
                        }
                        throw cancellationException2;
                    } catch (Throwable th4) {
                        th2 = th4;
                        String str22 = AbstractC1916a.f15032a;
                        androidx.work.c cVar22 = this.f24036r;
                        AbstractC1508t.e().b(str22, "Delegated worker " + cVar22.getClass() + " threw exception in startWork.", th2);
                        throw th2;
                    }
                }
                c.a aVar = (c.a) obj;
                C0.a.b(c02, null, 1, null);
                return aVar;
            } catch (Throwable th5) {
                C0.a.b(r12, null, 1, null);
                throw th5;
            }
        }
    }

    public static final class e extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f24044n;

        /* renamed from: o, reason: collision with root package name */
        public Object f24045o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f24046p;

        /* renamed from: r, reason: collision with root package name */
        public int f24048r;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f24046p = obj;
            this.f24048r |= Integer.MIN_VALUE;
            return ConstraintTrackingWorker.this.d(this);
        }
    }

    public static final class f extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f24049n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ androidx.work.c f24051p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ i f24052q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ WorkSpec f24053r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(androidx.work.c cVar, i iVar, WorkSpec workSpec, Continuation continuation) {
            super(2, continuation);
            this.f24051p = cVar;
            this.f24052q = iVar;
            this.f24053r = workSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ConstraintTrackingWorker.this.new f(this.f24051p, this.f24052q, this.f24053r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((f) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f24049n;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            androidx.work.c cVar = this.f24051p;
            i iVar = this.f24052q;
            WorkSpec workSpec = this.f24053r;
            this.f24049n = 1;
            Object c10 = constraintTrackingWorker.c(cVar, iVar, workSpec, this);
            return c10 == coroutine_suspended ? coroutine_suspended : c10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.workerParameters = workerParameters;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(androidx.work.c cVar, i iVar, WorkSpec workSpec, Continuation continuation) {
        c cVar2;
        int i10;
        if (continuation instanceof c) {
            cVar2 = (c) continuation;
            int i11 = cVar2.f24031p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar2.f24031p = i11 - Integer.MIN_VALUE;
                Object obj = cVar2.f24029n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = cVar2.f24031p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    d dVar = new d(cVar, iVar, workSpec, null);
                    cVar2.f24031p = 1;
                    obj = Q.g(dVar, cVar2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "delegate: ListenableWork….cancel()\n        }\n    }");
                return obj;
            }
        }
        cVar2 = new c(continuation);
        Object obj2 = cVar2.f24029n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = cVar2.f24031p;
        if (i10 != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "delegate: ListenableWork….cancel()\n        }\n    }");
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Continuation continuation) {
        e eVar;
        int i10;
        androidx.work.c b10;
        ConstraintTrackingWorker constraintTrackingWorker;
        int a10;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f24048r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f24048r = i11 - Integer.MIN_VALUE;
                e eVar2 = eVar;
                Object obj = eVar2.f24046p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = eVar2.f24048r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    String d10 = getInputData().d("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                    if (d10 == null || d10.length() == 0) {
                        AbstractC1508t.e().c(AbstractC1916a.f15032a, "No worker to delegate to.");
                        c.a a11 = c.a.a();
                        Intrinsics.checkNotNullExpressionValue(a11, "failure()");
                        return a11;
                    }
                    Y n10 = Y.n(getApplicationContext());
                    Intrinsics.checkNotNullExpressionValue(n10, "getInstance(applicationContext)");
                    androidx.work.impl.model.c l10 = n10.s().l();
                    String uuid = getId().toString();
                    Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
                    WorkSpec i12 = l10.i(uuid);
                    if (i12 == null) {
                        c.a a12 = c.a.a();
                        Intrinsics.checkNotNullExpressionValue(a12, "failure()");
                        return a12;
                    }
                    n r10 = n10.r();
                    Intrinsics.checkNotNullExpressionValue(r10, "workManagerImpl.trackers");
                    i iVar = new i(r10);
                    if (!iVar.a(i12)) {
                        String str = AbstractC1916a.f15032a;
                        AbstractC1508t.e().a(str, "Constraints not met for delegate " + d10 + ". Requesting retry.");
                        c.a b11 = c.a.b();
                        Intrinsics.checkNotNullExpressionValue(b11, "retry()");
                        return b11;
                    }
                    String str2 = AbstractC1916a.f15032a;
                    AbstractC1508t.e().a(str2, "Constraints met for delegate " + d10);
                    try {
                        O workerFactory = getWorkerFactory();
                        Context applicationContext = getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                        b10 = workerFactory.b(applicationContext, d10, this.workerParameters);
                        Executor a13 = this.workerParameters.i().a();
                        Intrinsics.checkNotNullExpressionValue(a13, "workerParameters.taskExecutor.mainThreadExecutor");
                        try {
                            L b12 = AbstractC1481v0.b(a13);
                            f fVar = new f(b10, iVar, i12, null);
                            eVar2.f24044n = this;
                            eVar2.f24045o = b10;
                            eVar2.f24048r = 1;
                            obj = AbstractC1455i.g(b12, fVar, eVar2);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            constraintTrackingWorker = this;
                        } catch (CancellationException e10) {
                            e = e10;
                            constraintTrackingWorker = this;
                            if (!constraintTrackingWorker.isStopped()) {
                            }
                            if (Build.VERSION.SDK_INT >= 31) {
                            }
                            b10.stop(a10);
                            if (e instanceof a) {
                            }
                        }
                    } catch (Throwable th2) {
                        AbstractC1508t.e().a(AbstractC1916a.f15032a, "No worker to delegate to.");
                        InterfaceC6772a r11 = n10.f().r();
                        if (r11 != null) {
                            N.a(r11, new Q2.N(d10, this.workerParameters, th2), AbstractC1916a.f15032a);
                        }
                        c.a a14 = c.a.a();
                        Intrinsics.checkNotNullExpressionValue(a14, "failure()");
                        return a14;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b10 = (androidx.work.c) eVar2.f24045o;
                    constraintTrackingWorker = (ConstraintTrackingWorker) eVar2.f24044n;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (CancellationException e11) {
                        e = e11;
                        if (!constraintTrackingWorker.isStopped() || (e instanceof a)) {
                            if (Build.VERSION.SDK_INT >= 31) {
                                a10 = -512;
                            } else if (constraintTrackingWorker.isStopped()) {
                                a10 = constraintTrackingWorker.getStopReason();
                            } else {
                                if (!(e instanceof a)) {
                                    throw new IllegalStateException("Unreachable");
                                }
                                a10 = ((a) e).a();
                            }
                            b10.stop(a10);
                        }
                        if (e instanceof a) {
                            throw e;
                        }
                        c.a b13 = c.a.b();
                        Intrinsics.checkNotNullExpressionValue(b13, "{\n            // there a…throw cancelled\n        }");
                        return b13;
                    }
                }
                return (c.a) obj;
            }
        }
        eVar = new e(continuation);
        e eVar22 = eVar;
        Object obj2 = eVar22.f24046p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = eVar22.f24048r;
        if (i10 != 0) {
        }
        return (c.a) obj2;
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(Continuation continuation) {
        Executor backgroundExecutor = getBackgroundExecutor();
        Intrinsics.checkNotNullExpressionValue(backgroundExecutor, "backgroundExecutor");
        return AbstractC1455i.g(AbstractC1481v0.b(backgroundExecutor), new b(null), continuation);
    }
}
