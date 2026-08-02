package net.time4j.history;

import java.io.InvalidObjectException;
import java.text.ParsePosition;
import java.util.List;
import java.util.Locale;
import li.AbstractC5469c;
import li.InterfaceC5467a;
import net.time4j.B;
import net.time4j.F;
import net.time4j.format.s;
import net.time4j.format.v;
import oi.AbstractC5909e;
import oi.C5912h;
import oi.InterfaceC5907c;
import oi.InterfaceC5908d;
import oi.q;
import oi.r;
import oi.x;
import oi.z;
import pi.InterfaceC6081a;

/* loaded from: classes5.dex */
public final class l extends net.time4j.history.internal.c implements InterfaceC6081a {
    private static final long serialVersionUID = -6283098762945747308L;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f58221f;
    private final d history;

    public static class a implements z {

        /* renamed from: a, reason: collision with root package name */
        public final int f58222a;

        /* renamed from: b, reason: collision with root package name */
        public final d f58223b;

        public a(int i10, d dVar) {
            this.f58222a = i10;
            this.f58223b = dVar;
        }

        public final h a(q qVar, int i10) {
            h e10 = this.f58223b.e((F) qVar.j(F.f57535m));
            p pVar = p.DUAL_DATING;
            o v10 = this.f58223b.v();
            int i11 = this.f58222a;
            switch (i11) {
                case 2:
                    break;
                case 3:
                    return this.f58223b.a(h.g(e10.c(), e10.e(), i10, e10.b()));
                case 4:
                    return h.g(e10.c(), e10.e(), e10.d(), i10);
                case 5:
                    int f10 = e10.f(this.f58223b.v());
                    h m10 = this.f58223b.m(e10.c(), f10);
                    int u10 = this.f58223b.u(e10.c(), f10);
                    if (i10 == 1) {
                        return m10;
                    }
                    if (i10 > 1 && i10 <= u10) {
                        return this.f58223b.e((F) this.f58223b.d(m10).L(C5912h.c(i10 - 1)));
                    }
                    throw new IllegalArgumentException("Out of range: " + i10);
                case 6:
                case 7:
                    pVar = i11 == 6 ? p.AFTER_NEW_YEAR : p.BEFORE_NEW_YEAR;
                    break;
                case 8:
                    int e11 = e10.e() % 100;
                    return this.f58223b.a(h.h(e10.c(), ((i10 - 1) * 100) + (e11 != 0 ? e11 : 100), e10.d(), e10.b(), pVar, v10));
                default:
                    throw new UnsupportedOperationException("Unknown element index: " + this.f58222a);
            }
            return this.f58223b.a(h.h(e10.c(), i10, e10.d(), e10.b(), pVar, v10));
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.p b(q qVar) {
            throw new UnsupportedOperationException("Never called.");
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public oi.p d(q qVar) {
            throw new UnsupportedOperationException("Never called.");
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer e(q qVar) {
            h a10;
            int i10;
            try {
                h e10 = this.f58223b.e((F) qVar.j(F.f57535m));
                int i11 = 8;
                int i12 = 999984973;
                switch (this.f58222a) {
                    case 2:
                    case 6:
                    case 7:
                    case 8:
                        d dVar = this.f58223b;
                        if (dVar != d.f58163s) {
                            if (dVar == d.f58162r) {
                                i12 = e10.c() == j.BC ? 999979466 : 999979465;
                            } else if (dVar == d.f58161q) {
                                i12 = e10.c() == j.BC ? 1000000000 : 999999999;
                            } else {
                                i12 = e10.c() == j.BC ? 45 : 9999;
                            }
                        }
                        if (this.f58222a == 8) {
                            i12 = ((i12 - 1) / 100) + 1;
                        }
                        return Integer.valueOf(i12);
                    case 3:
                        if (e10.c() != j.BYZANTINE || e10.e() != 999984973) {
                            i11 = 12;
                        }
                        a10 = a(qVar, i11);
                        i10 = i11;
                        break;
                    case 4:
                        i10 = this.f58223b.k(e10).b(e10);
                        a10 = a(qVar, i10);
                        break;
                    case 5:
                        int u10 = this.f58223b.u(e10.c(), e10.f(this.f58223b.v()));
                        if (u10 != -1) {
                            return Integer.valueOf(u10);
                        }
                        throw new r("Length of historic year undefined.");
                    default:
                        throw new UnsupportedOperationException("Unknown element index: " + this.f58222a);
                }
                if (this.f58223b.isValid(a10)) {
                    return Integer.valueOf(i10);
                }
                List p10 = this.f58223b.p();
                int size = p10.size() - 1;
                while (true) {
                    if (size >= 0) {
                        f fVar = (f) p10.get(size);
                        if (e10.compareTo(fVar.f58187c) < 0) {
                            a10 = fVar.f58188d;
                        } else {
                            size--;
                        }
                    }
                }
                return Integer.valueOf(this.f58222a == 3 ? a10.d() : a10.b());
            } catch (RuntimeException e11) {
                throw new r(e11.getMessage(), e11);
            }
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer i(q qVar) {
            try {
                h e10 = this.f58223b.e((F) qVar.j(F.f57535m));
                int i10 = this.f58222a;
                if (i10 != 2 && i10 != 6 && i10 != 7 && i10 != 8) {
                    h a10 = a(qVar, 1);
                    if (this.f58223b.isValid(a10)) {
                        return 1;
                    }
                    if (this.f58222a == 5) {
                        throw new r("Historic New Year cannot be determined.");
                    }
                    List p10 = this.f58223b.p();
                    int size = p10.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        f fVar = (f) p10.get(size);
                        if (e10.compareTo(fVar.f58187c) >= 0) {
                            a10 = fVar.f58187c;
                            break;
                        }
                        size--;
                    }
                    return Integer.valueOf(this.f58222a == 3 ? a10.d() : a10.b());
                }
                return (e10.c() != j.BYZANTINE || e10.d() < 9) ? 1 : 0;
            } catch (IllegalArgumentException e11) {
                throw new r(e11.getMessage(), e11);
            }
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer p(q qVar) {
            int e10;
            try {
                F f10 = (F) qVar.j(F.f57535m);
                h e11 = this.f58223b.e(f10);
                switch (this.f58222a) {
                    case 2:
                        e10 = e11.e();
                        break;
                    case 3:
                        e10 = e11.d();
                        break;
                    case 4:
                        e10 = e11.b();
                        break;
                    case 5:
                        e10 = (int) ((f10.b() - this.f58223b.d(this.f58223b.m(e11.c(), e11.f(this.f58223b.v()))).b()) + 1);
                        break;
                    case 6:
                    case 7:
                        e10 = e11.f(this.f58223b.v());
                        break;
                    case 8:
                        e10 = ((e11.e() - 1) / 100) + 1;
                        break;
                    default:
                        throw new UnsupportedOperationException("Unknown element index: " + this.f58222a);
                }
                return Integer.valueOf(e10);
            } catch (IllegalArgumentException e12) {
                throw new r(e12.getMessage(), e12);
            }
        }

        @Override // oi.z
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public q q(q qVar, Integer num, boolean z10) {
            if (num == null) {
                throw new IllegalArgumentException("Missing historic element value.");
            }
            return qVar.y(F.f57535m, this.f58223b.d(a(qVar, num.intValue())));
        }

        @Override // oi.z
        public boolean isValid(q qVar, Integer num) {
            if (num == null) {
                return false;
            }
            try {
                return this.f58223b.isValid(a(qVar, num.intValue()));
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
    }

    public l(char c10, int i10, int i11, d dVar, int i12) {
        super(G(i12), c10, i10, i11);
        this.history = dVar;
        this.f58221f = i12;
    }

    public static String D(String str, int i10, char c10) {
        int length = str.length();
        if (i10 <= length) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = i10 - length;
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(c10);
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static int F(net.time4j.format.j jVar, char c10, CharSequence charSequence, int i10, ParsePosition parsePosition, net.time4j.format.g gVar) {
        int i11;
        boolean z10;
        int charAt;
        int i12 = 0;
        long j10 = 0;
        if (jVar.l()) {
            if (jVar == net.time4j.format.j.f58081a && charSequence.charAt(i10) == '-') {
                i11 = i10 + 1;
                z10 = true;
            } else {
                i11 = i10;
                z10 = false;
            }
            char charAt2 = gVar.c() ? (char) 0 : jVar.j().charAt(0);
            int min = Math.min(i11 + 9, charSequence.length());
            int i13 = i11;
            while (i11 < min) {
                int charAt3 = charSequence.charAt(i11) - c10;
                if (charAt3 >= 0 && charAt3 <= 9) {
                    j10 = (j10 * 10) + charAt3;
                    i13++;
                } else {
                    if (charAt2 == 0 || c10 == charAt2 || (charAt = charSequence.charAt(i11) - charAt2) < 0 || charAt > 9) {
                        break;
                    }
                    j10 = (j10 * 10) + charAt;
                    i13++;
                    c10 = charAt2;
                }
                i11++;
            }
            if (j10 > 2147483647L) {
                parsePosition.setErrorIndex(i10);
                return Integer.MIN_VALUE;
            }
            if (z10) {
                if (i13 != i10 + 1) {
                    j10 = AbstractC5469c.k(j10);
                }
            }
            i10 = i13;
        } else {
            int length = charSequence.length();
            for (int i14 = i10; i14 < length && jVar.h(charSequence.charAt(i14)); i14++) {
                i12++;
            }
            if (i12 > 0) {
                int i15 = i12 + i10;
                j10 = jVar.n(charSequence.subSequence(i10, i15).toString(), gVar);
                i10 = i15;
            }
        }
        parsePosition.setIndex(i10);
        return (int) j10;
    }

    public static String G(int i10) {
        switch (i10) {
            case 2:
                return "YEAR_OF_ERA";
            case 3:
                return "HISTORIC_MONTH";
            case 4:
                return "HISTORIC_DAY_OF_MONTH";
            case 5:
                return "HISTORIC_DAY_OF_YEAR";
            case 6:
                return "YEAR_AFTER";
            case 7:
                return "YEAR_BEFORE";
            case 8:
                return "CENTURY_OF_ERA";
            default:
                throw new UnsupportedOperationException("Unknown element index: " + i10);
        }
    }

    private Object readResolve() {
        String name = name();
        if (name.equals("YEAR_OF_ERA")) {
            return this.history.K();
        }
        if (name.equals("HISTORIC_MONTH")) {
            return this.history.B();
        }
        if (name.equals("HISTORIC_DAY_OF_MONTH")) {
            return this.history.g();
        }
        if (name.equals("HISTORIC_DAY_OF_YEAR")) {
            return this.history.h();
        }
        if (name.equals("YEAR_AFTER")) {
            return this.history.L(p.AFTER_NEW_YEAR);
        }
        if (name.equals("YEAR_BEFORE")) {
            return this.history.L(p.BEFORE_NEW_YEAR);
        }
        if (name.equals("CENTURY_OF_ERA")) {
            return this.history.b();
        }
        throw new InvalidObjectException("Unknown element: " + name);
    }

    public final String A(net.time4j.format.j jVar, char c10, int i10, int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jVar.p(i10));
        sb2.append('/');
        if (jVar.l() && i11 >= 100 && AbstractC5469c.a(i10, 100) == AbstractC5469c.a(i11, 100)) {
            int c11 = AbstractC5469c.c(i11, 100);
            if (c11 < 10) {
                sb2.append(c10);
            }
            sb2.append(jVar.p(c11));
        } else {
            sb2.append(jVar.p(i11));
        }
        return jVar.l() ? D(sb2.toString(), i12, c10) : sb2.toString();
    }

    public final int B(int i10, int i11, int i12) {
        if (i11 < 0) {
            return Integer.MAX_VALUE;
        }
        if (i11 >= 100 || i10 < 100) {
            return Integer.MAX_VALUE;
        }
        int i13 = i11 < 10 ? 10 : 100;
        if (Math.abs(i11 - AbstractC5469c.c(i10, i13)) <= i12) {
            return (AbstractC5469c.a(i10, i13) * i13) + i11;
        }
        return Integer.MAX_VALUE;
    }

    public final s C(InterfaceC5908d interfaceC5908d, net.time4j.format.m mVar) {
        return net.time4j.format.b.d((Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.ROOT)).l((v) interfaceC5908d.b(net.time4j.format.a.f57808g, v.WIDE), mVar);
    }

    @Override // net.time4j.format.t
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public Integer a0(CharSequence charSequence, ParsePosition parsePosition, InterfaceC5908d interfaceC5908d) {
        return l(charSequence, parsePosition, interfaceC5908d, null);
    }

    @Override // pi.InterfaceC6081a
    public void O(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d, net.time4j.format.j jVar, char c10, int i10, int i11) {
        int f10;
        if (this.f58221f == 5) {
            appendable.append(String.valueOf(oVar.j(this.history.h())));
            return;
        }
        h e10 = oVar instanceof InterfaceC5467a ? this.history.e(F.q0((InterfaceC5467a) oVar)) : (h) oVar.j(this.history.f());
        int i12 = this.f58221f;
        if (i12 != 2) {
            if (i12 != 3) {
                if (i12 == 4) {
                    appendable.append(String.valueOf(e10.b()));
                    return;
                }
                throw new r("Not printable as text: " + name());
            }
            int intValue = ((Integer) interfaceC5908d.b(InterfaceC6081a.f63225N4, 0)).intValue();
            int d10 = e10.d();
            if (intValue == 0) {
                appendable.append(C(interfaceC5908d, (net.time4j.format.m) interfaceC5908d.b(net.time4j.format.a.f57809h, net.time4j.format.m.FORMAT)).f(B.d(d10)));
                return;
            }
            String p10 = jVar.p(d10);
            if (jVar.l()) {
                p10 = D(p10, intValue, c10);
            }
            appendable.append(p10);
            return;
        }
        o v10 = this.history.v();
        int e11 = e10.e();
        String str = null;
        if (!o.f58233d.equals(v10) && (f10 = e10.f(v10)) != e11) {
            InterfaceC5907c interfaceC5907c = d.f58160p;
            p pVar = p.DUAL_DATING;
            if (interfaceC5908d.b(interfaceC5907c, pVar) == pVar) {
                str = A(jVar, c10, f10, e11, i10);
            } else {
                e11 = f10;
            }
        }
        if (str == null) {
            str = jVar.l() ? D(jVar.p(e11), i10, c10) : jVar.p(e11);
        }
        if (jVar.l()) {
            char charAt = jVar.j().charAt(0);
            if (c10 != charAt) {
                StringBuilder sb2 = new StringBuilder();
                int length = str.length();
                for (int i13 = 0; i13 < length; i13++) {
                    char charAt2 = str.charAt(i13);
                    if (jVar.h(charAt2)) {
                        sb2.append((char) (charAt2 + (c10 - charAt)));
                    } else {
                        sb2.append(charAt2);
                    }
                }
                str = sb2.toString();
            }
            z(str, i11);
        }
        appendable.append(str);
    }

    @Override // net.time4j.format.t
    public void Z(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d) {
        net.time4j.format.j jVar = (net.time4j.format.j) interfaceC5908d.b(net.time4j.format.a.f57813l, net.time4j.format.j.f58081a);
        InterfaceC5907c interfaceC5907c = net.time4j.format.a.f57814m;
        O(oVar, appendable, interfaceC5908d, jVar, interfaceC5908d.c(interfaceC5907c) ? ((Character) interfaceC5908d.a(interfaceC5907c)).charValue() : jVar.l() ? jVar.j().charAt(0) : '0', 1, 10);
    }

    @Override // pi.InterfaceC6081a
    public Integer l(CharSequence charSequence, ParsePosition parsePosition, InterfaceC5908d interfaceC5908d, q qVar) {
        int i10 = this.f58221f;
        if (i10 == 3) {
            int index = parsePosition.getIndex();
            if (((Integer) interfaceC5908d.b(InterfaceC6081a.f63225N4, 0)).intValue() == 0) {
                InterfaceC5907c interfaceC5907c = net.time4j.format.a.f57809h;
                net.time4j.format.m mVar = net.time4j.format.m.FORMAT;
                net.time4j.format.m mVar2 = (net.time4j.format.m) interfaceC5908d.b(interfaceC5907c, mVar);
                B b10 = (B) C(interfaceC5908d, mVar2).d(charSequence, parsePosition, B.class, interfaceC5908d);
                if (b10 == null && ((Boolean) interfaceC5908d.b(net.time4j.format.a.f57812k, Boolean.TRUE)).booleanValue()) {
                    parsePosition.setErrorIndex(-1);
                    parsePosition.setIndex(index);
                    if (mVar2 == mVar) {
                        mVar = net.time4j.format.m.STANDALONE;
                    }
                    b10 = (B) C(interfaceC5908d, mVar).d(charSequence, parsePosition, B.class, interfaceC5908d);
                }
                if (b10 == null) {
                    return null;
                }
                return Integer.valueOf(b10.b());
            }
        } else if (i10 == 6 || i10 == 7 || i10 == 8) {
            throw new r("Not parseable as text element: " + name());
        }
        net.time4j.format.j jVar = (net.time4j.format.j) interfaceC5908d.b(net.time4j.format.a.f57813l, net.time4j.format.j.f58081a);
        InterfaceC5907c interfaceC5907c2 = net.time4j.format.a.f57814m;
        char charValue = interfaceC5908d.c(interfaceC5907c2) ? ((Character) interfaceC5908d.a(interfaceC5907c2)).charValue() : jVar.l() ? jVar.j().charAt(0) : '0';
        net.time4j.format.g gVar = jVar.l() ? net.time4j.format.g.SMART : (net.time4j.format.g) interfaceC5908d.b(net.time4j.format.a.f57807f, net.time4j.format.g.SMART);
        int index2 = parsePosition.getIndex();
        int F10 = F(jVar, charValue, charSequence, index2, parsePosition, gVar);
        int index3 = parsePosition.getIndex();
        if (this.f58221f == 2 && index3 > index2 && !o.f58233d.equals(this.history.v()) && index3 < charSequence.length() && charSequence.charAt(index3) == '/') {
            InterfaceC5907c interfaceC5907c3 = d.f58160p;
            p pVar = p.DUAL_DATING;
            if (interfaceC5908d.b(interfaceC5907c3, pVar) == pVar) {
                int i11 = index3 + 1;
                int F11 = F(jVar, charValue, charSequence, i11, parsePosition, gVar);
                int index4 = parsePosition.getIndex();
                if (index4 == i11) {
                    parsePosition.setIndex(index3);
                } else {
                    int i12 = this.history.v().f(j.AD, F10) != n.f58231h ? 1 : 2;
                    int B10 = B(F10, F11, i12);
                    if (jVar.l() && B10 != Integer.MAX_VALUE) {
                        if (qVar != null) {
                            qVar.w(net.time4j.history.internal.c.f58210e, F10);
                        }
                        index3 = index4;
                        F10 = B10;
                    } else if (Math.abs(F11 - F10) <= i12) {
                        if (qVar != null) {
                            qVar.w(net.time4j.history.internal.c.f58210e, F10);
                        }
                        F10 = F11;
                        index3 = index4;
                    } else {
                        parsePosition.setIndex(index3);
                    }
                }
            }
        }
        if (index3 != index2) {
            return Integer.valueOf(F10);
        }
        parsePosition.setErrorIndex(index2);
        return null;
    }

    @Override // oi.AbstractC5909e
    public z r(x xVar) {
        if (xVar.x(F.f57535m)) {
            return new a(this.f58221f, this.history);
        }
        return null;
    }

    @Override // oi.AbstractC5909e
    public boolean s(AbstractC5909e abstractC5909e) {
        return this.history.equals(((l) abstractC5909e).history);
    }

    @Override // net.time4j.history.internal.c, oi.AbstractC5909e
    public boolean w() {
        return false;
    }

    public final void z(String str, int i10) {
        if (str.length() <= i10) {
            return;
        }
        throw new IllegalArgumentException("Element " + name() + " cannot be printed as the formatted value " + str + " exceeds the maximum width of " + i10 + ".");
    }
}
