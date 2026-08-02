package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class zg9 implements Closeable {
    public static final aah A;
    public final xg9 a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final String c;
    public int d;
    public int e;
    public boolean f;
    public final cui g;
    public final bui h;
    public final bui i;
    public final bui j;
    public final uxf k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public final e98 q;
    public final aah r;
    public aah s;
    public final dw1 t;
    public long u;
    public long v;
    public final sx2 w;
    public final jh9 x;
    public final pi y;
    public final LinkedHashSet z;

    static {
        aah aahVar = new aah();
        aahVar.b(4, 65535);
        aahVar.b(5, 16384);
        A = aahVar;
    }

    public zg9(jy0 jy0Var) {
        this.a = (xg9) jy0Var.e;
        String str = (String) jy0Var.d;
        if (str == null) {
            Intrinsics.i("connectionName");
            throw null;
        }
        this.c = str;
        int i = 3;
        this.e = 3;
        cui cuiVar = (cui) jy0Var.b;
        this.g = cuiVar;
        bui d = cuiVar.d();
        this.h = d;
        this.i = cuiVar.d();
        this.j = cuiVar.d();
        this.k = uxf.v;
        this.q = (e98) jy0Var.f;
        aah aahVar = new aah();
        aahVar.b(4, C.DEFAULT_MUXED_BUFFER_SIZE);
        this.r = aahVar;
        this.s = A;
        this.t = new dw1(0);
        this.v = r3.a();
        sx2 sx2Var = (sx2) jy0Var.c;
        if (sx2Var == null) {
            Intrinsics.i("socket");
            throw null;
        }
        this.w = sx2Var;
        this.x = new jh9((kof) sx2Var.c);
        this.y = new pi(this, new eh9((lof) sx2Var.b));
        this.z = new LinkedHashSet();
        int i2 = jy0Var.a;
        if (i2 != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i2);
            d.d(new f45(str.concat(" ping"), new e40(this, nanos, 1), i), nanos);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e(tp5.NO_ERROR, tp5.CANCEL, null);
    }

    public final void e(tp5 tp5Var, tp5 tp5Var2, IOException iOException) {
        int i;
        Object[] objArr;
        TimeZone timeZone = yol.a;
        try {
            h(tp5Var);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.b.isEmpty()) {
                    objArr = null;
                } else {
                    objArr = this.b.values().toArray(new ih9[0]);
                    this.b.clear();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        ih9[] ih9VarArr = (ih9[]) objArr;
        if (ih9VarArr != null) {
            for (ih9 ih9Var : ih9VarArr) {
                try {
                    ih9Var.c(tp5Var2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.x.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((g7h) this.w.a).b).close();
        } catch (IOException unused4) {
        }
        this.h.g();
        this.i.g();
        this.j.g();
    }

    public final ih9 f(int i) {
        ih9 ih9Var;
        synchronized (this) {
            ih9Var = (ih9) this.b.get(Integer.valueOf(i));
        }
        return ih9Var;
    }

    public final ih9 g(int i) {
        ih9 ih9Var;
        synchronized (this) {
            ih9Var = (ih9) this.b.remove(Integer.valueOf(i));
            notifyAll();
        }
        return ih9Var;
    }

    public final void h(tp5 tp5Var) {
        synchronized (this.x) {
            synchronized (this) {
                if (this.f) {
                    return;
                }
                this.f = true;
                int i = this.d;
                Unit unit = Unit.a;
                this.x.h(i, tp5Var, wol.a);
            }
        }
    }

    public final void i(long j) {
        synchronized (this) {
            try {
                dw1.c(this.t, j, 0L, 2);
                long b = this.t.b();
                if (b >= this.r.a() / 2) {
                    m(0, b);
                    dw1.c(this.t, 0L, b, 1);
                }
                e98 e98Var = this.q;
                dw1 dw1Var = this.t;
                e98Var.getClass();
                dw1Var.getClass();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.x.c);
        r6 = r2;
        r8.u += r6;
        r4 = kotlin.Unit.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i, boolean z, x52 x52Var, long j) {
        int min;
        long j2;
        if (j == 0) {
            this.x.f(z, i, x52Var, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j3 = this.u;
                            long j4 = this.v;
                            if (j3 < j4) {
                                break;
                            } else {
                                if (!this.b.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
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
            j -= j2;
            this.x.f(z && j == 0, i, x52Var, min);
        }
    }

    public final void k(int i, tp5 tp5Var) {
        bui.c(this.h, this.c + '[' + i + "] writeSynReset", new hp5(this, i, tp5Var, 5));
    }

    public final void m(final int i, final long j) {
        bui.c(this.h, this.c + '[' + i + "] windowUpdate", new Function0() { // from class: tg9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                zg9 zg9Var = zg9.this;
                try {
                    zg9Var.x.m(i, j);
                } catch (IOException e) {
                    tp5 tp5Var = tp5.PROTOCOL_ERROR;
                    zg9Var.e(tp5Var, tp5Var, e);
                }
                return Unit.a;
            }
        });
    }
}
