package androidx.media3.datasource.cache;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.a;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSink;
import androidx.media3.datasource.f;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import xsna.cij;
import xsna.dij;
import xsna.evk;
import xsna.fxc0;
import xsna.mjp0;
import xsna.qx8;
import xsna.ubd0;
import xsna.wuk;
import xsna.x7o0;
import xsna.xva0;
import xsna.xw8;
import xsna.y2r0;

/* compiled from: CacheDataSource.java */
/* loaded from: classes12.dex */
public final class a implements androidx.media3.datasource.a {
    public final Cache a;
    public final androidx.media3.datasource.a b;

    @Nullable
    public final x7o0 c;
    public final androidx.media3.datasource.a d;
    public final xw8 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    @Nullable
    public Uri i;

    @Nullable
    public evk j;

    @Nullable
    public evk k;

    @Nullable
    public androidx.media3.datasource.a l;
    public long m;
    public long n;
    public long o;

    @Nullable
    public qx8 p;
    public boolean q;
    public boolean r;
    public long s;
    public long t;

    /* compiled from: CacheDataSource.java */
    /* renamed from: androidx.media3.datasource.cache.a$a, reason: collision with other inner class name */
    public interface InterfaceC0046a {
        void onCachedBytesRead(long j, long j2);
    }

    /* compiled from: CacheDataSource.java */
    /* loaded from: classes.dex */
    public static final class b implements a.InterfaceC0045a {
        public Cache a;

        @Nullable
        public wuk.a b;
        public xw8 c = xw8.f7;
        public boolean d;

        @Nullable
        public a.InterfaceC0045a e;

        @Nullable
        public PriorityTaskManager f;
        public int g;
        public int h;

        @Override // androidx.media3.datasource.a.InterfaceC0045a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createDataSource() {
            a.InterfaceC0045a interfaceC0045a = this.e;
            return c(interfaceC0045a != null ? interfaceC0045a.createDataSource() : null, this.h, this.g);
        }

        public final a b() {
            a.InterfaceC0045a interfaceC0045a = this.e;
            return c(interfaceC0045a != null ? interfaceC0045a.createDataSource() : null, this.h | 1, -4000);
        }

        public final a c(@Nullable androidx.media3.datasource.a aVar, int i, int i2) {
            CacheDataSink cacheDataSink;
            Cache cache = this.a;
            cache.getClass();
            if (this.d || aVar == null) {
                cacheDataSink = null;
            } else {
                wuk.a aVar2 = this.b;
                if (aVar2 != null) {
                    cacheDataSink = aVar2.createDataSink();
                } else {
                    CacheDataSink.a aVar3 = new CacheDataSink.a();
                    aVar3.a(cache);
                    cacheDataSink = aVar3.createDataSink();
                }
            }
            return new a(cache, aVar, new FileDataSource(), cacheDataSink, this.c, i, this.f, i2, null);
        }

