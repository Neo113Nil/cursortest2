package mi;

import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.Locale;
import java.util.Map;
import oi.InterfaceC5907c;
import oi.InterfaceC5908d;
import pi.AbstractC6082b;

/* loaded from: classes5.dex */
public final class f implements Comparable, Serializable {
    private static final f[] CACHE;

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC5907c f56631a = net.time4j.format.a.e("LEAP_MONTH_INDICATOR", Character.class);

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC5907c f56632b = net.time4j.format.a.e("LEAP_MONTH_IS_TRAILING", Boolean.class);
    private static final long serialVersionUID = 7544059597266533279L;
    private final int index;
    private final boolean leap;

    static {
        f[] fVarArr = new f[24];
        for (int i10 = 0; i10 < 12; i10++) {
            fVarArr[i10] = new f(i10, false);
            fVarArr[i10 + 12] = new f(i10, true);
        }
        CACHE = fVarArr;
    }

    public f(int i10, boolean z10) {
        this.index = i10;
        this.leap = z10;
    }

    public static f d(int i10) {
        if (i10 >= 1 && i10 <= 12) {
            return CACHE[i10 - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i10);
    }

    private Object readResolve() {
        try {
            return CACHE[this.index + (this.leap ? 12 : 0)];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new StreamCorruptedException();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        int i10 = this.index;
        int i11 = fVar.index;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        return this.leap ? !fVar.leap ? 1 : 0 : fVar.leap ? -1 : 0;
    }

    public String b(Locale locale, net.time4j.format.j jVar, InterfaceC5908d interfaceC5908d) {
        StringBuilder sb2;
        Map m10 = net.time4j.format.b.c("generic", locale).m();
        String a10 = AbstractC6082b.a(jVar, ((Character) interfaceC5908d.b(net.time4j.format.a.f57814m, Character.valueOf(jVar.j().charAt(0)))).charValue(), getNumber());
        if (!this.leap) {
            return a10;
        }
        boolean booleanValue = ((Boolean) interfaceC5908d.b(f56632b, Boolean.valueOf("R".equals(m10.get("leap-alignment"))))).booleanValue();
        char charValue = ((Character) interfaceC5908d.b(f56631a, Character.valueOf(((String) m10.get("leap-indicator")).charAt(0)))).charValue();
        if (booleanValue) {
            sb2 = new StringBuilder();
            sb2.append(a10);
            sb2.append(charValue);
        } else {
            sb2 = new StringBuilder();
            sb2.append(charValue);
            sb2.append(a10);
        }
        return sb2.toString();
    }

    public boolean c() {
        return this.leap;
    }

    public f e() {
        return CACHE[this.index + 12];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.index == fVar.index && this.leap == fVar.leap) {
                return true;
            }
        }
        return false;
    }

    public int getNumber() {
        return this.index + 1;
    }

    public int hashCode() {
        return this.index + (this.leap ? 12 : 0);
    }

    public String toString() {
        String valueOf = String.valueOf(this.index + 1);
        if (!this.leap) {
            return valueOf;
        }
        return "*" + valueOf;
    }
}
