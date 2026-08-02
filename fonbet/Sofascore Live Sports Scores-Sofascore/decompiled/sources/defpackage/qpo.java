package defpackage;

import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziep;
import com.google.android.gms.internal.ads.zzier;
import com.google.android.gms.internal.ads.zzigw;
import java.io.OutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qpo extends zzier {
    public final byte[] b;
    public final int c;
    public int d;
    public final OutputStream e;

    public qpo(OutputStream outputStream, int i) {
        if (outputStream == null) {
            yhk.s("out");
            throw null;
        }
        this.e = outputStream;
        if (i < 0) {
            a70.p("bufferSize must be >= 0");
            throw null;
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.b = bArr;
        this.c = bArr.length;
    }

    public final void A(long j) {
        int i = this.d;
        int i2 = i + 1;
        long j2 = j & (-128);
        int i3 = (int) j;
        byte[] bArr = this.b;
        if (j2 == 0) {
            bArr[i] = (byte) i3;
            this.d = i2;
            return;
        }
        int i4 = i + 2;
        bArr[i] = (byte) (i3 | 128);
        long j3 = j >>> 7;
        long j4 = j3 & (-128);
        int i5 = (int) j3;
        if (j4 == 0) {
            bArr[i2] = (byte) i5;
            this.d = i4;
            return;
        }
        int i6 = i + 3;
        bArr[i2] = (byte) (i5 | 128);
        long j5 = j >>> 14;
        long j6 = j5 & (-128);
        int i7 = (int) j5;
        if (j6 == 0) {
            bArr[i4] = (byte) i7;
            this.d = i6;
            return;
        }
        int i8 = i + 4;
        bArr[i4] = (byte) (i7 | 128);
        long j7 = j >>> 21;
        long j8 = j7 & (-128);
        int i9 = (int) j7;
        if (j8 == 0) {
            bArr[i6] = (byte) i9;
            this.d = i8;
            return;
        }
        int i10 = i + 5;
        bArr[i6] = (byte) (i9 | 128);
        long j9 = j >>> 28;
        long j10 = j9 & (-128);
        int i11 = (int) j9;
        if (j10 == 0) {
            bArr[i8] = (byte) i11;
            this.d = i10;
            return;
        }
        int i12 = i + 6;
        bArr[i8] = (byte) (i11 | 128);
        long j11 = j >>> 35;
        long j12 = j11 & (-128);
        int i13 = (int) j11;
        if (j12 == 0) {
            bArr[i10] = (byte) i13;
            this.d = i12;
            return;
        }
        int i14 = i + 7;
        bArr[i10] = (byte) (i13 | 128);
        long j13 = j >>> 42;
        long j14 = j13 & (-128);
        int i15 = (int) j13;
        if (j14 == 0) {
            bArr[i12] = (byte) i15;
            this.d = i14;
            return;
        }
        int i16 = i + 8;
        bArr[i12] = (byte) (i15 | 128);
        long j15 = j >>> 49;
        long j16 = j15 & (-128);
        int i17 = (int) j15;
        if (j16 == 0) {
            bArr[i14] = (byte) i17;
            this.d = i16;
            return;
        }
        int i18 = i + 9;
        bArr[i14] = (byte) (i17 | 128);
        long j17 = j >>> 56;
        int i19 = (int) j17;
        if ((j17 & (-128)) == 0) {
            bArr[i16] = (byte) i19;
            this.d = i18;
        } else {
            bArr[i16] = (byte) (i19 | 128);
            bArr[i18] = (byte) (j >>> 63);
            this.d = i + 10;
        }
    }

    public final void B(int i) {
        int i2 = this.d;
        byte[] bArr = this.b;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.d = i2 + 4;
    }

    public final void C(long j) {
        int i = this.d;
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
    }

    public final void D(int i, int i2, byte[] bArr) {
        int i3 = this.d;
        int i4 = this.c;
        int i5 = i4 - i3;
        byte[] bArr2 = this.b;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.d += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        this.d = i4;
        F();
        int i7 = i2 - i5;
        if (i7 > i4) {
            this.e.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.d = i7;
        }
    }

    public final void E(int i) {
        if (this.c - this.d < i) {
            F();
        }
    }

    public final void F() {
        this.e.write(this.b, 0, this.d);
        this.d = 0;
    }

    public final void G(int i) {
        int i2 = this.d;
        int i3 = i2 + 1;
        int i4 = i & (-128);
        byte[] bArr = this.b;
        if (i4 == 0) {
            bArr[i2] = (byte) i;
            this.d = i3;
            return;
        }
        int i5 = i2 + 2;
        bArr[i2] = (byte) (i | 128);
        int i6 = i >>> 7;
        if ((i6 & (-128)) == 0) {
            bArr[i3] = (byte) i6;
            this.d = i5;
            return;
        }
        int i7 = i2 + 3;
        bArr[i3] = (byte) (i6 | 128);
        int i8 = i >>> 14;
        if ((i8 & (-128)) == 0) {
            bArr[i5] = (byte) i8;
            this.d = i7;
            return;
        }
        int i9 = i2 + 4;
        bArr[i5] = (byte) (i8 | 128);
        int i10 = i >>> 21;
        if ((i10 & (-128)) == 0) {
            bArr[i7] = (byte) i10;
            this.d = i9;
        } else {
            bArr[i7] = (byte) (i10 | 128);
            bArr[i9] = (byte) (i >>> 28);
            this.d = i2 + 5;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidz
    public final void a(int i, int i2, byte[] bArr) {
        D(i, i2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void e(int i, int i2) {
        u((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void f(int i, int i2) {
        E(20);
        G(i << 3);
        if (i2 >= 0) {
            G(i2);
        } else {
            A(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void g(int i, int i2) {
        E(20);
        G(i << 3);
        G(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void h(int i, int i2) {
        E(14);
        G((i << 3) | 5);
        B(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void i(int i, long j) {
        E(20);
        G(i << 3);
        A(j);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void j(int i, long j) {
        E(18);
        G((i << 3) | 1);
        C(j);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void k(int i, boolean z) {
        E(11);
        G(i << 3);
        int i2 = this.d;
        this.b[i2] = z ? (byte) 1 : (byte) 0;
        this.d = i2 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void l(int i, String str) {
        u((i << 3) | 2);
        y(str);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void m(int i, zziei zzieiVar) {
        u((i << 3) | 2);
        n(zzieiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void n(zziei zzieiVar) {
        u(zzieiVar.o());
        zzieiVar.t(this);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void o(int i, byte[] bArr) {
        u(i);
        D(0, i, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void p(int i, zzigw zzigwVar) {
        u(11);
        g(2, i);
        u(26);
        r(zzigwVar);
        u(12);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void q(int i, zziei zzieiVar) {
        u(11);
        g(2, i);
        m(3, zzieiVar);
        u(12);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void r(zzigw zzigwVar) {
        u(zzigwVar.f());
        zzigwVar.c(this);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void s(byte b) {
        if (this.d == this.c) {
            F();
        }
        int i = this.d;
        this.b[i] = b;
        this.d = i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void t(int i) {
        if (i >= 0) {
            u(i);
        } else {
            w(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void u(int i) {
        E(5);
        G(i);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void v(int i) {
        E(4);
        B(i);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void w(long j) {
        E(10);
        A(j);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void x(long j) {
        E(8);
        C(j);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void y(String str) {
        int length = str.length() * 3;
        int b = zzier.b(length);
        int i = b + length;
        int i2 = this.c;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int a = tqo.a(str, bArr, 0, length);
            u(a);
            D(0, a, bArr);
            return;
        }
        if (i > i2 - this.d) {
            F();
        }
        int b2 = zzier.b(str.length());
        int i3 = this.d;
        byte[] bArr2 = this.b;
        try {
            if (b2 == b) {
                int i4 = i3 + b2;
                this.d = i4;
                int a2 = tqo.a(str, bArr2, i4, i2 - i4);
                this.d = i3;
                G((a2 - i3) - b2);
                this.d = a2;
            } else {
                int i5 = tqo.a;
                int F = g7a.F(str);
                G(F);
                this.d = tqo.a(str, bArr2, this.d, F);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zziep(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final int z() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
