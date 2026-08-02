package jh;

import com.google.android.gms.internal.measurement.y3;
import hh.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final e f18544a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18545b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18546c;

    /* renamed from: d, reason: collision with root package name */
    public a f18547d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f18548e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18549f;

    public c(e taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f18544a = taskRunner;
        this.f18545b = name;
        this.f18548e = new ArrayList();
    }

    public static void c(c cVar, String name, Function0 block) {
        cVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        cVar.d(new b(name, block), 0L);
    }

    public final void a() {
        e eVar = this.f18544a;
        TimeZone timeZone = g.f10825a;
        synchronized (eVar) {
            try {
                if (b()) {
                    this.f18544a.c(this);
                }
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        a aVar = this.f18547d;
        if (aVar != null) {
            Intrinsics.checkNotNull(aVar);
            if (aVar.f18539b) {
                this.f18549f = true;
            }
        }
        ArrayList arrayList = this.f18548e;
        boolean z5 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f18539b) {
                Logger logger = this.f18544a.f18554b;
                a aVar2 = (a) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    y3.c(logger, aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z5 = true;
            }
        }
        return z5;
    }

    public final void d(a task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f18544a) {
            if (!this.f18546c) {
                if (e(task, j, false)) {
                    this.f18544a.c(this);
                }
                Unit unit = Unit.f19194a;
            } else if (task.f18539b) {
                Logger logger = this.f18544a.f18554b;
                if (logger.isLoggable(Level.FINE)) {
                    y3.c(logger, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.f18544a.f18554b;
                if (logger2.isLoggable(Level.FINE)) {
                    y3.c(logger2, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean e(a task, long j, boolean z5) {
        Intrinsics.checkNotNullParameter(task, "task");
        task.getClass();
        Intrinsics.checkNotNullParameter(this, "queue");
        c cVar = task.f18540c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f18540c = this;
        }
        e eVar = this.f18544a;
        i2.d dVar = eVar.f18553a;
        Logger logger = eVar.f18554b;
        long nanoTime = System.nanoTime();
        long j6 = nanoTime + j;
        ArrayList arrayList = this.f18548e;
        int indexOf = arrayList.indexOf(task);
        if (indexOf != -1) {
            if (task.f18541d <= j6) {
                if (logger.isLoggable(Level.FINE)) {
                    y3.c(logger, task, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        task.f18541d = j6;
        if (logger.isLoggable(Level.FINE)) {
            y3.c(logger, task, this, z5 ? "run again after ".concat(y3.l(j6 - nanoTime)) : "scheduled after ".concat(y3.l(j6 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i5 = 0;
        while (true) {
            if (!it.hasNext()) {
                i5 = -1;
                break;
            }
            if (((a) it.next()).f18541d - nanoTime > j) {
                break;
            }
            i5++;
        }
        if (i5 == -1) {
            i5 = arrayList.size();
        }
        arrayList.add(i5, task);
        return i5 == 0;
    }

    public final void f() {
        e eVar = this.f18544a;
        TimeZone timeZone = g.f10825a;
        synchronized (eVar) {
            try {
                this.f18546c = true;
                if (b()) {
                    this.f18544a.c(this);
                }
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String toString() {
        return this.f18545b;
    }
}
