package gc;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import bc.AbstractC5640p;
import java.io.InputStream;
import r6.C9181g;
import r6.C9208i;

/* renamed from: gc.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6707a extends AbstractC5640p {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f64221a;

    C6707a(Resources resources) {
        this.f64221a = resources;
    }

    @NonNull
    public static C6707a b() {
        return new C6707a(Resources.getSystem());
    }

    @Override // bc.AbstractC5640p
    @NonNull
    public final Drawable a(@NonNull InputStream inputStream) {
        try {
            C9181g i11 = C9181g.i(inputStream);
            float g10 = i11.g();
            float e11 = i11.e();
            Resources resources = this.f64221a;
            float f7 = resources.getDisplayMetrics().density;
            Bitmap createBitmap = Bitmap.createBitmap((int) ((g10 * f7) + 0.5f), (int) ((e11 * f7) + 0.5f), Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(f7, f7);
            i11.l(canvas);
            return new BitmapDrawable(resources, createBitmap);
        } catch (C9208i e12) {
            throw new IllegalStateException("Exception decoding SVG", e12);
        }
    }
}
