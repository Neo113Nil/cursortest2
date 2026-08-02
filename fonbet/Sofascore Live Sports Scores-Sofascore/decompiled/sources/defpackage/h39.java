package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class h39 extends awj {
    public static final ColorMatrixColorFilter a;

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        a = new ColorMatrixColorFilter(colorMatrix);
    }

    @Override // defpackage.awj
    public final String a() {
        return h39.class.getName();
    }

    @Override // defpackage.awj
    public final Bitmap b(Bitmap bitmap, kjh kjhVar) {
        Paint paint = new Paint(3);
        paint.setColorFilter(a);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
        createBitmap.getClass();
        new Canvas(createBitmap).drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
        return createBitmap;
    }

    @Override // defpackage.awj
    public final boolean equals(Object obj) {
        return obj instanceof h39;
    }

    @Override // defpackage.awj
    public final int hashCode() {
        return h39.class.hashCode();
    }

    @Override // defpackage.awj
    public final String toString() {
        return "GrayscaleTransformation()";
    }
}
