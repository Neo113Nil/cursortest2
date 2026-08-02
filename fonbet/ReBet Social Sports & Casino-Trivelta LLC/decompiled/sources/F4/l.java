package F4;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.v;

/* loaded from: classes2.dex */
public final class l extends j {
    public l(Drawable drawable) {
        super(drawable);
    }

    public static v c(Drawable drawable) {
        if (drawable != null) {
            return new l(drawable);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.engine.v
    public Class a() {
        return this.f3562a.getClass();
    }

    @Override // com.bumptech.glide.load.engine.v
    public int getSize() {
        return Math.max(1, this.f3562a.getIntrinsicWidth() * this.f3562a.getIntrinsicHeight() * 4);
    }

    @Override // com.bumptech.glide.load.engine.v
    public void recycle() {
    }
}
