package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class cui {
    public static final Logger k;
    public static final cui l;
    public final by9 a;
    public final Logger b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public final ArrayList h;
    public final ArrayList i;
    public final kac j;

    static {
        Logger logger = Logger.getLogger(cui.class.getName());
        logger.getClass();
        k = logger;
        xol xolVar = new xol(mz1.o(new StringBuilder(), yol.b, " TaskRunner"), true);
        by9 by9Var = new by9();
        by9Var.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), xolVar);
        l = new cui(by9Var);
    }

    public cui(by9 by9Var) {
        Logger logger = k;
        logger.getClass();
        this.a = by9Var;
        this.b = logger;
        this.c = 10000;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new kac(this, 20);
    }

    public final void a(xti xtiVar, long j, boolean z) {
        TimeZone timeZone = yol.a;
        bui buiVar = xtiVar.c;
        buiVar.getClass();
        if (buiVar.d != xtiVar) {
            a70.r("Check failed.");
            return;
        }
        boolean z2 = buiVar.f;
        buiVar.f = false;
        buiVar.d = null;
        this.h.remove(buiVar);
        if (j != -1 && !z2 && !buiVar.c) {
            buiVar.f(xtiVar, j, true);
        }
        if (buiVar.e.isEmpty()) {
            return;
        }
        this.i.add(buiVar);
        if (z) {
            return;
        }
        e();
    }

    public final xti b() {
        boolean z;
        TimeZone timeZone = yol.a;
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.isEmpty()) {
                break;
            }
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j = Long.MAX_VALUE;
            xti xtiVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                xti xtiVar2 = (xti) ((bui) it.next()).e.get(0);
                long max = Math.max(0L, xtiVar2.d - nanoTime);
                if (max > 0) {
                    j = Math.min(max, j);
                } else {
                    if (xtiVar != null) {
                        z = true;
                        break;
                    }
                    xtiVar = xtiVar2;
                }
            }
            ArrayList arrayList2 = this.h;
            if (xtiVar != null) {
                TimeZone timeZone2 = yol.a;
                xtiVar.d = -1L;
                bui buiVar = xtiVar.c;
                buiVar.getClass();
                buiVar.e.remove(xtiVar);
                arrayList.remove(buiVar);
                buiVar.d = xtiVar;
                arrayList2.add(buiVar);
                if (z || (!this.d && !arrayList.isEmpty())) {
                    e();
                }
                return xtiVar;
            }
            if (!this.d) {
                this.d = true;
                this.e = nanoTime + j;
                try {
                    try {
                        TimeZone timeZone3 = yol.a;
                        if (j > 0) {
                            long j2 = j / 1000000;
                            long j3 = j - (1000000 * j2);
                            if (j2 > 0 || j > 0) {
                                wait(j2, (int) j3);
                            }
                        }
                    } catch (InterruptedException unused) {
                        TimeZone timeZone4 = yol.a;
                        for (int size = arrayList2.size() - 1; -1 < size; size--) {
                            ((bui) arrayList2.get(size)).b();
                        }
                        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                            bui buiVar2 = (bui) arrayList.get(size2);
                            buiVar2.b();
                            if (buiVar2.e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.d = false;
                }
            } else if (j < this.e - nanoTime) {
                notify();
            }
        }
        return null;
    }

    public final void c(bui buiVar) {
        buiVar.getClass();
        TimeZone timeZone = yol.a;
        if (buiVar.d == null) {
            boolean isEmpty = buiVar.e.isEmpty();
            ArrayList arrayList = this.i;
            if (isEmpty) {
                arrayList.remove(buiVar);
            } else {
                byte[] bArr = wol.a;
                if (!arrayList.contains(buiVar)) {
                    arrayList.add(buiVar);
                }
            }
        }
        if (this.d) {
            notify();
        } else {
            e();
        }
    }

    public final bui d() {
        int i;
        synchronized (this) {
            i = this.c;
            this.c = i + 1;
        }
        return new bui(this, ljg.j(i, "Q"));
    }

    public final void e() {
        TimeZone timeZone = yol.a;
        int i = this.f;
        if (i > this.g) {
            return;
        }
        this.f = i + 1;
        ((ThreadPoolExecutor) this.a.a).execute(this.j);
    }
}
