package c6;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: classes8.dex */
public final class s extends AbstractC5754f {

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f56587b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(T5.f.f26662a);

    @Override // T5.f
    public final boolean equals(Object obj) {
        return obj instanceof s;
    }

    @Override // T5.f
    public final int hashCode() {
        return 1572326941;
    }

    @Override // c6.AbstractC5754f
    protected final Bitmap transform(@NonNull W5.d dVar, @NonNull Bitmap bitmap, int i11, int i12) {
        return C.d(dVar, bitmap, i11, i12);
    }

    @Override // T5.f
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f56587b);
    }
}
