package nh;

import androidx.appcompat.app.t0;
import androidx.appcompat.app.v0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class q implements Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final c0 f20980z;

    /* renamed from: a, reason: collision with root package name */
    public final n f20981a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f20982b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20983c;

    /* renamed from: d, reason: collision with root package name */
    public int f20984d;

    /* renamed from: e, reason: collision with root package name */
    public int f20985e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20986f;

    /* renamed from: g, reason: collision with root package name */
    public final jh.e f20987g;

    /* renamed from: h, reason: collision with root package name */
    public final jh.c f20988h;

    /* renamed from: i, reason: collision with root package name */
    public final jh.c f20989i;
    public final jh.c j;

    /* renamed from: k, reason: collision with root package name */
    public final b0 f20990k;

    /* renamed from: l, reason: collision with root package name */
    public long f20991l;

    /* renamed from: m, reason: collision with root package name */
    public long f20992m;

    /* renamed from: n, reason: collision with root package name */
    public long f20993n;

    /* renamed from: o, reason: collision with root package name */
    public long f20994o;

    /* renamed from: p, reason: collision with root package name */
    public final c f20995p;
    public final c0 q;

    /* renamed from: r, reason: collision with root package name */
    public c0 f20996r;

    /* renamed from: s, reason: collision with root package name */
    public final t0 f20997s;

    /* renamed from: t, reason: collision with root package name */
    public long f20998t;

    /* renamed from: u, reason: collision with root package name */
    public long f20999u;

    /* renamed from: v, reason: collision with root package name */
    public final v0 f21000v;

    /* renamed from: w, reason: collision with root package name */
    public final z f21001w;

    /* renamed from: x, reason: collision with root package name */
    public final p f21002x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f21003y;

    static {
        c0 c0Var = new c0();
        c0Var.c(4, 65535);
        c0Var.c(5, 16384);
        f20980z = c0Var;
    }

    public q(c4.d builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f20981a = (n) builder.f3580e;
        this.f20982b = new LinkedHashMap();
        String str = (String) builder.f3579d;
        v0 v0Var = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            str = null;
        }
        this.f20983c = str;
        this.f20985e = 3;
        jh.e eVar = (jh.e) builder.f3577b;
        this.f20987g = eVar;
        this.f20988h = eVar.d();
        this.f20989i = eVar.d();
        this.j = eVar.d();
        this.f20990k = b0.f20924a;
        this.f20995p = (c) builder.f3581f;
        c0 c0Var = new c0();
        c0Var.c(4, 16777216);
        this.q = c0Var;
        this.f20996r = f20980z;
        this.f20997s = new t0(0);
        this.f20999u = r0.a();
        v0 v0Var2 = (v0) builder.f3578c;
        if (v0Var2 != null) {
            v0Var = v0Var2;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("socket");
        }
        this.f21000v = v0Var;
        this.f21001w = new z((BufferedSink) v0Var.f366d);
        this.f21002x = new p(this, new u((BufferedSource) v0Var.f365c));
        this.f21003y = new LinkedHashSet();
    }

    public final void C(final int i5, final long j) {
        jh.c.c(this.f20988h, this.f20983c + '[' + i5 + "] windowUpdate", new Function0() { // from class: nh.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                q qVar = q.this;
                try {
                    qVar.f21001w.C(i5, j);
                } catch (IOException e7) {
                    b bVar = b.f20917d;
                    qVar.c(bVar, bVar, e7);
                }
                return Unit.f19194a;
            }
        });
    }

    public final void c(b connectionCode, b streamCode, IOException iOException) {
        int i5;
        Object[] objArr;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        TimeZone timeZone = hh.g.f10825a;
        try {
            t(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f20982b.isEmpty()) {
                    objArr = null;
                } else {
                    objArr = this.f20982b.values().toArray(new y[0]);
                    this.f20982b.clear();
                }
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        y[] yVarArr = (y[]) objArr;
        if (yVarArr != null) {
            for (y yVar : yVarArr) {
                try {
                    yVar.c(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f21001w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f21000v.cancel();
        } catch (IOException unused4) {
        }
        this.f20988h.f();
        this.f20989i.f();
        this.j.f();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c(b.f20916c, b.f20921h, null);
    }

    public final y k(int i5) {
        y yVar;
        synchronized (this) {
            yVar = (y) this.f20982b.get(Integer.valueOf(i5));
        }
        return yVar;
    }

    public final boolean n(long j) {
        synchronized (this) {
            if (this.f20986f) {
                return false;
            }
            if (this.f20993n < this.f20992m) {
                if (j >= this.f20994o) {
                    return false;
                }
            }
            return true;
        }
    }

    public final y r(int i5) {
        y yVar;
        synchronized (this) {
            yVar = (y) this.f20982b.remove(Integer.valueOf(i5));
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
        return yVar;
    }

    public final void t(b statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.f21001w) {
            synchronized (this) {
                if (this.f20986f) {
                    return;
                }
                this.f20986f = true;
                int i5 = this.f20984d;
                Unit unit = Unit.f19194a;
                this.f21001w.r(i5, statusCode, hh.e.f10821a);
            }
        }
    }

    public final void w(long j) {
        synchronized (this) {
            try {
                t0.c(this.f20997s, j, 0L, 2);
                long b10 = this.f20997s.b();
                if (b10 >= this.q.a() / 2) {
                    C(0, b10);
                    t0.c(this.f20997s, 0L, b10, 1);
                }
                c cVar = this.f20995p;
                t0 windowCounter = this.f20997s;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(windowCounter, "windowCounter");
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f21001w.f21048c);
        r6 = r2;
        r8.f20998t += r6;
        r4 = kotlin.Unit.f19194a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i5, boolean z5, Buffer buffer, long j) {
        int min;
        long j6;
        if (j == 0) {
            this.f21001w.k(z5, i5, buffer, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j10 = this.f20998t;
                            long j11 = this.f20999u;
                            if (j10 < j11) {
                                break;
                            }
                            if (!this.f20982b.containsKey(Integer.valueOf(i5))) {
                                throw new IOException("stream closed");
                            }
                            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                            wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            j -= j6;
            this.f21001w.k(z5 && j == 0, i5, buffer, min);
        }
    }

    public final void z(int i5, b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        jh.c.c(this.f20988h, this.f20983c + '[' + i5 + "] writeSynReset", new j(this, i5, errorCode, 0));
    }
}
