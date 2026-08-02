package h2;

import java.util.Arrays;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    int[] f64720a = new int[10];

    /* renamed from: b, reason: collision with root package name */
    int[] f64721b = new int[10];

    /* renamed from: c, reason: collision with root package name */
    int f64722c = 0;

    /* renamed from: d, reason: collision with root package name */
    int[] f64723d = new int[10];

    /* renamed from: e, reason: collision with root package name */
    float[] f64724e = new float[10];

    /* renamed from: f, reason: collision with root package name */
    int f64725f = 0;

    /* renamed from: g, reason: collision with root package name */
    int[] f64726g = new int[5];

    /* renamed from: h, reason: collision with root package name */
    String[] f64727h = new String[5];

    /* renamed from: i, reason: collision with root package name */
    int f64728i = 0;

    public final void a(float f7, int i11) {
        int i12 = this.f64725f;
        int[] iArr = this.f64723d;
        if (i12 >= iArr.length) {
            this.f64723d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f64724e;
            this.f64724e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f64723d;
        int i13 = this.f64725f;
        iArr2[i13] = i11;
        float[] fArr2 = this.f64724e;
        this.f64725f = i13 + 1;
        fArr2[i13] = f7;
    }

    public final void b(int i11, int i12) {
        int i13 = this.f64722c;
        int[] iArr = this.f64720a;
        if (i13 >= iArr.length) {
            this.f64720a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f64721b;
            this.f64721b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f64720a;
        int i14 = this.f64722c;
        iArr3[i14] = i11;
        int[] iArr4 = this.f64721b;
        this.f64722c = i14 + 1;
        iArr4[i14] = i12;
    }

    public final void c(int i11, String str) {
        int i12 = this.f64728i;
        int[] iArr = this.f64726g;
        if (i12 >= iArr.length) {
            this.f64726g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f64727h;
            this.f64727h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f64726g;
        int i13 = this.f64728i;
        iArr2[i13] = i11;
        String[] strArr2 = this.f64727h;
        this.f64728i = i13 + 1;
        strArr2[i13] = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TypedBundle{mCountInt=");
        sb2.append(this.f64722c);
        sb2.append(", mCountFloat=");
        sb2.append(this.f64725f);
        sb2.append(", mCountString=");
        return K00.b.e(this.f64728i, ", mCountBoolean=0}", sb2);
    }
}
