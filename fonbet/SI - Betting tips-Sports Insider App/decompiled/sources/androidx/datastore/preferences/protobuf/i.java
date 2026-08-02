package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class i implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final h f1618b = new h(a0.f1573b);

    /* renamed from: c, reason: collision with root package name */
    public static final e f1619c;
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public int f1620a;

    static {
        f1619c = c.a() ? new e(1) : new e(0);
    }

    public static int b(int i5, int i10, int i11) {
        int i12 = i10 - i5;
        if ((i5 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i5 < 0) {
            throw new IndexOutOfBoundsException(d9.e.f(i5, "Beginning index: ", " < 0"));
        }
        if (i10 < i5) {
            throw new IndexOutOfBoundsException(androidx.appcompat.widget.c1.j(i5, "Beginning index larger than ending index: ", ", ", i10));
        }
        throw new IndexOutOfBoundsException(androidx.appcompat.widget.c1.j(i10, "End index: ", " >= ", i11));
    }

    public static h c(byte[] bArr, int i5, int i10) {
        byte[] copyOfRange;
        b(i5, i5 + i10, bArr.length);
        switch (f1619c.f1602a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i5, i10 + i5);
                break;
            default:
                copyOfRange = new byte[i10];
                System.arraycopy(bArr, i5, copyOfRange, 0, i10);
                break;
        }
        return new h(copyOfRange);
    }

    public abstract byte a(int i5);

    public abstract void d(int i5, byte[] bArr);

    public abstract byte e(int i5);

    public final int hashCode() {
        int i5 = this.f1620a;
        if (i5 != 0) {
            return i5;
        }
        int size = size();
        h hVar = (h) this;
        int f6 = hVar.f();
        int i10 = size;
        for (int i11 = f6; i11 < f6 + size; i11++) {
            i10 = (i10 * 31) + hVar.f1614d[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.f1620a = i10;
        return i10;
    }

    public abstract int size();

    public final String toString() {
        String sb2;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb2 = io.sentry.config.a.k(this);
        } else {
            StringBuilder sb3 = new StringBuilder();
            h hVar = (h) this;
            int b10 = b(0, 47, hVar.size());
            sb3.append(io.sentry.config.a.k(b10 == 0 ? f1618b : new f(hVar.f1614d, hVar.f(), b10)));
            sb3.append("...");
            sb2 = sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder("<ByteString@");
        sb4.append(hexString);
        sb4.append(" size=");
        sb4.append(size);
        sb4.append(" contents=\"");
        return d9.e.l(sb4, sb2, "\">");
    }
}
