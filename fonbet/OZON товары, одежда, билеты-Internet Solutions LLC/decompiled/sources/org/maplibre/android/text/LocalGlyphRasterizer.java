package org.maplibre.android.text;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes10.dex */
public class LocalGlyphRasterizer {
    private final Bitmap bitmap;

    @NonNull
    private final Canvas canvas;

    @NonNull
    private final Paint paint;

    LocalGlyphRasterizer() {
        Bitmap createBitmap = Bitmap.createBitmap(35, 35, Bitmap.Config.ARGB_8888);
        this.bitmap = createBitmap;
        Paint paint = new Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        paint.setTextSize(24.0f);
        Canvas canvas = new Canvas();
        this.canvas = canvas;
        canvas.setBitmap(createBitmap);
    }

    protected Bitmap drawGlyphBitmap(String str, boolean z11, char c11) {
        this.paint.setTypeface(Typeface.create(str, z11 ? 1 : 0));
        this.canvas.drawColor(-1);
        this.canvas.drawText(String.valueOf(c11), 5.0f, 25.0f, this.paint);
        return this.bitmap;
    }
}
