package c4;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements m {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f3589a;

    public f(Drawable drawable) {
        this.f3589a = drawable;
    }

    @Override // c4.m
    public final boolean a() {
        return false;
    }

    @Override // c4.m
    public final long b() {
        Drawable drawable = this.f3589a;
        long b10 = v4.r.b(drawable) * 4 * v4.r.a(drawable);
        if (b10 < 0) {
            return 0L;
        }
        return b10;
    }

    @Override // c4.m
    public final void draw(Canvas canvas) {
        this.f3589a.draw(canvas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.areEqual(this.f3589a, ((f) obj).f3589a);
    }

    @Override // c4.m
    public final int getHeight() {
        return v4.r.a(this.f3589a);
    }

    @Override // c4.m
    public final int getWidth() {
        return v4.r.b(this.f3589a);
    }

    public final int hashCode() {
        return (this.f3589a.hashCode() * 31) + 1237;
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.f3589a + ", shareable=false)";
    }
}
