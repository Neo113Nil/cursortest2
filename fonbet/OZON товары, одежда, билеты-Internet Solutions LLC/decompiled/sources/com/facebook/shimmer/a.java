package com.facebook.shimmer;

import I0.C3173b;
import android.content.res.TypedArray;
import android.graphics.RectF;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    final float[] f57740a = new float[4];

    /* renamed from: b, reason: collision with root package name */
    final int[] f57741b = new int[4];

    /* renamed from: c, reason: collision with root package name */
    int f57742c;

    /* renamed from: d, reason: collision with root package name */
    int f57743d;

    /* renamed from: e, reason: collision with root package name */
    int f57744e;

    /* renamed from: f, reason: collision with root package name */
    int f57745f;

    /* renamed from: g, reason: collision with root package name */
    int f57746g;

    /* renamed from: h, reason: collision with root package name */
    int f57747h;

    /* renamed from: i, reason: collision with root package name */
    float f57748i;

    /* renamed from: j, reason: collision with root package name */
    float f57749j;

    /* renamed from: k, reason: collision with root package name */
    float f57750k;

    /* renamed from: l, reason: collision with root package name */
    float f57751l;

    /* renamed from: m, reason: collision with root package name */
    float f57752m;

    /* renamed from: n, reason: collision with root package name */
    boolean f57753n;

    /* renamed from: o, reason: collision with root package name */
    boolean f57754o;

    /* renamed from: p, reason: collision with root package name */
    boolean f57755p;

    /* renamed from: q, reason: collision with root package name */
    int f57756q;

    /* renamed from: r, reason: collision with root package name */
    int f57757r;

    /* renamed from: s, reason: collision with root package name */
    long f57758s;

    /* renamed from: t, reason: collision with root package name */
    long f57759t;

    /* renamed from: com.facebook.shimmer.a$a, reason: collision with other inner class name */
    public static class C0875a extends b<C0875a> {
        public C0875a() {
            this.f57760a.f57755p = true;
        }

        @Override // com.facebook.shimmer.a.b
        protected final C0875a c() {
            return this;
        }
    }

    public static abstract class b<T extends b<T>> {

        /* renamed from: a, reason: collision with root package name */
        final a f57760a = new a();

        public final a a() {
            a aVar = this.f57760a;
            int i11 = aVar.f57745f;
            int[] iArr = aVar.f57741b;
            if (i11 != 1) {
                int i12 = aVar.f57744e;
                iArr[0] = i12;
                int i13 = aVar.f57743d;
                iArr[1] = i13;
                iArr[2] = i13;
                iArr[3] = i12;
            } else {
                int i14 = aVar.f57743d;
                iArr[0] = i14;
                iArr[1] = i14;
                int i15 = aVar.f57744e;
                iArr[2] = i15;
                iArr[3] = i15;
            }
            float[] fArr = aVar.f57740a;
            if (i11 != 1) {
                fArr[0] = Math.max(((1.0f - aVar.f57750k) - aVar.f57751l) / 2.0f, 0.0f);
                fArr[1] = Math.max(((1.0f - aVar.f57750k) - 0.001f) / 2.0f, 0.0f);
                fArr[2] = Math.min(((aVar.f57750k + 1.0f) + 0.001f) / 2.0f, 1.0f);
                fArr[3] = Math.min(((aVar.f57750k + 1.0f) + aVar.f57751l) / 2.0f, 1.0f);
                return aVar;
            }
            fArr[0] = 0.0f;
            fArr[1] = Math.min(aVar.f57750k, 1.0f);
            fArr[2] = Math.min(aVar.f57750k + aVar.f57751l, 1.0f);
            fArr[3] = 1.0f;
            return aVar;
        }

        T b(TypedArray typedArray) {
            boolean hasValue = typedArray.hasValue(3);
            a aVar = this.f57760a;
            if (hasValue) {
                aVar.f57753n = typedArray.getBoolean(3, aVar.f57753n);
            }
            if (typedArray.hasValue(0)) {
                aVar.f57754o = typedArray.getBoolean(0, aVar.f57754o);
            }
            if (typedArray.hasValue(1)) {
                aVar.f57744e = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(1, 0.3f))) * 255.0f)) << 24) | (aVar.f57744e & 16777215);
            }
            if (typedArray.hasValue(11)) {
                aVar.f57743d = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(11, 1.0f))) * 255.0f)) << 24) | (aVar.f57743d & 16777215);
            }
            if (typedArray.hasValue(7)) {
                long j11 = typedArray.getInt(7, (int) aVar.f57758s);
                if (j11 < 0) {
                    throw new IllegalArgumentException(C3173b.b(j11, "Given a negative duration: "));
                }
                aVar.f57758s = j11;
            }
            if (typedArray.hasValue(14)) {
                aVar.f57756q = typedArray.getInt(14, aVar.f57756q);
            }
            if (typedArray.hasValue(15)) {
                long j12 = typedArray.getInt(15, (int) aVar.f57759t);
                if (j12 < 0) {
                    throw new IllegalArgumentException(C3173b.b(j12, "Given a negative repeat delay: "));
                }
                aVar.f57759t = j12;
            }
            if (typedArray.hasValue(16)) {
                aVar.f57757r = typedArray.getInt(16, aVar.f57757r);
            }
            if (typedArray.hasValue(5)) {
                int i11 = typedArray.getInt(5, aVar.f57742c);
                if (i11 == 1) {
                    aVar.f57742c = 1;
                } else if (i11 == 2) {
                    aVar.f57742c = 2;
                } else if (i11 != 3) {
                    aVar.f57742c = 0;
                } else {
                    aVar.f57742c = 3;
                }
            }
            if (typedArray.hasValue(17)) {
                if (typedArray.getInt(17, aVar.f57745f) != 1) {
                    aVar.f57745f = 0;
                } else {
                    aVar.f57745f = 1;
                }
            }
            if (typedArray.hasValue(6)) {
                float f7 = typedArray.getFloat(6, aVar.f57751l);
                if (f7 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid dropoff value: " + f7);
                }
                aVar.f57751l = f7;
            }
            if (typedArray.hasValue(9)) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(9, aVar.f57746g);
                if (dimensionPixelSize < 0) {
                    throw new IllegalArgumentException(Ej.b.a(dimensionPixelSize, "Given invalid width: "));
                }
                aVar.f57746g = dimensionPixelSize;
            }
            if (typedArray.hasValue(8)) {
                int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, aVar.f57747h);
                if (dimensionPixelSize2 < 0) {
                    throw new IllegalArgumentException(Ej.b.a(dimensionPixelSize2, "Given invalid height: "));
                }
                aVar.f57747h = dimensionPixelSize2;
            }
            if (typedArray.hasValue(13)) {
                float f11 = typedArray.getFloat(13, aVar.f57750k);
                if (f11 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid intensity value: " + f11);
                }
                aVar.f57750k = f11;
            }
            if (typedArray.hasValue(20)) {
                float f12 = typedArray.getFloat(20, aVar.f57748i);
                if (f12 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid width ratio: " + f12);
                }
                aVar.f57748i = f12;
            }
            if (typedArray.hasValue(10)) {
                float f13 = typedArray.getFloat(10, aVar.f57749j);
                if (f13 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid height ratio: " + f13);
                }
                aVar.f57749j = f13;
            }
            if (typedArray.hasValue(19)) {
                aVar.f57752m = typedArray.getFloat(19, aVar.f57752m);
            }
            return c();
        }

        protected abstract T c();
    }

    public static class c extends b<c> {
        @Override // com.facebook.shimmer.a.b
        final c b(TypedArray typedArray) {
            super.b(typedArray);
            boolean hasValue = typedArray.hasValue(2);
            a aVar = this.f57760a;
            if (hasValue) {
                aVar.f57744e = (typedArray.getColor(2, aVar.f57744e) & 16777215) | (aVar.f57744e & (-16777216));
            }
            if (typedArray.hasValue(12)) {
                aVar.f57743d = typedArray.getColor(12, aVar.f57743d);
            }
            return this;
        }

        @Override // com.facebook.shimmer.a.b
        protected final c c() {
            return this;
        }
    }

    a() {
        new RectF();
        this.f57742c = 0;
        this.f57743d = -1;
        this.f57744e = 1291845631;
        this.f57745f = 0;
        this.f57746g = 0;
        this.f57747h = 0;
        this.f57748i = 1.0f;
        this.f57749j = 1.0f;
        this.f57750k = 0.0f;
        this.f57751l = 0.5f;
        this.f57752m = 20.0f;
        this.f57753n = true;
        this.f57754o = true;
        this.f57755p = true;
        this.f57756q = -1;
        this.f57757r = 1;
        this.f57758s = 1000L;
    }
}
