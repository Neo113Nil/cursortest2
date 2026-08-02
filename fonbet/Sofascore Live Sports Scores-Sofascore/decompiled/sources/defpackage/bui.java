package defpackage;

import com.sofascore.model.mvvm.model.StatusKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class bui {
    public final cui a;
    public final String b;
    public boolean c;
    public xti d;
    public final ArrayList e;
    public boolean f;

    public bui(cui cuiVar, String str) {
        cuiVar.getClass();
        this.a = cuiVar;
        this.b = str;
        this.e = new ArrayList();
    }

    public static void c(bui buiVar, String str, Function0 function0) {
        buiVar.getClass();
        str.getClass();
        function0.getClass();
        buiVar.d(new f45(str, function0, 2), 0L);
    }

    public final void a() {
        cui cuiVar = this.a;
        TimeZone timeZone = yol.a;
        synchronized (cuiVar) {
            try {
                if (b()) {
                    this.a.c(this);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        xti xtiVar = this.d;
        if (xtiVar != null && xtiVar.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((xti) arrayList.get(size)).b) {
                Logger logger = this.a.b;
                xti xtiVar2 = (xti) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    v7a.y(logger, xtiVar2, this, StatusKt.STATUS_CANCELED);
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void d(xti xtiVar, long j) {
        xtiVar.getClass();
        synchronized (this.a) {
            if (!this.c) {
                if (f(xtiVar, j, false)) {
                    this.a.c(this);
                }
                Unit unit = Unit.a;
                return;
            }
            boolean z = xtiVar.b;
            cui cuiVar = this.a;
            if (z) {
                Logger logger = cuiVar.b;
                if (logger.isLoggable(Level.FINE)) {
                    v7a.y(logger, xtiVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = cuiVar.b;
                if (logger2.isLoggable(Level.FINE)) {
                    v7a.y(logger2, xtiVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean f(xti xtiVar, long j, boolean z) {
        xtiVar.getClass();
        bui buiVar = xtiVar.c;
        if (buiVar != this) {
            if (buiVar != null) {
                a70.r("task is in multiple queues");
                return false;
            }
            xtiVar.c = this;
        }
        cui cuiVar = this.a;
        by9 by9Var = cuiVar.a;
        Logger logger = cuiVar.b;
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.e;
        int indexOf = arrayList.indexOf(xtiVar);
        if (indexOf != -1) {
            if (xtiVar.d <= j2) {
                if (logger.isLoggable(Level.FINE)) {
                    v7a.y(logger, xtiVar, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        xtiVar.d = j2;
        if (logger.isLoggable(Level.FINE)) {
            v7a.y(logger, xtiVar, this, z ? "run again after ".concat(v7a.p(j2 - nanoTime)) : "scheduled after ".concat(v7a.p(j2 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((xti) it.next()).d - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, xtiVar);
        return i == 0;
    }

    public final void g() {
        cui cuiVar = this.a;
        TimeZone timeZone = yol.a;
        synchronized (cuiVar) {
            try {
                this.c = true;
                if (b()) {
                    this.a.c(this);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
