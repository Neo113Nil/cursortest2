package defpackage;

import com.google.android.gms.internal.consent_sdk.zzpm;
import com.google.android.gms.internal.consent_sdk.zzps;
import com.google.android.gms.internal.consent_sdk.zzpv;
import com.google.android.gms.internal.consent_sdk.zzrq;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class c2p extends zzpv {
    public final byte[] d;
    public final int e;
    public int f;

    public c2p(byte[] bArr, int i) {
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

    public final void A(int i, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.d, this.f, i);
            this.f += i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzps(this.f, this.e, i, e);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpe
    public final void a(int i, byte[] bArr) {
        A(i, bArr);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void f(byte b) {
        int i = this.f;
        try {
            int i2 = i + 1;
            try {
                this.d[i] = b;
                this.f = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new zzps(i, this.e, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void g(int i, boolean z) {
        x(i << 3);
        f(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void h(int i, byte[] bArr) {
        x(i);
        A(i, bArr);
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
        x((i << 3) | 5);
        l(i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void l(int i) {
        int i2 = this.f;
        try {
            byte[] bArr = this.d;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzps(i2, this.e, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void m(int i, long j) {
        x((i << 3) | 1);
        n(j);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void n(long j) {
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
            throw new zzps(i, this.e, 8, e);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void o(int i, int i2) {
        x(i << 3);
        p(i2);
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
        int i = this.f;
        try {
            int c = zzpv.c(str.length() * 3);
            int c2 = zzpv.c(str.length());
            int i2 = this.e;
            byte[] bArr = this.d;
            if (c2 != c) {
                x(g6p.b(str));
                int i3 = this.f;
                this.f = g6p.a(str, bArr, i3, i2 - i3);
            } else {
                int i4 = i + c2;
                this.f = i4;
                int a = g6p.a(str, bArr, i4, i2 - i4);
                this.f = i;
                x((a - i) - c2);
                this.f = a;
            }
        } catch (f6p e) {
            this.f = i;
            e(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzps(e2);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void v(int i, int i2) {
        x((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void w(int i, int i2) {
        x(i << 3);
        x(i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void x(int i) {
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
                    throw new zzps(i2, this.e, 1, e);
                }
            }
            throw new zzps(i2, this.e, 1, e);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void y(int i, long j) {
        x(i << 3);
        z(j);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void z(long j) {
        int i;
        int i2 = this.f;
        boolean z = zzpv.c;
        byte[] bArr = this.d;
        int i3 = this.e;
        if (!z || i3 - i2 < 10) {
            int i4 = i2;
            long j2 = j;
            while ((j2 & (-128)) != 0) {
                int i5 = i4 + 1;
                try {
                    bArr[i4] = (byte) (((int) j2) | 128);
                    j2 >>>= 7;
                    i4 = i5;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i5;
                    throw new zzps(i, i3, 1, e);
                }
            }
            i = i4 + 1;
            try {
                bArr[i4] = (byte) j2;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new zzps(i, i3, 1, e);
            }
        } else {
            int i6 = i2;
            long j3 = j;
            while ((j3 & (-128)) != 0) {
                d6p.h(bArr, (byte) (((int) j3) | 128), i6);
                j3 >>>= 7;
                i6++;
            }
            i = i6 + 1;
            d6p.h(bArr, (byte) j3, i6);
        }
        this.f = i;
    }
}
