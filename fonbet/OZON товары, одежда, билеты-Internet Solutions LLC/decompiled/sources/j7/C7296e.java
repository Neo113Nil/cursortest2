package j7;

import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import java.util.WeakHashMap;

/* renamed from: j7.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7296e extends Property<Drawable, Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final C7296e f69470a;

    static {
        C7296e c7296e = new C7296e(Integer.class, "drawableAlphaCompat");
        new WeakHashMap();
        f69470a = c7296e;
    }

    @Override // android.util.Property
    public final Integer get(@NonNull Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    public final void set(@NonNull Drawable drawable, @NonNull Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
