package jg;

import androidx.appcompat.widget.c1;
import eg.d2;
import eg.e1;
import eg.i0;
import eg.w0;
import eg.w1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final com.android.billingclient.api.a f18502a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.android.billingclient.api.a f18503b;

    static {
        int i5 = 9;
        f18502a = new com.android.billingclient.api.a("UNDEFINED", i5);
        f18503b = new com.android.billingclient.api.a("REUSABLE_CLAIMED", i5);
    }

    public static final void a(int i5) {
        if (i5 < 1) {
            throw new IllegalArgumentException(c1.i(i5, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final u b(Object obj) {
        if (obj == b.f18485a) {
            throw new IllegalStateException("Does not contain segment");
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (u) obj;
    }

    public static final void c(Throwable th2, CoroutineContext coroutineContext) {
        Throwable runtimeException;
        Iterator it = e.f18495a.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).W(th2, coroutineContext);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    gf.d.a(runtimeException, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            gf.d.a(th2, new f(coroutineContext));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }

    public static final boolean d(Object obj) {
        return obj == b.f18485a;
    }

    public static final Object e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void f(Object obj, Continuation continuation) {
        if (!(continuation instanceof g)) {
            continuation.resumeWith(obj);
            return;
        }
        g gVar = (g) continuation;
        eg.w wVar = gVar.f18498d;
        mf.c cVar = gVar.f18499e;
        Throwable a7 = gf.q.a(obj);
        Object tVar = a7 == null ? obj : new eg.t(a7, false);
        if (h(wVar, cVar.getContext())) {
            gVar.f18500f = tVar;
            gVar.f9185c = 1;
            g(wVar, cVar.getContext(), gVar);
            return;
        }
        w0 a10 = w1.a();
        if (a10.f9232c >= 4294967296L) {
            gVar.f18500f = tVar;
            gVar.f9185c = 1;
            a10.j0(gVar);
            return;
        }
        a10.l0(true);
        try {
            e1 e1Var = (e1) cVar.getContext().r(eg.x.f9237b);
            if (e1Var == null || e1Var.c()) {
                Object obj2 = gVar.f18501g;
                CoroutineContext context = cVar.getContext();
                Object c2 = y.c(context, obj2);
                d2 c8 = c2 != y.f18531a ? eg.u.c(cVar, context, c2) : null;
                try {
                    cVar.resumeWith(obj);
                    Unit unit = Unit.f19194a;
                } finally {
                    if (c8 == null || c8.l0()) {
                        y.a(context, c2);
                    }
                }
            } else {
                gVar.resumeWith(h8.b.h(e1Var.y()));
            }
            while (a10.q0()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void g(eg.w wVar, CoroutineContext coroutineContext, Runnable runnable) {
        try {
            wVar.c0(coroutineContext, runnable);
        } catch (Throwable th2) {
            throw new i0(th2, wVar, coroutineContext);
        }
    }

    public static final boolean h(eg.w wVar, CoroutineContext coroutineContext) {
        try {
            return wVar.f0(coroutineContext);
        } catch (Throwable th2) {
            throw new i0(th2, wVar, coroutineContext);
        }
    }

    public static final long i(String str, long j, long j6, long j10) {
        String str2;
        int i5 = w.f18529a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long Y = StringsKt.Y(str2);
        if (Y == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = Y.longValue();
        if (j6 <= longValue && longValue <= j10) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j6 + ".." + j10 + ", but is '" + longValue + '\'').toString());
    }

    public static int j(int i5, int i10, String str) {
        return (int) i(str, i5, 1, (i10 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }
}
