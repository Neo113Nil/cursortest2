package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public class n extends AbstractC3004h {
    private static final byte[] ID_BYTES = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(com.bumptech.glide.load.g.f29962a);

    @Override // com.bumptech.glide.load.g
    public void b(MessageDigest messageDigest) {
        messageDigest.update(ID_BYTES);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3004h
    public Bitmap c(com.bumptech.glide.load.engine.bitmap_recycle.d dVar, Bitmap bitmap, int i10, int i11) {
        return J.d(dVar, bitmap, i10, i11);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        return obj instanceof n;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return 1101716364;
    }
}
