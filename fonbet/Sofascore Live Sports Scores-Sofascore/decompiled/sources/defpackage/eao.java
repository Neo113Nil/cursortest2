package defpackage;

import com.google.android.gms.internal.play_billing.zzfp;
import com.google.android.gms.internal.play_billing.zzfv;
import com.google.android.gms.internal.play_billing.zzfx;
import com.google.android.gms.internal.play_billing.zzhr;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class eao extends zzfx {
    public final byte[] b;
    public final int c;
    public int d;

    public eao(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            a70.p(dmi.k(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
        this.b = bArr;
        this.d = 0;
        this.c = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final int b() {
        return this.c - this.d;
    }

    public final void e(byte b) {
        int i = this.d;
        try {
            int i2 = i + 1;
            try {
                this.b[i] = b;
                this.d = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new zzfv(i, this.c, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    public final void f(int i, int i2, byte[] bArr) {
        try {
            System.arraycopy(bArr, i, this.b, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzfv(this.d, this.c, i2, e);
        }
    }

    public final void g(int i, boolean z) {
        u(i << 3);
        e(z ? (byte) 1 : (byte) 0);
    }

    public final void h(int i, zzfp zzfpVar) {
        u((i << 3) | 2);
        i(zzfpVar);
    }

    public final void i(zzfp zzfpVar) {
        u(zzfpVar.m());
        zzfpVar.p(this);
    }

    public final void j(int i, int i2) {
        u((i << 3) | 5);
        k(i2);
    }

    public final void k(int i) {
        int i2 = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.d = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzfv(i2, this.c, 4, e);
        }
    }

    public final void l(int i, long j) {
        u((i << 3) | 1);
        m(j);
    }

    public final void m(long j) {
        int i = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.d = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzfv(i, this.c, 8, e);
        }
    }

    public final void n(int i, int i2) {
        u(i << 3);
        o(i2);
    }

    public final void o(int i) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        if (i >= 0) {
            u(i);
            return;
        }
        int i2 = this.d;
        try {
            byte[] bArr = this.b;
            long j = i;
            int i3 = i2 + 1;
            try {
                bArr[i2] = (byte) (((int) j) | 128);
                int i4 = i2 + 2;
                try {
                    bArr[i3] = (byte) (((int) (j >>> 7)) | 128);
                    int i5 = i2 + 3;
                    bArr[i4] = (byte) (((int) (j >>> 14)) | 128);
                    i4 = i2 + 4;
                    bArr[i5] = (byte) (((int) (j >>> 21)) | 128);
                    int i6 = i2 + 5;
                    bArr[i4] = (byte) (((int) (j >>> 28)) | 128);
                    int i7 = i2 + 6;
                    try {
                        bArr[i6] = -1;
                        int i8 = i2 + 7;
                        bArr[i7] = -1;
                        i7 = i2 + 8;
                        bArr[i8] = -1;
                        i3 = i2 + 9;
                        bArr[i7] = -1;
                        i2 += 10;
                        bArr[i3] = 1;
                        this.d = i2;
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i2 = i7;
                        throw new zzfv(i2, this.c, 10, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i2 = i4;
                }
            } catch (IndexOutOfBoundsException e3) {
                i2 = i3;
                indexOutOfBoundsException = e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            indexOutOfBoundsException = e4;
        }
    }

    public final void p(zzhr zzhrVar) {
        u(zzhrVar.zzn());
        zzhrVar.a(this);
    }

    public final void q(int i, String str) {
        u((i << 3) | 2);
        r(str);
    }

    public final void r(String str) {
        int i = this.d;
        try {
            int c = zzfx.c(str.length() * 3);
            int c2 = zzfx.c(str.length());
            byte[] bArr = this.b;
            if (c2 != c) {
                int i2 = aso.a;
                u(i9a.P(str));
                int i3 = this.d;
                this.d = aso.a(str, bArr, i3, bArr.length - i3);
                return;
            }
            int i4 = i + c2;
            this.d = i4;
            int a = aso.a(str, bArr, i4, bArr.length - i4);
            this.d = i;
            u((a - i) - c2);
            this.d = a;
        } catch (IndexOutOfBoundsException e) {
            throw new zzfv("CodedOutputStream was writing to a flat byte array and ran out of space.", e);
        }
    }

    public final void s(int i, int i2) {
        u((i << 3) | i2);
    }

    public final void t(int i, int i2) {
        u(i << 3);
        u(i2);
    }

    public final void u(int i) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2 = this.d;
        int i3 = i & (-128);
        byte[] bArr = this.b;
        try {
            if (i3 == 0) {
                int i4 = i2 + 1;
                bArr[i2] = (byte) i;
                this.d = i4;
                return;
            }
            int i5 = i2 + 1;
            bArr[i2] = (byte) (i | 128);
            int i6 = i >>> 7;
            try {
                if ((i6 & (-128)) == 0) {
                    int i7 = i2 + 2;
                    bArr[i5] = (byte) i6;
                    this.d = i7;
                    return;
                }
                int i8 = i2 + 2;
                try {
                    bArr[i5] = (byte) (i6 | 128);
                    int i9 = i >>> 14;
                    if ((i9 & (-128)) == 0) {
                        int i10 = i2 + 3;
                        bArr[i8] = (byte) i9;
                        this.d = i10;
                        return;
                    }
                    int i11 = i2 + 3;
                    try {
                        bArr[i8] = (byte) (i9 | 128);
                        int i12 = i >>> 21;
                        if ((i12 & (-128)) == 0) {
                            int i13 = i2 + 4;
                            bArr[i11] = (byte) i12;
                            this.d = i13;
                        } else {
                            i8 = i2 + 4;
                            bArr[i11] = (byte) (i12 | 128);
                            int i14 = i2 + 5;
                            bArr[i8] = (byte) (i >>> 28);
                            this.d = i14;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i3 = i11;
                        throw new zzfv(i3, this.c, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i3 = i8;
                }
            } catch (IndexOutOfBoundsException e3) {
                i3 = i;
                indexOutOfBoundsException = e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            indexOutOfBoundsException = e4;
        }
    }

    public final void v(int i, long j) {
        u(i << 3);
        w(j);
    }

    public final void w(long j) {
        long j2 = j & (-128);
        int i = this.d;
        byte[] bArr = this.b;
        try {
            if (j2 == 0) {
                bArr[i] = (byte) j;
                this.d = i + 1;
                return;
            }
            bArr[i] = (byte) (((int) j) | 128);
            int i2 = i + 1;
            long j3 = j >>> 7;
            long j4 = j3 & (-128);
            int i3 = (int) j3;
            if (j4 == 0) {
                bArr[i2] = (byte) i3;
                this.d = i + 2;
                return;
            }
            bArr[i2] = (byte) (i3 | 128);
            int i4 = i + 2;
            long j5 = j >>> 14;
            long j6 = j5 & (-128);
            int i5 = (int) j5;
            if (j6 == 0) {
                bArr[i4] = (byte) i5;
                this.d = i + 3;
                return;
            }
            bArr[i4] = (byte) (i5 | 128);
            int i6 = i + 3;
            long j7 = j >>> 21;
            long j8 = j7 & (-128);
            int i7 = (int) j7;
            if (j8 == 0) {
                bArr[i6] = (byte) i7;
                this.d = i + 4;
                return;
            }
            bArr[i6] = (byte) (i7 | 128);
            int i8 = i + 4;
            long j9 = j >>> 28;
            long j10 = j9 & (-128);
            int i9 = (int) j9;
            if (j10 == 0) {
                bArr[i8] = (byte) i9;
                this.d = i + 5;
                return;
            }
            bArr[i8] = (byte) (i9 | 128);
            int i10 = i + 5;
            long j11 = j >>> 35;
            long j12 = j11 & (-128);
            int i11 = (int) j11;
            if (j12 == 0) {
                bArr[i10] = (byte) i11;
                this.d = i + 6;
                return;
            }
            bArr[i10] = (byte) (i11 | 128);
            int i12 = i + 6;
            long j13 = j >>> 42;
            long j14 = j13 & (-128);
            int i13 = (int) j13;
            if (j14 == 0) {
                bArr[i12] = (byte) i13;
                this.d = i + 7;
                return;
            }
            bArr[i12] = (byte) (i13 | 128);
            int i14 = i + 7;
            long j15 = j >>> 49;
            long j16 = j15 & (-128);
            int i15 = (int) j15;
            if (j16 == 0) {
                bArr[i14] = (byte) i15;
                this.d = i + 8;
                return;
            }
            bArr[i14] = (byte) (i15 | 128);
            int i16 = i + 8;
            long j17 = j >>> 56;
            int i17 = (int) j17;
            if (((-128) & j17) == 0) {
                bArr[i16] = (byte) i17;
                this.d = i + 9;
            } else {
                bArr[i16] = (byte) (i17 | 128);
                bArr[i + 9] = (byte) (j >>> 63);
                this.d = i + 10;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new zzfv(i, this.c, 1, e);
        }
    }
}
