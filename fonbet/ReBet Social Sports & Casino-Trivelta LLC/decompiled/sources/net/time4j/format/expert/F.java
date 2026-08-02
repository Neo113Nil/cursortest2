package net.time4j.format.expert;

import java.util.Set;
import li.AbstractC5469c;
import oi.InterfaceC5908d;

/* loaded from: classes5.dex */
public final class F implements h {

    /* renamed from: a, reason: collision with root package name */
    public final oi.p f57879a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57880b;

    /* renamed from: c, reason: collision with root package name */
    public final char f57881c;

    /* renamed from: d, reason: collision with root package name */
    public final net.time4j.format.g f57882d;

    /* renamed from: e, reason: collision with root package name */
    public final int f57883e;

    /* renamed from: f, reason: collision with root package name */
    public final int f57884f;

    public F(oi.p pVar) {
        if (!pVar.name().startsWith("YEAR")) {
            throw new IllegalArgumentException("Year element required: " + pVar);
        }
        this.f57879a = pVar;
        this.f57880b = 0;
        this.f57881c = '0';
        this.f57882d = net.time4j.format.g.SMART;
        this.f57883e = 0;
        this.f57884f = 100;
    }

    public static int h(int i10, int i11) {
        return ((i10 >= i11 % 100 ? (i11 / 100) - 1 : i11 / 100) * 100) + i10;
    }

    @Override // net.time4j.format.expert.h
    public int a(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d, Set set, boolean z10) {
        int e10 = oVar.e(this.f57879a);
        if (e10 < 0) {
            if (e10 == Integer.MIN_VALUE) {
                throw new IllegalArgumentException("Format context has no year: " + oVar);
            }
            throw new IllegalArgumentException("Negative year cannot be printed as two-digit-year: " + e10);
        }
        if (g(z10, interfaceC5908d) != 100) {
            e10 = AbstractC5469c.c(e10, 100);
        }
        String num = Integer.toString(e10);
        char charValue = z10 ? this.f57881c : ((Character) interfaceC5908d.b(net.time4j.format.a.f57814m, '0')).charValue();
        int i10 = 0;
        if (charValue != '0') {
            int i11 = charValue - '0';
            char[] charArray = num.toCharArray();
            for (int i12 = 0; i12 < charArray.length; i12++) {
                charArray[i12] = (char) (charArray[i12] + i11);
            }
            num = new String(charArray);
        }
        int length = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        if (e10 < 10) {
            appendable.append(charValue);
            i10 = 1;
        }
        appendable.append(num);
        int length2 = i10 + num.length();
        if (length != -1 && length2 > 0 && set != null) {
            set.add(new C5713g(this.f57879a, length, length + length2));
        }
        return length2;
    }

    @Override // net.time4j.format.expert.h
    public oi.p b() {
        return this.f57879a;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    @Override // net.time4j.format.expert.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(CharSequence charSequence, s sVar, InterfaceC5908d interfaceC5908d, t tVar, boolean z10) {
        int length = charSequence.length();
        int f10 = sVar.f();
        int intValue = z10 ? this.f57883e : ((Integer) interfaceC5908d.b(net.time4j.format.a.f57820s, 0)).intValue();
        if (intValue > 0) {
            length -= intValue;
        }
        if (f10 >= length) {
            sVar.k(f10, "Missing digits for: " + this.f57879a.name());
            sVar.n();
            return;
        }
        int i10 = (z10 ? this.f57882d : (net.time4j.format.g) interfaceC5908d.b(net.time4j.format.a.f57807f, net.time4j.format.g.SMART)).c() ? 2 : 9;
        char charValue = z10 ? this.f57881c : ((Character) interfaceC5908d.b(net.time4j.format.a.f57814m, '0')).charValue();
        if (this.f57880b > 0 && intValue <= 0) {
            int i11 = 0;
            for (int i12 = f10; i12 < length; i12++) {
                int charAt = charSequence.charAt(i12) - charValue;
                if (charAt < 0 || charAt > 9) {
                    break;
                }
                i11++;
            }
            i10 = Math.min(i10, i11 - this.f57880b);
        }
        int i13 = f10 + 2;
        int min = Math.min(length, i10 + f10);
        boolean z11 = true;
        int i14 = f10;
        int i15 = 0;
        while (i14 < min) {
            int charAt2 = charSequence.charAt(i14) - charValue;
            if (charAt2 < 0 || charAt2 > 9) {
                if (z11) {
                    sVar.k(f10, "Digit expected.");
                    return;
                }
                if (i14 >= i13) {
                    sVar.k(f10, "Not enough digits found for: " + this.f57879a.name());
                    return;
                }
                if (i14 == i13) {
                    i15 = h(i15, g(z10, interfaceC5908d));
                }
                tVar.B(this.f57879a, i15);
                sVar.l(i14);
                return;
            }
            i15 = (i15 * 10) + charAt2;
            i14++;
            z11 = false;
        }
        if (i14 >= i13) {
        }
    }

    @Override // net.time4j.format.expert.h
    public h d(C5709c c5709c, InterfaceC5908d interfaceC5908d, int i10) {
        return new F(this.f57879a, i10, ((Character) interfaceC5908d.b(net.time4j.format.a.f57814m, '0')).charValue(), (net.time4j.format.g) interfaceC5908d.b(net.time4j.format.a.f57807f, net.time4j.format.g.SMART), ((Integer) interfaceC5908d.b(net.time4j.format.a.f57820s, 0)).intValue(), ((Integer) interfaceC5908d.b(net.time4j.format.a.f57818q, Integer.valueOf(c5709c.q().h()))).intValue());
    }

    @Override // net.time4j.format.expert.h
    public boolean e() {
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F) {
            return this.f57879a.equals(((F) obj).f57879a);
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public h f(oi.p pVar) {
        return this.f57879a == pVar ? this : new F(pVar);
    }

    public final int g(boolean z10, InterfaceC5908d interfaceC5908d) {
        int intValue = z10 ? this.f57884f : ((Integer) interfaceC5908d.b(net.time4j.format.a.f57818q, Integer.valueOf(this.f57884f))).intValue();
        if (intValue >= 100) {
            return intValue;
        }
        throw new IllegalArgumentException("Pivot year must not be smaller than 100: " + intValue);
    }

    public int hashCode() {
        return this.f57879a.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(F.class.getName());
        sb2.append("[element=");
        sb2.append(this.f57879a.name());
        sb2.append(']');
        return sb2.toString();
    }

    public F(oi.p pVar, int i10, char c10, net.time4j.format.g gVar, int i11, int i12) {
        this.f57879a = pVar;
        this.f57880b = i10;
        this.f57881c = c10;
        this.f57882d = gVar;
        this.f57883e = i11;
        this.f57884f = i12;
    }
}
