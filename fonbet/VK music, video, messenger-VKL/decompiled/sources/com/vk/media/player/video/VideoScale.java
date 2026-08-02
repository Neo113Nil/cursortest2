package com.vk.media.player.video;

import android.graphics.Matrix;
import android.view.TextureView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;

/* loaded from: classes3.dex */
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

    public VideoScale(ScaleType scaleType) {
        this.a = scaleType;
    }

    public final Matrix a() {
        Matrix matrix;
        float f;
        float f2;
        float f3;
        int i = a.a[this.a.ordinal()];
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f5 = 1.0f;
        try {
            switch (i) {
                case 1:
                    return b();
                case 2:
                    matrix = new Matrix();
                    int i2 = this.d;
                    int i3 = this.e;
                    float f6 = this.b;
                    float f7 = i2;
                    float f8 = f6 / f7;
                    float f9 = this.c;
                    float f10 = i3;
                    float f11 = f9 / f10;
                    float f12 = f7 - (f6 / f11);
                    float f13 = f10 - (f9 / f8);
                    if (f8 < f11) {
                        f3 = (1.0f / f8) * f11;
                    } else {
                        f3 = 1.0f;
                        f5 = (1.0f / f11) * f8;
                        f13 = 0.0f;
                        f4 = f12;
                    }
                    matrix.setScale(f5, f3);
                    matrix.postTranslate(f4 / 2.0f, f13 / 2.0f);
                    c(matrix, i2, i3);
                    break;
                case 3:
                    matrix = new Matrix();
                    matrix.setScale(this.b / this.d, this.c / this.e);
                    break;
                case 4:
                    matrix = new Matrix();
                    matrix.setScale(1.0f, 1.0f);
                    break;
                case 5:
                    try {
                        matrix = new Matrix();
                        int i4 = this.d;
                        float f14 = this.b / i4;
                        float f15 = this.c / this.e;
                        if (f14 > f15) {
                            f2 = (1.0f / f14) * f15;
                        } else {
                            f2 = 1.0f;
                            f5 = (1.0f / f15) * f14;
                        }
                        matrix.setScale(f5, f2);
                        matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        break;
                    } catch (NumberFormatException e) {
                        L.g("can't scale", e);
                        return null;
                    }
                case 6:
                    try {
                        matrix = new Matrix();
                        int i5 = this.d;
                        int i6 = this.e;
                        float f16 = this.b;
                        float f17 = i5;
                        float f18 = f16 / f17;
                        float f19 = this.c;
                        float f20 = i6;
                        float f21 = f19 / f20;
                        float f22 = f17 - (f16 / f21);
                        float f23 = f20 - (f19 / f18);
                        if (f18 > f21) {
                            f = (1.0f / f18) * f21;
                        } else {
                            f23 = 0.0f;
                            f4 = f22;
                            f = 1.0f;
                            f5 = (1.0f / f21) * f18;
                        }
                        matrix.setScale(f5, f);
                        matrix.postTranslate(f4, f23);
                        break;
                    } catch (NumberFormatException e2) {
                        L.g("error: ", e2);
                        return null;
                    }
                case 7:
                    matrix = new Matrix();
                    int i7 = this.d;
                    int i8 = this.e;
                    matrix.setScale(this.b / i7, this.c / i8);
                    matrix.postTranslate((i7 - r5) / 2.0f, (i8 - r7) / 2.0f);
                    break;
                case 8:
                    matrix = new Matrix();
                    int i9 = this.d;
                    int i10 = this.e;
                    float f24 = this.b / i9;
                    float f25 = this.c / i10;
                    if (f24 <= 1.0f && f25 <= 1.0f) {
                        matrix.setScale(f24, f25);
                        matrix.postTranslate((i9 - r6) / 2.0f, (i10 - r8) / 2.0f);
                        break;
                    }
                    return b();
                default:
                    return null;
            }
            return matrix;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final Matrix b() {
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
            c(matrix, i, i2);
            return matrix;
        } catch (NumberFormatException e) {
            L.C("error ", e);
            return null;
        }
    }

    public final void c(Matrix matrix, int i, int i2) {
        float f = i / 2;
        float f2 = i2 / 2;
        matrix.postRotate(this.f, f, f2);
        if (this.f % 180 == 90) {
            float f3 = i2 / i;
            matrix.postScale(1.0f / f3, f3, f, f2);
        }
    }

    public final void d(TextureView textureView, int i, int i2) {
        if (i2 * i == 0) {
            return;
        }
        this.c = i2;
        this.b = i;
        this.d = textureView.getWidth();
        this.e = textureView.getHeight();
        Matrix a2 = a();
        if (a2 != null) {
            textureView.setTransform(a2);
            textureView.postInvalidate();
        }
    }
}
