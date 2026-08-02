package o9;

/* renamed from: o9.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8661c {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f77806a;

    /* renamed from: b, reason: collision with root package name */
    private int f77807b;

    /* renamed from: c, reason: collision with root package name */
    private int f77808c;

    public C8661c(byte[] bArr) {
        this.f77806a = bArr;
    }

    public final int a() {
        return ((this.f77806a.length - this.f77807b) * 8) - this.f77808c;
    }

    public final int b() {
        return this.f77808c;
    }

    public final int c() {
        return this.f77807b;
    }

    public final int d(int i11) {
        if (i11 <= 0 || i11 > 32 || i11 > a()) {
            throw new IllegalArgumentException(String.valueOf(i11));
        }
        int i12 = this.f77808c;
        int i13 = 0;
        byte[] bArr = this.f77806a;
        if (i12 > 0) {
            int i14 = 8 - i12;
            int min = Math.min(i11, i14);
            int i15 = i14 - min;
            int i16 = this.f77807b;
            int i17 = (((255 >> (8 - min)) << i15) & bArr[i16]) >> i15;
            i11 -= min;
            int i18 = this.f77808c + min;
            this.f77808c = i18;
            if (i18 == 8) {
                this.f77808c = 0;
                this.f77807b = i16 + 1;
            }
            i13 = i17;
        }
        if (i11 > 0) {
            while (i11 >= 8) {
                int i19 = i13 << 8;
                int i21 = this.f77807b;
                int i22 = i19 | (bArr[i21] & 255);
                this.f77807b = i21 + 1;
                i11 -= 8;
                i13 = i22;
            }
            if (i11 > 0) {
                int i23 = 8 - i11;
                int i24 = ((bArr[this.f77807b] & ((255 >> i23) << i23)) >> i23) | (i13 << i11);
                this.f77808c += i11;
                return i24;
            }
        }
        return i13;
    }
}
