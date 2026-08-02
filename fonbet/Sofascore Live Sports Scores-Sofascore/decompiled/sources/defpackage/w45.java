package defpackage;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class w45 {
    public int a;
    public int b;
    public ExecutorService c;
    public final ArrayDeque d;
    public final ArrayDeque e;
    public final ArrayDeque f;

    public w45() {
        this.a = 64;
        this.b = 5;
        this.d = new ArrayDeque();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
    }

    public static void c(w45 w45Var, mof mofVar, pof pofVar, mof mofVar2, int i) {
        wm2 wm2Var;
        if ((i & 1) != 0) {
            mofVar = null;
        }
        if ((i & 2) != 0) {
            pofVar = null;
        }
        if ((i & 4) != 0) {
            mofVar2 = null;
        }
        w45Var.getClass();
        TimeZone timeZone = yol.a;
        boolean isShutdown = w45Var.a().isShutdown();
        synchronized (w45Var) {
            if (pofVar != null) {
                try {
                    if (!w45Var.f.remove(pofVar)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (mofVar2 != null) {
                mofVar2.b.decrementAndGet();
                if (!w45Var.e.remove(mofVar2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (mofVar != null) {
                w45Var.d.add(mofVar);
                mof b = w45Var.b(mofVar.c.b.a.d);
                if (b != null) {
                    mofVar.b = b.b;
                }
            }
            if ((pofVar != null || mofVar2 != null) && (isShutdown || w45Var.e.isEmpty())) {
                w45Var.f.isEmpty();
            }
            if (isShutdown) {
                List S0 = CollectionsKt.S0(w45Var.d);
                w45Var.d.clear();
                wm2Var = new wm2(S0);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = w45Var.d.iterator();
                it.getClass();
                while (it.hasNext()) {
                    mof mofVar3 = (mof) it.next();
                    if (w45Var.e.size() >= w45Var.a) {
                        break;
                    }
                    if (mofVar3.b.get() < w45Var.b) {
                        it.remove();
                        mofVar3.b.incrementAndGet();
                        arrayList.add(mofVar3);
                        w45Var.e.add(mofVar3);
                    }
                }
                wm2Var = new wm2((List) arrayList);
            }
        }
        int size = wm2Var.a.size();
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            mof mofVar4 = (mof) wm2Var.a.get(i2);
            if (mofVar4 == mofVar) {
                z = false;
            } else {
                mofVar4.c.d.getClass();
            }
            if (isShutdown) {
                mofVar4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                pof pofVar2 = mofVar4.c;
                pofVar2.i(interruptedIOException);
                mofVar4.a.onFailure(pofVar2, interruptedIOException);
            } else {
                ExecutorService a = w45Var.a();
                mofVar4.getClass();
                a.getClass();
                pof pofVar3 = mofVar4.c;
                pofVar3.a.a.getClass();
                try {
                    try {
                        a.execute(mofVar4);
                    } catch (Throwable th2) {
                        w45 w45Var2 = pofVar3.a.a;
                        w45Var2.getClass();
                        c(w45Var2, null, null, mofVar4, 3);
                        throw th2;
                    }
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                    interruptedIOException2.initCause(e);
                    pof pofVar4 = mofVar4.c;
                    pofVar4.i(interruptedIOException2);
                    mofVar4.a.onFailure(pofVar4, interruptedIOException2);
                    w45 w45Var3 = pofVar3.a.a;
                    w45Var3.getClass();
                    c(w45Var3, null, null, mofVar4, 3);
                }
            }
        }
        if (!z || mofVar == null) {
            return;
        }
        mofVar.c.d.getClass();
    }

    public final synchronized ExecutorService a() {
        ExecutorService executorService;
        try {
            executorService = this.c;
            if (executorService == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new xol(yol.b + " Dispatcher", false));
                this.c = threadPoolExecutor;
                executorService = threadPoolExecutor;
            }
            executorService.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public final mof b(String str) {
        Iterator it = this.e.iterator();
        it.getClass();
        while (it.hasNext()) {
            mof mofVar = (mof) it.next();
            if (Intrinsics.c(mofVar.c.b.a.d, str)) {
                return mofVar;
            }
        }
        Iterator it2 = this.d.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            mof mofVar2 = (mof) it2.next();
            if (Intrinsics.c(mofVar2.c.b.a.d, str)) {
                return mofVar2;
            }
        }
        return null;
    }

    public w45(ExecutorService executorService) {
        this();
        this.c = executorService;
    }
}
