package t4;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import d9.e;
import kotlin.jvm.internal.Reflection;
import r4.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final String f23749a = String.valueOf(Reflection.getOrCreateKotlinClass(a.class).getQualifiedName());

    @Override // t4.b
    public final String a() {
        return this.f23749a;
    }

    @Override // t4.b
    public final Bitmap b(Bitmap bitmap) {
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, min, config);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        float k6 = (float) y4.a.k(bitmap.getWidth(), bitmap.getHeight(), min, min, g.f22298a);
        float f6 = min;
        float f10 = 2;
        matrix.setTranslate((f6 - (bitmap.getWidth() * k6)) / f10, e.d(k6, bitmap.getHeight(), f6, f10));
        matrix.preScale(k6, k6);
        Paint paint = new Paint(3);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f11 = f6 / 2.0f;
        canvas.drawCircle(f11, f11, f11, paint);
        return createBitmap;
    }
}
