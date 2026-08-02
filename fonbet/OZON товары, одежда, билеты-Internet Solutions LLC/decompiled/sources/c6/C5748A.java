package c6;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: c6.A, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5748A extends AbstractC5754f {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f56518c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(T5.f.f26662a);

    /* renamed from: b, reason: collision with root package name */
    private final int f56519b;

    public C5748A(int i11) {
        p6.k.a("roundingRadius must be greater than 0.", i11 > 0);
        this.f56519b = i11;
    }

    @Override // T5.f
    public final boolean equals(Object obj) {
        return (obj instanceof C5748A) && this.f56519b == ((C5748A) obj).f56519b;
    }

    @Override // T5.f
    public final int hashCode() {
        return p6.l.g(-569625254, p6.l.g(this.f56519b, 17));
    }

    @Override // c6.AbstractC5754f
    protected final Bitmap transform(@NonNull W5.d dVar, @NonNull Bitmap bitmap, int i11, int i12) {
        return C.h(dVar, bitmap, this.f56519b);
    }

    @Override // T5.f
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f56518c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f56519b).array());
    }
}
