package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public class w implements com.bumptech.glide.load.n {

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.n f30067b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30068c;

    public w(com.bumptech.glide.load.n nVar, boolean z10) {
        this.f30067b = nVar;
        this.f30068c = z10;
    }

    @Override // com.bumptech.glide.load.n
    public com.bumptech.glide.load.engine.v a(Context context, com.bumptech.glide.load.engine.v vVar, int i10, int i11) {
        com.bumptech.glide.load.engine.bitmap_recycle.d g10 = com.bumptech.glide.c.d(context).g();
        Drawable drawable = (Drawable) vVar.get();
        com.bumptech.glide.load.engine.v a10 = v.a(g10, drawable, i10, i11);
        if (a10 != null) {
            com.bumptech.glide.load.engine.v a11 = this.f30067b.a(context, a10, i10, i11);
            if (!a11.equals(a10)) {
                return d(context, a11);
            }
            a11.recycle();
            return vVar;
        }
        if (!this.f30068c) {
            return vVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // com.bumptech.glide.load.g
    public void b(MessageDigest messageDigest) {
        this.f30067b.b(messageDigest);
    }

    public com.bumptech.glide.load.n c() {
        return this;
    }

    public final com.bumptech.glide.load.engine.v d(Context context, com.bumptech.glide.load.engine.v vVar) {
        return D.c(context.getResources(), vVar);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.f30067b.equals(((w) obj).f30067b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.f30067b.hashCode();
    }
}
