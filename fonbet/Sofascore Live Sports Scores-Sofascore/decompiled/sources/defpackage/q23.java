package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class q23 {
    public static final ff5 a = new ff5(1, new wl2(22));

    public static final long a(p23 p23Var, long j) {
        long b = p23Var.b();
        e1d e1dVar = p23Var.i;
        e1d e1dVar2 = p23Var.h;
        int i = r13.j;
        return e8k.a(j, b) ? ((r13) ((eoh) e1dVar2).getValue()).a : e8k.a(j, ((r13) ((eoh) p23Var.b).getValue()).a) ? ((r13) ((eoh) e1dVar2).getValue()).a : e8k.a(j, ((r13) ((eoh) p23Var.c).getValue()).a) ? ((r13) ((eoh) e1dVar).getValue()).a : e8k.a(j, ((r13) ((eoh) p23Var.d).getValue()).a) ? ((r13) ((eoh) e1dVar).getValue()).a : e8k.a(j, ((r13) ((eoh) p23Var.e).getValue()).a) ? ((r13) ((eoh) p23Var.j).getValue()).a : e8k.a(j, p23Var.c()) ? p23Var.a() : e8k.a(j, ((r13) ((eoh) p23Var.g).getValue()).a) ? ((r13) ((eoh) p23Var.l).getValue()).a : r13.i;
    }

    public static final long b(long j, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.d0(-583917585);
        long a2 = a((p23) av8Var.k(a), j);
        if (a2 == 16) {
            a2 = ((r13) av8Var.k(mo3.a)).a;
        }
        av8Var.s(false);
        return a2;
    }

    public static p23 c(int i, long j, long j2, long j3) {
        long d = (i & 1) != 0 ? hkg.d(4284612846L) : j;
        long d2 = (i & 2) != 0 ? hkg.d(4281794739L) : j2;
        long d3 = (i & 4) != 0 ? hkg.d(4278442694L) : j3;
        long d4 = hkg.d(4278290310L);
        long j4 = r13.d;
        long d5 = hkg.d(4289724448L);
        long j5 = r13.b;
        return new p23(d, d2, d3, d4, j4, j4, d5, j4, j5, j5, j5, j4, true);
    }
}
