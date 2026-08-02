package com.google.android.gms.internal.measurement;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x4 extends com.google.android.play.core.appupdate.b {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f5353f = Logger.getLogger(x4.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f5354g = q6.f5201e;

    /* renamed from: b, reason: collision with root package name */
    public u5 f5355b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f5356c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5357d;

    /* renamed from: e, reason: collision with root package name */
    public int f5358e;

    public x4(int i5, byte[] bArr) {
        int length = bArr.length;
        if (((length - i5) | i5) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(androidx.appcompat.widget.c1.j(length, "Array range is invalid. Buffer.length=", ", offset=0, length=", i5));
        }
        this.f5356c = bArr;
        this.f5358e = 0;
        this.f5357d = i5;
    }

    public static int K(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int L(String str) {
        int length;
        try {
            length = s6.b(str);
        } catch (r6 unused) {
            length = str.getBytes(n5.f5148a).length;
        }
        return b0(length) + length;
    }

    public static int b0(int i5) {
        return (352 - (Integer.numberOfLeadingZeros(i5) * 9)) >>> 6;
    }

    public final void M(int i5, int i10) {
        V((i5 << 3) | i10);
    }

    public final void N(int i5, int i10) {
        V(i5 << 3);
        U(i10);
    }

    public final void O(int i5, int i10) {
        V(i5 << 3);
        V(i10);
    }

    public final void P(int i5, int i10) {
        V((i5 << 3) | 5);
        W(i10);
    }

    public final void Q(int i5, long j) {
        V(i5 << 3);
        X(j);
    }

    public final void R(int i5, long j) {
        V((i5 << 3) | 1);
        Y(j);
    }

    public final void S(w4 w4Var) {
        V(w4Var.c());
        Z(w4Var.c(), w4Var.f5336b);
    }

    public final void T(byte b10) {
        int i5 = this.f5358e;
        try {
            int i10 = i5 + 1;
            try {
                this.f5356c[i5] = b10;
                this.f5358e = i10;
            } catch (IndexOutOfBoundsException e7) {
                e = e7;
                i5 = i10;
                throw new y4(i5, this.f5357d, 1, e, 0);
            }
        } catch (IndexOutOfBoundsException e9) {
            e = e9;
        }
    }

    public final void U(int i5) {
        if (i5 >= 0) {
            V(i5);
        } else {
            X(i5);
        }
    }

    public final void V(int i5) {
        int i10;
        int i11 = this.f5358e;
        while (true) {
            int i12 = i5 & (-128);
            byte[] bArr = this.f5356c;
            if (i12 == 0) {
                i10 = i11 + 1;
                bArr[i11] = (byte) i5;
                this.f5358e = i10;
                return;
            } else {
                i10 = i11 + 1;
                try {
                    bArr[i11] = (byte) (i5 | 128);
                    i5 >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e7) {
                    throw new y4(i10, this.f5357d, 1, e7, 0);
                }
            }
            throw new y4(i10, this.f5357d, 1, e7, 0);
        }
    }

    public final void W(int i5) {
        int i10 = this.f5358e;
        try {
            byte[] bArr = this.f5356c;
            bArr[i10] = (byte) i5;
            bArr[i10 + 1] = (byte) (i5 >> 8);
            bArr[i10 + 2] = (byte) (i5 >> 16);
            bArr[i10 + 3] = (byte) (i5 >> 24);
            this.f5358e = i10 + 4;
        } catch (IndexOutOfBoundsException e7) {
            throw new y4(i10, this.f5357d, 4, e7, 0);
        }
    }

    public final void X(long j) {
        int i5;
        int i10 = this.f5358e;
        int i11 = this.f5357d;
        byte[] bArr = this.f5356c;
        if (!f5354g || i11 - i10 < 10) {
            long j6 = j;
            while ((j6 & (-128)) != 0) {
                int i12 = i10 + 1;
                try {
                    bArr[i10] = (byte) (((int) j6) | 128);
                    j6 >>>= 7;
                    i10 = i12;
                } catch (IndexOutOfBoundsException e7) {
                    e = e7;
                    i5 = i12;
                    throw new y4(i5, i11, 1, e, 0);
                }
            }
            i5 = i10 + 1;
            try {
                bArr[i10] = (byte) j6;
            } catch (IndexOutOfBoundsException e9) {
                e = e9;
                throw new y4(i5, i11, 1, e, 0);
            }
        } else {
            long j10 = j;
            while ((j10 & (-128)) != 0) {
                q6.f5199c.a(bArr, q6.f5202f + i10, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i10++;
            }
            i5 = i10 + 1;
            q6.f5199c.a(bArr, q6.f5202f + i10, (byte) j10);
        }
        this.f5358e = i5;
    }

    public final void Y(long j) {
        int i5 = this.f5358e;
        try {
            byte[] bArr = this.f5356c;
            bArr[i5] = (byte) j;
            bArr[i5 + 1] = (byte) (j >> 8);
            bArr[i5 + 2] = (byte) (j >> 16);
            bArr[i5 + 3] = (byte) (j >> 24);
            bArr[i5 + 4] = (byte) (j >> 32);
            bArr[i5 + 5] = (byte) (j >> 40);
            bArr[i5 + 6] = (byte) (j >> 48);
            bArr[i5 + 7] = (byte) (j >> 56);
            this.f5358e = i5 + 8;
        } catch (IndexOutOfBoundsException e7) {
            throw new y4(i5, this.f5357d, 8, e7, 0);
        }
    }

    public final void Z(int i5, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.f5356c, this.f5358e, i5);
            this.f5358e += i5;
        } catch (IndexOutOfBoundsException e7) {
            throw new y4(this.f5358e, this.f5357d, i5, e7, 0);
        }
    }

    public final void a0(String str) {
        int i5 = this.f5358e;
        try {
            int b02 = b0(str.length() * 3);
            int b03 = b0(str.length());
            int i10 = this.f5357d;
            byte[] bArr = this.f5356c;
            if (b03 != b02) {
                V(s6.b(str));
                int i11 = this.f5358e;
                this.f5358e = s6.c(str, bArr, i11, i10 - i11);
            } else {
                int i12 = i5 + b03;
                this.f5358e = i12;
                int c2 = s6.c(str, bArr, i12, i10 - i12);
                this.f5358e = i5;
                V((c2 - i5) - b03);
                this.f5358e = c2;
            }
        } catch (r6 e7) {
            this.f5358e = i5;
            f5353f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e7);
            byte[] bytes = str.getBytes(n5.f5148a);
            try {
                int length = bytes.length;
                V(length);
                Z(length, bytes);
            } catch (IndexOutOfBoundsException e9) {
                throw new y4(e9);
            }
        } catch (IndexOutOfBoundsException e10) {
            throw new y4(e10);
        }
    }
}
