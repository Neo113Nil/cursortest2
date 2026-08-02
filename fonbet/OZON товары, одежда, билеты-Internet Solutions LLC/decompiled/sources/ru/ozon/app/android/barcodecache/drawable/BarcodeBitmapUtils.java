package ru.ozon.app.android.barcodecache.drawable;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u0014\u0010\u0007\u001a\u00020\b*\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/barcodecache/drawable/BarcodeBitmapUtils;", "", "<init>", "()V", "removeWhiteSpaces", "Landroid/graphics/Bitmap;", "bitmap", "isPixelNotWhite", "", "x", "", "barcodecache_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeBitmapUtils {

    @NotNull
    public static final BarcodeBitmapUtils INSTANCE = new BarcodeBitmapUtils();

    private BarcodeBitmapUtils() {
    }

    private final boolean isPixelNotWhite(Bitmap bitmap, int i11) {
        return bitmap.getPixel(i11, 0) != -1;
    }

    @NotNull
    public final Bitmap removeWhiteSpaces(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int width2 = bitmap.getWidth();
        int i11 = 0;
        while (true) {
            if (i11 >= width2) {
                i11 = 0;
                break;
            }
            if (isPixelNotWhite(bitmap, i11)) {
                break;
            }
            i11++;
        }
        int width3 = bitmap.getWidth() - 1;
        if (i11 <= width3) {
            while (true) {
                if (!isPixelNotWhite(bitmap, width3)) {
                    if (width3 == i11) {
                        break;
                    }
                    width3--;
                } else {
                    width = width3;
                    break;
                }
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, i11, 0, width - i11, height);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        return createBitmap;
    }
}
