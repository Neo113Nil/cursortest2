package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z2 extends d3 {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f5660f = Logger.getLogger(z2.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f5661g = m4.f5513e;

    /* renamed from: b, reason: collision with root package name */
    public r3 f5662b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f5663c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5664d;

    /* renamed from: e, reason: collision with root package name */
    public int f5665e;

    public z2(int i5, byte[] bArr) {
        super(11);
        int length = bArr.length;
        if (((length - i5) | i5) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(androidx.appcompat.widget.c1.j(length, "Array range is invalid. Buffer.length=", ", offset=0, length=", i5));
        }
        this.f5663c = bArr;
        this.f5665e = 0;
        this.f5664d = i5;
    }

    public static int O(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int d0(String str) {
        int length;
        try {
            length = o4.c(str);
        } catch (n4 unused) {
            length = str.getBytes(l3.f5497a).length;
        }
        return e0(length) + length;
    }

    public static int e0(int i5) {
        return (352 - (Integer.numberOfLeadingZeros(i5) * 9)) >>> 6;
    }

    public final void P(int i5, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.f5663c, this.f5665e, i5);
            this.f5665e += i5;
        } catch (IndexOutOfBoundsException e7) {
            throw new com.google.android.gms.internal.measurement.y4(this.f5665e, this.f5664d, i5, e7, 1);
        }
    }

    public final void Q(int i5, y2 y2Var) {
        a0((i5 << 3) | 2);
        a0(y2Var.c());
        P(y2Var.c(), y2Var.f5656b);
    }

    public final void R(int i5, int i10) {
        a0((i5 << 3) | 5);
        S(i10);
    }

    public final void S(int i5) {
        int i10 = this.f5665e;
        try {
            byte[] bArr = this.f5663c;
            bArr[i10] = (byte) (i5 & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i10 + 1] = (byte) ((i5 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i10 + 2] = (byte) ((i5 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i10 + 3] = (byte) ((i5 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f5665e = i10 + 4;
        } catch (IndexOutOfBoundsException e7) {
            throw new com.google.android.gms.internal.measurement.y4(i10, this.f5664d, 4, e7, 1);
        }
    }

    public final void T(int i5, long j) {
        a0((i5 << 3) | 1);
        U(j);
    }

    public final void U(long j) {
        int i5 = this.f5665e;
        try {
            byte[] bArr = this.f5663c;
            bArr[i5] = (byte) (((int) j) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i5 + 1] = (byte) (((int) (j >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i5 + 2] = (byte) (((int) (j >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i5 + 3] = (byte) (((int) (j >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i5 + 4] = (byte) (((int) (j >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i5 + 5] = (byte) (((int) (j >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i5 + 6] = (byte) (((int) (j >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i5 + 7] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f5665e = i5 + 8;
        } catch (IndexOutOfBoundsException e7) {
            throw new com.google.android.gms.internal.measurement.y4(i5, this.f5664d, 8, e7, 1);
        }
    }

    public final void V(int i5, int i10) {
        a0(i5 << 3);
        W(i10);
    }

    public final void W(int i5) {
        if (i5 >= 0) {
            a0(i5);
        } else {
            c0(i5);
        }
    }

    public final void X(int i5, String str) {
        a0((i5 << 3) | 2);
        int i10 = this.f5665e;
        try {
            int e0 = e0(str.length() * 3);
            int e02 = e0(str.length());
            int i11 = this.f5664d;
            byte[] bArr = this.f5663c;
            if (e02 != e0) {
                a0(o4.c(str));
                int i12 = this.f5665e;
                this.f5665e = o4.b(str, bArr, i12, i11 - i12);
            } else {
                int i13 = i10 + e02;
                this.f5665e = i13;
                int b10 = o4.b(str, bArr, i13, i11 - i13);
                this.f5665e = i10;
                a0((b10 - i10) - e02);
                this.f5665e = b10;
            }
        } catch (n4 e7) {
            this.f5665e = i10;
            f5660f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e7);
            byte[] bytes = str.getBytes(l3.f5497a);
            try {
                int length = bytes.length;
                a0(length);
                P(length, bytes);
            } catch (IndexOutOfBoundsException e9) {
                throw new com.google.android.gms.internal.measurement.y4(e9);
            }
        } catch (IndexOutOfBoundsException e10) {
            throw new com.google.android.gms.internal.measurement.y4(e10);
        }
    }

    public final void Y(int i5, int i10) {
        a0((i5 << 3) | i10);
    }

    public final void Z(int i5, int i10) {
        a0(i5 << 3);
        a0(i10);
    }

    public final void a0(int i5) {
        while (true) {
            int i10 = i5 & (-128);
            byte[] bArr = this.f5663c;
            if (i10 == 0) {
                int i11 = this.f5665e;
                this.f5665e = i11 + 1;
                bArr[i11] = (byte) i5;
                return;
            } else {
                try {
                    int i12 = this.f5665e;
                    this.f5665e = i12 + 1;
                    bArr[i12] = (byte) ((i5 | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
                    i5 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new com.google.android.gms.internal.measurement.y4(this.f5665e, this.f5664d, 1, e7, 1);
                }
            }
            throw new com.google.android.gms.internal.measurement.y4(this.f5665e, this.f5664d, 1, e7, 1);
        }
    }

    public final void b0(int i5, long j) {
        a0(i5 << 3);
        c0(j);
    }

    public final void c0(long j) {
        boolean z5 = f5661g;
        int i5 = this.f5664d;
        byte[] bArr = this.f5663c;
        if (!z5 || i5 - this.f5665e < 10) {
            long j6 = j;
            while ((j6 & (-128)) != 0) {
                try {
                    int i10 = this.f5665e;
                    this.f5665e = i10 + 1;
                    bArr[i10] = (byte) ((((int) j6) | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
                    j6 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new com.google.android.gms.internal.measurement.y4(this.f5665e, i5, 1, e7, 1);
                }
            }
            int i11 = this.f5665e;
            this.f5665e = i11 + 1;
            bArr[i11] = (byte) j6;
            return;
        }
        long j10 = j;
        while (true) {
            int i12 = (int) j10;
            if ((j10 & (-128)) == 0) {
                int i13 = this.f5665e;
                this.f5665e = i13 + 1;
                m4.f5511c.d(bArr, m4.f5514f + i13, (byte) i12);
                return;
            }
            int i14 = this.f5665e;
            this.f5665e = i14 + 1;
            m4.f5511c.d(bArr, m4.f5514f + i14, (byte) ((i12 | 128) & KotlinVersion.MAX_COMPONENT_VALUE));
            j10 >>>= 7;
        }
    }
}
