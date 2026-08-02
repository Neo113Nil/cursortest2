package org.chromium.base.task;

import android.util.Pair;
import internal.J.N;
import internal.org.jni_zero.CalledByNative;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.TraceEvent;

/* loaded from: classes10.dex */
public class TaskRunnerImpl implements f {

    /* renamed from: j, reason: collision with root package name */
    private static final ReferenceQueue<Object> f78565j = new ReferenceQueue<>();

    /* renamed from: k, reason: collision with root package name */
    private static final Object f78566k = new Object();

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable[] f78567l = new Runnable[50];

    /* renamed from: m, reason: collision with root package name */
    private static int f78568m = 50;

    /* renamed from: n, reason: collision with root package name */
    private static final HashMap f78569n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    private static final HashSet f78570o = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final int f78571a;

    /* renamed from: b, reason: collision with root package name */
    private final String f78572b;

    /* renamed from: c, reason: collision with root package name */
    private final int f78573c;

    /* renamed from: d, reason: collision with root package name */
    private volatile long f78574d;

    /* renamed from: e, reason: collision with root package name */
    protected final g f78575e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f78576f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f78577g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayDeque f78578h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f78579i;

    private static class a extends WeakReference<TaskRunnerImpl> {

        /* renamed from: a, reason: collision with root package name */
        final long f78580a;

        a(TaskRunnerImpl taskRunnerImpl) {
            super(taskRunnerImpl, TaskRunnerImpl.f78565j);
            this.f78580a = taskRunnerImpl.f78574d;
        }
    }

    TaskRunnerImpl(int i11) {
        this(i11, "TaskRunnerImpl", 0);
        c();
    }

    private static void c() {
        while (true) {
            a aVar = (a) f78565j.poll();
            if (aVar == null) {
                return;
            }
            new h();
            N.MERCiIV8(aVar.f78580a);
            HashSet hashSet = f78570o;
            synchronized (hashSet) {
                hashSet.remove(aVar);
            }
        }
    }

    private static void f(long j11, Runnable runnable, long j12) {
        int i11 = 0;
        boolean z11 = j12 == 0;
        synchronized (f78566k) {
            while (z11) {
                try {
                    Runnable[] runnableArr = f78567l;
                    if (i11 >= runnableArr.length) {
                        break;
                    } else if (runnableArr[i11] == null) {
                        runnableArr[i11] = runnable;
                    } else {
                        i11++;
                    }
                } finally {
                }
            }
            i11 = f78568m;
            f78568m = i11 + 1;
            f78569n.put(Integer.valueOf(i11), runnable);
        }
        new h();
        N.MGnQU$47(j11, j12, i11);
    }

    @CalledByNative
    static void runTask(int i11) {
        Runnable runnable;
        synchronized (f78566k) {
            try {
                Runnable[] runnableArr = f78567l;
                if (i11 < runnableArr.length) {
                    runnable = runnableArr[i11];
                    runnableArr[i11] = null;
                } else {
                    runnable = (Runnable) f78569n.remove(Integer.valueOf(i11));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        runnable.run();
    }

    final void d() {
        new h();
        long M5_IQXaH = N.M5_IQXaH(this.f78573c, this.f78571a);
        synchronized (this.f78576f) {
            try {
                ArrayDeque arrayDeque = this.f78578h;
                if (arrayDeque != null) {
                    Iterator it = arrayDeque.iterator();
                    while (it.hasNext()) {
                        f(M5_IQXaH, (Runnable) it.next(), 0L);
                    }
                    this.f78578h = null;
                }
                ArrayList arrayList = this.f78579i;
                if (arrayList != null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Pair pair = (Pair) it2.next();
                        f(M5_IQXaH, (Runnable) pair.first, ((Long) pair.second).longValue());
                    }
                    this.f78579i = null;
                }
                this.f78574d = M5_IQXaH;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        HashSet hashSet = f78570o;
        synchronized (hashSet) {
            hashSet.add(new a(this));
        }
        c();
    }

    public final void e(Runnable runnable) {
        int i11 = PostTask.f78564f;
        if (this.f78574d != 0) {
            f(this.f78574d, runnable, 0L);
            return;
        }
        synchronized (this.f78576f) {
            try {
                if (!this.f78577g) {
                    this.f78577g = true;
                    if (PostTask.c(this)) {
                        this.f78578h = new ArrayDeque();
                        this.f78579i = new ArrayList();
                    } else {
                        d();
                    }
                }
                if (this.f78574d != 0) {
                    f(this.f78574d, runnable, 0L);
                } else {
                    this.f78578h.add(runnable);
                    h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(runnable);
    }

    protected final void g() {
        TraceEvent r11 = TraceEvent.r(this.f78572b);
        try {
            synchronized (this.f78576f) {
                ArrayDeque arrayDeque = this.f78578h;
                if (arrayDeque == null) {
                    if (r11 != null) {
                        r11.close();
                    }
                } else {
                    ((Runnable) arrayDeque.poll()).run();
                    if (r11 != null) {
                        r11.close();
                    }
                }
            }
        } catch (Throwable th2) {
            if (r11 != null) {
                try {
                    r11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    protected void h() {
        ((e) PostTask.a()).execute(this.f78575e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [org.chromium.base.task.g] */
    protected TaskRunnerImpl(int i11, String str, int i12) {
        this.f78575e = new Runnable() { // from class: org.chromium.base.task.g
            @Override // java.lang.Runnable
            public final void run() {
                TaskRunnerImpl.this.g();
            }
        };
        this.f78576f = new Object();
        this.f78571a = i11;
        this.f78572b = str.concat(".PreNativeTask.run");
        this.f78573c = i12;
    }
}
