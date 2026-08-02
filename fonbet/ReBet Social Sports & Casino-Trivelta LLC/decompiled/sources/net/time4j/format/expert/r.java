package net.time4j.format.expert;

import java.util.Set;
import oi.InterfaceC5907c;
import oi.InterfaceC5908d;
import pi.InterfaceC6081a;

/* loaded from: classes5.dex */
public class r implements h {
    private static final int[] THRESHOLDS = {9, 99, androidx.room.w.MAX_BIND_PARAMETER_CNT, 9999, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE};

    /* renamed from: a, reason: collision with root package name */
    public final oi.p f58031a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58032b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58033c;

    /* renamed from: d, reason: collision with root package name */
    public final int f58034d;

    /* renamed from: e, reason: collision with root package name */
    public final x f58035e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f58036f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f58037g;

    /* renamed from: h, reason: collision with root package name */
    public final net.time4j.format.g f58038h;

    /* renamed from: i, reason: collision with root package name */
    public final int f58039i;

    /* renamed from: j, reason: collision with root package name */
    public final char f58040j;

    /* renamed from: k, reason: collision with root package name */
    public final net.time4j.format.j f58041k;

    /* renamed from: l, reason: collision with root package name */
    public final int f58042l;

    /* renamed from: m, reason: collision with root package name */
    public final int f58043m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f58044n;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$net$time4j$format$expert$SignPolicy;

