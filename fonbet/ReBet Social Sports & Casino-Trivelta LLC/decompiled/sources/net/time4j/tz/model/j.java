package net.time4j.tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import li.AbstractC5468b;
import li.AbstractC5469c;
import li.InterfaceC5467a;
import li.InterfaceC5472f;
import li.InterfaceC5473g;
import net.time4j.A;
import net.time4j.tz.p;
import net.time4j.tz.q;
import oi.EnumC5900A;

/* loaded from: classes5.dex */
public final class j extends l {

    /* renamed from: g, reason: collision with root package name */
    public static final int f58392g = AbstractC5468b.h(AbstractC5468b.k(EnumC5900A.MODIFIED_JULIAN_DATE.i(l.f(100), EnumC5900A.UNIX)));
    private static final long serialVersionUID = 2456700806862862287L;

    /* renamed from: b, reason: collision with root package name */
    public final transient q f58393b;

    /* renamed from: c, reason: collision with root package name */
    public final transient List f58394c;

    /* renamed from: d, reason: collision with root package name */
    public final transient ConcurrentMap f58395d;

    /* renamed from: e, reason: collision with root package name */
    public final transient List f58396e;

    /* renamed from: f, reason: collision with root package name */
    public final transient boolean f58397f;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$net$time4j$tz$model$OffsetIndicator;