        public final void d(@Nullable CacheDataSink.a aVar) {
            this.b = aVar;
            this.d = aVar == null;
        }
    }

    public a(Cache cache, androidx.media3.datasource.a aVar, androidx.media3.datasource.a aVar2, wuk wukVar, xw8 xw8Var, int i, PriorityTaskManager priorityTaskManager, int i2, xva0 xva0Var) {
        this.a = cache;
        this.b = aVar2;
        this.e = xw8Var == null ? xw8.f7 : xw8Var;
        this.f = (i & 1) != 0;
        this.g = (i & 2) != 0;
        this.h = (i & 4) != 0;
        if (aVar == null) {
            this.d = f.a;
            this.c = null;
        } else {
            aVar = priorityTaskManager != null ? new ubd0(aVar, priorityTaskManager, i2) : aVar;
            this.d = aVar;
            this.c = wukVar != null ? new x7o0(aVar, wukVar) : null;
        }
    }

    @Override // androidx.media3.datasource.a
    public final void addTransferListener(mjp0 mjp0Var) {
        mjp0Var.getClass();
        this.b.addTransferListener(mjp0Var);
        this.d.addTransferListener(mjp0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() throws IOException {
        Cache cache = this.a;
        androidx.media3.datasource.a aVar = this.l;
        if (aVar == null) {
            return;
        }
        try {
            aVar.close();
        } finally {
            this.k = null;
            this.l = null;
            qx8 qx8Var = this.p;
            if (qx8Var != null) {
                cache.d(qx8Var);
                this.p = null;
            }
        }
    }

    public final Cache c() {
        return this.a;
    }

    @Override // androidx.media3.datasource.a
    public final void close() throws IOException {
        this.j = null;
        this.i = null;
        this.n = 0L;
        try {
            b();
        } catch (Throwable th) {
            if (this.l == this.b || (th instanceof Cache.CacheException)) {
                this.q = true;
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.media3.datasource.a] */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.media3.datasource.a] */
    public final void d(evk evkVar, boolean z) throws IOException {
        qx8 a;
        x7o0 x7o0Var;
        x7o0 x7o0Var2;
        long j;
        evk a2;
        x7o0 x7o0Var3;
        String str = evkVar.i;
        String str2 = y2r0.a;
        boolean z2 = this.r;
        Cache cache = this.a;
        if (z2) {
            a = null;
        } else if (this.f) {
            try {
                a = cache.a(this.n, this.o, str);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            a = cache.g(this.n, this.o, str);
        }
        x7o0 x7o0Var4 = this.c;
        ?? r5 = this.b;
        ?? r6 = this.d;
        if (a == null) {
            evk.a a3 = evkVar.a();
            a3.f = this.n;
            a3.g = this.o;
            a2 = a3.a();
            x7o0Var = x7o0Var4;
            x7o0Var2 = r5;
            x7o0Var3 = r6;
            j = -1;
        } else {
            long j2 = a.d;
            if (a.e) {
                Uri fromFile = Uri.fromFile(a.f);
                long j3 = a.c;
                j = -1;
                long j4 = this.n - j3;
                long j5 = j2 - j4;
                x7o0Var = x7o0Var4;
                x7o0Var2 = r5;
                long j6 = this.o;
                if (j6 != -1) {
                    j5 = Math.min(j5, j6);
                }
                evk.a a4 = evkVar.a();
                a4.a = fromFile;
                a4.b = j3;
                a4.f = j4;
                a4.g = j5;
                a2 = a4.a();
                x7o0Var3 = x7o0Var2;
            } else {
                x7o0Var = x7o0Var4;
                x7o0Var2 = r5;
                j = -1;
                if (j2 == -1) {
                    j2 = this.o;
                } else {
                    long j7 = this.o;
                    if (j7 != -1) {
                        j2 = Math.min(j2, j7);
                    }
                }
                evk.a a5 = evkVar.a();
                a5.f = this.n;
                a5.g = j2;
                a2 = a5.a();
                if (x7o0Var != null) {
                    x7o0Var3 = x7o0Var;
                } else {
                    cache.d(a);
                    x7o0Var3 = r6;
                    a = null;
                }
            }
        }
        this.t = (this.r || x7o0Var3 != r6) ? Long.MAX_VALUE : this.n + 102400;
        if (z) {
            fxc0.z(this.l == r6);
            if (x7o0Var3 == r6) {
                return;
            }
            try {
                b();
            } catch (Throwable th) {
                if (!a.e) {
                    cache.d(a);
                }
                throw th;
            }
        }
        if (a != null && !a.e) {
            this.p = a;
        }
        this.l = x7o0Var3;
        this.k = a2;
        this.m = 0L;
        long open = x7o0Var3.open(a2);
        dij dijVar = new dij();
        if (a2.h == j && open != j) {
            this.o = open;
            dijVar.a(Long.valueOf(this.n + open), "exo_len");
        }
        if (!(this.l == x7o0Var2)) {
            Uri uri = x7o0Var3.getUri();
            this.i = uri;
            Uri uri2 = !evkVar.a.equals(uri) ? this.i : null;
            if (uri2 == null) {
                dijVar.b.add("exo_redir");
                dijVar.a.remove("exo_redir");
            } else {
                dijVar.a(uri2.toString(), "exo_redir");
            }
        }
        if (this.l == x7o0Var) {
            cache.f(str, dijVar);
        }
    }

    @Override // androidx.media3.datasource.a
    public final Map<String, List<String>> getResponseHeaders() {
        return !(this.l == this.b) ? this.d.getResponseHeaders() : Collections.EMPTY_MAP;
    }

    @Override // androidx.media3.datasource.a
    @Nullable
    public final Uri getUri() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:3:0x0003, B:6:0x0026, B:8:0x0031, B:12:0x0041, B:14:0x0047, B:17:0x0070, B:20:0x007c, B:21:0x0078, B:22:0x007e, B:29:0x008e, B:31:0x0088, B:32:0x004c, B:34:0x005c, B:37:0x0064, B:38:0x006b, B:39:0x0036), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:3:0x0003, B:6:0x0026, B:8:0x0031, B:12:0x0041, B:14:0x0047, B:17:0x0070, B:20:0x007c, B:21:0x0078, B:22:0x007e, B:29:0x008e, B:31:0x0088, B:32:0x004c, B:34:0x005c, B:37:0x0064, B:38:0x006b, B:39:0x0036), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #0 {all -> 0x004a, blocks: (B:3:0x0003, B:6:0x0026, B:8:0x0031, B:12:0x0041, B:14:0x0047, B:17:0x0070, B:20:0x007c, B:21:0x0078, B:22:0x007e, B:29:0x008e, B:31:0x0088, B:32:0x004c, B:34:0x005c, B:37:0x0064, B:38:0x006b, B:39:0x0036), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:3:0x0003, B:6:0x0026, B:8:0x0031, B:12:0x0041, B:14:0x0047, B:17:0x0070, B:20:0x007c, B:21:0x0078, B:22:0x007e, B:29:0x008e, B:31:0x0088, B:32:0x004c, B:34:0x005c, B:37:0x0064, B:38:0x006b, B:39:0x0036), top: B:2:0x0003 }] */
    @Override // androidx.media3.datasource.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long open(evk evkVar) throws IOException {
        boolean z;
        long j;
        Cache cache = this.a;
        try {
            String k = this.e.k(evkVar);
            evk.a a = evkVar.a();
            long j2 = evkVar.g;
            long j3 = evkVar.h;
            a.h = k;
            evk a2 = a.a();
            this.j = a2;
            Uri uri = a2.a;
            Uri a3 = cij.a(cache.getContentMetadata(k));
            if (a3 != null) {
                uri = a3;
            }
            this.i = uri;
            this.n = j2;
            if ((!this.g || !this.q) && (!this.h || j3 != -1)) {
                z = false;
                this.r = z;
                if (z) {
                    long j4 = cache.getContentMetadata(k).get("exo_len");
                    this.o = j4;
                    if (j4 != -1) {
                        long j5 = j4 - j2;
                        this.o = j5;
                        if (j5 < 0) {
                            throw new DataSourceException(2008);
                        }
                    }
                } else {
                    this.o = -1L;
                }
                if (j3 != -1) {
                    long j6 = this.o;
                    this.o = j6 == -1 ? j3 : Math.min(j6, j3);
                }
                j = this.o;
                if (j <= 0 || j == -1) {
                    d(a2, false);
                }
                return j3 == -1 ? j3 : this.o;
            }
            z = true;
            this.r = z;
            if (z) {
            }
            if (j3 != -1) {
            }
            j = this.o;
            if (j <= 0) {
            }
            d(a2, false);
            if (j3 == -1) {
            }
        } catch (Throwable th) {
            if (this.l == this.b || (th instanceof Cache.CacheException)) {
                this.q = true;
            }
            throw th;
        }
    }

    @Override // xsna.suk
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j;
        androidx.media3.datasource.a aVar = this.b;
        if (i2 == 0) {
            return 0;
        }
        if (this.o == 0) {
            return -1;
        }
        evk evkVar = this.j;
        evkVar.getClass();
        evk evkVar2 = this.k;
        evkVar2.getClass();
        try {
            if (this.n >= this.t) {
                d(evkVar, true);
            }
            androidx.media3.datasource.a aVar2 = this.l;
            aVar2.getClass();
            int read = aVar2.read(bArr, i, i2);
            if (read != -1) {
                if (this.l == aVar) {
                    this.s += read;
                }
                long j2 = read;
                this.n += j2;
                this.m += j2;
                long j3 = this.o;
                if (j3 == -1) {
                    return read;
                }
                this.o = j3 - j2;
                return read;
            }
            androidx.media3.datasource.a aVar3 = this.l;
            if (!(aVar3 == aVar)) {
                j = -1;
                long j4 = evkVar2.h;
                if (j4 != -1) {
                    i3 = read;
                    if (this.m < j4) {
                    }
                } else {
                    i3 = read;
                }
                String str = evkVar.i;
                String str2 = y2r0.a;
                this.o = 0L;
                if (!(aVar3 == this.c)) {
                    return i3;
                }
                dij dijVar = new dij();
                dijVar.a(Long.valueOf(this.n), "exo_len");
                this.a.f(str, dijVar);
                return i3;
            }
            i3 = read;
            j = -1;
            long j5 = this.o;
            if (j5 <= 0 && j5 != j) {
                return i3;
            }
            b();
            d(evkVar, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.l == aVar || (th instanceof Cache.CacheException)) {
                this.q = true;
            }
            throw th;
        }
    }
}
