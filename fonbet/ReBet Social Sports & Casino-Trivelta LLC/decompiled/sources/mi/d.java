package mi;

import java.util.Locale;
import li.AbstractC5469c;
import oi.AbstractC5917m;
import oi.InterfaceC5902C;
import oi.M;
import oi.z;

/* loaded from: classes5.dex */
public abstract class d extends AbstractC5917m {

    /* renamed from: a, reason: collision with root package name */
    public final transient int f56618a;

    /* renamed from: b, reason: collision with root package name */
    public final transient int f56619b;

    /* renamed from: c, reason: collision with root package name */
    public final transient f f56620c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f56621d;

    /* renamed from: e, reason: collision with root package name */
    public final transient long f56622e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f56623f;

    public static class b implements z {

        /* renamed from: a, reason: collision with root package name */
        public final oi.p f56624a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f56625b;

        @Override // oi.z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public oi.p b(d dVar) {
            return this.f56624a;
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.p d(d dVar) {
            return this.f56624a;
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C5591b e(d dVar) {
            return C5591b.n(dVar.P() == 94 ? 56 : 60);
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C5591b i(d dVar) {
            return this.f56625b ? dVar.P() == 75 ? C5591b.n(10) : C5591b.n(1) : dVar.P() == 72 ? C5591b.n(22) : C5591b.n(1);
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C5591b p(d dVar) {
            return dVar.Z();
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public d q(d dVar, C5591b c5591b, boolean z10) {
            if (!isValid(dVar, c5591b)) {
                throw new IllegalArgumentException("Invalid cyclic year: " + c5591b);
            }
            net.time4j.calendar.b O10 = dVar.O();
            int p10 = dVar.p();
            f V10 = dVar.V();
            int number = c5591b.getNumber();
            int P10 = dVar.P();
            if (V10.c() && V10.getNumber() != O10.g(P10, number)) {
                V10 = f.d(V10.getNumber());
            }
            f fVar = V10;
            if (p10 <= 29) {
                return O10.e(P10, number, fVar, p10, O10.t(P10, number, fVar, p10));
            }
            long t10 = O10.t(P10, number, fVar, 1);
            int min = Math.min(p10, O10.b(t10).lengthOfMonth());
            return O10.e(P10, number, fVar, min, (t10 + min) - 1);
        }

        public b(oi.p pVar, boolean z10) {
            this.f56624a = pVar;
            this.f56625b = z10;
        }

        @Override // oi.z
        public boolean isValid(d dVar, C5591b c5591b) {
            return c5591b != null && i(dVar).compareTo(c5591b) <= 0 && e(dVar).compareTo(c5591b) >= 0;
        }
    }

    public static class c implements M {

        /* renamed from: a, reason: collision with root package name */
        public final int f56626a;

        public c(int i10) {
            this.f56626a = i10;
        }

        public static long e(d dVar, d dVar2, int i10) {
            int compareTo;
            d dVar3;
            d dVar4;
            int g10;
            net.time4j.calendar.b O10 = dVar.O();
            if (i10 == 0) {
                return e(dVar, dVar2, 1) / 60;
            }
            if (i10 == 1) {
                int P10 = (((dVar2.P() * 60) + dVar2.Z().getNumber()) - (dVar.P() * 60)) - dVar.Z().getNumber();
                if (P10 > 0) {
                    int compareTo2 = dVar.V().compareTo(dVar2.V());
                    if (compareTo2 > 0 || (compareTo2 == 0 && dVar.p() > dVar2.p())) {
                        P10--;
                    }
                } else if (P10 < 0 && ((compareTo = dVar.V().compareTo(dVar2.V())) < 0 || (compareTo == 0 && dVar.p() < dVar2.p()))) {
                    P10++;
                }
                return P10;
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    return (dVar2.b() - dVar.b()) / 7;
                }
                if (i10 == 4) {
                    return dVar2.b() - dVar.b();
                }
                throw new UnsupportedOperationException();
            }
            boolean J10 = dVar.J(dVar2);
            if (J10) {
                dVar4 = dVar;
                dVar3 = dVar2;
            } else {
                dVar3 = dVar;
                dVar4 = dVar2;
            }
            int P11 = dVar3.P();
            int number = dVar3.Z().getNumber();
            f V10 = dVar3.V();
            int number2 = V10.getNumber();
            boolean c10 = V10.c();
            int g11 = O10.g(P11, number);
            int i11 = 0;
            while (true) {
                if (P11 == dVar4.P() && number == dVar4.Z().getNumber() && V10.equals(dVar4.V())) {
                    break;
                }
                if (c10) {
                    number2++;
                    c10 = false;
                } else if (g11 == number2) {
                    c10 = true;
                } else {
                    number2++;
                }
                if (!c10) {
                    if (number2 == 13) {
                        number++;
                        if (number == 61) {
                            P11++;
                            number = 1;
                        }
                        g10 = O10.g(P11, number);
                        number2 = 1;
                    } else if (number2 == 0) {
                        number--;
                        if (number == 0) {
                            P11--;
                            number = 60;
                        }
                        g10 = O10.g(P11, number);
                        number2 = 12;
                    }
                    g11 = g10;
                }
                V10 = f.d(number2);
                if (c10) {
                    V10 = V10.e();
                }
                i11++;
            }
            if (i11 > 0 && dVar3.p() > dVar4.p()) {
                i11--;
            }
            if (J10) {
                i11 = -i11;
            }
            return i11;
        }

        public static void f(long j10) {
            if (j10 > 1200 || j10 < -1200) {
                throw new ArithmeticException("Month arithmetic limited to delta not greater than 1200.");
            }
        }

        public static d g(int i10, int i11, f fVar, int i12, net.time4j.calendar.b bVar) {
            if (i12 <= 29) {
                return bVar.e(i10, i11, fVar, i12, bVar.t(i10, i11, fVar, i12));
            }
            long t10 = bVar.t(i10, i11, fVar, 1);
            int min = Math.min(i12, bVar.b(t10).lengthOfMonth());
            return bVar.e(i10, i11, fVar, min, (t10 + min) - 1);
        }

        @Override // oi.M
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d b(d dVar, long j10) {
            int i10;
            long j11 = j10;
            net.time4j.calendar.b O10 = dVar.O();
            int p10 = dVar.p();
            int P10 = dVar.P();
            int number = dVar.Z().getNumber();
            f V10 = dVar.V();
            int i11 = this.f56626a;
            int i12 = 1;
            if (i11 == 0) {
                j11 = AbstractC5469c.i(j11, 60L);
            } else if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        j11 = AbstractC5469c.i(j11, 7L);
                    } else if (i11 != 4) {
                        throw new UnsupportedOperationException();
                    }
                    return O10.b(AbstractC5469c.f(dVar.b(), j11));
                }
                f(j11);
                int i13 = j11 > 0 ? 1 : -1;
                int number2 = V10.getNumber();
                boolean c10 = V10.c();
                int g10 = O10.g(P10, number);
                for (long j12 = 0; j11 != j12; j12 = 0) {
                    if (c10) {
                        c10 = false;
                        if (i13 == i12) {
                            number2++;
                        }
                        i10 = i12;
                    } else if (i13 == i12 && g10 == number2) {
                        c10 = i12;
                        i10 = c10;
                    } else {
                        if (i13 == -1) {
                            i10 = i12;
                            if (g10 == number2 - 1) {
                                number2--;
                                c10 = i10;
                            }
                        } else {
                            i10 = i12;
                        }
                        number2 += i13;
                    }
                    if (!c10) {
                        if (number2 == 13) {
                            number++;
                            if (number == 61) {
                                P10++;
                                number = i10;
                            }
                            g10 = O10.g(P10, number);
                            number2 = i10;
                        } else if (number2 == 0) {
                            number--;
                            if (number == 0) {
                                P10--;
                                number = 60;
                            }
                            number2 = 12;
                            g10 = O10.g(P10, number);
                        }
                    }
                    j11 -= i13;
                    i12 = i10;
                }
                f d10 = f.d(number2);
                if (c10) {
                    d10 = d10.e();
                }
                return g(P10, number, d10, p10, O10);
            }
            long f10 = AbstractC5469c.f(((P10 * 60) + number) - 1, j11);
            int g11 = AbstractC5469c.g(AbstractC5469c.b(f10, 60));
            int d11 = AbstractC5469c.d(f10, 60) + 1;
            if (V10.c() && O10.g(g11, d11) != V10.getNumber()) {
                V10 = f.d(V10.getNumber());
            }
            return g(g11, d11, V10, p10, O10);
        }

