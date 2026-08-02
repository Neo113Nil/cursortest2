package defpackage;

import com.google.android.gms.internal.wearable.zzcg;
import com.google.android.gms.internal.wearable.zzcm;
import com.google.android.gms.internal.wearable.zzcn;
import com.google.android.gms.internal.wearable.zzel;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rtn extends zzcn {
    public final byte[] c;
    public final int d;
    public int e;

    public rtn(byte[] bArr, int i) {
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

    @Override // com.google.android.gms.internal.wearable.zzcn
    public final void a(int i, int i2) {
        n((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.wearable.zzcn
    public final void b(int i, int i2) {
        n(i << 3);
        m(i2);
    }

    @Override // com.google.android.gms.internal.wearable.zzcn
    public final void c(int i, int i2) {
        n(i << 3);
        n(i2);
    }

    @Override // com.google.android.gms.internal.wearable.zzcn
    public final void d(int i, int i2) {
        n((i << 3) | 5);
        o(i2);
    }

    @Override // com.google.android.gms.internal.wearable.zzcn
    public final void e(int i, long j) {
        n(i << 3);
        p(j);
    }

    @Override // com.google.android.gms.internal.wearable.zzcn
    public final void f(int i, long j) {
        n((i << 3) | 1);
        q(j);
    }

    @Override // com.google.android.gms.internal.wearable.zzcn
    public final void g(int i, boolean z) {
        n(i << 3);
        l(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.wearable.zzcn
    public final void h(int i, String str) {
        n((i << 3) | 2);
        int i2 = this.e;
        try {
            int r = zzcn.r(str.length() * 3);
            int r2 = zzcn.r(str.length());
            byte[] bArr = this.c;
            if (r2 != r) {
                n(fao.a(str));
                int i3 = this.e;
                this.e = fao.b(str, bArr, i3, bArr.length - i3);
            } else {
                int i4 = i2 + r2;
                this.e = i4;
                int b = fao.b(str, bArr, i4, bArr.length - i4);
                this.e = i2;
                n((b - i2) - r2);
                this.e = b;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new zzcm("CodedOutputStream was writing to a flat byte array and ran out of space.", e);
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzcn
    public final void i(int i, zzcg zzcgVar) {
        n((i << 3) | 2);
        n(zzcgVar.d());
        zzcgVar.n(this);
    }

    @Override // com.google.android.gms.internal.wearable.zzcn
    public final void j(int i, zzel zzelVar) {
        n(11);
        c(2, i);
        n(26);
        n(zzelVar.zzT());
        zzelVar.a(this);
        n(12);
    }

    @Override // com.google.android.gms.internal.wearable.zzcn
    public final void k(int i, zzcg zzcgVar) {
        n(11);
        c(2, i);
        i(3, zzcgVar);
        n(12);
    }

    @Override // com.google.android.gms.internal.wearable.zzcn
    public final void l(byte b) {
        int i = this.e;
        try {
            int i2 = i + 1;
            try {
                this.c[i] = b;
                this.e = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new zzcm(i, this.d, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzcn
    public final void m(int i) {
        if (i >= 0) {
            n(i);
        } else {
            p(i);
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzcn
    public final void n(int i) {
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
                    throw new zzcm(i2, this.d, 1, e);
                }
            }
            throw new zzcm(i2, this.d, 1, e);
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzcn
    public final void o(int i) {
        int i2 = this.e;
        try {
            byte[] bArr = this.c;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.e = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzcm(i2, this.d, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzcn
    public final void p(long j) {
        int i;
        int i2 = this.e;
        byte[] bArr = this.c;
        int i3 = this.d;
        if (!zzcn.b || i3 - i2 < 10) {
            while ((j & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new zzcm(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new zzcm(i, i3, 1, e);
            }
        } else {
            while ((j & (-128)) != 0) {
                n9o.c.o(bArr, n9o.e + i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            n9o.c.o(bArr, n9o.e + i2, (byte) j);
        }
        this.e = i;
    }

    @Override // com.google.android.gms.internal.wearable.zzcn
    public final void q(long j) {
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
            throw new zzcm(i, this.d, 8, e);
        }
    }

    public final void t(int i, int i2, byte[] bArr) {
        try {
            System.arraycopy(bArr, i, this.c, this.e, i2);
            this.e += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzcm(this.e, this.d, i2, e);
        }
    }

    public final int u() {
        return this.d - this.e;
    }
}
