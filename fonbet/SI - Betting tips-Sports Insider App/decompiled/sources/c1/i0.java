package c1;

import eg.t1;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i0 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f3401a;

    /* renamed from: b, reason: collision with root package name */
    public final c f3402b;

    /* renamed from: c, reason: collision with root package name */
    public final jg.d f3403c;

    /* renamed from: d, reason: collision with root package name */
    public final u f3404d;

    /* renamed from: e, reason: collision with root package name */
    public final ng.c f3405e;

    /* renamed from: f, reason: collision with root package name */
    public int f3406f;

    /* renamed from: g, reason: collision with root package name */
    public t1 f3407g;

    /* renamed from: h, reason: collision with root package name */
    public final j0 f3408h;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.firebase.messaging.x f3409i;
    public final gf.t j;

    /* renamed from: k, reason: collision with root package name */
    public final gf.t f3410k;

    /* renamed from: l, reason: collision with root package name */
    public final com.google.firebase.messaging.x f3411l;

    public i0(m0 storage, List initTasksList, c corruptionHandler, jg.d scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f3401a = storage;
        this.f3402b = corruptionHandler;
        this.f3403c = scope;
        Continuation continuation = null;
        this.f3404d = new u(new androidx.lifecycle.o(this, continuation, 1));
        this.f3405e = new ng.c();
        this.f3408h = new j0();
        com.google.firebase.messaging.x xVar = new com.google.firebase.messaging.x();
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        xVar.f6185d = this;
        xVar.f6182a = new ng.c();
        xVar.f6183b = eg.c0.a();
        xVar.f6184c = CollectionsKt.W(initTasksList);
        this.f3409i = xVar;
        final int i5 = 0;
        this.j = gf.k.b(new Function0(this) { // from class: c1.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i0 f3413b;

            {
                this.f3413b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        m0 m0Var = this.f3413b.f3401a;
                        File canonicalFile = ((File) m0Var.f3433b.invoke()).getCanonicalFile();
                        synchronized (m0.f3431d) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = m0.f3430c;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            Intrinsics.checkNotNull(absolutePath);
                            linkedHashSet.add(absolutePath);
                        }
                        Intrinsics.checkNotNull(canonicalFile);
                        return new p0(canonicalFile, (b1) m0Var.f3432a.invoke(canonicalFile), new a2.q(6, canonicalFile));
                    default:
                        return ((p0) this.f3413b.j.getValue()).f3461b;
                }
            }
        });
        final int i10 = 1;
        this.f3410k = gf.k.b(new Function0(this) { // from class: c1.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i0 f3413b;

            {
                this.f3413b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        m0 m0Var = this.f3413b.f3401a;
                        File canonicalFile = ((File) m0Var.f3433b.invoke()).getCanonicalFile();
                        synchronized (m0.f3431d) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = m0.f3430c;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            Intrinsics.checkNotNull(absolutePath);
                            linkedHashSet.add(absolutePath);
                        }
                        Intrinsics.checkNotNull(canonicalFile);
                        return new p0(canonicalFile, (b1) m0Var.f3432a.invoke(canonicalFile), new a2.q(6, canonicalFile));
                    default:
                        return ((p0) this.f3413b.j.getValue()).f3461b;
                }
            }
        });
        a2.f onComplete = new a2.f(2, this);
        k onUndeliveredElement = new k(0);
        androidx.lifecycle.c consumeMessage = new androidx.lifecycle.c(this, continuation, 8);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        com.google.firebase.messaging.x xVar2 = new com.google.firebase.messaging.x();
        xVar2.f6182a = scope;
        xVar2.f6183b = consumeMessage;
        xVar2.f6184c = k2.x.a(Integer.MAX_VALUE, 6, null);
        xVar2.f6185d = new h9.c(14);
        eg.e1 e1Var = (eg.e1) scope.f18494a.r(eg.x.f9237b);
        if (e1Var != null) {
            e1Var.J(new a2.i(onComplete, xVar2, onUndeliveredElement, 1));
        }
        this.f3411l = xVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:12:0x0043, B:14:0x004b, B:16:0x004f, B:17:0x0055, B:18:0x0057), top: B:11:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(i0 i0Var, mf.c cVar) {
        v vVar;
        int i5;
        ng.c cVar2;
        int i10;
        try {
            if (cVar instanceof v) {
                vVar = (v) cVar;
                int i11 = vVar.f3488d;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    vVar.f3488d = i11 - Integer.MIN_VALUE;
                    Object obj = vVar.f3486b;
                    lf.a aVar = lf.a.f20034a;
                    i5 = vVar.f3488d;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        ng.c cVar3 = i0Var.f3405e;
                        vVar.f3485a = cVar3;
                        vVar.f3488d = 1;
                        if (cVar3.c(vVar) == aVar) {
                            return aVar;
                        }
                        cVar2 = cVar3;
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cVar2 = vVar.f3485a;
                        h8.b.B(obj);
                    }
                    i10 = i0Var.f3406f - 1;
                    i0Var.f3406f = i10;
                    if (i10 == 0) {
                        t1 t1Var = i0Var.f3407g;
                        if (t1Var != null) {
                            t1Var.k(null);
                        }
                        i0Var.f3407g = null;
                    }
                    Unit unit = Unit.f19194a;
                    cVar2.k(null);
                    return Unit.f19194a;
                }
            }
            i10 = i0Var.f3406f - 1;
            i0Var.f3406f = i10;
            if (i10 == 0) {
            }
            Unit unit2 = Unit.f19194a;
            cVar2.k(null);
            return Unit.f19194a;
        } catch (Throwable th2) {
            cVar2.k(null);
            throw th2;
        }
        vVar = new v(i0Var, cVar);
        Object obj2 = vVar.f3486b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = vVar.f3488d;
        if (i5 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(i0 i0Var, u0 u0Var, mf.c cVar) {
        w wVar;
        int i5;
        eg.r rVar;
        Throwable a7;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i10 = wVar.f3492d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                wVar.f3492d = i10 - Integer.MIN_VALUE;
                Object obj = wVar.f3490b;
                lf.a aVar = lf.a.f20034a;
                i5 = wVar.f3492d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    eg.r rVar2 = u0Var.f3482b;
                    try {
                        gf.o oVar = gf.q.f10031a;
                        CoroutineContext t3 = u0Var.f3484d.t(wVar.getContext());
                        androidx.lifecycle.c cVar2 = new androidx.lifecycle.c(i0Var, u0Var, (Continuation) null, 6);
                        wVar.f3489a = rVar2;
                        wVar.f3492d = 1;
                        Object A = eg.c0.A(t3, cVar2, wVar);
                        if (A == aVar) {
                            return aVar;
                        }
                        obj = A;
                        rVar = rVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        rVar = rVar2;
                        gf.o oVar2 = gf.q.f10031a;
                        obj = h8.b.h(th);
                        a7 = gf.q.a(obj);
                        if (a7 != null) {
                        }
                        return Unit.f19194a;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = wVar.f3489a;
                    try {
                        h8.b.B(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        gf.o oVar22 = gf.q.f10031a;
                        obj = h8.b.h(th);
                        a7 = gf.q.a(obj);
                        if (a7 != null) {
                        }
                        return Unit.f19194a;
                    }
                }
                gf.o oVar3 = gf.q.f10031a;
                a7 = gf.q.a(obj);
                if (a7 != null) {
                    rVar.Q(obj);
                } else {
                    rVar.h0(a7);
                }
                return Unit.f19194a;
            }
        }
        wVar = new w(i0Var, cVar);
        Object obj2 = wVar.f3490b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = wVar.f3492d;
        if (i5 != 0) {
        }
        gf.o oVar32 = gf.q.f10031a;
        a7 = gf.q.a(obj2);
        if (a7 != null) {
        }
        return Unit.f19194a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:12:0x0043, B:14:0x004a, B:15:0x005b), top: B:11:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(i0 i0Var, mf.c cVar) {
        x xVar;
        int i5;
        ng.c cVar2;
        int i10;
        try {
            if (cVar instanceof x) {
                xVar = (x) cVar;
                int i11 = xVar.f3497d;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    xVar.f3497d = i11 - Integer.MIN_VALUE;
                    Object obj = xVar.f3495b;
                    lf.a aVar = lf.a.f20034a;
                    i5 = xVar.f3497d;
                    int i12 = 1;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        ng.c cVar3 = i0Var.f3405e;
                        xVar.f3494a = cVar3;
                        xVar.f3497d = 1;
                        if (cVar3.c(xVar) == aVar) {
                            return aVar;
                        }
                        cVar2 = cVar3;
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cVar2 = xVar.f3494a;
                        h8.b.B(obj);
                    }
                    Continuation continuation = null;
                    i10 = i0Var.f3406f + 1;
                    i0Var.f3406f = i10;
                    if (i10 == 1) {
                        i0Var.f3407g = eg.c0.t(i0Var.f3403c, null, null, new p(i0Var, continuation, i12), 3);
                    }
                    Unit unit = Unit.f19194a;
                    cVar2.k(null);
                    return Unit.f19194a;
                }
            }
            i10 = i0Var.f3406f + 1;
            i0Var.f3406f = i10;
            if (i10 == 1) {
            }
            Unit unit2 = Unit.f19194a;
            cVar2.k(null);
            return Unit.f19194a;
        } catch (Throwable th2) {
            cVar2.k(null);
            throw th2;
        }
        xVar = new x(i0Var, cVar);
        Object obj2 = xVar.f3495b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = xVar.f3497d;
        int i122 = 1;
        if (i5 != 0) {
        }
        Continuation continuation2 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r2.M(r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0047, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(i0 i0Var, mf.c cVar) {
        z zVar;
        int i5;
        int intValue;
        int i10;
        Throwable th2;
        try {
            if (cVar instanceof z) {
                zVar = (z) cVar;
                int i11 = zVar.f3512d;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    zVar.f3512d = i11 - Integer.MIN_VALUE;
                    Object obj = zVar.f3510b;
                    Object obj2 = lf.a.f20034a;
                    i5 = zVar.f3512d;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        b1 g10 = i0Var.g();
                        zVar.f3512d = 1;
                        obj = g10.a();
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i10 = zVar.f3509a;
                            try {
                                h8.b.B(obj);
                                return Unit.f19194a;
                            } catch (Throwable th3) {
                                th2 = th3;
                                i0Var.f3408h.d(new w0(th2, i10));
                                throw th2;
                            }
                        }
                        h8.b.B(obj);
                    }
                    intValue = ((Number) obj).intValue();
                    com.google.firebase.messaging.x xVar = i0Var.f3409i;
                    zVar.f3509a = intValue;
                    zVar.f3512d = 2;
                }
            }
            com.google.firebase.messaging.x xVar2 = i0Var.f3409i;
            zVar.f3509a = intValue;
            zVar.f3512d = 2;
        } catch (Throwable th4) {
            i10 = intValue;
            th2 = th4;
            i0Var.f3408h.d(new w0(th2, i10));
            throw th2;
        }
        zVar = new z(i0Var, cVar);
        Object obj3 = zVar.f3510b;
        Object obj22 = lf.a.f20034a;
        i5 = zVar.f3512d;
        if (i5 != 0) {
        }
        intValue = ((Number) obj3).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        if (r10 == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        if (r10 == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005d, code lost:
    
        if (r10 == r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(i0 i0Var, boolean z5, Continuation continuation) {
        a0 a0Var;
        int i5;
        c1 b10;
        boolean z7;
        Pair pair;
        j0 j0Var = i0Var.f3408h;
        if (continuation instanceof a0) {
            a0Var = (a0) continuation;
            int i10 = a0Var.f3333e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                a0Var.f3333e = i10 - Integer.MIN_VALUE;
                Object obj = a0Var.f3331c;
                lf.a aVar = lf.a.f20034a;
                i5 = a0Var.f3333e;
                if (i5 != 0) {
                    h8.b.B(obj);
                    b10 = j0Var.b();
                    if (b10 instanceof d1) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    b1 g10 = i0Var.g();
                    a0Var.f3330b = b10;
                    a0Var.f3329a = z5;
                    a0Var.f3333e = 1;
                    obj = g10.a();
                } else {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            h8.b.B(obj);
                            pair = (Pair) obj;
                            c1 c1Var = (c1) pair.f19192a;
                            if (((Boolean) pair.f19193b).booleanValue()) {
                            }
                            return c1Var;
                        }
                        if (i5 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        pair = (Pair) obj;
                        c1 c1Var2 = (c1) pair.f19192a;
                        if (((Boolean) pair.f19193b).booleanValue()) {
                            j0Var.d(c1Var2);
                        }
                        return c1Var2;
                    }
                    z5 = a0Var.f3329a;
                    b10 = a0Var.f3330b;
                    h8.b.B(obj);
                }
                int intValue = ((Number) obj).intValue();
                z7 = b10 instanceof d;
                int i11 = !z7 ? ((d) b10).f3348a : -1;
                if (!z7 && intValue == i11) {
                    return b10;
                }
                Continuation continuation2 = null;
                if (z5) {
                    b1 g11 = i0Var.g();
                    c0 c0Var = new c0(i0Var, i11, continuation2, 0);
                    a0Var.f3330b = null;
                    a0Var.f3333e = 3;
                    obj = g11.c(c0Var, a0Var);
                } else {
                    b1 g12 = i0Var.g();
                    b0 b0Var = new b0(i0Var, continuation2, 0);
                    a0Var.f3330b = null;
                    a0Var.f3333e = 2;
                    obj = g12.b(b0Var, a0Var);
                }
                return aVar;
            }
        }
        a0Var = new a0(i0Var, continuation);
        Object obj2 = a0Var.f3331c;
        lf.a aVar2 = lf.a.f20034a;
        i5 = a0Var.f3333e;
        if (i5 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z7 = b10 instanceof d;
        if (!z7) {
        }
        if (!z7) {
        }
        Continuation continuation22 = null;
        if (z5) {
        }
        return aVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|72|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0058, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011a A[Catch: all -> 0x0144, TryCatch #1 {all -> 0x0144, blocks: (B:27:0x010a, B:29:0x011a, B:32:0x011f), top: B:26:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011f A[Catch: all -> 0x0144, TRY_LEAVE, TryCatch #1 {all -> 0x0144, blocks: (B:27:0x010a, B:29:0x011a, B:32:0x011f), top: B:26:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008a A[Catch: b -> 0x0058, TryCatch #0 {b -> 0x0058, blocks: (B:36:0x0053, B:37:0x00e4, B:40:0x005d, B:41:0x00c8, B:56:0x0072, B:58:0x008a, B:59:0x0090, B:65:0x007b, B:68:0x00b7), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(i0 i0Var, boolean z5, mf.c cVar) {
        d0 d0Var;
        Ref.ObjectRef objectRef;
        b bVar;
        T t3;
        Ref.ObjectRef objectRef2;
        b bVar2;
        e0 e0Var;
        Ref.IntRef intRef;
        Ref.ObjectRef objectRef3;
        Object obj;
        Object a7;
        boolean z7;
        int i5;
        Object obj2;
        Object obj3;
        Object obj4;
        Object c2;
        Object obj5;
        if (cVar instanceof d0) {
            d0Var = (d0) cVar;
            int i10 = d0Var.f3358h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                d0Var.f3358h = i10 - Integer.MIN_VALUE;
                Object obj6 = d0Var.f3356f;
                Object obj7 = lf.a.f20034a;
                Continuation continuation = null;
                switch (d0Var.f3358h) {
                    case 0:
                        h8.b.B(obj6);
                        if (!z5) {
                            b1 g10 = i0Var.g();
                            d0Var.f3351a = z5;
                            d0Var.f3358h = 3;
                            Object a10 = g10.a();
                            obj4 = a10;
                            if (a10 == obj7) {
                            }
                            int intValue = ((Number) obj4).intValue();
                            b1 g11 = i0Var.g();
                            Function2 c0Var = new c0(i0Var, intValue, continuation, 1);
                            d0Var.f3351a = z5;
                            d0Var.f3358h = 4;
                            c2 = g11.c(c0Var, d0Var);
                            obj5 = c2;
                            if (c2 == obj7) {
                            }
                            return (d) obj5;
                        }
                        d0Var.f3351a = z5;
                        d0Var.f3358h = 1;
                        Object i11 = i0Var.i(d0Var);
                        obj = i11;
                        if (i11 == obj7) {
                        }
                        int hashCode = obj == null ? obj.hashCode() : 0;
                        b1 g12 = i0Var.g();
                        d0Var.f3352b = obj;
                        d0Var.f3351a = z5;
                        d0Var.f3355e = hashCode;
                        d0Var.f3358h = 2;
                        a7 = g12.a();
                        if (a7 != obj7) {
                            int i12 = hashCode;
                            z7 = z5;
                            i5 = i12;
                            obj2 = obj;
                            obj3 = a7;
                            return new d(i5, ((Number) obj3).intValue(), obj2);
                        }
                        return obj7;
                    case 1:
                        z5 = d0Var.f3351a;
                        h8.b.B(obj6);
                        obj = obj6;
                        if (obj == null) {
                        }
                        b1 g122 = i0Var.g();
                        d0Var.f3352b = obj;
                        d0Var.f3351a = z5;
                        d0Var.f3355e = hashCode;
                        d0Var.f3358h = 2;
                        a7 = g122.a();
                        if (a7 != obj7) {
                        }
                        return obj7;
                    case 2:
                        i5 = d0Var.f3355e;
                        z7 = d0Var.f3351a;
                        obj2 = d0Var.f3352b;
                        try {
                            h8.b.B(obj6);
                            obj3 = obj6;
                            return new d(i5, ((Number) obj3).intValue(), obj2);
                        } catch (b e7) {
                            e = e7;
                            z5 = z7;
                            objectRef = new Ref.ObjectRef();
                            c cVar2 = i0Var.f3402b;
                            d0Var.f3352b = e;
                            d0Var.f3353c = objectRef;
                            d0Var.f3354d = objectRef;
                            d0Var.f3351a = z5;
                            d0Var.f3358h = 5;
                            Object b10 = cVar2.b(e);
                            if (b10 != obj7) {
                                bVar = e;
                                t3 = b10;
                                objectRef2 = objectRef;
                                objectRef2.element = t3;
                                Ref.IntRef intRef2 = new Ref.IntRef();
                                try {
                                    e0Var = new e0(objectRef, i0Var, intRef2, null);
                                    d0Var.f3352b = bVar;
                                    d0Var.f3353c = objectRef;
                                    d0Var.f3354d = intRef2;
                                    d0Var.f3358h = 6;
                                    if ((!z5 ? e0Var.invoke(d0Var) : i0Var.g().b(new f(e0Var, continuation, 1), d0Var)) != obj7) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    bVar2 = bVar;
                                    gf.d.a(bVar2, th);
                                    throw bVar2;
                                }
                            }
                            return obj7;
                        }
                    case 3:
                        z5 = d0Var.f3351a;
                        h8.b.B(obj6);
                        obj4 = obj6;
                        int intValue2 = ((Number) obj4).intValue();
                        b1 g112 = i0Var.g();
                        Function2 c0Var2 = new c0(i0Var, intValue2, continuation, 1);
                        d0Var.f3351a = z5;
                        d0Var.f3358h = 4;
                        c2 = g112.c(c0Var2, d0Var);
                        obj5 = c2;
                        if (c2 == obj7) {
                        }
                        return (d) obj5;
                    case 4:
                        boolean z10 = d0Var.f3351a;
                        h8.b.B(obj6);
                        obj5 = obj6;
                        return (d) obj5;
                    case 5:
                        z5 = d0Var.f3351a;
                        Ref.ObjectRef objectRef4 = (Ref.ObjectRef) d0Var.f3354d;
                        Ref.ObjectRef objectRef5 = d0Var.f3353c;
                        bVar = (b) d0Var.f3352b;
                        h8.b.B(obj6);
                        objectRef2 = objectRef4;
                        objectRef = objectRef5;
                        t3 = obj6;
                        objectRef2.element = t3;
                        Ref.IntRef intRef22 = new Ref.IntRef();
                        e0Var = new e0(objectRef, i0Var, intRef22, null);
                        d0Var.f3352b = bVar;
                        d0Var.f3353c = objectRef;
                        d0Var.f3354d = intRef22;
                        d0Var.f3358h = 6;
                        if ((!z5 ? e0Var.invoke(d0Var) : i0Var.g().b(new f(e0Var, continuation, 1), d0Var)) != obj7) {
                            intRef = intRef22;
                            objectRef3 = objectRef;
                            T t5 = objectRef3.element;
                            obj7 = new d(t5 != 0 ? t5.hashCode() : 0, intRef.element, t5);
                        }
                        return obj7;
                    case 6:
                        intRef = (Ref.IntRef) d0Var.f3354d;
                        objectRef3 = d0Var.f3353c;
                        bVar2 = (b) d0Var.f3352b;
                        try {
                            h8.b.B(obj6);
                            T t52 = objectRef3.element;
                            obj7 = new d(t52 != 0 ? t52.hashCode() : 0, intRef.element, t52);
                            return obj7;
                        } catch (Throwable th3) {
                            th = th3;
                            gf.d.a(bVar2, th);
                            throw bVar2;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        d0Var = new d0(i0Var, cVar);
        Object obj62 = d0Var.f3356f;
        Object obj72 = lf.a.f20034a;
        Continuation continuation2 = null;
        switch (d0Var.f3358h) {
        }
    }

    public final b1 g() {
        return (b1) this.f3410k.getValue();
    }

    @Override // c1.i
    public final hg.g getData() {
        return this.f3404d;
    }

    @Override // c1.i
    public final Object h(Function2 function2, mf.i iVar) {
        g1 g1Var = (g1) iVar.getContext().r(f1.f3379a);
        if (g1Var != null) {
            g1Var.a(this);
        }
        return eg.c0.A(new g1(g1Var, this), new androidx.lifecycle.o(this, function2, (Continuation) null), iVar);
    }

    public final Object i(mf.c cVar) {
        return ((p0) this.j.getValue()).a(new r(3, (Continuation) null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj, boolean z5, mf.c cVar) {
        g0 g0Var;
        int i5;
        Ref.IntRef intRef;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i10 = g0Var.f3391d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                g0Var.f3391d = i10 - Integer.MIN_VALUE;
                Object obj2 = g0Var.f3389b;
                lf.a aVar = lf.a.f20034a;
                i5 = g0Var.f3391d;
                if (i5 != 0) {
                    h8.b.B(obj2);
                    Ref.IntRef intRef2 = new Ref.IntRef();
                    p0 p0Var = (p0) this.j.getValue();
                    h0 h0Var = new h0(intRef2, this, obj, z5, null);
                    g0Var.f3388a = intRef2;
                    g0Var.f3391d = 1;
                    if (p0Var.b(h0Var, g0Var) == aVar) {
                        return aVar;
                    }
                    intRef = intRef2;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    intRef = g0Var.f3388a;
                    h8.b.B(obj2);
                }
                return new Integer(intRef.element);
            }
        }
        g0Var = new g0(this, cVar);
        Object obj22 = g0Var.f3389b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = g0Var.f3391d;
        if (i5 != 0) {
        }
        return new Integer(intRef.element);
    }
}
