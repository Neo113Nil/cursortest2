package ru.ozon.app.android.pikazon.glide.transformations.factory;

import K00.b;
import T5.f;
import W5.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: classes13.dex */
class BlurTransformation extends BitmapTransformation {
    private final int radius;
    private final int sampling;

    public BlurTransformation() {
        this(25, 1);
    }

    @Override // T5.f
    public boolean equals(Object obj) {
        if (!(obj instanceof BlurTransformation)) {
            return false;
        }
        BlurTransformation blurTransformation = (BlurTransformation) obj;
        return blurTransformation.radius == this.radius && blurTransformation.sampling == this.sampling;
    }

    @Override // T5.f
    public int hashCode() {
        return (this.sampling * 10) + (this.radius * 1000) + 589067571;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BlurTransformation(radius=");
        sb2.append(this.radius);
        sb2.append(", sampling=");
        return b.e(this.sampling, ")", sb2);
    }

    @Override // ru.ozon.app.android.pikazon.glide.transformations.factory.BitmapTransformation
    protected Bitmap transform(@NonNull Context context, @NonNull d dVar, @NonNull Bitmap bitmap, int i11, int i12) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i13 = this.sampling;
        Bitmap f7 = dVar.f(width / i13, height / i13, Bitmap.Config.ARGB_8888);
        setCanvasBitmapDensity(bitmap, f7);
        Canvas canvas = new Canvas(f7);
        int i14 = this.sampling;
        canvas.scale(1.0f / i14, 1.0f / i14);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return FastBlur.blur(f7, this.radius, true);
    }

    @Override // T5.f
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(("BlurTransformation.1" + this.radius + this.sampling).getBytes(f.f26662a));
    }

    public BlurTransformation(int i11, int i12) {
        this.radius = i11;
        this.sampling = i12;
    }
}
