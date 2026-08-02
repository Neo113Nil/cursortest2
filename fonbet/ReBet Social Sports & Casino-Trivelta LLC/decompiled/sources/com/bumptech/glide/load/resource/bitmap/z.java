package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class z extends AbstractC3004h {
    private static final byte[] ID_BYTES = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners".getBytes(com.bumptech.glide.load.g.f29962a);

    /* renamed from: b, reason: collision with root package name */
    public final float f30069b;

    /* renamed from: c, reason: collision with root package name */
    public final float f30070c;

    /* renamed from: d, reason: collision with root package name */
    public final float f30071d;

    /* renamed from: e, reason: collision with root package name */
    public final float f30072e;

    public z(float f10, float f11, float f12, float f13) {
        this.f30069b = f10;
        this.f30070c = f11;
        this.f30071d = f12;
        this.f30072e = f13;
    }

    @Override // com.bumptech.glide.load.g
    public void b(MessageDigest messageDigest) {
        messageDigest.update(ID_BYTES);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.f30069b).putFloat(this.f30070c).putFloat(this.f30071d).putFloat(this.f30072e).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3004h
    public Bitmap c(com.bumptech.glide.load.engine.bitmap_recycle.d dVar, Bitmap bitmap, int i10, int i11) {
        return J.o(dVar, bitmap, this.f30069b, this.f30070c, this.f30071d, this.f30072e);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f30069b == zVar.f30069b && this.f30070c == zVar.f30070c && this.f30071d == zVar.f30071d && this.f30072e == zVar.f30072e) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return com.bumptech.glide.util.l.n(this.f30072e, com.bumptech.glide.util.l.n(this.f30071d, com.bumptech.glide.util.l.n(this.f30070c, com.bumptech.glide.util.l.p(-2013597734, com.bumptech.glide.util.l.m(this.f30069b)))));
    }
}
