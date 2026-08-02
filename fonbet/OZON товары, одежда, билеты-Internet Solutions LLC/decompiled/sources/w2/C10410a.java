package w2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10410a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Drawable f103353a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Path f103354b;

    public C10410a(@NotNull Drawable drawable, float f7) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f103353a = drawable;
        Path path = new Path();
        path.addCircle(0.0f, 0.0f, f7 / 2.0f, Path.Direction.CW);
        this.f103354b = path;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.clipPath(this.f103354b);
        this.f103353a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f103353a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f103353a.setBounds(bounds);
        this.f103354b.offset(bounds.exactCenterX(), bounds.exactCenterY());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        this.f103353a.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f103353a.setColorFilter(colorFilter);
    }
}
