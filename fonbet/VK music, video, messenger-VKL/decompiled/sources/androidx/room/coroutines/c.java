package androidx.room.coroutines;

import android.database.SQLException;
import androidx.room.a;
import androidx.room.coroutines.a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.DurationUnit;
import xsna.aro0;
import xsna.cvb0;
import xsna.eoo;
import xsna.i4j;
import xsna.j4j;
import xsna.k5h;
import xsna.km1;
import xsna.myc0;
import xsna.p4j;
import xsna.p7i;
import xsna.ss3;
import xsna.wzs;
import xsna.y1j;
import xsna.zno;

/* compiled from: ConnectionPoolImpl.kt */
/* loaded from: classes12.dex */
public final class c implements ConnectionPool {
    public final cvb0 b;
    public final cvb0 c;
    public final ThreadLocal<d> d = new ThreadLocal<>();
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final long f;

    public c(a.C0084a c0084a) {
        zno.a aVar = zno.c;
        this.f = eoo.e(30, DurationUnit.SECONDS);
        cvb0 cvb0Var = new cvb0(1, new k5h(c0084a, 3));
        this.b = cvb0Var;
        this.c = cvb0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0175 A[Catch: all -> 0x018a, TRY_LEAVE, TryCatch #4 {all -> 0x018a, blocks: (B:17:0x016f, B:19:0x0175, B:24:0x0180, B:21:0x0183), top: B:16:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0141 A[Catch: all -> 0x018b, TRY_LEAVE, TryCatch #5 {all -> 0x018b, blocks: (B:60:0x0120, B:64:0x0136, B:66:0x0141, B:70:0x018f, B:71:0x0196), top: B:59:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018f A[Catch: all -> 0x018b, TRY_ENTER, TryCatch #5 {all -> 0x018b, blocks: (B:60:0x0120, B:64:0x0136, B:66:0x0141, B:70:0x018f, B:71:0x0196), top: B:59:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r8v6, types: [T, androidx.room.coroutines.d] */
    @Override // androidx.room.coroutines.ConnectionPool
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J2(boolean z, wzs wzsVar, ContinuationImpl continuationImpl) {
        b bVar;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        Throwable th;
        cvb0 cvb0Var;
        cvb0 cvb0Var2;
        kotlin.coroutines.d dVar;
        c cVar;
        wzs wzsVar2;
        Ref$ObjectRef ref$ObjectRef2;
        T t;
        Ref$ObjectRef ref$ObjectRef3;
        d dVar2;
        boolean z2 = z;
        try {
            if (continuationImpl instanceof b) {
                bVar = (b) continuationImpl;
                int i2 = bVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = bVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = bVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        if (this.e.get()) {
                            p7i.g(21, "Connection pool is closed");
                            throw null;
                        }
                        ThreadLocal<d> threadLocal = this.d;
                        d dVar3 = threadLocal.get();
                        a.C0086a c0086a = a.c;
                        if (dVar3 == null) {
                            a aVar = (a) bVar.getContext().get(c0086a);
                            dVar3 = aVar != null ? aVar.b : null;
                        }
                        if (dVar3 == null) {
                            cvb0 cvb0Var3 = z2 ? this.b : this.c;
                            ref$ObjectRef = new Ref$ObjectRef();
                            try {
                                kotlin.coroutines.d context = bVar.getContext();
                                long j = this.f;
                                y1j y1jVar = new y1j(this, z2);
                                bVar.L$0 = this;
                                bVar.L$1 = wzsVar;
                                bVar.L$2 = cvb0Var3;
                                bVar.L$3 = ref$ObjectRef;
                                bVar.L$4 = context;
                                bVar.L$5 = ref$ObjectRef;
                                bVar.Z$0 = z2;
                                bVar.label = 3;
                                Object b = cvb0Var3.b(j, y1jVar, bVar);
                                if (b != coroutineSingletons) {
                                    cvb0Var2 = cvb0Var3;
                                    obj = b;
                                    dVar = context;
                                    cVar = this;
                                    wzsVar2 = wzsVar;
                                    ref$ObjectRef2 = ref$ObjectRef;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cvb0Var = cvb0Var3;
                                throw th;
                            }
                        } else {
                            if (!z2 && dVar3.b) {
                                p7i.g(1, "Cannot upgrade connection from reader to writer");
                                throw null;
                            }
                            if (bVar.getContext().get(c0086a) == null) {
                                kotlin.coroutines.d a = d.a.a(new a(dVar3), new aro0(dVar3, threadLocal));
                                i4j i4jVar = new i4j(wzsVar, dVar3, null);
                                bVar.label = 1;
                                Object k = myc0.k(a, i4jVar, bVar);
                                if (k != coroutineSingletons) {
                                    return k;
                                }
                            } else {
                                bVar.label = 2;
                                Object invoke = wzsVar.invoke(dVar3, bVar);
                                if (invoke != coroutineSingletons) {
                                    return invoke;
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i == 1) {
                        kotlin.a.a(obj);
                        return obj;
                    }
                    if (i == 2) {
                        kotlin.a.a(obj);
                        return obj;
                    }
                    if (i == 3) {
                        z2 = bVar.Z$0;
                        ref$ObjectRef2 = (Ref$ObjectRef) bVar.L$5;
                        kotlin.coroutines.d dVar4 = (kotlin.coroutines.d) bVar.L$4;
                        Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) bVar.L$3;
                        cvb0Var2 = (cvb0) bVar.L$2;
                        wzsVar2 = (wzs) bVar.L$1;
                        cVar = (c) bVar.L$0;
                        try {
                            kotlin.a.a(obj);
                            dVar = dVar4;
                            ref$ObjectRef = ref$ObjectRef4;
                        } catch (Throwable th3) {
                            th = th3;
                            ref$ObjectRef = ref$ObjectRef4;
                            cvb0Var = cvb0Var2;
                            throw th;
                        }
                    } else {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ref$ObjectRef3 = (Ref$ObjectRef) bVar.L$1;
                        cvb0Var = (cvb0) bVar.L$0;
                        try {
                            kotlin.a.a(obj);
                            try {
                                dVar2 = (d) ref$ObjectRef3.element;
                                if (dVar2 != null) {
                                    p4j p4jVar = dVar2.a;
                                    if (dVar2.d.compareAndSet(false, true)) {
                                        try {
                                            p7i.e(p4jVar, "ROLLBACK TRANSACTION");
                                        } catch (SQLException unused) {
                                        }
                                    }
                                    p4jVar.d = null;
                                    p4jVar.e = null;
                                    cvb0Var.e(p4jVar);
                                }
                            } catch (Throwable unused2) {
                            }
                            return obj;
                        } catch (Throwable th4) {
                            ref$ObjectRef = ref$ObjectRef3;
                            th = th4;
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    p4j p4jVar2 = (p4j) obj;
                    p4jVar2.d = dVar;
                    p4jVar2.e = new Throwable();
                    ref$ObjectRef2.element = new d(p4jVar2, cVar.b == cVar.c && z2);
                    t = ref$ObjectRef.element;
                    if (t != 0) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    d dVar5 = (d) t;
                    kotlin.coroutines.d a2 = d.a.a(new a(dVar5), new aro0(dVar5, cVar.d));
                    j4j j4jVar = new j4j(wzsVar2, ref$ObjectRef, null);
                    bVar.L$0 = cvb0Var2;
                    bVar.L$1 = ref$ObjectRef;
                    bVar.L$2 = null;
                    bVar.L$3 = null;
                    bVar.L$4 = null;
                    bVar.L$5 = null;
                    bVar.label = 4;
                    obj = myc0.k(a2, j4jVar, bVar);
                    if (obj != coroutineSingletons) {
                        ref$ObjectRef3 = ref$ObjectRef;
                        cvb0Var = cvb0Var2;
                        dVar2 = (d) ref$ObjectRef3.element;
                        if (dVar2 != null) {
                        }
                        return obj;
                    }
                    return coroutineSingletons;
                }
            }
            p4j p4jVar22 = (p4j) obj;
            p4jVar22.d = dVar;
            p4jVar22.e = new Throwable();
            ref$ObjectRef2.element = new d(p4jVar22, cVar.b == cVar.c && z2);
            t = ref$ObjectRef.element;
            if (t != 0) {
            }
        } catch (Throwable th5) {
            th = th5;
            cvb0Var = cvb0Var2;
            throw th;
        }
        bVar = new b(this, continuationImpl);
        Object obj2 = bVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        if (i != 0) {
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.e.compareAndSet(false, true)) {
            this.b.c();
            this.c.c();
        }
    }

    public c(a.C0084a c0084a, String str, int i) {
        zno.a aVar = zno.c;
        this.f = eoo.e(30, DurationUnit.SECONDS);
        if (i > 0) {
            this.b = new cvb0(i, new ss3(6, c0084a, str));
            this.c = new cvb0(1, new km1(7, c0084a, str));
            return;
        }
        throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
    }
}
