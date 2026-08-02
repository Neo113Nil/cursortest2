package eightbitlab.com.blurview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import com.eightbitlab.blurview.R;

/* loaded from: classes8.dex */
class Noise {
    private static Paint noisePaint;

    Noise() {
    }

    static void apply(Canvas canvas, Context context, int i, int i2) {
        initPaint(context);
        canvas.drawRect(0.0f, 0.0f, i, i2, noisePaint);
    }

    private static void initPaint(Context context) {
        if (noisePaint == null) {
            Bitmap noiseBitmap = getNoiseBitmap(context);
            Paint paint = new Paint();
            noisePaint = paint;
            paint.setAntiAlias(true);
            noisePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
            noisePaint.setShader(new BitmapShader(noiseBitmap, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT));
        }
    }

    private static Bitmap getNoiseBitmap(Context context) {
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.blue_noise);
        Bitmap createBitmap = Bitmap.createBitmap(decodeResource.getWidth(), decodeResource.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAlpha(38);
        canvas.drawBitmap(decodeResource, 0.0f, 0.0f, paint);
        return createBitmap;
    }
}
