package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qmb {
    public static final Executor e;
    public final LinkedHashSet a = new LinkedHashSet(1);
    public final LinkedHashSet b = new LinkedHashSet(1);
    public final Handler c = new Handler(Looper.getMainLooper());
    public volatile omb d = null;

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            e = new hg0(1);
        } else {
            e = Executors.newCachedThreadPool(new rmb());
        }
    }

    public qmb(Callable callable, boolean z) {
        if (z) {
            try {
                d((omb) callable.call());
                return;
            } catch (Throwable th) {
                d(new omb(th));
                return;
            }
        }
        Executor executor = e;
        pmb pmbVar = new pmb(callable);
        pmbVar.b = this;
        executor.execute(pmbVar);
    }

    public final synchronized void a(mmb mmbVar) {
        Throwable th;
        try {
            omb ombVar = this.d;
            if (ombVar != null && (th = ombVar.b) != null) {
                mmbVar.onResult(th);
            }
            this.b.add(mmbVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(mmb mmbVar) {
        plb plbVar;
        try {
            omb ombVar = this.d;
            if (ombVar != null && (plbVar = ombVar.a) != null) {
                mmbVar.onResult(plbVar);
            }
            this.a.add(mmbVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        omb ombVar = this.d;
        if (ombVar == null) {
            return;
        }
        plb plbVar = ombVar.a;
        if (plbVar != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.a).iterator();
                while (it.hasNext()) {
                    ((mmb) it.next()).onResult(plbVar);
                }
            }
            return;
        }
        Throwable th = ombVar.b;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.b);
            if (arrayList.isEmpty()) {
                ajb.c("Lottie encountered an error but no failure listener was added:");
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((mmb) it2.next()).onResult(th);
            }
        }
    }

    public final void d(omb ombVar) {
        if (this.d != null) {
            a70.r("A task may only be set once.");
            return;
        }
        this.d = ombVar;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c();
        } else {
            this.c.post(new yp8(this, 12));
        }
    }

    public qmb(plb plbVar) {
        d(new omb(plbVar));
    }
}
