package net.time4j.format.expert;

import androidx.core.app.NotificationManagerCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import li.InterfaceC5472f;
import oi.InterfaceC5907c;
import oi.InterfaceC5908d;

/* loaded from: classes5.dex */
public final class E implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final E f57873f = new E();

    /* renamed from: a, reason: collision with root package name */
    public final net.time4j.format.e f57874a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f57875b;

    /* renamed from: c, reason: collision with root package name */
    public final List f57876c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f57877d;

    /* renamed from: e, reason: collision with root package name */
    public final net.time4j.format.g f57878e;

    public E(net.time4j.format.e eVar, boolean z10, List list) {
        if (eVar == null) {
            throw new NullPointerException("Missing display mode.");
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Missing zero offsets.");
        }
        ArrayList arrayList = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).trim().isEmpty()) {
                throw new IllegalArgumentException("Zero offset must not be white-space-only.");
            }
        }
        this.f57874a = eVar;
        this.f57875b = z10;
        this.f57876c = Collections.unmodifiableList(arrayList);
        this.f57877d = true;
        this.f57878e = net.time4j.format.g.SMART;
    }

    private static net.time4j.tz.p g(oi.o oVar, InterfaceC5908d interfaceC5908d) {
        InterfaceC5907c interfaceC5907c = net.time4j.format.a.f57805d;
        if (interfaceC5908d.c(interfaceC5907c)) {
            net.time4j.tz.k kVar = (net.time4j.tz.k) interfaceC5908d.a(interfaceC5907c);
            if (kVar instanceof net.time4j.tz.p) {
                return (net.time4j.tz.p) kVar;
            }
            if (kVar != null) {
                throw new IllegalArgumentException("Use a timezone offset instead of [" + kVar.a() + "] when formatting [" + oVar + "].");
            }
        }
        throw new IllegalArgumentException("Cannot extract timezone offset from format attributes for: " + oVar);
    }

    public static int h(CharSequence charSequence, int i10, net.time4j.format.g gVar) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < 2) {
            int i13 = i10 + i11;
            char charAt = i13 >= charSequence.length() ? (char) 0 : charSequence.charAt(i13);
            if (charAt < '0' || charAt > '9') {
                return (i11 == 0 || gVar.c()) ? NotificationManagerCompat.IMPORTANCE_UNSPECIFIED : ~i12;
            }
            i12 = (i12 * 10) + (charAt - '0');
            i11++;
        }
        return i12;
    }

    @Override // net.time4j.format.expert.h
    public int a(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d, Set set, boolean z10) {
        net.time4j.tz.p B10;
        int i10;
        int i11;
        int length = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        net.time4j.tz.k r10 = oVar.d() ? oVar.r() : null;
        if (r10 == null) {
            B10 = g(oVar, interfaceC5908d);
        } else if (r10 instanceof net.time4j.tz.p) {
            B10 = (net.time4j.tz.p) r10;
        } else {
            if (!(oVar instanceof InterfaceC5472f)) {
                throw new IllegalArgumentException("Cannot extract timezone offset from: " + oVar);
            }
            B10 = net.time4j.tz.l.N(r10).B((InterfaceC5472f) oVar);
        }
        int j10 = B10.j();
        int i12 = B10.i();
        if ((j10 | i12) == 0) {
            String str = (String) this.f57876c.get(0);
            appendable.append(str);
            i11 = str.length();
        } else {
            appendable.append((j10 < 0 || i12 < 0) ? '-' : '+');
            int abs = Math.abs(j10);
            int i13 = abs / 3600;
            int i14 = (abs / 60) % 60;
            int i15 = abs % 60;
            if (i13 < 10) {
                appendable.append('0');
                i10 = 2;
            } else {
                i10 = 1;
            }
            String valueOf = String.valueOf(i13);
            appendable.append(valueOf);
            int length2 = valueOf.length() + i10;
            net.time4j.format.e eVar = this.f57874a;
            net.time4j.format.e eVar2 = net.time4j.format.e.SHORT;
            if (eVar != eVar2 || i14 != 0) {
                if (this.f57875b) {
                    appendable.append(':');
                    length2++;
                }
                if (i14 < 10) {
                    appendable.append('0');
                    length2++;
                }
                String valueOf2 = String.valueOf(i14);
                appendable.append(valueOf2);
                length2 += valueOf2.length();
                net.time4j.format.e eVar3 = this.f57874a;
                if (eVar3 != eVar2 && eVar3 != net.time4j.format.e.MEDIUM && (eVar3 == net.time4j.format.e.FULL || (i15 | i12) != 0)) {
                    if (this.f57875b) {
                        appendable.append(':');
                        length2++;
                    }
                    if (i15 < 10) {
                        appendable.append('0');
                        length2++;
                    }
                    String valueOf3 = String.valueOf(i15);
                    appendable.append(valueOf3);
                    int length3 = valueOf3.length() + length2;
                    if (i12 != 0) {
                        appendable.append('.');
                        int i16 = length3 + 1;
                        String valueOf4 = String.valueOf(Math.abs(i12));
                        int length4 = 9 - valueOf4.length();
                        for (int i17 = 0; i17 < length4; i17++) {
                            appendable.append('0');
                            i16++;
                        }
                        appendable.append(valueOf4);
                        i11 = valueOf4.length() + i16;
                    } else {
                        i11 = length3;
                    }
                }
            }
            i11 = length2;
        }
        if (length != -1 && i11 > 0 && set != null) {
            set.add(new C5713g(B.TIMEZONE_ID, length, length + i11));
        }
        return i11;
    }

    @Override // net.time4j.format.expert.h
    public oi.p b() {
        return B.TIMEZONE_OFFSET;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015a  */
    @Override // net.time4j.format.expert.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(CharSequence charSequence, s sVar, InterfaceC5908d interfaceC5908d, t tVar, boolean z10) {
        net.time4j.tz.f fVar;
        int h10;
        int i10;
        int i11;
        int i12;
        int i13;
        net.time4j.tz.p q10;
        net.time4j.format.e eVar;
        int h11;
        int i14;
        int length = charSequence.length();
        int f10 = sVar.f();
        if (f10 >= length) {
            sVar.k(f10, "Missing timezone offset.");
            return;
        }
        for (String str : this.f57876c) {
            int length2 = str.length();
            if (length - f10 >= length2) {
                int i15 = length2 + f10;
                String charSequence2 = charSequence.subSequence(f10, i15).toString();
                boolean booleanValue = z10 ? this.f57877d : ((Boolean) interfaceC5908d.b(net.time4j.format.a.f57810i, Boolean.TRUE)).booleanValue();
                if ((booleanValue && charSequence2.equalsIgnoreCase(str)) || (!booleanValue && charSequence2.equals(str))) {
                    tVar.C(B.TIMEZONE_OFFSET, net.time4j.tz.p.f58410k);
                    sVar.l(i15);
                    return;
                }
            }
        }
        net.time4j.format.g gVar = z10 ? this.f57878e : (net.time4j.format.g) interfaceC5908d.b(net.time4j.format.a.f57807f, net.time4j.format.g.SMART);
        char charAt = charSequence.charAt(f10);
        if (charAt == '+') {
            fVar = net.time4j.tz.f.AHEAD_OF_UTC;
        } else {
            if (charAt != '-') {
                if (!Character.isDigit(charAt) || !gVar.a()) {
                    sVar.k(f10, "Missing sign of timezone offset.");
                    return;
                }
                fVar = net.time4j.tz.f.AHEAD_OF_UTC;
                h10 = h(charSequence, f10, gVar);
                if (h10 != -1000) {
                    sVar.k(f10, "Hour part in timezone offset does not match expected pattern HH.");
                    return;
                }
                if (h10 < 0) {
                    h10 = ~h10;
                    i10 = f10 + 1;
                } else {
                    i10 = f10 + 2;
                }
                if (i10 >= length) {
                    if (this.f57874a != net.time4j.format.e.SHORT) {
                        sVar.k(i10, "Missing minute part in timezone offset.");
                        return;
                    } else {
                        tVar.C(B.TIMEZONE_OFFSET, net.time4j.tz.p.n(fVar, h10));
                        sVar.l(i10);
                        return;
                    }
                }
                if (!this.f57875b) {
                    i11 = 0;
                } else {
                    if (charSequence.charAt(i10) != ':') {
                        if (this.f57874a != net.time4j.format.e.SHORT) {
                            sVar.k(i10, "Colon expected in timezone offset.");
                            return;
                        } else {
                            tVar.C(B.TIMEZONE_OFFSET, net.time4j.tz.p.n(fVar, h10));
                            sVar.l(i10);
                            return;
                        }
                    }
                    i11 = 1;
                }
                int i16 = i11 + i10;
                net.time4j.format.g gVar2 = net.time4j.format.g.STRICT;
                int h12 = h(charSequence, i16, gVar2);
                if (h12 == -1000) {
                    if (this.f57874a != net.time4j.format.e.SHORT) {
                        sVar.k(i16, "Minute part in timezone offset does not match expected pattern mm.");
                        return;
                    } else {
                        tVar.C(B.TIMEZONE_OFFSET, net.time4j.tz.p.n(fVar, h10));
                        sVar.l(i10);
                        return;
                    }
                }
                int i17 = i16 + 2;
                if (i17 < length && ((eVar = this.f57874a) == net.time4j.format.e.LONG || eVar == net.time4j.format.e.FULL)) {
                    if (!this.f57875b) {
                        h11 = h(charSequence, i17, gVar2);
                    } else if (charSequence.charAt(i17) == ':') {
                        h11 = h(charSequence, i16 + 3, gVar2);
                        i14 = 1;
                        if (h11 == -1000) {
                            int i18 = i17 + i14;
                            int i19 = i18 + 2;
                            if (i18 + 12 > length || charSequence.charAt(i19) != '.') {
                                i17 = i19;
                                i13 = h11;
                                i12 = 0;
                            } else {
                                int i20 = i18 + 3;
                                int i21 = i18 + 12;
                                int i22 = i20;
                                int i23 = 0;
                                while (i20 < i21) {
                                    char charAt2 = charSequence.charAt(i20);
                                    if (charAt2 < '0' || charAt2 > '9') {
                                        sVar.k(i22, "9 digits in fractional part of timezone offset expected.");
                                        return;
                                    } else {
                                        i23 = (i23 * 10) + (charAt2 - '0');
                                        i22++;
                                        i20++;
                                    }
                                }
                                i17 = i22;
                                i12 = i23;
                                i13 = h11;
                            }
                            if (i13 == 0 || i12 != 0) {
                                int i24 = (h10 * 3600) + (h12 * 60) + i13;
                                if (fVar == net.time4j.tz.f.BEHIND_UTC) {
                                    i24 = -i24;
                                    i12 = -i12;
                                }
                                q10 = net.time4j.tz.p.q(i24, i12);
                            } else {
                                q10 = net.time4j.tz.p.o(fVar, h10, h12);
                            }
                            tVar.C(B.TIMEZONE_OFFSET, q10);
                            sVar.l(i17);
                            return;
                        }
                        if (this.f57874a == net.time4j.format.e.FULL) {
                            sVar.k(i17, "Second part in timezone offset does not match expected pattern ss.");
                            return;
                        }
                    } else {
                        if (this.f57874a == net.time4j.format.e.FULL) {
                            sVar.k(i17, "Colon expected in timezone offset.");
                            return;
                        }
                        h11 = -1000;
                    }
                    i14 = 0;
                    if (h11 == -1000) {
                    }
                }
                i12 = 0;
                i13 = 0;
                if (i13 == 0) {
                }
                int i242 = (h10 * 3600) + (h12 * 60) + i13;
                if (fVar == net.time4j.tz.f.BEHIND_UTC) {
                }
                q10 = net.time4j.tz.p.q(i242, i12);
                tVar.C(B.TIMEZONE_OFFSET, q10);
                sVar.l(i17);
                return;
            }
            fVar = net.time4j.tz.f.BEHIND_UTC;
        }
        f10++;
        h10 = h(charSequence, f10, gVar);
        if (h10 != -1000) {
        }
    }

    @Override // net.time4j.format.expert.h
    public h d(C5709c c5709c, InterfaceC5908d interfaceC5908d, int i10) {
        return new E(this.f57874a, this.f57875b, this.f57876c, ((Boolean) interfaceC5908d.b(net.time4j.format.a.f57810i, Boolean.TRUE)).booleanValue(), (net.time4j.format.g) interfaceC5908d.b(net.time4j.format.a.f57807f, net.time4j.format.g.SMART));
    }

    @Override // net.time4j.format.expert.h
    public boolean e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E) {
            E e10 = (E) obj;
            if (this.f57874a == e10.f57874a && this.f57875b == e10.f57875b && this.f57876c.equals(e10.f57876c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f57874a.hashCode() * 7) + (this.f57876c.hashCode() * 31) + (this.f57875b ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(E.class.getName());
        sb2.append("[precision=");
        sb2.append(this.f57874a);
        sb2.append(", extended=");
        sb2.append(this.f57875b);
        sb2.append(", zero-offsets=");
        sb2.append(this.f57876c);
        sb2.append(']');
        return sb2.toString();
    }

    public E() {
        this.f57874a = net.time4j.format.e.LONG;
        this.f57875b = true;
        this.f57876c = Collections.EMPTY_LIST;
        this.f57877d = true;
        this.f57878e = net.time4j.format.g.SMART;
    }

    public E(net.time4j.format.e eVar, boolean z10, List list, boolean z11, net.time4j.format.g gVar) {
        this.f57874a = eVar;
        this.f57875b = z10;
        this.f57876c = list;
        this.f57877d = z11;
        this.f57878e = gVar;
    }

    @Override // net.time4j.format.expert.h
    public h f(oi.p pVar) {
        return this;
    }
}
