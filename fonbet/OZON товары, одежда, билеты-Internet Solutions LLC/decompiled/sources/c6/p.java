package c6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final W5.d f56584a = new a();

    final class a extends W5.e {
        @Override // W5.e, W5.d
        public final void c(Bitmap bitmap) {
        }
    }

    static C5753e a(W5.d dVar, Drawable drawable, int i11, int i12) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z11 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i11 != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i12 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i11 = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i12 = current.getIntrinsicHeight();
                    }
                    Lock f7 = C.f();
                    f7.lock();
                    Bitmap f11 = dVar.f(i11, i12, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(f11);
                        current.setBounds(0, 0, i11, i12);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        f7.unlock();
                        bitmap = f11;
                        z11 = true;
                    } catch (Throwable th2) {
                        f7.unlock();
                        throw th2;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            bitmap = null;
            z11 = true;
        }
        if (!z11) {
            dVar = f56584a;
        }
        return C5753e.c(dVar, bitmap);
    }
}
