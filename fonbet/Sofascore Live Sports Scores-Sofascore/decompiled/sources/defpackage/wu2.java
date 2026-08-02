package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wu2 implements cwj {
    public final String a = wu2.class.getName();

    @Override // defpackage.cwj
    public final Bitmap a(Bitmap bitmap, jjh jjhVar) {
        Paint paint = new Paint(3);
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f = min / 2.0f;
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, min, config);
        createBitmap.getClass();
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawCircle(f, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, f - (bitmap.getWidth() / 2.0f), f - (bitmap.getHeight() / 2.0f), paint);
        return createBitmap;
    }

    @Override // defpackage.cwj
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof wu2;
    }

    public final int hashCode() {
        return wu2.class.hashCode();
    }
}
