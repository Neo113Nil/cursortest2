package net.time4j.format.expert;

import java.text.ParseException;
import java.util.Collections;
import java.util.Locale;
import net.time4j.H;
import net.time4j.a0;
import net.time4j.format.expert.C5709c;
import oi.InterfaceC5908d;
import oi.InterfaceC5918n;

/* loaded from: classes5.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final char f57978a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f57979b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f57980c;

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC5918n f57981d;

    /* renamed from: e, reason: collision with root package name */
    public static final InterfaceC5918n f57982e;

    /* renamed from: f, reason: collision with root package name */
    public static final C5709c f57983f;

    /* renamed from: g, reason: collision with root package name */
    public static final C5709c f57984g;

    /* renamed from: h, reason: collision with root package name */
    public static final C5709c f57985h;

    /* renamed from: i, reason: collision with root package name */
    public static final C5709c f57986i;

    /* renamed from: j, reason: collision with root package name */
    public static final C5709c f57987j;

    /* renamed from: k, reason: collision with root package name */
    public static final C5709c f57988k;

    /* renamed from: l, reason: collision with root package name */
    public static final C5709c f57989l;

    /* renamed from: m, reason: collision with root package name */
    public static final C5709c f57990m;

    /* renamed from: n, reason: collision with root package name */
    public static final C5709c f57991n;

    /* renamed from: o, reason: collision with root package name */
    public static final C5709c f57992o;

    /* renamed from: p, reason: collision with root package name */
    public static final C5709c f57993p;

    /* renamed from: q, reason: collision with root package name */
    public static final C5709c f57994q;

    /* renamed from: r, reason: collision with root package name */
    public static final C5709c f57995r;

    /* renamed from: s, reason: collision with root package name */
    public static final C5709c f57996s;

    public static class a implements InterfaceC5711e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f57997a;

        public a(boolean z10) {
            this.f57997a = z10;
        }

        @Override // net.time4j.format.expert.InterfaceC5711e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Object a(net.time4j.F f10, Appendable appendable, InterfaceC5908d interfaceC5908d, oi.t tVar) {
            (this.f57997a ? l.f57984g : l.f57983f).J(f10, appendable, interfaceC5908d);
            return null;
        }
    }

    public static class b implements InterfaceC5710d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f57998a;

        public b(boolean z10) {
            this.f57998a = z10;
        }

        @Override // net.time4j.format.expert.InterfaceC5710d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public net.time4j.F b(CharSequence charSequence, s sVar, InterfaceC5908d interfaceC5908d) {
            int length = charSequence.length();
            int f10 = sVar.f();
            int i10 = length - f10;
            int i11 = 0;
            for (int i12 = f10 + 1; i12 < length; i12++) {
                char charAt = charSequence.charAt(i12);
                if (charAt == '-') {
                    i11++;
                } else {
                    if (charAt == '/' || charAt == 'T') {
                        i10 = i12 - f10;
                        break;
                    }
                    if (charAt == 'W') {
                        return this.f57998a ? (net.time4j.F) l.f57988k.E(charSequence, sVar) : (net.time4j.F) l.f57987j.E(charSequence, sVar);
                    }
                }
            }
            if (this.f57998a) {
                return i11 == 1 ? (net.time4j.F) l.f57986i.E(charSequence, sVar) : (net.time4j.F) l.f57984g.E(charSequence, sVar);
            }
            int i13 = i10 - 4;
            char charAt2 = charSequence.charAt(f10);
            if (charAt2 == '+' || charAt2 == '-') {
                i13 = i10 - 6;
            }
            return i13 == 3 ? (net.time4j.F) l.f57985h.E(charSequence, sVar) : (net.time4j.F) l.f57983f.E(charSequence, sVar);
        }
    }

    public static class c implements InterfaceC5918n {

        /* renamed from: a, reason: collision with root package name */
        public final oi.p f57999a;

        public class a implements InterfaceC5918n {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f58000a;

            public a(c cVar) {
                this.f58000a = cVar;
            }

            @Override // oi.InterfaceC5918n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean test(oi.o oVar) {
                return c.this.test(oVar) || this.f58000a.test(oVar);
            }
        }

        public c(oi.p pVar) {
            this.f57999a = pVar;
        }

        public InterfaceC5918n a(c cVar) {
            return new a(cVar);
        }

        @Override // oi.InterfaceC5918n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean test(oi.o oVar) {
            return oVar.e(this.f57999a) > 0;
        }
    }

    public static class d implements InterfaceC5918n {
        public d() {
        }

        @Override // oi.InterfaceC5918n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(Character ch2) {
            return ch2.charValue() == 'T';
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    static {
        f57978a = Boolean.getBoolean("net.time4j.format.iso.decimal.dot") ? '.' : ',';
        c cVar = new c(net.time4j.G.f57594x);
        f57979b = cVar;
        c cVar2 = new c(net.time4j.G.f57562B);
        f57980c = cVar2;
        f57981d = cVar.a(cVar2);
        f57982e = new d(null);
        f57983f = b(false);
        f57984g = b(true);
        f57985h = h(false);
        f57986i = h(true);
        f57987j = m(false);
        f57988k = m(true);
        f57989l = c(false);
        f57990m = c(true);
        f57991n = k(false);
        f57992o = k(true);
        f57993p = l(false);
        f57994q = l(true);
        f57995r = g(false);
        f57996s = g(true);
    }

    public static void a(C5709c.d dVar, boolean z10) {
        dVar.b0(net.time4j.format.a.f57813l, net.time4j.format.j.f58081a);
        dVar.Z(net.time4j.format.a.f57814m, '0');
        dVar.g(net.time4j.G.f57591u, 2);
        dVar.X();
        if (z10) {
            dVar.l(':');
        }
        dVar.g(net.time4j.G.f57592v, 2);
        dVar.Y(f57981d);
        if (z10) {
            dVar.l(':');
        }
        dVar.g(net.time4j.G.f57594x, 2);
        dVar.Y(f57980c);
        if (f57978a == ',') {
            dVar.m(',', '.');
        } else {
            dVar.m('.', ',');
        }
        dVar.i(net.time4j.G.f57562B, 0, 9, false);
        for (int i10 = 0; i10 < 5; i10++) {
            dVar.L();
        }
    }

    public static C5709c b(boolean z10) {
        C5709c.d k10 = C5709c.N(net.time4j.F.class, Locale.ROOT).b0(net.time4j.format.a.f57813l, net.time4j.format.j.f58081a).Z(net.time4j.format.a.f57814m, '0').k(net.time4j.F.f57536n, 4, 9, x.SHOW_WHEN_BIG_NUMBER);
        if (z10) {
            k10.l('-');
        }
        k10.g(net.time4j.F.f57540r, 2);
        if (z10) {
            k10.l('-');
        }
        return k10.g(net.time4j.F.f57541s, 2).L().L().F().S(net.time4j.format.g.STRICT);
    }

    public static C5709c c(boolean z10) {
        C5709c.d N10 = C5709c.N(net.time4j.F.class, Locale.ROOT);
        N10.d(net.time4j.F.f57535m, e(z10), d(z10));
        return N10.F().S(net.time4j.format.g.STRICT);
    }

    public static InterfaceC5710d d(boolean z10) {
        return new b(z10);
    }

    public static InterfaceC5711e e(boolean z10) {
        return new a(z10);
    }

    public static C5709c f(net.time4j.format.e eVar, boolean z10) {
        C5709c.d N10 = C5709c.N(net.time4j.A.class, Locale.ROOT);
        N10.d(net.time4j.F.f57535m, e(z10), d(z10));
        N10.l('T');
        a(N10, z10);
        N10.C(eVar, z10, Collections.singletonList("Z"));
        return N10.F();
    }

    public static C5709c g(boolean z10) {
        C5709c.d N10 = C5709c.N(net.time4j.A.class, Locale.ROOT);
        N10.d(net.time4j.A.N().F(), f(net.time4j.format.e.MEDIUM, z10), f(net.time4j.format.e.SHORT, z10));
        return N10.F().S(net.time4j.format.g.STRICT).V(net.time4j.tz.p.f58410k);
    }

    public static C5709c h(boolean z10) {
        C5709c.d k10 = C5709c.N(net.time4j.F.class, Locale.ROOT).b0(net.time4j.format.a.f57813l, net.time4j.format.j.f58081a).Z(net.time4j.format.a.f57814m, '0').k(net.time4j.F.f57536n, 4, 9, x.SHOW_WHEN_BIG_NUMBER);
        if (z10) {
            k10.l('-');
        }
        return k10.g(net.time4j.F.f57543u, 3).L().L().F().S(net.time4j.format.g.STRICT);
    }

    public static net.time4j.F i(CharSequence charSequence) {
        s sVar = new s();
        net.time4j.F j10 = j(charSequence, sVar);
        if (j10 == null || sVar.i()) {
            throw new ParseException(sVar.d(), sVar.c());
        }
        if (sVar.f() >= charSequence.length()) {
            return j10;
        }
        throw new ParseException("Trailing characters found: " + ((Object) charSequence), sVar.f());
    }

    public static net.time4j.F j(CharSequence charSequence, s sVar) {
        int length = charSequence.length();
        int f10 = sVar.f();
        int i10 = length - f10;
        if (i10 < 7) {
            sVar.k(length, "Too short to be compatible with ISO-8601: " + ((Object) charSequence.subSequence(f10, length)));
            return null;
        }
        int i11 = 0;
        for (int i12 = f10 + 1; i12 < length; i12++) {
            char charAt = charSequence.charAt(i12);
            if (charAt == '-') {
                i11++;
            } else {
                if (charAt == '/' || charAt == 'T') {
                    i10 = i12 - f10;
                    break;
                }
                if (charAt == 'W') {
                    return i11 > 0 ? (net.time4j.F) f57988k.E(charSequence, sVar) : (net.time4j.F) f57987j.E(charSequence, sVar);
                }
            }
        }
        if (i11 != 0) {
            return i11 == 1 ? (net.time4j.F) f57986i.E(charSequence, sVar) : (net.time4j.F) f57984g.E(charSequence, sVar);
        }
        int i13 = i10 - 4;
        char charAt2 = charSequence.charAt(f10);
        if (charAt2 == '+' || charAt2 == '-') {
            i13 = i10 - 6;
        }
        return i13 == 3 ? (net.time4j.F) f57985h.E(charSequence, sVar) : (net.time4j.F) f57983f.E(charSequence, sVar);
    }

    public static C5709c k(boolean z10) {
        C5709c.d N10 = C5709c.N(net.time4j.G.class, Locale.ROOT);
        N10.W(f57982e, 1);
        a(N10, z10);
        return N10.F().S(net.time4j.format.g.STRICT);
    }

    public static C5709c l(boolean z10) {
        C5709c.d N10 = C5709c.N(H.class, Locale.ROOT);
        N10.d(net.time4j.F.f57535m, e(z10), d(z10));
        N10.l('T');
        a(N10, z10);
        return N10.F().S(net.time4j.format.g.STRICT);
    }

    public static C5709c m(boolean z10) {
        C5709c.d k10 = C5709c.N(net.time4j.F.class, Locale.ROOT).b0(net.time4j.format.a.f57813l, net.time4j.format.j.f58081a).Z(net.time4j.format.a.f57814m, '0').k(net.time4j.F.f57537o, 4, 9, x.SHOW_WHEN_BIG_NUMBER);
        if (z10) {
            k10.l('-');
        }
        k10.l('W');
        k10.g(a0.f57689m.n(), 2);
        if (z10) {
            k10.l('-');
        }
        return k10.h(net.time4j.F.f57542t, 1).L().L().F().S(net.time4j.format.g.STRICT);
    }
}
