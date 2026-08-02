package k7;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class r0 implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final r0 f18913c = new r0(s0.f18918a);

    /* renamed from: a, reason: collision with root package name */
    public int f18914a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f18915b;

    static {
        int i5 = p0.f18905a;
    }

    public r0(byte[] bArr) {
        bArr.getClass();
        this.f18915b = bArr;
    }

    public static int g(int i5, int i10, int i11) {
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

    public static r0 h(int i5, byte[] bArr) {
        g(0, i5, bArr.length);
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, 0, bArr2, 0, i5);
        return new r0(bArr2);
    }

    public byte a(int i5) {
        return this.f18915b[i5];
    }

    public byte b(int i5) {
        return this.f18915b[i5];
    }

    public int c() {
        return 0;
    }

    public int d() {
        return this.f18915b.length;
    }

    public void e(int i5, byte[] bArr) {
        System.arraycopy(this.f18915b, 0, bArr, 0, i5);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0) || d() != ((r0) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return obj.equals(this);
        }
        r0 r0Var = (r0) obj;
        int i5 = this.f18914a;
        int i10 = r0Var.f18914a;
        if (i5 != 0 && i10 != 0 && i5 != i10) {
            return false;
        }
        int d10 = d();
        if (d10 > r0Var.d()) {
            throw new IllegalArgumentException("Length too large: " + d10 + d());
        }
        if (d10 > r0Var.d()) {
            throw new IllegalArgumentException(androidx.appcompat.widget.c1.j(d10, "Ran off end of other: 0, ", ", ", r0Var.d()));
        }
        byte[] bArr = r0Var.f18915b;
        int c2 = c() + d10;
        int c8 = c();
        int c10 = r0Var.c();
        while (c8 < c2) {
            if (this.f18915b[c8] != bArr[c10]) {
                return false;
            }
            c8++;
            c10++;
        }
        return true;
    }

    public final ByteArrayInputStream f() {
        return new ByteArrayInputStream(this.f18915b, c(), d());
    }

    public final int hashCode() {
        int i5 = this.f18914a;
        if (i5 != 0) {
            return i5;
        }
        int d10 = d();
        int c2 = c();
        byte[] bArr = s0.f18918a;
        int i10 = d10;
        for (int i11 = c2; i11 < c2 + d10; i11++) {
            i10 = (i10 * 31) + this.f18915b[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.f18914a = i10;
        return i10;
    }

    public final byte[] i() {
        int d10 = d();
        if (d10 == 0) {
            return s0.f18918a;
        }
        byte[] bArr = new byte[d10];
        e(d10, bArr);
        return bArr;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.d(this);
    }

    public final String toString() {
        r0 q0Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int d10 = d();
        if (d() <= 50) {
            concat = a.e(this);
        } else {
            int g10 = g(0, 47, d());
            if (g10 == 0) {
                q0Var = f18913c;
            } else {
                q0Var = new q0(this.f18915b, c(), g10);
            }
            concat = a.e(q0Var).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(d10);
        sb2.append(" contents=\"");
        return d9.e.l(sb2, concat, "\">");
    }
}