        static {
            int[] iArr = new int[x.values().length];
            $SwitchMap$net$time4j$format$expert$SignPolicy = iArr;
            try {
                iArr[x.SHOW_ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$time4j$format$expert$SignPolicy[x.SHOW_WHEN_BIG_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public r(oi.p pVar, boolean z10, int i10, int i11, x xVar, boolean z11) {
        this(pVar, z10, i10, i11, xVar, z11, 0, '0', net.time4j.format.j.f58081a, net.time4j.format.g.SMART, 0, false);
    }

    public static void g(int i10, Appendable appendable, char c10) {
        int i11 = (i10 * 103) >>> 10;
        appendable.append((char) (i11 + c10));
        appendable.append((char) ((i10 - ((i11 << 3) + (i11 << 1))) + c10));
    }

    public static int i(int i10) {
        int i11 = 0;
        while (i10 > THRESHOLDS[i11]) {
            i11++;
        }
        return i11 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0281  */
    @Override // net.time4j.format.expert.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int a(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d, Set set, boolean z10) {
        net.time4j.format.j jVar;
        char charValue;
        boolean z11;
        int i10;
        int abs;
        boolean z12;
        int i11;
        boolean z13;
        int i12;
        int i13;
        int length = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        if (z10) {
            jVar = this.f58041k;
            charValue = this.f58040j;
        } else {
            jVar = (net.time4j.format.j) interfaceC5908d.b(net.time4j.format.a.f57813l, net.time4j.format.j.f58081a);
            InterfaceC5907c interfaceC5907c = net.time4j.format.a.f57814m;
            charValue = interfaceC5908d.c(interfaceC5907c) ? ((Character) interfaceC5908d.a(interfaceC5907c)).charValue() : jVar.l() ? jVar.j().charAt(0) : '0';
        }
        if (z10 && this.f58044n) {
            int e10 = oVar.e(this.f58031a);
            if (e10 < 0) {
                if (e10 == Integer.MIN_VALUE) {
                    return -1;
                }
                throw new IllegalArgumentException("Negative value not allowed according to sign policy.");
            }
            int i14 = i(e10);
            if (i14 > this.f58034d) {
                throw new IllegalArgumentException("Element " + this.f58031a.name() + " cannot be printed as the formatted value " + e10 + " exceeds the maximum width of " + this.f58034d + ".");
            }
            int i15 = this.f58033c - i14;
            int i16 = 0;
            for (int i17 = 0; i17 < i15; i17++) {
                appendable.append('0');
                i16++;
            }
            if (i14 == 2) {
                g(e10, appendable, '0');
            } else if (i14 == 1) {
                appendable.append((char) (e10 + 48));
            } else if (e10 >= 2000 && e10 < 2100) {
                appendable.append('2');
                appendable.append('0');
                g(e10 - 2000, appendable, '0');
            } else if (e10 < 1900 || e10 >= 2000) {
                appendable.append(Integer.toString(e10));
            } else {
                appendable.append('1');
                appendable.append('9');
                g(e10 - 1900, appendable, '0');
            }
            i13 = i16 + i14;
        } else {
            if (this.f58037g) {
                oi.p pVar = this.f58031a;
                if (pVar instanceof InterfaceC6081a) {
                    InterfaceC6081a interfaceC6081a = (InterfaceC6081a) InterfaceC6081a.class.cast(pVar);
                    StringBuilder sb2 = new StringBuilder();
                    interfaceC6081a.O(oVar, sb2, interfaceC5908d, jVar, charValue, this.f58033c, this.f58034d);
                    appendable.append(sb2.toString());
                    i13 = sb2.length();
                }
            }
            char charAt = jVar.j().charAt(0);
            Class type = this.f58031a.getType();
            boolean l10 = jVar.l();
            String str = null;
            if (type == Integer.class) {
                int e11 = oVar.e(this.f58031a);
                if (e11 == Integer.MIN_VALUE) {
                    return -1;
                }
                z12 = e11 < 0;
                abs = Math.abs(e11);
                i11 = i(abs);
            } else if (type == Long.class) {
                long longValue = ((Long) Long.class.cast(oVar.j(this.f58031a))).longValue();
                z12 = longValue < 0;
                str = longValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(longValue));
                i11 = str.length();
                charAt = '0';
                abs = Integer.MIN_VALUE;
            } else {
                if (!Enum.class.isAssignableFrom(type)) {
                    throw new IllegalArgumentException("Not formattable: " + this.f58031a);
                }
                oi.p pVar2 = this.f58031a;
                if (pVar2 instanceof net.time4j.format.l) {
                    i10 = ((net.time4j.format.l) this.f58031a).j(oVar.j(pVar2), oVar, interfaceC5908d);
                    z11 = i10 < 0;
                } else {
                    z11 = false;
                    i10 = Integer.MIN_VALUE;
                }
                if (i10 == Integer.MIN_VALUE) {
                    throw new IllegalArgumentException("Cannot print: " + this.f58031a);
                }
                abs = Math.abs(i10);
                z12 = z11;
                i11 = i(abs);
            }
            if (l10) {
                if (charValue != charAt) {
                    int i18 = charValue - charAt;
                    if (str == null) {
                        str = jVar.p(abs);
                    }
                    char[] charArray = str.toCharArray();
                    z13 = z12;
                    for (int i19 = 0; i19 < charArray.length; i19++) {
                        charArray[i19] = (char) (charArray[i19] + i18);
                    }
                    str = new String(charArray);
                } else {
                    z13 = z12;
                }
                if (i11 > this.f58034d) {
                    if (str == null) {
                        str = jVar.p(abs);
                    }
                    throw new IllegalArgumentException("Element " + this.f58031a.name() + " cannot be printed as the formatted value " + str + " exceeds the maximum width of " + this.f58034d + ".");
                }
            } else {
                z13 = z12;
            }
            String str2 = str;
            if (!z13) {
                int i20 = a.$SwitchMap$net$time4j$format$expert$SignPolicy[this.f58035e.ordinal()];
                if (i20 == 1) {
                    appendable.append('+');
                } else if (i20 == 2 && l10 && i11 > this.f58033c) {
                    appendable.append('+');
                } else {
                    i12 = 0;
                    if (l10) {
                        int i21 = this.f58033c - i11;
                        int i22 = i12;
                        for (int i23 = 0; i23 < i21; i23++) {
                            appendable.append(charValue);
                            i22++;
                        }
                        i12 = i22;
                    }
                    if (str2 == null) {
                        appendable.append(str2);
                        i11 = str2.length();
                    } else if (!l10) {
                        i11 = jVar.o(abs, appendable);
                    } else if (i11 == 2) {
                        g(abs, appendable, charValue);
                    } else if (i11 == 1) {
                        appendable.append((char) (abs + charValue));
                    } else if (abs >= 2000 && abs < 2100) {
                        appendable.append((char) (charValue + 2));
                        appendable.append(charValue);
                        g(abs - 2000, appendable, charValue);
                    } else if (abs < 1900 || abs >= 2000) {
                        appendable.append(jVar.p(abs));
                    } else {
                        appendable.append((char) (charValue + 1));
                        appendable.append((char) (charValue + '\t'));
                        g(abs - 1900, appendable, charValue);
                    }
                    i13 = i12 + i11;
                }
            } else {
                if (this.f58035e == x.SHOW_NEVER) {
                    throw new IllegalArgumentException("Negative value not allowed according to sign policy.");
                }
                appendable.append('-');
            }
            i12 = 1;
            if (l10) {
            }
            if (str2 == null) {
            }
            i13 = i12 + i11;
        }
        if (length != -1 && i13 > 0 && set != null) {
            set.add(new C5713g(this.f58031a, length, length + i13));
        }
        return i13;
    }

    @Override // net.time4j.format.expert.h
    public oi.p b() {
        return this.f58031a;
    }

    @Override // net.time4j.format.expert.h
    public void c(CharSequence charSequence, s sVar, InterfaceC5908d interfaceC5908d, t tVar, boolean z10) {
        int i10;
        net.time4j.format.j jVar;
        char c10;
        int i11;
        boolean z11;
        net.time4j.format.j jVar2;
        char c11;
        net.time4j.format.g gVar;
        boolean z12;
        int i12;
        int i13;
        boolean z13;
        boolean z14;
        int i14;
        int i15;
        long j10;
        int i16;
        int length = charSequence.length();
        int f10 = sVar.f();
        if (z10 && this.f58044n) {
            if (f10 >= length) {
                sVar.k(f10, "Missing digits for: " + this.f58031a.name());
                sVar.n();
                return;
            }
            char charAt = charSequence.charAt(f10);
            if (charAt == '-' || charAt == '+') {
                sVar.k(f10, "Sign not allowed due to sign policy.");
                return;
            }
            int i17 = this.f58033c + f10;
            int min = Math.min(length, i17);
            int i18 = f10;
            long j11 = 0;
            while (i18 < min) {
                int charAt2 = charSequence.charAt(i18) - '0';
                if (charAt2 < 0 || charAt2 > 9) {
                    break;
                }
                j11 = (j11 * 10) + charAt2;
                i18++;
            }
            if (j11 > 2147483647L) {
                sVar.k(f10, "Parsed number does not fit into an integer: " + j11);
                return;
            }
            if (i18 >= i17) {
                tVar.B(this.f58031a, (int) j11);
                sVar.l(i18);
                return;
            } else {
                if (i18 == f10) {
                    sVar.k(f10, "Digit expected.");
                    return;
                }
                sVar.k(f10, "Not enough digits found for: " + this.f58031a.name());
                return;
            }
        }
        int intValue = z10 ? this.f58042l : ((Integer) interfaceC5908d.b(net.time4j.format.a.f57820s, 0)).intValue();
        if (intValue > 0) {
            length -= intValue;
        }
        if (f10 >= length) {
            sVar.k(f10, "Missing digits for: " + this.f58031a.name());
            sVar.n();
            return;
        }
        if (this.f58037g) {
            oi.p pVar = this.f58031a;
            if (pVar instanceof InterfaceC6081a) {
                Integer l10 = ((InterfaceC6081a) InterfaceC6081a.class.cast(pVar)).l(charSequence, sVar.e(), interfaceC5908d, tVar);
                if (!sVar.i()) {
                    if (l10 == null) {
                        sVar.k(f10, "No interpretable value.");
                        return;
                    } else {
                        tVar.C(this.f58031a, l10);
                        return;
                    }
                }
                sVar.k(sVar.c(), "Unparseable element: " + this.f58031a.name());
                return;
            }
        }
        if (z10) {
            net.time4j.format.j jVar3 = this.f58041k;
            boolean l11 = jVar3.l();
            int i19 = this.f58043m;
            i10 = intValue;
            c10 = this.f58040j;
            i11 = i19;
            z11 = l11;
            jVar2 = jVar3;
        } else {
            i10 = intValue;
            net.time4j.format.j jVar4 = (net.time4j.format.j) interfaceC5908d.b(net.time4j.format.a.f57813l, net.time4j.format.j.f58081a);
            boolean l12 = jVar4.l();
            int h10 = h(jVar4);
            InterfaceC5907c interfaceC5907c = net.time4j.format.a.f57814m;
            if (interfaceC5908d.c(interfaceC5907c)) {
                c10 = ((Character) interfaceC5908d.a(interfaceC5907c)).charValue();
                jVar = jVar4;
            } else if (l12) {
                jVar = jVar4;
                c10 = jVar4.j().charAt(0);
            } else {
                jVar = jVar4;
                c10 = '0';
            }
            i11 = h10;
            z11 = l12;
            jVar2 = jVar;
        }
        if (z10) {
            gVar = this.f58038h;
            c11 = c10;
        } else {
            c11 = c10;
            gVar = (net.time4j.format.g) interfaceC5908d.b(net.time4j.format.a.f57807f, net.time4j.format.g.SMART);
        }
        if (!z11 || (!this.f58032b && gVar.a())) {
            z12 = true;
            i12 = 1;
            i13 = i11;
        } else {
            int i20 = this.f58033c;
            z12 = true;
            i13 = this.f58034d;
            i12 = i20;
        }
        char charAt3 = charSequence.charAt(f10);
        boolean z15 = z11;
        if (charAt3 != '-' && charAt3 != '+') {
            if (this.f58035e == x.SHOW_ALWAYS && gVar.c()) {
                sVar.k(f10, "Missing sign of number.");
                return;
            }
            z13 = false;
        } else if (this.f58035e == x.SHOW_NEVER && (this.f58032b || gVar.c())) {
            sVar.k(f10, "Sign not allowed due to sign policy.");
            return;
        } else if (this.f58035e == x.SHOW_WHEN_NEGATIVE && charAt3 == '+' && gVar.c()) {
            sVar.k(f10, "Positive sign not allowed due to sign policy.");
            return;
        } else {
            z13 = charAt3 == '-' ? z12 : false;
            f10++;
        }
        int i21 = f10;
        if (f10 >= length) {
            sVar.k(i21, "Missing digits for: " + this.f58031a.name());
            return;
        }
        if (this.f58032b || this.f58039i <= 0 || i10 > 0) {
            z14 = z13;
            i14 = f10;
        } else {
            if (z15) {
                int i22 = f10;
                i16 = 0;
                while (true) {
                    if (i22 >= length) {
                        z14 = z13;
                        i14 = f10;
                        break;
                    }
                    z14 = z13;
                    int charAt4 = charSequence.charAt(i22) - c11;
                    i14 = f10;
                    if (charAt4 < 0 || charAt4 > 9) {
                        break;
                    }
                    i16++;
                    i22++;
                    f10 = i14;
                    z13 = z14;
                }
            } else {
                z14 = z13;
                i14 = f10;
                i16 = 0;
                for (int i23 = i14; i23 < length && jVar2.h(charSequence.charAt(i23)); i23++) {
                    i16++;
                }
            }
            i13 = Math.min(i13, i16 - this.f58039i);
        }
        int i24 = i14 + i12;
        int min2 = Math.min(length, i14 + i13);
        if (z15) {
            j10 = 0;
            i15 = i14;
            while (i15 < min2) {
                int charAt5 = charSequence.charAt(i15) - c11;
                if (charAt5 < 0 || charAt5 > 9) {
                    break;
                }
                j10 = (j10 * 10) + charAt5;
                i15++;
            }
        } else {
            i15 = i14;
            int i25 = 0;
            while (i15 < min2 && jVar2.h(charSequence.charAt(i15))) {
                i25++;
                i15++;
            }
            if (i25 > 0) {
                try {
                    j10 = jVar2.n(charSequence.subSequence(i15 - i25, i15).toString(), gVar);
                } catch (NumberFormatException e10) {
                    sVar.k(i21, e10.getMessage());
                    return;
                }
            } else {
                j10 = 0;
            }
        }
        Class type = this.f58031a.getType();
        if (j10 > 2147483647L && type == Integer.class) {
            sVar.k(i21, "Parsed number does not fit into an integer: " + j10);
            return;
        }
        if (i15 < i24) {
            if (i15 == i21) {
                sVar.k(i21, "Digit expected.");
                return;
            } else if (this.f58032b || !gVar.a()) {
                sVar.k(i21, "Not enough digits found for: " + this.f58031a.name());
                return;
            }
        }
        if (z14) {
            if (j10 == 0 && gVar.c()) {
                sVar.k(i21 - 1, "Negative zero is not allowed.");
                return;
            }
            j10 = -j10;
        } else if (this.f58035e == x.SHOW_WHEN_BIG_NUMBER && gVar.c() && z15) {
            if (charAt3 == '+' && i15 <= i24) {
                sVar.k(i21 - 1, "Positive sign only allowed for big number.");
            } else if (charAt3 != '+' && i15 > i24) {
                sVar.k(i21, "Positive sign must be present for big number.");
            }
        }
        if (type == Integer.class) {
            tVar.B(this.f58031a, (int) j10);
        } else if (type == Long.class) {
            tVar.C(this.f58031a, Long.valueOf(j10));
        } else if (this.f58031a == net.time4j.F.f57539q) {
            tVar.B(net.time4j.F.f57540r, (int) j10);
        } else {
            if (!Enum.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException("Not parseable: " + this.f58031a);
            }
            oi.p pVar2 = this.f58031a;
            if (!(pVar2 instanceof net.time4j.format.l ? ((net.time4j.format.l) pVar2).N(tVar, (int) j10) : false)) {
                if (charAt3 == '-' || charAt3 == '+') {
                    i21--;
                }
                sVar.k(i21, "[" + this.f58031a.name() + "] No enum found for value: " + j10);
                return;
            }
        }
        sVar.l(i15);
    }

    @Override // net.time4j.format.expert.h
    public h d(C5709c c5709c, InterfaceC5908d interfaceC5908d, int i10) {
        char c10;
        char charAt;
        InterfaceC5907c interfaceC5907c = net.time4j.format.a.f57813l;
        net.time4j.format.j jVar = net.time4j.format.j.f58081a;
        net.time4j.format.j jVar2 = (net.time4j.format.j) interfaceC5908d.b(interfaceC5907c, jVar);
        InterfaceC5907c interfaceC5907c2 = net.time4j.format.a.f57814m;
        boolean z10 = false;
        if (interfaceC5908d.c(interfaceC5907c2)) {
            charAt = ((Character) interfaceC5908d.a(interfaceC5907c2)).charValue();
        } else {
            if (!jVar2.l()) {
                c10 = '0';
                int intValue = ((Integer) interfaceC5908d.b(net.time4j.format.a.f57820s, 0)).intValue();
                if (jVar2 == jVar && c10 == '0' && this.f58032b && intValue == 0 && this.f58031a.getType() == Integer.class && !this.f58037g) {
                    z10 = true;
                }
                return new r(this.f58031a, this.f58032b, this.f58033c, this.f58034d, this.f58035e, this.f58036f, i10, c10, jVar2, (net.time4j.format.g) interfaceC5908d.b(net.time4j.format.a.f57807f, net.time4j.format.g.SMART), intValue, z10);
            }
            charAt = jVar2.j().charAt(0);
        }
        c10 = charAt;
        int intValue2 = ((Integer) interfaceC5908d.b(net.time4j.format.a.f57820s, 0)).intValue();
        if (jVar2 == jVar) {
            z10 = true;
        }
        return new r(this.f58031a, this.f58032b, this.f58033c, this.f58034d, this.f58035e, this.f58036f, i10, c10, jVar2, (net.time4j.format.g) interfaceC5908d.b(net.time4j.format.a.f57807f, net.time4j.format.g.SMART), intValue2, z10);
    }

    @Override // net.time4j.format.expert.h
    public boolean e() {
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f58031a.equals(rVar.f58031a) && this.f58032b == rVar.f58032b && this.f58033c == rVar.f58033c && this.f58034d == rVar.f58034d && this.f58035e == rVar.f58035e && this.f58036f == rVar.f58036f) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public h f(oi.p pVar) {
        return (this.f58036f || this.f58031a == pVar) ? this : new r(pVar, this.f58032b, this.f58033c, this.f58034d, this.f58035e, false);
    }

    public final int h(net.time4j.format.j jVar) {
        if (!jVar.l()) {
            return 100;
        }
        Class type = this.f58031a.getType();
        if (type == Integer.class) {
            return 10;
        }
        return type == Long.class ? 18 : 9;
    }

    public int hashCode() {
        return (this.f58031a.hashCode() * 7) + ((this.f58033c + (this.f58034d * 10)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(getClass().getName());
        sb2.append("[element=");
        sb2.append(this.f58031a.name());
        sb2.append(", fixed-width-mode=");
        sb2.append(this.f58032b);
        sb2.append(", min-digits=");
        sb2.append(this.f58033c);
        sb2.append(", max-digits=");
        sb2.append(this.f58034d);
        sb2.append(", sign-policy=");
        sb2.append(this.f58035e);
        sb2.append(", protected-mode=");
        sb2.append(this.f58036f);
        sb2.append(']');
        return sb2.toString();
    }

    public r(oi.p pVar, boolean z10, int i10, int i11, x xVar, boolean z11, int i12, char c10, net.time4j.format.j jVar, net.time4j.format.g gVar, int i13, boolean z12) {
        this.f58031a = pVar;
        this.f58032b = z10;
        this.f58033c = i10;
        this.f58034d = i11;
        this.f58035e = xVar;
        this.f58036f = z11;
        this.f58044n = z12;
        if (pVar == null) {
            throw new NullPointerException("Missing element.");
        }
        if (xVar == null) {
            throw new NullPointerException("Missing sign policy.");
        }
        if (i10 < 1) {
            throw new IllegalArgumentException("Not positive: " + i10);
        }
        if (i10 > i11) {
            throw new IllegalArgumentException("Max smaller than min: " + i11 + " < " + i10);
        }
        if (z10 && i10 != i11) {
            throw new IllegalArgumentException("Variable width in fixed-width-mode: " + i11 + " != " + i10);
        }
        if (z10 && xVar != x.SHOW_NEVER) {
            throw new IllegalArgumentException("Sign policy must be SHOW_NEVER in fixed-width-mode.");
        }
        int h10 = h(jVar);
        if (jVar.l()) {
            if (i10 > h10) {
                throw new IllegalArgumentException("Min digits out of range: " + i10);
            }
            if (i11 > h10) {
                throw new IllegalArgumentException("Max digits out of range: " + i11);
            }
        }
        this.f58037g = pVar.name().equals("YEAR_OF_ERA");
        this.f58039i = i12;
        this.f58040j = c10;
        this.f58041k = jVar;
        this.f58038h = gVar;
        this.f58042l = i13;
        this.f58043m = h10;
    }
}
