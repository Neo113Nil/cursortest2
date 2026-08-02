package defpackage;

import com.google.android.gms.internal.ads.zzagi;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class nkk {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public static final long[] e = {128, 64, 32, 16, 8, 4, 2, 1};
    public static final long[] f = {128, 64, 32, 16, 8, 4, 2, 1};
    public byte[] a;
    public int b;
    public int c;

    public nkk(int i, boolean z) {
        switch (i) {
            case 1:
                this.a = new byte[8];
                break;
            case 2:
                this.a = new byte[8];
                break;
            case 3:
            default:
                this.a = new byte[8];
                break;
            case 4:
                this.a = lik.e;
                break;
        }
    }

    public static long H(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~f[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public static long a(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public static long b(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~e[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public long A() {
        int i;
        int i2;
        long j = this.a[this.b];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r6 - 1;
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            throw new NumberFormatException(vxd.l(j, "Invalid UTF-8 sequence first byte: "));
        }
        for (i = 1; i < i2; i++) {
            if ((this.a[this.b + i] & 192) != 128) {
                throw new NumberFormatException(vxd.l(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | (r3 & 63);
        }
        this.b += i2;
        return j;
    }

    public void B(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        C(bArr, i);
    }

    public void C(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public void D(int i) {
        qx9.r(i >= 0 && i <= this.a.length);
        this.c = i;
    }

    public void E(int i) {
        qx9.r(i >= 0 && i <= this.c);
        this.b = i;
    }

    public void F(int i) {
        E(this.b + i);
    }

    public long G(zzagi zzagiVar, boolean z, boolean z2, int i) {
        int i2;
        byte[] bArr = this.a;
        if (this.b == 0) {
            if (!zzagiVar.i(bArr, 0, 1, z)) {
                return -1L;
            }
            int i3 = bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i4 = 0;
            while (true) {
                if (i4 >= 8) {
                    i2 = -1;
                    break;
                }
                i2 = i4 + 1;
                if ((f[i4] & i3) != 0) {
                    break;
                }
                i4 = i2;
            }
            this.c = i2;
            if (i2 == -1) {
                a70.r("No valid varint length mask found");
                return 0L;
            }
            this.b = 1;
        }
        int i5 = this.c;
        if (i5 > i) {
            this.b = 0;
            return -2L;
        }
        if (i5 != 1) {
            zzagiVar.g(1, i5 - 1, bArr);
        }
        this.b = 0;
        return H(bArr, this.c, z2);
    }

    public int c() {
        return this.c - this.b;
    }

    public void d(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public void e(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public int f() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        this.b = i + 4;
        return (bArr[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (r0 == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String g() {
        if (c() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c) {
            byte b = this.a[i];
            int i2 = lik.a;
            if (b == 10 || b == 13) {
                break;
            }
            i++;
        }
        int i3 = this.b;
        if (i - i3 >= 3) {
            byte[] bArr = this.a;
            if (bArr[i3] == -17 && bArr[i3 + 1] == -69 && bArr[i3 + 2] == -65) {
                i3 += 3;
                this.b = i3;
            }
        }
        int i4 = lik.a;
        String str = new String(this.a, i3, i - i3, xp2.c);
        this.b = i;
        int i5 = this.c;
        if (i != i5) {
            byte[] bArr2 = this.a;
            if (bArr2[i] == 13) {
                i++;
                this.b = i;
            }
            if (bArr2[i] == 10) {
                this.b = i + 1;
            }
        }
        return str;
    }

    public int h() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        this.b = i + 4;
        return ((bArr[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | i7;
    }

    public long i() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.b = i + 4;
        long j2 = j | ((bArr[r8] & 255) << 24);
        this.b = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 32);
        this.b = i + 6;
        long j4 = j3 | ((bArr[r8] & 255) << 40);
        this.b = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 48);
        this.b = i + 8;
        return ((bArr[r8] & 255) << 56) | j5;
    }

    public long j() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.b = i + 4;
        return ((bArr[r4] & 255) << 24) | j;
    }

    public int k() {
        int h = h();
        if (h >= 0) {
            return h;
        }
        a70.r(ljg.j(h, "Top bit not zero: "));
        return 0;
    }

    public int l() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.b = i + 2;
        return ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i3;
    }

    public long m() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = ((bArr[i] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.b = i + 4;
        long j2 = j | ((bArr[r4] & 255) << 32);
        this.b = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 24);
        this.b = i + 6;
        long j4 = j3 | ((bArr[r4] & 255) << 16);
        this.b = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 8);
        this.b = i + 8;
        return (bArr[r4] & 255) | j5;
    }

    public String n() {
        if (c() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = lik.a;
        String str = new String(bArr, i2, i - i2, xp2.c);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return str;
    }

    public String o(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.c || this.a[i3] != 0) ? i : i - 1;
        byte[] bArr = this.a;
        int i5 = lik.a;
        String str = new String(bArr, i2, i4, xp2.c);
        this.b += i;
        return str;
    }

    public short p() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.b = i + 2;
        return (short) ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i3);
    }

    public String q(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public int r() {
        return s() | (s() << 21) | (s() << 14) | (s() << 7);
    }

    public int s() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public long t() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = ((bArr[i] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.b = i + 4;
        return (bArr[r4] & 255) | j;
    }

    public int u() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i3;
        this.b = i + 3;
        return (bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i5;
    }

    public int v() {
        int f2 = f();
        if (f2 >= 0) {
            return f2;
        }
        a70.r(ljg.j(f2, "Top bit not zero: "));
        return 0;
    }

    public long w() {
        long m = m();
        if (m >= 0) {
            return m;
        }
        a70.r(vxd.l(m, "Top bit not zero: "));
        return 0L;
    }

    public int x() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.b = i + 2;
        return (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i3;
    }

    public long y(ml6 ml6Var, boolean z, boolean z2, int i) {
        int i2;
        byte[] bArr = this.a;
        if (this.b == 0) {
            if (!ml6Var.readFully(bArr, 0, 1, z)) {
                return -1L;
            }
            int i3 = bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i4 = 0;
            while (true) {
                if (i4 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((d[i4] & i3) != 0) {
                    i2 = i4 + 1;
                    break;
                }
                i4++;
            }
            this.c = i2;
            if (i2 == -1) {
                a70.r("No valid varint length mask found");
                return 0L;
            }
            this.b = 1;
        }
        int i5 = this.c;
        if (i5 > i) {
            this.b = 0;
            return -2L;
        }
        if (i5 != 1) {
            ml6Var.readFully(bArr, 1, i5 - 1);
        }
        this.b = 0;
        return a(bArr, this.c, z2);
    }

    public long z(nl6 nl6Var, boolean z, boolean z2, int i) {
        int i2;
        byte[] bArr = this.a;
        if (this.b == 0) {
            if (!nl6Var.readFully(bArr, 0, 1, z)) {
                return -1L;
            }
            int i3 = bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i4 = 0;
            while (true) {
                if (i4 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((e[i4] & i3) != 0) {
                    i2 = i4 + 1;
                    break;
                }
                i4++;
            }
            this.c = i2;
            if (i2 == -1) {
                a70.r("No valid varint length mask found");
                return 0L;
            }
            this.b = 1;
        }
        int i5 = this.c;
        if (i5 > i) {
            this.b = 0;
            return -2L;
        }
        if (i5 != 1) {
            nl6Var.readFully(bArr, 1, i5 - 1);
        }
        this.b = 0;
        return b(bArr, this.c, z2);
    }

    public nkk(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public nkk(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public nkk(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }
}
