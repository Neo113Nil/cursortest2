package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.thrid.okhttp.internal.http2.h;
import defpackage.ogj;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g implements Closeable {
    static final /* synthetic */ boolean A = true;
    private static final ExecutorService z = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Http2Connection", true));
    final boolean a;
    final j b;
    final String d;
    int e;
    int f;
    private boolean g;
    private final ScheduledExecutorService h;
    private final ExecutorService i;
    final com.mbridge.msdk.thrid.okhttp.internal.http2.l j;
    long s;
    final m u;
    final Socket v;
    final com.mbridge.msdk.thrid.okhttp.internal.http2.j w;
    final l x;
    final Set<Integer> y;
    final Map<Integer, com.mbridge.msdk.thrid.okhttp.internal.http2.i> c = new LinkedHashMap();
    private long k = 0;
    private long l = 0;
    private long m = 0;
    private long n = 0;
    private long o = 0;
    private long p = 0;
    private long q = 0;
    long r = 0;
    m t = new m();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a extends com.mbridge.msdk.thrid.okhttp.internal.b {
        final /* synthetic */ int b;
        final /* synthetic */ com.mbridge.msdk.thrid.okhttp.internal.http2.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, int i, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
            super(str, objArr);
            this.b = i;
            this.c = bVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            try {
                g.this.b(this.b, this.c);
            } catch (IOException unused) {
                g.this.h();
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b extends com.mbridge.msdk.thrid.okhttp.internal.b {
        final /* synthetic */ int b;
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.b = i;
            this.c = j;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            try {
                g.this.w.a(this.b, this.c);
            } catch (IOException unused) {
                g.this.h();
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class c extends com.mbridge.msdk.thrid.okhttp.internal.b {
        public c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            g.this.a(false, 2, 0);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class d extends com.mbridge.msdk.thrid.okhttp.internal.b {
        final /* synthetic */ int b;
        final /* synthetic */ List c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.b = i;
            this.c = list;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            if (g.this.j.a(this.b, this.c)) {
                try {
                    g.this.w.a(this.b, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                    synchronized (g.this) {
                        g.this.y.remove(Integer.valueOf(this.b));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class e extends com.mbridge.msdk.thrid.okhttp.internal.b {
        final /* synthetic */ int b;
        final /* synthetic */ List c;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            this.b = i;
            this.c = list;
            this.d = z;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            boolean a = g.this.j.a(this.b, this.c, this.d);
            if (a) {
                try {
                    g.this.w.a(this.b, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (a || this.d) {
                synchronized (g.this) {
                    g.this.y.remove(Integer.valueOf(this.b));
                }
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class f extends com.mbridge.msdk.thrid.okhttp.internal.b {
        final /* synthetic */ int b;
        final /* synthetic */ com.mbridge.msdk.thrid.okio.c c;
        final /* synthetic */ int d;
        final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Object[] objArr, int i, com.mbridge.msdk.thrid.okio.c cVar, int i2, boolean z) {
            super(str, objArr);
            this.b = i;
            this.c = cVar;
            this.d = i2;
            this.e = z;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            try {
                boolean a = g.this.j.a(this.b, this.c, this.d, this.e);
                if (a) {
                    g.this.w.a(this.b, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                }
                if (a || this.e) {
                    synchronized (g.this) {
                        g.this.y.remove(Integer.valueOf(this.b));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.g$g, reason: collision with other inner class name */
    public class C1316g extends com.mbridge.msdk.thrid.okhttp.internal.b {
        final /* synthetic */ int b;
        final /* synthetic */ com.mbridge.msdk.thrid.okhttp.internal.http2.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1316g(String str, Object[] objArr, int i, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
            super(str, objArr);
            this.b = i;
            this.c = bVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            g.this.j.a(this.b, this.c);
            synchronized (g.this) {
                g.this.y.remove(Integer.valueOf(this.b));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class i extends com.mbridge.msdk.thrid.okhttp.internal.b {
        public i() {
            super("OkHttp %s ping", g.this.d);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            boolean z;
            synchronized (g.this) {
                if (g.this.l < g.this.k) {
                    z = true;
                } else {
                    g.e(g.this);
                    z = false;
                }
            }
            g gVar = g.this;
            if (z) {
                gVar.h();
            } else {
                gVar.a(false, 1, 0);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class k extends com.mbridge.msdk.thrid.okhttp.internal.b {
        final boolean b;
        final int c;
        final int d;

        public k(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", g.this.d, Integer.valueOf(i), Integer.valueOf(i2));
            this.b = z;
            this.c = i;
            this.d = i2;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            g.this.a(this.b, this.c, this.d);
        }
    }

    public g(h hVar) {
        m mVar = new m();
        this.u = mVar;
        this.y = new LinkedHashSet();
        this.j = hVar.f;
        boolean z2 = hVar.g;
        this.a = z2;
        this.b = hVar.e;
        int i2 = z2 ? 1 : 2;
        this.f = i2;
        if (z2) {
            this.f = i2 + 2;
        }
        if (z2) {
            this.t.a(7, C.DEFAULT_MUXED_BUFFER_SIZE);
        }
        String str = hVar.b;
        this.d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, com.mbridge.msdk.thrid.okhttp.internal.c.a(com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp %s Writer", str), false));
        this.h = scheduledThreadPoolExecutor;
        if (hVar.h != 0) {
            i iVar = new i();
            long j2 = hVar.h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, j2, j2, TimeUnit.MILLISECONDS);
        }
        this.i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a(com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp %s Push Observer", str), true));
        mVar.a(7, 65535);
        mVar.a(5, 16384);
        this.s = mVar.c();
        this.v = hVar.a;
        this.w = new com.mbridge.msdk.thrid.okhttp.internal.http2.j(hVar.d, z2);
        this.x = new l(new com.mbridge.msdk.thrid.okhttp.internal.http2.h(hVar.c, z2));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0047 A[Catch: all -> 0x003d, TryCatch #3 {all -> 0x003d, blocks: (B:13:0x0027, B:15:0x002c, B:17:0x0034, B:21:0x0041, B:23:0x0047, B:24:0x0050, B:47:0x0080, B:40:0x007a, B:41:0x007f), top: B:3:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.mbridge.msdk.thrid.okhttp.internal.http2.i a(int i2, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list, boolean z2) throws IOException {
        Throwable th;
        g gVar;
        int i3;
        com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar;
        boolean z3;
        boolean z4 = !z2;
        synchronized (this.w) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.f > 1073741823) {
                                try {
                                    a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
                                } catch (Throwable th2) {
                                    th = th2;
                                    gVar = this;
                                    throw th;
                                }
                            }
                            if (this.g) {
                                throw new com.mbridge.msdk.thrid.okhttp.internal.http2.a();
                            }
                            i3 = this.f;
                            this.f = i3 + 2;
                            iVar = new com.mbridge.msdk.thrid.okhttp.internal.http2.i(i3, this, z4, false, null);
                            if (z2 && this.s != 0 && iVar.b != 0) {
                                z3 = false;
                                if (iVar.g()) {
                                    this.c.put(Integer.valueOf(i3), iVar);
                                }
                            }
                            z3 = true;
                            if (iVar.g()) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            gVar = this;
                            th = th;
                            throw th;
                        }
                    }
                    if (i2 == 0) {
                        this.w.a(z4, i3, i2, list);
                    } else {
                        if (this.a) {
                            throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                        }
                        this.w.a(i2, i3, list);
                    }
                } finally {
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        if (z3) {
            this.w.flush();
        }
        return iVar;
    }

    public static /* synthetic */ long e(g gVar) {
        long j2 = gVar.k;
        gVar.k = 1 + j2;
        return j2;
    }

    public static /* synthetic */ long h(g gVar) {
        long j2 = gVar.n;
        gVar.n = 1 + j2;
        return j2;
    }

    public static /* synthetic */ long i(g gVar) {
        long j2 = gVar.p;
        gVar.p = 1 + j2;
        return j2;
    }

    public void b(int i2, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list, boolean z2) {
        try {
            a(new e("OkHttp %s Push Headers[%s]", new Object[]{this.d, Integer.valueOf(i2)}, i2, list, z2));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void c(int i2, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        try {
            this.h.execute(new a("OkHttp %s stream %d", new Object[]{this.d, Integer.valueOf(i2)}, i2, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.NO_ERROR, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
    }

    public synchronized boolean f(long j2) {
        if (this.g) {
            return false;
        }
        if (this.n < this.m) {
            if (j2 >= this.q) {
                return false;
            }
        }
        return true;
    }

    public void flush() throws IOException {
        this.w.flush();
    }

    public synchronized void g(long j2) {
        long j3 = this.r + j2;
        this.r = j3;
        if (j3 >= this.t.c() / 2) {
            a(0, this.r);
            this.r = 0L;
        }
    }

    public synchronized int k() {
        return this.u.b(Integer.MAX_VALUE);
    }

    public void l() {
        synchronized (this) {
            try {
                long j2 = this.n;
                long j3 = this.m;
                if (j2 < j3) {
                    return;
                }
                this.m = j3 + 1;
                this.q = System.nanoTime() + 1000000000;
                try {
                    this.h.execute(new c("OkHttp %s ping", this.d));
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m() throws IOException {
        a(true);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class h {
        Socket a;
        String b;
        com.mbridge.msdk.thrid.okio.e c;
        com.mbridge.msdk.thrid.okio.d d;
        j e = j.a;
        com.mbridge.msdk.thrid.okhttp.internal.http2.l f = com.mbridge.msdk.thrid.okhttp.internal.http2.l.a;
        boolean g;
        int h;

        public h(boolean z) {
            this.g = z;
        }

        public h a(Socket socket, String str, com.mbridge.msdk.thrid.okio.e eVar, com.mbridge.msdk.thrid.okio.d dVar) {
            this.a = socket;
            this.b = str;
            this.c = eVar;
            this.d = dVar;
            return this;
        }

        public h a(j jVar) {
            this.e = jVar;
            return this;
        }

        public h a(int i) {
            this.h = i;
            return this;
        }

        public g a() {
            return new g(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        try {
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar = com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR;
            a(bVar, bVar);
        } catch (IOException unused) {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class j {
        public static final j a = new a();

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static class a extends j {
            @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.g.j
            public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) throws IOException {
                iVar.a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
            }
        }

        public abstract void a(com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) throws IOException;

        public void a(g gVar) {
        }
    }

    public void b(int i2, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) throws IOException {
        this.w.a(i2, bVar);
    }

    public synchronized com.mbridge.msdk.thrid.okhttp.internal.http2.i c(int i2) {
        com.mbridge.msdk.thrid.okhttp.internal.http2.i remove;
        remove = this.c.remove(Integer.valueOf(i2));
        notifyAll();
        return remove;
    }

    public boolean b(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public static /* synthetic */ long c(g gVar) {
        long j2 = gVar.l;
        gVar.l = 1 + j2;
        return j2;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class l extends com.mbridge.msdk.thrid.okhttp.internal.b implements h.b {
        final com.mbridge.msdk.thrid.okhttp.internal.http2.h b;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public class a extends com.mbridge.msdk.thrid.okhttp.internal.b {
            final /* synthetic */ com.mbridge.msdk.thrid.okhttp.internal.http2.i b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Object[] objArr, com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) {
                super(str, objArr);
                this.b = iVar;
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.b
            public void b() {
                try {
                    g.this.b.a(this.b);
                } catch (IOException e) {
                    com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(4, "Http2Connection.Listener failure for " + g.this.d, e);
                    try {
                        this.b.a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public class b extends com.mbridge.msdk.thrid.okhttp.internal.b {
            final /* synthetic */ boolean b;
            final /* synthetic */ m c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object[] objArr, boolean z, m mVar) {
                super(str, objArr);
                this.b = z;
                this.c = mVar;
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.b
            public void b() {
                l.this.b(this.b, this.c);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public class c extends com.mbridge.msdk.thrid.okhttp.internal.b {
            public c(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.b
            public void b() {
                g gVar = g.this;
                gVar.b.a(gVar);
            }
        }

        public l(com.mbridge.msdk.thrid.okhttp.internal.http2.h hVar) {
            super("OkHttp %s", g.this.d);
            this.b = hVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z, int i, int i2, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) {
            boolean b2 = g.this.b(i);
            g gVar = g.this;
            if (b2) {
                gVar.b(i, list, z);
                return;
            }
            synchronized (gVar) {
                try {
                    com.mbridge.msdk.thrid.okhttp.internal.http2.i a2 = g.this.a(i);
                    if (a2 != null) {
                        a2.a(list);
                        if (z) {
                            a2.i();
                            return;
                        }
                        return;
                    }
                    if (g.this.g) {
                        return;
                    }
                    g gVar2 = g.this;
                    if (i <= gVar2.e) {
                        return;
                    }
                    if (i % 2 == gVar2.f % 2) {
                        return;
                    }
                    com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar = new com.mbridge.msdk.thrid.okhttp.internal.http2.i(i, g.this, false, z, com.mbridge.msdk.thrid.okhttp.internal.c.b(list));
                    g gVar3 = g.this;
                    gVar3.e = i;
                    gVar3.c.put(Integer.valueOf(i), iVar);
                    g.z.execute(new a("OkHttp %s stream %d", new Object[]{g.this.d, Integer.valueOf(i)}, iVar));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void b(boolean z, m mVar) {
            com.mbridge.msdk.thrid.okhttp.internal.http2.i[] iVarArr;
            long j;
            synchronized (g.this.w) {
                synchronized (g.this) {
                    try {
                        int c2 = g.this.u.c();
                        if (z) {
                            g.this.u.a();
                        }
                        g.this.u.a(mVar);
                        int c3 = g.this.u.c();
                        iVarArr = null;
                        if (c3 == -1 || c3 == c2) {
                            j = 0;
                        } else {
                            j = c3 - c2;
                            if (!g.this.c.isEmpty()) {
                                iVarArr = (com.mbridge.msdk.thrid.okhttp.internal.http2.i[]) g.this.c.values().toArray(new com.mbridge.msdk.thrid.okhttp.internal.http2.i[g.this.c.size()]);
                            }
                        }
                    } finally {
                    }
                }
                try {
                    g gVar = g.this;
                    gVar.w.a(gVar.u);
                } catch (IOException unused) {
                    g.this.h();
                }
            }
            if (iVarArr != null) {
                for (com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(j);
                    }
                }
            }
            g.z.execute(new c("OkHttp %s settings", g.this.d));
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i, int i2, int i3, boolean z) {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z, int i, com.mbridge.msdk.thrid.okio.e eVar, int i2) throws IOException {
            boolean b2 = g.this.b(i);
            g gVar = g.this;
            if (b2) {
                gVar.a(i, eVar, i2, z);
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.http2.i a2 = gVar.a(i);
            if (a2 == null) {
                g.this.c(i, com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR);
                long j = i2;
                g.this.g(j);
                eVar.skip(j);
                return;
            }
            a2.a(eVar, i2);
            if (z) {
                a2.i();
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a() {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
            boolean b2 = g.this.b(i);
            g gVar = g.this;
            if (b2) {
                gVar.a(i, bVar);
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.http2.i c2 = gVar.c(i);
            if (c2 != null) {
                c2.d(bVar);
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z, m mVar) {
            try {
                g.this.h.execute(new b("OkHttp %s ACK Settings", new Object[]{g.this.d}, z, mVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z, int i, int i2) {
            g gVar = g.this;
            if (!z) {
                try {
                    gVar.h.execute(g.this.new k(true, i, i2));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (gVar) {
                try {
                    if (i == 1) {
                        g.c(g.this);
                    } else if (i == 2) {
                        g.h(g.this);
                    } else if (i == 3) {
                        g.i(g.this);
                        g.this.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar, com.mbridge.msdk.thrid.okio.f fVar) {
            com.mbridge.msdk.thrid.okhttp.internal.http2.i[] iVarArr;
            fVar.j();
            synchronized (g.this) {
                iVarArr = (com.mbridge.msdk.thrid.okhttp.internal.http2.i[]) g.this.c.values().toArray(new com.mbridge.msdk.thrid.okhttp.internal.http2.i[g.this.c.size()]);
                g.this.g = true;
            }
            for (com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar : iVarArr) {
                if (iVar.c() > i && iVar.f()) {
                    iVar.d(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
                    g.this.c(iVar.c());
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            Throwable th;
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar;
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar2 = com.mbridge.msdk.thrid.okhttp.internal.http2.b.INTERNAL_ERROR;
            try {
                try {
                    this.b.a(this);
                    while (this.b.a(false, (h.b) this)) {
                    }
                    bVar = com.mbridge.msdk.thrid.okhttp.internal.http2.b.NO_ERROR;
                    try {
                        try {
                            g.this.a(bVar, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                        } catch (IOException unused) {
                            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar3 = com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR;
                            g.this.a(bVar3, bVar3);
                            com.mbridge.msdk.thrid.okhttp.internal.c.a(this.b);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            g.this.a(bVar, bVar2);
                        } catch (IOException unused2) {
                        }
                        com.mbridge.msdk.thrid.okhttp.internal.c.a(this.b);
                        throw th;
                    }
                } catch (IOException unused3) {
                }
            } catch (IOException unused4) {
                bVar = bVar2;
            } catch (Throwable th3) {
                th = th3;
                bVar = bVar2;
                g.this.a(bVar, bVar2);
                com.mbridge.msdk.thrid.okhttp.internal.c.a(this.b);
                throw th;
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(this.b);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i, long j) {
            g gVar = g.this;
            if (i == 0) {
                synchronized (gVar) {
                    g gVar2 = g.this;
                    gVar2.s += j;
                    gVar2.notifyAll();
                }
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.http2.i a2 = gVar.a(i);
            if (a2 != null) {
                synchronized (a2) {
                    a2.a(j);
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i, int i2, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) {
            g.this.a(i2, list);
        }
    }

    public synchronized com.mbridge.msdk.thrid.okhttp.internal.http2.i a(int i2) {
        return this.c.get(Integer.valueOf(i2));
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http2.i a(List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list, boolean z2) throws IOException {
        return a(0, list, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.w.h());
        r6 = r2;
        r8.s -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i2, boolean z2, com.mbridge.msdk.thrid.okio.c cVar, long j2) throws IOException {
        int min;
        long j3;
        if (j2 == 0) {
            this.w.a(z2, i2, cVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j4 = this.s;
                            if (j4 > 0) {
                                break;
                            } else if (this.c.containsKey(Integer.valueOf(i2))) {
                                wait();
                            } else {
                                throw new IOException("stream closed");
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j2 -= j3;
            this.w.a(z2 && j2 == 0, i2, cVar, min);
        }
    }

    public void a(int i2, long j2) {
        try {
            this.h.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.d, Integer.valueOf(i2)}, i2, j2));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void a(boolean z2, int i2, int i3) {
        try {
            this.w.a(z2, i2, i3);
        } catch (IOException unused) {
            h();
        }
    }

    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) throws IOException {
        synchronized (this.w) {
            synchronized (this) {
                if (this.g) {
                    return;
                }
                this.g = true;
                this.w.a(this.e, bVar, com.mbridge.msdk.thrid.okhttp.internal.c.a);
            }
        }
    }

    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar2) throws IOException {
        if (!A && Thread.holdsLock(this)) {
            ogj.b();
            return;
        }
        com.mbridge.msdk.thrid.okhttp.internal.http2.i[] iVarArr = null;
        try {
            a(bVar);
            e = null;
        } catch (IOException e2) {
            e = e2;
        }
        synchronized (this) {
            try {
                if (!this.c.isEmpty()) {
                    iVarArr = (com.mbridge.msdk.thrid.okhttp.internal.http2.i[]) this.c.values().toArray(new com.mbridge.msdk.thrid.okhttp.internal.http2.i[this.c.size()]);
                    this.c.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iVarArr != null) {
            for (com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar : iVarArr) {
                try {
                    iVar.a(bVar2);
                } catch (IOException e3) {
                    if (e != null) {
                        e = e3;
                    }
                }
            }
        }
        try {
            this.w.close();
        } catch (IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.v.close();
        } catch (IOException e5) {
            e = e5;
        }
        this.h.shutdown();
        this.i.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public void a(boolean z2) throws IOException {
        if (z2) {
            this.w.d();
            this.w.b(this.t);
            if (this.t.c() != 65535) {
                this.w.a(0, r5 - 65535);
            }
        }
        new Thread(this.x).start();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:26:0x003f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public void a(int r9, java.util.List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.Set<java.lang.Integer> r0 = r8.y     // Catch: java.lang.Throwable -> L3a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L18
            com.mbridge.msdk.thrid.okhttp.internal.http2.b r10 = com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L14
            r8.c(r9, r10)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r0 = move-exception
            r9 = r0
            r3 = r8
            goto L3d
        L18:
            java.util.Set<java.lang.Integer> r0 = r8.y     // Catch: java.lang.Throwable -> L3a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3a
            r0.add(r1)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3a
            com.mbridge.msdk.thrid.okhttp.internal.http2.g$d r2 = new com.mbridge.msdk.thrid.okhttp.internal.http2.g$d     // Catch: java.util.concurrent.RejectedExecutionException -> L39
            java.lang.String r4 = "OkHttp %s Push Request[%s]"
            java.lang.String r0 = r8.d     // Catch: java.util.concurrent.RejectedExecutionException -> L39
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L39
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r1}     // Catch: java.util.concurrent.RejectedExecutionException -> L39
            r3 = r8
            r6 = r9
            r7 = r10
            r2.<init>(r4, r5, r6, r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L39
            r3.a(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L39
        L39:
            return
        L3a:
            r0 = move-exception
            r3 = r8
        L3c:
            r9 = r0
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
            throw r9
        L3f:
            r0 = move-exception
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.g.a(int, java.util.List):void");
    }

    public void a(int i2, com.mbridge.msdk.thrid.okio.e eVar, int i3, boolean z2) throws IOException {
        com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
        long j2 = i3;
        eVar.e(j2);
        eVar.b(cVar, j2);
        if (cVar.size() == j2) {
            a(new f("OkHttp %s Push Data[%s]", new Object[]{this.d, Integer.valueOf(i2)}, i2, cVar, i3, z2));
            return;
        }
        throw new IOException(cVar.size() + " != " + i3);
    }

    public void a(int i2, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        a(new C1316g("OkHttp %s Push Reset[%s]", new Object[]{this.d, Integer.valueOf(i2)}, i2, bVar));
    }

    private synchronized void a(com.mbridge.msdk.thrid.okhttp.internal.b bVar) {
        if (!this.g) {
            this.i.execute(bVar);
        }
    }
}
