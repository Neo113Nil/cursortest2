package f3;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.appcompat.widget.q4;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import eg.e1;
import eg.g1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final m3.o f9377a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f9378b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9379c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.firebase.messaging.x f9380d;

    /* renamed from: e, reason: collision with root package name */
    public final e3.c f9381e;

    /* renamed from: f, reason: collision with root package name */
    public final e3.l f9382f;

    /* renamed from: g, reason: collision with root package name */
    public final l3.a f9383g;

    /* renamed from: h, reason: collision with root package name */
    public final WorkDatabase f9384h;

    /* renamed from: i, reason: collision with root package name */
    public final m3.s f9385i;
    public final m3.c j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f9386k;

    /* renamed from: l, reason: collision with root package name */
    public final String f9387l;

    /* renamed from: m, reason: collision with root package name */
    public final g1 f9388m;

    public j0(q4 builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        m3.o oVar = (m3.o) builder.f897g;
        this.f9377a = oVar;
        this.f9378b = (Context) builder.f892b;
        String str = oVar.f20331a;
        this.f9379c = str;
        this.f9380d = (com.google.firebase.messaging.x) builder.f894d;
        e3.c cVar = (e3.c) builder.f893c;
        this.f9381e = cVar;
        this.f9382f = cVar.f8478d;
        this.f9383g = (l3.a) builder.f895e;
        WorkDatabase workDatabase = (WorkDatabase) builder.f896f;
        this.f9384h = workDatabase;
        this.f9385i = workDatabase.y();
        this.j = workDatabase.t();
        ArrayList arrayList = (ArrayList) builder.f898h;
        this.f9386k = arrayList;
        this.f9387l = d9.e.l(d9.e.p("Work [ id=", str, ", tags={ "), CollectionsKt.J(arrayList, StringUtils.COMMA, null, null, null, 62), " } ]");
        this.f9388m = eg.c0.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(final j0 j0Var, mf.c cVar) {
        i0 i0Var;
        int i5;
        String str;
        lf.a aVar;
        OverwritingInputMerger overwritingInputMerger;
        e3.j c2;
        String str2;
        Throwable th2;
        String str3;
        CancellationException e7;
        e3.x e9;
        String str4 = j0Var.f9387l;
        String id2 = j0Var.f9379c;
        com.google.firebase.messaging.x xVar = j0Var.f9380d;
        WorkDatabase workDatabase = j0Var.f9384h;
        e3.c cVar2 = j0Var.f9381e;
        e3.l lVar = cVar2.f8489p;
        m3.o oVar = j0Var.f9377a;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i10 = i0Var.f9375c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                i0Var.f9375c = i10 - Integer.MIN_VALUE;
                Object obj = i0Var.f9373a;
                lf.a aVar2 = lf.a.f20034a;
                i5 = i0Var.f9375c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    e3.l lVar2 = cVar2.f8479e;
                    lVar.getClass();
                    final boolean r5 = m4.g.r();
                    final String methodName = oVar.f20352x;
                    String str5 = oVar.f20333c;
                    String className = oVar.f20334d;
                    final int i11 = 0;
                    if (!r5 || methodName == null) {
                        str = str4;
                    } else {
                        int hashCode = oVar.hashCode();
                        Intrinsics.checkNotNullParameter(methodName, "methodName");
                        str = str4;
                        if (Build.VERSION.SDK_INT >= 29) {
                            z2.a.a(hashCode, m4.g.B(methodName));
                        } else {
                            String B = m4.g.B(methodName);
                            try {
                                if (m4.g.f20375c == null) {
                                    str2 = B;
                                    aVar = aVar2;
                                    try {
                                        m4.g.f20375c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                                    } catch (Exception e10) {
                                        e = e10;
                                        m4.g.n("asyncTraceBegin", e);
                                        if (((Boolean) workDatabase.o(new Callable(j0Var) { // from class: f3.b0

                                            /* renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ j0 f9331b;

                                            {
                                                this.f9331b = j0Var;
                                            }

                                            @Override // java.util.concurrent.Callable
                                            public final Object call() {
                                                switch (i11) {
                                                    case 0:
                                                        j0 j0Var2 = this.f9331b;
                                                        m3.o oVar2 = j0Var2.f9377a;
                                                        e3.i0 i0Var2 = oVar2.f20332b;
                                                        String str6 = oVar2.f20333c;
                                                        e3.i0 i0Var3 = e3.i0.f8524a;
                                                        if (i0Var2 != i0Var3) {
                                                            String str7 = l0.f9396a;
                                                            e3.x.e().a(str7, str6 + " is not in ENQUEUED state. Nothing more to do");
                                                            return Boolean.TRUE;
                                                        }
                                                        if (oVar2.c() || (oVar2.f20332b == i0Var3 && oVar2.f20340k > 0)) {
                                                            j0Var2.f9382f.getClass();
                                                            if (System.currentTimeMillis() < oVar2.a()) {
                                                                e3.x.e().a(l0.f9396a, "Delaying execution for " + str6 + " because it is being executed before schedule.");
                                                                return Boolean.TRUE;
                                                            }
                                                        }
                                                        return Boolean.FALSE;
                                                    default:
                                                        j0 j0Var3 = this.f9331b;
                                                        m3.s sVar = j0Var3.f9385i;
                                                        String id3 = j0Var3.f9379c;
                                                        boolean z5 = false;
                                                        if (sVar.b(id3) == e3.i0.f8524a) {
                                                            sVar.h(e3.i0.f8525b, id3);
                                                            Intrinsics.checkNotNullParameter(id3, "id");
                                                            ((Number) x.n0(sVar.f20360a, false, true, new a2.k(id3, 21))).intValue();
                                                            sVar.i(-256, id3);
                                                            z5 = true;
                                                        }
                                                        return Boolean.valueOf(z5);
                                                }
                                            }
                                        })).booleanValue()) {
                                        }
                                    }
                                } else {
                                    str2 = B;
                                    aVar = aVar2;
                                }
                                m4.g.f20375c.invoke(null, Long.valueOf(m4.g.f20373a), str2, Integer.valueOf(hashCode));
                            } catch (Exception e11) {
                                e = e11;
                                aVar = aVar2;
                            }
                            if (((Boolean) workDatabase.o(new Callable(j0Var) { // from class: f3.b0

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ j0 f9331b;

                                {
                                    this.f9331b = j0Var;
                                }

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    switch (i11) {
                                        case 0:
                                            j0 j0Var2 = this.f9331b;
                                            m3.o oVar2 = j0Var2.f9377a;
                                            e3.i0 i0Var2 = oVar2.f20332b;
                                            String str6 = oVar2.f20333c;
                                            e3.i0 i0Var3 = e3.i0.f8524a;
                                            if (i0Var2 != i0Var3) {
                                                String str7 = l0.f9396a;
                                                e3.x.e().a(str7, str6 + " is not in ENQUEUED state. Nothing more to do");
                                                return Boolean.TRUE;
                                            }
                                            if (oVar2.c() || (oVar2.f20332b == i0Var3 && oVar2.f20340k > 0)) {
                                                j0Var2.f9382f.getClass();
                                                if (System.currentTimeMillis() < oVar2.a()) {
                                                    e3.x.e().a(l0.f9396a, "Delaying execution for " + str6 + " because it is being executed before schedule.");
                                                    return Boolean.TRUE;
                                                }
                                            }
                                            return Boolean.FALSE;
                                        default:
                                            j0 j0Var3 = this.f9331b;
                                            m3.s sVar = j0Var3.f9385i;
                                            String id3 = j0Var3.f9379c;
                                            boolean z5 = false;
                                            if (sVar.b(id3) == e3.i0.f8524a) {
                                                sVar.h(e3.i0.f8525b, id3);
                                                Intrinsics.checkNotNullParameter(id3, "id");
                                                ((Number) x.n0(sVar.f20360a, false, true, new a2.k(id3, 21))).intValue();
                                                sVar.i(-256, id3);
                                                z5 = true;
                                            }
                                            return Boolean.valueOf(z5);
                                    }
                                }
                            })).booleanValue()) {
                                return new f0();
                            }
                            if (oVar.c()) {
                                c2 = oVar.f20335e;
                            } else {
                                cVar2.f8480f.getClass();
                                Intrinsics.checkNotNullParameter(className, "className");
                                Intrinsics.checkNotNullParameter(className, "className");
                                String str6 = e3.q.f8560a;
                                Intrinsics.checkNotNullParameter(className, "className");
                                try {
                                } catch (Exception e12) {
                                    e = e12;
                                }
                                try {
                                    Object newInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
                                    Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
                                    overwritingInputMerger = (OverwritingInputMerger) newInstance;
                                } catch (Exception e13) {
                                    e = e13;
                                    e3.x.e().d(e3.q.f8560a, "Trouble instantiating ".concat(className), e);
                                    overwritingInputMerger = null;
                                    if (overwritingInputMerger != null) {
                                    }
                                }
                                if (overwritingInputMerger != null) {
                                    String str7 = l0.f9396a;
                                    e3.x.e().c(str7, "Could not create Input Merger " + className);
                                    return new d0();
                                }
                                List c8 = kotlin.collections.t.c(oVar.f20335e);
                                m3.s sVar = j0Var.f9385i;
                                sVar.getClass();
                                Intrinsics.checkNotNullParameter(id2, "id");
                                ArrayList inputs = CollectionsKt.N(c8, (List) x.n0(sVar.f20360a, true, false, new a2.k(id2, 20)));
                                Intrinsics.checkNotNullParameter(inputs, "inputs");
                                e3.i iVar = new e3.i(0);
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                Iterator it = inputs.iterator();
                                while (it.hasNext()) {
                                    Map unmodifiableMap = DesugarCollections.unmodifiableMap(((e3.j) it.next()).f8532a);
                                    Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
                                    linkedHashMap.putAll(unmodifiableMap);
                                }
                                iVar.f(linkedHashMap);
                                c2 = iVar.c();
                            }
                            UUID fromString = UUID.fromString(id2);
                            ArrayList arrayList = j0Var.f9386k;
                            int i12 = oVar.f20340k;
                            ExecutorService executorService = cVar2.f8475a;
                            lg.e eVar = cVar2.f8476b;
                            i0 i0Var2 = i0Var;
                            n3.r rVar = new n3.r(workDatabase, j0Var.f9383g, xVar);
                            WorkerParameters workerParameters = new WorkerParameters();
                            workerParameters.f2917a = fromString;
                            workerParameters.f2918b = c2;
                            new HashSet(arrayList);
                            workerParameters.f2919c = i12;
                            workerParameters.f2920d = executorService;
                            workerParameters.f2921e = eVar;
                            workerParameters.f2922f = xVar;
                            workerParameters.f2923g = lVar2;
                            try {
                                final e3.w a7 = lVar2.a(j0Var.f9378b, str5, workerParameters);
                                final int i13 = 1;
                                a7.f8568d = true;
                                CoroutineContext.Element r6 = i0Var2.getContext().r(eg.x.f9237b);
                                Intrinsics.checkNotNull(r6);
                                e1 e1Var = (e1) r6;
                                e1Var.J(new Function1() { // from class: f3.c0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        String methodName2;
                                        Throwable th3 = (Throwable) obj2;
                                        if (th3 instanceof y) {
                                            e3.w.this.f8567c.compareAndSet(-256, ((y) th3).f9436a);
                                        }
                                        if (r5 && (methodName2 = methodName) != null) {
                                            j0 j0Var2 = j0Var;
                                            e3.l lVar3 = j0Var2.f9381e.f8489p;
                                            int hashCode2 = j0Var2.f9377a.hashCode();
                                            lVar3.getClass();
                                            Intrinsics.checkNotNullParameter(methodName2, "methodName");
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                z2.a.b(hashCode2, m4.g.B(methodName2));
                                            } else {
                                                String B2 = m4.g.B(methodName2);
                                                try {
                                                    if (m4.g.f20376d == null) {
                                                        m4.g.f20376d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                                                    }
                                                    m4.g.f20376d.invoke(null, Long.valueOf(m4.g.f20373a), B2, Integer.valueOf(hashCode2));
                                                } catch (Exception e14) {
                                                    m4.g.n("asyncTraceEnd", e14);
                                                }
                                            }
                                        }
                                        return Unit.f19194a;
                                    }
                                });
                                Object o3 = workDatabase.o(new Callable(j0Var) { // from class: f3.b0

                                    /* renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ j0 f9331b;

                                    {
                                        this.f9331b = j0Var;
                                    }

                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        switch (i13) {
                                            case 0:
                                                j0 j0Var2 = this.f9331b;
                                                m3.o oVar2 = j0Var2.f9377a;
                                                e3.i0 i0Var22 = oVar2.f20332b;
                                                String str62 = oVar2.f20333c;
                                                e3.i0 i0Var3 = e3.i0.f8524a;
                                                if (i0Var22 != i0Var3) {
                                                    String str72 = l0.f9396a;
                                                    e3.x.e().a(str72, str62 + " is not in ENQUEUED state. Nothing more to do");
                                                    return Boolean.TRUE;
                                                }
                                                if (oVar2.c() || (oVar2.f20332b == i0Var3 && oVar2.f20340k > 0)) {
                                                    j0Var2.f9382f.getClass();
                                                    if (System.currentTimeMillis() < oVar2.a()) {
                                                        e3.x.e().a(l0.f9396a, "Delaying execution for " + str62 + " because it is being executed before schedule.");
                                                        return Boolean.TRUE;
                                                    }
                                                }
                                                return Boolean.FALSE;
                                            default:
                                                j0 j0Var3 = this.f9331b;
                                                m3.s sVar2 = j0Var3.f9385i;
                                                String id3 = j0Var3.f9379c;
                                                boolean z5 = false;
                                                if (sVar2.b(id3) == e3.i0.f8524a) {
                                                    sVar2.h(e3.i0.f8525b, id3);
                                                    Intrinsics.checkNotNullParameter(id3, "id");
                                                    ((Number) x.n0(sVar2.f20360a, false, true, new a2.k(id3, 21))).intValue();
                                                    sVar2.i(-256, id3);
                                                    z5 = true;
                                                }
                                                return Boolean.valueOf(z5);
                                        }
                                    }
                                });
                                Intrinsics.checkNotNullExpressionValue(o3, "runInTransaction(...)");
                                if (!((Boolean) o3).booleanValue()) {
                                    return new f0();
                                }
                                if (e1Var.isCancelled()) {
                                    return new f0();
                                }
                                Intrinsics.checkNotNullExpressionValue(rVar, "getForegroundUpdater(...)");
                                e5.p pVar = (e5.p) xVar.f6185d;
                                Intrinsics.checkNotNullExpressionValue(pVar, "getMainThreadExecutor(...)");
                                eg.w l6 = eg.c0.l(pVar);
                                try {
                                    androidx.lifecycle.o oVar2 = new androidx.lifecycle.o(j0Var, a7, rVar, (Continuation) null, 6);
                                    i0Var2.f9375c = 1;
                                    obj = eg.c0.A(l6, oVar2, i0Var2);
                                    lf.a aVar3 = aVar;
                                    if (obj == aVar3) {
                                        return aVar3;
                                    }
                                } catch (CancellationException e14) {
                                    e7 = e14;
                                    str3 = str;
                                    String str8 = l0.f9396a;
                                    e9 = e3.x.e();
                                    String l10 = r4.k.l(str3, " was cancelled");
                                    if (e9.f8571a <= 4) {
                                        Log.i(str8, l10, e7);
                                    }
                                    throw e7;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    String str9 = l0.f9396a;
                                    e3.x.e().d(str9, str + " failed because it threw an exception/error", th2);
                                    return new d0();
                                }
                            } catch (Throwable unused) {
                                String str10 = l0.f9396a;
                                e3.x.e().c(str10, "Could not create Worker " + str5);
                                return new d0();
                            }
                        }
                    }
                    aVar = aVar2;
                    if (((Boolean) workDatabase.o(new Callable(j0Var) { // from class: f3.b0

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ j0 f9331b;

                        {
                            this.f9331b = j0Var;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            switch (i11) {
                                case 0:
                                    j0 j0Var2 = this.f9331b;
                                    m3.o oVar22 = j0Var2.f9377a;
                                    e3.i0 i0Var22 = oVar22.f20332b;
                                    String str62 = oVar22.f20333c;
                                    e3.i0 i0Var3 = e3.i0.f8524a;
                                    if (i0Var22 != i0Var3) {
                                        String str72 = l0.f9396a;
                                        e3.x.e().a(str72, str62 + " is not in ENQUEUED state. Nothing more to do");
                                        return Boolean.TRUE;
                                    }
                                    if (oVar22.c() || (oVar22.f20332b == i0Var3 && oVar22.f20340k > 0)) {
                                        j0Var2.f9382f.getClass();
                                        if (System.currentTimeMillis() < oVar22.a()) {
                                            e3.x.e().a(l0.f9396a, "Delaying execution for " + str62 + " because it is being executed before schedule.");
                                            return Boolean.TRUE;
                                        }
                                    }
                                    return Boolean.FALSE;
                                default:
                                    j0 j0Var3 = this.f9331b;
                                    m3.s sVar2 = j0Var3.f9385i;
                                    String id3 = j0Var3.f9379c;
                                    boolean z5 = false;
                                    if (sVar2.b(id3) == e3.i0.f8524a) {
                                        sVar2.h(e3.i0.f8525b, id3);
                                        Intrinsics.checkNotNullParameter(id3, "id");
                                        ((Number) x.n0(sVar2.f20360a, false, true, new a2.k(id3, 21))).intValue();
                                        sVar2.i(-256, id3);
                                        z5 = true;
                                    }
                                    return Boolean.valueOf(z5);
                            }
                        }
                    })).booleanValue()) {
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        h8.b.B(obj);
                        str = str4;
                    } catch (CancellationException e15) {
                        e7 = e15;
                        str3 = str4;
                        String str82 = l0.f9396a;
                        e9 = e3.x.e();
                        String l102 = r4.k.l(str3, " was cancelled");
                        if (e9.f8571a <= 4) {
                        }
                        throw e7;
                    } catch (Throwable th4) {
                        th2 = th4;
                        str = str4;
                        String str92 = l0.f9396a;
                        e3.x.e().d(str92, str + " failed because it threw an exception/error", th2);
                        return new d0();
                    }
                }
                e3.v vVar = (e3.v) obj;
                Intrinsics.checkNotNull(vVar);
                return new e0(vVar);
            }
        }
        i0Var = new i0(j0Var, cVar);
        Object obj2 = i0Var.f9373a;
        lf.a aVar22 = lf.a.f20034a;
        i5 = i0Var.f9375c;
        if (i5 != 0) {
        }
        e3.v vVar2 = (e3.v) obj2;
        Intrinsics.checkNotNull(vVar2);
        return new e0(vVar2);
    }

    public final void b(int i5) {
        e3.i0 i0Var = e3.i0.f8524a;
        m3.s sVar = this.f9385i;
        String str = this.f9379c;
        sVar.h(i0Var, str);
        this.f9382f.getClass();
        sVar.g(System.currentTimeMillis(), str);
        sVar.f(this.f9377a.f20350v, str);
        sVar.e(-1L, str);
        sVar.i(i5, str);
    }

    public final void c() {
        this.f9382f.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        m3.s sVar = this.f9385i;
        String id2 = this.f9379c;
        sVar.g(currentTimeMillis, id2);
        sVar.h(e3.i0.f8524a, id2);
        sVar.getClass();
        Intrinsics.checkNotNullParameter(id2, "id");
        ((Number) x.n0(sVar.f20360a, false, true, new a2.k(id2, 18))).intValue();
        sVar.f(this.f9377a.f20350v, id2);
        sVar.getClass();
        Intrinsics.checkNotNullParameter(id2, "id");
        x.n0(sVar.f20360a, false, true, new a2.k(id2, 19));
        sVar.e(-1L, id2);
    }

    public final void d(e3.v result) {
        Intrinsics.checkNotNullParameter(result, "result");
        String id2 = this.f9379c;
        ArrayList g10 = kotlin.collections.u.g(id2);
        while (true) {
            boolean isEmpty = g10.isEmpty();
            m3.s sVar = this.f9385i;
            if (isEmpty) {
                e3.j output = ((e3.s) result).f8563a;
                Intrinsics.checkNotNullExpressionValue(output, "getOutputData(...)");
                sVar.f(this.f9377a.f20350v, id2);
                sVar.getClass();
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(output, "output");
                x.n0(sVar.f20360a, false, true, new fg.d(10, output, id2));
                return;
            }
            String str = (String) kotlin.collections.z.s(g10);
            if (sVar.b(str) != e3.i0.f8529f) {
                sVar.h(e3.i0.f8527d, str);
            }
            g10.addAll(this.j.a(str));
        }
    }
}
