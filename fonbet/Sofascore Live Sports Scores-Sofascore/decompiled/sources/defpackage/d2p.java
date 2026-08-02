package defpackage;

import com.google.android.gms.internal.consent_sdk.zzpm;
import com.google.android.gms.internal.consent_sdk.zzps;
import com.google.android.gms.internal.consent_sdk.zzpv;
import com.google.android.gms.internal.consent_sdk.zzrq;
import java.io.OutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class d2p extends zzpv {
    public final byte[] d;
    public final int e;
    public int f;
    public final OutputStream g;

    public d2p(OutputStream outputStream, int i) {
        if (i < 0) {
            a70.p("bufferSize must be >= 0");
            throw null;
        }
        int max = Math.max(i, 20);
        this.d = new byte[max];
        this.e = max;
        if (outputStream != null) {
            this.g = outputStream;
        } else {
            yhk.s("out");
            throw null;
        }
    }

    public final void A() {
        this.g.write(this.d, 0, this.f);
        this.f = 0;
    }

    public final void B(int i) {
        if (this.e - this.f < i) {
            A();
        }
    }

    public final void C(int i) {
        int i2 = this.f;
        byte[] bArr = this.d;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f = i2 + 4;
    }

    public final void D(long j) {
        int i = this.f;
        byte[] bArr = this.d;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.f = i + 8;
    }

    public final void E(int i) {
        boolean z = zzpv.c;
        byte[] bArr = this.d;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.f;
                if (i2 == 0) {
                    this.f = i3 + 1;
                    d6p.h(bArr, (byte) i, i3);
                    return;
                } else {
                    this.f = i3 + 1;
                    d6p.h(bArr, (byte) (i | 128), i3);
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.f;
                if (i4 == 0) {
                    this.f = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.f = i5 + 1;
                    bArr[i5] = (byte) (i | 128);
                    i >>>= 7;
                }
            }
        }
    }

    public final void F(long j) {
        boolean z = zzpv.c;
        byte[] bArr = this.d;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = (int) j;
                int i2 = this.f;
                if (j2 == 0) {
                    this.f = i2 + 1;
                    d6p.h(bArr, (byte) i, i2);
                    return;
                } else {
                    this.f = i2 + 1;
                    d6p.h(bArr, (byte) (i | 128), i2);
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i3 = (int) j;
                int i4 = this.f;
                if (j3 == 0) {
                    this.f = i4 + 1;
                    bArr[i4] = (byte) i3;
                    return;
                } else {
                    this.f = i4 + 1;
                    bArr[i4] = (byte) (i3 | 128);
                    j >>>= 7;
                }
            }
        }
    }

    public final void G(int i, byte[] bArr) {
        int i2 = this.f;
        int i3 = this.e;
        int i4 = i3 - i2;
        byte[] bArr2 = this.d;
        if (i4 >= i) {
            System.arraycopy(bArr, 0, bArr2, i2, i);
            this.f += i;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i2, i4);
        this.f = i3;
        A();
        int i5 = i - i4;
        if (i5 > i3) {
            this.g.write(bArr, i4, i5);
        } else {
            System.arraycopy(bArr, i4, bArr2, 0, i5);
            this.f = i5;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpe
    public final void a(int i, byte[] bArr) {
        G(i, bArr);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void f(byte b) {
        if (this.f == this.e) {
            A();
        }
        int i = this.f;
        this.d[i] = b;
        this.f = i + 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void g(int i, boolean z) {
        B(11);
        E(i << 3);
        int i2 = this.f;
        this.d[i2] = z ? (byte) 1 : (byte) 0;
        this.f = i2 + 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void h(int i, byte[] bArr) {
        x(i);
        G(i, bArr);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void i(int i, zzpm zzpmVar) {
        x((i << 3) | 2);
        j(zzpmVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void j(zzpm zzpmVar) {
        x(zzpmVar.m());
        zzpmVar.p(this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void k(int i, int i2) {
        B(14);
        E((i << 3) | 5);
        C(i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void l(int i) {
        B(4);
        C(i);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void m(int i, long j) {
        B(18);
        E((i << 3) | 1);
        D(j);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void n(long j) {
        B(8);
        D(j);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void o(int i, int i2) {
        B(20);
        E(i << 3);
        if (i2 >= 0) {
            E(i2);
        } else {
            F(i2);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void p(int i) {
        if (i >= 0) {
            x(i);
        } else {
            z(i);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void q(zzrq zzrqVar) {
        x(zzrqVar.zzn());
        zzrqVar.a(this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void r(int i, zzrq zzrqVar) {
        x(11);
        w(2, i);
        x(26);
        q(zzrqVar);
        x(12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void s(int i, zzpm zzpmVar) {
        x(11);
        w(2, i);
        i(3, zzpmVar);
        x(12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void t(int i, String str) {
        x((i << 3) | 2);
        u(str);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void u(String str) {
        try {
            int length = str.length() * 3;
            int c = zzpv.c(length);
            int i = c + length;
            int i2 = this.e;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int a = g6p.a(str, bArr, 0, length);
                x(a);
                G(a, bArr);
                return;
            }
            if (i > i2 - this.f) {
                A();
            }
            int c2 = zzpv.c(str.length());
            int i3 = this.f;
            byte[] bArr2 = this.d;
            try {
                if (c2 == c) {
                    int i4 = i3 + c2;
                    this.f = i4;
                    int a2 = g6p.a(str, bArr2, i4, i2 - i4);
                    this.f = i3;
                    E((a2 - i3) - c2);
                    this.f = a2;
                } else {
                    int b = g6p.b(str);
                    E(b);
                    this.f = g6p.a(str, bArr2, this.f, b);
                }
            } catch (f6p e) {
                this.f = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new zzps(e2);
            }
        } catch (f6p e3) {
            e(str, e3);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void v(int i, int i2) {
        x((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void w(int i, int i2) {
        B(20);
        E(i << 3);
        E(i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void x(int i) {
        B(5);
        E(i);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void y(int i, long j) {
        B(20);
        E(i << 3);
        F(j);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void z(long j) {
        B(10);
        F(j);
    }
}
