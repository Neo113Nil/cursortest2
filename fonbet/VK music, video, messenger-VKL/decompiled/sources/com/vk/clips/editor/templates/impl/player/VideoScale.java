package com.vk.clips.editor.templates.impl.player;

import android.graphics.Matrix;
import com.vk.log.L;

/* loaded from: classes16.dex */
public final class VideoScale {
    public ScaleType a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public enum ScaleType {
        MATRIX(0),
        FIT_XY(1),
        FIT_START(2),
        FIT_CENTER(3),
        FIT_END(4),
        CENTER(5),
        CENTER_CROP(6),
        CENTER_INSIDE(7);

        final int nativeInt;

        ScaleType(int i) {
            this.nativeInt = i;
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ScaleType.values().length];
            a = iArr;
            try {
                iArr[ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ScaleType.MATRIX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ScaleType.CENTER_INSIDE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public final Matrix a() {
        float f;
        try {
            Matrix matrix = new Matrix();
            int i = this.d;
            int i2 = this.e;
            int i3 = this.b;
            float f2 = i;
            float f3 = i3 / f2;
            int i4 = this.c;
            float f4 = i2;
            float f5 = i4 / f4;
            float f6 = f2 - (i3 / f5);
            float f7 = f4 - (i4 / f3);
            float f8 = 1.0f;
            if (f3 > f5) {
                f = (1.0f / f3) * f5;
                f6 = 0.0f;
            } else {
                f8 = (1.0f / f5) * f3;
                f = 1.0f;
                f7 = 0.0f;
            }
            matrix.setScale(f8, f);
            matrix.postTranslate(f6 / 2.0f, f7 / 2.0f);
            b(matrix, i, i2);
            return matrix;
        } catch (NumberFormatException e) {
            L.g("error ", e);
            return null;
        }
    }

    public final void b(Matrix matrix, int i, int i2) {
        float f = i / 2;
        float f2 = i2 / 2;
        matrix.postRotate(this.f, f, f2);
        if (this.f % 180 == 90) {
            float f3 = i2 / i;
            matrix.postScale(1.0f / f3, f3, f, f2);
        }
    }
}
