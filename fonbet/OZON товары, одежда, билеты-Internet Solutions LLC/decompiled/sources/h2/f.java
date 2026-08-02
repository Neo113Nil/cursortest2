package h2;

import E0.C2942q;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes8.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private a f64650a;

    /* renamed from: b, reason: collision with root package name */
    private String f64651b;

    /* renamed from: c, reason: collision with root package name */
    private int f64652c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f64653d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f64654e = 0;

    /* renamed from: f, reason: collision with root package name */
    ArrayList<b> f64655f = new ArrayList<>();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        i f64656a;

        /* renamed from: b, reason: collision with root package name */
        float[] f64657b;

        /* renamed from: c, reason: collision with root package name */
        double[] f64658c;

        /* renamed from: d, reason: collision with root package name */
        float[] f64659d;

        /* renamed from: e, reason: collision with root package name */
        float[] f64660e;

        /* renamed from: f, reason: collision with root package name */
        float[] f64661f;

        /* renamed from: g, reason: collision with root package name */
        AbstractC6784b f64662g;

        /* renamed from: h, reason: collision with root package name */
        double[] f64663h;
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        int f64664a;

        /* renamed from: b, reason: collision with root package name */
        float f64665b;

        /* renamed from: c, reason: collision with root package name */
        float f64666c;

        /* renamed from: d, reason: collision with root package name */
        float f64667d;

        /* renamed from: e, reason: collision with root package name */
        float f64668e;

        b(float f7, float f11, float f12, float f13, int i11) {
            this.f64664a = i11;
            this.f64665b = f13;
            this.f64666c = f11;
            this.f64667d = f7;
            this.f64668e = f12;
        }
    }

    public final float a(float f7) {
        char c11;
        double d11;
        double signum;
        double abs;
        a aVar = this.f64650a;
        AbstractC6784b abstractC6784b = aVar.f64662g;
        if (abstractC6784b != null) {
            abstractC6784b.c(f7, aVar.f64663h);
        } else {
            double[] dArr = aVar.f64663h;
            dArr[0] = aVar.f64660e[0];
            dArr[1] = aVar.f64661f[0];
            dArr[2] = aVar.f64657b[0];
        }
        double[] dArr2 = aVar.f64663h;
        double d12 = dArr2[0];
        double d13 = dArr2[1];
        double d14 = f7;
        i iVar = aVar.f64656a;
        iVar.getClass();
        double d15 = 0.0d;
        if (d14 <= 0.0d) {
            c11 = 2;
            d11 = d12;
        } else if (d14 >= 1.0d) {
            c11 = 2;
            d11 = d12;
            d15 = 1.0d;
        } else {
            int binarySearch = Arrays.binarySearch(iVar.f64677b, d14);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            float[] fArr = iVar.f64676a;
            float f11 = fArr[binarySearch];
            int i11 = binarySearch - 1;
            float f12 = fArr[i11];
            c11 = 2;
            d11 = d12;
            double[] dArr3 = iVar.f64677b;
            double d16 = dArr3[binarySearch];
            double d17 = dArr3[i11];
            double d18 = (f11 - f12) / (d16 - d17);
            d15 = ((((d14 * d14) - (d17 * d17)) * d18) / 2.0d) + ((d14 - d17) * (f12 - (d18 * d17))) + iVar.f64678c[i11];
        }
        double d19 = d15 + d13;
        switch (iVar.f64680e) {
            case 1:
                signum = Math.signum(0.5d - (d19 % 1.0d));
                break;
            case 2:
                abs = Math.abs((((d19 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                signum = 1.0d - abs;
                break;
            case 3:
                signum = (((d19 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
                break;
            case 4:
                signum = 1.0d - (((d19 * 2.0d) + 1.0d) % 2.0d);
                break;
            case 5:
                signum = Math.cos((d13 + d19) * 6.283185307179586d);
                break;
            case 6:
                double abs2 = 1.0d - Math.abs(((d19 * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                signum = 1.0d - abs;
                break;
            case 7:
                signum = iVar.f64679d.b(d19 % 1.0d);
                break;
            default:
                signum = Math.sin(6.283185307179586d * d19);
                break;
        }
        return (float) ((signum * aVar.f64663h[c11]) + d11);
    }

    protected void b(androidx.constraintlayout.widget.a aVar) {
    }

    public final void c(int i11, int i12, String str, int i13, float f7, float f11, float f12, float f13) {
        this.f64655f.add(new b(f7, f11, f12, f13, i11));
        if (i13 != -1) {
            this.f64654e = i13;
        }
        this.f64652c = i12;
        this.f64653d = str;
    }

    public final void d(int i11, int i12, String str, int i13, float f7, float f11, float f12, float f13, androidx.constraintlayout.widget.a aVar) {
        this.f64655f.add(new b(f7, f11, f12, f13, i11));
        if (i13 != -1) {
            this.f64654e = i13;
        }
        this.f64652c = i12;
        b(aVar);
        this.f64653d = str;
    }

    public final void e(String str) {
        this.f64651b = str;
    }

    public final void f() {
        int i11;
        int i12;
        int i13;
        int i14;
        double d11;
        int i15;
        ArrayList<b> arrayList = this.f64655f;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new e());
        double[] dArr = new double[size];
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 3);
        int i16 = this.f64652c;
        String str = this.f64653d;
        a aVar = new a();
        i iVar = new i();
        iVar.f64676a = new float[0];
        iVar.f64677b = new double[0];
        aVar.f64656a = iVar;
        iVar.f64680e = i16;
        if (str != null) {
            double[] dArr3 = new double[str.length() / 2];
            i13 = 3;
            int indexOf = str.indexOf(40) + 1;
            i14 = 0;
            i12 = 1;
            int indexOf2 = str.indexOf(44, indexOf);
            int i17 = 0;
            d11 = 1.0d;
            while (indexOf2 != -1) {
                dArr3[i17] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
                indexOf = indexOf2 + 1;
                indexOf2 = str.indexOf(44, indexOf);
                i17++;
            }
            dArr3[i17] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
            double[] copyOf = Arrays.copyOf(dArr3, i17 + 1);
            int length = (copyOf.length * 3) - 2;
            int length2 = copyOf.length - 1;
            double d12 = 1.0d / length2;
            double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, 1);
            double[] dArr5 = new double[length];
            i11 = 2;
            int i18 = 0;
            while (i18 < copyOf.length) {
                double d13 = copyOf[i18];
                int i19 = i18 + length2;
                dArr4[i19][0] = d13;
                double d14 = d12;
                double d15 = i18 * d14;
                dArr5[i19] = d15;
                if (i18 > 0) {
                    int i21 = (length2 * 2) + i18;
                    dArr4[i21][0] = d13 + 1.0d;
                    dArr5[i21] = d15 + 1.0d;
                    int i22 = i18 - 1;
                    dArr4[i22][0] = (d13 - 1.0d) - d14;
                    dArr5[i22] = (d15 - 1.0d) - d14;
                }
                i18++;
                d12 = d14;
            }
            iVar.f64679d = new h(dArr5, dArr4);
        } else {
            i11 = 2;
            i12 = 1;
            i13 = 3;
            i14 = 0;
            d11 = 1.0d;
        }
        aVar.f64657b = new float[size];
        aVar.f64658c = new double[size];
        aVar.f64659d = new float[size];
        aVar.f64660e = new float[size];
        aVar.f64661f = new float[size];
        float[] fArr = new float[size];
        this.f64650a = aVar;
        Iterator<b> it = arrayList.iterator();
        int i23 = i14;
        while (it.hasNext()) {
            b next = it.next();
            float f7 = next.f64667d;
            dArr[i23] = f7 * 0.01d;
            double[] dArr6 = dArr2[i23];
            float f11 = next.f64665b;
            dArr6[i14] = f11;
            float f12 = next.f64666c;
            dArr6[i12] = f12;
            float f13 = next.f64668e;
            dArr6[i11] = f13;
            a aVar2 = this.f64650a;
            aVar2.f64658c[i23] = next.f64664a / 100.0d;
            aVar2.f64659d[i23] = f7;
            aVar2.f64660e[i23] = f12;
            aVar2.f64661f[i23] = f13;
            aVar2.f64657b[i23] = f11;
            i23++;
        }
        a aVar3 = this.f64650a;
        double[] dArr7 = aVar3.f64658c;
        int length3 = dArr7.length;
        int i24 = i11;
        int[] iArr = new int[i24];
        iArr[i12] = i13;
        iArr[i14] = length3;
        double[][] dArr8 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
        float[] fArr2 = aVar3.f64657b;
        aVar3.f64663h = new double[fArr2.length + i24];
        double[] dArr9 = new double[fArr2.length + i24];
        double d16 = dArr7[i14];
        double d17 = 0.0d;
        float[] fArr3 = aVar3.f64659d;
        i iVar2 = aVar3.f64656a;
        if (d16 > 0.0d) {
            iVar2.a(fArr3[i14], 0.0d);
        }
        int length4 = dArr7.length - 1;
        if (dArr7[length4] < d11) {
            iVar2.a(fArr3[length4], d11);
        }
        for (int i25 = i14; i25 < dArr8.length; i25++) {
            double[] dArr10 = dArr8[i25];
            dArr10[i14] = aVar3.f64660e[i25];
            dArr10[i12] = aVar3.f64661f[i25];
            dArr10[2] = fArr2[i25];
            iVar2.a(fArr3[i25], dArr7[i25]);
        }
        double d18 = 0.0d;
        int i26 = i14;
        while (true) {
            if (i26 >= iVar2.f64676a.length) {
                break;
            }
            d18 += r12[i26];
            i26++;
        }
        double d19 = 0.0d;
        int i27 = i12;
        while (true) {
            float[] fArr4 = iVar2.f64676a;
            if (i27 >= fArr4.length) {
                break;
            }
            int i28 = i27 - 1;
            float f14 = (fArr4[i28] + fArr4[i27]) / 2.0f;
            double d21 = d17;
            double[] dArr11 = iVar2.f64677b;
            d19 = ((dArr11[i27] - dArr11[i28]) * f14) + d19;
            i27++;
            d17 = d21;
        }
        double d22 = d17;
        int i29 = i14;
        while (true) {
            float[] fArr5 = iVar2.f64676a;
            if (i29 >= fArr5.length) {
                break;
            }
            fArr5[i29] = fArr5[i29] * ((float) (d18 / d19));
            i29++;
        }
        iVar2.f64678c[i14] = d22;
        int i31 = i12;
        while (true) {
            float[] fArr6 = iVar2.f64676a;
            if (i31 >= fArr6.length) {
                break;
            }
            int i32 = i31 - 1;
            float f15 = (fArr6[i32] + fArr6[i31]) / 2.0f;
            double[] dArr12 = iVar2.f64677b;
            double d23 = dArr12[i31] - dArr12[i32];
            double[] dArr13 = iVar2.f64678c;
            double d24 = dArr13[i32];
            int i33 = i31;
            dArr13[i33] = (d23 * f15) + d24;
            i31 = i33 + 1;
        }
        if (dArr7.length > i12) {
            i15 = i14;
            aVar3.f64662g = AbstractC6784b.a(i15, dArr7, dArr8);
        } else {
            i15 = i14;
            aVar3.f64662g = null;
        }
        AbstractC6784b.a(i15, dArr, dArr2);
    }

    public final String toString() {
        String str = this.f64651b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<b> it = this.f64655f.iterator();
        while (it.hasNext()) {
            b next = it.next();
            StringBuilder e11 = C2942q.e(str, "[");
            e11.append(next.f64664a);
            e11.append(" , ");
            e11.append(decimalFormat.format(next.f64665b));
            e11.append("] ");
            str = e11.toString();
        }
        return str;
    }
}
