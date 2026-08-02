package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class za2 {
    public final db2 a;
    public final fc2 b;
    public final hc2 c;
    public final long d;
    public final bwh e;
    public final int[] f;
    public final w52 g;
    public long h;
    public int i;

    public za2(db2 db2Var, fc2 fc2Var, hc2 hc2Var, long j) {
        db2Var.getClass();
        fc2Var.getClass();
        hc2Var.getClass();
        this.a = db2Var;
        this.b = fc2Var;
        this.c = hc2Var;
        this.d = j;
        byte[] bArr = fc2Var.a;
        if (bArr.length <= 0) {
            a70.p("Empty match string not permitted for scanning");
            throw null;
        }
        this.e = db2Var.f();
        int[] iArr = new int[bArr.length];
        int length = bArr.length;
        int i = 0;
        for (int i2 = 1; i2 < length; i2++) {
            while (i > 0 && fc2Var.a(i2) != fc2Var.a(i)) {
                i = iArr[i - 1];
            }
            if (fc2Var.a(i2) == fc2Var.a(i)) {
                i++;
            }
            iArr[i2] = i;
        }
        this.f = iArr;
        this.g = new w52();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r1 == r3) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01a7, code lost:
    
        if (defpackage.tgj.H(r4, r2) == r3) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01cc, code lost:
    
        if (defpackage.tgj.H(r4, r2) == r3) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016e A[LOOP:0: B:29:0x0075->B:39:0x016e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0185 A[EDGE_INSN: B:40:0x0185->B:41:0x0185 BREAK  A[LOOP:0: B:29:0x0075->B:39:0x016e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x01a7 -> B:18:0x01aa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        wa2 wa2Var;
        int i;
        long j;
        long j2;
        a1h a1hVar;
        if (sq3Var instanceof wa2) {
            wa2Var = (wa2) sq3Var;
            int i2 = wa2Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wa2Var.t = i2 - Integer.MIN_VALUE;
                Object obj = wa2Var.r;
                lu3 lu3Var = lu3.a;
                i = wa2Var.t;
                Object obj2 = null;
                int i3 = 1;
                bwh bwhVar = this.e;
                if (i != 0) {
                    y6a.M(obj);
                    if (bwhVar.w()) {
                    }
                    byte a = this.b.a(0);
                    bwhVar.getClass();
                    j = 0;
                    while (j < Long.MAX_VALUE) {
                    }
                    r25 = obj2;
                    r12 = bwhVar;
                    j2 = -1;
                    hc2 hc2Var = this.c;
                    if (j2 == -1) {
                    }
                    return lu3Var;
                }
                if (i == 1) {
                    y6a.M(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return Unit.a;
                    }
                    byte a2 = this.b.a(0);
                    bwhVar.getClass();
                    j = 0;
                    while (j < Long.MAX_VALUE) {
                    }
                    r25 = obj2;
                    r12 = bwhVar;
                    j2 = -1;
                    hc2 hc2Var2 = this.c;
                    if (j2 == -1) {
                    }
                    return lu3Var;
                }
                if (i != 2) {
                    if (i == 3) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                Object obj3 = null;
                char c = 2;
                bwh bwhVar2 = bwhVar;
                obj2 = obj3;
                bwhVar = bwhVar2;
                i3 = 1;
                if (bwhVar.w()) {
                    wa2Var.t = i3;
                    obj = this.a.g(i3, wa2Var);
                }
                byte a22 = this.b.a(0);
                bwhVar.getClass();
                j = 0;
                while (j < Long.MAX_VALUE && bwhVar.request(j + 1)) {
                    w52 u = bwhVar.u();
                    obj3 = obj2;
                    long min = Math.min(Long.MAX_VALUE, bwhVar.u().c);
                    u.getClass();
                    long min2 = Math.min(min, u.c);
                    ww9.v(u.c, j, min2);
                    if (j != min2 && (a1hVar = u.a) != null) {
                        long j3 = u.c;
                        if (j3 - j >= j) {
                            a1h a1hVar2 = u.b;
                            while (a1hVar2 != null && j3 > j) {
                                j3 -= a1hVar2.c - a1hVar2.b;
                                if (j3 <= j) {
                                    break;
                                }
                                a1hVar2 = a1hVar2.g;
                            }
                            if (j3 != -1) {
                                while (min2 > j3) {
                                    a1hVar2.getClass();
                                    long j4 = j3;
                                    int B = wba.B(a1hVar2, a22, Math.max((int) (j - j3), 0), Math.min(a1hVar2.a(), (int) (min2 - j4)));
                                    if (B != -1) {
                                        j2 = j4 + B;
                                        bwhVar2 = bwhVar;
                                        if (j2 == -1) {
                                            break;
                                        }
                                        j = bwhVar2.u().c;
                                        obj2 = obj3;
                                        bwhVar = bwhVar2;
                                    } else {
                                        j3 = j4 + a1hVar2.a();
                                        a1hVar2 = a1hVar2.f;
                                        if (a1hVar2 != null && j3 < min2) {
                                        }
                                    }
                                }
                                a70.r("Check failed.");
                                return obj3;
                            }
                        } else {
                            long j5 = 0;
                            while (a1hVar != null) {
                                long j6 = (a1hVar.c - a1hVar.b) + j5;
                                if (j6 > j) {
                                    break;
                                }
                                a1hVar = a1hVar.f;
                                j5 = j6;
                            }
                            if (j5 != -1) {
                                while (min2 > j5) {
                                    a1hVar.getClass();
                                    bwhVar2 = bwhVar;
                                    int B2 = wba.B(a1hVar, a22, Math.max((int) (j - j5), 0), Math.min(a1hVar.a(), (int) (min2 - j5)));
                                    if (B2 != -1) {
                                        j2 = j5 + B2;
                                        if (j2 == -1) {
                                        }
                                    } else {
                                        j5 += a1hVar.a();
                                        a1hVar = a1hVar.f;
                                        if (a1hVar != null && j5 < min2) {
                                            bwhVar = bwhVar2;
                                        }
                                        j2 = -1;
                                        if (j2 == -1) {
                                        }
                                    }
                                }
                                a70.r("Check failed.");
                                return obj3;
                            }
                        }
                        if (bwhVar.w()) {
                        }
                        byte a222 = this.b.a(0);
                        bwhVar.getClass();
                        j = 0;
                        while (j < Long.MAX_VALUE) {
                            w52 u2 = bwhVar.u();
                            obj3 = obj2;
                            long min3 = Math.min(Long.MAX_VALUE, bwhVar.u().c);
                            u2.getClass();
                            long min22 = Math.min(min3, u2.c);
                            ww9.v(u2.c, j, min22);
                            if (j != min22) {
                                long j32 = u2.c;
                                if (j32 - j >= j) {
                                }
                                if (bwhVar.w()) {
                                }
                                byte a2222 = this.b.a(0);
                                bwhVar.getClass();
                                j = 0;
                                while (j < Long.MAX_VALUE) {
                                }
                            }
                        }
                    }
                    bwhVar2 = bwhVar;
                    j2 = -1;
                    if (j2 == -1) {
                    }
                }
                obj3 = obj2;
                bwhVar2 = bwhVar;
                j2 = -1;
                hc2 hc2Var22 = this.c;
                if (j2 == -1) {
                    w52 w52Var = (w52) bwhVar2;
                    b(w52Var.c);
                    this.h = w52Var.j(hc2Var22.d()) + this.h;
                    c = 2;
                    wa2Var.t = 2;
                } else {
                    b(j2);
                    long j7 = this.h;
                    w52 d = hc2Var22.d();
                    d.getClass();
                    this.h = bwhVar2.X(d, j2) + j7;
                    wa2Var.t = 3;
                }
                return lu3Var;
            }
        }
        wa2Var = new wa2(this, sq3Var);
        Object obj4 = wa2Var.r;
        lu3 lu3Var2 = lu3.a;
        i = wa2Var.t;
        Object obj22 = null;
        int i32 = 1;
        bwh bwhVar3 = this.e;
        if (i != 0) {
        }
    }

    public final void b(long j) {
        long j2 = this.h + j;
        long j3 = this.d;
        if (j2 <= j3) {
            return;
        }
        StringBuilder o = ljg.o("Limit of ", j3, " bytes exceeded while searching for \"");
        fc2 fc2Var = this.b;
        fc2Var.getClass();
        o.append(c.r(c.k(fc2Var.a), "\n", "\\n", false));
        o.append('\"');
        throw new IOException(o.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
    
        if (r14 != r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bd, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0049, code lost:
    
        if (r14 == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x003f -> B:21:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0049 -> B:17:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(sq3 sq3Var) {
        xa2 xa2Var;
        int i;
        int i2;
        fc2 fc2Var;
        int i3;
        int i4;
        hc2 hc2Var;
        int i5;
        Object H;
        if (sq3Var instanceof xa2) {
            xa2Var = (xa2) sq3Var;
            int i6 = xa2Var.t;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                xa2Var.t = i6 - Integer.MIN_VALUE;
                Object obj = xa2Var.r;
                lu3 lu3Var = lu3.a;
                i = xa2Var.t;
                bwh bwhVar = this.e;
                if (i != 0) {
                    y6a.M(obj);
                    if (bwhVar.w()) {
                    }
                    byte readByte = bwhVar.readByte();
                    i2 = this.i;
                    w52 w52Var = this.g;
                    fc2Var = this.b;
                    if (i2 > 0) {
                    }
                    i3 = this.i + 1;
                    this.i = i3;
                    if (i3 == fc2Var.a.length) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        this.h++;
                        return Boolean.FALSE;
                    }
                    y6a.M(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return Boolean.FALSE;
                    }
                    byte readByte2 = bwhVar.readByte();
                    i2 = this.i;
                    w52 w52Var2 = this.g;
                    fc2Var = this.b;
                    if (i2 > 0 && readByte2 != fc2Var.a(i2)) {
                        int i7 = this.i;
                        while (true) {
                            i4 = this.i;
                            if (i4 <= 0 || readByte2 == fc2Var.a(i4)) {
                                break;
                            }
                            this.i = this.f[this.i - 1];
                        }
                        long j = i7 - this.i;
                        b(j);
                        long j2 = this.h;
                        hc2Var = this.c;
                        w52 d = hc2Var.d();
                        d.getClass();
                        this.h = w52Var2.X(d, j) + j2;
                        i5 = this.i;
                        if (i5 == 0 && readByte2 != fc2Var.a(i5)) {
                            xa2Var.t = 2;
                            jc2 jc2Var = kc2.a;
                            hc2Var.d().p(readByte2);
                            H = tgj.H(hc2Var, xa2Var);
                            if (H != lu3.a) {
                                H = Unit.a;
                            }
                        }
                    }
                    i3 = this.i + 1;
                    this.i = i3;
                    if (i3 == fc2Var.a.length) {
                        return Boolean.TRUE;
                    }
                    w52Var2.p(readByte2);
                    if (bwhVar.w()) {
                        xa2Var.t = 1;
                        obj = this.a.g(1, xa2Var);
                    }
                    byte readByte22 = bwhVar.readByte();
                    i2 = this.i;
                    w52 w52Var22 = this.g;
                    fc2Var = this.b;
                    if (i2 > 0) {
                        int i72 = this.i;
                        while (true) {
                            i4 = this.i;
                            if (i4 <= 0) {
                                break;
                            }
                            break;
                            this.i = this.f[this.i - 1];
                        }
                        long j3 = i72 - this.i;
                        b(j3);
                        long j22 = this.h;
                        hc2Var = this.c;
                        w52 d2 = hc2Var.d();
                        d2.getClass();
                        this.h = w52Var22.X(d2, j3) + j22;
                        i5 = this.i;
                        if (i5 == 0) {
                            xa2Var.t = 2;
                            jc2 jc2Var2 = kc2.a;
                            hc2Var.d().p(readByte22);
                            H = tgj.H(hc2Var, xa2Var);
                            if (H != lu3.a) {
                            }
                        }
                    }
                    i3 = this.i + 1;
                    this.i = i3;
                    if (i3 == fc2Var.a.length) {
                    }
                }
            }
        }
        xa2Var = new xa2(this, sq3Var);
        Object obj2 = xa2Var.r;
        lu3 lu3Var2 = lu3.a;
        i = xa2Var.t;
        bwh bwhVar2 = this.e;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (r11 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        if (r4.c(r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c9, code lost:
    
        if (a(r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:
    
        if (r11 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d4 -> B:19:0x00d7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(boolean z, sq3 sq3Var) {
        ya2 ya2Var;
        int i;
        if (sq3Var instanceof ya2) {
            ya2Var = (ya2) sq3Var;
            int i2 = ya2Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ya2Var.u = i2 - Integer.MIN_VALUE;
                Object obj = ya2Var.s;
                Object obj2 = lu3.a;
                i = ya2Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    this.h = 0L;
                    if (this.e.w()) {
                    }
                    ya2Var.r = z;
                    ya2Var.u = 2;
                } else if (i == 1) {
                    z = ya2Var.r;
                    y6a.M(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        if (!z) {
                            fc2 fc2Var = this.b;
                            fc2Var.getClass();
                            throw new IOException("Expected \"" + c.r(c.k(fc2Var.a), "\n", "\\n", false) + "\" but encountered end of input");
                        }
                        long j = this.h;
                        w52 w52Var = this.g;
                        hc2 hc2Var = this.c;
                        this.h = w52Var.j(hc2Var.d()) + j;
                        ya2Var.u = 4;
                    }
                    ya2Var.r = z;
                    ya2Var.u = 2;
                } else if (i == 2) {
                    z = ya2Var.r;
                    y6a.M(obj);
                    ya2Var.r = z;
                    ya2Var.u = 3;
                    obj = c(ya2Var);
                } else {
                    if (i != 3) {
                        if (i == 4) {
                            y6a.M(obj);
                            return new Long(this.h);
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = ya2Var.r;
                    y6a.M(obj);
                    if (((Boolean) obj).booleanValue()) {
                        return new Long(this.h);
                    }
                    if (this.e.w()) {
                        ya2Var.r = z;
                        ya2Var.u = 1;
                        obj = this.a.g(1, ya2Var);
                    }
                    ya2Var.r = z;
                    ya2Var.u = 2;
                }
            }
        }
        ya2Var = new ya2(this, sq3Var);
        Object obj3 = ya2Var.s;
        Object obj22 = lu3.a;
        i = ya2Var.u;
        if (i != 0) {
        }
    }
}
