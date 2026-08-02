package defpackage;

import java.io.EOFException;
import java.io.Flushable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class w52 implements bwh, AutoCloseable, Flushable {
    public a1h a;
    public a1h b;
    public long c;

    @Override // defpackage.qnf
    public final long X(w52 w52Var, long j) {
        if (j < 0) {
            ogj.h(vxd.m("byteCount (", j, ") < 0"));
            return 0L;
        }
        long j2 = this.c;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        w52Var.n(this, j);
        return j;
    }

    public final int e(int i, int i2, byte[] bArr) {
        bArr.getClass();
        ww9.v(bArr.length, i, i2);
        a1h a1hVar = this.a;
        if (a1hVar == null) {
            return -1;
        }
        int min = Math.min(i2 - i, a1hVar.a());
        int i3 = (i + min) - i;
        byte[] bArr2 = a1hVar.a;
        int i4 = a1hVar.b;
        mh0.f(bArr2, i, i4, bArr, i4 + i3);
        a1hVar.b += i3;
        this.c -= min;
        if (a1hVar.a() == 0) {
            h();
        }
        return min;
    }

    public final void f(w52 w52Var, long j) {
        w52Var.getClass();
        if (j < 0) {
            ogj.h(vxd.m("byteCount (", j, ") < 0"));
            return;
        }
        long j2 = this.c;
        if (j2 >= j) {
            w52Var.n(this, j);
        } else {
            w52Var.n(this, j2);
            throw new EOFException(lnb.l(this.c, " bytes were written.", ljg.o("Buffer exhausted before writing ", j, " bytes. Only ")));
        }
    }

    public final void h() {
        a1h a1hVar = this.a;
        a1hVar.getClass();
        a1h a1hVar2 = a1hVar.f;
        this.a = a1hVar2;
        if (a1hVar2 == null) {
            this.b = null;
        } else {
            a1hVar2.g = null;
        }
        a1hVar.f = null;
        p1h.a(a1hVar);
    }

    public final long i(qnf qnfVar) {
        qnfVar.getClass();
        long j = 0;
        while (true) {
            long X = qnfVar.X(this, 8192L);
            if (X == -1) {
                return j;
            }
            j += X;
        }
    }

    public final long j(w52 w52Var) {
        w52Var.getClass();
        long j = this.c;
        if (j > 0) {
            w52Var.n(this, j);
        }
        return j;
    }

    public final /* synthetic */ a1h k() {
        a1h a1hVar = this.b;
        if (a1hVar == null) {
            a1h b = p1h.b();
            this.a = b;
            this.b = b;
            return b;
        }
        if (a1hVar.c + 1 <= 8192 && a1hVar.e) {
            return a1hVar;
        }
        a1h b2 = p1h.b();
        a1hVar.d(b2);
        this.b = b2;
        return b2;
    }

    public final void m(int i, byte[] bArr) {
        bArr.getClass();
        ww9.v(bArr.length, 0L, i);
        int i2 = 0;
        while (i2 < i) {
            a1h k = k();
            byte[] bArr2 = k.a;
            int min = Math.min(i - i2, bArr2.length - k.c) + i2;
            mh0.f(bArr, k.c, i2, bArr2, min);
            k.c = (min - i2) + k.c;
            i2 = min;
        }
        this.c += i;
    }

    public final void n(w52 w52Var, long j) {
        a1h b;
        if (w52Var == this) {
            a70.p("source == this");
            return;
        }
        ww9.w(w52Var.c, j);
        while (j > 0) {
            w52Var.a.getClass();
            int i = 0;
            if (j < r0.a()) {
                a1h a1hVar = this.b;
                if (a1hVar != null && a1hVar.e) {
                    long j2 = a1hVar.c + j;
                    gsf gsfVar = a1hVar.d;
                    if (j2 - ((gsfVar == null || gsfVar.a <= 0) ? a1hVar.b : 0) <= 8192) {
                        a1h a1hVar2 = w52Var.a;
                        a1hVar2.getClass();
                        a1hVar2.f(a1hVar, (int) j);
                        w52Var.c -= j;
                        this.c += j;
                        return;
                    }
                }
                a1h a1hVar3 = w52Var.a;
                a1hVar3.getClass();
                int i2 = (int) j;
                if (i2 <= 0 || i2 > a1hVar3.c - a1hVar3.b) {
                    a70.p("byteCount out of range");
                    return;
                }
                if (i2 >= 1024) {
                    b = a1hVar3.e();
                } else {
                    b = p1h.b();
                    byte[] bArr = a1hVar3.a;
                    byte[] bArr2 = b.a;
                    int i3 = a1hVar3.b;
                    mh0.f(bArr, 0, i3, bArr2, i3 + i2);
                }
                b.c = b.b + i2;
                a1hVar3.b += i2;
                a1h a1hVar4 = a1hVar3.g;
                if (a1hVar4 != null) {
                    a1hVar4.d(b);
                } else {
                    b.f = a1hVar3;
                    a1hVar3.g = b;
                }
                w52Var.a = b;
            }
            a1h a1hVar5 = w52Var.a;
            a1hVar5.getClass();
            long a = a1hVar5.a();
            a1h c = a1hVar5.c();
            w52Var.a = c;
            if (c == null) {
                w52Var.b = null;
            }
            if (this.a == null) {
                this.a = a1hVar5;
                this.b = a1hVar5;
            } else {
                a1h a1hVar6 = this.b;
                a1hVar6.getClass();
                a1hVar6.d(a1hVar5);
                a1h a1hVar7 = a1hVar5.g;
                if (a1hVar7 == null) {
                    a70.r("cannot compact");
                    return;
                }
                if (a1hVar7.e) {
                    int i4 = a1hVar5.c - a1hVar5.b;
                    int i5 = 8192 - a1hVar7.c;
                    a1hVar7.getClass();
                    gsf gsfVar2 = a1hVar7.d;
                    if (gsfVar2 == null || gsfVar2.a <= 0) {
                        a1h a1hVar8 = a1hVar5.g;
                        a1hVar8.getClass();
                        i = a1hVar8.b;
                    }
                    if (i4 <= i5 + i) {
                        a1h a1hVar9 = a1hVar5.g;
                        a1hVar9.getClass();
                        a1hVar5.f(a1hVar9, i4);
                        if (a1hVar5.c() != null) {
                            a70.r("Check failed.");
                            return;
                        } else {
                            p1h.a(a1hVar5);
                            a1hVar5 = a1hVar9;
                        }
                    }
                }
                this.b = a1hVar5;
                if (a1hVar5.g == null) {
                    this.a = a1hVar5;
                }
            }
            w52Var.c -= a;
            this.c += a;
            j -= a;
        }
    }

    @Override // defpackage.bwh
    public final void o(long j) {
        if (j < 0) {
            ogj.h(vxd.l(j, "byteCount: "));
            return;
        }
        if (this.c >= j) {
            return;
        }
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.c + ", required: " + j + ')');
    }

    public final void p(byte b) {
        a1h k = k();
        byte[] bArr = k.a;
        int i = k.c;
        k.c = i + 1;
        bArr[i] = b;
        this.c++;
    }

    @Override // defpackage.bwh
    public final byte readByte() {
        a1h a1hVar = this.a;
        if (a1hVar == null) {
            throw new EOFException(lnb.l(this.c, ", required: 1)", new StringBuilder("Buffer doesn't contain required number of bytes (size: ")));
        }
        int a = a1hVar.a();
        if (a == 0) {
            h();
            return readByte();
        }
        byte[] bArr = a1hVar.a;
        int i = a1hVar.b;
        a1hVar.b = i + 1;
        byte b = bArr[i];
        this.c--;
        if (a == 1) {
            h();
        }
        return b;
    }

    @Override // defpackage.bwh
    public final boolean request(long j) {
        if (j >= 0) {
            return this.c >= j;
        }
        ogj.h(vxd.m("byteCount: ", j, " < 0"));
        return false;
    }

    public final void skip(long j) {
        if (j < 0) {
            ogj.h(vxd.m("byteCount (", j, ") < 0"));
            return;
        }
        long j2 = j;
        while (j2 > 0) {
            a1h a1hVar = this.a;
            if (a1hVar == null) {
                throw new EOFException(vxd.m("Buffer exhausted before skipping ", j, " bytes."));
            }
            int min = (int) Math.min(j2, a1hVar.c - a1hVar.b);
            long j3 = min;
            this.c -= j3;
            j2 -= j3;
            int i = a1hVar.b + min;
            a1hVar.b = i;
            if (i == a1hVar.c) {
                h();
            }
        }
    }

    public final String toString() {
        long j = this.c;
        if (j == 0) {
            return "Buffer(size=0)";
        }
        int min = (int) Math.min(64L, j);
        StringBuilder sb = new StringBuilder((min * 2) + (this.c > 64 ? 1 : 0));
        int i = 0;
        for (a1h a1hVar = this.a; a1hVar != null; a1hVar = a1hVar.f) {
            int i2 = 0;
            while (i < min && i2 < a1hVar.a()) {
                int i3 = i2 + 1;
                byte b = a1hVar.b(i2);
                i++;
                char[] cArr = ww9.p;
                sb.append(cArr[(b >> 4) & 15]);
                sb.append(cArr[b & 15]);
                i2 = i3;
            }
        }
        if (this.c > 64) {
            sb.append((char) 8230);
        }
        return "Buffer(size=" + this.c + " hex=" + ((Object) sb) + ')';
    }

    @Override // defpackage.bwh
    public final boolean w() {
        return this.c == 0;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.bwh
    public final w52 u() {
        return this;
    }
}
