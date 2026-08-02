package net.time4j.tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import li.InterfaceC5467a;
import li.InterfaceC5472f;
import li.InterfaceC5473g;
import net.time4j.A;
import net.time4j.tz.p;
import net.time4j.tz.q;
import qi.EnumC6185f;

/* loaded from: classes5.dex */
public final class a extends l {
    private static final long serialVersionUID = -5264909488983076587L;

    /* renamed from: b, reason: collision with root package name */
    public final transient boolean f58371b;

    /* renamed from: c, reason: collision with root package name */
    public final transient List f58372c;

    /* renamed from: d, reason: collision with root package name */
    public transient int f58373d = 0;
    private final transient q[] transitions;

    public a(List list, boolean z10, boolean z11) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Missing timezone transitions.");
        }
        q[] qVarArr = (q[]) list.toArray(new q[list.size()]);
        boolean z12 = false;
        for (q qVar : qVarArr) {
            z12 = z12 || qVar.d() < 0;
        }
        this.f58371b = z12;
        if (z10) {
            Arrays.sort(qVarArr);
        }
        if (z11) {
            k(qVarArr, list);
        }
        this.transitions = qVarArr;
        this.f58372c = o(qVarArr, 0L, l.f(1));
    }

    public static void k(q[] qVarArr, List list) {
        int i10 = qVarArr[0].i();
        for (int i11 = 1; i11 < qVarArr.length; i11++) {
            if (i10 != qVarArr[i11].f()) {
                throw new IllegalArgumentException("Model inconsistency detected at: " + A.g0(qVarArr[i11].e(), EnumC6185f.POSIX) + " (" + qVarArr[i11].e() + ")  in transitions: " + list);
            }
            i10 = qVarArr[i11].i();
        }
    }

    public static List o(q[] qVarArr, long j10, long j11) {
        if (j10 > j11) {
            throw new IllegalArgumentException("Start after end.");
        }
        int r10 = r(j10, qVarArr);
        int r11 = r(j11, qVarArr);
        if (r11 == 0) {
            return Collections.EMPTY_LIST;
        }
        if (r10 > 0 && qVarArr[r10 - 1].e() == j10) {
            r10--;
        }
        int i10 = r11 - 1;
        if (qVarArr[i10].e() == j11) {
            i10 = r11 - 2;
        }
        if (r10 > i10) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList((i10 - r10) + 1);
        while (r10 <= i10) {
            arrayList.add(qVarArr[r10]);
            r10++;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static int r(long j10, q[] qVarArr) {
        int length = qVarArr.length - 1;
        int i10 = 0;
        while (i10 <= length) {
            int i11 = (i10 + length) / 2;
            if (qVarArr[i11].e() <= j10) {
                i10 = i11 + 1;
            } else {
                length = i11 - 1;
            }
        }
        return i10;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    public static int s(long j10, q[] qVarArr) {
        int length = qVarArr.length - 1;
        int i10 = 0;
        while (i10 <= length) {
            int i11 = (i10 + length) / 2;
            if (qVarArr[i11].e() + Math.max(r3.i(), r3.f()) <= j10) {
                i10 = i11 + 1;
            } else {
                length = i11 - 1;
            }
        }
        return i10;
    }

    private Object writeReplace() {
        return new SPX(this, 126);
    }

    @Override // net.time4j.tz.m
    public q a(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g) {
        return m(interfaceC5467a, interfaceC5473g, null);
    }

    @Override // net.time4j.tz.m
    public boolean b() {
        return this.f58371b;
    }

    @Override // net.time4j.tz.m
    public List c(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g) {
        return p(interfaceC5467a, interfaceC5473g, null);
    }

    @Override // net.time4j.tz.m
    public p d() {
        return p.p(this.transitions[0].f());
    }

    @Override // net.time4j.tz.m
    public q e(InterfaceC5472f interfaceC5472f) {
        int r10 = r(interfaceC5472f.k(), this.transitions);
        if (r10 == 0) {
            return null;
        }
        return this.transitions[r10 - 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return Arrays.equals(this.transitions, ((a) obj).transitions);
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f58373d;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = Arrays.hashCode(this.transitions);
        this.f58373d = hashCode;
        return hashCode;
    }

    public boolean l(a aVar, int i10, int i11) {
        int min = Math.min(i10, this.transitions.length);
        if (min != Math.min(i11, aVar.transitions.length)) {
            return false;
        }
        for (int i12 = 0; i12 < min; i12++) {
            if (!this.transitions[i12].equals(aVar.transitions[i12])) {
                return false;
            }
        }
        return true;
    }

    public q m(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g, j jVar) {
        long j10 = l.j(interfaceC5467a, interfaceC5473g);
        int s10 = s(j10, this.transitions);
        q[] qVarArr = this.transitions;
        if (s10 == qVarArr.length) {
            if (jVar == null) {
                return null;
            }
            return jVar.k(interfaceC5467a, j10);
        }
        q qVar = qVarArr[s10];
        if (!qVar.j() ? !(!qVar.k() || qVar.e() + qVar.i() > j10) : qVar.e() + qVar.f() <= j10) {
            return null;
        }
        return qVar;
    }

    public q n() {
        return this.transitions[r0.length - 1];
    }

    public List p(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g, j jVar) {
        long j10 = l.j(interfaceC5467a, interfaceC5473g);
        int s10 = s(j10, this.transitions);
        q[] qVarArr = this.transitions;
        if (s10 == qVarArr.length) {
            return jVar == null ? l.h(qVarArr[qVarArr.length - 1].i()) : jVar.t(interfaceC5467a, j10);
        }
        q qVar = qVarArr[s10];
        if (qVar.j()) {
            if (qVar.e() + qVar.f() <= j10) {
                return Collections.EMPTY_LIST;
            }
        } else if (qVar.k() && qVar.e() + qVar.i() <= j10) {
            return l.i(qVar.i(), qVar.f());
        }
        return l.h(qVar.f());
    }

    public int q(int i10) {
        int min = Math.min(i10, this.transitions.length);
        q[] qVarArr = new q[min];
        System.arraycopy(this.transitions, 0, qVarArr, 0, min);
        return Arrays.hashCode(qVarArr);
    }

    public void t(int i10, ObjectOutput objectOutput) {
        SPX.z(this.transitions, i10, objectOutput);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(a.class.getName());
        sb2.append("[transition-count=");
        sb2.append(this.transitions.length);
        sb2.append(",hash=");
        sb2.append(hashCode());
        sb2.append(']');
        return sb2.toString();
    }

    public void u(ObjectOutput objectOutput) {
        t(this.transitions.length, objectOutput);
    }
}
