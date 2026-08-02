package net.time4j.format.expert;

import i3.C4527h;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import li.InterfaceC5472f;
import net.time4j.C5718k;
import net.time4j.EnumC5706f;
import net.time4j.V;
import net.time4j.format.a;
import oi.AbstractC5916l;
import oi.AbstractC5917m;
import oi.EnumC5901B;
import oi.H;
import oi.InterfaceC5907c;
import oi.InterfaceC5908d;
import oi.InterfaceC5918n;
import oi.K;
import oi.N;

/* renamed from: net.time4j.format.expert.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5709c implements InterfaceC5711e, InterfaceC5710d {

    /* renamed from: r, reason: collision with root package name */
    public static final C5709c f57908r = L();

    /* renamed from: a, reason: collision with root package name */
    public final oi.x f57909a;

    /* renamed from: b, reason: collision with root package name */
    public final e f57910b;

    /* renamed from: c, reason: collision with root package name */
    public final C5708b f57911c;

    /* renamed from: d, reason: collision with root package name */
    public final List f57912d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f57913e;

    /* renamed from: f, reason: collision with root package name */
    public final j f57914f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f57915g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f57916h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f57917i;

    /* renamed from: j, reason: collision with root package name */
    public final int f57918j;

    /* renamed from: k, reason: collision with root package name */
    public final net.time4j.format.g f57919k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f57920l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f57921m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f57922n;

    /* renamed from: o, reason: collision with root package name */
    public final oi.x f57923o;

    /* renamed from: p, reason: collision with root package name */
    public final int f57924p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f57925q;

    /* renamed from: net.time4j.format.expert.c$a */
    public static class a implements InterfaceC5711e {
        @Override // net.time4j.format.expert.InterfaceC5711e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Object a(net.time4j.tz.k kVar, Appendable appendable, InterfaceC5908d interfaceC5908d, oi.t tVar) {
            return null;
        }
    }

    /* renamed from: net.time4j.format.expert.c$b */
    public static class b implements InterfaceC5710d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f57926a;

        public b(Map map) {
            this.f57926a = map;
        }

        @Override // net.time4j.format.expert.InterfaceC5710d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public net.time4j.tz.k b(CharSequence charSequence, s sVar, InterfaceC5908d interfaceC5908d) {
            int f10 = sVar.f();
            int i10 = f10 + 3;
            if (i10 > charSequence.length()) {
                return null;
            }
            net.time4j.tz.k kVar = (net.time4j.tz.k) this.f57926a.get(charSequence.subSequence(f10, i10).toString());
            if (kVar != null) {
                sVar.l(i10);
                return kVar;
            }
            sVar.k(f10, "No time zone information found.");
            return null;
        }
    }

    /* renamed from: net.time4j.format.expert.c$c, reason: collision with other inner class name */
    public static /* synthetic */ class C0842c {
        static final /* synthetic */ int[] $SwitchMap$net$time4j$format$expert$PatternType;

        static {
            int[] iArr = new int[w.values().length];
            $SwitchMap$net$time4j$format$expert$PatternType = iArr;
            try {
                iArr[w.CLDR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$time4j$format$expert$PatternType[w.CLDR_24.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$time4j$format$expert$PatternType[w.CLDR_DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$net$time4j$format$expert$PatternType[w.SIMPLE_DATE_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: net.time4j.format.expert.c$d */
    public static final class d {

        /* renamed from: n, reason: collision with root package name */
        public static final InterfaceC5907c f57927n = net.time4j.format.a.e("CUSTOM_DAY_PERIOD", C5718k.class);

        /* renamed from: a, reason: collision with root package name */
        public final oi.x f57928a;

        /* renamed from: b, reason: collision with root package name */
        public final oi.x f57929b;

        /* renamed from: c, reason: collision with root package name */
        public final Locale f57930c;

        /* renamed from: d, reason: collision with root package name */
        public List f57931d;

        /* renamed from: e, reason: collision with root package name */
        public LinkedList f57932e;

        /* renamed from: f, reason: collision with root package name */
        public int f57933f;

        /* renamed from: g, reason: collision with root package name */
        public int f57934g;

        /* renamed from: h, reason: collision with root package name */
        public int f57935h;

        /* renamed from: i, reason: collision with root package name */
        public String f57936i;

        /* renamed from: j, reason: collision with root package name */
        public C5718k f57937j;

        /* renamed from: k, reason: collision with root package name */
        public Map f57938k;

        /* renamed from: l, reason: collision with root package name */
        public oi.x f57939l;

        /* renamed from: m, reason: collision with root package name */
        public int f57940m;

        /* renamed from: net.time4j.format.expert.c$d$a */
        public class a implements InterfaceC5918n {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5918n f57941a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5918n f57942b;

            public a(InterfaceC5918n interfaceC5918n, InterfaceC5918n interfaceC5918n2) {
                this.f57941a = interfaceC5918n;
                this.f57942b = interfaceC5918n2;
            }

            @Override // oi.InterfaceC5918n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean test(oi.o oVar) {
                return this.f57941a.test(oVar) && this.f57942b.test(oVar);
            }
        }

        public /* synthetic */ d(oi.x xVar, Locale locale, a aVar) {
            this(xVar, locale);
        }

        public static void I(InterfaceC5907c interfaceC5907c) {
            if (interfaceC5907c.name().charAt(0) != '_') {
                return;
            }
            throw new IllegalArgumentException("Internal attribute not allowed: " + interfaceC5907c.name());
        }

        public static int Q(C5708b c5708b) {
            if (c5708b == null) {
                return 0;
            }
            return c5708b.g();
        }

        public static boolean R(oi.x xVar) {
            while (!InterfaceC5472f.class.isAssignableFrom(xVar.r())) {
                xVar = xVar.d();
                if (xVar == null) {
                    return false;
                }
            }
            return true;
        }

        public static boolean T(char c10) {
            if (c10 < 'A' || c10 > 'Z') {
                return c10 >= 'a' && c10 <= 'z';
            }
            return true;
        }

        public d A(oi.p pVar) {
            J(pVar);
            if (pVar instanceof net.time4j.format.t) {
                w(A.g((net.time4j.format.t) net.time4j.format.t.class.cast(pVar)));
                return this;
            }
            HashMap hashMap = new HashMap();
            for (Enum r42 : (Enum[]) pVar.getType().getEnumConstants()) {
                hashMap.put(r42, r42.toString());
            }
            w(new o(pVar, hashMap));
            return this;
        }

        public d B() {
            if (!R(this.f57928a)) {
                throw new IllegalStateException("Only unix timestamps can have a timezone id.");
            }
            w(C.INSTANCE);
            return this;
        }

        public d C(net.time4j.format.e eVar, boolean z10, List list) {
            w(new E(eVar, z10, list));
            return this;
        }

        public d D(oi.p pVar) {
            J(pVar);
            H(pVar);
            F f10 = new F(pVar);
            int i10 = this.f57934g;
            if (i10 == -1) {
                w(f10);
                this.f57934g = this.f57931d.size() - 1;
                return this;
            }
            i iVar = (i) this.f57931d.get(i10);
            b0(net.time4j.format.a.f57807f, net.time4j.format.g.STRICT);
            w(f10);
            L();
            if (iVar.f() == ((i) this.f57931d.get(r0.size() - 1)).f()) {
                this.f57934g = i10;
                this.f57931d.set(i10, iVar.t(2));
            }
            return this;
        }

        public d E(oi.p pVar, int i10, boolean z10) {
            i iVar;
            if (this.f57931d.isEmpty()) {
                iVar = null;
            } else {
                iVar = (i) this.f57931d.get(r0.size() - 1);
            }
            return (iVar == null || iVar.i() || !iVar.j() || i10 != 4) ? t(pVar, false, i10, 10, x.SHOW_WHEN_NEGATIVE, z10) : t(pVar, true, 4, 4, x.SHOW_NEVER, z10);
        }

        public C5709c F() {
            return G(net.time4j.format.a.f());
        }

        public C5709c G(net.time4j.format.a aVar) {
            boolean z10;
            if (aVar == null) {
                throw new NullPointerException("Missing format attributes.");
            }
            int size = this.f57931d.size();
            a aVar2 = null;
            HashMap hashMap = null;
            for (int i10 = 0; i10 < size; i10++) {
                i iVar = (i) this.f57931d.get(i10);
                if (iVar.i()) {
                    int f10 = iVar.f();
                    int i11 = size - 1;
                    while (true) {
                        if (i11 <= i10) {
                            z10 = false;
                            break;
                        }
                        if (((i) this.f57931d.get(i11)).f() == f10) {
                            if (hashMap == null) {
                                hashMap = new HashMap();
                            }
                            hashMap.put(Integer.valueOf(i10), iVar.m(i11));
                            z10 = true;
                        } else {
                            i11--;
                        }
                    }
                    if (!z10) {
                        throw new IllegalStateException("Missing format processor after or-operator.");
                    }
                }
            }
            if (hashMap != null) {
                for (Integer num : hashMap.keySet()) {
                    this.f57931d.set(num.intValue(), hashMap.get(num));
                }
            }
            C5709c c5709c = new C5709c(this.f57928a, this.f57929b, this.f57930c, this.f57931d, this.f57938k, aVar, this.f57939l, null);
            String str = this.f57936i;
            if (str == null) {
                str = "";
            }
            if (this.f57937j == null && str.isEmpty()) {
                return c5709c;
            }
            C5708b c5708b = c5709c.f57911c;
            if (!str.isEmpty()) {
                c5708b = c5708b.m(net.time4j.format.a.f57825x, str);
            }
            C5718k c5718k = this.f57937j;
            if (c5718k != null) {
                c5708b = c5708b.m(f57927n, c5718k);
            }
            return new C5709c(c5709c, c5708b, aVar2);
        }

        public final i H(oi.p pVar) {
            i iVar;
            if (this.f57931d.isEmpty()) {
                iVar = null;
            } else {
                iVar = (i) this.f57931d.get(r0.size() - 1);
            }
            if (iVar == null) {
                return null;
            }
            if (!iVar.g() || iVar.i()) {
                return iVar;
            }
            throw new IllegalStateException(pVar.name() + " can't be inserted after an element with decimal digits.");
        }

        public final void J(oi.p pVar) {
            oi.x j10 = C5709c.j(this.f57928a, this.f57929b, pVar);
            int s10 = C5709c.s(j10, this.f57928a, this.f57929b);
            if (s10 >= this.f57940m) {
                this.f57939l = j10;
                this.f57940m = s10;
            }
        }

        public final void K() {
            if (!R(this.f57928a)) {
                throw new IllegalStateException("Timezone names in specific non-location format can only be reliably combined with instant-like types, for example \"Moment\".");
            }
        }

        public d L() {
            this.f57932e.removeLast();
            V();
            return this;
        }

        public final void M() {
            for (int size = this.f57931d.size() - 1; size >= 0; size--) {
                i iVar = (i) this.f57931d.get(size);
                if (iVar.i()) {
                    return;
                }
                if (iVar.g()) {
                    throw new IllegalArgumentException("Cannot define more than one element with decimal digits.");
                }
            }
        }

        public final void N(boolean z10, boolean z11) {
            M();
            if (!z10 && !z11 && this.f57934g != -1) {
                throw new IllegalArgumentException("Cannot add fractional element with variable width after another numerical element with variable width.");
            }
        }

        public final net.time4j.format.t O(boolean z10, C5718k c5718k) {
            net.time4j.format.a a10 = new a.b(P()).a();
            InterfaceC5908d interfaceC5908d = a10;
            if (c5718k != null) {
                interfaceC5908d = (this.f57932e.isEmpty() ? new C5708b(a10, this.f57930c) : (C5708b) this.f57932e.getLast()).m(f57927n, c5718k);
            }
            Iterator it = net.time4j.G.c0().t().iterator();
            while (it.hasNext()) {
                for (oi.p pVar : ((oi.s) it.next()).c(this.f57930c, interfaceC5908d)) {
                    if (z10 && pVar.a() == 'b' && S(pVar)) {
                        return (net.time4j.format.t) C5709c.h(pVar);
                    }
                    if (!z10 && pVar.a() == 'B' && S(pVar)) {
                        return (net.time4j.format.t) C5709c.h(pVar);
                    }
                }
            }
            throw new IllegalStateException("Day periods are not supported: " + P().r());
        }

        public oi.x P() {
            oi.x xVar = this.f57929b;
            return xVar == null ? this.f57928a : xVar;
        }

        public final boolean S(oi.p pVar) {
            if (!pVar.name().endsWith("_DAY_PERIOD")) {
                return false;
            }
            if (this.f57929b != null || this.f57928a.y(pVar)) {
                return true;
            }
            oi.x xVar = this.f57928a;
            do {
                xVar = xVar.d();
                if (xVar == null) {
                    return false;
                }
            } while (!xVar.y(pVar));
            return true;
        }

        public d U() {
            i iVar;
            int i10;
            int i11;
            int i12 = !this.f57932e.isEmpty() ? ((C5708b) this.f57932e.getLast()).i() : 0;
            if (this.f57931d.isEmpty()) {
                iVar = null;
                i10 = -1;
                i11 = -1;
            } else {
                i10 = this.f57931d.size() - 1;
                iVar = (i) this.f57931d.get(i10);
                i11 = iVar.f();
            }
            if (i12 != i11) {
                throw new IllegalStateException("Cannot start or-block without any previous step in current section.");
            }
            this.f57931d.set(i10, iVar.v());
            V();
            this.f57934g = -1;
            return this;
        }

        public final void V() {
            this.f57935h = 0;
        }

        public d W(InterfaceC5918n interfaceC5918n, int i10) {
            w(new y(interfaceC5918n, i10));
            return this;
        }

        public d X() {
            return Y(null);
        }

        public d Y(InterfaceC5918n interfaceC5918n) {
            C5708b c5708b;
            InterfaceC5918n interfaceC5918n2;
            V();
            a.b bVar = new a.b();
            if (this.f57932e.isEmpty()) {
                c5708b = null;
                interfaceC5918n2 = null;
            } else {
                c5708b = (C5708b) this.f57932e.getLast();
                bVar.f(c5708b.e());
                interfaceC5918n2 = c5708b.f();
            }
            int Q10 = Q(c5708b) + 1;
            int i10 = this.f57933f + 1;
            this.f57933f = i10;
            this.f57932e.addLast(new C5708b(bVar.a(), this.f57930c, Q10, i10, interfaceC5918n != null ? interfaceC5918n2 == null ? interfaceC5918n : new a(interfaceC5918n2, interfaceC5918n) : interfaceC5918n2));
            return this;
        }

        public d Z(InterfaceC5907c interfaceC5907c, char c10) {
            C5708b l10;
            I(interfaceC5907c);
            V();
            if (this.f57932e.isEmpty()) {
                l10 = new C5708b(new a.b().b(interfaceC5907c, c10).a(), this.f57930c);
            } else {
                C5708b c5708b = (C5708b) this.f57932e.getLast();
                a.b bVar = new a.b();
                bVar.f(c5708b.e());
                bVar.b(interfaceC5907c, c10);
                l10 = c5708b.l(bVar.a());
            }
            this.f57932e.addLast(l10);
            return this;
        }

        public d a0(InterfaceC5907c interfaceC5907c, int i10) {
            C5708b l10;
            I(interfaceC5907c);
            V();
            if (this.f57932e.isEmpty()) {
                l10 = new C5708b(new a.b().c(interfaceC5907c, i10).a(), this.f57930c);
            } else {
                C5708b c5708b = (C5708b) this.f57932e.getLast();
                a.b bVar = new a.b();
                bVar.f(c5708b.e());
                bVar.c(interfaceC5907c, i10);
                l10 = c5708b.l(bVar.a());
            }
            this.f57932e.addLast(l10);
            return this;
        }

        public d b0(InterfaceC5907c interfaceC5907c, Enum r52) {
            C5708b l10;
            I(interfaceC5907c);
            V();
            if (this.f57932e.isEmpty()) {
                l10 = new C5708b(new a.b().d(interfaceC5907c, r52).a(), this.f57930c);
            } else {
                C5708b c5708b = (C5708b) this.f57932e.getLast();
                a.b bVar = new a.b();
                bVar.f(c5708b.e());
                bVar.d(interfaceC5907c, r52);
                l10 = c5708b.l(bVar.a());
            }
            this.f57932e.addLast(l10);
            return this;
        }

        public d d(oi.p pVar, InterfaceC5711e interfaceC5711e, InterfaceC5710d interfaceC5710d) {
            J(pVar);
            w(new C5712f(pVar, interfaceC5711e, interfaceC5710d));
            return this;
        }

        public d e() {
            return z(O(false, null));
        }

        public d f() {
            return z(O(true, null));
        }

        public d g(oi.p pVar, int i10) {
            return s(pVar, true, i10, i10, x.SHOW_NEVER);
        }

        public d h(oi.p pVar, int i10) {
            return s(pVar, true, i10, i10, x.SHOW_NEVER);
        }

        public d i(oi.p pVar, int i10, int i11, boolean z10) {
            J(pVar);
            boolean z11 = !z10 && i10 == i11;
            N(z11, z10);
            j jVar = new j(pVar, i10, i11, z10);
            int i12 = this.f57934g;
            if (i12 == -1 || !z11) {
                w(jVar);
                return this;
            }
            i iVar = (i) this.f57931d.get(i12);
            w(jVar);
            List list = this.f57931d;
            if (iVar.f() == ((i) list.get(list.size() - 1)).f()) {
                this.f57934g = i12;
                this.f57931d.set(i12, iVar.t(i10));
            }
            return this;
        }

        public d j(oi.p pVar, int i10, int i11) {
            return s(pVar, false, i10, i11, x.SHOW_NEVER);
        }

        public d k(oi.p pVar, int i10, int i11, x xVar) {
            return s(pVar, false, i10, i11, xVar);
        }

        public d l(char c10) {
            return n(String.valueOf(c10));
        }

        public d m(char c10, char c11) {
            w(new m(c10, c11));
            return this;
        }

        public d n(String str) {
            int i10;
            i iVar;
            m mVar = new m(str);
            int h10 = mVar.h();
            if (h10 > 0) {
                if (this.f57931d.isEmpty()) {
                    iVar = null;
                } else {
                    iVar = (i) this.f57931d.get(r1.size() - 1);
                }
                if (iVar != null && iVar.g() && !iVar.i()) {
                    throw new IllegalStateException("Numerical literal can't be inserted after an element with decimal digits.");
                }
            }
            if (h10 == 0 || (i10 = this.f57934g) == -1) {
                w(mVar);
                return this;
            }
            i iVar2 = (i) this.f57931d.get(i10);
            w(mVar);
            if (iVar2.f() == ((i) this.f57931d.get(r3.size() - 1)).f()) {
                this.f57934g = i10;
                this.f57931d.set(i10, iVar2.t(h10));
            }
            return this;
        }

        public final void o(StringBuilder sb2) {
            if (sb2.length() > 0) {
                n(sb2.toString());
                sb2.setLength(0);
            }
        }

        public d p() {
            w(new n(false));
            return this;
        }

        public d q(oi.p pVar, int i10, int i11, x xVar) {
            return s(pVar, false, i10, i11, xVar);
        }

        public d r() {
            K();
            w(new D(false));
            return this;
        }

        public final d s(oi.p pVar, boolean z10, int i10, int i11, x xVar) {
            return t(pVar, z10, i10, i11, xVar, false);
        }

        public final d t(oi.p pVar, boolean z10, int i10, int i11, x xVar, boolean z11) {
            J(pVar);
            i H10 = H(pVar);
            r rVar = new r(pVar, z10, i10, i11, xVar, z11);
            if (!z10) {
                if (H10 != null && H10.j() && !H10.i()) {
                    throw new IllegalStateException("Numerical element with variable width can't be inserted after another numerical element. Consider \"addFixedXXX()\" instead.");
                }
                w(rVar);
                this.f57934g = this.f57931d.size() - 1;
                return this;
            }
            int i12 = this.f57934g;
            if (i12 == -1) {
                w(rVar);
                return this;
            }
            i iVar = (i) this.f57931d.get(i12);
            w(rVar);
            if (iVar.f() == ((i) this.f57931d.get(r11.size() - 1)).f()) {
                this.f57934g = i12;
                this.f57931d.set(i12, iVar.t(i10));
            }
            return this;
        }

        public d u(oi.p pVar, int i10, int i11) {
            return s(pVar, false, i10, i11, x.SHOW_NEVER);
        }

        public d v(String str, w wVar) {
            if (wVar == null) {
                throw new NullPointerException("Missing pattern type.");
            }
            Map map = Collections.EMPTY_MAP;
            int length = str.length();
            Locale locale = this.f57930c;
            StringBuilder sb2 = new StringBuilder();
            if (!this.f57932e.isEmpty()) {
                locale = ((C5708b) this.f57932e.getLast()).h();
            }
            int i10 = 0;
            while (i10 < length) {
                char charAt = str.charAt(i10);
                if (T(charAt)) {
                    o(sb2);
                    int i11 = i10 + 1;
                    while (i11 < length && str.charAt(i11) == charAt) {
                        i11++;
                    }
                    Map y10 = wVar.y(this, locale, charAt, i11 - i10);
                    if (!y10.isEmpty()) {
                        if (map.isEmpty()) {
                            map = y10;
                        } else {
                            HashMap hashMap = new HashMap(map);
                            hashMap.putAll(y10);
                            map = hashMap;
                        }
                    }
                    i10 = i11 - 1;
                } else if (charAt == '\'') {
                    o(sb2);
                    int i12 = i10 + 1;
                    int i13 = i12;
                    while (i13 < length) {
                        if (str.charAt(i13) == '\'') {
                            int i14 = i13 + 1;
                            if (i14 >= length || str.charAt(i14) != '\'') {
                                break;
                            }
                            i13 = i14;
                        }
                        i13++;
                    }
                    if (i13 >= length) {
                        throw new IllegalArgumentException("String literal in pattern not closed: " + str);
                    }
                    if (i12 == i13) {
                        l('\'');
                    } else {
                        n(str.substring(i12, i13).replace("''", "'"));
                    }
                    i10 = i13;
                } else if (charAt == '[') {
                    o(sb2);
                    X();
                } else if (charAt == ']') {
                    o(sb2);
                    L();
                } else if (charAt == '|') {
                    try {
                        o(sb2);
                        U();
                    } catch (IllegalStateException e10) {
                        throw new IllegalArgumentException(e10);
                    }
                } else {
                    if (charAt == '#' || charAt == '{' || charAt == '}') {
                        throw new IllegalArgumentException("Pattern contains reserved character: '" + charAt + "'");
                    }
                    sb2.append(charAt);
                }
                i10++;
            }
            o(sb2);
            if (!map.isEmpty()) {
                int size = this.f57931d.size();
                for (int i15 = 0; i15 < size; i15++) {
                    i iVar = (i) this.f57931d.get(i15);
                    oi.p b10 = iVar.d().b();
                    if (map.containsKey(b10)) {
                        this.f57931d.set(i15, iVar.x((oi.p) map.get(b10)));
                    }
                }
            }
            if (this.f57936i != null) {
                str = "";
            }
            this.f57936i = str;
            return this;
        }

        public final void w(h hVar) {
            C5708b c5708b;
            int i10;
            int i11;
            this.f57934g = -1;
            if (this.f57932e.isEmpty()) {
                c5708b = null;
                i10 = 0;
                i11 = 0;
            } else {
                c5708b = (C5708b) this.f57932e.getLast();
                i10 = c5708b.g();
                i11 = c5708b.i();
            }
            i iVar = new i(hVar, i10, i11, c5708b);
            int i12 = this.f57935h;
            if (i12 > 0) {
                iVar = iVar.n(i12, 0);
                this.f57935h = 0;
            }
            this.f57931d.add(iVar);
        }

        public d x() {
            w(new n(true));
            return this;
        }

        public d y() {
            K();
            w(new D(true));
            return this;
        }

        public d z(net.time4j.format.t tVar) {
            J(tVar);
            w(A.g(tVar));
            return this;
        }

        public d(oi.x xVar, Locale locale) {
            this(xVar, locale, (oi.x) null);
        }

        public d(oi.x xVar, Locale locale, oi.x xVar2) {
            if (xVar == null) {
                throw new NullPointerException("Missing chronology.");
            }
            if (locale != null) {
                this.f57928a = xVar;
                this.f57929b = xVar2;
                this.f57930c = locale;
                this.f57931d = new ArrayList();
                this.f57932e = new LinkedList();
                this.f57933f = 0;
                this.f57934g = -1;
                this.f57935h = 0;
                this.f57936i = null;
                this.f57937j = null;
                this.f57938k = new HashMap();
                this.f57939l = xVar;
                this.f57940m = 0;
                return;
            }
            throw new NullPointerException("Missing locale.");
        }
    }

    /* renamed from: net.time4j.format.expert.c$e */
    public static class e implements oi.u {

        /* renamed from: a, reason: collision with root package name */
        public final oi.x f57944a;

        /* renamed from: b, reason: collision with root package name */
        public final List f57945b;

        public e(oi.x xVar) {
            this.f57944a = xVar;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(xVar.t());
            arrayList.addAll(net.time4j.G.c0().t());
            this.f57945b = Collections.unmodifiableList(arrayList);
        }

        public static e g(oi.x xVar) {
            if (xVar == null) {
                return null;
            }
            return new e(xVar);
        }

        @Override // oi.u
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public net.time4j.r e(oi.q qVar, InterfaceC5908d interfaceC5908d, boolean z10, boolean z11) {
            Object e10 = this.f57944a.e(qVar, interfaceC5908d, z10, z11);
            net.time4j.G g10 = (net.time4j.G) net.time4j.G.c0().e(qVar, interfaceC5908d, z10, z11);
            if (e10 instanceof AbstractC5917m) {
                return (net.time4j.r) C5709c.h(net.time4j.r.b((AbstractC5917m) AbstractC5917m.class.cast(e10), g10));
            }
            throw new IllegalStateException("Cannot determine calendar type: " + e10);
        }

        @Override // oi.u
        public oi.F b() {
            return this.f57944a.b();
        }

        public oi.x c() {
            return this.f57944a;
        }

        @Override // oi.u
        public oi.x d() {
            throw new UnsupportedOperationException("Not used.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                return this.f57944a.equals(((e) obj).f57944a);
            }
            return false;
        }

        public List f() {
            return this.f57945b;
        }

        @Override // oi.u
        public int h() {
            return this.f57944a.h();
        }

        public int hashCode() {
            return this.f57944a.hashCode();
        }

        @Override // oi.u
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public oi.o i(net.time4j.r rVar, InterfaceC5908d interfaceC5908d) {
            throw new UnsupportedOperationException("Not used.");
        }

        @Override // oi.u
        public String n(oi.y yVar, Locale locale) {
            throw new UnsupportedOperationException("Not used.");
        }

        public String toString() {
            return this.f57944a.r().getName();
        }
    }

    /* renamed from: net.time4j.format.expert.c$f */
    public static class f implements oi.o, InterfaceC5472f {

        /* renamed from: a, reason: collision with root package name */
        public final net.time4j.r f57946a;

        /* renamed from: b, reason: collision with root package name */
        public final String f57947b;

        /* renamed from: c, reason: collision with root package name */
        public final net.time4j.tz.k f57948c;

        public /* synthetic */ f(net.time4j.r rVar, String str, net.time4j.tz.k kVar, a aVar) {
            this(rVar, str, kVar);
        }

        @Override // li.InterfaceC5472f
        public int a() {
            return b().a();
        }

        public final InterfaceC5472f b() {
            oi.F f10;
            try {
                f10 = oi.x.z(this.f57946a.g().getClass()).b();
            } catch (RuntimeException unused) {
                f10 = oi.F.f61255a;
            }
            return this.f57946a.a(net.time4j.tz.l.N(this.f57948c), f10);
        }

        @Override // oi.o
        public Object c(oi.p pVar) {
            return this.f57946a.c(pVar);
        }

        @Override // oi.o
        public boolean d() {
            return true;
        }

        @Override // oi.o
        public int e(oi.p pVar) {
            return this.f57946a.e(pVar);
        }

        @Override // oi.o
        public boolean f(oi.p pVar) {
            return this.f57946a.f(pVar);
        }

        @Override // oi.o
        public Object j(oi.p pVar) {
            return this.f57946a.j(pVar);
        }

        @Override // li.InterfaceC5472f
        public long k() {
            return b().k();
        }

        @Override // oi.o
        public Object m(oi.p pVar) {
            return this.f57946a.m(pVar);
        }

        @Override // oi.o
        public net.time4j.tz.k r() {
            return this.f57948c;
        }

        public f(net.time4j.r rVar, String str, net.time4j.tz.k kVar) {
            this.f57946a = rVar;
            this.f57947b = str;
            this.f57948c = kVar;
        }
    }

    public /* synthetic */ C5709c(C5709c c5709c, C5708b c5708b, a aVar) {
        this(c5709c, c5708b);
    }

    public static boolean A(oi.x xVar, oi.x xVar2, oi.p pVar) {
        Iterator it = xVar.t().iterator();
        while (it.hasNext()) {
            if (((oi.s) it.next()).a(pVar)) {
                return true;
            }
        }
        if (xVar2 != null) {
            if (pVar.Y()) {
                Iterator it2 = xVar2.t().iterator();
                while (it2.hasNext()) {
                    if (((oi.s) it2.next()).a(pVar)) {
                        return true;
                    }
                }
                return false;
            }
            if (!pVar.e0() || !net.time4j.G.c0().y(pVar)) {
                return false;
            }
            Iterator it3 = net.time4j.G.c0().t().iterator();
            while (it3.hasNext()) {
                if (((oi.s) it3.next()).a(pVar)) {
                    return true;
                }
            }
            return false;
        }
        while (true) {
            xVar = xVar.d();
            if (xVar == null) {
                return false;
            }
            Iterator it4 = xVar.t().iterator();
            while (it4.hasNext()) {
                if (((oi.s) it4.next()).a(pVar)) {
                    return true;
                }
            }
        }
    }

    public static C5709c B(net.time4j.format.e eVar, net.time4j.format.e eVar2, Locale locale, net.time4j.tz.k kVar) {
        d dVar = new d(net.time4j.A.N(), locale, (a) null);
        dVar.w(new z(eVar, eVar2));
        return dVar.F().V(kVar);
    }

    public static C5709c C(String str, w wVar, Locale locale, oi.x xVar) {
        d dVar = new d(xVar, locale, (a) null);
        g(dVar, str, wVar);
        try {
            return dVar.F();
        } catch (IllegalStateException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object F(C5709c c5709c, oi.u uVar, List list, CharSequence charSequence, s sVar, InterfaceC5908d interfaceC5908d, net.time4j.format.g gVar, boolean z10, boolean z11) {
        s sVar2;
        InterfaceC5908d interfaceC5908d2;
        oi.q qVar;
        s sVar3;
        boolean i10;
        oi.q qVar2;
        s sVar4;
        oi.q qVar3;
        Object e10;
        oi.q H10;
        s sVar5;
        int length = charSequence.length();
        if (sVar.f() >= length) {
            throw new IndexOutOfBoundsException("[" + sVar.f() + "]: " + charSequence.toString());
        }
        try {
            try {
                if (!c5709c.f57925q || z10) {
                    try {
                        H10 = c5709c.H(charSequence, sVar, interfaceC5908d, z11, c5709c.f57918j);
                        sVar5 = sVar;
                        interfaceC5908d2 = interfaceC5908d;
                    } catch (C5707a e11) {
                        e = e11;
                        sVar2 = sVar;
                        interfaceC5908d2 = interfaceC5908d;
                        qVar = null;
                        sVar3 = sVar2;
                        i10 = sVar3.i();
                        sVar4 = sVar3;
                        qVar2 = qVar;
                        if (!i10) {
                        }
                        if (qVar2 != null) {
                        }
                        return null;
                    }
                    try {
                        sVar5.m(H10);
                        qVar2 = H10;
                        sVar4 = sVar5;
                    } catch (C5707a e12) {
                        e = e12;
                        qVar = H10;
                        sVar3 = sVar5;
                        i10 = sVar3.i();
                        sVar4 = sVar3;
                        qVar2 = qVar;
                        if (!i10) {
                        }
                        if (qVar2 != null) {
                        }
                        return null;
                    }
                } else {
                    u uVar2 = new u();
                    s sVar6 = sVar;
                    ((i) c5709c.f57912d.get(0)).q(charSequence, sVar6, interfaceC5908d, uVar2, z11);
                    if (sVar6.i()) {
                        return null;
                    }
                    try {
                        Object A10 = uVar2.A();
                        if (A10 != null) {
                            return A10;
                        }
                    } catch (ClassCastException unused) {
                    }
                    try {
                        sVar6.m(uVar2);
                        interfaceC5908d2 = interfaceC5908d;
                        sVar4 = sVar6;
                        qVar2 = uVar2;
                    } catch (C5707a e13) {
                        e = e13;
                        interfaceC5908d2 = interfaceC5908d;
                        sVar3 = sVar6;
                        qVar = uVar2;
                        i10 = sVar3.i();
                        sVar4 = sVar3;
                        qVar2 = qVar;
                        if (!i10) {
                        }
                        if (qVar2 != null) {
                        }
                        return null;
                    }
                }
            } catch (C5707a e14) {
                e = e14;
                interfaceC5908d2 = interfaceC5908d;
                qVar = null;
                sVar3 = sVar2;
                i10 = sVar3.i();
                sVar4 = sVar3;
                qVar2 = qVar;
                if (!i10) {
                    sVar3.k(sVar3.f(), e.getMessage());
                    sVar4 = sVar3;
                    qVar2 = qVar;
                }
                if (qVar2 != null) {
                    if (!c5709c.f57913e.isEmpty()) {
                    }
                    qVar3 = qVar2;
                    if (c5709c.f57917i) {
                    }
                    try {
                        e10 = uVar.e(qVar3, interfaceC5908d2, gVar.a(), z10);
                        if (c5709c.f57914f != null) {
                        }
                        if (e10 != null) {
                        }
                    } catch (RuntimeException e15) {
                        sVar4.k(length, e15.getMessage() + t(qVar3));
                    }
                }
                return null;
            }
        } catch (C5707a e16) {
            e = e16;
            sVar2 = sVar;
        }
        if (qVar2 != null && !sVar4.i()) {
            if (!c5709c.f57913e.isEmpty()) {
                Set set = null;
                for (oi.p pVar : c5709c.f57913e.keySet()) {
                    if (!qVar2.f(pVar)) {
                        char a10 = pVar.a();
                        boolean z12 = true;
                        if (a10 != 0) {
                            if (set == null) {
                                set = qVar2.u();
                            }
                            Iterator it = set.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (((oi.p) it.next()).a() == a10) {
                                    z12 = false;
                                    break;
                                }
                            }
                        }
                        if (z12) {
                            O(qVar2, pVar, c5709c.f57913e.get(pVar));
                        }
                    }
                }
            }
            qVar3 = qVar2;
            if (c5709c.f57917i) {
                try {
                    Iterator it2 = list.iterator();
                    qVar2 = qVar2;
                    while (true) {
                        qVar3 = qVar2;
                        if (it2.hasNext()) {
                            qVar2 = ((oi.s) it2.next()).d(qVar2, c5709c.u(), interfaceC5908d2);
                        }
                    }
                    e10 = uVar.e(qVar3, interfaceC5908d2, gVar.a(), z10);
                    if (c5709c.f57914f != null && (e10 instanceof oi.q)) {
                        e10 = h(c5709c.f57914f.j((oi.q) oi.q.class.cast(e10), qVar3));
                    }
                    if (e10 != null) {
                        return gVar.c() ? i(qVar3, e10, charSequence, sVar4) : e10;
                    }
                    if (!z10) {
                        sVar4.k(length, v(qVar3) + t(qVar3));
                    }
                    return null;
                } catch (RuntimeException e17) {
                    sVar4.k(length, e17.getMessage() + t(qVar2));
                    return null;
                }
            }
            e10 = uVar.e(qVar3, interfaceC5908d2, gVar.a(), z10);
            if (c5709c.f57914f != null) {
                e10 = h(c5709c.f57914f.j((oi.q) oi.q.class.cast(e10), qVar3));
            }
            if (e10 != null) {
            }
        }
        return null;
    }

    public static Object G(C5709c c5709c, oi.x xVar, int i10, CharSequence charSequence, s sVar, InterfaceC5908d interfaceC5908d, net.time4j.format.g gVar, boolean z10) {
        boolean z11;
        oi.x xVar2;
        CharSequence charSequence2;
        s sVar2;
        net.time4j.format.g gVar2;
        boolean z12;
        C5709c c5709c2;
        oi.x xVar3;
        oi.x d10 = xVar.d();
        if (d10 == null || xVar == (xVar3 = c5709c.f57923o)) {
            List t10 = xVar.t();
            if (i10 > 0) {
                z11 = true;
                c5709c2 = c5709c;
                xVar2 = xVar;
                charSequence2 = charSequence;
                gVar2 = gVar;
                z12 = z10;
                sVar2 = sVar;
            } else {
                z11 = false;
                xVar2 = xVar;
                charSequence2 = charSequence;
                sVar2 = sVar;
                gVar2 = gVar;
                z12 = z10;
                c5709c2 = c5709c;
            }
            return F(c5709c2, xVar2, t10, charSequence2, sVar2, interfaceC5908d, gVar2, z11, z12);
        }
        Object F10 = d10 == xVar3 ? F(c5709c, d10, d10.t(), charSequence, sVar, interfaceC5908d, gVar, true, z10) : G(c5709c, d10, i10 + 1, charSequence, sVar, interfaceC5908d, gVar, z10);
        if (sVar.i()) {
            return null;
        }
        if (F10 == null) {
            oi.q g10 = sVar.g();
            sVar.k(charSequence.length(), v(g10) + t(g10));
            return null;
        }
        oi.q h10 = sVar.h();
        try {
            if (!(d10 instanceof H)) {
                throw new IllegalStateException("Unsupported chronology or preparser: " + xVar);
            }
            Q(h10, ((H) H.class.cast(d10)).F(), F10);
            Object e10 = xVar.e(h10, interfaceC5908d, gVar.a(), false);
            if (e10 != null) {
                return gVar.c() ? i(h10, e10, charSequence, sVar) : e10;
            }
            if (!sVar.i()) {
                sVar.k(charSequence.length(), v(h10) + t(h10));
            }
            return null;
        } catch (RuntimeException e11) {
            sVar.k(charSequence.length(), e11.getMessage() + t(h10));
            return null;
        }
    }

    public static C5709c L() {
        d N10 = N(net.time4j.A.class, Locale.ENGLISH);
        M(N10);
        N10.C(net.time4j.format.e.MEDIUM, false, Arrays.asList("GMT", "UT", "Z"));
        N10.U();
        M(N10);
        HashMap hashMap = new HashMap();
        net.time4j.tz.f fVar = net.time4j.tz.f.BEHIND_UTC;
        hashMap.put("EST", net.time4j.tz.p.n(fVar, 5));
        hashMap.put("EDT", net.time4j.tz.p.n(fVar, 4));
        hashMap.put("CST", net.time4j.tz.p.n(fVar, 6));
        hashMap.put("CDT", net.time4j.tz.p.n(fVar, 5));
        hashMap.put("MST", net.time4j.tz.p.n(fVar, 7));
        hashMap.put("MDT", net.time4j.tz.p.n(fVar, 6));
        hashMap.put("PST", net.time4j.tz.p.n(fVar, 8));
        hashMap.put("PDT", net.time4j.tz.p.n(fVar, 7));
        N10.w(new C5712f(B.TIMEZONE_OFFSET, new a(), new b(hashMap)));
        return N10.F().V(net.time4j.tz.p.f58410k);
    }

    public static void M(d dVar) {
        d X10 = dVar.X();
        InterfaceC5907c interfaceC5907c = net.time4j.format.a.f57808g;
        net.time4j.format.v vVar = net.time4j.format.v.ABBREVIATED;
        X10.b0(interfaceC5907c, vVar).A(net.time4j.F.f57542t).L().n(", ").L().j(net.time4j.F.f57541s, 1, 2).l(' ').b0(interfaceC5907c, vVar).A(net.time4j.F.f57539q).L().l(' ').g(net.time4j.F.f57536n, 4).l(' ').g(net.time4j.G.f57590t, 2).l(':').g(net.time4j.G.f57592v, 2).X().l(':').g(net.time4j.G.f57594x, 2).L().l(' ');
    }

    public static d N(Class cls, Locale locale) {
        if (cls == null) {
            throw new NullPointerException("Missing chronological type.");
        }
        oi.x z10 = oi.x.z(cls);
        if (z10 != null) {
            return new d(z10, locale, (a) null);
        }
        throw new IllegalArgumentException("Not formattable: " + cls);
    }

    public static void O(oi.q qVar, oi.p pVar, Object obj) {
        qVar.y(pVar, pVar.getType().cast(obj));
    }

    public static String P(int i10, CharSequence charSequence) {
        int length = charSequence.length();
        if (length - i10 <= 10) {
            return charSequence.subSequence(i10, length).toString();
        }
        return charSequence.subSequence(i10, i10 + 10).toString() + "...";
    }

    public static void Q(oi.q qVar, oi.p pVar, Object obj) {
        qVar.y(pVar, pVar.getType().cast(obj));
    }

    public static void g(d dVar, String str, w wVar) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt == '\'') {
                int i11 = i10 + 1;
                boolean z10 = str.charAt(i11) == 'Z';
                while (i11 < length) {
                    if (str.charAt(i11) == '\'') {
                        int i12 = i11 + 1;
                        if (i12 >= length || str.charAt(i12) != '\'') {
                            if (z10 && i11 == i10 + 2 && d.R(dVar.f57928a)) {
                                throw new IllegalArgumentException("Z-literal (=UTC+00) should not be escaped: " + str);
                            }
                            i10 = i11;
                        } else {
                            i11 = i12;
                        }
                    }
                    i11++;
                }
                i10 = i11;
            } else {
                sb2.append(charAt);
            }
            i10++;
        }
        String sb3 = sb2.toString();
        int i13 = C0842c.$SwitchMap$net$time4j$format$expert$PatternType[wVar.ordinal()];
        if (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) {
            if ((sb3.contains(C4527h.f48087o) || sb3.contains("K")) && !sb3.contains("a") && !sb3.contains(com.google.crypto.tink.integration.android.b.f37029b) && !sb3.contains("B")) {
                throw new IllegalArgumentException("12-hour-clock requires am/pm-marker or dayperiod: " + str);
            }
            if (sb3.contains("Y") && ((sb3.contains("M") || sb3.contains("L")) && !sb3.contains("w"))) {
                throw new IllegalArgumentException("Y as week-based-year requires a week-date-format: " + str);
            }
            if (sb3.contains("D") && ((sb3.contains("M") || sb3.contains("L")) && !sb3.contains(W9.d.f13160a))) {
                throw new IllegalArgumentException("D is the day of year but not the day of month: " + str);
            }
        }
        dVar.v(str, wVar);
    }

    public static Object h(Object obj) {
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0108, code lost:
    
        if (((net.time4j.G) r10.j(r6)).q() == 24) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object i(oi.q qVar, Object obj, CharSequence charSequence, s sVar) {
        K k10;
        Object j10;
        boolean equals;
        if (obj instanceof InterfaceC5472f) {
            InterfaceC5472f interfaceC5472f = (InterfaceC5472f) InterfaceC5472f.class.cast(obj);
            B b10 = B.TIMEZONE_ID;
            if (qVar.f(b10)) {
                B b11 = B.TIMEZONE_OFFSET;
                if (qVar.f(b11)) {
                    net.time4j.tz.k kVar = (net.time4j.tz.k) qVar.j(b10);
                    net.time4j.tz.k kVar2 = (net.time4j.tz.k) qVar.j(b11);
                    if (!net.time4j.tz.l.N(kVar).B(interfaceC5472f).equals(kVar2)) {
                        sVar.k(charSequence.length(), "Ambivalent offset information: " + kVar + " versus " + kVar2);
                        return null;
                    }
                }
            }
            EnumC5901B enumC5901B = EnumC5901B.DAYLIGHT_SAVING;
            if (qVar.f(enumC5901B)) {
                try {
                    boolean I10 = net.time4j.tz.l.N(qVar.r()).I(interfaceC5472f);
                    if (I10 != ((Boolean) qVar.j(enumC5901B)).booleanValue()) {
                        StringBuilder sb2 = new StringBuilder(256);
                        sb2.append("Conflict found: ");
                        sb2.append("Parsed entity is ");
                        if (!I10) {
                            sb2.append("not ");
                        }
                        sb2.append("daylight-saving, but timezone name");
                        sb2.append(" has not the appropriate form in {");
                        sb2.append(charSequence.toString());
                        sb2.append("}.");
                        sVar.k(charSequence.length(), sb2.toString());
                        return null;
                    }
                } catch (IllegalArgumentException e10) {
                    StringBuilder sb3 = new StringBuilder(256);
                    sb3.append("Unable to check timezone name: ");
                    sb3.append(e10.getMessage());
                    sVar.k(charSequence.length(), sb3.toString());
                    return null;
                }
            }
            return obj;
        }
        if (obj instanceof oi.o) {
            oi.o oVar = (oi.o) obj;
            if ((obj instanceof net.time4j.H) && ((net.time4j.H) net.time4j.H.class.cast(obj)).q() == 0) {
                if (qVar.e(net.time4j.G.f57591u) != 24) {
                    V v10 = net.time4j.G.f57585o;
                    if (qVar.f(v10)) {
                    }
                }
                k10 = ((net.time4j.H) net.time4j.H.class.cast(obj)).Z().D(1L, EnumC5706f.f57798h);
                for (oi.p pVar : qVar.u()) {
                    net.time4j.K k11 = net.time4j.G.f57594x;
                    if (pVar != k11 || qVar.e(k11) != 60) {
                        if (k10 != null) {
                            if (pVar.Y()) {
                                oVar = k10;
                            } else if (pVar.e0()) {
                                oVar = net.time4j.G.y0();
                            }
                        }
                        if (oVar.f(pVar)) {
                            if (pVar.getType() == Integer.class) {
                                oi.p pVar2 = (oi.p) h(pVar);
                                int e11 = qVar.e(pVar2);
                                if (oVar.e(pVar2) != e11) {
                                    j10 = Integer.valueOf(e11);
                                    equals = false;
                                } else {
                                    equals = true;
                                    j10 = null;
                                }
                            } else {
                                j10 = qVar.j(pVar);
                                equals = oVar.j(pVar).equals(j10);
                            }
                            if (!equals) {
                                StringBuilder sb4 = new StringBuilder(256);
                                sb4.append("Conflict found: ");
                                sb4.append("Text {");
                                sb4.append(charSequence.toString());
                                sb4.append("} with element ");
                                sb4.append(pVar.name());
                                sb4.append(" {");
                                sb4.append(j10);
                                sb4.append("}, but parsed entity ");
                                sb4.append("has element value {");
                                sb4.append(oVar.j(pVar));
                                sb4.append("}.");
                                sVar.k(charSequence.length(), sb4.toString());
                                return null;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            k10 = null;
            while (r6.hasNext()) {
            }
        }
        return obj;
    }

    public static oi.x j(oi.x xVar, oi.x xVar2, oi.p pVar) {
        if (xVar.y(pVar)) {
            return xVar;
        }
        if (xVar2 == null) {
            do {
                xVar = xVar.d();
                if (xVar != null) {
                }
            } while (!xVar.y(pVar));
            return xVar;
        }
        if (pVar.Y() && xVar2.y(pVar)) {
            return xVar2;
        }
        if (pVar.e0() && net.time4j.G.c0().y(pVar)) {
            return net.time4j.G.c0();
        }
        throw new IllegalArgumentException("Unsupported element: " + pVar.name());
    }

    public static int s(oi.x xVar, oi.x xVar2, oi.x xVar3) {
        if (xVar3 != null) {
            return -1;
        }
        int i10 = 0;
        if (xVar.equals(xVar2)) {
            return 0;
        }
        do {
            xVar2 = xVar2.d();
            if (xVar2 == null) {
                return Integer.MAX_VALUE;
            }
            i10++;
        } while (!xVar.equals(xVar2));
        return i10;
    }

    public static String t(oi.q qVar) {
        Set<oi.p> u10 = qVar.u();
        StringBuilder sb2 = new StringBuilder(u10.size() * 16);
        sb2.append(" [parsed={");
        boolean z10 = true;
        for (oi.p pVar : u10) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(pVar.name());
            sb2.append('=');
            sb2.append(qVar.j(pVar));
        }
        sb2.append("}]");
        return sb2.toString();
    }

    public static String v(oi.q qVar) {
        N n10 = N.ERROR_MESSAGE;
        if (!qVar.f(n10)) {
            return "Insufficient data:";
        }
        String str = "Validation failed => " + ((String) qVar.j(n10));
        qVar.y(n10, null);
        return str;
    }

    public static boolean y(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public Object D(CharSequence charSequence) {
        s sVar = new s();
        Object E10 = E(charSequence, sVar);
        if (E10 == null) {
            throw new ParseException(sVar.d(), sVar.c());
        }
        int f10 = sVar.f();
        if (this.f57921m || f10 >= charSequence.length()) {
            return E10;
        }
        throw new ParseException("Unparsed trailing characters: " + P(f10, charSequence), f10);
    }

    public Object E(CharSequence charSequence, s sVar) {
        if (!this.f57922n) {
            return b(charSequence, sVar, this.f57911c);
        }
        oi.x xVar = this.f57909a;
        return F(this, xVar, xVar.t(), charSequence, sVar, this.f57911c, this.f57919k, false, true);
    }

    public final oi.q H(CharSequence charSequence, s sVar, InterfaceC5908d interfaceC5908d, boolean z10, int i10) {
        LinkedList linkedList;
        v vVar;
        v vVar2;
        int i11;
        oi.p b10;
        v vVar3 = new v(i10, this.f57920l);
        vVar3.X(sVar.f());
        if (this.f57915g) {
            LinkedList linkedList2 = new LinkedList();
            linkedList2.push(vVar3);
            linkedList = linkedList2;
        } else {
            linkedList = null;
        }
        int size = this.f57912d.size();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i14 < size) {
            i iVar = (i) this.f57912d.get(i14);
            if (linkedList == null) {
                vVar2 = vVar3;
                vVar = vVar2;
            } else {
                i12 = iVar.b();
                int i15 = i12;
                while (i15 > i13) {
                    vVar3 = new v(i10 >>> 1, this.f57920l);
                    vVar3.X(sVar.f());
                    linkedList.push(vVar3);
                    i15--;
                }
                while (i15 < i13) {
                    vVar3 = (v) linkedList.pop();
                    ((v) linkedList.peek()).R(vVar3);
                    i15++;
                }
                vVar = vVar3;
                vVar2 = (v) linkedList.peek();
            }
            int i16 = i12;
            sVar.b();
            iVar.q(charSequence, sVar, interfaceC5908d, vVar2, z10);
            if (sVar.j() && (b10 = iVar.d().b()) != null && this.f57913e.containsKey(b10)) {
                vVar2.C(b10, this.f57913e.get(b10));
                vVar2.y(N.ERROR_MESSAGE, null);
                sVar.a();
                sVar.b();
            }
            if (sVar.i()) {
                int f10 = iVar.f();
                if (!iVar.i()) {
                    i11 = i14 + 1;
                    while (i11 < size) {
                        i iVar2 = (i) this.f57912d.get(i11);
                        if (iVar2.i() && iVar2.f() == f10) {
                            break;
                        }
                        i11++;
                    }
                }
                i11 = i14;
                if (i11 > i14 || iVar.i()) {
                    if (linkedList != null) {
                        vVar = (v) linkedList.pop();
                    }
                    sVar.a();
                    sVar.l(vVar.M());
                    vVar.V();
                    if (linkedList != null) {
                        linkedList.push(vVar);
                    }
                    i14 = i11;
                } else {
                    if (i16 == 0) {
                        if (linkedList != null) {
                            vVar = (v) linkedList.peek();
                        }
                        vVar.W();
                        return vVar;
                    }
                    int b11 = iVar.b();
                    int i17 = i11;
                    for (int i18 = i14 + 1; i18 < size && ((i) this.f57912d.get(i18)).b() > b11; i18++) {
                        i17 = i18;
                    }
                    int i19 = size - 1;
                    while (true) {
                        if (i19 <= i17) {
                            break;
                        }
                        if (((i) this.f57912d.get(i19)).f() == f10) {
                            i17 = i19;
                            break;
                        }
                        i19--;
                    }
                    i16--;
                    vVar3 = (v) linkedList.pop();
                    sVar.a();
                    sVar.l(vVar3.M());
                    i14 = i17;
                    i14++;
                    i12 = i16;
                    i13 = i12;
                }
            } else if (iVar.i()) {
                i14 = iVar.u();
            }
            vVar3 = vVar;
            i14++;
            i12 = i16;
            i13 = i12;
        }
        while (i12 > 0) {
            vVar3 = (v) linkedList.pop();
            ((v) linkedList.peek()).R(vVar3);
            i12--;
        }
        if (linkedList != null) {
            vVar3 = (v) linkedList.peek();
        }
        vVar3.W();
        return vVar3;
    }

    public String I(Object obj) {
        return m(k(obj, this.f57911c));
    }

    public Set J(Object obj, Appendable appendable, InterfaceC5908d interfaceC5908d) {
        return K(k(obj, interfaceC5908d), appendable, interfaceC5908d, true);
    }

    public Set K(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d, boolean z10) {
        LinkedList linkedList;
        Throwable th2;
        int i10;
        int i11;
        Appendable appendable2 = appendable;
        if (appendable2 == null) {
            throw new NullPointerException("Missing text result buffer.");
        }
        int size = this.f57912d.size();
        int i12 = 0;
        InterfaceC5908d interfaceC5908d2 = interfaceC5908d;
        boolean z11 = interfaceC5908d2 == this.f57911c;
        Set linkedHashSet = z10 ? new LinkedHashSet(size) : null;
        if (this.f57916h) {
            LinkedList linkedList2 = new LinkedList();
            linkedList2.push(new StringBuilder(size << 2));
            if (z10) {
                LinkedList linkedList3 = new LinkedList();
                linkedList3.push(linkedHashSet);
                linkedList = linkedList3;
            } else {
                linkedList = null;
            }
            int i13 = 0;
            while (i13 < size) {
                i iVar = (i) this.f57912d.get(i13);
                int b10 = iVar.b();
                int i14 = b10;
                while (i14 > i12) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((CharSequence) linkedList2.peek());
                    linkedList2.push(sb2);
                    if (z10) {
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        linkedHashSet2.addAll((Collection) linkedList.peek());
                        linkedList.push(linkedHashSet2);
                        linkedHashSet = linkedHashSet2;
                    }
                    i14--;
                }
                while (i14 < i12) {
                    StringBuilder sb3 = (StringBuilder) linkedList2.pop();
                    linkedList2.pop();
                    linkedList2.push(sb3);
                    if (z10) {
                        Set set = (Set) linkedList.pop();
                        linkedList.pop();
                        linkedList.push(set);
                        linkedHashSet = set;
                    }
                    i14++;
                }
                StringBuilder sb4 = (StringBuilder) linkedList2.peek();
                if (z10) {
                    linkedHashSet = (Set) linkedList.peek();
                }
                try {
                    i10 = iVar.r(oVar, sb4, interfaceC5908d2, linkedHashSet, z11);
                    th2 = null;
                } catch (IllegalArgumentException | oi.r e10) {
                    th2 = e10;
                    i10 = -1;
                }
                if (i10 == -1) {
                    int f10 = iVar.f();
                    if (!iVar.i()) {
                        i11 = i13 + 1;
                        while (i11 < size) {
                            i iVar2 = (i) this.f57912d.get(i11);
                            if (iVar2.i() && iVar2.f() == f10) {
                                break;
                            }
                            i11++;
                        }
                    }
                    i11 = i13;
                    if (i11 <= i13 && !iVar.i()) {
                        if (th2 == null) {
                            throw new IllegalArgumentException("Not formattable: " + oVar);
                        }
                        throw new IllegalArgumentException("Not formattable: " + oVar, th2);
                    }
                    linkedList2.pop();
                    StringBuilder sb5 = new StringBuilder();
                    if (!linkedList2.isEmpty()) {
                        sb5.append((CharSequence) linkedList2.peek());
                    }
                    linkedList2.push(sb5);
                    if (z10) {
                        linkedList.pop();
                        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                        if (!linkedList.isEmpty()) {
                            linkedHashSet3.addAll((Collection) linkedList.peek());
                        }
                        linkedList.push(linkedHashSet3);
                    }
                    i13 = i11;
                } else if (iVar.i()) {
                    i13 = iVar.u();
                }
                i13++;
                interfaceC5908d2 = interfaceC5908d;
                i12 = b10;
            }
            StringBuilder sb6 = (StringBuilder) linkedList2.peek();
            linkedList2.clear();
            appendable2.append(sb6);
            if (z10) {
                Set set2 = (Set) linkedList.peek();
                linkedList.clear();
                linkedHashSet = set2;
            }
        } else {
            int i15 = 0;
            while (i15 < size) {
                try {
                    i iVar3 = (i) this.f57912d.get(i15);
                    iVar3.r(oVar, appendable2, interfaceC5908d, linkedHashSet, z11);
                    if (iVar3.i()) {
                        i15 = iVar3.u();
                    }
                    i15++;
                    appendable2 = appendable;
                } catch (oi.r e11) {
                    throw new IllegalArgumentException("Not formattable: " + oVar, e11);
                }
            }
        }
        if (z10) {
            return Collections.unmodifiableSet(linkedHashSet);
        }
        return null;
    }

    public C5709c R(Map map, C5708b c5708b) {
        C5708b k10 = C5708b.k(c5708b, this.f57911c);
        return new C5709c(new C5709c(this, map), k10, (net.time4j.history.d) k10.b(net.time4j.history.internal.a.f58201a, null));
    }

    public C5709c S(net.time4j.format.g gVar) {
        return U(net.time4j.format.a.f57807f, gVar);
    }

    public C5709c T(net.time4j.tz.l lVar) {
        if (lVar == null) {
            throw new NullPointerException("Missing timezone id.");
        }
        return new C5709c(this, this.f57911c.l(new a.b().f(this.f57911c.e()).i(lVar.z()).a()).m(net.time4j.format.a.f57806e, lVar.E()));
    }

    public C5709c U(InterfaceC5907c interfaceC5907c, Enum r42) {
        return new C5709c(this, new a.b().f(this.f57911c.e()).d(interfaceC5907c, r42).a());
    }

    public C5709c V(net.time4j.tz.k kVar) {
        return T(net.time4j.tz.l.N(kVar));
    }

    @Override // net.time4j.format.expert.InterfaceC5711e
    public Object a(Object obj, Appendable appendable, InterfaceC5908d interfaceC5908d, oi.t tVar) {
        oi.o k10 = k(obj, interfaceC5908d);
        K(k10, appendable, interfaceC5908d, false);
        return tVar.apply(k10);
    }

    @Override // net.time4j.format.expert.InterfaceC5710d
    public Object b(CharSequence charSequence, s sVar, InterfaceC5908d interfaceC5908d) {
        boolean z10;
        InterfaceC5908d interfaceC5908d2;
        net.time4j.format.g gVar;
        net.time4j.tz.k kVar;
        net.time4j.A a10;
        net.time4j.format.g gVar2 = this.f57919k;
        C5708b c5708b = this.f57911c;
        if (interfaceC5908d != c5708b) {
            p pVar = new p(interfaceC5908d, c5708b);
            z10 = false;
            interfaceC5908d2 = pVar;
            gVar = (net.time4j.format.g) pVar.b(net.time4j.format.a.f57807f, net.time4j.format.g.SMART);
        } else {
            z10 = true;
            interfaceC5908d2 = interfaceC5908d;
            gVar = gVar2;
        }
        boolean z11 = z10;
        e eVar = this.f57910b;
        if (eVar == null) {
            return G(this, this.f57909a, 0, charSequence, sVar, interfaceC5908d2, gVar, z11);
        }
        List f10 = eVar.f();
        e eVar2 = this.f57910b;
        net.time4j.r rVar = (net.time4j.r) F(this, eVar2, f10, charSequence, sVar, interfaceC5908d2, gVar, true, z11);
        if (sVar.i()) {
            return null;
        }
        oi.q h10 = sVar.h();
        if (h10.d()) {
            kVar = h10.r();
        } else {
            InterfaceC5907c interfaceC5907c = net.time4j.format.a.f57805d;
            kVar = interfaceC5908d2.c(interfaceC5907c) ? (net.time4j.tz.k) interfaceC5908d2.a(interfaceC5907c) : null;
        }
        if (kVar != null) {
            oi.F f11 = (oi.F) interfaceC5908d.b(net.time4j.format.a.f57822u, eVar2.b());
            EnumC5901B enumC5901B = EnumC5901B.DAYLIGHT_SAVING;
            if (h10.f(enumC5901B)) {
                a10 = rVar.a(net.time4j.tz.l.N(kVar).Q(((net.time4j.tz.o) interfaceC5908d2.b(net.time4j.format.a.f57806e, net.time4j.tz.l.f58348d)).a(((Boolean) h10.j(enumC5901B)).booleanValue() ? net.time4j.tz.g.EARLIER_OFFSET : net.time4j.tz.g.LATER_OFFSET)), f11);
            } else {
                InterfaceC5907c interfaceC5907c2 = net.time4j.format.a.f57806e;
                a10 = interfaceC5908d2.c(interfaceC5907c2) ? rVar.a(net.time4j.tz.l.N(kVar).Q((net.time4j.tz.o) interfaceC5908d2.a(interfaceC5907c2)), f11) : rVar.a(net.time4j.tz.l.N(kVar), f11);
            }
        } else {
            a10 = null;
        }
        if (a10 == null) {
            sVar.k(charSequence.length(), "Missing timezone or offset.");
            return null;
        }
        h10.y(net.time4j.A.N().F(), a10);
        Object h11 = h(a10);
        if (gVar.c()) {
            i(h10, h11, charSequence, sVar);
        }
        return h11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5709c) {
            C5709c c5709c = (C5709c) obj;
            if (this.f57909a.equals(c5709c.f57909a) && y(this.f57910b, c5709c.f57910b) && this.f57911c.equals(c5709c.f57911c) && this.f57913e.equals(c5709c.f57913e) && this.f57912d.equals(c5709c.f57912d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f57909a.hashCode() * 7) + (this.f57911c.hashCode() * 31) + (this.f57912d.hashCode() * 37);
    }

    public final oi.o k(Object obj, InterfaceC5908d interfaceC5908d) {
        net.time4j.r k02;
        e eVar = this.f57910b;
        if (eVar == null) {
            return this.f57909a.i(obj, interfaceC5908d);
        }
        try {
            Class r10 = eVar.c().r();
            oi.F f10 = (oi.F) interfaceC5908d.b(net.time4j.format.a.f57822u, this.f57910b.b());
            net.time4j.A a10 = (net.time4j.A) net.time4j.A.class.cast(obj);
            net.time4j.tz.k kVar = (net.time4j.tz.k) interfaceC5908d.a(net.time4j.format.a.f57805d);
            String str = "";
            a aVar = null;
            if (AbstractC5916l.class.isAssignableFrom(r10)) {
                android.support.v4.media.session.b.a(h(this.f57910b.c()));
                str = (String) interfaceC5908d.a(net.time4j.format.a.f57821t);
                k02 = a10.j0(null, str, kVar, f10);
            } else {
                if (!AbstractC5917m.class.isAssignableFrom(r10)) {
                    throw new IllegalStateException("Unexpected calendar override: " + r10);
                }
                k02 = a10.k0(this.f57910b.c(), kVar, f10);
            }
            return new f(k02, str, kVar, aVar);
        } catch (ClassCastException e10) {
            throw new IllegalArgumentException("Not formattable: " + obj, e10);
        } catch (NoSuchElementException e11) {
            throw new IllegalArgumentException(e11.getMessage(), e11);
        }
    }

    public String l(Object obj) {
        return I(obj);
    }

    public final String m(oi.o oVar) {
        StringBuilder sb2 = new StringBuilder(this.f57912d.size() * 8);
        try {
            K(oVar, sb2, this.f57911c, false);
            return sb2.toString();
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public final List n(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((i) it.next()).s(this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public InterfaceC5908d o() {
        return this.f57911c;
    }

    public C5708b p() {
        return this.f57911c;
    }

    public oi.x q() {
        return this.f57909a;
    }

    public Map r() {
        return this.f57913e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append("net.time4j.format.ChronoFormatter[chronology=");
        sb2.append(this.f57909a.r().getName());
        if (this.f57910b != null) {
            sb2.append(", override=");
            sb2.append(this.f57910b);
        }
        sb2.append(", default-attributes=");
        sb2.append(this.f57911c);
        sb2.append(", default-values=");
        sb2.append(this.f57913e);
        sb2.append(", processors=");
        boolean z10 = true;
        for (i iVar : this.f57912d) {
            if (z10) {
                sb2.append('{');
                z10 = false;
            } else {
                sb2.append('|');
            }
            sb2.append(iVar);
        }
        sb2.append("}]");
        return sb2.toString();
    }

    public Locale u() {
        return this.f57911c.h();
    }

    public final boolean w() {
        boolean z10 = z();
        if (z10) {
            h d10 = ((i) this.f57912d.get(0)).d();
            if (d10 instanceof C5712f) {
                return ((C5712f) C5712f.class.cast(d10)).h();
            }
            if (!(d10 instanceof z)) {
                return false;
            }
        }
        return z10;
    }

    public final boolean x() {
        return this.f57909a.d() == null && this.f57910b == null;
    }

    public boolean z() {
        return this.f57924p == 1 && !this.f57915g;
    }

    public /* synthetic */ C5709c(oi.x xVar, oi.x xVar2, Locale locale, List list, Map map, net.time4j.format.a aVar, oi.x xVar3, a aVar2) {
        this(xVar, xVar2, locale, list, map, aVar, xVar3);
    }

    public C5709c(oi.x xVar, oi.x xVar2, Locale locale, List list, Map map, net.time4j.format.a aVar, oi.x xVar3) {
        if (xVar != null) {
            if (!list.isEmpty()) {
                this.f57909a = xVar;
                this.f57910b = e.g(xVar2);
                this.f57923o = xVar3;
                C5708b d10 = C5708b.d(xVar2 == null ? xVar : xVar2, aVar, locale);
                this.f57911c = d10;
                this.f57919k = (net.time4j.format.g) d10.b(net.time4j.format.a.f57807f, net.time4j.format.g.SMART);
                this.f57913e = Collections.unmodifiableMap(map);
                Iterator it = list.iterator();
                j jVar = null;
                boolean z10 = true;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                int i10 = 0;
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    z12 = iVar.i() ? true : z12;
                    if (jVar == null && (iVar.d() instanceof j)) {
                        jVar = (j) j.class.cast(iVar.d());
                    }
                    if (!z11 && iVar.b() > 0) {
                        z11 = true;
                    }
                    oi.p b10 = iVar.d().b();
                    if (b10 != null) {
                        i10++;
                        if (z10 && !v.N(b10)) {
                            z10 = false;
                        }
                        if (!z13) {
                            z13 = A(xVar, xVar2, b10);
                        }
                    }
                }
                this.f57914f = jVar;
                this.f57915g = z11;
                this.f57916h = z12;
                this.f57917i = z13;
                this.f57918j = i10;
                this.f57920l = z10;
                this.f57921m = ((Boolean) this.f57911c.b(net.time4j.format.a.f57819r, Boolean.FALSE)).booleanValue();
                this.f57922n = x();
                this.f57924p = list.size();
                this.f57912d = n(list);
                this.f57925q = w();
                return;
            }
            throw new IllegalStateException("No format processors defined.");
        }
        throw new NullPointerException("Missing chronology.");
    }

    public C5709c(C5709c c5709c, net.time4j.format.a aVar) {
        this(c5709c, c5709c.f57911c.l(aVar), (net.time4j.history.d) null);
    }

    public C5709c(C5709c c5709c, C5708b c5708b) {
        this(c5709c, c5708b, (net.time4j.history.d) null);
    }

    public C5709c(C5709c c5709c, C5708b c5708b, net.time4j.history.d dVar) {
        oi.p B10;
        if (c5708b != null) {
            this.f57909a = c5709c.f57909a;
            this.f57910b = c5709c.f57910b;
            this.f57923o = c5709c.f57923o;
            this.f57911c = c5708b;
            this.f57919k = (net.time4j.format.g) c5708b.b(net.time4j.format.a.f57807f, net.time4j.format.g.SMART);
            this.f57913e = Collections.unmodifiableMap(new q(c5709c.f57913e));
            this.f57914f = c5709c.f57914f;
            this.f57915g = c5709c.f57915g;
            this.f57916h = c5709c.f57916h;
            this.f57917i = c5709c.f57917i || dVar != null;
            this.f57918j = c5709c.f57918j;
            int size = c5709c.f57912d.size();
            ArrayList arrayList = new ArrayList(c5709c.f57912d);
            boolean z10 = c5709c.f57920l;
            for (int i10 = 0; i10 < size; i10++) {
                i iVar = (i) arrayList.get(i10);
                oi.p b10 = iVar.d().b();
                oi.x xVar = this.f57909a;
                xVar = xVar == net.time4j.A.N() ? xVar.d() : xVar;
                if (b10 != null && !xVar.x(b10)) {
                    Iterator it = xVar.t().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        oi.s sVar = (oi.s) it.next();
                        if (sVar.c(c5709c.u(), c5709c.f57911c).contains(b10)) {
                            Iterator it2 = sVar.c(c5708b.h(), c5708b).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                oi.p pVar = (oi.p) it2.next();
                                if (pVar.name().equals(b10.name())) {
                                    if (pVar != b10) {
                                        arrayList.set(i10, iVar.x(pVar));
                                        z10 = false;
                                    }
                                }
                            }
                        }
                    }
                }
                if (dVar != null) {
                    if (b10 == net.time4j.F.f57536n) {
                        B10 = dVar.K();
                    } else if (b10 != net.time4j.F.f57539q && b10 != net.time4j.F.f57540r) {
                        if (b10 == net.time4j.F.f57541s) {
                            B10 = dVar.g();
                        } else {
                            B10 = b10 == net.time4j.F.f57543u ? dVar.h() : null;
                        }
                    } else {
                        B10 = dVar.B();
                    }
                    if (B10 != null) {
                        arrayList.set(i10, iVar.x(B10));
                    }
                    z10 = false;
                }
            }
            this.f57920l = z10;
            this.f57921m = ((Boolean) this.f57911c.b(net.time4j.format.a.f57819r, Boolean.FALSE)).booleanValue();
            this.f57922n = x();
            this.f57924p = arrayList.size();
            this.f57912d = n(arrayList);
            this.f57925q = w();
            return;
        }
        throw new NullPointerException("Missing global format attributes.");
    }

    public C5709c(C5709c c5709c, Map map) {
        e eVar = c5709c.f57910b;
        oi.x c10 = eVar == null ? null : eVar.c();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            j(c5709c.f57909a, c10, (oi.p) it.next());
        }
        this.f57909a = c5709c.f57909a;
        this.f57910b = c5709c.f57910b;
        this.f57923o = c5709c.f57923o;
        this.f57911c = c5709c.f57911c;
        this.f57919k = c5709c.f57919k;
        this.f57914f = c5709c.f57914f;
        this.f57915g = c5709c.f57915g;
        this.f57916h = c5709c.f57916h;
        this.f57917i = c5709c.f57917i;
        this.f57918j = c5709c.f57918j;
        this.f57921m = c5709c.f57921m;
        HashMap hashMap = new HashMap(c5709c.f57913e);
        boolean z10 = c5709c.f57920l;
        for (oi.p pVar : map.keySet()) {
            Object obj = map.get(pVar);
            if (obj == null) {
                hashMap.remove(pVar);
            } else {
                hashMap.put(pVar, obj);
                z10 = z10 && v.N(pVar);
            }
        }
        this.f57913e = Collections.unmodifiableMap(hashMap);
        this.f57920l = z10;
        this.f57922n = x();
        this.f57924p = c5709c.f57924p;
        this.f57912d = n(c5709c.f57912d);
        this.f57925q = w();
    }
}
