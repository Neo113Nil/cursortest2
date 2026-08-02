package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class pof implements ah2, Cloneable {
    public final jod a;
    public final qzf b;
    public final wi5 c;
    public volatile f26 d;
    public final oof e;
    public final AtomicBoolean f;
    public Object g;
    public je6 h;
    public qof i;
    public boolean j;
    public ge6 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public volatile boolean q;
    public volatile ge6 r;
    public final CopyOnWriteArrayList s;

    static {
        AtomicReferenceFieldUpdater.newUpdater(pof.class, f26.class, "d");
    }

    public pof(jod jodVar, qzf qzfVar) {
        jodVar.getClass();
        qzfVar.getClass();
        this.a = jodVar;
        this.b = qzfVar;
        this.c = (wi5) jodVar.F.a;
        jodVar.d.getClass();
        this.d = f26.a;
        oof oofVar = new oof(this);
        oofVar.g(jodVar.w);
        this.e = oofVar;
        this.f = new AtomicBoolean();
        this.p = true;
        this.s = new CopyOnWriteArrayList();
        new AtomicReference(qzfVar.e);
    }

    public final void a(qof qofVar) {
        qofVar.getClass();
        TimeZone timeZone = yol.a;
        if (this.i != null) {
            a70.r("Check failed.");
        } else {
            this.i = qofVar;
            qofVar.q.add(new nof(this, this.g));
        }
    }

    public final IOException b(IOException iOException) {
        IOException iOException2;
        Socket j;
        TimeZone timeZone = yol.a;
        qof qofVar = this.i;
        if (qofVar != null) {
            synchronized (qofVar) {
                j = j();
            }
            if (this.i == null) {
                if (j != null) {
                    yol.c(j);
                }
                this.d.getClass();
            } else if (j != null) {
                a70.r("Check failed.");
                return null;
            }
        }
        if (!this.j && this.e.i()) {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        } else {
            iOException2 = iOException;
        }
        f26 f26Var = this.d;
        if (iOException == null) {
            f26Var.getClass();
            return iOException2;
        }
        iOException2.getClass();
        f26Var.getClass();
        return iOException2;
    }

    public final void c(qh2 qh2Var) {
        if (!this.f.compareAndSet(false, true)) {
            a70.r("Already Executed");
            return;
        }
        gie gieVar = gie.a;
        this.g = gie.a.g();
        this.d.getClass();
        w45 w45Var = this.a.a;
        mof mofVar = new mof(this, qh2Var);
        w45Var.getClass();
        w45.c(w45Var, mofVar, null, null, 6);
    }

    public final void cancel() {
        if (this.q) {
            return;
        }
        this.q = true;
        ge6 ge6Var = this.r;
        if (ge6Var != null) {
            ((ie6) ge6Var.e).cancel();
        }
        Iterator it = this.s.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((c8g) it.next()).cancel();
        }
        this.d.getClass();
    }

    public final Object clone() {
        return new pof(this.a, this.b);
    }

    public final d2g e() {
        if (!this.f.compareAndSet(false, true)) {
            a70.r("Already Executed");
            return null;
        }
        this.e.h();
        gie gieVar = gie.a;
        this.g = gie.a.g();
        this.d.getClass();
        try {
            w45 w45Var = this.a.a;
            synchronized (w45Var) {
                w45Var.f.add(this);
            }
            return g();
        } finally {
            w45 w45Var2 = this.a.a;
            w45Var2.getClass();
            w45.c(w45Var2, null, this, null, 5);
        }
    }

    public final void f(boolean z) {
        ge6 ge6Var;
        synchronized (this) {
            if (!this.p) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.a;
        }
        if (z && (ge6Var = this.r) != null) {
            ((ie6) ge6Var.e).cancel();
            ((pof) ge6Var.c).h(ge6Var, true, true, true, true, null);
        }
        this.k = null;
    }

    public final d2g g() {
        ArrayList arrayList = new ArrayList();
        o13.v(this.a.b, arrayList);
        arrayList.add(new kh2(4));
        arrayList.add(new kh2(2));
        arrayList.add(new kh2(3));
        arrayList.add(kh2.c);
        o13.v(this.a.c, arrayList);
        arrayList.add(kh2.b);
        qzf qzfVar = this.b;
        jod jodVar = this.a;
        qzfVar.getClass();
        jodVar.getClass();
        try {
            try {
                d2g b = new epf(this, arrayList, 0, null, qzfVar, jodVar.x, jodVar.y, jodVar.z, jodVar.g, jodVar.k, jodVar.u, jodVar.F, jodVar.j, jodVar.l, jodVar.t, jodVar.n, jodVar.m, jodVar.e, jodVar.o, jodVar.p, jodVar.q, jodVar.v).b(this.b);
                if (this.q) {
                    wol.b(b);
                    throw new IOException("Canceled");
                }
                i(null);
                return b;
            } catch (IOException e) {
                IOException i = i(e);
                i.getClass();
                throw i;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                i(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:60:0x0012, B:10:0x002e, B:12:0x0032, B:14:0x0036, B:16:0x003a, B:17:0x003c, B:19:0x0040, B:21:0x0044, B:23:0x0048, B:27:0x0051, B:31:0x005b, B:7:0x001c, B:53:0x0022, B:56:0x0028), top: B:59:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:60:0x0012, B:10:0x002e, B:12:0x0032, B:14:0x0036, B:16:0x003a, B:17:0x003c, B:19:0x0040, B:21:0x0044, B:23:0x0048, B:27:0x0051, B:31:0x005b, B:7:0x001c, B:53:0x0022, B:56:0x0028), top: B:59:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:60:0x0012, B:10:0x002e, B:12:0x0032, B:14:0x0036, B:16:0x003a, B:17:0x003c, B:19:0x0040, B:21:0x0044, B:23:0x0048, B:27:0x0051, B:31:0x005b, B:7:0x001c, B:53:0x0022, B:56:0x0028), top: B:59:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:60:0x0012, B:10:0x002e, B:12:0x0032, B:14:0x0036, B:16:0x003a, B:17:0x003c, B:19:0x0040, B:21:0x0044, B:23:0x0048, B:27:0x0051, B:31:0x005b, B:7:0x001c, B:53:0x0022, B:56:0x0028), top: B:59:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException h(ge6 ge6Var, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        boolean z7;
        ge6Var.getClass();
        if (ge6Var.equals(this.r)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (!this.l) {
                        }
                        if (z) {
                            this.l = false;
                        }
                        if (z2) {
                            this.m = false;
                        }
                        if (z4) {
                            this.n = false;
                        }
                        if (z3) {
                            this.o = false;
                        }
                        z7 = (!this.l || this.m || this.n || this.o) ? false : true;
                        if (z7 && !this.p) {
                            z5 = true;
                        }
                        boolean z8 = z5;
                        z5 = z7;
                        z6 = z8;
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if ((!z2 || !this.m) && ((!z4 || !this.n) && (!z3 || !this.o))) {
                    z6 = false;
                    Unit unit2 = Unit.a;
                }
                if (z) {
                }
                if (z2) {
                }
                if (z4) {
                }
                if (z3) {
                }
                if (!this.l) {
                }
                if (z7) {
                    z5 = true;
                }
                boolean z82 = z5;
                z5 = z7;
                z6 = z82;
                Unit unit22 = Unit.a;
            }
            if (z5) {
                this.r = null;
                qof qofVar = this.i;
                if (qofVar != null) {
                    synchronized (qofVar) {
                        qofVar.n++;
                    }
                }
            }
            if (z6) {
                return b(iOException);
            }
        }
        return iOException;
    }

    public final IOException i(IOException iOException) {
        boolean z;
        synchronized (this) {
            try {
                z = false;
                if (this.p) {
                    this.p = false;
                    if (!this.l && !this.m && !this.n && !this.o) {
                        z = true;
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z ? b(iOException) : iOException;
    }

    public final Socket j() {
        qof qofVar = this.i;
        qofVar.getClass();
        TimeZone timeZone = yol.a;
        ArrayList arrayList = qofVar.q;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.c(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            a70.r("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.i = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        qofVar.r = System.nanoTime();
        wi5 wi5Var = this.c;
        bui buiVar = (bui) wi5Var.b;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) wi5Var.d;
        TimeZone timeZone2 = yol.a;
        if (!qofVar.k) {
            buiVar.d((f45) wi5Var.c, 0L);
            return null;
        }
        qofVar.k = true;
        concurrentLinkedQueue.remove(qofVar);
        if (concurrentLinkedQueue.isEmpty()) {
            buiVar.a();
        }
        return qofVar.e;
    }
}
