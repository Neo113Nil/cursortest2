package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f38428a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38429b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38430c;
    private final b[] matrix;

    public a(int i10, int i11) {
        b[] bVarArr = new b[i10];
        this.matrix = bVarArr;
        int length = bVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.matrix[i12] = new b(((i11 + 4) * 17) + 1);
        }
        this.f38430c = i11 * 17;
        this.f38429b = i10;
        this.f38428a = -1;
    }

    public b a() {
        return this.matrix[this.f38428a];
    }

    public byte[][] b(int i10, int i11) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f38429b * i11, this.f38430c * i10);
        int i12 = this.f38429b * i11;
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[(i12 - i13) - 1] = this.matrix[i13 / i11].b(i10);
        }
        return bArr;
    }

    public void c() {
        this.f38428a++;
    }
}