        @Override // oi.M
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(d dVar, d dVar2) {
            return e(dVar, dVar2, this.f56626a);
        }
    }

    /* renamed from: mi.d$d, reason: collision with other inner class name */
    public static class C0827d implements InterfaceC5902C {

        /* renamed from: a, reason: collision with root package name */
        public final oi.p f56627a;

        /* renamed from: b, reason: collision with root package name */
        public final int f56628b;

        @Override // oi.z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public oi.p b(d dVar) {
            return this.f56627a;
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.p d(d dVar) {
            return this.f56627a;
        }

        @Override // oi.InterfaceC5902C
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public int n(d dVar) {
            int i10 = this.f56628b;
            if (i10 == 0) {
                return dVar.p();
            }
            if (i10 == 1) {
                return dVar.S();
            }
            if (i10 == 2) {
                int number = dVar.V().getNumber();
                int U10 = dVar.U();
                return ((U10 <= 0 || U10 >= number) && !dVar.V().c()) ? number : number + 1;
            }
            if (i10 == 3) {
                return dVar.P();
            }
            throw new UnsupportedOperationException("Unknown element index: " + this.f56628b);
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer e(d dVar) {
            int lengthOfMonth;
            int i10 = this.f56628b;
            if (i10 == 0) {
                lengthOfMonth = dVar.lengthOfMonth();
            } else if (i10 == 1) {
                lengthOfMonth = dVar.lengthOfYear();
            } else if (i10 == 2) {
                lengthOfMonth = dVar.isLeapYear() ? 13 : 12;
            } else {
                if (i10 != 3) {
                    throw new UnsupportedOperationException("Unknown element index: " + this.f56628b);
                }
                net.time4j.calendar.b O10 = dVar.O();
                lengthOfMonth = ((d) O10.b(O10.a())).P();
            }
            return Integer.valueOf(lengthOfMonth);
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer i(d dVar) {
            if (this.f56628b != 3) {
                return 1;
            }
            net.time4j.calendar.b O10 = dVar.O();
            return Integer.valueOf(((d) O10.b(O10.d())).P());
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer p(d dVar) {
            return Integer.valueOf(n(dVar));
        }

        @Override // oi.InterfaceC5902C
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public d h(d dVar, int i10, boolean z10) {
            int i11 = this.f56628b;
            if (i11 == 0) {
                if (z10) {
                    return dVar.O().b((dVar.b() + i10) - dVar.p());
                }
                if (i10 >= 1 && i10 <= 30 && (i10 != 30 || dVar.lengthOfMonth() >= 30)) {
                    return dVar.O().e(dVar.P(), dVar.Z().getNumber(), dVar.V(), i10, (dVar.b() + i10) - dVar.p());
                }
                throw new IllegalArgumentException("Day of month out of range: " + i10);
            }
            if (i11 == 1) {
                if (z10 || (i10 >= 1 && i10 <= dVar.lengthOfYear())) {
                    return dVar.O().b((dVar.b() + i10) - dVar.S());
                }
                throw new IllegalArgumentException("Day of year out of range: " + i10);
            }
            boolean z11 = false;
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new UnsupportedOperationException("Unknown element index: " + this.f56628b);
                }
                if (isValid(dVar, i10)) {
                    return (d) d.Y(0).b(dVar, i10 - dVar.P());
                }
                throw new IllegalArgumentException("Sexagesimal cycle out of range: " + i10);
            }
            if (!isValid(dVar, i10)) {
                throw new IllegalArgumentException("Ordinal month out of range: " + i10);
            }
            int U10 = dVar.U();
            if (U10 > 0 && U10 < i10) {
                boolean z12 = i10 == U10 + 1;
                i10--;
                z11 = z12;
            }
            f d10 = f.d(i10);
            if (z11) {
                d10 = d10.e();
            }
            return e.k(dVar, d10);
        }

        @Override // oi.z
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public d q(d dVar, Integer num, boolean z10) {
            if (num != null) {
                return h(dVar, num.intValue(), z10);
            }
            throw new IllegalArgumentException("Missing element value.");
        }

        public C0827d(int i10, oi.p pVar) {
            this.f56628b = i10;
            this.f56627a = pVar;
        }

        @Override // oi.InterfaceC5902C
        public boolean isValid(d dVar, int i10) {
            if (i10 < 1) {
                return false;
            }
            int i11 = this.f56628b;
            if (i11 == 0) {
                if (i10 > 30) {
                    return false;
                }
                return i10 != 30 || dVar.lengthOfMonth() == 30;
            }
            if (i11 == 1) {
                return i10 <= dVar.lengthOfYear();
            }
            if (i11 == 2) {
                return i10 <= 12 || (i10 == 13 && dVar.U() > 0);
            }
            if (i11 == 3) {
                net.time4j.calendar.b O10 = dVar.O();
                return i10 >= ((d) O10.b(O10.d())).P() && i10 <= ((d) O10.b(O10.a())).P();
            }
            throw new UnsupportedOperationException("Unknown element index: " + this.f56628b);
        }

        @Override // oi.InterfaceC5902C, oi.z
        public boolean isValid(d dVar, Integer num) {
            return num != null && isValid(dVar, num.intValue());
        }
    }

