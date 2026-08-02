package m2;

import android.database.SQLException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    public final w f20224a;

    /* renamed from: b, reason: collision with root package name */
    public final w f20225b;

    /* renamed from: c, reason: collision with root package name */
    public final y8.d f20226c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f20227d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f20228e;

    /* renamed from: f, reason: collision with root package name */
    public final long f20229f;

    /* renamed from: g, reason: collision with root package name */
    public final int f20230g;

    public g(io.sentry.util.network.b driver) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(":memory:", "fileName");
        this.f20226c = new y8.d();
        this.f20227d = new ThreadLocal();
        cg.a aVar = cg.b.f3911b;
        this.f20229f = cg.d.f(30, cg.e.f3919e);
        this.f20230g = 2;
        w wVar = new w(1, new a2.q(27, driver));
        this.f20224a = wVar;
        this.f20225b = wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014e A[Catch: all -> 0x01a9, TRY_LEAVE, TryCatch #4 {all -> 0x01a9, blocks: (B:55:0x0125, B:59:0x0143, B:61:0x014e, B:65:0x01ad, B:66:0x01b4), top: B:54:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ad A[Catch: all -> 0x01a9, TRY_ENTER, TryCatch #4 {all -> 0x01a9, blocks: (B:55:0x0125, B:59:0x0143, B:61:0x014e, B:65:0x01ad, B:66:0x01b4), top: B:54:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Type inference failed for: r11v5, types: [T, m2.d0] */
    /* JADX WARN: Type inference failed for: r15v1, types: [m2.d] */
    @Override // m2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(boolean z5, Function2 function2, mf.c cVar) {
        e eVar;
        int i5;
        Ref.ObjectRef objectRef;
        Throwable th2;
        w wVar;
        CoroutineContext context;
        Function2 function22;
        y8.d dVar;
        w wVar2;
        Ref.ObjectRef objectRef2;
        T t3;
        Ref.ObjectRef objectRef3;
        d0 d0Var;
        final boolean z7 = z5;
        try {
            if (cVar instanceof e) {
                eVar = (e) cVar;
                int i10 = eVar.j;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    eVar.j = i10 - Integer.MIN_VALUE;
                    Object obj = eVar.f20214h;
                    lf.a aVar = lf.a.f20034a;
                    i5 = eVar.j;
                    Continuation continuation = null;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        if (this.f20228e) {
                            h8.b.C(21, "Connection pool is closed");
                            throw null;
                        }
                        d0 d0Var2 = (d0) this.f20227d.get();
                        if (d0Var2 == null) {
                            a aVar2 = (a) eVar.getContext().r(this.f20226c);
                            d0Var2 = aVar2 != null ? aVar2.f20179b : null;
                        }
                        if (d0Var2 == null) {
                            w wVar3 = z7 ? this.f20224a : this.f20225b;
                            objectRef = new Ref.ObjectRef();
                            try {
                                context = eVar.getContext();
                                y8.d dVar2 = this.f20226c;
                                long j = this.f20229f;
                                ?? r15 = new Function0() { // from class: m2.d
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        String str = z7 ? "reader" : "writer";
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Timed out attempting to acquire a " + str + " connection.");
                                        sb2.append("\n\nWriter pool:\n");
                                        g gVar = g.this;
                                        gVar.f20225b.d(sb2);
                                        sb2.append("Reader pool:");
                                        sb2.append('\n');
                                        gVar.f20224a.d(sb2);
                                        try {
                                            h8.b.C(5, sb2.toString());
                                            throw null;
                                        } catch (SQLException e7) {
                                            int i11 = gVar.f20230g;
                                            if (i11 == 1) {
                                                throw e7;
                                            }
                                            if (i11 == 2) {
                                                e7.printStackTrace();
                                            }
                                            return Unit.f19194a;
                                        }
                                    }
                                };
                                eVar.f20208b = function2;
                                eVar.f20209c = wVar3;
                                eVar.f20210d = objectRef;
                                eVar.f20211e = context;
                                eVar.f20212f = objectRef;
                                eVar.f20213g = dVar2;
                                eVar.f20207a = z7;
                                eVar.j = 3;
                                Object b10 = wVar3.b(j, r15, eVar);
                                if (b10 != aVar) {
                                    function22 = function2;
                                    dVar = dVar2;
                                    wVar2 = wVar3;
                                    obj = b10;
                                    objectRef2 = objectRef;
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                wVar = wVar3;
                                throw th2;
                            }
                        } else {
                            if (!z7 && d0Var2.f20204c) {
                                h8.b.C(1, "Cannot upgrade connection from reader to writer");
                                throw null;
                            }
                            if (eVar.getContext().r(this.f20226c) == null) {
                                a aVar3 = new a(this.f20226c, d0Var2);
                                ThreadLocal threadLocal = this.f20227d;
                                Intrinsics.checkNotNullParameter(threadLocal, "<this>");
                                CoroutineContext c2 = kotlin.coroutines.e.c(aVar3, new jg.z(d0Var2, threadLocal));
                                kd.e eVar2 = new kd.e(function2, d0Var2, continuation, 21);
                                eVar.j = 1;
                                Object A = eg.c0.A(c2, eVar2, eVar);
                                if (A != aVar) {
                                    return A;
                                }
                            } else {
                                eVar.j = 2;
                                Object invoke = function2.invoke(d0Var2, eVar);
                                if (invoke != aVar) {
                                    return invoke;
                                }
                            }
                        }
                        return aVar;
                    }
                    if (i5 == 1) {
                        h8.b.B(obj);
                        return obj;
                    }
                    if (i5 == 2) {
                        h8.b.B(obj);
                        return obj;
                    }
                    if (i5 == 3) {
                        z7 = eVar.f20207a;
                        dVar = eVar.f20213g;
                        Ref.ObjectRef objectRef4 = eVar.f20212f;
                        CoroutineContext coroutineContext = eVar.f20211e;
                        Ref.ObjectRef objectRef5 = eVar.f20210d;
                        wVar2 = (w) eVar.f20209c;
                        function22 = (Function2) eVar.f20208b;
                        try {
                            h8.b.B(obj);
                            objectRef2 = objectRef4;
                            objectRef = objectRef5;
                            context = coroutineContext;
                        } catch (Throwable th4) {
                            th2 = th4;
                            objectRef = objectRef5;
                            wVar = wVar2;
                            throw th2;
                        }
                    } else {
                        if (i5 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        objectRef3 = (Ref.ObjectRef) eVar.f20209c;
                        wVar = (w) eVar.f20208b;
                        try {
                            h8.b.B(obj);
                            d0Var = (d0) objectRef3.element;
                            if (d0Var != null) {
                                if (!d0Var.f20206e) {
                                    d0Var.f20206e = true;
                                    if (d0Var.f20203b.f20234a.j()) {
                                        h8.b.l(d0Var.f20203b, "ROLLBACK TRANSACTION");
                                    }
                                }
                                j jVar = d0Var.f20203b;
                                jVar.f20236c = null;
                                jVar.f20237d = null;
                                wVar.e(jVar);
                            }
                            return obj;
                        } catch (Throwable th5) {
                            objectRef = objectRef3;
                            th2 = th5;
                            try {
                                throw th2;
                            } finally {
                            }
                        }
                    }
                    j jVar2 = (j) obj;
                    jVar2.getClass();
                    Intrinsics.checkNotNullParameter(context, "context");
                    jVar2.f20236c = context;
                    jVar2.f20237d = new Throwable();
                    objectRef2.element = new d0(dVar, jVar2, this.f20224a == this.f20225b && z7);
                    t3 = objectRef.element;
                    if (t3 != 0) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    d0 d0Var3 = (d0) t3;
                    a aVar4 = new a(this.f20226c, d0Var3);
                    ThreadLocal threadLocal2 = this.f20227d;
                    Intrinsics.checkNotNullParameter(threadLocal2, "<this>");
                    CoroutineContext c8 = kotlin.coroutines.e.c(aVar4, new jg.z(d0Var3, threadLocal2));
                    f fVar = new f(function22, objectRef, null);
                    eVar.f20208b = wVar2;
                    eVar.f20209c = objectRef;
                    eVar.f20210d = null;
                    eVar.f20211e = null;
                    eVar.f20212f = null;
                    eVar.f20213g = null;
                    eVar.j = 4;
                    obj = eg.c0.A(c8, fVar, eVar);
                    if (obj != aVar) {
                        objectRef3 = objectRef;
                        wVar = wVar2;
                        d0Var = (d0) objectRef3.element;
                        if (d0Var != null) {
                        }
                        return obj;
                    }
                    return aVar;
                }
            }
            j jVar22 = (j) obj;
            jVar22.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            jVar22.f20236c = context;
            jVar22.f20237d = new Throwable();
            objectRef2.element = new d0(dVar, jVar22, this.f20224a == this.f20225b && z7);
            t3 = objectRef.element;
            if (t3 != 0) {
            }
        } catch (Throwable th6) {
            th2 = th6;
            wVar = wVar2;
            throw th2;
        }
        eVar = new e(this, cVar);
        Object obj2 = eVar.f20214h;
        lf.a aVar5 = lf.a.f20034a;
        i5 = eVar.j;
        Continuation continuation2 = null;
        if (i5 != 0) {
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f20228e) {
            return;
        }
        this.f20228e = true;
        this.f20224a.c();
        this.f20225b.c();
    }

    public g(final io.sentry.util.network.b driver, final String fileName, int i5) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.f20226c = new y8.d();
        this.f20227d = new ThreadLocal();
        cg.a aVar = cg.b.f3911b;
        this.f20229f = cg.d.f(30, cg.e.f3919e);
        this.f20230g = 2;
        if (i5 > 0) {
            final int i10 = 0;
            this.f20224a = new w(i5, new Function0() { // from class: m2.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i10) {
                        case 0:
                            s2.a c2 = driver.c(fileName);
                            h8.b.l(c2, "PRAGMA query_only = 1");
                            return c2;
                        default:
                            return driver.c(fileName);
                    }
                }
            });
            final int i11 = 1;
            this.f20225b = new w(1, new Function0() { // from class: m2.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i11) {
                        case 0:
                            s2.a c2 = driver.c(fileName);
                            h8.b.l(c2, "PRAGMA query_only = 1");
                            return c2;
                        default:
                            return driver.c(fileName);
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
    }
}
