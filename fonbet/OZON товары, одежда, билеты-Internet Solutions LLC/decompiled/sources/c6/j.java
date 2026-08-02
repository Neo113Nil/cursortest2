package c6;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class j extends AbstractC5754f {

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f56553b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(T5.f.f26662a);

    @Override // T5.f
    public final boolean equals(Object obj) {
        return obj instanceof j;
    }

    @Override // T5.f
    public final int hashCode() {
        return -599754482;
    }

    @Override // c6.AbstractC5754f
    protected final Bitmap transform(@NonNull W5.d dVar, @NonNull Bitmap bitmap, int i11, int i12) {
        return C.b(dVar, bitmap, i11, i12);
    }

    @Override // T5.f
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f56553b);
    }
}
