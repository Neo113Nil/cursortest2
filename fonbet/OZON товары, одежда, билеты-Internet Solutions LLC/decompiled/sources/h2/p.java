package h2;

import E0.C2942q;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* loaded from: classes8.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    protected AbstractC6784b f64712a;

    /* renamed from: e, reason: collision with root package name */
    protected int f64716e;

    /* renamed from: f, reason: collision with root package name */
    protected String f64717f;

    /* renamed from: b, reason: collision with root package name */
    protected int f64713b = 0;

    /* renamed from: c, reason: collision with root package name */
    protected int[] f64714c = new int[10];

    /* renamed from: d, reason: collision with root package name */
    protected float[][] f64715d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* renamed from: g, reason: collision with root package name */
    protected float[] f64718g = new float[3];

    /* renamed from: h, reason: collision with root package name */
    protected boolean f64719h = false;

    protected final float a(float f7) {
        float abs;
        switch (this.f64713b) {
            case 1:
                return Math.signum(f7 * 6.2831855f);
            case 2:
                abs = Math.abs(f7);
                break;
            case 3:
                return (((f7 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f7 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f7 * 6.2831855f);
            case 6:
                float abs2 = 1.0f - Math.abs(((f7 * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f7 * 6.2831855f);
        }
        return 1.0f - abs;
    }

    public void b(int i11, float f7, float f11, int i12, float f12) {
        int i13 = this.f64716e;
        this.f64714c[i13] = i11;
        float[] fArr = this.f64715d[i13];
        fArr[0] = f7;
        fArr[1] = f11;
        fArr[2] = f12;
        this.f64713b = Math.max(this.f64713b, i12);
        this.f64716e++;
    }

    public final void c(String str) {
        this.f64717f = str;
    }

    public void d(int i11) {
        int i12 = this.f64716e;
        if (i12 == 0) {
            System.err.println("Error no points added to " + this.f64717f);
            return;
        }
        int[] iArr = this.f64714c;
        float[][] fArr = this.f64715d;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i12 - 1;
        iArr2[1] = 0;
        int i13 = 2;
        while (i13 > 0) {
            int i14 = i13 - 1;
            int i15 = iArr2[i14];
            int i16 = i13 - 2;
            int i17 = iArr2[i16];
            if (i15 < i17) {
                int i18 = iArr[i17];
                int i19 = i15;
                int i21 = i19;
                while (i19 < i17) {
                    int i22 = iArr[i19];
                    if (i22 <= i18) {
                        int i23 = iArr[i21];
                        iArr[i21] = i22;
                        iArr[i19] = i23;
                        float[] fArr2 = fArr[i21];
                        fArr[i21] = fArr[i19];
                        fArr[i19] = fArr2;
                        i21++;
                    }
                    i19++;
                }
                int i24 = iArr[i21];
                iArr[i21] = iArr[i17];
                iArr[i17] = i24;
                float[] fArr3 = fArr[i21];
                fArr[i21] = fArr[i17];
                fArr[i17] = fArr3;
                iArr2[i16] = i21 - 1;
                iArr2[i14] = i15;
                int i25 = i13 + 1;
                iArr2[i13] = i17;
                i13 += 2;
                iArr2[i25] = i21 + 1;
            } else {
                i13 = i16;
            }
        }
        int i26 = 0;
        for (int i27 = 1; i27 < iArr.length; i27++) {
            if (iArr[i27] != iArr[i27 - 1]) {
                i26++;
            }
        }
        if (i26 == 0) {
            i26 = 1;
        }
        double[] dArr = new double[i26];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i26, 3);
        int i28 = 0;
        for (int i29 = 0; i29 < this.f64716e; i29++) {
            if (i29 <= 0 || iArr[i29] != iArr[i29 - 1]) {
                dArr[i28] = iArr[i29] * 0.01d;
                double[] dArr3 = dArr2[i28];
                float[] fArr4 = fArr[i29];
                dArr3[0] = fArr4[0];
                dArr3[1] = fArr4[1];
                dArr3[2] = fArr4[2];
                i28++;
            }
        }
        this.f64712a = AbstractC6784b.a(i11, dArr, dArr2);
    }

    public final String toString() {
        String str = this.f64717f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i11 = 0; i11 < this.f64716e; i11++) {
            StringBuilder e11 = C2942q.e(str, "[");
            e11.append(this.f64714c[i11]);
            e11.append(" , ");
            e11.append(decimalFormat.format(this.f64715d[i11]));
            e11.append("] ");
            str = e11.toString();
        }
        return str;
    }
}
