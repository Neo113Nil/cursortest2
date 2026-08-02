package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzet {
    public byte[] a;
    public int b;
    public int c;
    public int d;

    public zzet(byte[] bArr, int i) {
        this.a = bArr;
        this.d = i;
    }

    public final void a(zzeu zzeuVar) {
        byte[] bArr = zzeuVar.a;
        int i = zzeuVar.c;
        this.a = bArr;
        this.b = 0;
        this.c = 0;
        this.d = i;
        d(zzeuVar.b * 8);
    }

    public final int b() {
        return ((this.d - this.b) * 8) - this.c;
    }

    public final int c() {
        zzguk.f(this.c == 0);
        return this.b;
    }

    public final void d(int i) {
        int i2 = i / 8;
        this.b = i2;
        this.c = i - (i2 * 8);
        m();
    }

    public final void e() {
        int i = this.c + 1;
        this.c = i;
        if (i == 8) {
            this.c = 0;
            this.b++;
        }
        m();
    }

    public final void f(int i) {
        int i2 = i / 8;
        int i3 = this.b + i2;
        this.b = i3;
        int i4 = (i - (i2 * 8)) + this.c;
        this.c = i4;
        if (i4 > 7) {
            this.b = i3 + 1;
            this.c = i4 - 8;
        }
        m();
    }

    public final boolean g() {
        int i = this.a[this.b] & (128 >> this.c);
        e();
        return i != 0;
    }

    public final int h(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.c += i;
        int i3 = 0;
        while (true) {
            i2 = this.c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.c = i4;
            byte[] bArr = this.a;
            int i5 = this.b;
            this.b = i5 + 1;
            i3 |= (bArr[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i4;
        }
        byte[] bArr2 = this.a;
        int i6 = this.b;
        int i7 = i3 | ((bArr2[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i2));
        int i8 = 32 - i;
        if (i2 == 8) {
            this.c = 0;
            this.b = i6 + 1;
        }
        int i9 = ((-1) >>> i8) & i7;
        m();
        return i9;
    }

    public final long i(int i) {
        if (i <= 32) {
            int h = h(i);
            String str = zzfm.a;
            return h & 4294967295L;
        }
        int h2 = h(i - 32);
        int h3 = h(32);
        String str2 = zzfm.a;
        return ((h2 & 4294967295L) << 32) | (4294967295L & h3);
    }

    public final void j(int i, byte[] bArr) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = i >> 3;
            if (i3 >= i2) {
                break;
            }
            byte[] bArr2 = this.a;
            int i4 = this.b;
            int i5 = i4 + 1;
            this.b = i5;
            byte b = bArr2[i4];
            int i6 = this.c;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((bArr2[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i6)) | b2);
            i3++;
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.c;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.a;
            int i9 = this.b;
            this.b = i9 + 1;
            b3 = (byte) (b3 | ((bArr3[i9] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i8));
            bArr[i2] = b3;
            i8 -= 8;
        }
        int i10 = i8 + i7;
        this.c = i10;
        byte[] bArr4 = this.a;
        int i11 = this.b;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | b3);
        if (i10 == 8) {
            this.c = 0;
            this.b = i11 + 1;
        }
        m();
    }

    public final void k() {
        if (this.c == 0) {
            return;
        }
        this.c = 0;
        this.b++;
        m();
    }

    public final void l(int i) {
        zzguk.f(this.c == 0);
        this.b += i;
        m();
    }

    public final void m() {
        int i;
        int i2 = this.b;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.d) || (i2 == i && this.c == 0))) {
            z = true;
        }
        zzguk.f(z);
    }

    public zzet() {
        this.a = zzfm.b;
    }
}
