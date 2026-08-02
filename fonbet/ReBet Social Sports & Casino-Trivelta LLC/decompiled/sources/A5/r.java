package A5;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public abstract class r {
    public static final int c(ImageView imageView) {
        Bitmap bitmap;
        Drawable drawable = imageView.getDrawable();
        if ((drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null) {
            return bitmap.getHeight();
        }
        return 0;
    }

    public static final int d(ImageView imageView) {
        Bitmap bitmap;
        Drawable drawable = imageView.getDrawable();
        if ((drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null) {
            return bitmap.getWidth();
        }
        return 0;
    }
}
