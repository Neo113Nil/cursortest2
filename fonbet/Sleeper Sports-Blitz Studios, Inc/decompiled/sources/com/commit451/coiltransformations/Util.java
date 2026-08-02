package com.commit451.coiltransformations;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Util.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/commit451/coiltransformations/Util;", "", "()V", "DEFAULT_PAINT", "Landroid/graphics/Paint;", "safeConfig", "Landroid/graphics/Bitmap$Config;", "Landroid/graphics/Bitmap;", "getSafeConfig$transformations_release", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap$Config;", "applyMatrix", "", "inBitmap", "targetBitmap", "matrix", "Landroid/graphics/Matrix;", "centerCrop", "width", "", "height", "clear", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "outBitmap", "transformations_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Util {
    public static final Util INSTANCE = new Util();
    private static final Paint DEFAULT_PAINT = new Paint(6);

    private Util() {
    }

    public final Bitmap.Config getSafeConfig$transformations_release(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Bitmap.Config config = bitmap.getConfig();
        return config == null ? Bitmap.Config.ARGB_8888 : config;
    }

    public final Bitmap centerCrop(Bitmap inBitmap, int width, int height) {
        float width2;
        float height2;
        Intrinsics.checkNotNullParameter(inBitmap, "inBitmap");
        if (inBitmap.getWidth() == width && inBitmap.getHeight() == height) {
            return inBitmap;
        }
        Matrix matrix = new Matrix();
        float f = 0.0f;
        if (inBitmap.getWidth() * height > inBitmap.getHeight() * width) {
            width2 = height / inBitmap.getHeight();
            f = (width - (inBitmap.getWidth() * width2)) * 0.5f;
            height2 = 0.0f;
        } else {
            width2 = width / inBitmap.getWidth();
            height2 = (height - (inBitmap.getHeight() * width2)) * 0.5f;
        }
        matrix.setScale(width2, width2);
        matrix.postTranslate((int) (f + 0.5f), (int) (height2 + 0.5f));
        Bitmap createBitmap = Bitmap.createBitmap(width, height, getSafeConfig$transformations_release(inBitmap));
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(width, height, config)");
        setAlpha(inBitmap, createBitmap);
        applyMatrix(inBitmap, createBitmap, matrix);
        return createBitmap;
    }

    private final void setAlpha(Bitmap inBitmap, Bitmap outBitmap) {
        outBitmap.setHasAlpha(inBitmap.hasAlpha());
    }

    private final void applyMatrix(Bitmap inBitmap, Bitmap targetBitmap, Matrix matrix) {
        Canvas canvas = new Canvas(targetBitmap);
        canvas.drawBitmap(inBitmap, matrix, DEFAULT_PAINT);
        clear(canvas);
    }

    private final void clear(Canvas canvas) {
        canvas.setBitmap(null);
    }
}
