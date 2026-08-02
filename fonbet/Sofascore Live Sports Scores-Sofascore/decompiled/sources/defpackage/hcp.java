package defpackage;

import com.google.android.gms.internal.cast.zzxk;
import com.google.android.gms.internal.cast.zzxo;
import com.google.android.gms.internal.cast.zzxp;
import com.google.android.gms.internal.cast.zzym;
import com.google.android.gms.internal.cast.zzzi;
import java.util.Locale;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class hcp extends zzxp {
    public final byte[] d;
    public final int e;
    public int f;

    public hcp(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            a70.p(dmi.k(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
        this.d = bArr;
        this.f = 0;
        this.e = i;
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void b(int i, int i2) {
        o((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void c(int i, int i2) {
        o(i << 3);
        n(i2);
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void d(int i, int i2) {
        o(i << 3);
        o(i2);
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void e(int i, int i2) {
        o((i << 3) | 5);
        p(i2);
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void f(int i, long j) {
        o(i << 3);
        q(j);
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void g(int i, long j) {
        o((i << 3) | 1);
        r(j);
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void h(int i, boolean z) {
        o(i << 3);
        m(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void i(int i, String str) {
        o((i << 3) | 2);
        int i2 = this.f;
        try {
            int s = zzxp.s(str.length() * 3);
            int s2 = zzxp.s(str.length());
            int i3 = this.e;
            byte[] bArr = this.d;
            if (s2 != s) {
                o(i5n.a(str));
                int i4 = this.f;
                this.f = i5n.b(str, bArr, i4, i3 - i4);
            } else {
                int i5 = i2 + s2;
                this.f = i5;
                int b = i5n.b(str, bArr, i5, i3 - i5);
                this.f = i2;
                o((b - i2) - s2);
                this.f = b;
            }
        } catch (g5n e) {
            this.f = i2;
            zzxp.b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(zzym.a);
            try {
                int length = bytes.length;
                o(length);
                v(length, bytes);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzxo(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new zzxo(e3);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void j(int i, zzxk zzxkVar) {
        o((i << 3) | 2);
        o(zzxkVar.m());
        zzxkVar.o(this);
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void k(int i, zzzi zzziVar) {
        o(11);
        d(2, i);
        o(26);
        o(zzziVar.zzE());
        zzziVar.u(this);
        o(12);
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void l(int i, zzxk zzxkVar) {
        o(11);
        d(2, i);
        j(3, zzxkVar);
        o(12);
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void m(byte b) {
        int i = this.f;
        try {
            int i2 = i + 1;
            try {
                this.d[i] = b;
                this.f = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new zzxo(i, this.e, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void n(int i) {
        if (i >= 0) {
            o(i);
        } else {
            q(i);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void o(int i) {
        int i2;
        int i3 = this.f;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.d;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.f = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzxo(i2, this.e, 1, e);
                }
            }
            throw new zzxo(i2, this.e, 1, e);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void p(int i) {
        int i2 = this.f;
        try {
            byte[] bArr = this.d;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzxo(i2, this.e, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void q(long j) {
        int i;
        int i2 = this.f;
        byte[] bArr = this.d;
        int i3 = this.e;
        if (!zzxp.c || i3 - i2 < 10) {
            while ((j & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new zzxo(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new zzxo(i, i3, 1, e);
            }
        } else {
            while ((j & (-128)) != 0) {
                f5n.c.o(bArr, f5n.f + i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            f5n.c.o(bArr, f5n.f + i2, (byte) j);
        }
        this.f = i;
    }

    @Override // com.google.android.gms.internal.cast.zzxp
    public final void r(long j) {
        int i = this.f;
        try {
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
        } catch (IndexOutOfBoundsException e) {
            throw new zzxo(i, this.e, 8, e);
        }
    }

    public final void v(int i, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.d, this.f, i);
            this.f += i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzxo(this.f, this.e, i, e);
        }
    }
}
