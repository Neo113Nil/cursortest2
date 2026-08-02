package f1;

import e1.AbstractC4134a;
import kotlin.UByte;

/* renamed from: f1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4232j {

    /* renamed from: a, reason: collision with root package name */
    public int f46283a;

    /* renamed from: b, reason: collision with root package name */
    public int f46284b;

    /* renamed from: c, reason: collision with root package name */
    public int f46285c;
    private byte[] data;

    public C4232j(byte[] bArr, int i10, int i11) {
        j(bArr, i10, i11);
    }

    public final void a() {
        int i10;
        int i11 = this.f46284b;
        AbstractC4134a.g(i11 >= 0 && (i11 < (i10 = this.f46283a) || (i11 == i10 && this.f46285c == 0)));
    }

    public void b() {
        int i10 = this.f46285c;
        if (i10 > 0) {
            m(8 - i10);
        }
    }

    public boolean c(int i10) {
        int i11 = this.f46284b;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f46285c + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f46283a) {
                break;
            }
            if (k(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f46283a;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public boolean d() {
        int i10 = this.f46284b;
        int i11 = this.f46285c;
        int i12 = 0;
        while (this.f46284b < this.f46283a && !e()) {
            i12++;
        }
        boolean z10 = this.f46284b == this.f46283a;
        this.f46284b = i10;
        this.f46285c = i11;
        return !z10 && c((i12 * 2) + 1);
    }

    public boolean e() {
        boolean z10 = (this.data[this.f46284b] & (128 >> this.f46285c)) != 0;
        l();
        return z10;
    }

    public int f(int i10) {
        int i11;
        this.f46285c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f46285c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f46285c = i13;
            byte[] bArr = this.data;
            int i14 = this.f46284b;
            i12 |= (bArr[i14] & UByte.MAX_VALUE) << i13;
            if (!k(i14 + 1)) {
                r3 = 1;
            }
            this.f46284b = i14 + r3;
        }
        byte[] bArr2 = this.data;
        int i15 = this.f46284b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & UByte.MAX_VALUE) >> (8 - i11)));
        if (i11 == 8) {
            this.f46285c = 0;
            this.f46284b = i15 + (k(i15 + 1) ? 2 : 1);
        }
        a();
        return i16;
    }

    public final int g() {
        int i10 = 0;
        while (!e()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? f(i10) : 0);
    }

    public int h() {
        int g10 = g();
        return (g10 % 2 == 0 ? -1 : 1) * ((g10 + 1) / 2);
    }

    public int i() {
        return g();
    }

    public void j(byte[] bArr, int i10, int i11) {
        this.data = bArr;
        this.f46284b = i10;
        this.f46283a = i11;
        this.f46285c = 0;
        a();
    }

    public final boolean k(int i10) {
        if (2 > i10 || i10 >= this.f46283a) {
            return false;
        }
        byte[] bArr = this.data;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 - 1] == 0;
    }

    public void l() {
        int i10 = this.f46285c + 1;
        this.f46285c = i10;
        if (i10 == 8) {
            this.f46285c = 0;
            int i11 = this.f46284b;
            this.f46284b = i11 + (k(i11 + 1) ? 2 : 1);
        }
        a();
    }

    public void m(int i10) {
        int i11 = this.f46284b;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f46284b = i13;
        int i14 = this.f46285c + (i10 - (i12 * 8));
        this.f46285c = i14;
        if (i14 > 7) {
            this.f46284b = i13 + 1;
            this.f46285c = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f46284b) {
                a();
                return;
            } else if (k(i11)) {
                this.f46284b++;
                i11 += 2;
            }
        }
    }
}
