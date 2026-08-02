package defpackage;

import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class p4d implements AutoCloseable {
    public static final sff V = new sff(t4d.h);
    public static final sff W = new sff(t4d.i);
    public final AtomicBoolean A;
    public final AtomicLong B;
    public final v2d C;
    public final AtomicReference D;
    public final AtomicReference E;
    public final AtomicReference F;
    public final AtomicBoolean G;
    public final AtomicBoolean H;
    public ExecutorService I;
    public ExecutorService J;
    public ExecutorService K;
    public ExecutorService L;
    public ExecutorService M;
    public ScheduledThreadPoolExecutor N;
    public final i5d O;
    public final ug5 P;
    public final boolean Q;
    public final bij R;
    public final i3c S;
    public final i3c T;
    public volatile int U;
    public final vvd a;
    public final dx b;
    public volatile boolean c;
    public volatile boolean d;
    public volatile boolean e;
    public Exception f;
    public final ReentrantLock g;
    public final ReentrantLock h;
    public final Condition i;
    public CompletableFuture j;
    public soh k;
    public v5d l;
    public v5d m;
    public CompletableFuture n;
    public final ConcurrentHashMap o;
    public final q4d p;
    public final s4d q;
    public final AtomicReference r;
    public final ConcurrentHashMap s;
    public final ConcurrentHashMap t;
    public final ConcurrentHashMap.KeySetView u;
    public final ConcurrentHashMap v;
    public final ConcurrentLinkedDeque w;
    public final AtomicReference x;
    public dsg y;
    public dsg z;

    /* JADX WARN: Removed duplicated region for block: B:19:0x010e A[Catch: all -> 0x0115, TryCatch #1 {all -> 0x0115, blocks: (B:17:0x010a, B:19:0x010e, B:22:0x0123, B:101:0x0118), top: B:16:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0141 A[Catch: all -> 0x0148, TRY_ENTER, TryCatch #2 {all -> 0x0148, blocks: (B:25:0x013b, B:28:0x0141, B:31:0x0175, B:86:0x014b, B:88:0x0151, B:94:0x0162), top: B:24:0x013b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c3 A[Catch: all -> 0x01fe, TryCatch #3 {all -> 0x01fe, blocks: (B:37:0x01b3, B:38:0x01bd, B:40:0x01c3, B:41:0x01d1, B:43:0x01d7, B:49:0x01f2, B:52:0x01f6, B:53:0x0201, B:55:0x0207, B:57:0x0213, B:58:0x021b, B:67:0x0228), top: B:36:0x01b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0151 A[Catch: all -> 0x0148, TryCatch #2 {all -> 0x0148, blocks: (B:25:0x013b, B:28:0x0141, B:31:0x0175, B:86:0x014b, B:88:0x0151, B:94:0x0162), top: B:24:0x013b }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p4d(vvd vvdVar) {
        ExecutorService executorService;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        String str;
        boolean z;
        ReentrantLock reentrantLock;
        int C;
        this.Q = vvdVar.r;
        bij bijVar = vvdVar.o;
        this.R = bijVar;
        bijVar.e("creating connection object", new Object[0]);
        this.a = vvdVar;
        this.b = new dx();
        this.g = new ReentrantLock();
        ReentrantLock reentrantLock2 = new ReentrantLock();
        this.h = reentrantLock2;
        this.i = reentrantLock2.newCondition();
        this.U = 1;
        CompletableFuture completableFuture = new CompletableFuture();
        this.n = completableFuture;
        completableFuture.complete(Boolean.TRUE);
        ConcurrentHashMap.KeySetView newKeySet = ConcurrentHashMap.newKeySet();
        this.u = newKeySet;
        i1 i1Var = vvdVar.p;
        if (i1Var != null) {
            newKeySet.add(i1Var);
        }
        this.t = new ConcurrentHashMap();
        this.s = new ConcurrentHashMap();
        this.v = new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.o = new ConcurrentHashMap();
        this.B = new AtomicLong(1L);
        bijVar.e("creating NUID", new Object[0]);
        v2d v2dVar = new v2d();
        this.C = v2dVar;
        v2dVar.a();
        this.E = new AtomicReference();
        this.D = new AtomicReference();
        this.r = new AtomicReference(o6h.t);
        this.x = new AtomicReference();
        new ReentrantLock();
        this.w = new ConcurrentLinkedDeque();
        this.F = new AtomicReference();
        this.G = new AtomicBoolean();
        this.H = new AtomicBoolean();
        bijVar.e("creating executors", new Object[0]);
        ReentrantLock reentrantLock3 = vvdVar.s;
        reentrantLock3.lock();
        try {
            vvdVar.x++;
            reentrantLock3.unlock();
            this.J = vvdVar.d();
            reentrantLock3 = vvdVar.s;
            reentrantLock3.lock();
            try {
                ExecutorService executorService2 = vvdVar.w;
                try {
                    try {
                        try {
                            if (executorService2 != null) {
                                if (executorService2.isShutdown()) {
                                }
                                ExecutorService executorService3 = vvdVar.w;
                                reentrantLock3.unlock();
                                this.I = executorService3;
                                reentrantLock3 = vvdVar.s;
                                reentrantLock3.lock();
                                executorService = vvdVar.v;
                                if (executorService != null) {
                                    if (!executorService.isShutdown()) {
                                    }
                                    ExecutorService executorService4 = vvdVar.v;
                                    reentrantLock3.unlock();
                                    this.K = executorService4;
                                    this.L = vvdVar.d();
                                    this.M = vvdVar.d();
                                    reentrantLock3 = vvdVar.s;
                                    reentrantLock3.lock();
                                    scheduledThreadPoolExecutor = vvdVar.t;
                                    if (scheduledThreadPoolExecutor != null) {
                                        if (!scheduledThreadPoolExecutor.isShutdown()) {
                                        }
                                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = vvdVar.t;
                                        reentrantLock3.unlock();
                                        this.N = scheduledThreadPoolExecutor2;
                                        bijVar.e("creating reader and writer", new Object[0]);
                                        this.p = new q4d(this);
                                        this.q = new s4d(this);
                                        this.A = new AtomicBoolean(true);
                                        i5d i5dVar = new i5d();
                                        this.O = i5dVar;
                                        reentrantLock = (ReentrantLock) i5dVar.c;
                                        i5dVar.e = vvdVar;
                                        int i = vvdVar.e;
                                        i5dVar.a = i >= 0 ? Integer.MAX_VALUE : i + 1;
                                        reentrantLock.lock();
                                        for (v5d v5dVar : ((vvd) i5dVar.e).a) {
                                            Iterator it = ((ArrayList) i5dVar.d).iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    break;
                                                }
                                                p6h p6hVar = (p6h) it.next();
                                                if (v5dVar.a().compareTo(p6hVar.a.a()) == 0) {
                                                    if (v5dVar.b) {
                                                        ((ArrayList) i5dVar.d).remove(p6hVar);
                                                    }
                                                }
                                            }
                                            if (((String) i5dVar.g) == null && !v5dVar.a.getScheme().equals("nats")) {
                                                i5dVar.g = v5dVar.a.getScheme();
                                            }
                                            ((ArrayList) i5dVar.d).add(new p6h(v5dVar, false));
                                        }
                                        i5dVar.a();
                                        reentrantLock.unlock();
                                        this.P = new ug5();
                                        this.R.e("connection object created", new Object[0]);
                                        C = wt3.C(2);
                                        if (C != 0) {
                                            this.S = new i3c(16);
                                            this.T = new i3c(17);
                                            return;
                                        }
                                        int i2 = 19;
                                        if (C != 2) {
                                            this.S = new i3c(20);
                                            this.T = new i3c(i2);
                                            return;
                                        } else {
                                            this.S = new i3c(18);
                                            this.T = new i3c(i2);
                                            return;
                                        }
                                    }
                                    str = vvdVar.c;
                                    char[] cArr = dkk.a;
                                    if (str != null && !str.trim().isEmpty()) {
                                        z = false;
                                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = new ScheduledThreadPoolExecutor(3, new rvd(z ? "nats" : str, 0));
                                        scheduledThreadPoolExecutor3.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
                                        scheduledThreadPoolExecutor3.setRemoveOnCancelPolicy(true);
                                        vvdVar.t = scheduledThreadPoolExecutor3;
                                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor22 = vvdVar.t;
                                        reentrantLock3.unlock();
                                        this.N = scheduledThreadPoolExecutor22;
                                        bijVar.e("creating reader and writer", new Object[0]);
                                        this.p = new q4d(this);
                                        this.q = new s4d(this);
                                        this.A = new AtomicBoolean(true);
                                        i5d i5dVar2 = new i5d();
                                        this.O = i5dVar2;
                                        reentrantLock = (ReentrantLock) i5dVar2.c;
                                        i5dVar2.e = vvdVar;
                                        int i3 = vvdVar.e;
                                        i5dVar2.a = i3 >= 0 ? Integer.MAX_VALUE : i3 + 1;
                                        reentrantLock.lock();
                                        while (r11.hasNext()) {
                                        }
                                        i5dVar2.a();
                                        reentrantLock.unlock();
                                        this.P = new ug5();
                                        this.R.e("connection object created", new Object[0]);
                                        C = wt3.C(2);
                                        if (C != 0) {
                                        }
                                    }
                                    z = true;
                                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor32 = new ScheduledThreadPoolExecutor(3, new rvd(z ? "nats" : str, 0));
                                    scheduledThreadPoolExecutor32.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
                                    scheduledThreadPoolExecutor32.setRemoveOnCancelPolicy(true);
                                    vvdVar.t = scheduledThreadPoolExecutor32;
                                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor222 = vvdVar.t;
                                    reentrantLock3.unlock();
                                    this.N = scheduledThreadPoolExecutor222;
                                    bijVar.e("creating reader and writer", new Object[0]);
                                    this.p = new q4d(this);
                                    this.q = new s4d(this);
                                    this.A = new AtomicBoolean(true);
                                    i5d i5dVar22 = new i5d();
                                    this.O = i5dVar22;
                                    reentrantLock = (ReentrantLock) i5dVar22.c;
                                    i5dVar22.e = vvdVar;
                                    int i32 = vvdVar.e;
                                    i5dVar22.a = i32 >= 0 ? Integer.MAX_VALUE : i32 + 1;
                                    reentrantLock.lock();
                                    while (r11.hasNext()) {
                                    }
                                    i5dVar22.a();
                                    reentrantLock.unlock();
                                    this.P = new ug5();
                                    this.R.e("connection object created", new Object[0]);
                                    C = wt3.C(2);
                                    if (C != 0) {
                                    }
                                }
                                vvd.I.getClass();
                                vvdVar.v = Executors.newSingleThreadExecutor();
                                ExecutorService executorService42 = vvdVar.v;
                                reentrantLock3.unlock();
                                this.K = executorService42;
                                this.L = vvdVar.d();
                                this.M = vvdVar.d();
                                reentrantLock3 = vvdVar.s;
                                reentrantLock3.lock();
                                scheduledThreadPoolExecutor = vvdVar.t;
                                if (scheduledThreadPoolExecutor != null) {
                                }
                                str = vvdVar.c;
                                char[] cArr2 = dkk.a;
                                if (str != null) {
                                    z = false;
                                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor322 = new ScheduledThreadPoolExecutor(3, new rvd(z ? "nats" : str, 0));
                                    scheduledThreadPoolExecutor322.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
                                    scheduledThreadPoolExecutor322.setRemoveOnCancelPolicy(true);
                                    vvdVar.t = scheduledThreadPoolExecutor322;
                                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2222 = vvdVar.t;
                                    reentrantLock3.unlock();
                                    this.N = scheduledThreadPoolExecutor2222;
                                    bijVar.e("creating reader and writer", new Object[0]);
                                    this.p = new q4d(this);
                                    this.q = new s4d(this);
                                    this.A = new AtomicBoolean(true);
                                    i5d i5dVar222 = new i5d();
                                    this.O = i5dVar222;
                                    reentrantLock = (ReentrantLock) i5dVar222.c;
                                    i5dVar222.e = vvdVar;
                                    int i322 = vvdVar.e;
                                    i5dVar222.a = i322 >= 0 ? Integer.MAX_VALUE : i322 + 1;
                                    reentrantLock.lock();
                                    while (r11.hasNext()) {
                                    }
                                    i5dVar222.a();
                                    reentrantLock.unlock();
                                    this.P = new ug5();
                                    this.R.e("connection object created", new Object[0]);
                                    C = wt3.C(2);
                                    if (C != 0) {
                                    }
                                }
                                z = true;
                                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3222 = new ScheduledThreadPoolExecutor(3, new rvd(z ? "nats" : str, 0));
                                scheduledThreadPoolExecutor3222.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
                                scheduledThreadPoolExecutor3222.setRemoveOnCancelPolicy(true);
                                vvdVar.t = scheduledThreadPoolExecutor3222;
                                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor22222 = vvdVar.t;
                                reentrantLock3.unlock();
                                this.N = scheduledThreadPoolExecutor22222;
                                bijVar.e("creating reader and writer", new Object[0]);
                                this.p = new q4d(this);
                                this.q = new s4d(this);
                                this.A = new AtomicBoolean(true);
                                i5d i5dVar2222 = new i5d();
                                this.O = i5dVar2222;
                                reentrantLock = (ReentrantLock) i5dVar2222.c;
                                i5dVar2222.e = vvdVar;
                                int i3222 = vvdVar.e;
                                i5dVar2222.a = i3222 >= 0 ? Integer.MAX_VALUE : i3222 + 1;
                                reentrantLock.lock();
                                while (r11.hasNext()) {
                                }
                                i5dVar2222.a();
                                reentrantLock.unlock();
                                this.P = new ug5();
                                this.R.e("connection object created", new Object[0]);
                                C = wt3.C(2);
                                if (C != 0) {
                                }
                            }
                            while (r11.hasNext()) {
                            }
                            i5dVar2222.a();
                            reentrantLock.unlock();
                            this.P = new ug5();
                            this.R.e("connection object created", new Object[0]);
                            C = wt3.C(2);
                            if (C != 0) {
                            }
                        } catch (Throwable th) {
                            reentrantLock.unlock();
                            throw th;
                        }
                        scheduledThreadPoolExecutor = vvdVar.t;
                        if (scheduledThreadPoolExecutor != null) {
                        }
                        str = vvdVar.c;
                        char[] cArr22 = dkk.a;
                        if (str != null) {
                        }
                        z = true;
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor32222 = new ScheduledThreadPoolExecutor(3, new rvd(z ? "nats" : str, 0));
                        scheduledThreadPoolExecutor32222.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
                        scheduledThreadPoolExecutor32222.setRemoveOnCancelPolicy(true);
                        vvdVar.t = scheduledThreadPoolExecutor32222;
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor222222 = vvdVar.t;
                        reentrantLock3.unlock();
                        this.N = scheduledThreadPoolExecutor222222;
                        bijVar.e("creating reader and writer", new Object[0]);
                        this.p = new q4d(this);
                        this.q = new s4d(this);
                        this.A = new AtomicBoolean(true);
                        i5d i5dVar22222 = new i5d();
                        this.O = i5dVar22222;
                        reentrantLock = (ReentrantLock) i5dVar22222.c;
                        i5dVar22222.e = vvdVar;
                        int i32222 = vvdVar.e;
                        i5dVar22222.a = i32222 >= 0 ? Integer.MAX_VALUE : i32222 + 1;
                        reentrantLock.lock();
                    } finally {
                    }
                    executorService = vvdVar.v;
                    if (executorService != null) {
                    }
                    vvd.I.getClass();
                    vvdVar.v = Executors.newSingleThreadExecutor();
                    ExecutorService executorService422 = vvdVar.v;
                    reentrantLock3.unlock();
                    this.K = executorService422;
                    this.L = vvdVar.d();
                    this.M = vvdVar.d();
                    reentrantLock3 = vvdVar.s;
                    reentrantLock3.lock();
                } finally {
                }
                vvd.I.getClass();
                vvdVar.w = Executors.newSingleThreadExecutor();
                ExecutorService executorService32 = vvdVar.w;
                reentrantLock3.unlock();
                this.I = executorService32;
                reentrantLock3 = vvdVar.s;
                reentrantLock3.lock();
            } finally {
            }
        } finally {
            reentrantLock3.unlock();
        }
    }

    public static boolean T(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.startsWith("user authentication") || lowerCase.contains("authorization violation") || lowerCase.startsWith("account authentication expired");
    }

    public final void B0() {
        long j;
        if (isClosed()) {
            return;
        }
        if (this.a.e == 0) {
            close();
            return;
        }
        s4d s4dVar = this.q;
        jml jmlVar = s4dVar.l;
        ReentrantLock reentrantLock = jmlVar.e;
        reentrantLock.lock();
        try {
            ((LinkedBlockingQueue) jmlVar.a).clear();
            ((AtomicLong) jmlVar.b).set(0L);
            ((AtomicLong) jmlVar.c).set(0L);
            reentrantLock.unlock();
            s4dVar.g.set(r4d.b);
            if (!Z() && !isClosed() && !this.e) {
                v5d v5dVar = null;
                loop0: while (true) {
                    v5d e = this.O.e();
                    if (e != null) {
                        if (v5dVar == null) {
                            this.a.getClass();
                            v5dVar = e;
                        } else if (v5dVar.equals(e)) {
                            vvd vvdVar = this.a;
                            vvdVar.getClass();
                            Duration duration = vvdVar.f;
                            if (duration != null) {
                                j = duration.toNanos();
                                Duration duration2 = this.O.b ? vvdVar.h : vvdVar.g;
                                if (duration2 != null) {
                                    j += ThreadLocalRandom.current().nextLong(duration2.toNanos());
                                }
                            } else {
                                j = 0;
                            }
                            this.n = new CompletableFuture();
                            long nanoTime = System.nanoTime();
                            while (j > 0 && !a0() && !Z() && !this.n.isDone()) {
                                try {
                                    this.n.get(j, TimeUnit.NANOSECONDS);
                                } catch (Exception unused) {
                                }
                                long nanoTime2 = System.nanoTime();
                                j -= nanoTime2 - nanoTime;
                                nanoTime = nanoTime2;
                            }
                            this.n.complete(Boolean.TRUE);
                        }
                        Iterator it = E0(e).iterator();
                        while (it.hasNext()) {
                            v5d v5dVar2 = (v5d) it.next();
                            if (!isClosed()) {
                                this.D.set(null);
                                if (a0() || this.e) {
                                    break loop0;
                                }
                                a1(4, v5dVar2, e);
                                this.R.e("reconnecting to server %s", e);
                                X0(e, v5dVar2, System.nanoTime());
                                boolean Z = Z();
                                i5d i5dVar = this.O;
                                if (Z) {
                                    i5dVar.d(e);
                                    ((AtomicLong) this.b.l).incrementAndGet();
                                    break loop0;
                                }
                                i5dVar.c(e);
                                String str = (String) this.D.get();
                                if (T(str)) {
                                    if (str.equals(this.o.get(v5dVar2))) {
                                        break loop0;
                                    } else {
                                        this.o.put(v5dVar2, str);
                                    }
                                }
                            } else {
                                break loop0;
                            }
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!Z()) {
                close();
                return;
            }
            int i = 1;
            this.s.forEach(new tqb(this, i));
            this.t.forEach(new m4d(i));
            s4d s4dVar2 = this.q;
            s4dVar2.g.set(r4d.c);
            ((LinkedBlockingQueue) s4dVar2.l.a).offer(avb.o);
            zj3 zj3Var = zj3.f;
            v5d v5dVar3 = this.l;
            f0(zj3Var, v5dVar3 != null ? v5dVar3.a.toString() : null);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void C(String str) {
        boolean z;
        o6h o6hVar = new o6h(str);
        AtomicReference atomicReference = this.r;
        atomicReference.set(o6hVar);
        ArrayList arrayList = ((o6h) atomicReference.get()).l;
        if (!arrayList.isEmpty()) {
            i5d i5dVar = this.O;
            Object obj = i5dVar.e;
            ReentrantLock reentrantLock = (ReentrantLock) i5dVar.c;
            reentrantLock.lock();
            try {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList2.add(new v5d((String) it.next(), (String) i5dVar.g));
                    } catch (URISyntaxException unused) {
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = ((ArrayList) i5dVar.d).iterator();
                while (true) {
                    z = true;
                    if (!it2.hasNext()) {
                        break;
                    }
                    p6h p6hVar = (p6h) it2.next();
                    v5d v5dVar = p6hVar.a;
                    int i = 0;
                    while (true) {
                        if (i >= arrayList2.size()) {
                            i = -1;
                            break;
                        } else {
                            if (((v5d) arrayList2.get(i)).a().compareTo(v5dVar.a()) == 0) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    if (i != -1 || p6hVar.a.equals((v5d) i5dVar.f) || !p6hVar.b) {
                        arrayList3.add(p6hVar);
                        if (i != -1) {
                            arrayList2.remove(i);
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    z = false;
                } else {
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new p6h((v5d) it3.next(), true));
                    }
                }
                i5dVar.d = arrayList3;
                i5dVar.a();
                if (z) {
                    f0(zj3.g, arrayList.toString());
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        if (o6hVar.o) {
            zj3 zj3Var = zj3.h;
            v5d v5dVar2 = this.l;
            f0(zj3Var, v5dVar2 == null ? null : v5dVar2.a.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList E0(v5d v5dVar) {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        this.a.getClass();
        ArrayList arrayList2 = new ArrayList();
        if (!v5dVar.d && !v5dVar.c) {
            switch (1) {
                case 1:
                case 2:
                case 3:
                case 4:
                    z = true;
                    break;
                case 5:
                case 6:
                    z = false;
                    break;
                default:
                    throw null;
            }
            if (z) {
                String host = v5dVar.a.getHost();
                switch (1) {
                    case 1:
                    case 3:
                    case 5:
                    case 6:
                        z2 = false;
                        break;
                    case 2:
                    case 4:
                        z2 = true;
                        break;
                    default:
                        throw null;
                }
                switch (1) {
                    case 1:
                    case 2:
                    case 5:
                    case 6:
                        z3 = false;
                        break;
                    case 3:
                    case 4:
                        z3 = true;
                        break;
                    default:
                        throw null;
                }
                this.O.getClass();
                ArrayList arrayList3 = new ArrayList();
                try {
                    for (InetAddress inetAddress : InetAddress.getAllByName(host)) {
                        if (z3 || (inetAddress instanceof Inet4Address)) {
                            arrayList3.add(inetAddress.getHostAddress());
                        }
                    }
                } catch (UnknownHostException unused) {
                }
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    arrayList = arrayList3;
                    arrayList = arrayList3;
                    if (size != 1 && z2) {
                        arrayList = arrayList3.subList(0, 1);
                    }
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            try {
                                arrayList2.add(v5dVar.d((String) it.next()));
                            } catch (URISyntaxException e) {
                                is8.h(e);
                                return null;
                            }
                        }
                    }
                }
                arrayList = null;
                if (arrayList != null) {
                }
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(v5dVar);
        }
        return arrayList2;
    }

    public final void H() {
        CompletableFuture completableFuture = (CompletableFuture) this.w.pollFirst();
        if (completableFuture != null) {
            completableFuture.complete(Boolean.TRUE);
        }
    }

    public final void H0(v5d v5dVar) {
        try {
            CharBuffer c = this.a.c(v5dVar.a.toString(), ((o6h) this.r.get()).n);
            int limit = t4d.q + c.limit();
            Charset charset = StandardCharsets.UTF_8;
            o92 o92Var = new o92(limit, -1, charset);
            o92Var.c(t4d.l);
            o92Var.c(c.toString().getBytes(charset));
            r0(new sff(o92Var, false));
        } catch (Exception e) {
            cp4.i("Error sending connect string", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CompletableFuture I0(boolean z) {
        boolean z2;
        this.h.lock();
        try {
            if (this.U != 2) {
                if (!this.c) {
                    z2 = false;
                    if (z2) {
                        CompletableFuture completableFuture = new CompletableFuture();
                        completableFuture.complete(Boolean.FALSE);
                        return completableFuture;
                    }
                    if (!z && !this.A.get()) {
                        CompletableFuture completableFuture2 = new CompletableFuture();
                        completableFuture2.complete(Boolean.TRUE);
                        this.A.set(true);
                        return completableFuture2;
                    }
                    this.a.getClass();
                    if (this.w.size() + 1 > 2) {
                        t(new IllegalStateException("Max outgoing Ping count exceeded."));
                        return null;
                    }
                    CompletableFuture completableFuture3 = new CompletableFuture();
                    this.w.add(completableFuture3);
                    if (z) {
                        r0(new sff(V));
                    } else {
                        u0(new sff(V));
                    }
                    this.A.set(true);
                    ((AtomicLong) this.b.e).incrementAndGet();
                    return completableFuture3;
                }
            }
            z2 = true;
            if (z2) {
            }
        } finally {
            this.h.unlock();
        }
    }

    public final void M(u5d u5dVar) {
        this.s.remove(u5dVar.i);
        x4d x4dVar = u5dVar.j;
        if (x4dVar != null) {
            ConcurrentHashMap concurrentHashMap = x4dVar.n;
            String str = u5dVar.i;
            ConcurrentHashMap concurrentHashMap2 = x4dVar.l;
            String str2 = u5dVar.h;
            u5d u5dVar2 = (u5d) concurrentHashMap2.get(str2);
            if (u5dVar2 != null && u5dVar2.i.equals(str)) {
                concurrentHashMap2.remove(str2);
            }
            x4dVar.m.remove(str);
            x4dVar.o.remove(str);
            Map map = (Map) concurrentHashMap.get(str2);
            if (map != null) {
                map.remove(str);
                if (map.isEmpty()) {
                    concurrentHashMap.remove(str2);
                }
            }
        }
        bo3 bo3Var = u5dVar.k;
        if (bo3Var != null) {
            bo3Var.b();
        }
        u5dVar.j = null;
        u5dVar.k = null;
    }

    public final void P0(String str, String str2, boolean z) {
        if (Z()) {
            o92 o92Var = new o92(-1, -1, StandardCharsets.UTF_8);
            o92Var.c(t4d.m);
            o92Var.b(str2);
            o92Var.a();
            o92Var.b(str);
            sff sffVar = new sff(o92Var, true);
            if (z) {
                r0(sffVar);
            } else {
                u0(sffVar);
            }
        }
    }

    public final long Q0(long j, String str) {
        long nanoTime = j - System.nanoTime();
        if (this.Q) {
            bij bijVar = this.R;
            if (nanoTime < 0) {
                if (nanoTime > -1000000) {
                    bijVar.e(str.concat(String.format(", %d (ns) beyond timeout", Long.valueOf(-nanoTime))), new Object[0]);
                } else if (nanoTime > -1000000000) {
                    bijVar.e(str.concat(String.format(", %d (ms) beyond timeout", Long.valueOf((-nanoTime) / 1000000))), new Object[0]);
                } else {
                    bijVar.e(str.concat(String.format(", %.3f (s) beyond timeout", Double.valueOf((-nanoTime) / 1.0E9d))), new Object[0]);
                }
            } else if (nanoTime < 1000000) {
                bijVar.e(str.concat(String.format(", %d (ns) remaining", Long.valueOf(nanoTime))), new Object[0]);
            } else if (nanoTime < 1000000000) {
                bijVar.e(str.concat(String.format(", %d (ms) remaining", Long.valueOf(nanoTime / 1000000))), new Object[0]);
            } else {
                bijVar.e(str.concat(String.format(", %.3f (s) remaining", Double.valueOf(nanoTime / 1.0E9d))), new Object[0]);
            }
        }
        if (nanoTime >= 0) {
            return nanoTime;
        }
        throw new TimeoutException("connection timed out");
    }

    public final void X0(v5d v5dVar, final v5d v5dVar2, long j) {
        v5d v5dVar3 = this.l;
        if (v5dVar3 != null) {
            this.m = v5dVar3;
        }
        this.l = null;
        try {
            try {
                vvd vvdVar = this.a;
                Duration duration = vvdVar.i;
                final boolean z = vvdVar.r;
                long nanos = j + duration.toNanos();
                Q0(nanos, "starting connection attempt");
                this.h.lock();
                try {
                    if (this.c) {
                        this.h.unlock();
                        this.h.lock();
                        try {
                            this.c = false;
                            this.i.signalAll();
                        } finally {
                        }
                    } else {
                        this.c = true;
                        this.i.signalAll();
                        this.h.unlock();
                        this.j = new CompletableFuture();
                        long Q0 = Q0(nanos, "waiting for reader");
                        boolean z2 = this.p.t.get();
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        if (z2) {
                            this.p.k(true).get(Q0, timeUnit);
                        }
                        long Q02 = Q0(nanos, "waiting for writer");
                        if (this.q.f.get()) {
                            this.q.c().get(Q02, timeUnit);
                        }
                        Q0(nanos, "cleaning pong queue");
                        while (true) {
                            Future future = (Future) this.w.poll();
                            if (future == null) {
                                break;
                            } else {
                                future.cancel(true);
                            }
                        }
                        long Q03 = Q0(nanos, "connecting data port");
                        soh b = this.a.b();
                        b.c(this, v5dVar2, Q03);
                        this.k = b;
                        this.j.complete(b);
                        Callable callable = new Callable() { // from class: o4d
                            /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
                            
                                r5 = com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_BUFFER_SEGMENT_SIZE;
                             */
                            @Override // java.util.concurrent.Callable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object call() {
                                int read;
                                p4d p4dVar = p4d.this;
                                AtomicReference atomicReference = p4dVar.r;
                                vvd vvdVar2 = p4dVar.a;
                                vvdVar2.getClass();
                                SSLContext sSLContext = vvdVar2.d;
                                vvdVar2.getClass();
                                byte[] bArr = new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE];
                                ByteBuffer allocate = ByteBuffer.allocate(C.DEFAULT_BUFFER_SEGMENT_SIZE);
                                boolean z3 = false;
                                boolean z4 = false;
                                for (int i = C.DEFAULT_BUFFER_SEGMENT_SIZE; !z3 && (read = p4dVar.k.f.read(bArr, 0, i)) >= 0; i = C.DEFAULT_BUFFER_SEGMENT_SIZE) {
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 < read) {
                                            int i3 = i2 + 1;
                                            byte b2 = bArr[i2];
                                            if (!z4) {
                                                if (b2 == 13) {
                                                    z4 = true;
                                                } else {
                                                    if (!allocate.hasRemaining()) {
                                                        ByteBuffer allocate2 = ByteBuffer.allocate(allocate.capacity() * 2);
                                                        allocate.flip();
                                                        allocate2.put(allocate);
                                                        allocate = allocate2;
                                                    }
                                                    allocate.put(b2);
                                                }
                                                i2 = i3;
                                            } else {
                                                if (b2 != 10) {
                                                    is8.e("Missed LF after CR waiting for INFO.");
                                                    return null;
                                                }
                                                if (i3 < read) {
                                                    is8.e("Read past initial info message.");
                                                    return null;
                                                }
                                                z3 = true;
                                            }
                                        }
                                    }
                                }
                                if (!z3) {
                                    is8.e("Failed to read initial info message.");
                                    return null;
                                }
                                allocate.flip();
                                String trim = StandardCharsets.UTF_8.decode(allocate).toString().trim();
                                if (!"INFO".equals(trim.split("\\s")[0].toUpperCase())) {
                                    is8.e("Received non-info initial message.");
                                    return null;
                                }
                                p4dVar.C(trim);
                                vvdVar2.getClass();
                                long nanoTime = System.nanoTime();
                                if (!v5dVar2.c) {
                                    o6h o6hVar = (o6h) atomicReference.get();
                                    if (sSLContext != null) {
                                        if (!o6hVar.i && !o6hVar.j) {
                                            is8.e("SSL connection wanted by client.");
                                            return null;
                                        }
                                        p4dVar.k.d();
                                    } else if (o6hVar.i) {
                                        is8.e("SSL required by server.");
                                        return null;
                                    }
                                }
                                if (z && sSLContext != null) {
                                    p4dVar.R.e("TLS upgrade took: %.3f (s)", Double.valueOf((System.nanoTime() - nanoTime) / 1.0E9d));
                                }
                                return null;
                            }
                        };
                        long Q04 = Q0(nanos, "reading info, version and upgrading to secure if necessary");
                        Future submit = this.K.submit(callable);
                        try {
                            submit.get(Q04, timeUnit);
                            submit.cancel(true);
                            Q0(nanos, "starting reader");
                            this.p.j(this.j);
                            Q0(nanos, "starting writer");
                            this.q.b(this.j);
                            Q0(nanos, "sending connect message");
                            H0(v5dVar2);
                            long Q05 = Q0(nanos, "sending initial ping");
                            CompletableFuture I0 = I0(true);
                            if (I0 != null) {
                                I0.get(Q05, timeUnit);
                            }
                            int i = 2;
                            if (this.y == null) {
                                Q0(nanos, "starting ping and cleanup timers");
                                long millis = this.a.k.toMillis();
                                if (millis > 0) {
                                    this.y = new dsg(this.N, millis, new n4d(this, i));
                                }
                                long millis2 = this.a.l.toMillis();
                                if (millis2 > 0) {
                                    this.z = new dsg(this.N, millis2, new n4d(this, 3));
                                }
                            }
                            Q0(nanos, "updating status to connected");
                            this.h.lock();
                            try {
                                this.c = false;
                                Exception exc = this.f;
                                if (exc != null) {
                                    throw exc;
                                }
                                this.l = v5dVar;
                                this.o.clear();
                                Z0(2);
                                this.h.unlock();
                                this.R.e("status updated", new Object[0]);
                                this.h.lock();
                                try {
                                    this.c = false;
                                    this.i.signalAll();
                                } finally {
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            submit.cancel(true);
                            throw th;
                        }
                    }
                } finally {
                }
            } catch (Throwable th2) {
                this.h.lock();
                try {
                    this.c = false;
                    this.i.signalAll();
                    throw th2;
                } finally {
                }
            }
        } catch (Exception e) {
            j0(e);
            try {
                i(false);
            } catch (InterruptedException e2) {
                j0(e2);
                Thread.currentThread().interrupt();
            }
            this.h.lock();
            try {
                this.c = false;
                this.i.signalAll();
            } finally {
            }
        }
    }

    public final void Y0(u5d u5dVar) {
        if (isClosed()) {
            a70.r("Connection is Closed");
            return;
        }
        M(u5dVar);
        if (Z()) {
            o92 o92Var = new o92(-1, 32, StandardCharsets.ISO_8859_1);
            o92Var.c(t4d.n);
            o92Var.b(u5dVar.i);
            u0(new sff(o92Var, true));
        }
    }

    public final boolean Z() {
        return this.U == 2;
    }

    public final void Z0(int i) {
        v5d v5dVar = this.l;
        if (v5dVar == null) {
            v5dVar = this.m;
        }
        b1(i, v5dVar == null ? null : v5dVar.a.toString());
    }

    public final boolean a0() {
        boolean z;
        this.h.lock();
        try {
            if (this.U != 3) {
                if (!this.d) {
                    z = false;
                    return z;
                }
            }
            z = true;
            return z;
        } finally {
            this.h.unlock();
        }
    }

    public final void a1(int i, v5d v5dVar, v5d v5dVar2) {
        String uri;
        if (v5dVar == null) {
            uri = v5dVar2.a.toString();
        } else if (v5dVar.equals(v5dVar2)) {
            uri = v5dVar.a.toString();
        } else {
            uri = v5dVar + " [" + v5dVar2 + U3.j.e;
        }
        b1(i, uri);
    }

    public final void b1(int i, String str) {
        this.h.lock();
        try {
            int i2 = this.U;
            if (i2 != 3 && i != i2) {
                this.U = i;
                this.i.signalAll();
                this.h.unlock();
                if (i == 1) {
                    f0(zj3.d, str);
                    return;
                }
                if (i == 3) {
                    f0(zj3.c, str);
                    return;
                }
                if (i2 == 4 && i == 2) {
                    f0(zj3.e, str);
                } else if (i == 2) {
                    f0(zj3.b, str);
                }
            }
        } finally {
            this.h.unlock();
        }
    }

    public final void c1(h5d h5dVar) {
        int i = h5dVar.j;
        this.a.getClass();
        AtomicReference atomicReference = this.r;
        o6h o6hVar = (o6h) atomicReference.get();
        if ((o6hVar == null ? -1L : o6hVar.k) > 0) {
            long j = h5dVar.i + i;
            o6h o6hVar2 = (o6h) atomicReference.get();
            if (j > (o6hVar2 == null ? -1L : o6hVar2.k)) {
                StringBuilder sb = new StringBuilder("Message payload size exceed server configuration ");
                sb.append(i + h5dVar.i);
                sb.append(" vs ");
                o6h o6hVar3 = (o6h) atomicReference.get();
                sb.append(o6hVar3 != null ? o6hVar3.k : -1L);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (h5dVar.f <= 4096) {
            return;
        }
        a70.p("Control line is too long");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock;
        this.h.lock();
        try {
            int i = 0;
            boolean z = this.F.get() != null;
            long j = -1;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (z) {
                Duration duration = this.a.i;
                reentrantLock = this.h;
                reentrantLock.lock();
                if (duration != null) {
                    try {
                        j = duration.toNanos();
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                long nanoTime = System.nanoTime();
                while (j >= 0) {
                    this.h.lock();
                    try {
                        if (!(this.d && !isClosed())) {
                            break;
                        }
                        Condition condition = this.i;
                        if (j > 0) {
                            if (condition.await(j, timeUnit)) {
                                this.h.lock();
                                try {
                                    boolean z2 = this.d;
                                    this.h.unlock();
                                    if (!(z2 && !isClosed())) {
                                    }
                                } finally {
                                }
                            }
                            long nanoTime2 = System.nanoTime();
                            j -= nanoTime2 - nanoTime;
                            if (j <= 0) {
                                break;
                            } else {
                                nanoTime = nanoTime2;
                            }
                        } else {
                            condition.await();
                        }
                    } finally {
                    }
                }
                return;
            }
            this.e = true;
            if (a0()) {
                Duration duration2 = this.a.i;
                reentrantLock = this.h;
                reentrantLock.lock();
                if (duration2 != null) {
                    try {
                        j = duration2.toNanos();
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                long nanoTime3 = System.nanoTime();
                while (j >= 0) {
                    this.h.lock();
                    try {
                        if (!(this.d && !isClosed())) {
                            break;
                        }
                        Condition condition2 = this.i;
                        if (j > 0) {
                            if (condition2.await(j, timeUnit)) {
                                this.h.lock();
                                try {
                                    boolean z3 = this.d;
                                    this.h.unlock();
                                    if (!(z3 && !isClosed())) {
                                        break;
                                    }
                                } finally {
                                }
                            }
                            long nanoTime4 = System.nanoTime();
                            j -= nanoTime4 - nanoTime3;
                            if (j <= 0) {
                                break;
                            } else {
                                nanoTime3 = nanoTime4;
                            }
                        } else {
                            condition2.await();
                        }
                    } finally {
                    }
                }
                reentrantLock.unlock();
                return;
            }
            this.d = true;
            this.f = null;
            this.i.signalAll();
            this.h.unlock();
            CompletableFuture completableFuture = this.n;
            if (completableFuture != null) {
                completableFuture.cancel(true);
            }
            j(false);
            this.t.forEach(new m4d(i));
            this.s.forEach(new m4d(2));
            this.t.clear();
            this.s.clear();
            dsg dsgVar = this.y;
            if (dsgVar != null) {
                dsgVar.a();
                this.y = null;
            }
            dsg dsgVar2 = this.z;
            if (dsgVar2 != null) {
                dsgVar2.a();
                this.z = null;
            }
            h();
            while (true) {
                Future future = (Future) this.w.poll();
                if (future == null) {
                    break;
                } else {
                    future.cancel(true);
                }
            }
            this.h.lock();
            try {
                Z0(3);
                this.h.unlock();
                this.I = null;
                this.J = null;
                this.K = null;
                this.L = null;
                this.M = null;
                this.N = null;
                vvd vvdVar = this.a;
                ReentrantLock reentrantLock2 = vvdVar.s;
                reentrantLock2.lock();
                try {
                    int i2 = vvdVar.x - 1;
                    vvdVar.x = i2;
                    if (i2 == 0) {
                        ExecutorService executorService = vvdVar.w;
                        if (executorService != null) {
                            vvdVar.w = null;
                            executorService.shutdown();
                            try {
                                executorService.awaitTermination(vvdVar.i.toNanos(), timeUnit);
                                executorService.shutdownNow();
                            } catch (Throwable th) {
                                executorService.shutdownNow();
                                throw th;
                            }
                        }
                        ExecutorService executorService2 = vvdVar.v;
                        if (executorService2 != null) {
                            vvdVar.v = null;
                            executorService2.shutdownNow();
                        }
                        ThreadPoolExecutor threadPoolExecutor = vvdVar.u;
                        if (threadPoolExecutor != null) {
                            vvdVar.u = null;
                            threadPoolExecutor.shutdownNow();
                        }
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = vvdVar.t;
                        if (scheduledThreadPoolExecutor != null) {
                            vvdVar.t = null;
                            scheduledThreadPoolExecutor.shutdownNow();
                        }
                    }
                    reentrantLock2.unlock();
                    this.h.lock();
                    try {
                        this.d = false;
                        this.i.signalAll();
                        return;
                    } finally {
                    }
                } catch (Throwable th2) {
                    reentrantLock2.unlock();
                    throw th2;
                }
            } finally {
            }
        } catch (Throwable th3) {
            throw th3;
        }
        throw th3;
    }

    public final void e0(Runnable runnable) {
        ExecutorService executorService = this.I;
        if (executorService != null) {
            try {
                executorService.execute(new gjc(2, this, runnable));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public final void f0(zj3 zj3Var, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            e0(new kdc(this, (i1) it.next(), zj3Var, currentTimeMillis, str));
        }
    }

    public final void g0(String str) {
        v5d v5dVar;
        ((AtomicLong) this.b.f).incrementAndGet();
        String a = dkk.a(str);
        this.E.set(a);
        this.D.set(a);
        if (T(str) && (v5dVar = this.l) != null) {
            this.o.put(v5dVar, str);
        }
        e0(new gjc(4, this, str));
    }

    public final void h() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = this.v;
        Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            ((Map.Entry) it.next()).getValue().getClass();
            pvd.j();
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                concurrentHashMap.remove((String) it2.next());
            }
        }
    }

    public final void i(boolean z) {
        long nanos;
        this.g.lock();
        try {
            this.h.lock();
            try {
                if (!a0()) {
                    this.d = true;
                    this.f = null;
                    boolean z2 = this.U == 2;
                    this.i.signalAll();
                    this.h.unlock();
                    j(true);
                    this.h.lock();
                    try {
                        Z0(1);
                        this.f = null;
                        this.d = false;
                        this.i.signalAll();
                        this.h.unlock();
                        if (this.e) {
                            close();
                        } else if (z2 && z) {
                            B0();
                        }
                    } finally {
                    }
                }
                Duration duration = this.a.i;
                ReentrantLock reentrantLock = this.h;
                reentrantLock.lock();
                if (duration != null) {
                    try {
                        nanos = duration.toNanos();
                    } finally {
                        reentrantLock.unlock();
                    }
                } else {
                    nanos = -1;
                }
                long nanoTime = System.nanoTime();
                while (nanos >= 0) {
                    this.h.lock();
                    try {
                        if (!(this.d && !isClosed())) {
                            break;
                        }
                        Condition condition = this.i;
                        if (nanos > 0) {
                            if (condition.await(nanos, TimeUnit.NANOSECONDS)) {
                                this.h.lock();
                                try {
                                    if (!(this.d && !isClosed())) {
                                    }
                                } finally {
                                }
                            }
                            long nanoTime2 = System.nanoTime();
                            nanos -= nanoTime2 - nanoTime;
                            if (nanos <= 0) {
                                break;
                            } else {
                                nanoTime = nanoTime2;
                            }
                        } else {
                            condition.await();
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        } finally {
            this.g.unlock();
        }
    }

    public final boolean isClosed() {
        return this.U == 3;
    }

    public final void j(boolean z) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        v5d v5dVar = this.l;
        if (v5dVar != null) {
            this.m = v5dVar;
        }
        this.l = null;
        q4d q4dVar = this.p;
        Future k = q4dVar.k(true);
        s4d s4dVar = this.q;
        Future c = s4dVar.c();
        try {
            k.get(1L, timeUnit);
        } catch (Exception unused) {
        }
        try {
            c.get(1L, timeUnit);
        } catch (Exception unused2) {
        }
        CompletableFuture completableFuture = this.j;
        if (completableFuture != null) {
            completableFuture.cancel(true);
            this.j = null;
        }
        try {
            soh sohVar = this.k;
            if (sohVar != null) {
                if (z) {
                    Socket socket = sohVar.d;
                    if (socket != null) {
                        try {
                            socket.setSoLinger(true, 0);
                        } catch (SocketException unused3) {
                        }
                        sohVar.b();
                    }
                } else {
                    sohVar.b();
                }
            }
        } catch (IOException e) {
            j0(e);
        }
        while (true) {
            Future future = (Future) this.w.poll();
            if (future == null) {
                break;
            } else {
                future.cancel(true);
            }
        }
        try {
            q4dVar.k(true).get(10L, timeUnit);
        } catch (Exception e2) {
            j0(e2);
        }
        try {
            s4dVar.c().get(10L, timeUnit);
        } catch (Exception e3) {
            j0(e3);
        }
    }

    public final void j0(Exception exc) {
        ((AtomicLong) this.b.g).incrementAndGet();
        e0(new gjc(3, this, exc));
    }

    public final void k() {
        AtomicReference atomicReference;
        vvd vvdVar = this.a;
        vvdVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = vvdVar.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((v5d) it.next()).a);
        }
        if (arrayList.isEmpty()) {
            a70.p("No servers provided in options");
            return;
        }
        boolean z = vvdVar.r;
        long nanoTime = System.nanoTime();
        v5d v5dVar = null;
        this.E.set(null);
        int i = 0;
        bij bijVar = this.R;
        bijVar.e("starting connect loop", new Object[0]);
        HashSet hashSet = new HashSet();
        Object obj = null;
        int i2 = 1;
        while (true) {
            atomicReference = this.D;
            if (i2 == 0) {
                break;
            }
            i5d i5dVar = this.O;
            ReentrantLock reentrantLock = (ReentrantLock) i5dVar.c;
            reentrantLock.lock();
            try {
                v5d v5dVar2 = ((ArrayList) i5dVar.d).isEmpty() ? v5dVar : ((p6h) ((ArrayList) i5dVar.d).get(i)).a;
                if (v5dVar2 == null) {
                    break;
                }
                if (obj != null) {
                    if (v5dVar2.equals(obj)) {
                        break;
                    }
                } else {
                    obj = v5dVar2;
                }
                i5dVar.e();
                Iterator it2 = E0(v5dVar2).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    v5d v5dVar3 = (v5d) it2.next();
                    if (isClosed()) {
                        i2 = i;
                        break;
                    }
                    atomicReference.set(v5dVar);
                    bijVar.e("setting status to connecting", new Object[i]);
                    a1(5, v5dVar3, v5dVar2);
                    bijVar.e("trying to connect to %s", v5dVar2);
                    X0(v5dVar2, v5dVar3, System.nanoTime());
                    if (Z()) {
                        i5dVar.d(v5dVar2);
                        i2 = 0;
                        break;
                    }
                    bijVar.e("setting status to disconnected", new Object[0]);
                    a1(1, v5dVar3, v5dVar2);
                    hashSet.add(v5dVar2);
                    i5dVar.c(v5dVar2);
                    String str = (String) atomicReference.get();
                    if (T(str)) {
                        this.o.put(v5dVar3, str);
                    }
                    v5dVar = null;
                    i = 0;
                }
                v5dVar = null;
                i = 0;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (Z() || isClosed()) {
            if (z) {
                bijVar.e("connect complete in %.3f seconds", Double.valueOf((System.nanoTime() - nanoTime) / 1.0E9d));
            }
        } else {
            bijVar.e("connection failed, closing to cleanup", new Object[0]);
            close();
            String str2 = (String) atomicReference.get();
            if (T(str2)) {
                throw new jz2(dmi.q("Authentication error connecting to NATS server: ", str2));
            }
            yhk.u(hashSet, "Unable to connect to NATS servers: ");
        }
    }

    public final x4d m() {
        if (isClosed()) {
            a70.r("Connection is Closed");
            return null;
        }
        if (this.F.get() != null) {
            a70.r("Connection is Draining");
            return null;
        }
        this.P.getClass();
        this.a.getClass();
        x4d x4dVar = new x4d(this);
        this.t.put(this.C.a(), x4dVar);
        AtomicBoolean atomicBoolean = x4dVar.k;
        if (!atomicBoolean.get()) {
            x4dVar.j.set(true);
            atomicBoolean.set(true);
            x4dVar.i = this.J.submit(x4dVar, Boolean.TRUE);
        }
        return x4dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if ((r4.a() != null ? ((java.util.concurrent.atomic.AtomicLong) r4.a().b).get() : 0) >= r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        ((java.util.concurrent.atomic.AtomicLong) r0.o).incrementAndGet();
        r4.d.incrementAndGet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
    
        if (r5.get() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008f, code lost:
    
        r5.set(true);
        e0(new defpackage.gjc(5, r12, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        if ((r4.a() != null ? ((java.util.concurrent.atomic.AtomicLong) r4.a().c).get() : 0) >= r6) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(i0a i0aVar) {
        this.A.set(false);
        long d = i0aVar.d();
        dx dxVar = this.b;
        ((AtomicLong) dxVar.m).incrementAndGet();
        ((AtomicLong) dxVar.d).addAndGet(d);
        u5d u5dVar = (u5d) this.s.get(i0aVar.e);
        if (u5dVar != null) {
            i0aVar.k = u5dVar;
            x4d x4dVar = u5dVar.j;
            u5d u5dVar2 = x4dVar == 0 ? u5dVar : x4dVar;
            AtomicBoolean atomicBoolean = u5dVar2.f;
            bo3 bo3Var = x4dVar == 0 ? u5dVar.k : x4dVar.h;
            long j = u5dVar2.b.get();
            if (j > 0) {
            }
            long j2 = u5dVar2.c.get();
            if (j2 > 0) {
            }
            if (bo3Var != null) {
                atomicBoolean.set(false);
                if (((Boolean) u5dVar.m.apply(i0aVar)).booleanValue() && ((LinkedBlockingQueue) bo3Var.a).offer(i0aVar)) {
                    ((AtomicLong) bo3Var.b).incrementAndGet();
                    ((AtomicLong) bo3Var.c).addAndGet(i0aVar.d());
                }
            }
        }
    }

    public final void n0(String str, byte[] bArr) {
        h5d h5dVar = new h5d(this.S.p(str, true), this.T.p(null, false), bArr);
        if (h5dVar.n && !((o6h) this.r.get()).g) {
            zzl.i(((o6h) this.r.get()).c, "Headers are not supported by the server, version: ");
            return;
        }
        if (isClosed()) {
            a70.r("Connection is Closed");
            return;
        }
        if (this.G.get()) {
            a70.r("Connection is Draining");
            return;
        }
        if (this.U == 4 || this.U == 1) {
            s4d s4dVar = this.q;
            s4dVar.getClass();
            if (h5dVar.d() + ((AtomicLong) s4dVar.k.c).get() >= 8388608) {
                this.a.getClass();
                a70.r("Unable to queue any more messages during reconnect, max buffer is 8388608");
                return;
            }
        }
        u0(h5dVar);
    }

    public final void p(dm8 dm8Var) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        dm8Var.getClass();
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            Z0(1);
            CompletableFuture completableFuture = this.j;
            if (completableFuture != null) {
                completableFuture.cancel(true);
                this.j = null;
            }
            soh sohVar = this.k;
            if (sohVar != null) {
                this.k = null;
                this.J.submit(new gjc(6, dm8Var, sohVar));
            }
            try {
                this.p.k(false).get(100L, timeUnit);
            } catch (Exception e) {
                j0(e);
            }
            try {
                this.q.c().get(100L, timeUnit);
            } catch (Exception e2) {
                j0(e2);
            }
            reentrantLock.unlock();
            B0();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void r0(sff sffVar) {
        c1(sffVar);
        s4d s4dVar = this.q;
        if (s4dVar.g.get() == r4d.b) {
            s4dVar.l.e(sffVar, false);
        } else {
            s4dVar.k.e(sffVar, true);
        }
    }

    public final void t(Exception exc) {
        this.h.lock();
        try {
            if (!this.c && !this.d && this.U != 3) {
                int i = 0;
                if (!(this.F.get() != null)) {
                    this.h.unlock();
                    j0(exc);
                    v5d v5dVar = this.l;
                    if (v5dVar != null) {
                        this.O.c(v5dVar);
                    }
                    this.J.submit(new n4d(this, i));
                    return;
                }
            }
            this.f = exc;
        } finally {
            this.h.unlock();
        }
    }

    public final void u0(h5d h5dVar) {
        c1(h5dVar);
        if (this.q.k.e(h5dVar, false)) {
            return;
        }
        e0(new gjc(1, this, h5dVar));
    }
}
