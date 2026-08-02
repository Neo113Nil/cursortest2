package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sg3 implements fqf, lg3 {
    public final mg3 a;
    public final y0 b;
    public final AtomicReference c = new AtomicReference(null);
    public final Object d = new Object();
    public final a1d e;
    public final jlh f;
    public final x0d g;
    public final y0d h;
    public final y0d i;
    public final x0d j;
    public final hn2 k;
    public final hn2 l;
    public final x0d m;
    public x0d n;
    public boolean o;
    public vfh p;
    public fce q;
    public sg3 r;
    public int s;
    public final hpo t;
    public final qn2 u;
    public final av8 v;
    public int w;
    public Function2 x;

    public sg3(mg3 mg3Var, y0 y0Var) {
        this.a = mg3Var;
        this.b = y0Var;
        a1d a1dVar = new a1d(new y0d());
        this.e = a1dVar;
        jlh jlhVar = new jlh();
        if (mg3Var.e()) {
            jlhVar.k = new uzc();
        }
        if (mg3Var.g()) {
            jlhVar.c();
        }
        this.f = jlhVar;
        this.g = t6a.t();
        this.h = new y0d();
        this.i = new y0d();
        this.j = t6a.t();
        hn2 hn2Var = new hn2();
        this.k = hn2Var;
        hn2 hn2Var2 = new hn2();
        this.l = hn2Var2;
        this.m = t6a.t();
        this.n = t6a.t();
        hpo hpoVar = new hpo(mg3Var);
        this.t = hpoVar;
        this.u = new qn2(2);
        av8 av8Var = new av8(y0Var, mg3Var, llh.a(jlhVar), a1dVar, hn2Var, hn2Var2, hpoVar, this);
        mg3Var.s(av8Var);
        this.v = av8Var;
        tc3 tc3Var = kik.f;
    }

    public final void A(Object obj) {
        synchronized (this.d) {
            try {
                w(obj);
                Object g = this.j.g(obj);
                if (g != null) {
                    if (g instanceof y0d) {
                        y0d y0dVar = (y0d) g;
                        Object[] objArr = y0dVar.b;
                        long[] jArr = y0dVar.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            w((ay4) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                }
                                if (i == length) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    } else {
                        w((ay4) g);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(Function2 function2) {
        boolean m = m();
        t();
        mg3 mg3Var = this.a;
        if (!m) {
            this.x = function2;
            mg3Var.a(this, function2);
            return;
        }
        av8 av8Var = this.v;
        av8Var.z = 0;
        av8Var.y = true;
        this.x = function2;
        mg3Var.a(this, function2);
        av8Var.v();
    }

    public final void a() {
        this.c.set(null);
        this.k.k.i0();
        this.l.k.i0();
        a1d a1dVar = this.e;
        if (a1dVar.a.g()) {
            return;
        }
        qn2 qn2Var = this.u;
        try {
            qn2Var.m(a1dVar, this.v.C());
            qn2Var.e();
        } finally {
            qn2Var.d();
        }
    }

    @Override // defpackage.fqf
    public final void b() {
        this.o = true;
        this.t.t();
    }

    public final void c(Object obj, boolean z) {
        Object g = this.g.g(obj);
        if (g == null) {
            return;
        }
        boolean z2 = g instanceof y0d;
        y0d y0dVar = this.h;
        y0d y0dVar2 = this.i;
        x0d x0dVar = this.m;
        if (!z2) {
            eqf eqfVar = (eqf) g;
            if (t6a.H(x0dVar, obj, eqfVar) || eqfVar.b(obj) == raa.a) {
                return;
            }
            if (eqfVar.g == null || z) {
                y0dVar.a(eqfVar);
                return;
            } else {
                y0dVar2.a(eqfVar);
                return;
            }
        }
        y0d y0dVar3 = (y0d) g;
        Object[] objArr = y0dVar3.b;
        long[] jArr = y0dVar3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        eqf eqfVar2 = (eqf) objArr[(i << 3) + i3];
                        if (!t6a.H(x0dVar, obj, eqfVar2) && eqfVar2.b(obj) != raa.a) {
                            if (eqfVar2.g == null || z) {
                                y0dVar.a(eqfVar2);
                            } else {
                                y0dVar2.a(eqfVar2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.lg3
    public final void d() {
        synchronized (this.d) {
            try {
                if (this.v.F) {
                    h3f.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.w != 3) {
                    this.w = 3;
                    this.x = kik.g;
                    hn2 hn2Var = this.v.L;
                    if (hn2Var != null) {
                        h(hn2Var);
                    }
                    int i = 1;
                    boolean z = this.f.b == 0;
                    if (!z || !this.e.a.g()) {
                        qn2 qn2Var = this.u;
                        try {
                            qn2Var.m(this.e, this.v.C());
                            if (!z) {
                                jlh jlhVar = this.f;
                                qn2 qn2Var2 = this.u;
                                mlh n = jlhVar.n();
                                try {
                                    n.m(n.t, new fv2(qn2Var2, i));
                                    n.I();
                                    Unit unit = Unit.a;
                                    n.e(true);
                                    this.b.b();
                                    this.b.t();
                                    qn2Var.f();
                                } catch (Throwable th) {
                                    n.e(false);
                                    throw th;
                                }
                            }
                            qn2Var.e();
                            qn2Var.d();
                        } catch (Throwable th2) {
                            qn2Var.d();
                            throw th2;
                        }
                    }
                    av8 av8Var = this.v;
                    av8Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        av8Var.b.x(av8Var);
                        av8Var.E.clear();
                        av8Var.s.clear();
                        av8Var.e.k.i0();
                        av8Var.v = null;
                        av8Var.a.b();
                        Unit unit2 = Unit.a;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                Unit unit3 = Unit.a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.a.y(this);
    }

    public final void e(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean c2;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean z2;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c3;
        long j8;
        int i;
        int i2;
        long[] jArr9;
        boolean z3 = set instanceof srg;
        x0d x0dVar = this.j;
        Object obj = null;
        int i3 = 8;
        if (z3) {
            y0d y0dVar = ((srg) set).a;
            Object[] objArr = y0dVar.b;
            long[] jArr10 = y0dVar.a;
            int length = jArr10.length - 2;
            if (length >= 0) {
                int i4 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr10[i4];
                    char c4 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i4 << 3) + i6];
                                c3 = c4;
                                if (obj2 instanceof eqf) {
                                    ((eqf) obj2).b(obj);
                                    jArr8 = jArr10;
                                    j8 = j9;
                                    i = length;
                                } else {
                                    c(obj2, z);
                                    Object g = x0dVar.g(obj2);
                                    if (g != null) {
                                        if (g instanceof y0d) {
                                            y0d y0dVar2 = (y0d) g;
                                            Object[] objArr2 = y0dVar2.b;
                                            long[] jArr11 = y0dVar2.a;
                                            int length2 = jArr11.length - 2;
                                            if (length2 >= 0) {
                                                int i7 = i3;
                                                i = length;
                                                int i8 = 0;
                                                while (true) {
                                                    long j10 = jArr11[i8];
                                                    j8 = j9;
                                                    long[] jArr12 = jArr11;
                                                    if ((((~j10) << c3) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                        int i10 = 0;
                                                        while (i10 < i9) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr9 = jArr10;
                                                                c((ay4) objArr2[(i8 << 3) + i10], z);
                                                            } else {
                                                                jArr9 = jArr10;
                                                            }
                                                            j10 >>= i7;
                                                            i10++;
                                                            jArr10 = jArr9;
                                                        }
                                                        jArr8 = jArr10;
                                                        if (i9 != i7) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr10;
                                                    }
                                                    if (i8 == length2) {
                                                        break;
                                                    }
                                                    i8++;
                                                    jArr11 = jArr12;
                                                    j9 = j8;
                                                    jArr10 = jArr8;
                                                    i7 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr10;
                                            j8 = j9;
                                            i = length;
                                            c((ay4) g, z);
                                        }
                                        Unit unit = Unit.a;
                                    }
                                    jArr8 = jArr10;
                                    j8 = j9;
                                    i = length;
                                    Unit unit2 = Unit.a;
                                }
                                i2 = 8;
                            } else {
                                jArr8 = jArr10;
                                c3 = c4;
                                j8 = j9;
                                i = length;
                                i2 = i3;
                            }
                            j9 = j8 >> i2;
                            i6++;
                            length = i;
                            i3 = i2;
                            c4 = c3;
                            jArr10 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr10;
                        c = c4;
                        int i11 = length;
                        if (i5 != i3) {
                            break;
                        } else {
                            length = i11;
                        }
                    } else {
                        jArr7 = jArr10;
                        c = 7;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr10 = jArr7;
                    obj = null;
                    i3 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof eqf) {
                    ((eqf) obj3).b(null);
                } else {
                    c(obj3, z);
                    Object g2 = x0dVar.g(obj3);
                    if (g2 != null) {
                        if (g2 instanceof y0d) {
                            y0d y0dVar3 = (y0d) g2;
                            Object[] objArr3 = y0dVar3.b;
                            long[] jArr13 = y0dVar3.a;
                            int length3 = jArr13.length - 2;
                            if (length3 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j11 = jArr13[i12];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                c((ay4) objArr3[(i12 << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                    }
                                    if (i12 == length3) {
                                        break;
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                        } else {
                            c((ay4) g2, z);
                        }
                    }
                    Unit unit3 = Unit.a;
                }
            }
        }
        x0d x0dVar2 = this.g;
        y0d y0dVar4 = this.h;
        if (z) {
            y0d y0dVar5 = this.i;
            if (y0dVar5.h()) {
                long[] jArr14 = x0dVar2.a;
                int length4 = jArr14.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr14[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = x0dVar2.b[i18];
                                    Object obj5 = x0dVar2.c[i18];
                                    if (obj5 instanceof y0d) {
                                        y0d y0dVar6 = (y0d) obj5;
                                        Object[] objArr4 = y0dVar6.b;
                                        long[] jArr15 = y0dVar6.a;
                                        int length5 = jArr15.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr15[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr16 = jArr15;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr14;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            eqf eqfVar = (eqf) objArr5[i22];
                                                            if (y0dVar5.c(eqfVar) || y0dVar4.c(eqfVar)) {
                                                                y0dVar6.m(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr14;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr14 = jArr6;
                                                    }
                                                    jArr5 = jArr14;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr14;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr15 = jArr16;
                                                jArr14 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr14;
                                            j6 = j12;
                                        }
                                        z2 = y0dVar6.g();
                                    } else {
                                        jArr5 = jArr14;
                                        j6 = j12;
                                        obj5.getClass();
                                        eqf eqfVar2 = (eqf) obj5;
                                        z2 = y0dVar5.c(eqfVar2) || y0dVar4.c(eqfVar2);
                                    }
                                    if (z2) {
                                        x0dVar2.l(i18);
                                    }
                                } else {
                                    jArr5 = jArr14;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr14 = jArr5;
                            }
                            jArr4 = jArr14;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr14;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr14 = jArr4;
                    }
                }
                y0dVar5.b();
                k();
                return;
            }
        }
        if (y0dVar4.h()) {
            long[] jArr17 = x0dVar2.a;
            int length6 = jArr17.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr17[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = x0dVar2.b[i26];
                                Object obj7 = x0dVar2.c[i26];
                                if (obj7 instanceof y0d) {
                                    y0d y0dVar7 = (y0d) obj7;
                                    Object[] objArr6 = y0dVar7.b;
                                    long[] jArr18 = y0dVar7.a;
                                    int length7 = jArr18.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr18[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr19 = jArr18;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr17;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (y0dVar4.c((eqf) objArr7[i30])) {
                                                            y0dVar7.m(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr17;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr17 = jArr3;
                                                }
                                                jArr2 = jArr17;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr17;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr18 = jArr19;
                                            jArr17 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr17;
                                        j4 = j14;
                                    }
                                    c2 = y0dVar7.g();
                                } else {
                                    jArr2 = jArr17;
                                    j4 = j14;
                                    obj7.getClass();
                                    c2 = y0dVar4.c((eqf) obj7);
                                }
                                if (c2) {
                                    x0dVar2.l(i26);
                                }
                            } else {
                                jArr2 = jArr17;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr17 = jArr2;
                        }
                        jArr = jArr17;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr17;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr17 = jArr;
                }
            }
            k();
            y0dVar4.b();
        }
    }

    @Override // defpackage.fqf
    public final raa f(eqf eqfVar, Object obj) {
        sg3 sg3Var;
        int i = eqfVar.b;
        if ((i & 2) != 0) {
            eqfVar.b = i | 4;
        }
        vu8 vu8Var = eqfVar.c;
        if (vu8Var == null || !vu8Var.a()) {
            return raa.a;
        }
        jlh jlhVar = this.f;
        jlhVar.getClass();
        vu8 vu8Var2 = eqfVar.c;
        if (vu8Var2 != null && jlhVar.o(o02.J(vu8Var2))) {
            if (eqfVar.d == null) {
                return raa.a;
            }
            raa v = v(eqfVar, vu8Var, obj);
            if (v != raa.a) {
                this.t.t();
            }
            return v;
        }
        synchronized (this.d) {
            sg3Var = this.r;
        }
        if (sg3Var != null) {
            av8 av8Var = sg3Var.v;
            if (av8Var.F && av8Var.j0(eqfVar, obj)) {
                return raa.d;
            }
        }
        return raa.a;
    }

    public final void g() {
        synchronized (this.d) {
            try {
                h(this.k);
                r();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                try {
                    if (!this.e.a.g()) {
                        qn2 qn2Var = this.u;
                        try {
                            qn2Var.m(this.e, this.v.C());
                            qn2Var.e();
                            qn2Var.d();
                        } catch (Throwable th2) {
                            qn2Var.d();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    this.a();
                    throw th3;
                }
            }
        }
    }

    public final void h(hn2 hn2Var) {
        qn2 qn2Var;
        long[] jArr;
        int i;
        long[] jArr2;
        qn2 qn2Var2;
        long j;
        char c;
        long j2;
        int i2;
        boolean z;
        long j3;
        hn2 hn2Var2 = this.l;
        av8 av8Var = this.v;
        qg3 C = av8Var.C();
        qn2 qn2Var3 = this.u;
        qn2Var3.m(this.e, C);
        try {
            if (hn2Var.k.k0()) {
                try {
                    if (hn2Var2.k.k0() && this.q == null) {
                        qn2Var3.e();
                    }
                    return;
                } finally {
                }
            }
            fce fceVar = this.q;
            qf0 qf0Var = fceVar != null ? fceVar.l : this.b;
            try {
                Trace.beginSection(qf0Var.equals(fceVar != null ? fceVar.l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    fce fceVar2 = this.q;
                    qn2 qn2Var4 = fceVar2 != null ? fceVar2.k : qn2Var3;
                    jlh jlhVar = this.f;
                    qg3 C2 = av8Var.C();
                    mlh n = llh.a(jlhVar).n();
                    int i3 = 0;
                    try {
                        hn2Var.j0(qf0Var, n, qn2Var4, C2);
                        Unit unit = Unit.a;
                        n.e(true);
                        qf0Var.t();
                        Trace.endSection();
                        qn2Var3.f();
                        qn2Var3.g();
                        if (this.o) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.o = false;
                                x0d x0dVar = this.g;
                                long[] jArr3 = x0dVar.a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = x0dVar.b[i8];
                                                    Object obj2 = x0dVar.c[i8];
                                                    if (obj2 instanceof y0d) {
                                                        y0d y0dVar = (y0d) obj2;
                                                        Object[] objArr = y0dVar.b;
                                                        long[] jArr4 = y0dVar.a;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        qn2Var2 = qn2Var3;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((eqf) objArr[i13]).a()) {
                                                                                    y0dVar.m(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (i10 == length2) {
                                                                        break;
                                                                    }
                                                                    i10++;
                                                                    jArr4 = jArr5;
                                                                    j4 = j;
                                                                    i9 = 8;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        z = y0dVar.g();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        qn2Var2 = qn2Var3;
                                                        j = j4;
                                                        obj2.getClass();
                                                        z = !((eqf) obj2).a();
                                                    }
                                                    if (z) {
                                                        x0dVar.l(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    qn2Var2 = qn2Var3;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                qn2Var3 = qn2Var2;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            qn2Var = qn2Var3;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            qn2Var = qn2Var3;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        qn2Var3 = qn2Var;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    qn2Var = qn2Var3;
                                }
                                k();
                                Unit unit2 = Unit.a;
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            qn2Var = qn2Var3;
                        }
                        try {
                            if (hn2Var2.k.k0() && this.q == null) {
                                qn2Var.e();
                            }
                        } finally {
                            qn2Var.d();
                        }
                    } catch (Throwable th3) {
                        try {
                            n.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                try {
                    if (hn2Var2.k.k0() && this.q == null) {
                        qn2Var3.e();
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public final void i() {
        synchronized (this.d) {
            try {
                hn2 hn2Var = this.l;
                hn2Var.getClass();
                if (!hn2Var.k.k0()) {
                    h(this.l);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                try {
                    if (!this.e.a.g()) {
                        qn2 qn2Var = this.u;
                        try {
                            qn2Var.m(this.e, this.v.C());
                            qn2Var.e();
                            qn2Var.d();
                        } catch (Throwable th2) {
                            qn2Var.d();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    this.a();
                    throw th3;
                }
            }
        }
    }

    public final void j() {
        qn2 qn2Var;
        synchronized (this.d) {
            try {
                this.v.v = null;
                if (!this.e.a.g()) {
                    qn2Var = this.u;
                    try {
                        qn2Var.m(this.e, this.v.C());
                        qn2Var.e();
                        qn2Var.d();
                    } finally {
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                try {
                    if (!this.e.a.g()) {
                        qn2Var = this.u;
                        try {
                            qn2Var.m(this.e, this.v.C());
                            qn2Var.e();
                            qn2Var.d();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void k() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean z;
        int i4;
        int i5;
        x0d x0dVar = this.j;
        long[] jArr3 = x0dVar.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = x0dVar.b[i10];
                            Object obj2 = x0dVar.c[i10];
                            c2 = c3;
                            boolean z2 = obj2 instanceof y0d;
                            j5 = j8;
                            x0d x0dVar2 = this.g;
                            if (z2) {
                                y0d y0dVar = (y0d) obj2;
                                Object[] objArr = y0dVar.b;
                                long[] jArr4 = y0dVar.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!x0dVar2.c((ay4) objArr[i15])) {
                                                        y0dVar.m(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                z = y0dVar.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                z = !x0dVar2.c((ay4) obj2);
                            }
                            if (z) {
                                x0dVar.l(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        y0d y0dVar2 = this.i;
        if (!y0dVar2.h()) {
            return;
        }
        Object[] objArr2 = y0dVar2.b;
        long[] jArr5 = y0dVar2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((eqf) objArr2[i20]).g == null) {
                            y0dVar2.m(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.fqf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(Object obj) {
        eqf A;
        int i;
        boolean z;
        int i2;
        av8 av8Var = this.v;
        if (av8Var.A > 0 || (A = av8Var.A()) == null) {
            return;
        }
        int i3 = A.b | 1;
        A.b = i3;
        if ((i3 & 32) == 0) {
            h0d h0dVar = A.f;
            if (h0dVar == null) {
                h0dVar = new h0d();
                A.f = h0dVar;
            }
            int i4 = A.e;
            int c = h0dVar.c(obj);
            if (c < 0) {
                c = ~c;
                i = -1;
            } else {
                i = h0dVar.c[c];
            }
            h0dVar.b[c] = obj;
            h0dVar.c[c] = i4;
            if (i == A.e) {
                z = true;
                this.t.t();
                if (z) {
                    if (obj instanceof rdi) {
                        ((rdi) obj).g(1);
                    }
                    t6a.l(this.g, obj, A);
                    if (obj instanceof ay4) {
                        ay4 ay4Var = (ay4) obj;
                        zx4 i5 = ay4Var.i();
                        x0d x0dVar = this.j;
                        t6a.I(x0dVar, obj);
                        h0d h0dVar2 = i5.e;
                        Object[] objArr = h0dVar2.b;
                        long[] jArr = h0dVar2.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j = jArr[i6];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8;
                                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                                    int i9 = 0;
                                    while (i9 < i8) {
                                        if ((j & 255) < 128) {
                                            qdi qdiVar = (qdi) objArr[(i6 << 3) + i9];
                                            i2 = i7;
                                            if (qdiVar instanceof rdi) {
                                                ((rdi) qdiVar).g(1);
                                            }
                                            t6a.l(x0dVar, qdiVar, obj);
                                        } else {
                                            i2 = i7;
                                        }
                                        j >>= i2;
                                        i9++;
                                        i7 = i2;
                                    }
                                    if (i8 != i7) {
                                        break;
                                    }
                                }
                                if (i6 == length) {
                                    break;
                                } else {
                                    i6++;
                                }
                            }
                        }
                        Object obj2 = i5.f;
                        x0d x0dVar2 = A.g;
                        if (x0dVar2 == null) {
                            x0dVar2 = new x0d();
                            A.g = x0dVar2;
                        }
                        x0dVar2.m(ay4Var, obj2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z = false;
        this.t.t();
        if (z) {
        }
    }

    public final boolean m() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (this.w != 1) {
                z = false;
            }
            if (z) {
                this.w = 0;
            }
        }
        return z;
    }

    public final void n(Function2 function2) {
        try {
            synchronized (this.d) {
                q();
                x0d x0dVar = this.n;
                this.n = t6a.t();
                try {
                    av8 av8Var = this.v;
                    vfh vfhVar = this.p;
                    if (!av8Var.e.k.k0()) {
                        sf3.a("Expected applyChanges() to have been called");
                    }
                    av8Var.P = vfhVar;
                    try {
                        av8Var.p(x0dVar, function2);
                        av8Var.P = null;
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        av8Var.P = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.n = x0dVar;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.e.a.g()) {
                    qn2 qn2Var = this.u;
                    try {
                        qn2Var.m(this.e, this.v.C());
                        qn2Var.e();
                        qn2Var.d();
                    } catch (Throwable th4) {
                        qn2Var.d();
                        throw th4;
                    }
                }
                throw th3;
            } catch (Throwable th5) {
                a();
                throw th5;
            }
        }
    }

    public final fce o(boolean z, Function2 function2) {
        if (this.q != null) {
            h3f.b("A pausable composition is in progress");
        }
        fce fceVar = new fce(this, this.a, this.v, this.e, function2, z, this.b, this.d);
        this.q = fceVar;
        return fceVar;
    }

    public final void p() {
        qn2 qn2Var;
        synchronized (this.d) {
            try {
                if (this.q != null) {
                    h3f.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.f.b == 0;
                try {
                    try {
                        if (z) {
                            if (!this.e.a.g()) {
                            }
                            this.g.a();
                            this.j.a();
                            this.n.a();
                            this.k.k.i0();
                            this.l.k.i0();
                            av8 av8Var = this.v;
                            av8Var.E.clear();
                            av8Var.s.clear();
                            av8Var.e.k.i0();
                            av8Var.v = null;
                            this.w = 1;
                            Unit unit = Unit.a;
                        }
                        qn2Var.m(this.e, this.v.C());
                        if (!z) {
                            jlh jlhVar = this.f;
                            qn2 qn2Var2 = this.u;
                            mlh n = jlhVar.n();
                            try {
                                n.m(n.t, new kz6(25, qn2Var2, n));
                                Unit unit2 = Unit.a;
                                n.e(true);
                                this.b.t();
                                qn2Var.f();
                            } catch (Throwable th) {
                                n.e(false);
                                throw th;
                            }
                        }
                        qn2Var.e();
                        qn2Var.d();
                        Unit unit3 = Unit.a;
                        this.g.a();
                        this.j.a();
                        this.n.a();
                        this.k.k.i0();
                        this.l.k.i0();
                        av8 av8Var2 = this.v;
                        av8Var2.E.clear();
                        av8Var2.s.clear();
                        av8Var2.e.k.i0();
                        av8Var2.v = null;
                        this.w = 1;
                        Unit unit4 = Unit.a;
                    } catch (Throwable th2) {
                        qn2Var.d();
                        throw th2;
                    }
                    qn2Var = this.u;
                } finally {
                    Trace.endSection();
                }
                Trace.beginSection("Compose:deactivate");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void q() {
        Object obj = hkg.o;
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                sf3.b("pending composition has not been applied");
                pvd.x();
                return;
            }
            if (andSet instanceof Set) {
                e((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                sf3.b("corrupt pendingModifications drain: " + atomicReference);
                pvd.x();
                return;
            }
            for (Set set : (Set[]) andSet) {
                e(set, true);
            }
        }
    }

    public final void r() {
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(null);
        if (Intrinsics.c(andSet, hkg.o)) {
            return;
        }
        if (andSet instanceof Set) {
            e((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                e(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.q == null) {
                sf3.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            sf3.b("corrupt pendingModifications drain: " + atomicReference);
            pvd.x();
        }
    }

    public final void s() {
        rm5 rm5Var = rm5.a;
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(rm5Var);
        if (Intrinsics.c(andSet, hkg.o) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            e((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            sf3.b("corrupt pendingModifications drain: " + atomicReference);
            pvd.x();
            return;
        }
        for (Set set : (Set[]) andSet) {
            e(set, false);
        }
    }

    public final void t() {
        int i = this.w;
        if (i != 0) {
            h3f.b(i != 1 ? i != 2 ? i != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.q == null) {
            return;
        }
        h3f.b("A pausable composition is in progress");
    }

    public final void u(ArrayList arrayList) {
        a1d a1dVar = this.e;
        av8 av8Var = this.v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((twc) ((Pair) arrayList.get(i)).a).c != this) {
                sf3.a("Check failed");
                break;
            }
        }
        try {
            av8Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    av8Var.E(arrayList);
                    av8Var.j();
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    av8Var.a();
                    throw th;
                }
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th2) {
            try {
                if (!a1dVar.a.g()) {
                    qn2 qn2Var = this.u;
                    try {
                        qn2Var.m(a1dVar, av8Var.C());
                        qn2Var.e();
                        qn2Var.d();
                    } catch (Throwable th3) {
                        qn2Var.d();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final raa v(eqf eqfVar, vu8 vu8Var, Object obj) {
        sg3 sg3Var;
        synchronized (this.d) {
            try {
                sg3 sg3Var2 = this.r;
                if (sg3Var2 != null) {
                    jlh jlhVar = this.f;
                    int i = this.s;
                    if (jlhVar.g) {
                        sf3.a("Writer is active");
                    }
                    if (i < 0 || i >= jlhVar.b) {
                        sf3.a("Invalid group index");
                    }
                    vu8 J = o02.J(vu8Var);
                    if (jlhVar.o(J)) {
                        int i2 = jlhVar.a[(i * 5) + 3] + i;
                        int i3 = J.a;
                        sg3Var = (i <= i3 && i3 < i2) ? sg3Var2 : null;
                    }
                    sg3Var2 = null;
                }
                if (sg3Var == null) {
                    av8 av8Var = this.v;
                    if (av8Var.F && av8Var.j0(eqfVar, obj)) {
                        return raa.d;
                    }
                    if (obj == null) {
                        this.n.m(eqfVar, hjg.g);
                    } else {
                        boolean z = obj instanceof ay4;
                        x0d x0dVar = this.n;
                        if (z) {
                            Object g = x0dVar.g(eqfVar);
                            if (g != null) {
                                if (g instanceof y0d) {
                                    y0d y0dVar = (y0d) g;
                                    Object[] objArr = y0dVar.b;
                                    long[] jArr = y0dVar.a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i4 = 0;
                                        loop0: while (true) {
                                            long j = jArr[i4];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                                for (int i6 = 0; i6 < i5; i6++) {
                                                    if ((255 & j) < 128 && objArr[(i4 << 3) + i6] == hjg.g) {
                                                        break loop0;
                                                    }
                                                    j >>= 8;
                                                }
                                                if (i5 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i4 == length) {
                                                break;
                                            }
                                            i4++;
                                        }
                                    }
                                } else if (g == hjg.g) {
                                }
                            }
                            t6a.l(this.n, eqfVar, obj);
                        } else {
                            x0dVar.m(eqfVar, hjg.g);
                        }
                    }
                }
                if (sg3Var != null) {
                    return sg3Var.v(eqfVar, vu8Var, obj);
                }
                this.a.n(this);
                return this.v.F ? raa.c : raa.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(Object obj) {
        Object g = this.g.g(obj);
        if (g == null) {
            return;
        }
        boolean z = g instanceof y0d;
        x0d x0dVar = this.m;
        if (!z) {
            eqf eqfVar = (eqf) g;
            if (eqfVar.b(obj) == raa.d) {
                t6a.l(x0dVar, obj, eqfVar);
                return;
            }
            return;
        }
        y0d y0dVar = (y0d) g;
        Object[] objArr = y0dVar.b;
        long[] jArr = y0dVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        eqf eqfVar2 = (eqf) objArr[(i << 3) + i3];
                        if (eqfVar2.b(obj) == raa.d) {
                            t6a.l(x0dVar, obj, eqfVar2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x(Set set) {
        boolean z = set instanceof srg;
        x0d x0dVar = this.j;
        x0d x0dVar2 = this.g;
        if (z) {
            y0d y0dVar = ((srg) set).a;
            Object[] objArr = y0dVar.b;
            long[] jArr = y0dVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (x0dVar2.c(obj) || x0dVar.c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            for (Object obj2 : set) {
                if (x0dVar2.c(obj2) || x0dVar.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean y() {
        synchronized (this.d) {
            fce fceVar = this.q;
            boolean z = false;
            if (fceVar != null && (fceVar.h.get() != hce.e || fceVar.i != waa.v())) {
                AtomicReference atomicReference = fceVar.h;
                hce hceVar = hce.f;
                hce hceVar2 = hce.d;
                while (!atomicReference.compareAndSet(hceVar, hceVar2) && atomicReference.get() == hceVar) {
                }
                ((tzc) fceVar.l.b).a(9);
                return false;
            }
            q();
            try {
                x0d x0dVar = this.n;
                this.n = t6a.t();
                try {
                    av8 av8Var = this.v;
                    vfh vfhVar = this.p;
                    evd evdVar = av8Var.e.k;
                    if (!evdVar.k0()) {
                        sf3.a("Expected applyChanges() to have been called");
                    }
                    if (x0dVar.e > 0 || !av8Var.s.isEmpty()) {
                        av8Var.P = vfhVar;
                        try {
                            av8Var.p(x0dVar, null);
                            av8Var.P = null;
                            z = !evdVar.k0();
                        } catch (Throwable th) {
                            av8Var.P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        r();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.n = x0dVar;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.e.a.g()) {
                        qn2 qn2Var = this.u;
                        try {
                            qn2Var.m(this.e, this.v.C());
                            qn2Var.e();
                            qn2Var.d();
                        } catch (Throwable th4) {
                            qn2Var.d();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    a();
                    throw th5;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object[]] */
    public final void z(srg srgVar) {
        srg srgVar2;
        while (true) {
            Object obj = this.c.get();
            if (obj == null || obj.equals(hkg.o)) {
                srgVar2 = srgVar;
            } else if (obj instanceof Set) {
                srgVar2 = new Set[]{obj, srgVar};
            } else {
                if (!(obj instanceof Object[])) {
                    pvd.z(this.c, "corrupt pendingModifications: ");
                    return;
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = srgVar;
                srgVar2 = copyOf;
            }
            AtomicReference atomicReference = this.c;
            while (!atomicReference.compareAndSet(obj, srgVar2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.d) {
                    r();
                    Unit unit = Unit.a;
                }
                return;
            }
            return;
        }
    }
}
