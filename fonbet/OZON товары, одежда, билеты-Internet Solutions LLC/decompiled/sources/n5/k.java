package n5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Paint f76526a = new Paint(3);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f76527b = 0;

    @NotNull
    public static Bitmap a(@NotNull Bitmap bitmap, @NotNull h hVar) {
        Bitmap createBitmap;
        if (!hVar.b()) {
            int i11 = l.f76529b;
            if (hVar.a() <= 0) {
                return bitmap;
            }
        }
        Matrix matrix = new Matrix();
        float width = bitmap.getWidth() / 2.0f;
        float height = bitmap.getHeight() / 2.0f;
        if (hVar.b()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        int i12 = l.f76529b;
        if (hVar.a() > 0) {
            matrix.postRotate(hVar.a(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        float f7 = rectF.left;
        if (f7 != 0.0f || rectF.top != 0.0f) {
            matrix.postTranslate(-f7, -rectF.top);
        }
        if (l.a(hVar)) {
            int height2 = bitmap.getHeight();
            int width2 = bitmap.getWidth();
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            createBitmap = Bitmap.createBitmap(height2, width2, config);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(width, height, config)");
        } else {
            int width3 = bitmap.getWidth();
            int height3 = bitmap.getHeight();
            Bitmap.Config config2 = bitmap.getConfig();
            if (config2 == null) {
                config2 = Bitmap.Config.ARGB_8888;
            }
            createBitmap = Bitmap.createBitmap(width3, height3, config2);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(width, height, config)");
        }
        new Canvas(createBitmap).drawBitmap(bitmap, matrix, f76526a);
        bitmap.recycle();
        return createBitmap;
    }
}
