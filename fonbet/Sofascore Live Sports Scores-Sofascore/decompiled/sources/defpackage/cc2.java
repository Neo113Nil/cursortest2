package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class cc2 implements Iterable, Serializable {
    public static final cc2 c = new cc2(u7a.b);
    public static final yb2 d;
    public int a = 0;
    public final byte[] b;

    static {
        d = ix.a() ? new tnf(17) : new wib(17);
    }

    public cc2(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int d(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            zzl.r(lnb.k(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            zzl.r(dmi.k(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        zzl.r(dmi.k(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static cc2 e(int i, int i2, byte[] bArr) {
        d(i, i + i2, bArr.length);
        return new cc2(d.d(i, i2, bArr));
    }

    public byte c(int i) {
        return this.b[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof cc2) && size() == ((cc2) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof cc2)) {
                return obj.equals(this);
            }
            cc2 cc2Var = (cc2) obj;
            int i = this.a;
            int i2 = cc2Var.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int size = size();
                if (size > cc2Var.size()) {
                    zzl.c(size, size());
                    return false;
                }
                if (size > cc2Var.size()) {
                    yhk.h(cc2Var.size(), lnb.t(size, "Ran off end of other: 0, ", ", "));
                    return false;
                }
                byte[] bArr = cc2Var.b;
                int m = m() + size;
                int m2 = m();
                int m3 = cc2Var.m();
                while (m2 < m) {
                    if (this.b[m2] == bArr[m3]) {
                        m2++;
                        m3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int size = size();
        int m = m();
        int i2 = size;
        for (int i3 = m; i3 < m + size; i3++) {
            i2 = (i2 * 31) + this.b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.a = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ub2(this);
    }

    public int m() {
        return 0;
    }

    public byte n(int i) {
        return this.b[i];
    }

    public int size() {
        return this.b.length;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = d2a.u(this);
        } else {
            int d2 = d(0, 47, size());
            concat = d2a.u(d2 == 0 ? c : new vb2(this.b, m(), d2)).concat("...");
        }
        return mz1.o(mz1.q(size, "<ByteString@", hexString, " size=", " contents=\""), concat, "\">");
    }
}
