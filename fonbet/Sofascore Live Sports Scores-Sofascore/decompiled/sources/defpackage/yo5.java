package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yo5 extends o9a {
    public final xo5 A;
    public axj p;
    public pwj q;
    public pwj r;
    public pwj s;
    public zo5 t;
    public of6 u;
    public Function0 v;
    public ro5 w;
    public long x;
    public io y;
    public final xo5 z;

    public yo5(axj axjVar, pwj pwjVar, pwj pwjVar2, pwj pwjVar3, zo5 zo5Var, of6 of6Var, Function0 function0, ro5 ro5Var) {
        super(1);
        this.p = axjVar;
        this.q = pwjVar;
        this.r = pwjVar2;
        this.s = pwjVar3;
        this.t = zo5Var;
        this.u = of6Var;
        this.v = function0;
        this.w = ro5Var;
        this.x = -9223372034707292160L;
        cn3.b(0, 0, 0, 0, 15);
        this.z = new xo5(this, 0);
        this.A = new xo5(this, 1);
    }

    @Override // defpackage.wtc
    public final void c1() {
        this.x = -9223372034707292160L;
    }

    @Override // defpackage.o9a, defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        long j2;
        owj owjVar;
        char c;
        owj owjVar2;
        xvj xvjVar;
        if (this.p.a.w() == ((eoh) this.p.d).getValue()) {
            this.y = null;
        } else if (this.y == null) {
            io m1 = m1();
            if (m1 == null) {
                m1 = uxf.c;
            }
            this.y = m1;
        }
        if (m1cVar.W()) {
            qhe J = g1cVar.J(j);
            long j3 = (J.a << 32) | (J.b & 4294967295L);
            this.x = j3;
            return m1c.G0(m1cVar, (int) (j3 >> 32), (int) (j3 & 4294967295L), new jy(J, 5));
        }
        if (!((Boolean) this.v.invoke()).booleanValue()) {
            qhe J2 = g1cVar.J(j);
            return m1c.G0(m1cVar, J2.a, J2.b, new jy(J2, 6));
        }
        ro5 ro5Var = this.w;
        pwj pwjVar = ro5Var.a;
        pwj pwjVar2 = ro5Var.b;
        axj axjVar = ro5Var.c;
        zo5 zo5Var = ro5Var.d;
        bxj bxjVar = zo5Var.a;
        of6 of6Var = ro5Var.e;
        pwj pwjVar3 = ro5Var.f;
        if (pwjVar != null) {
            j2 = 4294967295L;
            owjVar = pwjVar.a(new so5(zo5Var, of6Var, 0), new so5(zo5Var, of6Var, 1));
        } else {
            j2 = 4294967295L;
            owjVar = null;
        }
        if (pwjVar2 != null) {
            c = ' ';
            owjVar2 = pwjVar2.a(new so5(zo5Var, of6Var, 2), new so5(zo5Var, of6Var, 3));
        } else {
            c = ' ';
            owjVar2 = null;
        }
        if (axjVar.a.w() == po5.a) {
            krg krgVar = bxjVar.d;
            if (krgVar != null) {
                xvjVar = new xvj(krgVar.b);
            } else {
                krg krgVar2 = of6Var.a.d;
                if (krgVar2 != null) {
                    xvjVar = new xvj(krgVar2.b);
                }
                xvjVar = null;
            }
        } else {
            krg krgVar3 = of6Var.a.d;
            if (krgVar3 != null) {
                xvjVar = new xvj(krgVar3.b);
            } else {
                krg krgVar4 = bxjVar.d;
                if (krgVar4 != null) {
                    xvjVar = new xvj(krgVar4.b);
                }
                xvjVar = null;
            }
        }
        x40 x40Var = new x40(4, owjVar, owjVar2, pwjVar3 != null ? pwjVar3.a(s84.o, new x40(5, xvjVar, zo5Var, of6Var)) : null);
        qhe J3 = g1cVar.J(j);
        long j4 = (J3.b & j2) | (J3.a << c);
        long j5 = !c7a.a(this.x, -9223372034707292160L) ? this.x : j4;
        pwj pwjVar4 = this.q;
        owj a = pwjVar4 != null ? pwjVar4.a(this.z, new wo5(this, j5, 0)) : null;
        if (a != null) {
            j4 = ((c7a) a.getValue()).a;
        }
        long d = cn3.d(j, j4);
        pwj pwjVar5 = this.r;
        long j6 = pwjVar5 != null ? ((r6a) pwjVar5.a(s84.s, new wo5(this, j5, 1)).getValue()).a : 0L;
        pwj pwjVar6 = this.s;
        long j7 = pwjVar6 != null ? ((r6a) pwjVar6.a(this.A, new wo5(this, j5, 2)).getValue()).a : 0L;
        io ioVar = this.y;
        return m1c.G0(m1cVar, (int) (d >> c), (int) (d & j2), new vo5(J3, r6a.d(ioVar != null ? ioVar.a(j5, d, ema.a) : 0L, j7), j6, x40Var));
    }

    public final io m1() {
        io ioVar;
        io ioVar2;
        if (this.p.f().c(po5.a, po5.b)) {
            in2 in2Var = this.t.a.c;
            if (in2Var != null && (ioVar2 = in2Var.a) != null) {
                return ioVar2;
            }
            in2 in2Var2 = this.u.a.c;
            if (in2Var2 != null) {
                return in2Var2.a;
            }
            return null;
        }
        in2 in2Var3 = this.u.a.c;
        if (in2Var3 != null && (ioVar = in2Var3.a) != null) {
            return ioVar;
        }
        in2 in2Var4 = this.t.a.c;
        if (in2Var4 != null) {
            return in2Var4.a;
        }
        return null;
    }
}
