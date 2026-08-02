package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class urh extends awj {
    public final int a = Color.parseColor("#1A000000");
    public final int b = Color.parseColor("#80A0A0A0");

    @Override // defpackage.awj
    public final String a() {
        return urh.class.getName();
    }

    @Override // defpackage.awj
    public final Bitmap b(Bitmap bitmap, kjh kjhVar) {
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f = min / 2.0f;
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, min, config);
        createBitmap.getClass();
        Bitmap createBitmap2 = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - min) / 2, bitmap.getHeight() - min, min, min);
        createBitmap2.getClass();
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(createBitmap2, tileMode, tileMode));
        paint.setColorFilter(new PorterDuffColorFilter(this.b, PorterDuff.Mode.DST_OVER));
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(2.0f);
        paint2.setColor(this.a);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawCircle(f, f, f, paint);
        canvas.drawCircle(f, f, f, paint2);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        return createBitmap;
    }
}
