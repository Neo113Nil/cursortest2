package com.google.zxing.qrcode.encoder;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[][] f38447a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38448b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38449c;

    public b(int i10, int i11) {
        this.f38447a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
        this.f38448b = i10;
        this.f38449c = i11;
    }

    public void a(byte b10) {
        for (byte[] bArr : this.f38447a) {
            Arrays.fill(bArr, b10);
        }
    }

    public byte b(int i10, int i11) {
        return this.f38447a[i11][i10];
    }

    public byte[][] c() {
        return this.f38447a;
    }

    public int d() {
        return this.f38449c;
    }

    public int e() {
        return this.f38448b;
    }

    public void f(int i10, int i11, int i12) {
        this.f38447a[i11][i10] = (byte) i12;
    }

    public void g(int i10, int i11, boolean z10) {
        this.f38447a[i11][i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.f38448b * 2 * this.f38449c) + 2);
        for (int i10 = 0; i10 < this.f38449c; i10++) {
            byte[] bArr = this.f38447a[i10];
            for (int i11 = 0; i11 < this.f38448b; i11++) {
                byte b10 = bArr[i11];
                if (b10 == 0) {
                    sb2.append(" 0");
                } else if (b10 != 1) {
                    sb2.append("  ");
                } else {
                    sb2.append(" 1");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
