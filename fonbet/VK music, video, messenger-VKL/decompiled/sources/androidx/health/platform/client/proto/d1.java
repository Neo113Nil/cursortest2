package androidx.health.platform.client.proto;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLite.java */
/* loaded from: classes12.dex */
public final class d1 {
    public static final d1 f = new d1(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public d1() {
        this(0, new int[8], new Object[8], true);
    }

    public final void a(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final int b() {
        int y;
        int A;
        int y2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    y2 = CodedOutputStream.y(i5) + 8;
                } else if (i6 == 2) {
                    y2 = CodedOutputStream.s(i5, (ByteString) this.c[i3]);
                } else if (i6 == 3) {
                    y = CodedOutputStream.y(i5) * 2;
                    A = ((d1) this.c[i3]).b();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.h());
                    }
                    ((Integer) this.c[i3]).getClass();
                    y2 = CodedOutputStream.y(i5) + 4;
                }
                i2 = y2 + i2;
            } else {
                long longValue = ((Long) this.c[i3]).longValue();
                y = CodedOutputStream.y(i5);
                A = CodedOutputStream.A(longValue);
            }
            i2 = A + y + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        a(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void d(Writer writer) throws IOException {
        if (this.a == 0) {
            return;
        }
        h hVar = (h) writer;
        hVar.getClass();
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                hVar.a.V(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                hVar.a.I(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                hVar.a(i3, (ByteString) obj);
            } else if (i4 == 3) {
                hVar.getClass();
                CodedOutputStream codedOutputStream = hVar.a;
                codedOutputStream.S(i3, 3);
                ((d1) obj).d(writer);
                codedOutputStream.S(i3, 4);
            } else {
                if (i4 != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.h());
                }
                hVar.a.G(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        int i = this.a;
        if (i == d1Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = d1Var.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = d1Var.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public d1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
