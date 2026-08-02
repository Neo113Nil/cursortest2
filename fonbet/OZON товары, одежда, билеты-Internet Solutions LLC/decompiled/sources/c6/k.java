package c6;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: classes8.dex */
public final class k extends AbstractC5754f {

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f56554b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(T5.f.f26662a);

    @Override // T5.f
    public final boolean equals(Object obj) {
        return obj instanceof k;
    }

    @Override // T5.f
    public final int hashCode() {
        return -670243078;
    }

    @Override // c6.AbstractC5754f
    protected final Bitmap transform(@NonNull W5.d dVar, @NonNull Bitmap bitmap, int i11, int i12) {
        int i13 = C.f56528e;
        if (bitmap.getWidth() > i11 || bitmap.getHeight() > i12) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return C.d(dVar, bitmap, i11, i12);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // T5.f
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f56554b);
    }
}
