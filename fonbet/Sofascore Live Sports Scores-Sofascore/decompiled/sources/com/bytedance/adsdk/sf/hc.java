package com.bytedance.adsdk.sf;

import android.os.Handler;
import android.os.Looper;
import defpackage.a70;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class hc<T> {
    public static Executor pcc = Executors.newCachedThreadPool();
    private final Set<vh<Throwable>> gm;
    private final Handler oo;
    private final Set<vh<T>> sf;
    private volatile tmg<T> vj;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class pcc extends FutureTask<tmg<T>> {
        public pcc(Callable<tmg<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled()) {
                return;
            }
            try {
                hc.this.pcc((tmg) get());
            } catch (InterruptedException | ExecutionException e) {
                hc.this.pcc(new tmg(e));
            }
        }
    }

    public hc(Callable<tmg<T>> callable, boolean z) {
        this.sf = new LinkedHashSet(1);
        this.gm = new LinkedHashSet(1);
        this.oo = new Handler(Looper.getMainLooper());
        this.vj = null;
        if (!z) {
            pcc.execute(new pcc(callable));
            return;
        }
        try {
            pcc((tmg) callable.call());
        } catch (Throwable th) {
            pcc((tmg) new tmg<>(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void pcc(Throwable th) {
        ArrayList arrayList = new ArrayList(this.gm);
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((vh) it.next()).pcc(th);
        }
    }

    public synchronized hc<T> gm(vh<Throwable> vhVar) {
        try {
            tmg<T> tmgVar = this.vj;
            if (tmgVar != null && tmgVar.sf() != null) {
                vhVar.pcc(tmgVar.sf());
            }
            this.gm.add(vhVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized hc<T> oo(vh<Throwable> vhVar) {
        this.gm.remove(vhVar);
        return this;
    }

    public synchronized hc<T> sf(vh<T> vhVar) {
        this.sf.remove(vhVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(tmg<T> tmgVar) {
        if (this.vj == null) {
            this.vj = tmgVar;
            pcc();
        } else {
            a70.r("A task may only be set once.");
        }
    }

    public synchronized hc<T> pcc(vh<T> vhVar) {
        try {
            tmg<T> tmgVar = this.vj;
            if (tmgVar != null && tmgVar.pcc() != null) {
                vhVar.pcc(tmgVar.pcc());
            }
            this.sf.add(vhVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    private void pcc() {
        this.oo.post(new Runnable() { // from class: com.bytedance.adsdk.sf.hc.1
            @Override // java.lang.Runnable
            public void run() {
                tmg tmgVar = hc.this.vj;
                if (tmgVar == null) {
                    return;
                }
                Object pcc2 = tmgVar.pcc();
                hc hcVar = hc.this;
                if (pcc2 != null) {
                    hcVar.pcc((hc) tmgVar.pcc());
                } else {
                    hcVar.pcc(tmgVar.sf());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void pcc(T t) {
        Iterator it = new ArrayList(this.sf).iterator();
        while (it.hasNext()) {
            ((vh) it.next()).pcc(t);
        }
    }

    public hc(Callable<tmg<T>> callable) {
        this(callable, false);
    }
}
