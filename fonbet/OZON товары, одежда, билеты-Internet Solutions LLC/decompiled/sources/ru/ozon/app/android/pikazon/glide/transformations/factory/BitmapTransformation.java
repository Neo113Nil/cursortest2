package ru.ozon.app.android.pikazon.glide.transformations.factory;

import Cm.e;
import T5.m;
import V5.v;
import W5.d;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import c6.C5753e;
import com.bumptech.glide.c;
import p6.l;

/* loaded from: classes13.dex */
abstract class BitmapTransformation implements m<Bitmap> {
    BitmapTransformation() {
    }

    void setCanvasBitmapDensity(@NonNull Bitmap bitmap, @NonNull Bitmap bitmap2) {
        bitmap2.setDensity(bitmap.getDensity());
    }

    @Override // T5.m
    @NonNull
    public final v<Bitmap> transform(@NonNull Context context, @NonNull v<Bitmap> vVar, int i11, int i12) {
        if (!l.i(i11, i12)) {
            throw new IllegalArgumentException(e.c("Cannot apply transformation on width: ", i11, " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL", i12));
        }
        d c11 = c.a(context).c();
        Bitmap bitmap = vVar.get();
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getWidth();
        }
        int i13 = i11;
        if (i12 == Integer.MIN_VALUE) {
            i12 = bitmap.getHeight();
        }
        Bitmap transform = transform(context.getApplicationContext(), c11, bitmap, i13, i12);
        return bitmap.equals(transform) ? vVar : C5753e.c(c11, transform);
    }

    protected abstract Bitmap transform(@NonNull Context context, @NonNull d dVar, @NonNull Bitmap bitmap, int i11, int i12);
}
