package net.time4j;

import li.AbstractC5468b;
import li.AbstractC5469c;
import oi.EnumC5900A;

/* loaded from: classes5.dex */
public final class b0 extends AbstractC5701a {

    /* renamed from: f, reason: collision with root package name */
    public static final oi.M f57725f = new c();

    /* renamed from: g, reason: collision with root package name */
    public static final b0 f57726g = new b0("YEAR_OF_WEEKDATE");
    private static final long serialVersionUID = -6907291758376370420L;

    /* renamed from: d, reason: collision with root package name */
    public final transient AbstractC5722o f57727d;

    /* renamed from: e, reason: collision with root package name */
    public final transient AbstractC5722o f57728e;

    public static class b implements oi.z {
        public b() {
        }

        private oi.p a() {
            return a0.f57689m.n();
        }

        public static F l(F f10, int i10) {
            int F10 = b0.F(i10);
            int I10 = b0.I(f10);
            long i11 = EnumC5900A.UNIX.i(AbstractC5468b.i(i10, 1, 1), EnumC5900A.MODIFIED_JULIAN_DATE) + (F10 - 1) + ((I10 - 1) * 7) + (f10.u0().c(a0.f57689m) - 1);
            if (I10 == 53) {
                if (((b0.F(i10 + 1) + (AbstractC5468b.e(i10) ? 366 : 365)) - F10) / 7 < 53) {
                    i11 -= 7;
                }
            }
            return f10.M0(i11 - 730);
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.p b(oi.q qVar) {
            return a();
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public oi.p d(oi.q qVar) {
            return a();
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer e(oi.q qVar) {
            return b0.f57726g.c();
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer i(oi.q qVar) {
            return b0.f57726g.d0();
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer p(oi.q qVar) {
            F f10 = (F) qVar.j(F.f57534l);
            int n10 = f10.n();
            int v02 = f10.v0();
            int G10 = b0.G(f10, 0);
            if (G10 > v02) {
                n10--;
            } else if (((v02 - G10) / 7) + 1 >= 53 && b0.G(f10, 1) + b0.H(f10, 0) <= v02) {
                n10++;
            }
            return Integer.valueOf(n10);
        }

        @Override // oi.z
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public oi.q q(oi.q qVar, Integer num, boolean z10) {
            if (num == null) {
                throw new IllegalArgumentException("Missing element value.");
            }
            oi.p pVar = F.f57534l;
            return qVar.y(pVar, l((F) qVar.j(pVar), num.intValue()));
        }

        @Override // oi.z
        public boolean isValid(oi.q qVar, Integer num) {
            int intValue;
            return num != null && (intValue = num.intValue()) >= -999999999 && intValue <= 999999999;
        }
    }

    public static class c implements oi.M {
        public c() {
        }

        @Override // oi.M
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.q b(oi.q qVar, long j10) {
            if (j10 == 0) {
                return qVar;
            }
            int g10 = AbstractC5469c.g(AbstractC5469c.f(((Integer) qVar.j(b0.f57726g)).intValue(), j10));
            oi.p pVar = F.f57534l;
            F f10 = (F) qVar.j(pVar);
            int y02 = f10.y0();
            Y u02 = f10.u0();
            if (y02 == 53) {
                y02 = ((Integer) F.D0(g10, 26, u02).c(a0.f57689m.n())).intValue();
            }
            return qVar.y(pVar, F.D0(g10, y02, u02));
        }

        @Override // oi.M
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(oi.q qVar, oi.q qVar2) {
            oi.p pVar = F.f57534l;
            F f10 = (F) qVar.j(pVar);
            F f11 = (F) qVar2.j(pVar);
            b0 b0Var = b0.f57726g;
            long intValue = ((Integer) f11.j(b0Var)).intValue() - ((Integer) f10.j(b0Var)).intValue();
            if (intValue == 0) {
                return intValue;
            }
            int I10 = b0.I(f10);
            int I11 = b0.I(f11);
            if (intValue > 0 && I10 > I11) {
                intValue--;
            } else if (intValue < 0 && I10 < I11) {
                intValue++;
            }
            if (intValue == 0 || I10 != I11) {
                return intValue;
            }
            int b10 = f10.u0().b();
            int b11 = f11.u0().b();
            if (intValue > 0 && b10 > b11) {
                intValue--;
            } else if (intValue < 0 && b10 < b11) {
                intValue++;
            }
            if (intValue == 0 || b10 != b11) {
                return intValue;
            }
            oi.p pVar2 = G.f57584n;
            if (!qVar.f(pVar2) || !qVar2.f(pVar2)) {
                return intValue;
            }
            G g10 = (G) qVar.j(pVar2);
            G g11 = (G) qVar2.j(pVar2);
            return (intValue <= 0 || !g10.r0(g11)) ? (intValue >= 0 || !g10.s0(g11)) ? intValue : intValue + 1 : intValue - 1;
        }
    }

    public static class d extends AbstractC5722o {

        /* renamed from: c, reason: collision with root package name */
        public final long f57729c;

        /* renamed from: d, reason: collision with root package name */
        public final oi.v f57730d;

        public class a implements oi.v {
            public a() {
            }

            @Override // oi.v
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public H apply(H h10) {
                return (H) b0.J().b(h10, d.this.f57729c);
            }
        }

        @Override // oi.v
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public F apply(F f10) {
            return (F) b0.J().b(f10, this.f57729c);
        }

        public d(long j10) {
            super(b0.f57726g, 8);
            this.f57729c = j10;
            this.f57730d = new a();
        }
    }

    public b0(String str) {
        super(str);
        this.f57727d = new d(-1L);
        this.f57728e = new d(1L);
    }

    public static oi.z C(Class cls) {
        return new b();
    }

    public static int F(int i10) {
        Y f10 = Y.f(AbstractC5468b.c(i10, 1, 1));
        a0 a0Var = a0.f57689m;
        int c10 = f10.c(a0Var);
        return c10 <= 8 - a0Var.g() ? 2 - c10 : 9 - c10;
    }

    public static int G(F f10, int i10) {
        return F(f10.n() + i10);
    }

    public static int H(F f10, int i10) {
        return AbstractC5468b.e(f10.n() + i10) ? 366 : 365;
    }

    public static int I(F f10) {
        int v02 = f10.v0();
        int G10 = G(f10, 0);
        if (G10 > v02) {
            return (((v02 + H(f10, -1)) - G(f10, -1)) / 7) + 1;
        }
        int i10 = ((v02 - G10) / 7) + 1;
        if (i10 < 53 || G(f10, 1) + H(f10, 0) > v02) {
            return i10;
        }
        return 1;
    }

    public static oi.M J() {
        return f57725f;
    }

    private Object readResolve() {
        return f57726g;
    }

    @Override // oi.p
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public Integer c() {
        return F.f57529g;
    }

    @Override // oi.p
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public Integer d0() {
        return F.f57528f;
    }

    @Override // oi.p
    public boolean Y() {
        return true;
    }

    @Override // oi.AbstractC5909e, oi.p
    public char a() {
        return 'Y';
    }

    @Override // oi.p
    public boolean e0() {
        return false;
    }

    @Override // oi.p
    public Class getType() {
        return Integer.class;
    }

    @Override // oi.AbstractC5909e
    public boolean w() {
        return true;
    }
}
