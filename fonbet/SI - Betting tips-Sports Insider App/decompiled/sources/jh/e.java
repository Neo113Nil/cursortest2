package jh;

import androidx.appcompat.widget.c1;
import hh.f;
import hh.g;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: k, reason: collision with root package name */
    public static final Logger f18551k;

    /* renamed from: l, reason: collision with root package name */
    public static final e f18552l;

    /* renamed from: a, reason: collision with root package name */
    public final i2.d f18553a;

    /* renamed from: b, reason: collision with root package name */
    public final Logger f18554b;

    /* renamed from: c, reason: collision with root package name */
    public int f18555c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18556d;

    /* renamed from: e, reason: collision with root package name */
    public long f18557e;

    /* renamed from: f, reason: collision with root package name */
    public int f18558f;

    /* renamed from: g, reason: collision with root package name */
    public int f18559g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f18560h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f18561i;
    public final d j;

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        f18551k = logger;
        String name = g.f10826b + " TaskRunner";
        Intrinsics.checkNotNullParameter(name, "name");
        f18552l = new e(new i2.d(new f(name, true)));
    }

    public e(i2.d backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        Logger logger = f18551k;
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f18553a = backend;
        this.f18554b = logger;
        this.f18555c = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        this.f18560h = new ArrayList();
        this.f18561i = new ArrayList();
        this.j = new d(this);
    }

    public static final void a(e eVar, a aVar, long j, boolean z5) {
        TimeZone timeZone = g.f10825a;
        c cVar = aVar.f18540c;
        Intrinsics.checkNotNull(cVar);
        if (cVar.f18547d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z7 = cVar.f18549f;
        cVar.f18549f = false;
        cVar.f18547d = null;
        eVar.f18560h.remove(cVar);
        if (j != -1 && !z7 && !cVar.f18546c) {
            cVar.e(aVar, j, true);
        }
        if (cVar.f18548e.isEmpty()) {
            return;
        }
        eVar.f18561i.add(cVar);
        if (z5) {
            return;
        }
        eVar.e();
    }

    public final a b() {
        boolean z5;
        TimeZone timeZone = g.f10825a;
        while (true) {
            ArrayList arrayList = this.f18561i;
            if (arrayList.isEmpty()) {
                break;
            }
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j = LongCompanionObject.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z5 = false;
                    break;
                }
                a aVar2 = (a) ((c) it.next()).f18548e.get(0);
                long max = Math.max(0L, aVar2.f18541d - nanoTime);
                if (max > 0) {
                    j = Math.min(max, j);
                } else {
                    if (aVar != null) {
                        z5 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            ArrayList arrayList2 = this.f18560h;
            if (aVar != null) {
                TimeZone timeZone2 = g.f10825a;
                aVar.f18541d = -1L;
                c cVar = aVar.f18540c;
                Intrinsics.checkNotNull(cVar);
                cVar.f18548e.remove(aVar);
                arrayList.remove(cVar);
                cVar.f18547d = aVar;
                arrayList2.add(cVar);
                if (z5 || (!this.f18556d && !arrayList.isEmpty())) {
                    e();
                }
                return aVar;
            }
            if (!this.f18556d) {
                this.f18556d = true;
                this.f18557e = nanoTime + j;
                try {
                    try {
                        Intrinsics.checkNotNullParameter(this, "taskRunner");
                        TimeZone timeZone3 = g.f10825a;
                        if (j > 0) {
                            long j6 = j / 1000000;
                            Long.signum(j6);
                            long j10 = j - (1000000 * j6);
                            if (j6 > 0 || j > 0) {
                                wait(j6, (int) j10);
                            }
                        }
                    } catch (InterruptedException unused) {
                        TimeZone timeZone4 = g.f10825a;
                        for (int size = arrayList2.size() - 1; -1 < size; size--) {
                            ((c) arrayList2.get(size)).b();
                        }
                        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                            c cVar2 = (c) arrayList.get(size2);
                            cVar2.b();
                            if (cVar2.f18548e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.f18556d = false;
                }
            } else if (j < this.f18557e - nanoTime) {
                Intrinsics.checkNotNullParameter(this, "taskRunner");
                notify();
            }
        }
        return null;
    }

    public final void c(c taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        TimeZone timeZone = g.f10825a;
        if (taskQueue.f18547d == null) {
            boolean isEmpty = taskQueue.f18548e.isEmpty();
            ArrayList arrayList = this.f18561i;
            if (isEmpty) {
                arrayList.remove(taskQueue);
            } else {
                byte[] bArr = hh.e.f10821a;
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        if (!this.f18556d) {
            e();
        } else {
            Intrinsics.checkNotNullParameter(this, "taskRunner");
            notify();
        }
    }

    public final c d() {
        int i5;
        synchronized (this) {
            i5 = this.f18555c;
            this.f18555c = i5 + 1;
        }
        return new c(this, c1.i(i5, "Q"));
    }

    public final void e() {
        TimeZone timeZone = g.f10825a;
        int i5 = this.f18558f;
        if (i5 > this.f18559g) {
            return;
        }
        this.f18558f = i5 + 1;
        Intrinsics.checkNotNullParameter(this, "taskRunner");
        d runnable = this.j;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        ((ThreadPoolExecutor) this.f18553a.f10882b).execute(runnable);
    }
}
