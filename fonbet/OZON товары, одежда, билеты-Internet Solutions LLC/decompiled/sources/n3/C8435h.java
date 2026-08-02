package n3;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* renamed from: n3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8435h {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f76454a;

    /* renamed from: b, reason: collision with root package name */
    private int f76455b;

    /* renamed from: c, reason: collision with root package name */
    private int f76456c;

    /* renamed from: d, reason: collision with root package name */
    private int f76457d;

    public C8435h(byte[] bArr, int i11, int i12) {
        i(i11, i12, bArr);
    }

    private void a() {
        int i11;
        int i12 = this.f76456c;
        G10.a.h(i12 >= 0 && (i12 < (i11 = this.f76455b) || (i12 == i11 && this.f76457d == 0)));
    }

    private boolean j(int i11) {
        if (2 > i11 || i11 >= this.f76455b) {
            return false;
        }
        byte[] bArr = this.f76454a;
        return bArr[i11] == 3 && bArr[i11 + (-2)] == 0 && bArr[i11 - 1] == 0;
    }

    public final void b() {
        int i11 = this.f76457d;
        if (i11 > 0) {
            l(8 - i11);
        }
    }

    public final boolean c(int i11) {
        int i12 = this.f76456c;
        int i13 = i11 / 8;
        int i14 = i12 + i13;
        int i15 = (this.f76457d + i11) - (i13 * 8);
        if (i15 > 7) {
            i14++;
            i15 -= 8;
        }
        while (true) {
            i12++;
            if (i12 > i14 || i14 >= this.f76455b) {
                break;
            }
            if (j(i12)) {
                i14++;
                i12 += 2;
            }
        }
        int i16 = this.f76455b;
        if (i14 >= i16) {
            return i14 == i16 && i15 == 0;
        }
        return true;
    }

    public final boolean d() {
        int i11 = this.f76456c;
        int i12 = this.f76457d;
        int i13 = 0;
        while (this.f76456c < this.f76455b && !e()) {
            i13++;
        }
        boolean z11 = this.f76456c == this.f76455b;
        this.f76456c = i11;
        this.f76457d = i12;
        return !z11 && c((i13 * 2) + 1);
    }

    public final boolean e() {
        boolean z11 = (this.f76454a[this.f76456c] & (UserVerificationMethods.USER_VERIFY_PATTERN >> this.f76457d)) != 0;
        k();
        return z11;
    }

    public final int f(int i11) {
        int i12;
        this.f76457d += i11;
        int i13 = 0;
        while (true) {
            i12 = this.f76457d;
            if (i12 <= 8) {
                break;
            }
            int i14 = i12 - 8;
            this.f76457d = i14;
            byte[] bArr = this.f76454a;
            int i15 = this.f76456c;
            i13 |= (bArr[i15] & 255) << i14;
            if (!j(i15 + 1)) {
                r3 = 1;
            }
            this.f76456c = i15 + r3;
        }
        byte[] bArr2 = this.f76454a;
        int i16 = this.f76456c;
        int i17 = ((-1) >>> (32 - i11)) & (i13 | ((bArr2[i16] & 255) >> (8 - i12)));
        if (i12 == 8) {
            this.f76457d = 0;
            this.f76456c = i16 + (j(i16 + 1) ? 2 : 1);
        }
        a();
        return i17;
    }

    public final int g() {
        int i11 = 0;
        while (!e()) {
            i11++;
        }
        int f7 = ((1 << i11) - 1) + (i11 > 0 ? f(i11) : 0);
        return ((f7 + 1) / 2) * (f7 % 2 == 0 ? -1 : 1);
    }

    public final int h() {
        int i11 = 0;
        while (!e()) {
            i11++;
        }
        return ((1 << i11) - 1) + (i11 > 0 ? f(i11) : 0);
    }

    public final void i(int i11, int i12, byte[] bArr) {
        this.f76454a = bArr;
        this.f76456c = i11;
        this.f76455b = i12;
        this.f76457d = 0;
        a();
    }

    public final void k() {
        int i11 = this.f76457d + 1;
        this.f76457d = i11;
        if (i11 == 8) {
            this.f76457d = 0;
            int i12 = this.f76456c;
            this.f76456c = i12 + (j(i12 + 1) ? 2 : 1);
        }
        a();
    }

    public final void l(int i11) {
        int i12 = this.f76456c;
        int i13 = i11 / 8;
        int i14 = i12 + i13;
        this.f76456c = i14;
        int i15 = (i11 - (i13 * 8)) + this.f76457d;
        this.f76457d = i15;
        if (i15 > 7) {
            this.f76456c = i14 + 1;
            this.f76457d = i15 - 8;
        }
        while (true) {
            i12++;
            if (i12 > this.f76456c) {
                a();
                return;
            } else if (j(i12)) {
                this.f76456c++;
                i12 += 2;
            }
        }
    }
}
