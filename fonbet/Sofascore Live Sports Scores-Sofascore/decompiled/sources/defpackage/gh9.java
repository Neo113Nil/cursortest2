package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class gh9 implements cwh {
    public final long a;
    public boolean b;
    public final x52 c = new x52();
    public final x52 d = new x52();
    public boolean e;
    public final /* synthetic */ ih9 f;

    public gh9(ih9 ih9Var, long j, boolean z) {
        this.f = ih9Var;
        this.a = j;
        this.b = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        ih9 ih9Var = this.f;
        synchronized (ih9Var) {
            this.e = true;
            x52 x52Var = this.d;
            j = x52Var.b;
            x52Var.k();
            ih9Var.notifyAll();
            Unit unit = Unit.a;
        }
        if (j > 0) {
            ih9 ih9Var2 = this.f;
            TimeZone timeZone = yol.a;
            ih9Var2.b.i(j);
        }
        this.f.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #2 {, blocks: (B:6:0x0010, B:8:0x001d, B:13:0x0027, B:33:0x00c5, B:34:0x00ca, B:65:0x00ef, B:66:0x00f4, B:15:0x0030, B:17:0x0036, B:19:0x003a, B:21:0x003e, B:22:0x004f, B:24:0x0053, B:26:0x005d, B:28:0x007a, B:30:0x008b, B:48:0x00a4, B:52:0x00ae, B:55:0x00b4, B:56:0x00c0, B:59:0x00e5, B:60:0x00ec), top: B:5:0x0010, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053 A[Catch: all -> 0x004b, TryCatch #1 {all -> 0x004b, blocks: (B:15:0x0030, B:17:0x0036, B:19:0x003a, B:21:0x003e, B:22:0x004f, B:24:0x0053, B:26:0x005d, B:28:0x007a, B:30:0x008b, B:48:0x00a4, B:52:0x00ae, B:55:0x00b4, B:56:0x00c0, B:59:0x00e5, B:60:0x00ec), top: B:14:0x0030, outer: #2, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5 A[SYNTHETIC] */
    @Override // defpackage.cwh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long read(x52 x52Var, long j) {
        boolean z;
        boolean z2;
        Throwable th;
        long j2;
        long j3;
        x52Var.getClass();
        long j4 = 0;
        if (j < 0) {
            ogj.h(vxd.l(j, "byteCount < 0: "));
            return 0L;
        }
        while (true) {
            ih9 ih9Var = this.f;
            synchronized (ih9Var) {
                ih9Var.b.getClass();
                fh9 fh9Var = ih9Var.i;
                z = true;
                try {
                    if (!fh9Var.c && !fh9Var.a) {
                        z2 = false;
                        if (z2) {
                            ih9Var.j.h();
                        }
                        if (ih9Var.f() != null || this.b) {
                            th = null;
                        } else {
                            th = ih9Var.m;
                            if (th == null) {
                                tp5 f = ih9Var.f();
                                f.getClass();
                                th = new sgi(f);
                            }
                        }
                        if (!this.e) {
                            throw new IOException("stream closed");
                        }
                        x52 x52Var2 = this.d;
                        long j5 = x52Var2.b;
                        if (j5 > j4) {
                            j3 = x52Var2.read(x52Var, Math.min(j, j5));
                            dw1.c(ih9Var.c, j3, 0L, 2);
                            long b = ih9Var.c.b();
                            if (th == null) {
                                j2 = j4;
                                if (b >= ih9Var.b.r.a() / 2) {
                                    ih9Var.b.m(ih9Var.a, b);
                                    dw1.c(ih9Var.c, 0L, b, 1);
                                }
                            } else {
                                j2 = j4;
                            }
                            z = false;
                        } else {
                            j2 = j4;
                            if (this.b || th != null) {
                                z = false;
                            } else {
                                try {
                                    ih9Var.wait();
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                    throw new InterruptedIOException();
                                }
                            }
                            j3 = -1;
                        }
                        Unit unit = Unit.a;
                    }
                    if (ih9Var.f() != null) {
                    }
                    th = null;
                    if (!this.e) {
                    }
                } finally {
                    if (z2) {
                        ih9Var.j.k();
                    }
                }
                z2 = true;
                if (z2) {
                }
            }
            this.f.b.q.getClass();
            if (!z) {
                if (j3 != -1) {
                    return j3;
                }
                if (th == null) {
                    return -1L;
                }
                throw th;
            }
            j4 = j2;
        }
    }

    @Override // defpackage.cwh
    public final pij timeout() {
        return this.f.j;
    }
}
