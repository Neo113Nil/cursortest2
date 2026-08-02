package com.google.android.material.carousel;

import s0.AbstractC6307a;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f35097a;

    /* renamed from: b, reason: collision with root package name */
    public float f35098b;

    /* renamed from: c, reason: collision with root package name */
    public int f35099c;

    /* renamed from: d, reason: collision with root package name */
    public int f35100d;

    /* renamed from: e, reason: collision with root package name */
    public float f35101e;

    /* renamed from: f, reason: collision with root package name */
    public float f35102f;

    /* renamed from: g, reason: collision with root package name */
    public final int f35103g;

    /* renamed from: h, reason: collision with root package name */
    public final float f35104h;

    public a(int i10, float f10, float f11, float f12, int i11, float f13, int i12, float f14, int i13, float f15) {
        this.f35097a = i10;
        this.f35098b = AbstractC6307a.a(f10, f11, f12);
        this.f35099c = i11;
        this.f35101e = f13;
        this.f35100d = i12;
        this.f35102f = f14;
        this.f35103g = i13;
        d(f15, f11, f12, f14);
        this.f35104h = b(f14);
    }

    public static a c(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        a aVar = null;
        int i10 = 1;
        for (int i11 : iArr3) {
            int length = iArr2.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr2[i12];
                int length2 = iArr.length;
                int i14 = 0;
                while (i14 < length2) {
                    int i15 = length;
                    int i16 = i12;
                    int i17 = i10;
                    int i18 = length2;
                    int i19 = i14;
                    a aVar2 = new a(i17, f11, f12, f13, iArr[i14], f14, i13, f15, i11, f10);
                    if (aVar == null || aVar2.f35104h < aVar.f35104h) {
                        if (aVar2.f35104h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    int i20 = i17 + 1;
                    i14 = i19 + 1;
                    i12 = i16;
                    i10 = i20;
                    length = i15;
                    length2 = i18;
                }
                i12++;
                i10 = i10;
                length = length;
            }
        }
        return aVar;
    }

    public final float a(float f10, int i10, float f11, int i11, int i12) {
        if (i10 <= 0) {
            f11 = 0.0f;
        }
        float f12 = i11 / 2.0f;
        return (f10 - ((i10 + f12) * f11)) / (i12 + f12);
    }

    public final float b(float f10) {
        if (g()) {
            return Math.abs(f10 - this.f35102f) * this.f35097a;
        }
        return Float.MAX_VALUE;
    }

    public final void d(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f();
        int i10 = this.f35099c;
        if (i10 > 0 && f14 > 0.0f) {
            float f15 = this.f35098b;
            this.f35098b = f15 + Math.min(f14 / i10, f12 - f15);
        } else if (i10 > 0 && f14 < 0.0f) {
            float f16 = this.f35098b;
            this.f35098b = f16 + Math.max(f14 / i10, f11 - f16);
        }
        int i11 = this.f35099c;
        float f17 = i11 > 0 ? this.f35098b : 0.0f;
        this.f35098b = f17;
        float a10 = a(f10, i11, f17, this.f35100d, this.f35103g);
        this.f35102f = a10;
        float f18 = (this.f35098b + a10) / 2.0f;
        this.f35101e = f18;
        int i12 = this.f35100d;
        if (i12 <= 0 || a10 == f13) {
            return;
        }
        float f19 = (f13 - a10) * this.f35103g;
        float min = Math.min(Math.abs(f19), f18 * 0.1f * i12);
        if (f19 > 0.0f) {
            this.f35101e -= min / this.f35100d;
            this.f35102f += min / this.f35103g;
        } else {
            this.f35101e += min / this.f35100d;
            this.f35102f -= min / this.f35103g;
        }
    }

    public int e() {
        return this.f35099c + this.f35100d + this.f35103g;
    }

    public final float f() {
        return (this.f35102f * this.f35103g) + (this.f35101e * this.f35100d) + (this.f35098b * this.f35099c);
    }

    public final boolean g() {
        int i10 = this.f35103g;
        if (i10 <= 0 || this.f35099c <= 0 || this.f35100d <= 0) {
            return i10 <= 0 || this.f35099c <= 0 || this.f35102f > this.f35098b;
        }
        float f10 = this.f35102f;
        float f11 = this.f35101e;
        return f10 > f11 && f11 > this.f35098b;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f35097a + ", smallCount=" + this.f35099c + ", smallSize=" + this.f35098b + ", mediumCount=" + this.f35100d + ", mediumSize=" + this.f35101e + ", largeCount=" + this.f35103g + ", largeSize=" + this.f35102f + ", cost=" + this.f35104h + "]";
    }
}
