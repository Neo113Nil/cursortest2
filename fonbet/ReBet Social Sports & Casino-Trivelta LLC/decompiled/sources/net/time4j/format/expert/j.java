package net.time4j.format.expert;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Set;
import oi.InterfaceC5908d;

/* loaded from: classes5.dex */
public final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    public final h f57970a;

    /* renamed from: b, reason: collision with root package name */
    public final oi.p f57971b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57972c;

    /* renamed from: d, reason: collision with root package name */
    public final int f57973d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f57974e;

    /* renamed from: f, reason: collision with root package name */
    public final char f57975f;

    /* renamed from: g, reason: collision with root package name */
    public final net.time4j.format.g f57976g;

    public j(oi.p pVar, int i10, int i11, boolean z10) {
        this.f57971b = pVar;
        this.f57972c = i10;
        this.f57973d = i11;
        this.f57974e = !z10 && i10 == i11;
        this.f57970a = z10 ? new m(net.time4j.format.a.f57816o) : null;
        if (pVar == null) {
            throw new NullPointerException("Missing element.");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("Negative min digits: " + i10);
        }
        if (i10 > i11) {
            throw new IllegalArgumentException("Max smaller than min: " + i11 + " < " + i10);
        }
        if (i10 > 9) {
            throw new IllegalArgumentException("Min digits out of range: " + i10);
        }
        if (i11 <= 9) {
            this.f57975f = '0';
            this.f57976g = net.time4j.format.g.SMART;
        } else {
            throw new IllegalArgumentException("Max digits out of range: " + i11);
        }
    }

    public static BigDecimal i(Number number) {
        return BigDecimal.valueOf(number.longValue());
    }

    @Override // net.time4j.format.expert.h
    public int a(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d, Set set, boolean z10) {
        InterfaceC5908d interfaceC5908d2;
        char charValue;
        Set set2;
        int i10;
        int i11;
        BigDecimal i12 = i((Number) oVar.j(this.f57971b));
        BigDecimal i13 = i((Number) oVar.m(this.f57971b));
        BigDecimal i14 = i((Number) oVar.c(this.f57971b));
        if (i12.compareTo(i14) > 0) {
            i12 = i14;
        }
        BigDecimal subtract = i12.subtract(i13);
        BigDecimal add = i14.subtract(i13).add(BigDecimal.ONE);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal divide = subtract.divide(add, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (divide.compareTo(bigDecimal) != 0) {
            bigDecimal = com.google.android.gms.internal.measurement.a.a(divide);
        }
        BigDecimal bigDecimal2 = bigDecimal;
        if (z10) {
            charValue = this.f57975f;
            interfaceC5908d2 = interfaceC5908d;
        } else {
            interfaceC5908d2 = interfaceC5908d;
            charValue = ((Character) interfaceC5908d2.b(net.time4j.format.a.f57814m, '0')).charValue();
        }
        char c10 = charValue;
        int length = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        int i15 = 0;
        if (bigDecimal2.scale() == 0) {
            if (this.f57972c > 0) {
                if (h()) {
                    this.f57970a.a(oVar, appendable, interfaceC5908d2, set, z10);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                while (true) {
                    i11 = this.f57972c;
                    if (i15 >= i11) {
                        break;
                    }
                    appendable.append(c10);
                    i15++;
                }
                i15 = i10 + i11;
            }
            set2 = set;
        } else {
            if (h()) {
                set2 = set;
                this.f57970a.a(oVar, appendable, interfaceC5908d, set2, z10);
                i15 = 1;
            } else {
                set2 = set;
            }
            String plainString = bigDecimal2.setScale(Math.min(Math.max(bigDecimal2.scale(), this.f57972c), this.f57973d), roundingMode).toPlainString();
            int i16 = c10 - '0';
            int length2 = plainString.length();
            for (int i17 = 2; i17 < length2; i17++) {
                appendable.append((char) (plainString.charAt(i17) + i16));
                i15++;
            }
        }
        if (length != -1 && i15 > 1 && set2 != null) {
            set2.add(new C5713g(this.f57971b, length + 1, length + i15));
        }
        return i15;
    }

    @Override // net.time4j.format.expert.h
    public oi.p b() {
        return this.f57971b;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    @Override // net.time4j.format.expert.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(CharSequence charSequence, s sVar, InterfaceC5908d interfaceC5908d, t tVar, boolean z10) {
        int i10;
        int i11;
        net.time4j.format.g gVar = z10 ? this.f57976g : (net.time4j.format.g) interfaceC5908d.b(net.time4j.format.a.f57807f, net.time4j.format.g.SMART);
        int i12 = 9;
        if (!gVar.a() || this.f57974e) {
            i10 = this.f57972c;
            i11 = this.f57973d;
        } else {
            i11 = 9;
            i10 = 0;
        }
        int length = charSequence.length();
        if (sVar.f() >= length) {
            if (i10 > 0) {
                sVar.k(sVar.f(), "Expected fraction digits not found for: " + this.f57971b.name());
                return;
            }
            return;
        }
        if (h()) {
            this.f57970a.c(charSequence, sVar, interfaceC5908d, null, z10);
            if (sVar.i()) {
                if (i10 == 0) {
                    sVar.a();
                    return;
                }
                return;
            }
        }
        int f10 = sVar.f();
        int i13 = f10 + i10;
        int min = Math.min(i11 + f10, length);
        if (i13 > length && gVar.c()) {
            sVar.k(sVar.f(), "Expected at least " + i10 + " digits.");
            return;
        }
        char charValue = z10 ? this.f57975f : ((Character) interfaceC5908d.b(net.time4j.format.a.f57814m, '0')).charValue();
        long j10 = 0;
        while (f10 < min) {
            int charAt = charSequence.charAt(f10) - charValue;
            if (charAt < 0 || charAt > i12) {
                if (f10 < i13 && gVar.c()) {
                    sVar.k(sVar.f(), "Expected at least " + i10 + " digits.");
                    return;
                }
                BigDecimal movePointLeft = new BigDecimal(j10).movePointLeft(f10 - sVar.f());
                if (this.f57971b.name().equals("NANO_OF_SECOND")) {
                    tVar.C(k.FRACTION, movePointLeft);
                    oi.p pVar = this.f57971b;
                    tVar.C(pVar, pVar.d0());
                } else {
                    tVar.B(this.f57971b, g(movePointLeft, 0, 999999999));
                }
                sVar.l(f10);
            }
            j10 = (j10 * 10) + charAt;
            f10++;
            i12 = 9;
        }
        BigDecimal movePointLeft2 = new BigDecimal(j10).movePointLeft(f10 - sVar.f());
        if (this.f57971b.name().equals("NANO_OF_SECOND")) {
        }
        sVar.l(f10);
    }

    @Override // net.time4j.format.expert.h
    public h d(C5709c c5709c, InterfaceC5908d interfaceC5908d, int i10) {
        return new j(this.f57970a, this.f57971b, this.f57972c, this.f57973d, this.f57974e, ((Character) interfaceC5908d.b(net.time4j.format.a.f57814m, '0')).charValue(), (net.time4j.format.g) interfaceC5908d.b(net.time4j.format.a.f57807f, net.time4j.format.g.SMART));
    }

    @Override // net.time4j.format.expert.h
    public boolean e() {
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f57971b.equals(jVar.f57971b) && this.f57972c == jVar.f57972c && this.f57973d == jVar.f57973d && h() == jVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public h f(oi.p pVar) {
        return this.f57971b == pVar ? this : new j(pVar, this.f57972c, this.f57973d, h());
    }

    public final int g(BigDecimal bigDecimal, int i10, int i11) {
        BigDecimal valueOf = BigDecimal.valueOf(i10);
        return bigDecimal.multiply(BigDecimal.valueOf(i11).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).intValueExact();
    }

    public final boolean h() {
        return this.f57970a != null;
    }

    public int hashCode() {
        return (this.f57971b.hashCode() * 7) + ((this.f57972c + (this.f57973d * 10)) * 31);
    }

    public oi.q j(oi.q qVar, oi.q qVar2) {
        k kVar = k.FRACTION;
        if (!qVar2.f(kVar)) {
            return qVar;
        }
        int g10 = g((BigDecimal) qVar2.j(kVar), ((Integer) qVar.m(this.f57971b)).intValue(), ((Integer) qVar.c(this.f57971b)).intValue());
        qVar2.y(kVar, null);
        qVar2.w(this.f57971b, g10);
        return qVar.w(this.f57971b, g10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(j.class.getName());
        sb2.append("[element=");
        sb2.append(this.f57971b.name());
        sb2.append(", min-digits=");
        sb2.append(this.f57972c);
        sb2.append(", max-digits=");
        sb2.append(this.f57973d);
        sb2.append(']');
        return sb2.toString();
    }

    public j(h hVar, oi.p pVar, int i10, int i11, boolean z10, char c10, net.time4j.format.g gVar) {
        this.f57970a = hVar;
        this.f57971b = pVar;
        this.f57972c = i10;
        this.f57973d = i11;
        this.f57974e = z10;
        this.f57975f = c10;
        this.f57976g = gVar;
    }
}
