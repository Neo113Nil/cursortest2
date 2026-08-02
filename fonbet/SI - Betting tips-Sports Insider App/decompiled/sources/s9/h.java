package s9;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class h implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final g f23322b = new g(t.f23376b);

    /* renamed from: c, reason: collision with root package name */
    public static final d f23323c;
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public int f23324a;

    static {
        f23323c = c.a() ? new d(1) : new d(0);
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

    public static g c(byte[] bArr, int i5, int i10) {
        byte[] copyOfRange;
        b(i5, i5 + i10, bArr.length);
        switch (f23323c.f23288a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i5, i10 + i5);
                break;
            default:
                copyOfRange = new byte[i10];
                System.arraycopy(bArr, i5, copyOfRange, 0, i10);
                break;
        }
        return new g(copyOfRange);
    }

    public abstract byte a(int i5);

    public abstract byte d(int i5);

    public final int hashCode() {
        int i5 = this.f23324a;
        if (i5 != 0) {
            return i5;
        }
        int size = size();
        g gVar = (g) this;
        int e7 = gVar.e();
        int i10 = size;
        for (int i11 = e7; i11 < e7 + size; i11++) {
            i10 = (i10 * 31) + gVar.f23307d[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.f23324a = i10;
        return i10;
    }

    public abstract int size();

    public final String toString() {
        String sb2;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb2 = io.sentry.config.a.l(this);
        } else {
            StringBuilder sb3 = new StringBuilder();
            g gVar = (g) this;
            int b10 = b(0, 47, gVar.size());
            sb3.append(io.sentry.config.a.l(b10 == 0 ? f23322b : new e(gVar.f23307d, gVar.e(), b10)));
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
