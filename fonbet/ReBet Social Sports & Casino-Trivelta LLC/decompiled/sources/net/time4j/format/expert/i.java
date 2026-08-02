package net.time4j.format.expert;

import java.util.LinkedHashSet;
import java.util.Set;
import net.time4j.format.a;
import oi.InterfaceC5908d;
import oi.InterfaceC5918n;
import pi.InterfaceC6081a;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final h f57960a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57961b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57962c;

    /* renamed from: d, reason: collision with root package name */
    public final C5708b f57963d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC5908d f57964e;

    /* renamed from: f, reason: collision with root package name */
    public final int f57965f;

    /* renamed from: g, reason: collision with root package name */
    public final int f57966g;

    /* renamed from: h, reason: collision with root package name */
    public final int f57967h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f57968i;

    /* renamed from: j, reason: collision with root package name */
    public final int f57969j;

    public i(h hVar, int i10, int i11, C5708b c5708b) {
        this(hVar, i10, i11, c5708b, null, 0, 0, 0, false, -1);
    }

    public static boolean h(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static h w(h hVar, oi.p pVar) {
        if (hVar.b() == null) {
            return hVar;
        }
        if (hVar.b().getType() == pVar.getType() || (pVar instanceof InterfaceC6081a)) {
            return hVar.f(pVar);
        }
        throw new IllegalArgumentException("Cannot change element value type: " + pVar.name());
    }

    public final void a(CharSequence charSequence, s sVar, InterfaceC5908d interfaceC5908d, t tVar, boolean z10) {
        s sVar2;
        int f10 = sVar.f();
        try {
            sVar2 = sVar;
        } catch (RuntimeException e10) {
            e = e10;
            sVar2 = sVar;
        }
        try {
            this.f57960a.c(charSequence, sVar2, interfaceC5908d, tVar, z10);
        } catch (RuntimeException e11) {
            e = e11;
            sVar2.k(f10, e.getMessage());
        }
    }

    public int b() {
        return this.f57961b;
    }

    public final char c(InterfaceC5908d interfaceC5908d) {
        return ((Character) interfaceC5908d.b(net.time4j.format.a.f57817p, ' ')).charValue();
    }

    public h d() {
        return this.f57960a;
    }

    public final InterfaceC5908d e(InterfaceC5908d interfaceC5908d) {
        C5708b c5708b = this.f57963d;
        return c5708b == null ? interfaceC5908d : new p(c5708b, interfaceC5908d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f57960a.equals(iVar.f57960a) && this.f57961b == iVar.f57961b && this.f57962c == iVar.f57962c && h(this.f57963d, iVar.f57963d) && h(this.f57964e, iVar.f57964e) && this.f57965f == iVar.f57965f && this.f57966g == iVar.f57966g && this.f57967h == iVar.f57967h && this.f57968i == iVar.f57968i && this.f57969j == iVar.f57969j) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f57962c;
    }

    public boolean g() {
        return this.f57960a instanceof j;
    }

    public int hashCode() {
        int hashCode = this.f57960a.hashCode() * 7;
        C5708b c5708b = this.f57963d;
        return hashCode + ((c5708b == null ? 0 : c5708b.hashCode()) * 31);
    }

    public boolean i() {
        return this.f57968i;
    }

    public boolean j() {
        return this.f57960a.e();
    }

    public final boolean k(oi.o oVar) {
        InterfaceC5918n f10;
        C5708b c5708b = this.f57963d;
        return c5708b == null || (f10 = c5708b.f()) == null || f10.test(oVar);
    }

    public final boolean l(InterfaceC5908d interfaceC5908d) {
        return ((net.time4j.format.g) interfaceC5908d.b(net.time4j.format.a.f57807f, net.time4j.format.g.SMART)).c();
    }

    public i m(int i10) {
        if (this.f57968i) {
            return new i(this.f57960a, this.f57961b, this.f57962c, this.f57963d, this.f57964e, this.f57965f, this.f57966g, this.f57967h, true, i10);
        }
        throw new IllegalStateException("This step is not starting an or-block.");
    }

    public i n(int i10, int i11) {
        return new i(this.f57960a, this.f57961b, this.f57962c, this.f57963d, null, this.f57965f, this.f57966g + i10, this.f57967h + i11, this.f57968i, this.f57969j);
    }

    public final String o() {
        return "Pad width exceeded: " + this.f57960a.b().name();
    }

    public final String p() {
        return "Pad width mismatched: " + this.f57960a.b().name();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
    
        r9 = r8.f57967h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
    
        if (r9 <= 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
    
        if ((r3 + r11) == r9) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r10.k(r13 - r11, p());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q(CharSequence charSequence, s sVar, InterfaceC5908d interfaceC5908d, t tVar, boolean z10) {
        int i10;
        InterfaceC5908d e10 = z10 ? this.f57964e : e(interfaceC5908d);
        if (this.f57966g == 0 && this.f57967h == 0) {
            a(charSequence, sVar, e10, tVar, z10);
            return;
        }
        boolean l10 = l(e10);
        char c10 = c(e10);
        int f10 = sVar.f();
        int length = charSequence.length();
        int i11 = f10;
        while (i11 < length && charSequence.charAt(i11) == c10) {
            i11++;
        }
        int i12 = i11 - f10;
        if (l10 && i12 > this.f57966g) {
            sVar.k(f10, o());
            return;
        }
        sVar.l(i11);
        a(charSequence, sVar, e10, tVar, z10);
        if (sVar.i()) {
            return;
        }
        int f11 = sVar.f();
        int i13 = (f11 - f10) - i12;
        if (l10 && (i10 = this.f57966g) > 0 && i12 + i13 != i10) {
            sVar.k(f10, p());
            return;
        }
        int i14 = 0;
        while (f11 < length && ((!l10 || i13 + i14 < this.f57967h) && charSequence.charAt(f11) == c10)) {
            f11++;
            i14++;
        }
        sVar.l(f11);
    }

    public int r(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d, Set set, boolean z10) {
        StringBuilder sb2;
        int i10;
        LinkedHashSet linkedHashSet;
        int i11;
        int i12 = 0;
        if (!k(oVar)) {
            return 0;
        }
        InterfaceC5908d e10 = z10 ? this.f57964e : e(interfaceC5908d);
        if (this.f57966g == 0 && this.f57967h == 0) {
            return this.f57960a.a(oVar, appendable, e10, set, z10);
        }
        if (appendable instanceof StringBuilder) {
            sb2 = (StringBuilder) appendable;
            i10 = sb2.length();
        } else {
            sb2 = new StringBuilder();
            i10 = -1;
        }
        StringBuilder sb3 = sb2;
        if (!(appendable instanceof CharSequence) || set == null) {
            linkedHashSet = null;
            i11 = -1;
        } else {
            if (sb3 == appendable) {
                h hVar = this.f57960a;
                if ((hVar instanceof C5712f) || (hVar instanceof z)) {
                    i11 = 0;
                    linkedHashSet = new LinkedHashSet();
                }
            }
            i11 = ((CharSequence) appendable).length();
            linkedHashSet = new LinkedHashSet();
        }
        LinkedHashSet<C5713g> linkedHashSet2 = linkedHashSet;
        boolean l10 = l(e10);
        char c10 = c(e10);
        int length = sb3.length();
        this.f57960a.a(oVar, sb3, e10, linkedHashSet2, z10);
        int length2 = sb3.length() - length;
        int i13 = this.f57966g;
        if (i13 <= 0) {
            if (l10 && length2 > this.f57967h) {
                throw new IllegalArgumentException(o());
            }
            if (i10 == -1) {
                appendable.append(sb3);
            }
            while (length2 < this.f57967h) {
                appendable.append(c10);
                length2++;
            }
            if (i11 != -1) {
                for (C5713g c5713g : linkedHashSet2) {
                    set.add(new C5713g(c5713g.a(), c5713g.c() + i11, c5713g.b() + i11));
                }
            }
            return length2;
        }
        if (l10 && length2 > i13) {
            throw new IllegalArgumentException(o());
        }
        int i14 = length2;
        while (i14 < this.f57966g) {
            if (i10 == -1) {
                appendable.append(c10);
            } else {
                sb3.insert(i10, c10);
            }
            i14++;
            i12++;
        }
        if (i10 == -1) {
            appendable.append(sb3);
        }
        if (i11 != -1) {
            int i15 = i11 + i12;
            for (C5713g c5713g2 : linkedHashSet2) {
                set.add(new C5713g(c5713g2.a(), c5713g2.c() + i15, c5713g2.b() + i15));
            }
        }
        int i16 = this.f57967h;
        if (i16 > 0) {
            if (l10 && length2 > i16) {
                throw new IllegalArgumentException(o());
            }
            while (length2 < this.f57967h) {
                appendable.append(c10);
                length2++;
                i14++;
            }
        }
        return i14;
    }

    public i s(C5709c c5709c) {
        C5708b p10 = c5709c.p();
        if (this.f57963d != null) {
            p10 = p10.l(new a.b().f(p10.e()).f(this.f57963d.e()).a());
        }
        C5708b c5708b = p10;
        return new i(this.f57960a.d(c5709c, c5708b, this.f57965f), this.f57961b, this.f57962c, this.f57963d, c5708b, this.f57965f, this.f57966g, this.f57967h, this.f57968i, this.f57969j);
    }

    public i t(int i10) {
        return new i(this.f57960a, this.f57961b, this.f57962c, this.f57963d, null, this.f57965f + i10, this.f57966g, this.f57967h, this.f57968i, this.f57969j);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[processor=");
        sb2.append(this.f57960a);
        sb2.append(", level=");
        sb2.append(this.f57961b);
        sb2.append(", section=");
        sb2.append(this.f57962c);
        if (this.f57963d != null) {
            sb2.append(", attributes=");
            sb2.append(this.f57963d);
        }
        sb2.append(", reserved=");
        sb2.append(this.f57965f);
        sb2.append(", pad-left=");
        sb2.append(this.f57966g);
        sb2.append(", pad-right=");
        sb2.append(this.f57967h);
        if (this.f57968i) {
            sb2.append(", or-block-started");
        }
        sb2.append(']');
        return sb2.toString();
    }

    public int u() {
        return this.f57969j;
    }

    public i v() {
        if (this.f57968i) {
            throw new IllegalStateException("Cannot start or-block twice.");
        }
        return new i(this.f57960a, this.f57961b, this.f57962c, this.f57963d, null, this.f57965f, this.f57966g, this.f57967h, true, -1);
    }

    public i x(oi.p pVar) {
        h w10 = w(this.f57960a, pVar);
        return this.f57960a == w10 ? this : new i(w10, this.f57961b, this.f57962c, this.f57963d, this.f57964e, this.f57965f, this.f57966g, this.f57967h, this.f57968i, this.f57969j);
    }

    public i(h hVar, int i10, int i11, C5708b c5708b, InterfaceC5908d interfaceC5908d, int i12, int i13, int i14, boolean z10, int i15) {
        if (hVar == null) {
            throw new NullPointerException("Missing format processor.");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("Invalid level: " + i10);
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Invalid section: " + i11);
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("Reserved chars must not be negative: " + i12);
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("Invalid pad-width: " + i13);
        }
        if (i14 < 0) {
            throw new IllegalArgumentException("Invalid pad-width: " + i14);
        }
        this.f57960a = hVar;
        this.f57961b = i10;
        this.f57962c = i11;
        this.f57963d = c5708b;
        this.f57964e = interfaceC5908d;
        this.f57965f = i12;
        this.f57966g = i13;
        this.f57967h = i14;
        this.f57968i = z10;
        this.f57969j = i15;
    }
}
