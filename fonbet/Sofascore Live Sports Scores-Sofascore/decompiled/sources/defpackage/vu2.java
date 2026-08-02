package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vu2 extends awj {
    public final String a = String.valueOf(duf.a.getOrCreateKotlinClass(vu2.class).getQualifiedName());

    @Override // defpackage.awj
    public final String a() {
        return this.a;
    }

    @Override // defpackage.awj
    public final Bitmap b(Bitmap bitmap, kjh kjhVar) {
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, min, config);
        Canvas canvas = new Canvas(createBitmap);
        Paint I = yaa.I(bitmap, min, min);
        float f = min / 2.0f;
        canvas.drawCircle(f, f, f, I);
        return createBitmap;
    }
}