        static {
            int[] iArr = new int[i.values().length];
            $SwitchMap$net$time4j$tz$model$OffsetIndicator = iArr;
            try {
                iArr[i.f58389a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$time4j$tz$model$OffsetIndicator[i.f58390b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$time4j$tz$model$OffsetIndicator[i.f58391c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(p pVar, List list, boolean z10) {
        this(new q(Long.MIN_VALUE, pVar.j(), pVar.j(), 0), list, z10);
    }

    public static q m(long j10, q qVar, List list) {
        long max = Math.max(j10, qVar.e());
        int h10 = qVar.h();
        int size = list.size();
        int i10 = Integer.MIN_VALUE;
        q qVar2 = null;
        int i11 = 0;
        while (qVar2 == null) {
            int i12 = i11 % size;
            d dVar = (d) list.get(i12);
            d dVar2 = (d) list.get(((i11 - 1) + size) % size);
            int o10 = o(dVar, h10, dVar2.e());
            if (i11 == 0) {
                i10 = u(dVar, o10 + max);
            } else if (i12 == 0) {
                i10++;
            }
            long p10 = p(dVar, i10, o10);
            if (p10 > max) {
                qVar2 = new q(p10, h10 + dVar2.e(), h10 + dVar.e(), dVar.e());
            }
            i11++;
        }
        return qVar2;
    }

    public static int o(d dVar, int i10, int i11) {
        i d10 = dVar.d();
        int i12 = a.$SwitchMap$net$time4j$tz$model$OffsetIndicator[d10.ordinal()];
        if (i12 == 1) {
            return 0;
        }
        if (i12 == 2) {
            return i10;
        }
        if (i12 == 3) {
            return i10 + i11;
        }
        throw new UnsupportedOperationException(d10.name());
    }

    public static long p(d dVar, int i10, int i11) {
        return dVar.b(i10).i0(dVar.f()).K(p.p(i11)).k();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    public static List s(q qVar, List list, long j10, long j11) {
        List list2 = list;
        long j12 = j10;
        long e10 = qVar.e();
        if (j12 > j11) {
            throw new IllegalArgumentException("Start after end.");
        }
        if (j11 <= e10 || j12 == j11) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        int h10 = qVar.h();
        int i10 = Integer.MIN_VALUE;
        int i11 = 0;
        while (true) {
            int i12 = i11 % size;
            d dVar = (d) list2.get(i12);
            d dVar2 = (d) list2.get(((i11 - 1) + size) % size);
            int o10 = o(dVar, h10, dVar2.e());
            if (i11 == 0) {
                i10 = u(dVar, Math.max(j12, e10) + o10);
            } else if (i12 == 0) {
                i10++;
            }
            long p10 = p(dVar, i10, o10);
            i11++;
            if (p10 >= j11) {
                return Collections.unmodifiableList(arrayList);
            }
            if (p10 >= j10 && p10 > e10) {
                arrayList.add(new q(p10, h10 + dVar2.e(), h10 + dVar.e(), dVar.e()));
            }
            list2 = list;
            j12 = j10;
        }
    }

    public static int u(d dVar, long j10) {
        return dVar.h(EnumC5900A.MODIFIED_JULIAN_DATE.i(AbstractC5469c.b(j10, 86400), EnumC5900A.UNIX));
    }

    private Object writeReplace() {
        return new SPX(this, 125);
    }

    @Override // net.time4j.tz.m
    public q a(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g) {
        return k(interfaceC5467a, l.j(interfaceC5467a, interfaceC5473g));
    }

    @Override // net.time4j.tz.m
    public boolean b() {
        Iterator it = this.f58394c.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).e() < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.tz.m
    public List c(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g) {
        return t(interfaceC5467a, l.j(interfaceC5467a, interfaceC5473g));
    }

    @Override // net.time4j.tz.m
    public p d() {
        return p.p(this.f58393b.i());
    }

    @Override // net.time4j.tz.m
    public q e(InterfaceC5472f interfaceC5472f) {
        long e10 = this.f58393b.e();
        q qVar = null;
        if (interfaceC5472f.k() <= e10) {
            return null;
        }
        int h10 = this.f58393b.h();
        int size = this.f58394c.size();
        int i10 = 0;
        int i11 = size - 1;
        int u10 = u((d) this.f58394c.get(0), interfaceC5472f.k() + o(r5, h10, ((d) this.f58394c.get(i11)).e()));
        List q10 = q(u10);
        while (true) {
            if (i10 >= size) {
                break;
            }
            q qVar2 = (q) q10.get(i10);
            long e11 = qVar2.e();
            if (interfaceC5472f.k() >= e11) {
                if (e11 > e10) {
                    qVar = qVar2;
                }
                i10++;
            } else if (qVar == null) {
                q qVar3 = i10 == 0 ? (q) q(u10 - 1).get(i11) : (q) q10.get(i10 - 1);
                if (qVar3.e() > e10) {
                    return qVar3;
                }
            }
        }
        return qVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f58393b.equals(jVar.f58393b) && this.f58394c.equals(jVar.f58394c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f58393b.hashCode() * 17) + (this.f58394c.hashCode() * 37);
    }

    public q k(InterfaceC5467a interfaceC5467a, long j10) {
        if (j10 <= this.f58393b.e() + Math.max(this.f58393b.f(), this.f58393b.i())) {
            return null;
        }
        for (q qVar : r(interfaceC5467a)) {
            long e10 = qVar.e();
            if (qVar.j()) {
                if (j10 < qVar.f() + e10) {
                    return null;
                }
                if (j10 < e10 + qVar.i()) {
                    return qVar;
                }
            } else if (!qVar.k()) {
                continue;
            } else {
                if (j10 < qVar.i() + e10) {
                    return null;
                }
                if (j10 < e10 + qVar.f()) {
                    return qVar;
                }
            }
        }
        return null;
    }

    public q l() {
        return this.f58393b;
    }

    public List n() {
        return this.f58394c;
    }

    public final List q(int i10) {
        List list;
        Integer valueOf = Integer.valueOf(i10);
        List list2 = (List) this.f58395d.get(valueOf);
        if (list2 == null) {
            ArrayList arrayList = new ArrayList();
            int h10 = this.f58393b.h();
            int size = this.f58394c.size();
            for (int i11 = 0; i11 < size; i11++) {
                d dVar = (d) this.f58394c.get(i11);
                d dVar2 = (d) this.f58394c.get(((i11 - 1) + size) % size);
                arrayList.add(new q(p(dVar, i10, o(dVar, h10, dVar2.e())), h10 + dVar2.e(), h10 + dVar.e(), dVar.e()));
            }
            list2 = Collections.unmodifiableList(arrayList);
            if (i10 <= f58392g && this.f58397f && (list = (List) this.f58395d.putIfAbsent(valueOf, list2)) != null) {
                return list;
            }
        }
        return list2;
    }

    public final List r(InterfaceC5467a interfaceC5467a) {
        return q(((d) this.f58394c.get(0)).i(interfaceC5467a));
    }

    public List t(InterfaceC5467a interfaceC5467a, long j10) {
        long e10 = this.f58393b.e();
        int i10 = this.f58393b.i();
        if (j10 <= e10 + Math.max(this.f58393b.f(), i10)) {
            return l.h(i10);
        }
        for (q qVar : r(interfaceC5467a)) {
            long e11 = qVar.e();
            int i11 = qVar.i();
            if (qVar.j()) {
                if (j10 < qVar.f() + e11) {
                    return l.h(qVar.f());
                }
                if (j10 < e11 + i11) {
                    return Collections.EMPTY_LIST;
                }
            } else if (!qVar.k()) {
                continue;
            } else {
                if (j10 < i11 + e11) {
                    return l.h(qVar.f());
                }
                if (j10 < e11 + qVar.f()) {
                    return l.i(i11, qVar.f());
                }
            }
            i10 = i11;
        }
        return l.h(i10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append(j.class.getName());
        sb2.append("[initial=");
        sb2.append(this.f58393b);
        sb2.append(",rules=");
        sb2.append(this.f58394c);
        sb2.append(']');
        return sb2.toString();
    }

    public j(q qVar, List list, boolean z10) {
        q qVar2;
        this.f58395d = new ConcurrentHashMap();
        if (!list.isEmpty()) {
            if (list.size() < 128) {
                list = z10 ? new ArrayList(list) : list;
                Collections.sort(list, k.INSTANCE);
                String str = null;
                if (list.size() > 1) {
                    for (d dVar : list) {
                        if (str == null) {
                            str = dVar.a();
                        } else if (!str.equals(dVar.a())) {
                            throw new IllegalArgumentException("Rules with different calendar systems not permitted.");
                        }
                    }
                }
                this.f58397f = "iso8601".equals(str);
                if (qVar.e() == Long.MIN_VALUE) {
                    if (qVar.d() == 0) {
                        qVar2 = new q(((A) A.N().J()).k(), qVar.h(), qVar.h(), 0);
                    } else {
                        throw new IllegalArgumentException("Initial transition must not have any dst-offset: " + qVar);
                    }
                } else {
                    if (qVar.i() != m(qVar.e(), qVar, list).f()) {
                        throw new IllegalArgumentException("Inconsistent model: " + qVar + " / " + list);
                    }
                    qVar2 = qVar;
                }
                this.f58393b = qVar2;
                List unmodifiableList = Collections.unmodifiableList(list);
                this.f58394c = unmodifiableList;
                this.f58396e = s(qVar2, unmodifiableList, 0L, l.f(1));
                return;
            }
            throw new IllegalArgumentException("Too many daylight saving rules: " + list);
        }
        throw new IllegalArgumentException("Missing daylight saving rules.");
    }
}
