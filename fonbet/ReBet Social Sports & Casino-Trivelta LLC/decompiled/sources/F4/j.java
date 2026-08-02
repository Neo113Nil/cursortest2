package F4;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.r;
import com.bumptech.glide.load.engine.v;

/* loaded from: classes2.dex */
public abstract class j implements v, r {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f3562a;

    public j(Drawable drawable) {
        this.f3562a = (Drawable) com.bumptech.glide.util.k.d(drawable);
    }

    @Override // com.bumptech.glide.load.engine.v
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f3562a.getConstantState();
        return constantState == null ? this.f3562a : constantState.newDrawable();
    }

    @Override // com.bumptech.glide.load.engine.r
    public void initialize() {
        Drawable drawable = this.f3562a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof H4.c) {
            ((H4.c) drawable).e().prepareToDraw();
        }
    }
}
