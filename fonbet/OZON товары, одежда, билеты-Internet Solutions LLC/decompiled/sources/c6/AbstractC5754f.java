package c6;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* renamed from: c6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5754f implements T5.m<Bitmap> {
    @Override // T5.m
    @NonNull
    public final V5.v<Bitmap> transform(@NonNull Context context, @NonNull V5.v<Bitmap> vVar, int i11, int i12) {
        if (!p6.l.i(i11, i12)) {
            throw new IllegalArgumentException(Cm.e.c("Cannot apply transformation on width: ", i11, " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL", i12));
        }
        W5.d c11 = com.bumptech.glide.c.a(context).c();
        Bitmap bitmap = vVar.get();
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getWidth();
        }
        if (i12 == Integer.MIN_VALUE) {
            i12 = bitmap.getHeight();
        }
        Bitmap transform = transform(c11, bitmap, i11, i12);
        return bitmap.equals(transform) ? vVar : C5753e.c(c11, transform);
    }

    protected abstract Bitmap transform(@NonNull W5.d dVar, @NonNull Bitmap bitmap, int i11, int i12);
}
