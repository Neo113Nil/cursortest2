package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ra5 implements nr9 {
    public final Drawable a;

    public ra5(Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.nr9
    public final long a() {
        Drawable drawable = this.a;
        long b = gjk.b(drawable) * 4 * gjk.a(drawable);
        if (b < 0) {
            return 0L;
        }
        return b;
    }

    @Override // defpackage.nr9
    public final boolean b() {
        return false;
    }

    @Override // defpackage.nr9
    public final void c(Canvas canvas) {
        this.a.draw(canvas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ra5) && Intrinsics.c(this.a, ((ra5) obj).a);
    }

    @Override // defpackage.nr9
    public final int getHeight() {
        return gjk.a(this.a);
    }

    @Override // defpackage.nr9
    public final int getWidth() {
        return gjk.b(this.a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.a + ", shareable=false)";
    }
}
