package e6;

import V5.r;
import V5.v;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import p6.k;

/* renamed from: e6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6306d<T extends Drawable> implements v<T>, r {

    /* renamed from: a, reason: collision with root package name */
    protected final T f62023a;

    public AbstractC6306d(T t2) {
        k.c(t2, "Argument must not be null");
        this.f62023a = t2;
    }

    @Override // V5.v
    @NonNull
    public final Object get() {
        T t2 = this.f62023a;
        Drawable.ConstantState constantState = t2.getConstantState();
        return constantState == null ? t2 : constantState.newDrawable();
    }

    public void initialize() {
        T t2 = this.f62023a;
        if (t2 instanceof BitmapDrawable) {
            ((BitmapDrawable) t2).getBitmap().prepareToDraw();
        } else if (t2 instanceof g6.c) {
            ((g6.c) t2).c().prepareToDraw();
        }
    }
}
