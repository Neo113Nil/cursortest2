package ru.ozon.app.android.courieronmap.presentation.provider;

import Ij.C3261b;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"addShadow", "Landroid/graphics/Bitmap;", "radius", "", "shadowColor", "", "courieronmap_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ShadowUtilsKt {
    @NotNull
    public static final Bitmap addShadow(@NotNull Bitmap bitmap, float f7, int i11) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i12 = (int) f7;
        int i13 = i12 * 2;
        Bitmap createBitmap = Bitmap.createBitmap(width + i13, i13 + height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0);
        Bitmap createBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ALPHA_8);
        Canvas canvas2 = new Canvas(createBitmap2);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas2.drawColor(-1);
        canvas2.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        Paint b11 = C3261b.b(1, i11);
        b11.setMaskFilter(new BlurMaskFilter(f7, BlurMaskFilter.Blur.NORMAL));
        float f11 = i12;
        canvas.drawBitmap(createBitmap2, f11, f11, b11);
        canvas.drawBitmap(bitmap, f11, f11, new Paint(2));
        createBitmap2.recycle();
        bitmap.recycle();
        return createBitmap;
    }
}
