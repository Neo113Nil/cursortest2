package defpackage;

import androidx.core.app.NotificationCompat;
import java.io.FileInputStream;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class g8n implements Iterable, Serializable {
    public static final e8n b = new e8n(jan.b);
    public int a = 0;

    static {
        int i = o7n.a;
    }

    public static g8n p(Iterator it, int i) {
        if (i <= 0) {
            Locale locale = Locale.ROOT;
            a70.p(lnb.k(i, "length (", ") must be >= 1"));
            return null;
        }
        if (i == 1) {
            return (g8n) it.next();
        }
        int i2 = i >>> 1;
        g8n p = p(it, i2);
        g8n p2 = p(it, i - i2);
        if (Integer.MAX_VALUE - p.d() < p2.d()) {
            int d = p.d();
            int d2 = p2.d();
            a70.p(x5n.n(new StringBuilder(String.valueOf(d).length() + 31 + String.valueOf(d2).length()), d, "ByteString would be too long: ", d2, "+"));
            return null;
        }
        if (p2.d() == 0) {
            return p;
        }
        if (p.d() == 0) {
            return p2;
        }
        int d3 = p2.d() + p.d();
        if (d3 < 128) {
            return ocn.B(p, p2);
        }
        if (p instanceof ocn) {
            ocn ocnVar = (ocn) p;
            g8n g8nVar = ocnVar.d;
            g8n g8nVar2 = ocnVar.e;
            if (p2.d() + g8nVar2.d() < 128) {
                return new ocn(g8nVar, ocn.B(g8nVar2, p2));
            }
            if (g8nVar.s() > g8nVar2.s() && ocnVar.g > p2.s()) {
                return new ocn(g8nVar, new ocn(g8nVar2, p2));
            }
        }
        if (d3 >= ocn.A(Math.max(p.s(), p2.s()) + 1)) {
            return new ocn(p, p2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        d2a.K(p, arrayDeque);
        d2a.K(p2, arrayDeque);
        g8n g8nVar3 = (g8n) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            g8nVar3 = new ocn((g8n) arrayDeque.pop(), g8nVar3);
        }
        return g8nVar3;
    }

    public static e8n v(int i, int i2, byte[] bArr) {
        try {
            if (i2 == 0) {
                return b;
            }
            y(i, i + i2, bArr.length);
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return new e8n(bArr2);
        } catch (lan e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static g8n w(FileInputStream fileInputStream) {
        ArrayList arrayList = new ArrayList();
        int i = NotificationCompat.FLAG_LOCAL_ONLY;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = fileInputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            e8n v = i2 == 0 ? null : v(0, i2, bArr);
            if (v == null) {
                break;
            }
            arrayList.add(v);
            i = Math.min(i + i, 8192);
        }
        int size = arrayList.size();
        return size == 0 ? b : p(arrayList.iterator(), size);
    }

    public static int y(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            zzl.r(fn0.k(i, "Beginning index: ", " < 0", new StringBuilder(String.valueOf(i).length() + 21)));
            return 0;
        }
        if (i2 < i) {
            zzl.r(x5n.n(new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length()), i, "Beginning index larger than ending index: ", i2, ", "));
            return 0;
        }
        zzl.r(x5n.n(new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length()), i2, "End index: ", i3, " >= "));
        return 0;
    }

    public static /* synthetic */ boolean z(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i + i3;
        y(i, i4, bArr.length);
        y(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public abstract byte c(int i);

    public abstract int d();

    public abstract g8n e(int i, int i2);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g8n)) {
            return false;
        }
        g8n g8nVar = (g8n) obj;
        int d = d();
        if (d != g8nVar.d()) {
            return false;
        }
        if (d == 0) {
            return true;
        }
        int i = this.a;
        int i2 = g8nVar.a;
        if (i == 0 || i2 == 0 || i == i2) {
            return o(g8nVar);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int d = d();
            i = q(d, 0, d);
            if (i == 0) {
                i = 1;
            }
            this.a = i;
        }
        return i;
    }

    public abstract void m(int i, int i2, int i3, byte[] bArr);

    public abstract void n(n8n n8nVar);

    public abstract boolean o(g8n g8nVar);

    public abstract int q(int i, int i2, int i3);

    public abstract m8n r();

    public abstract int s();

    public abstract boolean t();

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return mz1.o(mz1.q(d(), "<ByteString@", hexString, " size=", " contents=\""), d() <= 50 ? x2a.W(x()) : x2a.W(e(0, 47).x()).concat("..."), "\">");
    }

    @Override // java.lang.Iterable
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public x7n iterator() {
        return new v7n(this);
    }

    public final byte[] x() {
        int d = d();
        if (d == 0) {
            return jan.b;
        }
        byte[] bArr = new byte[d];
        m(0, 0, d, bArr);
        return bArr;
    }
}
