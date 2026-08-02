package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: com.bumptech.glide.load.resource.bitmap.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3004h implements com.bumptech.glide.load.n {
    @Override // com.bumptech.glide.load.n
    public final com.bumptech.glide.load.engine.v a(Context context, com.bumptech.glide.load.engine.v vVar, int i10, int i11) {
        if (!com.bumptech.glide.util.l.v(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        com.bumptech.glide.load.engine.bitmap_recycle.d g10 = com.bumptech.glide.c.d(context).g();
        Bitmap bitmap = (Bitmap) vVar.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap c10 = c(g10, bitmap, i10, i11);
        return bitmap.equals(c10) ? vVar : C3003g.c(c10, g10);
    }

    public abstract Bitmap c(com.bumptech.glide.load.engine.bitmap_recycle.d dVar, Bitmap bitmap, int i10, int i11);
}
