package defpackage;

import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzacy;
import com.google.android.gms.internal.measurement.zzada;
import com.google.android.gms.internal.measurement.zzafc;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class m9n extends zzada {
    public final byte[] c;
    public final int d;
    public int e;

    public m9n(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            a70.p(dmi.k(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
        this.c = bArr;
        this.e = 0;
        this.d = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final int A() {
        return this.d - this.e;
    }

    public final void B(int i, int i2, byte[] bArr) {
        try {
            System.arraycopy(bArr, i, this.c, this.e, i2);
            this.e += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzacy(this.e, this.d, i2, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacj
    public final void a(int i, int i2, byte[] bArr) {
        B(i, i2, bArr);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void f(int i, int i2) {
        v((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void g(int i, int i2) {
        v(i << 3);
        u(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void h(int i, int i2) {
        v(i << 3);
        v(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void i(int i, int i2) {
        v((i << 3) | 5);
        w(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void j(int i, long j) {
        v(i << 3);
        x(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void k(int i, long j) {
        v((i << 3) | 1);
        y(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void l(int i, boolean z) {
        v(i << 3);
        t(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void m(int i, String str) {
        v((i << 3) | 2);
        z(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void n(int i, zzacr zzacrVar) {
        v((i << 3) | 2);
        o(zzacrVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void o(zzacr zzacrVar) {
        v(zzacrVar.d());
        zzacrVar.n(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void p(int i, byte[] bArr) {
        v(i);
        B(0, i, bArr);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void q(int i, zzafc zzafcVar) {
        v(11);
        h(2, i);
        v(26);
        s(zzafcVar);
        v(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void r(int i, zzacr zzacrVar) {
        v(11);
        h(2, i);
        n(3, zzacrVar);
        v(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void s(zzafc zzafcVar) {
        v(zzafcVar.e());
        zzafcVar.f(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void t(byte b) {
        int i = this.e;
        try {
            int i2 = i + 1;
            try {
                this.c[i] = b;
                this.e = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new zzacy(i, this.d, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void u(int i) {
        if (i >= 0) {
            v(i);
        } else {
            x(i);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void v(int i) {
        int i2;
        int i3 = this.e;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.c;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.e = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzacy(i2, this.d, 1, e);
                }
            }
            throw new zzacy(i2, this.d, 1, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void w(int i) {
        int i2 = this.e;
        try {
            byte[] bArr = this.c;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.e = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzacy(i2, this.d, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void x(long j) {
        int i;
        int i2 = this.e;
        byte[] bArr = this.c;
        int i3 = this.d;
        if (!zzada.b || i3 - i2 < 10) {
            while ((j & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new zzacy(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new zzacy(i, i3, 1, e);
            }
        } else {
            while ((j & (-128)) != 0) {
                men.j(bArr, (byte) (((int) j) | 128), i2);
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            men.j(bArr, (byte) j, i2);
        }
        this.e = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void y(long j) {
        int i = this.e;
        try {
            byte[] bArr = this.c;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.e = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzacy(i, this.d, 8, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void z(String str) {
        int i = this.e;
        try {
            int b = zzada.b(str.length() * 3);
            int b2 = zzada.b(str.length());
            byte[] bArr = this.c;
            if (b2 != b) {
                v(ten.b(str));
                int i2 = this.e;
                this.e = ten.c(str, bArr, i2, bArr.length - i2);
            } else {
                int i3 = i + b2;
                this.e = i3;
                int c = ten.c(str, bArr, i3, bArr.length - i3);
                this.e = i;
                v((c - i) - b2);
                this.e = c;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new zzacy(e);
        }
    }
}
