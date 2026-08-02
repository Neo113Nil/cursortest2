package defpackage;

import androidx.compose.runtime.e;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r60 implements twj {
    public final axj a;
    public io b;
    public ema c;
    public final e1d d = e.f(new c7a(0));
    public final x0d e;
    public owj f;

    public r60(axj axjVar, io ioVar, ema emaVar) {
        this.a = axjVar;
        this.b = ioVar;
        this.c = emaVar;
        long[] jArr = qrg.a;
        this.e = new x0d();
    }

    public static zo5 f(r60 r60Var, int i, j38 j38Var) {
        if (i == 0 || ((i == 4 && r60Var.c == ema.a) || (i == 5 && r60Var.c == ema.b))) {
            return uo5.m(j38Var, new q60(r60Var, 0));
        }
        int i2 = 1;
        if (i == 1 || ((i == 4 && r60Var.c == ema.b) || (i == 5 && r60Var.c == ema.a))) {
            return uo5.m(j38Var, new q60(r60Var, i2));
        }
        int i3 = 2;
        if (i == 2) {
            return uo5.n(j38Var, new q60(r60Var, i3));
        }
        return i == 3 ? uo5.n(j38Var, new q60(r60Var, 3)) : zo5.b;
    }

    public static of6 g(r60 r60Var, int i, j38 j38Var) {
        int i2 = 4;
        if (i != 0 && (i != 4 || r60Var.c != ema.a)) {
            int i3 = 5;
            if (i != 5 || r60Var.c != ema.b) {
                return (i == 1 || (i == 4 && r60Var.c == ema.b) || (i == 5 && r60Var.c == ema.a)) ? uo5.o(j38Var, new q60(r60Var, i3)) : i == 2 ? uo5.p(j38Var, new q60(r60Var, 6)) : i == 3 ? uo5.p(j38Var, new q60(r60Var, 7)) : of6.b;
            }
        }
        return uo5.o(j38Var, new q60(r60Var, i2));
    }

    @Override // defpackage.twj
    public final Object a() {
        return this.a.f().a();
    }

    @Override // defpackage.twj
    public final Object b() {
        return this.a.f().b();
    }

    public final long d(long j, long j2) {
        return this.b.a(j, j2, ema.a);
    }

    public final long e() {
        owj owjVar = this.f;
        return owjVar != null ? ((c7a) owjVar.getValue()).a : ((c7a) ((eoh) this.d).getValue()).a;
    }
}
