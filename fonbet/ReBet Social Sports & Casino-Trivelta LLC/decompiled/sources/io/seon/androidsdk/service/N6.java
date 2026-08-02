package io.seon.androidsdk.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class N6 {

    /* renamed from: a, reason: collision with root package name */
    public final float[][] f53080a;

    /* renamed from: b, reason: collision with root package name */
    public int f53081b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f53082c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f53083d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f53084e;

    /* renamed from: f, reason: collision with root package name */
    public final int f53085f;

    public N6(int i10, int i11) {
        this.f53085f = i11;
        this.f53084e = i10;
        this.f53080a = (float[][]) Array.newInstance((Class<?>) Float.TYPE, i10, i11);
    }

    public void a(float[] fArr) {
        int length = fArr.length;
        int i10 = this.f53085f;
        if (length < i10) {
            throw new IllegalArgumentException("Element size does not match buffer array size");
        }
        this.f53080a[this.f53082c] = Arrays.copyOf(fArr, i10);
        int i11 = this.f53082c + 1;
        int i12 = this.f53084e;
        this.f53082c = i11 % i12;
        int i13 = this.f53083d;
        if (i13 < i12) {
            this.f53083d = i13 + 1;
        } else {
            this.f53081b = (this.f53081b + 1) % i12;
        }
    }

    public final float[][] b() {
        return (float[][]) Arrays.copyOfRange(this.f53080a, 0, this.f53083d);
    }

    public final float[] c() {
        if (this.f53083d == 0) {
            return null;
        }
        int i10 = this.f53082c - 1;
        int i11 = this.f53084e;
        float[] fArr = this.f53080a[(i10 + i11) % i11];
        return Arrays.copyOf(fArr, fArr.length);
    }

    public final float[][] d() {
        int min = Math.min(this.f53083d, 20);
        float[][] fArr = new float[min][];
        for (int i10 = 0; i10 < min; i10++) {
            int i11 = this.f53084e;
            float[] fArr2 = this.f53080a[(((this.f53082c - 1) - i10) + i11) % i11];
            fArr[i10] = Arrays.copyOf(fArr2, fArr2.length);
        }
        return fArr;
    }

    public final String toString() {
        float[][] fArr = this.f53080a;
        ArrayList arrayList = new ArrayList();
        for (float[] fArr2 : fArr) {
            ArrayList arrayList2 = new ArrayList();
            for (float f10 : fArr2) {
                arrayList2.add(Float.valueOf(f10));
            }
            arrayList.add(arrayList2);
        }
        return arrayList.toString();
    }
}
