package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3009m extends AbstractC3004h {
    private static final byte[] ID_BYTES = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(com.bumptech.glide.load.g.f29962a);

    @Override // com.bumptech.glide.load.g
    public void b(MessageDigest messageDigest) {
        messageDigest.update(ID_BYTES);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3004h
    public Bitmap c(com.bumptech.glide.load.engine.bitmap_recycle.d dVar, Bitmap bitmap, int i10, int i11) {
        return J.c(dVar, bitmap, i10, i11);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        return obj instanceof C3009m;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return -670243078;
    }
}
