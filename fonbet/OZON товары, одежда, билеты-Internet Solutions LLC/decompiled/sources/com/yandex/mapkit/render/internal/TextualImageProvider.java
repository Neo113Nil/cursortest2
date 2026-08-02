package com.yandex.mapkit.render.internal;

import N3.C3660k;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.SparseArray;
import com.yandex.runtime.device.internal.DeviceInfo;
import com.yandex.runtime.image.ImageProvider;

/* loaded from: classes9.dex */
public class TextualImageProvider extends ImageProvider {
    private static final float DELTA = 1.5f;
    private static final float FONT_SCALE = 1.0f;
    private static final SparseArray<Paint> map = new SparseArray<>();
    private final Bitmap bitmap;

    /* renamed from: id, reason: collision with root package name */
    private final String f60735id;

    public TextualImageProvider(String str, int i11, boolean z11, int i12, int i13) {
        StringBuilder c11 = C3660k.c(i11, "text:", str, " fontSize:", " isOutlined:");
        c11.append(z11);
        this.f60735id = c11.toString();
        Paint paint = getPaint(i11);
        float measureText = paint.measureText(str);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        Bitmap createBitmap = Bitmap.createBitmap((int) (measureText + 0.5f), (int) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom) + 0.5f), Bitmap.Config.ARGB_8888);
        this.bitmap = createBitmap;
        Canvas canvas = new Canvas(createBitmap);
        float abs = Math.abs(fontMetrics.ascent);
        synchronized (map) {
            if (z11) {
                try {
                    paint.setColor(i13);
                    float f7 = abs - DELTA;
                    canvas.drawText(str, -1.5f, f7, paint);
                    canvas.drawText(str, DELTA, f7, paint);
                    float f11 = abs + DELTA;
                    canvas.drawText(str, DELTA, f11, paint);
                    canvas.drawText(str, -1.5f, f11, paint);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            paint.setColor(i12);
            canvas.drawText(str, 0.0f, abs, paint);
        }
    }

    public static int baseline(int i11) {
        return Math.round(Math.abs(getPaint(i11).getFontMetrics().ascent));
    }

    private static Paint getPaint(int i11) {
        Paint paint;
        SparseArray<Paint> sparseArray = map;
        synchronized (sparseArray) {
            try {
                paint = sparseArray.get(i11);
                if (paint == null) {
                    paint = new Paint();
                    paint.setTextSize(i11 * 1.0f * DeviceInfo.pixelsPerPoint());
                    paint.setTextAlign(Paint.Align.LEFT);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setAntiAlias(true);
                    sparseArray.put(i11, paint);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return paint;
    }

    public static Size measureText(String str, int i11) {
        Paint paint = getPaint(i11);
        float measureText = paint.measureText(str);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return new Size((int) (measureText + 0.5f), (int) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom) + 0.5f));
    }

    @Override // com.yandex.runtime.image.ImageProvider
    public String getId() {
        return this.f60735id;
    }

    @Override // com.yandex.runtime.image.ImageProvider
    public Bitmap getImage() {
        return this.bitmap;
    }
}
