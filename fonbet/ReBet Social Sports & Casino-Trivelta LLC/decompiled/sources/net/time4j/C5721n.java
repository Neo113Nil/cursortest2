package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import li.AbstractC5469c;
import oi.AbstractC5905a;
import oi.AbstractC5906b;
import oi.InterfaceC5903D;
import oi.L;

/* renamed from: net.time4j.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5721n extends AbstractC5905a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final char f58286c;

    /* renamed from: d, reason: collision with root package name */
    public static final C5721n f58287d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f58288e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f58289f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f58290g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f58291h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f58292i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f58293j;

    /* renamed from: k, reason: collision with root package name */
    public static final Comparator f58294k;

    /* renamed from: l, reason: collision with root package name */
    public static InterfaceC5903D f58295l = null;

    /* renamed from: m, reason: collision with root package name */
    public static InterfaceC5903D f58296m = null;

    /* renamed from: n, reason: collision with root package name */
    public static InterfaceC5903D f58297n = null;

    /* renamed from: o, reason: collision with root package name */
    public static final oi.J f58298o;

    /* renamed from: p, reason: collision with root package name */
    public static final oi.J f58299p;

    /* renamed from: q, reason: collision with root package name */
    public static final oi.J f58300q;
    private static final long serialVersionUID = -6321211763598951499L;

    /* renamed from: a, reason: collision with root package name */
    public final transient List f58301a;

    /* renamed from: b, reason: collision with root package name */
    public final transient boolean f58302b;

    /* renamed from: net.time4j.n$a */
    public static final class a extends net.time4j.format.w {
        public a(Class cls, String str) {
            super(cls, str);
        }

        public static a k(Class cls, String str) {
            return new a(cls, str);
        }

        @Override // net.time4j.format.w
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public InterfaceC5729w f(char c10) {
            if (c10 == 'I') {
                return EnumC5706f.f57791a;
            }
            if (c10 == 'M') {
                return EnumC5706f.f57796f;
            }
            if (c10 == 'Q') {
                return EnumC5706f.f57795e;
            }
            if (c10 == 'W') {
                return EnumC5706f.f57797g;
            }
            if (c10 == 'Y') {
                return EnumC5706f.f57794d;
            }
            if (c10 == 'f') {
                return EnumC5714g.f58148f;
            }
            if (c10 == 'h') {
                return EnumC5714g.f58143a;
            }
            if (c10 == 'm') {
                return EnumC5714g.f58144b;
            }
            if (c10 == 's') {
                return EnumC5714g.f58145c;
            }
            switch (c10) {
                case 'C':
                    return EnumC5706f.f57792b;
                case 'D':
                    return EnumC5706f.f57798h;
                case 'E':
                    return EnumC5706f.f57793c;
                default:
                    throw new IllegalArgumentException("Unsupported pattern symbol: " + c10);
            }
        }
    }

    /* renamed from: net.time4j.n$b */
    public static class b extends AbstractC5906b {
        public /* synthetic */ b(InterfaceC5729w[] interfaceC5729wArr, AbstractC5720m abstractC5720m) {
            this(interfaceC5729wArr);
        }

        public b(InterfaceC5729w... interfaceC5729wArr) {
            super(interfaceC5729wArr.length > 1, interfaceC5729wArr);
        }
    }

    static {
        f58286c = Boolean.getBoolean("net.time4j.format.iso.decimal.dot") ? '.' : ',';
        f58287d = new C5721n();
        f58288e = e(true, false);
        f58289f = e(true, true);
        f58290g = e(false, false);
        f58291h = e(false, true);
        f58292i = f(true);
        f58293j = f(false);
        f58294k = O.b();
        f58295l = O.n();
        f58296m = O.h();
        f58297n = O.i();
        EnumC5706f enumC5706f = EnumC5706f.f57794d;
        EnumC5706f enumC5706f2 = EnumC5706f.f57796f;
        EnumC5706f enumC5706f3 = EnumC5706f.f57798h;
        f58298o = g(enumC5706f, enumC5706f2, enumC5706f3);
        f58299p = g(EnumC5714g.f58143a, EnumC5714g.f58144b, EnumC5714g.f58145c, EnumC5714g.f58148f);
        f58300q = g(EnumC5706f.d(), EnumC5706f.f57797g, enumC5706f3);
    }

    public C5721n(List list, boolean z10) {
        boolean isEmpty = list.isEmpty();
        if (isEmpty) {
            this.f58301a = Collections.EMPTY_LIST;
        } else {
            Collections.sort(list, f58294k);
            this.f58301a = Collections.unmodifiableList(list);
        }
        this.f58302b = !isEmpty && z10;
    }

    public static a e(boolean z10, boolean z11) {
        return a.k(EnumC5706f.class, z10 ? z11 ? "YYYY-DDD" : "YYYY-MM-DD" : z11 ? "YYYYDDD" : "YYYYMMDD");
    }

    public static a f(boolean z10) {
        return a.k(EnumC5714g.class, z10 ? "hh[:mm[:ss[,fffffffff]]]" : "hh[mm[ss[,fffffffff]]]");
    }

    public static oi.J g(InterfaceC5729w... interfaceC5729wArr) {
        return new b(interfaceC5729wArr, null);
    }

    public static C5721n j() {
        return f58287d;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 6);
    }

    @Override // oi.L
    public List a() {
        return this.f58301a;
    }

    public boolean c(InterfaceC5729w interfaceC5729w) {
        if (interfaceC5729w == null) {
            return false;
        }
        boolean h10 = h(interfaceC5729w);
        int size = this.f58301a.size();
        for (int i10 = 0; i10 < size; i10++) {
            L.a aVar = (L.a) this.f58301a.get(i10);
            InterfaceC5729w interfaceC5729w2 = (InterfaceC5729w) aVar.b();
            if (interfaceC5729w2.equals(interfaceC5729w) || (h10 && h(interfaceC5729w2))) {
                return aVar.a() > 0;
            }
        }
    }

    public final int d() {
        return a().size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5721n) {
            C5721n c5721n = (C5721n) C5721n.class.cast(obj);
            if (this.f58302b == c5721n.f58302b && a().equals(c5721n.a())) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(InterfaceC5729w interfaceC5729w) {
        char a10 = interfaceC5729w.a();
        return a10 >= '1' && a10 <= '9';
    }

    public int hashCode() {
        int hashCode = a().hashCode();
        if (this.f58302b) {
            return 0;
        }
        return hashCode;
    }

    public boolean i() {
        return this.f58302b;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String k(int i10) {
        boolean z10;
        if (i10 == 1 && i()) {
            throw new oi.r("Negative sign not allowed in ISO-8601.");
        }
        if (b()) {
            return "PT0S";
        }
        boolean z11 = i10 == 2;
        StringBuilder sb2 = new StringBuilder();
        if (i()) {
            sb2.append('-');
        }
        sb2.append('P');
        int d10 = d();
        long j10 = 0;
        int i11 = 0;
        long j11 = 0;
        boolean z12 = false;
        long j12 = 0;
        boolean z13 = false;
        while (i11 < d10) {
            L.a aVar = (L.a) a().get(i11);
            InterfaceC5729w interfaceC5729w = (InterfaceC5729w) aVar.b();
            if (!z12 && !interfaceC5729w.b()) {
                sb2.append('T');
                z12 = true;
            }
            boolean z14 = z11;
            long a10 = aVar.a();
            int i12 = i11;
            char a11 = interfaceC5729w.a();
            long j13 = j11;
            if (interfaceC5729w == X.f57677a) {
                z13 = true;
            }
            if (a11 <= '0' || a11 > '9') {
                if (a11 == 'S') {
                    j12 = a10;
                } else {
                    if (z14 || i10 == 1) {
                        if (a11 != 'H') {
                            if (a11 == 'I') {
                                sb2.append(AbstractC5469c.i(a10, 1000L));
                            } else if (a11 != 'M') {
                                if (a11 == 'Q') {
                                    sb2.append(AbstractC5469c.i(a10, 3L));
                                    a11 = 'M';
                                } else if (a11 == 'W') {
                                    if (d10 != 1) {
                                        j10 = AbstractC5469c.i(a10, 7L);
                                        if (!c(EnumC5706f.f57798h)) {
                                            sb2.append(j10);
                                            j10 = 0;
                                        }
                                    } else if (z14) {
                                        sb2.append(AbstractC5469c.i(a10, 7L));
                                    } else {
                                        sb2.append(a10);
                                    }
                                    a11 = 'D';
                                } else if (a11 != 'Y') {
                                    switch (a11) {
                                        case 'C':
                                            sb2.append(AbstractC5469c.i(a10, 100L));
                                            break;
                                        case 'D':
                                            if (j10 != 0) {
                                                a10 = AbstractC5469c.f(a10, j10);
                                                j10 = 0;
                                            }
                                            sb2.append(a10);
                                            break;
                                        case 'E':
                                            sb2.append(AbstractC5469c.i(a10, 10L));
                                            break;
                                        default:
                                            throw new oi.r("Special units cannot be output in " + (z14 ? "XML" : "ISO") + "-mode: " + k(0));
                                    }
                                }
                            }
                            a11 = 'Y';
                        }
                        sb2.append(a10);
                    } else {
                        sb2.append(a10);
                    }
                    if (a11 == 0) {
                        sb2.append('{');
                        sb2.append(interfaceC5729w);
                        sb2.append('}');
                    } else {
                        sb2.append(a11);
                    }
                }
                j11 = j13;
            } else {
                j11 = a10;
            }
            i11 = i12 + 1;
            z11 = z14;
        }
        boolean z15 = z11;
        long j14 = j11;
        if (j14 != 0) {
            sb2.append(AbstractC5469c.f(j12, j14 / 1000000000));
            sb2.append(z15 ? '.' : f58286c);
            String valueOf = String.valueOf(j14 % 1000000000);
            int length = 9 - valueOf.length();
            for (int i13 = 0; i13 < length; i13++) {
                sb2.append('0');
            }
            sb2.append(valueOf);
            sb2.append('S');
        } else if (j12 != 0) {
            sb2.append(j12);
            sb2.append('S');
        }
        if (z13) {
            boolean z16 = !z12;
            if (!z12) {
                int d11 = d();
                for (int i14 = 0; i14 < d11; i14++) {
                    Object b10 = ((L.a) a().get(i14)).b();
                    if (b10 != X.f57677a && b10 != EnumC5706f.f57797g && b10 != EnumC5706f.f57798h) {
                        z10 = false;
                        if (!z10) {
                            int indexOf = sb2.indexOf("Y");
                            sb2.replace(indexOf, indexOf + 1, "{WEEK_BASED_YEARS}");
                        }
                    }
                }
            }
            z10 = z16;
            if (!z10) {
            }
        }
        return sb2.toString();
    }

    public String toString() {
        return k(0);
    }

    public C5721n() {
        this.f58301a = Collections.EMPTY_LIST;
        this.f58302b = false;
    }
}
