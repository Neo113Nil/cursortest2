package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class H extends AbstractC3004h {
    private static final byte[] ID_BYTES = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(com.bumptech.glide.load.g.f29962a);

    /* renamed from: b, reason: collision with root package name */
    public final int f29999b;

    public H(int i10) {
        com.bumptech.glide.util.k.a(i10 > 0, "roundingRadius must be greater than 0.");
        this.f29999b = i10;
    }

    @Override // com.bumptech.glide.load.g
    public void b(MessageDigest messageDigest) {
        messageDigest.update(ID_BYTES);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f29999b).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3004h
    public Bitmap c(com.bumptech.glide.load.engine.bitmap_recycle.d dVar, Bitmap bitmap, int i10, int i11) {
        return J.p(dVar, bitmap, this.f29999b);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        return (obj instanceof H) && this.f29999b == ((H) obj).f29999b;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return com.bumptech.glide.util.l.p(-569625254, com.bumptech.glide.util.l.o(this.f29999b));
    }
}
