package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tgc implements Closeable {
    public kod a;
    public int b;
    public final uei c;
    public final j0l d;
    public tz2 e;
    public byte[] f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public ig3 k;
    public ig3 l;
    public long m;
    public boolean n;
    public int o;
    public int p;
    public boolean q;
    public volatile boolean r;

    public tgc(kod kodVar, int i, uei ueiVar, j0l j0lVar) {
        mx9 mx9Var = mx9.b;
        this.h = 1;
        this.i = 5;
        this.l = new ig3();
        this.n = false;
        this.o = -1;
        this.q = false;
        this.r = false;
        this.a = kodVar;
        this.e = mx9Var;
        this.b = i;
        this.c = ueiVar;
        z1a.y(j0lVar, "transportTracer");
        this.d = j0lVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (isClosed()) {
            return;
        }
        ig3 ig3Var = this.k;
        boolean z = ig3Var != null && ig3Var.c > 0;
        try {
            ig3 ig3Var2 = this.l;
            if (ig3Var2 != null) {
                ig3Var2.close();
            }
            ig3 ig3Var3 = this.k;
            if (ig3Var3 != null) {
                ig3Var3.close();
            }
            this.l = null;
            this.k = null;
            kod kodVar = this.a;
            zx2 zx2Var = zx2.a;
            boolean z2 = kodVar.n;
            ood oodVar = kodVar.F;
            int i = kodVar.J;
            if (z2) {
                oodVar.g(i, null, zx2Var, false, null, null);
            } else {
                oodVar.g(i, null, zx2Var, false, up5.CANCEL, null);
            }
            z1a.D("status should have been reported on deframer closed", kodVar.o);
            kodVar.l = true;
            if (kodVar.p && z) {
                kodVar.m(xei.l.h("Encountered end-of-stream mid-frame"), true, new qic());
            }
            n2 n2Var = kodVar.m;
            if (n2Var != null) {
                n2Var.run();
                kodVar.m = null;
            }
        } catch (Throwable th) {
            this.l = null;
            this.k = null;
            throw th;
        }
    }

    public final void h() {
        if (this.n) {
            return;
        }
        boolean z = true;
        this.n = true;
        while (!this.r && this.m > 0 && n()) {
            try {
                int C = wt3.C(this.h);
                if (C == 0) {
                    m();
                } else {
                    if (C != 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid state: ");
                        int i = this.h;
                        sb.append(i != 1 ? i != 2 ? "null" : "BODY" : "HEADER");
                        throw new AssertionError(sb.toString());
                    }
                    k();
                    this.m--;
                }
            } catch (Throwable th) {
                this.n = false;
                throw th;
            }
        }
        if (this.r) {
            close();
            this.n = false;
            return;
        }
        if (this.q) {
            if (this.l.c != 0) {
                z = false;
            }
            if (z) {
                close();
            }
        }
        this.n = false;
    }

    public final boolean isClosed() {
        return this.l == null;
    }

    public final void k() {
        Object obj;
        int i = this.o;
        long j = this.p;
        uei ueiVar = this.c;
        cy2[] cy2VarArr = ueiVar.a;
        for (cy2 cy2Var : cy2VarArr) {
            cy2Var.d(i, j);
        }
        this.p = 0;
        if (this.j) {
            tz2 tz2Var = this.e;
            if (tz2Var == mx9.b) {
                throw xei.l.h("Can't decode compressed gRPC message as compression not configured").a();
            }
            try {
                ig3 ig3Var = this.k;
                bof bofVar = cof.a;
                aof aofVar = new aof();
                z1a.y(ig3Var, "buffer");
                aofVar.a = ig3Var;
                obj = new sgc(tz2Var.d(aofVar), this.b, ueiVar);
            } catch (IOException e) {
                is8.h(e);
                return;
            }
        } else {
            long j2 = this.k.c;
            for (cy2 cy2Var2 : cy2VarArr) {
                cy2Var2.f(j2);
            }
            ig3 ig3Var2 = this.k;
            bof bofVar2 = cof.a;
            aof aofVar2 = new aof();
            z1a.y(ig3Var2, "buffer");
            aofVar2.a = ig3Var2;
            obj = aofVar2;
        }
        this.k.getClass();
        this.k = null;
        kod kodVar = this.a;
        cqa cqaVar = new cqa();
        cqaVar.a = obj;
        kodVar.j.v(cqaVar);
        this.h = 1;
        this.i = 5;
    }

    public final void m() {
        int C = this.k.C();
        if ((C & 254) != 0) {
            throw xei.l.h("gRPC frame header malformed: reserved bits not zero").a();
        }
        this.j = (C & 1) != 0;
        ig3 ig3Var = this.k;
        ig3Var.e(4);
        int C2 = ig3Var.C() | (ig3Var.C() << 24) | (ig3Var.C() << 16) | (ig3Var.C() << 8);
        this.i = C2;
        if (C2 < 0 || C2 > this.b) {
            xei xeiVar = xei.j;
            Locale locale = Locale.US;
            throw xeiVar.h("gRPC message exceeds maximum size " + this.b + ": " + C2).a();
        }
        int i = this.o + 1;
        this.o = i;
        for (cy2 cy2Var : this.c.a) {
            cy2Var.c(i);
        }
        ((sjb) this.d.b).i();
        TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.h = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        if (r8.h == 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        r0.a(r3);
        r8.p += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r8.h == 2) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n() {
        uei ueiVar = this.c;
        int i = 0;
        r2 = false;
        r2 = false;
        boolean z = false;
        try {
            if (this.k == null) {
                this.k = new ig3();
            }
            int i2 = 0;
            while (true) {
                try {
                    int i3 = this.i - this.k.c;
                    if (i3 <= 0) {
                        z = true;
                        if (i2 > 0) {
                            this.a.a(i2);
                        }
                        return true;
                    }
                    int i4 = this.l.c;
                    if (i4 != 0) {
                        int min = Math.min(i3, i4);
                        i2 += min;
                        this.k.T(this.l.m(min));
                    } else if (i2 > 0) {
                        this.a.a(i2);
                    }
                } catch (Throwable th) {
                    int i5 = i2;
                    th = th;
                    i = i5;
                    if (i > 0) {
                        this.a.a(i);
                        if (this.h == 2) {
                            ueiVar.a(i);
                            this.p += i;
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
