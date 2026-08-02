package androidx.datastore.preferences.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends h8.b {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f1660f = Logger.getLogger(o.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f1661g = k1.f1646e;

    /* renamed from: a, reason: collision with root package name */
    public h0 f1662a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1663b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1664c;

    /* renamed from: d, reason: collision with root package name */
    public int f1665d;

    /* renamed from: e, reason: collision with root package name */
    public final c1.e1 f1666e;

    public o(c1.e1 e1Var, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i5, 20);
        this.f1663b = new byte[max];
        this.f1664c = max;
        this.f1666e = e1Var;
    }

    public static int c0(int i5, i iVar) {
        int e0 = e0(i5);
        int size = iVar.size();
        return f0(size) + size + e0;
    }

    public static int d0(String str) {
        int length;
        try {
            length = n1.a(str);
        } catch (m1 unused) {
            length = str.getBytes(a0.f1572a).length;
        }
        return f0(length) + length;
    }

    public static int e0(int i5) {
        return f0(i5 << 3);
    }

    public static int f0(int i5) {
        return (352 - (Integer.numberOfLeadingZeros(i5) * 9)) >>> 6;
    }

    public static int g0(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void A0(int i5, long j) {
        i0(20);
        Z(i5, 0);
        b0(j);
    }

    public final void B0(long j) {
        i0(10);
        b0(j);
    }

    @Override // h8.b
    public final void L(byte[] bArr, int i5, int i10) {
        k0(bArr, i5, i10);
    }

    public final void X(int i5) {
        int i10 = this.f1665d;
        int i11 = i10 + 1;
        this.f1665d = i11;
        byte b10 = (byte) (i5 & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = this.f1663b;
        bArr[i10] = b10;
        int i12 = i10 + 2;
        this.f1665d = i12;
        bArr[i11] = (byte) ((i5 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i13 = i10 + 3;
        this.f1665d = i13;
        bArr[i12] = (byte) ((i5 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f1665d = i10 + 4;
        bArr[i13] = (byte) ((i5 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final void Y(long j) {
        int i5 = this.f1665d;
        int i10 = i5 + 1;
        this.f1665d = i10;
        byte[] bArr = this.f1663b;
        bArr[i5] = (byte) (j & 255);
        int i11 = i5 + 2;
        this.f1665d = i11;
        bArr[i10] = (byte) ((j >> 8) & 255);
        int i12 = i5 + 3;
        this.f1665d = i12;
        bArr[i11] = (byte) ((j >> 16) & 255);
        int i13 = i5 + 4;
        this.f1665d = i13;
        bArr[i12] = (byte) (255 & (j >> 24));
        int i14 = i5 + 5;
        this.f1665d = i14;
        bArr[i13] = (byte) (((int) (j >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i15 = i5 + 6;
        this.f1665d = i15;
        bArr[i14] = (byte) (((int) (j >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i16 = i5 + 7;
        this.f1665d = i16;
        bArr[i15] = (byte) (((int) (j >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f1665d = i5 + 8;
        bArr[i16] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final void Z(int i5, int i10) {
        a0((i5 << 3) | i10);
    }

    public final void a0(int i5) {
        boolean z5 = f1661g;
        byte[] bArr = this.f1663b;
        if (z5) {
            while ((i5 & (-128)) != 0) {
                int i10 = this.f1665d;
                this.f1665d = i10 + 1;
                k1.j(bArr, i10, (byte) ((i5 | 128) & KotlinVersion.MAX_COMPONENT_VALUE));
                i5 >>>= 7;
            }
            int i11 = this.f1665d;
            this.f1665d = i11 + 1;
            k1.j(bArr, i11, (byte) i5);
            return;
        }
        while ((i5 & (-128)) != 0) {
            int i12 = this.f1665d;
            this.f1665d = i12 + 1;
            bArr[i12] = (byte) ((i5 | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
            i5 >>>= 7;
        }
        int i13 = this.f1665d;
        this.f1665d = i13 + 1;
        bArr[i13] = (byte) i5;
    }

    public final void b0(long j) {
        boolean z5 = f1661g;
        byte[] bArr = this.f1663b;
        if (z5) {
            while ((j & (-128)) != 0) {
                int i5 = this.f1665d;
                this.f1665d = i5 + 1;
                k1.j(bArr, i5, (byte) ((((int) j) | 128) & KotlinVersion.MAX_COMPONENT_VALUE));
                j >>>= 7;
            }
            int i10 = this.f1665d;
            this.f1665d = i10 + 1;
            k1.j(bArr, i10, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i11 = this.f1665d;
            this.f1665d = i11 + 1;
            bArr[i11] = (byte) ((((int) j) | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
            j >>>= 7;
        }
        int i12 = this.f1665d;
        this.f1665d = i12 + 1;
        bArr[i12] = (byte) j;
    }

    public final void h0() {
        this.f1666e.write(this.f1663b, 0, this.f1665d);
        this.f1665d = 0;
    }

    public final void i0(int i5) {
        if (this.f1664c - this.f1665d < i5) {
            h0();
        }
    }

    public final void j0(byte b10) {
        if (this.f1665d == this.f1664c) {
            h0();
        }
        int i5 = this.f1665d;
        this.f1665d = i5 + 1;
        this.f1663b[i5] = b10;
    }

    public final void k0(byte[] bArr, int i5, int i10) {
        int i11 = this.f1665d;
        int i12 = this.f1664c;
        int i13 = i12 - i11;
        byte[] bArr2 = this.f1663b;
        if (i13 >= i10) {
            System.arraycopy(bArr, i5, bArr2, i11, i10);
            this.f1665d += i10;
            return;
        }
        System.arraycopy(bArr, i5, bArr2, i11, i13);
        int i14 = i5 + i13;
        int i15 = i10 - i13;
        this.f1665d = i12;
        h0();
        if (i15 > i12) {
            this.f1666e.write(bArr, i14, i15);
        } else {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.f1665d = i15;
        }
    }

    public final void l0(int i5, boolean z5) {
        i0(11);
        Z(i5, 0);
        byte b10 = z5 ? (byte) 1 : (byte) 0;
        int i10 = this.f1665d;
        this.f1665d = i10 + 1;
        this.f1663b[i10] = b10;
    }

    public final void m0(int i5, i iVar) {
        x0(i5, 2);
        n0(iVar);
    }

    public final void n0(i iVar) {
        z0(iVar.size());
        h hVar = (h) iVar;
        L(hVar.f1614d, hVar.f(), hVar.size());
    }

    public final void o0(int i5, int i10) {
        i0(14);
        Z(i5, 5);
        X(i10);
    }

    public final void p0(int i5) {
        i0(4);
        X(i5);
    }

    public final void q0(int i5, long j) {
        i0(18);
        Z(i5, 1);
        Y(j);
    }

    public final void r0(long j) {
        i0(8);
        Y(j);
    }

    public final void s0(int i5, int i10) {
        i0(20);
        Z(i5, 0);
        if (i10 >= 0) {
            a0(i10);
        } else {
            b0(i10);
        }
    }

    public final void t0(int i5) {
        if (i5 >= 0) {
            z0(i5);
        } else {
            B0(i5);
        }
    }

    public final void u0(int i5, a aVar, x0 x0Var) {
        x0(i5, 2);
        z0(aVar.a(x0Var));
        x0Var.e(aVar, this.f1662a);
    }

    public final void v0(int i5, String str) {
        x0(i5, 2);
        w0(str);
    }

    public final void w0(String str) {
        try {
            int length = str.length() * 3;
            int f02 = f0(length);
            int i5 = f02 + length;
            int i10 = this.f1664c;
            if (i5 > i10) {
                byte[] bArr = new byte[length];
                int i11 = n1.f1659a.i(str, bArr, 0, length);
                z0(i11);
                k0(bArr, 0, i11);
                return;
            }
            if (i5 > i10 - this.f1665d) {
                h0();
            }
            int f03 = f0(str.length());
            int i12 = this.f1665d;
            byte[] bArr2 = this.f1663b;
            try {
                try {
                    if (f03 == f02) {
                        int i13 = i12 + f03;
                        this.f1665d = i13;
                        int i14 = n1.f1659a.i(str, bArr2, i13, i10 - i13);
                        this.f1665d = i12;
                        a0((i14 - i12) - f03);
                        this.f1665d = i14;
                    } else {
                        int a7 = n1.a(str);
                        a0(a7);
                        this.f1665d = n1.f1659a.i(str, bArr2, this.f1665d, a7);
                    }
                } catch (ArrayIndexOutOfBoundsException e7) {
                    throw new n(e7);
                }
            } catch (m1 e9) {
                this.f1665d = i12;
                throw e9;
            }
        } catch (m1 e10) {
            f1660f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(a0.f1572a);
            try {
                z0(bytes.length);
                L(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e11) {
                throw new n(e11);
            }
        }
    }

    public final void x0(int i5, int i10) {
        z0((i5 << 3) | i10);
    }

    public final void y0(int i5, int i10) {
        i0(20);
        Z(i5, 0);
        a0(i10);
    }

    public final void z0(int i5) {
        i0(5);
        a0(i5);
    }
}
