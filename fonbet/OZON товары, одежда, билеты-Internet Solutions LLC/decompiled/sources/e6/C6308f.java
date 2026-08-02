package e6;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* renamed from: e6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6308f extends AbstractC6306d<Drawable> {
    @Override // V5.v
    public final void a() {
    }

    @Override // V5.v
    @NonNull
    public final Class<Drawable> b() {
        return this.f62023a.getClass();
    }

    @Override // V5.v
    public final int getSize() {
        T t2 = this.f62023a;
        return Math.max(1, t2.getIntrinsicHeight() * t2.getIntrinsicWidth() * 4);
    }
}
