package h2;

import java.util.Arrays;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    float[] f64676a;

    /* renamed from: b, reason: collision with root package name */
    double[] f64677b;

    /* renamed from: c, reason: collision with root package name */
    double[] f64678c;

    /* renamed from: d, reason: collision with root package name */
    h f64679d;

    /* renamed from: e, reason: collision with root package name */
    int f64680e;

    public final void a(float f7, double d11) {
        int length = this.f64676a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f64677b, d11);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f64677b = Arrays.copyOf(this.f64677b, length);
        this.f64676a = Arrays.copyOf(this.f64676a, length);
        this.f64678c = new double[length];
        double[] dArr = this.f64677b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f64677b[binarySearch] = d11;
        this.f64676a[binarySearch] = f7;
    }

    public final String toString() {
        return "pos =" + Arrays.toString(this.f64677b) + " period=" + Arrays.toString(this.f64676a);
    }
}
