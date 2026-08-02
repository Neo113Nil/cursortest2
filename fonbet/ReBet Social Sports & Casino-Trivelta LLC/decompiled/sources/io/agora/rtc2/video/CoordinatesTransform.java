package io.agora.rtc2.video;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationManagerCompat;

/* loaded from: classes3.dex */
public class CoordinatesTransform {
    public static Rect calculateFocusArea(float f10, float f11, float f12) {
        int i10 = (int) ((f10 * 2000.0f) - 1000.0f);
        int i11 = (int) ((f11 * 2000.0f) - 1000.0f);
        int intValue = Float.valueOf(f12 * 300.0f).intValue() / 2;
        RectF rectF = new RectF(clamp(i10 - intValue, NotificationManagerCompat.IMPORTANCE_UNSPECIFIED, 1000), clamp(i11 - intValue, NotificationManagerCompat.IMPORTANCE_UNSPECIFIED, 1000), clamp(i10 + intValue, NotificationManagerCompat.IMPORTANCE_UNSPECIFIED, 1000), clamp(i11 + intValue, NotificationManagerCompat.IMPORTANCE_UNSPECIFIED, 1000));
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    public static Rect calculateMeteringArea(float f10, float f11, int i10, int i11, float f12) {
        int i12 = (int) ((f10 * i10) - (i10 / 2));
        int i13 = (int) ((f11 * i11) - (i11 / 2));
        int intValue = Float.valueOf(f12 * 300.0f).intValue() / 2;
        RectF rectF = new RectF(clamp(i12 - intValue, 0, i10), clamp(i13 - intValue, 0, i11), clamp(i12 + intValue, 0, i10), clamp(i13 + intValue, 0, i11));
        Rect rect = new Rect();
        rectF.round(rect);
        return (rect.width() == 0 || rect.height() == 0) ? new Rect(0, 0, 0, 0) : rect;
    }

    public static RectF cameraToNormalized(@NonNull RectF rectF) {
        if (rectF == null || rectF.left < -1000.0f || rectF.top < -1000.0f || rectF.right > 1000.0f || rectF.bottom > 1000.0f) {
            return null;
        }
        RectF rectF2 = new RectF(rectF);
        Matrix matrix = new Matrix();
        matrix.postScale(5.0E-4f, 5.0E-4f);
        matrix.postTranslate(0.5f, 0.5f);
        matrix.mapRect(rectF2);
        return rectF2;
    }

    public static float clamp(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static RectF normalizedFaceRect(Rect rect, int i10, boolean z10) {
        Matrix matrix = new Matrix();
        prepareMatrix(matrix, z10, i10);
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        return rectF;
    }

    public static RectF normalizedToCamera(@NonNull RectF rectF) {
        if (rectF == null || rectF.left < 0.0f || rectF.top < 0.0f || rectF.width() > 1.0f || rectF.height() > 1.0f) {
            return null;
        }
        RectF rectF2 = new RectF(rectF);
        Matrix matrix = new Matrix();
        matrix.postScale(2000.0f, 2000.0f);
        matrix.postTranslate(-1000.0f, -1000.0f);
        matrix.mapRect(rectF2);
        return rectF2;
    }

    public static RectF normalizedToSensor(@NonNull RectF rectF, int i10, int i11, int i12, int i13, int i14, boolean z10) {
        RectF rectF2 = null;
        if (rectF == null) {
            return null;
        }
        if (rectF.left >= 0.0f && rectF.top >= 0.0f && rectF.width() <= 1.0f && rectF.height() <= 1.0f) {
            rectF2 = new RectF(rectF);
            Matrix matrix = new Matrix();
            if (z10) {
                float f10 = i12;
                float f11 = f10 / i10;
                float f12 = i13;
                float f13 = f12 / i11;
                float f14 = f11 / f13;
                if (f14 > 1.0f) {
                    matrix.postTranslate((f14 - 1.0f) / 2.0f, 0.0f);
                    i12 = (int) ((f10 * f13) / f11);
                } else if (f14 < 1.0f) {
                    matrix.postTranslate(0.0f, ((f13 / f11) - 1.0f) / 2.0f);
                    i13 = (int) ((f12 * f11) / f13);
                }
                matrix.mapRect(rectF2);
            }
            matrix.setScale(i12, i13);
            matrix.mapRect(rectF2);
        }
        return rectF2;
    }

    public static RectF normalizedToView(@NonNull RectF rectF, int i10, int i11, int i12, int i13, boolean z10, int i14, int i15) {
        RectF rectF2 = null;
        if (rectF == null) {
            return null;
        }
        if (rectF.left >= 0.0f && rectF.top >= 0.0f && rectF.right <= 1.0f && rectF.bottom <= 1.0f && i14 % 90 == 0) {
            int i16 = i14 > 0 ? i14 % 360 : (i14 % 360) + 360;
            rectF2 = new RectF(rectF);
            Matrix matrix = new Matrix();
            if (z10) {
                float f10 = rectF2.left;
                rectF2.left = 1.0f - rectF2.right;
                rectF2.right = 1.0f - f10;
            }
            matrix.setRotate(-i16);
            if (i16 == 90) {
                matrix.postTranslate(0.0f, 1.0f);
            } else if (i16 == 180) {
                matrix.postTranslate(1.0f, 1.0f);
            } else if (i16 == 270) {
                matrix.postTranslate(1.0f, 0.0f);
            }
            float f11 = i10;
            float f12 = i11;
            matrix.postScale(f11, f12);
            matrix.mapRect(rectF2);
            float f13 = (i16 == 90 || i16 == 270) ? i13 : i12;
            float f14 = (i16 == 90 || i16 == 270) ? i12 : i13;
            float f15 = f11 / f13;
            float f16 = f12 / f14;
            if (i15 != 1) {
                if (i15 != 2) {
                    return rectF2;
                }
                if (f15 > f16) {
                    matrix.setScale(f16 / f15, 1.0f, i10 / 2, i11 / 2);
                    matrix.mapRect(rectF2);
                    rectF2.right = clamp(rectF2.right, 0.0f, f11);
                    rectF2.left = clamp(rectF2.left, 0.0f, f11);
                    return rectF2;
                }
                matrix.setScale(1.0f, f15 / f16, i10 / 2, i11 / 2);
                matrix.mapRect(rectF2);
                rectF2.top = clamp(rectF2.top, 0.0f, f12);
                rectF2.bottom = clamp(rectF2.bottom, 0.0f, f12);
                return rectF2;
            }
            if (f15 > f16) {
                matrix.setScale(1.0f, f15 / f16, i10 / 2, i11 / 2);
                matrix.mapRect(rectF2);
                rectF2.top = clamp(rectF2.top, 0.0f, f12);
                rectF2.bottom = clamp(rectF2.bottom, 0.0f, f12);
                return rectF2;
            }
            matrix.setScale(f16 / f15, 1.0f, i10 / 2, i11 / 2);
            matrix.mapRect(rectF2);
            rectF2.right = clamp(rectF2.right, 0.0f, f11);
            rectF2.left = clamp(rectF2.left, 0.0f, f11);
        }
        return rectF2;
    }

    private static void prepareMatrix(Matrix matrix, boolean z10, int i10) {
        matrix.setScale(z10 ? -1.0f : 1.0f, 1.0f);
        matrix.postRotate(i10);
        matrix.postScale(5.0E-4f, 5.0E-4f);
        matrix.postTranslate(0.5f, 0.5f);
    }

    public static RectF sensorToNormalized(@NonNull RectF rectF, int i10, int i11, int i12, int i13, boolean z10) {
        RectF rectF2 = null;
        if (rectF == null) {
            return null;
        }
        if (rectF.left >= 0.0f && rectF.top >= 0.0f) {
            float f10 = i10;
            if (rectF.width() <= f10) {
                float f11 = i11;
                if (rectF.height() <= f11) {
                    rectF2 = new RectF(rectF);
                    Matrix matrix = new Matrix();
                    if (z10) {
                        float f12 = f10 / i12;
                        float f13 = f11 / i13;
                        float f14 = f12 / f13;
                        if (f14 > 1.0f) {
                            matrix.postTranslate((((f13 / f12) - 1.0f) * f10) / 2.0f, 0.0f);
                            i10 = (int) ((f10 * f13) / f12);
                        } else if (f14 < 1.0f) {
                            matrix.postTranslate(0.0f, ((f14 - 1.0f) * f11) / 2.0f);
                            i11 = (int) ((f11 * f12) / f13);
                        }
                        matrix.mapRect(rectF2);
                    }
                    matrix.setScale(1.0f / i10, 1.0f / i11);
                    matrix.mapRect(rectF2);
                    rectF2.left = clamp(rectF2.left, 0.0f, 1.0f);
                    rectF2.right = clamp(rectF2.right, 0.0f, 1.0f);
                    rectF2.top = clamp(rectF2.top, 0.0f, 1.0f);
                    rectF2.bottom = clamp(rectF2.bottom, 0.0f, 1.0f);
                }
            }
        }
        return rectF2;
    }

    public static Rect sensorToNormalizedPreview(Rect rect, int i10, int i11, Rect rect2) {
        double d10;
        double d11;
        if (i10 > i11) {
            d10 = i10;
            d11 = i11;
        } else {
            d10 = i11;
            d11 = i10;
        }
        double d12 = d10 / d11;
        double width = rect2.width() / rect2.height();
        int width2 = rect2.width();
        int height = rect2.height();
        if (d12 > width) {
            height = (int) (width2 / d12);
        } else {
            width2 = (int) (height * d12);
        }
        int abs = Math.abs(width2 - rect2.width());
        int abs2 = Math.abs(height - rect2.height());
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.postTranslate((-rect2.left) - (abs / 2), (-rect2.top) - (abs2 / 2));
        matrix.postTranslate((-width2) / 2, (-height) / 2);
        matrix.postScale(2000.0f / width2, 2000.0f / height);
        matrix.mapRect(rectF);
        Rect rect3 = new Rect();
        rectF.round(rect3);
        return rect3;
    }

    public static RectF viewToNormalized(@NonNull RectF rectF, int i10, int i11, int i12, int i13, boolean z10, int i14, int i15) {
        RectF rectF2 = null;
        if (rectF == null) {
            return null;
        }
        if (i10 > 0 && i11 > 0 && rectF.left >= 0.0f && rectF.top >= 0.0f) {
            float f10 = i10;
            if (rectF.right <= f10) {
                float f11 = i11;
                if (rectF.bottom <= f11 && i14 % 90 == 0) {
                    int i16 = i14 > 0 ? i14 % 360 : (i14 % 360) + 360;
                    rectF2 = new RectF(rectF);
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i16);
                    float f12 = (i16 == 90 || i16 == 270) ? f11 : f10;
                    if (i16 != 90 && i16 != 270) {
                        f10 = f11;
                    }
                    float f13 = f12 / i12;
                    float f14 = f10 / i13;
                    matrix.postScale(1.0f / f12, 1.0f / f10);
                    if (i16 == 90) {
                        matrix.postTranslate(1.0f, 0.0f);
                    } else if (i16 == 180) {
                        matrix.postTranslate(1.0f, 1.0f);
                    } else if (i16 == 270) {
                        matrix.postTranslate(0.0f, 1.0f);
                    }
                    if (i15 != 1) {
                        if (i15 == 2) {
                            if (f13 > f14) {
                                matrix.postScale(f13 / f14, 1.0f, 0.5f, 0.0f);
                                matrix.mapRect(rectF2);
                                rectF2.right = clamp(rectF2.right, 0.0f, 1.0f);
                                rectF2.left = clamp(rectF2.left, 0.0f, 1.0f);
                            } else {
                                matrix.postScale(1.0f, f14 / f13);
                                matrix.mapRect(rectF2);
                                rectF2.top = clamp(rectF2.top, 0.0f, 1.0f);
                                rectF2.bottom = clamp(rectF2.bottom, 0.0f, 1.0f);
                            }
                        }
                    } else if (f13 > f14) {
                        matrix.postScale(1.0f, f14 / f13, 0.0f, 0.5f);
                        matrix.mapRect(rectF2);
                        rectF2.top = clamp(rectF2.top, 0.0f, 1.0f);
                        rectF2.bottom = clamp(rectF2.bottom, 0.0f, 1.0f);
                    } else {
                        matrix.postScale(f13 / f14, 1.0f, 0.5f, 0.0f);
                        matrix.mapRect(rectF2);
                        rectF2.right = clamp(rectF2.right, 0.0f, 1.0f);
                        rectF2.left = clamp(rectF2.left, 0.0f, 1.0f);
                    }
                    if (z10) {
                        float f15 = rectF2.left;
                        rectF2.left = 1.0f - rectF2.right;
                        rectF2.right = 1.0f - f15;
                    }
                }
            }
        }
        return rectF2;
    }

    public static int clamp(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i12, i10));
    }
}
