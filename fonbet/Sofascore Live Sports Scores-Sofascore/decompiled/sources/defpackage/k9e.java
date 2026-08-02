package defpackage;

import com.inmobi.media.core.config.models.AdConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k9e {
    public int a;
    public int b;
    public int c;
    public int d;
    public byte[] e;

    public k9e(byte[] bArr, int i, int i2) {
        this.e = bArr;
        this.b = i;
        this.c = i;
        this.a = i2;
        this.d = 0;
        a();
    }

    public void a() {
        int i;
        int i2 = this.c;
        z1a.E(i2 >= 0 && (i2 < (i = this.a) || (i2 == i && this.d == 0)));
    }

    public boolean b(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 > this.a) {
                break;
            }
            if (h(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.a;
        return i4 < i6 || (i4 == i6 && i5 == 0);
    }

    public boolean c() {
        int i = this.c;
        int i2 = this.d;
        int i3 = 0;
        while (this.c < this.a && !d()) {
            i3++;
        }
        boolean z = this.c == this.a;
        this.c = i;
        this.d = i2;
        return !z && b((i3 * 2) + 1);
    }

    public boolean d() {
        boolean z = (this.e[this.c] & (128 >> this.d)) != 0;
        i();
        return z;
    }

    public int e(int i) {
        int i2;
        this.d += i;
        int i3 = 0;
        while (true) {
            i2 = this.d;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.d = i4;
            byte[] bArr = this.e;
            int i5 = this.c;
            i3 |= (bArr[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i4;
            if (!h(i5 + 1)) {
                r3 = 1;
            }
            this.c = i5 + r3;
        }
        byte[] bArr2 = this.e;
        int i6 = this.c;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i2)));
        if (i2 == 8) {
            this.d = 0;
            this.c = i6 + (h(i6 + 1) ? 2 : 1);
        }
        a();
        return i7;
    }

    public int f() {
        int i = 0;
        while (!d()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? e(i) : 0);
    }

    public int g() {
        int f = f();
        return ((f + 1) / 2) * (f % 2 == 0 ? -1 : 1);
    }

    public boolean h(int i) {
        int i2 = i - 2;
        if (this.b > i2 || i >= this.a) {
            return false;
        }
        byte[] bArr = this.e;
        return bArr[i] == 3 && bArr[i2] == 0 && bArr[i - 1] == 0;
    }

    public void i() {
        int i = this.d + 1;
        this.d = i;
        if (i == 8) {
            this.d = 0;
            int i2 = this.c;
            this.c = i2 + (h(i2 + 1) ? 2 : 1);
        }
        a();
    }

    public void j(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.c = i4;
        int i5 = (i - (i3 * 8)) + this.d;
        this.d = i5;
        if (i5 > 7) {
            this.c = i4 + 1;
            this.d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.c) {
                a();
                return;
            } else if (h(i2)) {
                this.c++;
                i2 += 2;
            }
        }
    }

    public /* synthetic */ k9e(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = bArr;
    }
}
