package y5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w5.C10435g;

/* renamed from: y5.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10838a implements b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f106012a = C10838a.class.getName();

    public final boolean equals(Object obj) {
        return obj instanceof C10838a;
    }

    @Override // y5.b
    @NotNull
    public final String getCacheKey() {
        return this.f106012a;
    }

    public final int hashCode() {
        return C10838a.class.hashCode();
    }

    @Override // y5.b
    public final Object transform(@NotNull Bitmap bitmap, @NotNull C10435g c10435g, @NotNull d<? super Bitmap> dVar) {
        Paint paint = new Paint(3);
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f7 = min / 2.0f;
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, min, config);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(width, height, config)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawCircle(f7, f7, f7, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, f7 - (bitmap.getWidth() / 2.0f), f7 - (bitmap.getHeight() / 2.0f), paint);
        return createBitmap;
    }
}