    public static class e implements z {

        /* renamed from: a, reason: collision with root package name */
        public final oi.p f56629a;

        public static d k(d dVar, f fVar) {
            net.time4j.calendar.b O10 = dVar.O();
            int p10 = dVar.p();
            int number = dVar.Z().getNumber();
            if (p10 <= 29) {
                return O10.e(dVar.P(), number, fVar, p10, O10.t(dVar.P(), number, fVar, p10));
            }
            long t10 = O10.t(dVar.P(), number, fVar, 1);
            int min = Math.min(p10, O10.b(t10).lengthOfMonth());
            return O10.e(dVar.P(), number, fVar, min, (t10 + min) - 1);
        }

        @Override // oi.z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public oi.p b(d dVar) {
            return this.f56629a;
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.p d(d dVar) {
            return this.f56629a;
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public f e(d dVar) {
            return f.d(12);
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public f i(d dVar) {
            return f.d(1);
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public f p(d dVar) {
            return dVar.V();
        }

        @Override // oi.z
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public d q(d dVar, f fVar, boolean z10) {
            if (isValid(dVar, fVar)) {
                return k(dVar, fVar);
            }
            throw new IllegalArgumentException("Invalid month: " + fVar);
        }

        public e(oi.p pVar) {
            this.f56629a = pVar;
        }

        @Override // oi.z
        public boolean isValid(d dVar, f fVar) {
            if (fVar != null) {
                return !fVar.c() || fVar.getNumber() == dVar.U();
            }
            return false;
        }
    }

    public d(int i10, int i11, f fVar, int i12, long j10) {
        this.f56618a = i10;
        this.f56619b = i11;
        this.f56620c = fVar;
        this.f56621d = i12;
        this.f56622e = j10;
        this.f56623f = O().g(i10, i11);
    }

    public static z Q(oi.p pVar) {
        return new C0827d(3, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static z R() {
        return new C0827d(0, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static z T() {
        return new C0827d(1, null);
    }

    public static z W(oi.p pVar) {
        return new C0827d(2, pVar);
    }

    public static z X(oi.p pVar) {
        return new e(pVar);
    }

    public static M Y(int i10) {
        return new c(i10);
    }

    public static z a0(oi.p pVar) {
        return new b(pVar, false);
    }

    public abstract net.time4j.calendar.b O();

    public int P() {
        return this.f56618a;
    }

    public int S() {
        return (int) ((this.f56622e - O().q(this.f56618a, this.f56619b)) + 1);
    }

    public int U() {
        return this.f56623f;
    }

    public f V() {
        return this.f56620c;
    }

    public C5591b Z() {
        return C5591b.n(this.f56619b);
    }

    @Override // oi.AbstractC5917m, oi.InterfaceC5911g
    public long b() {
        return this.f56622e;
    }

    @Override // oi.AbstractC5917m
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f56618a == dVar.f56618a && this.f56619b == dVar.f56619b && this.f56621d == dVar.f56621d && this.f56620c.equals(dVar.f56620c) && this.f56622e == dVar.f56622e) {
                return true;
            }
        }
        return false;
    }

    @Override // oi.AbstractC5917m
    public int hashCode() {
        long j10 = this.f56622e;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public boolean isLeapYear() {
        return this.f56623f > 0;
    }

    public int lengthOfMonth() {
        return (int) (((this.f56621d + O().p(this.f56622e + 1)) - this.f56622e) - 1);
    }

    public int lengthOfYear() {
        int i10 = this.f56618a;
        int i11 = 1;
        int i12 = this.f56619b + 1;
        if (i12 > 60) {
            i10++;
        } else {
            i11 = i12;
        }
        return (int) (O().q(i10, i11) - O().q(this.f56618a, this.f56619b));
    }

    public int p() {
        return this.f56621d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String value = ((net.time4j.format.c) getClass().getAnnotation(net.time4j.format.c.class)).value();
        if (value.equals("dangi")) {
            value = "korean";
        }
        sb2.append(value);
        sb2.append('[');
        sb2.append(Z().g(Locale.ROOT));
        sb2.append('(');
        sb2.append(e(net.time4j.calendar.a.f57761a));
        sb2.append(")-");
        sb2.append(this.f56620c.toString());
        sb2.append('-');
        if (this.f56621d < 10) {
            sb2.append('0');
        }
        sb2.append(this.f56621d);
        sb2.append(']');
        return sb2.toString();
    }
}
