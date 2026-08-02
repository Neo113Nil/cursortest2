package j3;

import com.google.common.collect.AbstractC5880y;
import com.google.common.collect.AbstractC5881z;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: j3.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7255K {

    /* renamed from: F, reason: collision with root package name */
    public static final C7255K f68969F = new C7255K(new b());

    /* renamed from: A, reason: collision with root package name */
    public final boolean f68970A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f68971B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f68972C;

    /* renamed from: D, reason: collision with root package name */
    public final AbstractC5881z<C7253I, C7254J> f68973D;

    /* renamed from: E, reason: collision with root package name */
    public final com.google.common.collect.A<Integer> f68974E;

    /* renamed from: a, reason: collision with root package name */
    public final int f68975a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68976b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68977c;

    /* renamed from: d, reason: collision with root package name */
    public final int f68978d;

    /* renamed from: e, reason: collision with root package name */
    public final int f68979e;

    /* renamed from: f, reason: collision with root package name */
    public final int f68980f;

    /* renamed from: g, reason: collision with root package name */
    public final int f68981g;

    /* renamed from: h, reason: collision with root package name */
    public final int f68982h;

    /* renamed from: i, reason: collision with root package name */
    public final int f68983i;

    /* renamed from: j, reason: collision with root package name */
    public final int f68984j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f68985k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f68986l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC5880y<String> f68987m;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC5880y<String> f68988n;

    /* renamed from: o, reason: collision with root package name */
    public final int f68989o;

    /* renamed from: p, reason: collision with root package name */
    public final AbstractC5880y<String> f68990p;

    /* renamed from: q, reason: collision with root package name */
    public final int f68991q;

    /* renamed from: r, reason: collision with root package name */
    public final int f68992r;

    /* renamed from: s, reason: collision with root package name */
    public final int f68993s;

    /* renamed from: t, reason: collision with root package name */
    public final AbstractC5880y<String> f68994t;

    /* renamed from: u, reason: collision with root package name */
    public final a f68995u;

    /* renamed from: v, reason: collision with root package name */
    public final AbstractC5880y<String> f68996v;

    /* renamed from: w, reason: collision with root package name */
    public final int f68997w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f68998x;

    /* renamed from: y, reason: collision with root package name */
    public final int f68999y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f69000z;

    /* renamed from: j3.K$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f69001a = new a();

        static {
            m3.N.L(1);
            m3.N.L(2);
            m3.N.L(3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return 29791;
        }
    }

    static {
        Pk0.h.f(1, 2, 3, 4, 5);
        Pk0.h.f(6, 7, 8, 9, 10);
        Pk0.h.f(11, 12, 13, 14, 15);
        Pk0.h.f(16, 17, 18, 19, 20);
        Pk0.h.f(21, 22, 23, 24, 25);
        Pk0.h.f(26, 27, 28, 29, 30);
        m3.N.L(31);
        m3.N.L(32);
        m3.N.L(33);
        m3.N.L(34);
    }

    protected C7255K(b bVar) {
        this.f68975a = bVar.f69007a;
        this.f68976b = bVar.f69008b;
        this.f68977c = bVar.f69009c;
        this.f68978d = bVar.f69010d;
        this.f68979e = bVar.f69011e;
        this.f68980f = bVar.f69012f;
        this.f68981g = bVar.f69013g;
        this.f68982h = bVar.f69014h;
        this.f68983i = bVar.f69015i;
        this.f68984j = bVar.f69016j;
        this.f68985k = bVar.f69017k;
        this.f68986l = bVar.f69018l;
        this.f68987m = bVar.f69019m;
        this.f68988n = bVar.f69020n;
        this.f68989o = bVar.f69021o;
        this.f68990p = bVar.f69022p;
        this.f68991q = bVar.f69023q;
        this.f68992r = bVar.f69024r;
        this.f68993s = bVar.f69025s;
        this.f68994t = bVar.f69026t;
        this.f68995u = bVar.f69027u;
        this.f68996v = bVar.f69028v;
        this.f68997w = bVar.f69029w;
        this.f68998x = bVar.f69030x;
        this.f68999y = bVar.f69031y;
        this.f69000z = bVar.f69032z;
        this.f68970A = bVar.f69002A;
        this.f68971B = bVar.f69003B;
        this.f68972C = bVar.f69004C;
        this.f68973D = AbstractC5881z.h(bVar.f69005D);
        this.f68974E = com.google.common.collect.A.u(bVar.f69006E);
    }

    public b a() {
        return new b(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7255K c7255k = (C7255K) obj;
            if (this.f68975a == c7255k.f68975a && this.f68976b == c7255k.f68976b && this.f68977c == c7255k.f68977c && this.f68978d == c7255k.f68978d && this.f68979e == c7255k.f68979e && this.f68980f == c7255k.f68980f && this.f68981g == c7255k.f68981g && this.f68982h == c7255k.f68982h && this.f68986l == c7255k.f68986l && this.f68983i == c7255k.f68983i && this.f68984j == c7255k.f68984j && this.f68985k == c7255k.f68985k && this.f68987m.equals(c7255k.f68987m) && this.f68988n.equals(c7255k.f68988n) && this.f68989o == c7255k.f68989o && this.f68990p.equals(c7255k.f68990p) && this.f68991q == c7255k.f68991q && this.f68992r == c7255k.f68992r && this.f68993s == c7255k.f68993s && this.f68994t.equals(c7255k.f68994t) && this.f68995u.equals(c7255k.f68995u) && this.f68996v.equals(c7255k.f68996v) && this.f68997w == c7255k.f68997w && this.f68998x == c7255k.f68998x && this.f68999y == c7255k.f68999y && this.f69000z == c7255k.f69000z && this.f68970A == c7255k.f68970A && this.f68971B == c7255k.f68971B && this.f68972C == c7255k.f68972C && this.f68973D.equals(c7255k.f68973D) && this.f68974E.equals(c7255k.f68974E)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f68994t.hashCode() + ((((((((this.f68990p.hashCode() + ((((this.f68988n.hashCode() + ((this.f68987m.hashCode() + ((((((((((((((((((((((((this.f68975a + 31) * 31) + this.f68976b) * 31) + this.f68977c) * 31) + this.f68978d) * 31) + this.f68979e) * 31) + this.f68980f) * 31) + this.f68981g) * 31) + this.f68982h) * 31) + (this.f68986l ? 1 : 0)) * 31) + this.f68983i) * 31) + this.f68984j) * 31) + (this.f68985k ? 1 : 0)) * 31)) * 31)) * 31) + this.f68989o) * 31)) * 31) + this.f68991q) * 31) + this.f68992r) * 31) + this.f68993s) * 31)) * 31;
        this.f68995u.getClass();
        return this.f68974E.hashCode() + ((this.f68973D.hashCode() + ((((((((((((((((this.f68996v.hashCode() + ((hashCode + 29791) * 31)) * 31) + this.f68997w) * 31) + (this.f68998x ? 1 : 0)) * 31) + this.f68999y) * 31) + (this.f69000z ? 1 : 0)) * 31) + (this.f68970A ? 1 : 0)) * 31) + (this.f68971B ? 1 : 0)) * 31) + (this.f68972C ? 1 : 0)) * 31)) * 31);
    }

    /* renamed from: j3.K$b */
    public static class b {

        /* renamed from: A, reason: collision with root package name */
        private boolean f69002A;

        /* renamed from: B, reason: collision with root package name */
        private boolean f69003B;

        /* renamed from: C, reason: collision with root package name */
        private boolean f69004C;

        /* renamed from: D, reason: collision with root package name */
        private HashMap<C7253I, C7254J> f69005D;

        /* renamed from: E, reason: collision with root package name */
        private HashSet<Integer> f69006E;

        /* renamed from: a, reason: collision with root package name */
        private int f69007a;

        /* renamed from: b, reason: collision with root package name */
        private int f69008b;

        /* renamed from: c, reason: collision with root package name */
        private int f69009c;

        /* renamed from: d, reason: collision with root package name */
        private int f69010d;

        /* renamed from: e, reason: collision with root package name */
        private int f69011e;

        /* renamed from: f, reason: collision with root package name */
        private int f69012f;

        /* renamed from: g, reason: collision with root package name */
        private int f69013g;

        /* renamed from: h, reason: collision with root package name */
        private int f69014h;

        /* renamed from: i, reason: collision with root package name */
        private int f69015i;

        /* renamed from: j, reason: collision with root package name */
        private int f69016j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f69017k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f69018l;

        /* renamed from: m, reason: collision with root package name */
        private AbstractC5880y<String> f69019m;

        /* renamed from: n, reason: collision with root package name */
        private AbstractC5880y<String> f69020n;

        /* renamed from: o, reason: collision with root package name */
        private int f69021o;

        /* renamed from: p, reason: collision with root package name */
        private AbstractC5880y<String> f69022p;

        /* renamed from: q, reason: collision with root package name */
        private int f69023q;

        /* renamed from: r, reason: collision with root package name */
        private int f69024r;

        /* renamed from: s, reason: collision with root package name */
        private int f69025s;

        /* renamed from: t, reason: collision with root package name */
        private AbstractC5880y<String> f69026t;

        /* renamed from: u, reason: collision with root package name */
        private a f69027u;

        /* renamed from: v, reason: collision with root package name */
        private AbstractC5880y<String> f69028v;

        /* renamed from: w, reason: collision with root package name */
        private int f69029w;

        /* renamed from: x, reason: collision with root package name */
        private boolean f69030x;

        /* renamed from: y, reason: collision with root package name */
        private int f69031y;

        /* renamed from: z, reason: collision with root package name */
        private boolean f69032z;

        public b() {
            this.f69007a = Integer.MAX_VALUE;
            this.f69008b = Integer.MAX_VALUE;
            this.f69009c = Integer.MAX_VALUE;
            this.f69010d = Integer.MAX_VALUE;
            this.f69015i = Integer.MAX_VALUE;
            this.f69016j = Integer.MAX_VALUE;
            this.f69017k = true;
            this.f69018l = true;
            this.f69019m = AbstractC5880y.v();
            this.f69020n = AbstractC5880y.v();
            this.f69021o = 0;
            this.f69022p = AbstractC5880y.v();
            this.f69023q = 0;
            this.f69024r = Integer.MAX_VALUE;
            this.f69025s = Integer.MAX_VALUE;
            this.f69026t = AbstractC5880y.v();
            this.f69027u = a.f69001a;
            this.f69028v = AbstractC5880y.v();
            this.f69029w = 0;
            this.f69030x = true;
            this.f69031y = 0;
            this.f69032z = false;
            this.f69002A = false;
            this.f69003B = false;
            this.f69004C = false;
            this.f69005D = new HashMap<>();
            this.f69006E = new HashSet<>();
        }

        private void H(C7255K c7255k) {
            this.f69007a = c7255k.f68975a;
            this.f69008b = c7255k.f68976b;
            this.f69009c = c7255k.f68977c;
            this.f69010d = c7255k.f68978d;
            this.f69011e = c7255k.f68979e;
            this.f69012f = c7255k.f68980f;
            this.f69013g = c7255k.f68981g;
            this.f69014h = c7255k.f68982h;
            this.f69015i = c7255k.f68983i;
            this.f69016j = c7255k.f68984j;
            this.f69017k = c7255k.f68985k;
            this.f69018l = c7255k.f68986l;
            this.f69019m = c7255k.f68987m;
            this.f69020n = c7255k.f68988n;
            this.f69021o = c7255k.f68989o;
            this.f69022p = c7255k.f68990p;
            this.f69023q = c7255k.f68991q;
            this.f69024r = c7255k.f68992r;
            this.f69025s = c7255k.f68993s;
            this.f69026t = c7255k.f68994t;
            this.f69027u = c7255k.f68995u;
            this.f69028v = c7255k.f68996v;
            this.f69029w = c7255k.f68997w;
            this.f69030x = c7255k.f68998x;
            this.f69031y = c7255k.f68999y;
            this.f69032z = c7255k.f69000z;
            this.f69002A = c7255k.f68970A;
            this.f69003B = c7255k.f68971B;
            this.f69004C = c7255k.f68972C;
            this.f69006E = new HashSet<>(c7255k.f68974E);
            this.f69005D = new HashMap<>(c7255k.f68973D);
        }

        public C7255K F() {
            return new C7255K(this);
        }

        public b G(int i11) {
            Iterator<C7254J> it = this.f69005D.values().iterator();
            while (it.hasNext()) {
                if (it.next().f68967a.f68964c == i11) {
                    it.remove();
                }
            }
            return this;
        }

        protected final void I(C7255K c7255k) {
            H(c7255k);
        }

        public b J(Set<Integer> set) {
            this.f69006E.clear();
            this.f69006E.addAll(set);
            return this;
        }

        public final void K() {
            this.f69004C = true;
        }

        public b L() {
            this.f69031y = -3;
            return this;
        }

        public b M(C7254J c7254j) {
            C7253I c7253i = c7254j.f68967a;
            G(c7253i.f68964c);
            this.f69005D.put(c7253i, c7254j);
            return this;
        }

        public b N() {
            return O(new String[0]);
        }

        public b O(String... strArr) {
            int i11 = AbstractC5880y.f59142c;
            AbstractC5880y.a aVar = new AbstractC5880y.a();
            for (String str : strArr) {
                str.getClass();
                aVar.e(m3.N.R(str));
            }
            this.f69028v = aVar.j();
            this.f69030x = false;
            return this;
        }

        public b P() {
            this.f69029w = 0;
            this.f69030x = false;
            return this;
        }

        public b Q(int i11, boolean z11) {
            if (z11) {
                this.f69006E.add(Integer.valueOf(i11));
                return this;
            }
            this.f69006E.remove(Integer.valueOf(i11));
            return this;
        }

        protected b(C7255K c7255k) {
            H(c7255k);
        }
    }
}
