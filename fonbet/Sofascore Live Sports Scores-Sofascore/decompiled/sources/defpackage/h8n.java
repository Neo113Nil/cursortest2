package defpackage;

import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzacf;
import com.google.android.gms.internal.pal.zzach;
import com.google.android.gms.internal.pal.zzadg;
import com.vungle.ads.internal.protos.Sdk;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class h8n extends zzach {
    public final byte[] d;
    public final int e;
    public int f;

    public h8n(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            sw9.n("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i)});
            throw null;
        }
        this.d = bArr;
        this.f = 0;
        this.e = i;
    }

    public final void g(byte b) {
        try {
            byte[] bArr = this.d;
            int i = this.f;
            this.f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzacf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    public final void h(int i, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.d, this.f, i);
            this.f += i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzacf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i)), e);
        }
    }

    public final void i(int i, boolean z) {
        t(i << 3);
        g(z ? (byte) 1 : (byte) 0);
    }

    public final void j(int i, zzaby zzabyVar) {
        t((i << 3) | 2);
        t(zzabyVar.m());
        zzabyVar.r(this);
    }

    public final void k(int i, int i2) {
        t((i << 3) | 5);
        l(i2);
    }

    public final void l(int i) {
        try {
            byte[] bArr = this.d;
            int i2 = this.f;
            int i3 = i2 + 1;
            this.f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzacf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    public final void m(int i, long j) {
        t((i << 3) | 1);
        n(j);
    }

    public final void n(long j) {
        try {
            byte[] bArr = this.d;
            int i = this.f;
            int i2 = i + 1;
            this.f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzacf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    public final void o(int i, int i2) {
        t(i << 3);
        p(i2);
    }

    public final void p(int i) {
        if (i >= 0) {
            t(i);
        } else {
            v(i);
        }
    }

    public final void q(int i, String str) {
        t((i << 3) | 2);
        int i2 = this.f;
        try {
            int a = zzach.a(str.length() * 3);
            int a2 = zzach.a(str.length());
            int i3 = this.e;
            byte[] bArr = this.d;
            if (a2 != a) {
                t(xdn.c(str));
                int i4 = this.f;
                this.f = xdn.b(str, bArr, i4, i3 - i4);
            } else {
                int i5 = i2 + a2;
                this.f = i5;
                int b = xdn.b(str, bArr, i5, i3 - i5);
                this.f = i2;
                t((b - i2) - a2);
                this.f = b;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new zzacf(e);
        } catch (wdn e2) {
            this.f = i2;
            zzach.b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(zzadg.a);
            try {
                int length = bytes.length;
                t(length);
                h(length, bytes);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzacf(e3);
            }
        }
    }

    public final void r(int i, int i2) {
        t((i << 3) | i2);
    }

    public final void s(int i, int i2) {
        t(i << 3);
        t(i2);
    }

    public final void t(int i) {
        while (true) {
            int i2 = i & (-128);
            int i3 = this.f;
            byte[] bArr = this.d;
            if (i2 == 0) {
                this.f = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    this.f = i3 + 1;
                    bArr[i3] = (byte) ((i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzacf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
                }
            }
            throw new zzacf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    public final void u(int i, long j) {
        t(i << 3);
        v(j);
    }

    public final void v(long j) {
        boolean z = zzach.c;
        byte[] bArr = this.d;
        int i = this.e;
        if (!z || i - this.f < 10) {
            while (true) {
                long j2 = j & (-128);
                int i2 = this.f;
                if (j2 == 0) {
                    this.f = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    try {
                        this.f = i2 + 1;
                        bArr[i2] = (byte) ((((int) j) & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new zzacf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(i), 1), e);
                    }
                }
                throw new zzacf(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(i), 1), e);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i3 = this.f;
            if (j3 == 0) {
                this.f = i3 + 1;
                sdn.c.w(bArr, sdn.f + i3, (byte) j);
                return;
            }
            this.f = i3 + 1;
            sdn.c.w(bArr, sdn.f + i3, (byte) ((((int) j) & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128));
            j >>>= 7;
        }
    }
}
