package mi;

import li.AbstractC5469c;
import net.time4j.Y;
import oi.EnumC5900A;
import oi.InterfaceC5902C;
import oi.InterfaceC5911g;
import oi.v;
import oi.z;

/* loaded from: classes5.dex */
public final class p extends ni.f implements j {
    private static final long serialVersionUID = 4275169663905222176L;

    /* renamed from: h, reason: collision with root package name */
    public final transient oi.p f56691h;

    /* renamed from: i, reason: collision with root package name */
    public final transient oi.p f56692i;

    public static class b implements v {

        /* renamed from: a, reason: collision with root package name */
        public final p f56694a;

        /* renamed from: b, reason: collision with root package name */
        public final long f56695b;

        /* renamed from: c, reason: collision with root package name */
        public final Y f56696c;

        public b(p pVar, int i10, Y y10) {
            if (y10 == null) {
                throw new NullPointerException("Missing value.");
            }
            this.f56694a = pVar;
            this.f56695b = i10;
            this.f56696c = y10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oi.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public oi.q apply(oi.q qVar) {
            long a10;
            Y y10 = (Y) qVar.j(this.f56694a.f56692i);
            int e10 = qVar.e(this.f56694a.f56691h);
            if (this.f56695b == 2147483647L) {
                int intValue = ((Integer) qVar.c(this.f56694a.f56691h)).intValue() - e10;
                int b10 = y10.b() + (intValue % 7);
                if (b10 > 7) {
                    b10 -= 7;
                }
                int b11 = this.f56696c.b() - b10;
                a10 = intValue + b11;
                if (b11 > 0) {
                    a10 -= 7;
                }
            } else {
                a10 = ((this.f56695b - (AbstractC5469c.a((e10 + r2) - 1, 7) + 1)) * 7) + (this.f56696c.b() - y10.b());
            }
            return qVar.x(EnumC5900A.UTC, ((InterfaceC5911g) qVar).b() + a10);
        }
    }

    public static class c implements v {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f56697a;

        public c(boolean z10) {
            this.f56697a = z10;
        }

        @Override // oi.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public oi.q apply(oi.q qVar) {
            EnumC5900A enumC5900A = EnumC5900A.UTC;
            long longValue = ((Long) qVar.j(enumC5900A)).longValue();
            return qVar.x(enumC5900A, this.f56697a ? longValue - 7 : longValue + 7);
        }
    }

    public p(Class cls, oi.p pVar, oi.p pVar2) {
        super("WEEKDAY_IN_MONTH", cls, 1, ((Integer) pVar.c()).intValue() / 7, 'F', new c(true), new c(false));
        this.f56691h = pVar;
        this.f56692i = pVar2;
    }

    public static z C(p pVar) {
        return new a(pVar);
    }

    public v D(int i10, Y y10) {
        return new b(this, i10, y10);
    }

    public static class a implements InterfaceC5902C {

        /* renamed from: a, reason: collision with root package name */
        public final p f56693a;

        public a(p pVar) {
            this.f56693a = pVar;
        }

        @Override // oi.z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public oi.p b(oi.q qVar) {
            return null;
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.p d(oi.q qVar) {
            return null;
        }

        @Override // oi.InterfaceC5902C
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public int n(oi.q qVar) {
            return AbstractC5469c.a(qVar.e(this.f56693a.f56691h) - 1, 7) + 1;
        }

        public final int g(oi.q qVar) {
            int e10 = qVar.e(this.f56693a.f56691h);
            while (true) {
                int i10 = e10 + 7;
                if (i10 > ((Integer) qVar.c(this.f56693a.f56691h)).intValue()) {
                    return AbstractC5469c.a(e10 - 1, 7) + 1;
                }
                e10 = i10;
            }
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer e(oi.q qVar) {
            return Integer.valueOf(g(qVar));
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer i(oi.q qVar) {
            return 1;
        }

        @Override // oi.z
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer p(oi.q qVar) {
            return Integer.valueOf(n(qVar));
        }

        @Override // oi.InterfaceC5902C
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public oi.q h(oi.q qVar, int i10, boolean z10) {
            if (isValid(qVar, i10)) {
                return qVar.z(this.f56693a.D(i10, (Y) qVar.j(this.f56693a.f56692i)));
            }
            throw new IllegalArgumentException("Invalid value: " + i10);
        }

        @Override // oi.z
        public oi.q q(oi.q qVar, Integer num, boolean z10) {
            if (num != null) {
                return h(qVar, num.intValue(), z10);
            }
            throw new IllegalArgumentException("Missing value.");
        }

        @Override // oi.InterfaceC5902C, oi.z
        public boolean isValid(oi.q qVar, Integer num) {
            return num != null && isValid(qVar, num.intValue());
        }

        @Override // oi.InterfaceC5902C
        public boolean isValid(oi.q qVar, int i10) {
            return i10 >= 1 && i10 <= g(qVar);
        }
    }
}
