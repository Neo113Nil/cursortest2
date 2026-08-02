package qi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import li.AbstractC5468b;
import li.AbstractC5469c;
import li.AbstractC5470d;
import li.InterfaceC5467a;

/* renamed from: qi.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6183d implements Iterable, Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6182c f63665a;

    /* renamed from: b, reason: collision with root package name */
    public final List f63666b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f63667c;
    private final InterfaceC6180a[] reverseFinal;
    private volatile InterfaceC6180a[] reverseVolatile;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f63661d = Boolean.getBoolean("net.time4j.scale.leapseconds.suppressed");

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f63662e = Boolean.getBoolean("net.time4j.scale.leapseconds.final");

    /* renamed from: f, reason: collision with root package name */
    public static final String f63663f = System.getProperty("net.time4j.scale.leapseconds.path", "data/leapseconds.data");
    private static final InterfaceC6180a[] EMPTY_ARRAY = new InterfaceC6180a[0];

    /* renamed from: g, reason: collision with root package name */
    public static final C6183d f63664g = new C6183d();

    public C6183d() {
        InterfaceC6182c interfaceC6182c;
        int i10;
        boolean z10 = false;
        if (f63661d) {
            interfaceC6182c = null;
            i10 = 0;
        } else {
            interfaceC6182c = null;
            i10 = 0;
            for (InterfaceC6182c interfaceC6182c2 : AbstractC5470d.c().g(InterfaceC6182c.class)) {
                int size = interfaceC6182c2.f().size();
                if (size > i10) {
                    interfaceC6182c = interfaceC6182c2;
                    i10 = size;
                }
            }
        }
        if (interfaceC6182c == null || i10 == 0) {
            this.f63665a = null;
            this.f63666b = Collections.EMPTY_LIST;
            InterfaceC6180a[] interfaceC6180aArr = EMPTY_ARRAY;
            this.reverseFinal = interfaceC6180aArr;
            this.reverseVolatile = interfaceC6180aArr;
            this.f63667c = false;
            return;
        }
        TreeSet treeSet = new TreeSet(this);
        for (Map.Entry entry : interfaceC6182c.f().entrySet()) {
            InterfaceC5467a interfaceC5467a = (InterfaceC5467a) entry.getKey();
            treeSet.add(new a(interfaceC5467a, Long.MIN_VALUE, (-62985601) + y(interfaceC5467a), ((Integer) entry.getValue()).intValue()));
        }
        i(treeSet);
        boolean z11 = f63662e;
        if (z11) {
            this.f63666b = Collections.unmodifiableList(new ArrayList(treeSet));
        } else {
            this.f63666b = new CopyOnWriteArrayList(treeSet);
        }
        InterfaceC6180a[] t10 = t();
        this.reverseFinal = t10;
        this.reverseVolatile = t10;
        this.f63665a = interfaceC6182c;
        if (!z11) {
            this.f63667c = true;
            return;
        }
        boolean b10 = interfaceC6182c.b();
        if (b10) {
            Iterator it = this.f63666b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((InterfaceC6180a) it.next()).a() < 0) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            b10 = z10;
        }
        this.f63667c = b10;
    }

    public static void i(SortedSet sortedSet) {
        ArrayList arrayList = new ArrayList(sortedSet.size());
        Iterator it = sortedSet.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            InterfaceC6180a interfaceC6180a = (InterfaceC6180a) it.next();
            if (interfaceC6180a.b() == Long.MIN_VALUE) {
                i10 += interfaceC6180a.a();
                arrayList.add(new a(interfaceC6180a, i10));
            } else {
                arrayList.add(interfaceC6180a);
            }
        }
        sortedSet.clear();
        sortedSet.addAll(arrayList);
    }

    public static String n(InterfaceC5467a interfaceC5467a) {
        return String.format("%1$04d-%2$02d-%3$02d", Integer.valueOf(interfaceC5467a.n()), Integer.valueOf(interfaceC5467a.o()), Integer.valueOf(interfaceC5467a.p()));
    }

    public static C6183d q() {
        return f63664g;
    }

    public static long y(InterfaceC5467a interfaceC5467a) {
        return AbstractC5469c.i(AbstractC5469c.m(AbstractC5468b.j(interfaceC5467a), 40587L), 86400L);
    }

    @Override // java.util.Comparator
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compare(InterfaceC6181b interfaceC6181b, InterfaceC6181b interfaceC6181b2) {
        InterfaceC5467a c10 = interfaceC6181b.c();
        InterfaceC5467a c11 = interfaceC6181b2.c();
        int n10 = c10.n();
        int n11 = c11.n();
        if (n10 < n11) {
            return -1;
        }
        if (n10 > n11) {
            return 1;
        }
        int o10 = c10.o();
        int o11 = c11.o();
        if (o10 < o11) {
            return -1;
        }
        if (o10 > o11) {
            return 1;
        }
        int p10 = c10.p();
        int p11 = c11.p();
        if (p10 < p11) {
            return -1;
        }
        return p10 == p11 ? 0 : 1;
    }

    public long h(long j10) {
        long j11 = j10 - 63072000;
        if (j10 > 0) {
            for (InterfaceC6180a interfaceC6180a : p()) {
                if (interfaceC6180a.d() < j11) {
                    return AbstractC5469c.f(j11, interfaceC6180a.b() - interfaceC6180a.d());
                }
            }
        }
        return j11;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return Collections.unmodifiableList(Arrays.asList(p())).iterator();
    }

    public InterfaceC5467a o() {
        if (u()) {
            return this.f63665a.d();
        }
        throw new IllegalStateException("Leap seconds not activated.");
    }

    public final InterfaceC6180a[] p() {
        return (f63661d || f63662e) ? this.reverseFinal : this.reverseVolatile;
    }

    public InterfaceC6181b r(long j10) {
        InterfaceC6180a[] p10 = p();
        InterfaceC6180a interfaceC6180a = null;
        int i10 = 0;
        while (i10 < p10.length) {
            InterfaceC6180a interfaceC6180a2 = p10[i10];
            if (j10 >= interfaceC6180a2.b()) {
                break;
            }
            i10++;
            interfaceC6180a = interfaceC6180a2;
        }
        return interfaceC6180a;
    }

    public int s(long j10) {
        if (j10 <= 0) {
            return 0;
        }
        for (InterfaceC6180a interfaceC6180a : p()) {
            if (j10 > interfaceC6180a.b()) {
                return 0;
            }
            long b10 = interfaceC6180a.b() - interfaceC6180a.a();
            if (j10 > b10) {
                return (int) (j10 - b10);
            }
        }
        return 0;
    }

    public final InterfaceC6180a[] t() {
        ArrayList arrayList = new ArrayList(this.f63666b.size());
        arrayList.addAll(this.f63666b);
        Collections.reverse(arrayList);
        return (InterfaceC6180a[]) arrayList.toArray(new InterfaceC6180a[arrayList.size()]);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(2048);
        sb2.append("[PROVIDER=");
        sb2.append(this.f63665a);
        if (this.f63665a != null) {
            sb2.append(",EXPIRES=");
            sb2.append(n(o()));
        }
        sb2.append(",EVENTS=[");
        if (u()) {
            boolean z10 = true;
            for (Object obj : this.f63666b) {
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append('|');
                }
                sb2.append(obj);
            }
        } else {
            sb2.append("NOT SUPPORTED");
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public boolean u() {
        return !this.f63666b.isEmpty();
    }

    public boolean v(long j10) {
        if (j10 <= 0) {
            return false;
        }
        InterfaceC6180a[] p10 = p();
        for (int i10 = 0; i10 < p10.length; i10++) {
            long b10 = p10[i10].b();
            if (b10 == j10) {
                return p10[i10].a() == 1;
            }
            if (b10 < j10) {
                break;
            }
        }
        return false;
    }

    public long w(long j10) {
        if (j10 <= 0) {
            return j10 + 63072000;
        }
        InterfaceC6180a[] p10 = p();
        boolean z10 = this.f63667c;
        for (InterfaceC6180a interfaceC6180a : p10) {
            if (interfaceC6180a.b() - interfaceC6180a.a() < j10 || (z10 && interfaceC6180a.a() < 0 && interfaceC6180a.b() < j10)) {
                j10 = AbstractC5469c.f(j10, interfaceC6180a.d() - interfaceC6180a.b());
                break;
            }
        }
        return j10 + 63072000;
    }

    public boolean x() {
        return this.f63667c;
    }

    /* renamed from: qi.d$a */
    public static class a implements InterfaceC6180a, Serializable {
        private static final long serialVersionUID = 5986185471610524587L;
        private final long _raw;
        private final long _utc;
        private final InterfaceC5467a date;
        private final int shift;

        public a(InterfaceC5467a interfaceC5467a, long j10, long j11, int i10) {
            this.date = interfaceC5467a;
            this.shift = i10;
            this._utc = j10;
            this._raw = j11;
        }

        @Override // qi.InterfaceC6181b
        public int a() {
            return this.shift;
        }

        @Override // qi.InterfaceC6180a
        public long b() {
            return this._utc;
        }

        @Override // qi.InterfaceC6181b
        public InterfaceC5467a c() {
            return this.date;
        }

        @Override // qi.InterfaceC6180a
        public long d() {
            return this._raw;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append(InterfaceC6181b.class.getName());
            sb2.append('[');
            sb2.append(C6183d.n(this.date));
            sb2.append(": utc=");
            sb2.append(this._utc);
            sb2.append(", raw=");
            sb2.append(this._raw);
            sb2.append(" (shift=");
            sb2.append(this.shift);
            sb2.append(")]");
            return sb2.toString();
        }

        public a(InterfaceC6180a interfaceC6180a, int i10) {
            this.date = interfaceC6180a.c();
            this.shift = interfaceC6180a.a();
            this._utc = interfaceC6180a.d() + i10;
            this._raw = interfaceC6180a.d();
        }
    }
}
